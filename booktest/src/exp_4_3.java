import java.io.*;
import java.net.*;
import java.util.*;

public class exp_4_3 {
	public static void main(String[] args) {
		String host = "localhost";
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("���������ַ��");
			host = br.readLine();
		}catch(Exception e){
			System.err.println("������Ϣʧ��"+e.toString());
		}
		try{
			InetAddress inet = InetAddress.getByName(host);
			System.out.println("������ַ = "+inet.getHostAddress());
			System.out.println("��������= "+inet.getHostName());
			System.out.println("�Ƿ�Ϊ���ص�ַ��"+inet.isLoopbackAddress());
		}catch(Exception e){
			System.err.println("��ñ�����Ϣʧ��"+e.toString());
		}
	}

}
