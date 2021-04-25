package day14;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal[] animals = { a1, a2 };

		for (int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
	   Cat c=new Cat();
	   Dog d=new Dog();
//	   Animal a01= new Cat();
	   Animal[] an= {c,d};
	   for(int i=0;i<an.length;i++) {
	    
		   an[i].move();
	   }
	}
}

class Animal {
	public void move() {
		System.out.println("Animal move");
	}
}
class Cat extends Animal{
	public void move() {
		System.out.println("猫在走猫步");
	}
}
class Dog extends Animal{
	public void move() {
		System.out.println("狗在吃骨头");
	}
}