import java.io.*;
import java.net.*;
import java.util.*;

public class exp_4_3 {
	public static void main(String[] args) {
		String host = "localhost";
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("输入网络地址：");
			host = br.readLine();
		}catch(Exception e){
			System.err.println("输入信息失败"+e.toString());
		}
		try{
			InetAddress inet = InetAddress.getByName(host);
			System.out.println("主机地址 = "+inet.getHostAddress());
			System.out.println("主机名称= "+inet.getHostName());
			System.out.println("是否为环回地址？"+inet.isLoopbackAddress());
		}catch(Exception e){
			System.err.println("获得本地信息失败"+e.toString());
		}
	}

}
