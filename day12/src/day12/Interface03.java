package day12;

public class Interface03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Cat2 c = new Cat2();
 c.fly();
	}

}
class Animal2{
	
}
interface Flyable{
	void fly();
}
class Cat2 extends Animal2 implements Flyable{
	public void fly() {
		System.out.println("我想要飞得更高，飞得更高，他怕狂风舞蹈，挣脱怀抱");
	}
}