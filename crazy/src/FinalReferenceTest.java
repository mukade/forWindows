import java.util.Arrays;



class Person3{
	private int age;
	public Person3(){}
	public Person3(int age){
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class FinalReferenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] iArr = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
//		iArr = null;
		final Person3 p = new Person3(45);
		p.setAge(23);
		System.out.println(p.getAge());
//		p = null;
	}

}
