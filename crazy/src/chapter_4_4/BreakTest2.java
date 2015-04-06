package chapter_4_4;

public class BreakTest2 {
	public static void main(String args[]){
		for(int i=0;i<3;i++){
			outer:
				for(int j=0;j<3;j++){
					for(int k=0;k<4;k++){
						System.out.print(i);
						System.out.print(j);
						System.out.println(k);
						if(k==2){
							break outer;
						}
					}
				}
		}
	}
}
