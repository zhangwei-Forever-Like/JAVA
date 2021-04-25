package day12;

public class Customer {
	private FoodMenu foodMenu;

	public FoodMenu getFoodMenu() {
		return foodMenu;
	}

	public Customer(FoodMenu foodMenu) {
		super();
		this.foodMenu = foodMenu;
	}

	public void setFoodMenu(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}

	public Customer() {
		super();
	}
	public void order() {
		
		foodMenu.shizhi();
		foodMenu.yuxiang();
	}
}
