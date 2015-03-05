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
			throw new Exception("1：a的值不能大于零！");
		}
	}
	public static void throwRuntime(int a)
//			throws Exception
	//加与不加有别↑
	{
		if(a>0){
			throw new RuntimeException("2：a的值不能大于零！");
		}
	}
}
