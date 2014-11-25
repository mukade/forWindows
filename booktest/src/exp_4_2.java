import java.net.*;
import java.util.*;

public class exp_4_2 {
	public static void main(String[] args) {
		Enumeration<NetworkInterface> a =null;
		try{
			a = NetworkInterface.getNetworkInterfaces();
			while(a.hasMoreElements()){
				NetworkInterface ni = a.nextElement();
				System.out.println("������"+ni.getDisplayName());
				System.out.println("���ƣ�"+ni.getName());
				Enumeration<InetAddress> ips = ni.getInetAddresses();
				while(ips.hasMoreElements()){
					System.out.println("IP: "+ips.nextElement().getHostAddress());
				}
				System.out.println();
			}
		}catch(Exception e){
			System.err.println("��ñ�����Ϣʧ��"+e.toString());
		}
	}
}
