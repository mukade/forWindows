package chapter_5_6;

class Creature{
	public Creature(){
		System.out.println("Creature �޲���");
	}
}

class Animal extends Creature{
	public Animal(String name){
		System.out.println("Animail ������"+" |nameΪ"+name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal ˫����"+"|ageΪ"+age);
	}
}
public class Wolf extends Animal{
	public Wolf(){
		super("��̫��",3);
		System.out.println("Wolf �޲���");
	}
	public static void main(String args[]){
		new Wolf();
	}
}
