package chapter_10_4;

public class ThrowTest {
	public static void main(String args[]){
		try{
			throwChecked(3);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		throwRuntime(3);
	}
	public static void throwChecked(int a)throws Exception{
		if(a>0){
			throw new Exception("1��a��ֵ���ܴ����㣡");
		}
	}
	public static void throwRuntime(int a)
//			throws Exception
	//���벻���б��
	{
		if(a>0){
			throw new RuntimeException("2��a��ֵ���ܴ����㣡");
		}
	}
}
