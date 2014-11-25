import java.io.*;

public class exp_3_6{
	public static void main(String[]agrs){
		try{
			OutputStream fos = new FileOutputStream("d:\\out.txt",true);
			DataOutputStream dos = new DataOutputStream(fos);
			int i = 1;
			String str = new String();
			for(;i<=2;i++){
				str = String.valueOf(i);
				dos.writeBytes(str);
			}
			dos.flush();
			dos.close();
			fos.close();
		}catch(Exception e){
			System.err.println("1"+e.toString());
		}
	}
}
