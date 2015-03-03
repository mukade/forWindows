package chapter_5_6;

class Creature{
	public Creature(){
		System.out.println("Creature 无参数");
	}
}

class Animal extends Creature{
	public Animal(String name){
		System.out.println("Animail 单参数"+" |name为"+name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal 双参数"+"|age为"+age);
	}
}
public class Wolf extends Animal{
	public Wolf(){
		super("灰太狼",3);
		System.out.println("Wolf 无参数");
	}
	public static void main(String args[]){
		new Wolf();
	}
}
