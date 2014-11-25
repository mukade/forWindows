import java.io.*;

public class exp_3_6_2{
	public static void main(String[]agrs){
		try{
			OutputStream fos = new FileOutputStream("d:\\outchar.txt",true);
			DataOutputStream dos = new DataOutputStream(fos);
			int i = 1;
			String str = new String();
			str = "¹ú°²Éµ±Æ";
			dos.writeUTF(str);
			dos.flush();
			dos.close();
			fos.close();
		}catch(Exception e){
			System.err.println("1"+e.toString());
		}
	}
}
