import java.io.*;
import java.net.*;

public class MyServer implements Runnable{
	ServerSocket ss = null;
	MyServer(int port){
		try{
			ss = new ServerSocket(port);
			System.out.println("启动本地"+port+"端口成功");
		}catch(IOException e){
			System.err.println("启动本地"+port+"端口失败");
			System.exit(1);
		}
	}
	public void run(){
		try{
			while(true){
				ClientThread ct = new ClientThread(ss.accept());
				Thread tct = new Thread(ct);
				tct.start();
			}
		}catch(IOException e){
			System.err.println(e.toString());
		}
	}
	class ClientThread implements Runnable{
		Socket cs = null;
		ClientThread(Socket cs){
			this.cs = cs;
		}
		public void run(){
			String inputStr,outputStr;
			try{
				DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
				DataInputStream dis = new DataInputStream(cs.getInputStream());
				dos.writeUTF("Welcome to my chat server!");
				dos.flush();
				DataInputStream StdIn = new DataInputStream(System.in);
				while((inputStr = dis.readUTF()) != null){
					System.out.println("Customer:"+inputStr);
					System.out.print("Server:");
					outputStr = StdIn.readLine();
					dos.writeUTF(outputStr);
					dos.flush();
					if(outputStr.equals("bye"))break;
				}
				dos.close();
				dis.close();
				cs.close();
			}catch(IOException e){
				System.err.println(e.toString());
			}
		}
	}
	public static void main(String []args){
		MyServer ms = new MyServer(8000);
		Thread tms = new Thread(ms);
		tms.start();
	}
}
