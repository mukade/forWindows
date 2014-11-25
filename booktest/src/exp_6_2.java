import java.io.*;
import java.net.*;

public class exp_6_2 implements Runnable{
	public static void main(String[] args) {
		exp_6_2 dr = new exp_6_2();
		Thread tdr = new Thread(dr);
		tdr.start();
	}
	
	DatagramSocket ds = null;
	DatagramPacket p = null;
	InetAddress address = null;
	int port = 0;
	byte []buffer = new byte [256];
	
	public exp_6_2(){
		try{
			ds = new DatagramSocket(1080);
			System.out.println("本地开启1080端口");
		}catch(IOException e){
			System.err.println(e.toString());
		}
	}
	
	public void run(){
		try{
			p = new DatagramPacket(buffer,buffer.length);
			ds.receive(p);
			System.out.println("接收的数据："+new String(p.getData()));
			Thread.sleep(2000);
			address = p.getAddress();
			port = p.getPort();
			System.out.println("请求段Socket"+address.toString()+"："+port);
			buffer = "从A端返回信息".getBytes();
			p = new DatagramPacket(buffer,buffer.length,address,port);
			ds.send(p);
			ds.close();			
		}catch(Exception e){
			System.err.println("发送出错");
		}
	}
	
}

