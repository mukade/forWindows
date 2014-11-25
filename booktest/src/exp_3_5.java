import java.io.*;

public class exp_3_5 {
	public static void main(String[] args) {
		int i;
		int count = 0;
		FileInputStream fin;
		FileOutputStream fout;
		
		try{
			fin = new FileInputStream("d:\\in.txt");
		}catch(FileNotFoundException e){
			System.err.println("δ�ҵ��ļ���"+"in.txt");
			return;
		}
		
		try{
			fout = new FileOutputStream("d:\\out.txt",false);
		}catch(FileNotFoundException e){
			System.err.println("δ�ҵ��ļ���"+"out.txt");
			return;
		}
		
		try{
			while((i = fin.read())!= -1 && count <= 8){
				fout.write(i);count ++;
			}
		}catch(IOException e){
			System.err.println("�ļ�����ʧ��"+e.toString());
		}
		
		try{
			fin.close();
			fout.close();
		}catch(Exception e){
			System.err.println(e.toString());
		}
	}

}
