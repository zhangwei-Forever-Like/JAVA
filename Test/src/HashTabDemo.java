
import java.util.Scanner;
public class HashTabDemo {
	public static void main(String[] args) {		
		//创建哈希表
		HashTab hashTab = new HashTab(7);	
		//写一个简单的菜单
		int n;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1:  添加雇员");
			System.out.println("2: 显示雇员");
			System.out.println("3: 查找雇员");
			System.out.println("4: 退出系统");			
			n = scanner.nextInt();
			switch (n) {
			case 1:
				System.out.println("输入id");
				int id = scanner.nextInt();
				System.out.println("输入名字");
				String name = scanner.next();
				System.out.println("输入性别");
				String sex = scanner.next();
				System.out.println("输入电话");
				String phone = scanner.next();
				//创建 雇员
				Emp emp = new Emp(id, name,sex,phone);
				hashTab.add(emp);
				break;
			case 2:
				hashTab.list();
				break;
			case 3:
				System.out.println("请输入要查找的id");
				id = scanner.nextInt();
				hashTab.findEmpById(id);
				break;
			case 4:
				scanner.close();
				System.exit(0);
			default:
				break;
			}
		}	
	}
}
//创建HashTab 管理多条链表
class HashTab {
	private EmpLinkedList[] empLinkedListArray;
	private int size; //表示有多少条链表	
	//构造器
	public HashTab(int size) {
		this.size = size;
		//初始化empLinkedListArray
		empLinkedListArray = new EmpLinkedList[size];
		for(int i = 0; i < size; i++) {
			empLinkedListArray[i] = new EmpLinkedList();
		}
	}
	
	//添加雇员
	public void add(Emp emp) {
		//根据员工的id ,得到该员工应当添加到哪条链表
		int empLinkedListNO = hashFun(emp.id);
		//将emp 添加到对应的链表中
		empLinkedListArray[empLinkedListNO].add(emp);
		
	}
	//遍历所有的链表,遍历hashtab
	public void list() {
		for(int i = 0; i < size; i++) {
			empLinkedListArray[i].list(i);
		}
	}
	
	//根据输入的id,查找雇员
	public void findEmpById(int id) {
		//使用散列函数确定到哪条链表查找
		int empLinkedListNO = hashFun(id);
		Emp emp = empLinkedListArray[empLinkedListNO].findEmpById(id);
		if(emp != null) {//找到
			System.out.printf("在第%d条链表中找到 雇员 id = %d name = %s sex = %s phone = %s", (empLinkedListNO + 1), id,emp.name,emp.sex,emp.phone);
		}else{
			System.out.println("在哈希表中，没有找到该雇员~");
		}
	}
	
	//编写散列函数, 使用一个简单取模法
	public int hashFun(int id) {
		return id % size;
	}
	
	
}

//表示一个雇员
class Emp {
	public int id;
	public String name;
	public String sex;
	public String phone;
	public Emp next; //next 默认为 null
	public Emp(int id, String name,String sex,String phone) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
	}
}

//创建EmpLinkedList ,表示链表
class EmpLinkedList {
	
	//头指针，指向第一个Emp,因此我们这个链表的head 是直接指向第一个Emp
	private Emp head; //默认null	
	
	//添加雇员到链表
	//说明
	//1. 假定，当添加雇员时，id 是自增长，即id的分配总是从小到大
	//   因此我们将该雇员直接加入到本链表的最后即可
	public void add(Emp emp) {
		//如果是添加第一个雇员
		if(head == null) {
			head = emp;
			return;
		}
		//如果不是第一个雇员，则使用一个辅助的指针，帮助定位到最后
		Emp curEmp = head;
		while(true) 
		{
			if(curEmp.next == null) {//说明到链表最后
				break;
			}
			curEmp = curEmp.next; //后移
		}
		//退出时直接将emp 加入链表
		curEmp.next = emp;
	}
	
	//遍历链表的雇员信息
	public void list(int no) {
		if(head == null) { //说明链表为空
			System.out.println("第 "+(no+1)+" 链表为空");
			return;
		}
		System.out.print("第 "+(no+1)+" 链表的信息为");
		Emp curEmp = head; //辅助指针
		while(true) {
			System.out.printf(" => id=%d name=%s sex=%s phone=%s\t", curEmp.id, curEmp.name,curEmp.sex,curEmp.phone);
			if(curEmp.next == null) {//说明curEmp已经是最后结点
				break;
			}
			curEmp = curEmp.next; //后移，遍历
		}
		System.out.println();
	}
	
	//根据id查找雇员
	//如果查找到，就返回Emp, 如果没有找到，就返回null
	public Emp findEmpById(int id) {
		//判断链表是否为空
		if(head == null) {
			System.out.println("链表为空");
			return null;
		}
		//辅助指针
		Emp curEmp = head;
		while(true) {
			if(curEmp.id == id) {//找到
				break;//这时curEmp就指向要查找的雇员
			}
			//退出
			if(curEmp.next == null) {//说明遍历当前链表没有找到该雇员
				curEmp = null;
				break;
			}
			curEmp = curEmp.next;//以后
		}
		
		return curEmp;
	}
	
}

