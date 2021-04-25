package day05;

public class Student {
	private String name;
	private int age;
	private String address;
	private String ziCode;
	private String mobile;
	public String getPostAddress() {
		return "地址："+address+"邮编："+ziCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZiCode() {
		return ziCode;
	}
	public void setZiCode(String ziCode) {
		this.ziCode = ziCode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
