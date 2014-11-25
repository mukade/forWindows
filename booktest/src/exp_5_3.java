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
			System.err.println("不可识别的主机");
			System.exit(0);
		}catch(IOException e){
			System.err.println("无法连接到服务器的8000端口");
			System.exit(0);
		}
		DataInputStream cKeyboardIn = new DataInputStream(System.in);
		System.out.print("请输入你的用户名：");
		String cname = new String();
		try{
			cname = cKeyboardIn.readLine();
		}catch(IOException e){
			System.err.println("用户名输入有误！");
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
			System.err.println("通信出错！");
		}
		try{
			cos.close();
			cis.close();
			cKeyboardIn.close();
			cs.close();
		}catch(IOException e){
			System.err.println("关闭流时出现错误！");
		}

	}

}
