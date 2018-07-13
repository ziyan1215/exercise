package ly;

public class Person {
	private String name;
	private String sex;
	private int age;
	
	public void sayHi(){
		System.out.println("hello, my name is :"+name+" and i am "+age+" years old !");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Number getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
