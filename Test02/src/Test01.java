import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setName("Java");
		employee.setSalary(1000);
		employee.setBirthday(new Date());
		Manager manager = new Manager();
		manager.setName("明日科技");
		manager.setSalary(3000);
		manager.setBirthday(new Date());
		manager.setBonus(2000);
		
		System.out.println("员工的姓名"+employee.getName());
		System.out.println("员工的工资"+employee.getSalary());
		System.out.println("员工的生日"+employee.getBirthday());
		System.out.println("经理的姓名"+employee.getName());
		System.out.println("经理的工资"+employee.getSalary());
		System.out.println("经理的生日"+employee.getBirthday());
		System.out.println("经理的奖金"+manager.getBonus());
	}

}
