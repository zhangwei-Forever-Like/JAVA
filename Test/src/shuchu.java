
public class shuchu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zhangchuan z = new zhangchuan();
		z.wife = new Wife();
		z.classmate = new Zhangwei();
		Zhangwei u = new Zhangwei();
		u.classmate  = new zhangchuan();
		System.out.println(z.wife.name);
		System.out.println(z.wife.number);
		System.out.println(z.classmate.name);
		System.out.println(u.classmate.name);
	}

}
