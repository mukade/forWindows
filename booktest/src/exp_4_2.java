import java.net.*;
import java.util.*;

public class exp_4_2 {
	public static void main(String[] args) {
		Enumeration<NetworkInterface> a =null;
		try{
			a = NetworkInterface.getNetworkInterfaces();
			while(a.hasMoreElements()){
				NetworkInterface ni = a.nextElement();
				System.out.println("网卡："+ni.getDisplayName());
				System.out.println("名称："+ni.getName());
				Enumeration<InetAddress> ips = ni.getInetAddresses();
				while(ips.hasMoreElements()){
					System.out.println("IP: "+ips.nextElement().getHostAddress());
				}
				System.out.println();
			}
		}catch(Exception e){
			System.err.println("获得本地信息失败"+e.toString());
		}
	}
}
