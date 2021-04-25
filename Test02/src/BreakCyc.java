
public class BreakCyc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------中断单层循环的例子-------------");
		System.out.println("在你发现第一支老鹰之前，告诉我都有什么鸟");
		String[] s =  {"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","喜鹊","老鹰","布谷鸟"};
		for (int i = 0; i < s.length; i++) {
			if (s[i] == "老鹰") {
				break;
			}
			System.out.println("有：" + s[i]);
		}
	}

}
