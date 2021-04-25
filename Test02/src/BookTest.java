import java.util.Random;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] titles = { "《Java 从入门到精通(第2版)》", "《Java 编程字典》", "《视频学 Java》" };
		int index = 0;
		for (int i = 0; i < 5; i++) {
			Book book = new Book(titles[new Random().nextInt(3)]);
			index = book.getnumber();
		}
		System.out.printf("总共销售%d了本图书", index);
	}

}

class Book {
	public static int Counter;

	public Book(String title) {
		System.out.println("售出图书：" + title);
		Counter++;
	}

	public int getnumber() {
		return Counter;

	}
}