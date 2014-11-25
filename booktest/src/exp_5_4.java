import java.io.*;
import java.net.*;

public class exp_5_4 {
	public static void main(String[] args)throws IOException{
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(8000);
			System.out.println("服务器开始监听8000端口的连接请求");
		}catch(IOException e){
			System.err.println("8000端口不能使用！");
			System.exit(1);
		}
		Socket scs = null;
		try{
			scs = ss.accept();
		}catch(IOException e){
			System.err.println("接受客户端连接失败！");
			System.exit(1);
		}
		DataOutputStream sos = new DataOutputStream(scs.getOutputStream());
		DataInputStream sis = new DataInputStream(scs.getInputStream());
		String inputStr,outputStr;
		sos.writeUTF("Welcome to My Chat Server!");
		sos.flush();
		DataInputStream sKeyboardIn = new DataInputStream(System.in);
		while((inputStr = sis.readUTF())!= null){
			System.out.println("Client:"+inputStr);
			System.out.print("Server:");
			outputStr = sKeyboardIn.readLine();
			sos.writeUTF(outputStr);
			sos.flush();
			if(outputStr.equals("bye"))break;
		}
		sos.close();
		sis.close();
		scs.close();
		ss.close();
	}

}
