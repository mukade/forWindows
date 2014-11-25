import java.io.*;
import java.net.*;

public class exp_5_3 {
	public static void main(String[] args) {
		Socket cs = null;
		DataOutputStream cos = null;
		DataInputStream cis = null;
		try{
			cs = new Socket("localhost",8000);
			cis = new DataInputStream(cs.getInputStream());
			cos = new DataOutputStream(cs.getOutputStream());
		}catch(UnknownHostException e){
			System.err.println("����ʶ�������");
			System.exit(0);
		}catch(IOException e){
			System.err.println("�޷����ӵ���������8000�˿�");
			System.exit(0);
		}
		DataInputStream cKeyboardIn = new DataInputStream(System.in);
		System.out.print("����������û�����");
		String cname = new String();
		try{
			cname = cKeyboardIn.readLine();
		}catch(IOException e){
			System.err.println("�û�����������");
		}
		String stringFromServer,stringFromClient;
		try{
			while((stringFromServer = cis.readUTF())!=null){
				System.out.println("Server:"+stringFromServer);
				if(stringFromServer.equals("bye"))break;
				System.out.print("Client:");
				stringFromClient = cKeyboardIn.readLine();
				cos.writeUTF(cname+'#'+stringFromClient);
				cos.flush();
			}
		}catch(IOException e){
			System.err.println("ͨ�ų���");
		}
		try{
			cos.close();
			cis.close();
			cKeyboardIn.close();
			cs.close();
		}catch(IOException e){
			System.err.println("�ر���ʱ���ִ���");
		}

	}

}
