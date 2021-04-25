package day16;

public class GenericTest01<E> {
	public void doSome(E o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTest01<String> gt = new GenericTest01<>();
		gt.doSome("abc");
//		MyIterator<String> gt =new GenericTest01<>();
//		String s1= mi.
	}

}
class MyIterator<T>{
	public T get() {
		return null;
	}
}