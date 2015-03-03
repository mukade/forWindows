package chapter_5_8;
class Animal{
	private void beat(){
		System.out.println("��������...");
	}
	public void breath(){
		beat();
		System.out.println("����������...");
	}
}
class Bird{
	private Animal a;
	public Bird(Animal a){
		this.a=a;
	}
	public void breath(){
		a.breath();
	}
	public void fly(){
		System.out.println("�ҷ�~");
	}
}
class Wolf{
	private Animal a;
	public Wolf(Animal a){
		this.a=a;
	}
	public void breath(){
		a.breath();
	}
	public void run(){
		System.out.println("����~");
	}
}
public class CompositeTest {
	public static void main(String args[]){
		Animal a1=new Animal();
		Bird b=new Bird(a1);
		b.breath();
		b.fly();
		Animal a2=new Animal();
		Wolf w=new Wolf(a2);
		w.breath();
		w.run();
	}
}
