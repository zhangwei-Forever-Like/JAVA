
public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product iphone7 = new Product();
		System.out.println("商品的编号: " + iphone7.productNo);
		System.out.println("商品的单价：" + iphone7.price);

		iphone7.productNo = 1111;
		iphone7.price = 6800;
		System.out.println("商品的编号: " + iphone7.productNo);
		System.out.println("商品的单价：" + iphone7.price);
		Human zhangsan = new Human();
		Bieshu fangzhi = new Bieshu();
		zhangsan.name ="张三";
		fangzhi.owner = zhangsan;
		System.out.println(fangzhi.owner.name);
		Human lisi  = new Human();
		lisi.name = "李四";
		fangzhi.owner = lisi;
		System.out.println(fangzhi.owner.name);
	}

}
