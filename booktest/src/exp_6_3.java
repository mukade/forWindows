import java.io.*;
import java.net.*;

public class exp_6_3 implements Runnable{
	
	DatagramSocket ds = null;
	DatagramPacket p = null;
	InetAddress address = null;
	int port = 0;
	byte []buffer = new byte[256];
	
	public exp_6_3(){
		try{
			ds = new DatagramSocket(1065);
			System.out.println("本地开启UDP 1065端口");
		}catch(IOException e){
			System.err.println(e.toString());
		}
	}
	
	public void run(){
		try{
			address = InetAddress.getByName("localhost");
			port = 10080;
			buffer = "从B端发送单播信息".getBytes();
			p = new DatagramPacket(buffer,buffer.length,address,port);
			ds.send(p);
			Thread.sleep(2000);
			p = new DatagramPacket(buffer,buffer.length);
			ds.receive(p);
			System.out.println("接收的数据："+new String(p.getData()));
			address = p.getAddress();
			port = p.getPort();
			System.out.println("请求段Socket"+address.toString()+"："+port);
			ds.close();
		}catch(Exception e){
			System.err.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		exp_6_3 dr = new exp_6_3();
		Thread tds = new Thread(dr);
		tds.start();
	}
	
}
