package chapter_4_4;

public class ReturnTest {
	public static void main(String args[]){
		for(int i=0;i<3;i++){
			System.out.println("i��ֵ�ǣ�"+i);
			if(i==2){
				return;
			}
			System.out.println("continue");
		}
	}
}
