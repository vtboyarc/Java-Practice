class Dog {
	String type;
	String furColor;
	int age;

	void bark() {
		System.out.println("woof!");
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	String getType() {
		return type;
	}

	String getFurColor() {
		return furColor;
	}

	int getAge() {
		return age;
	}
	public static int total;
	public int dogCount;
	public Dog() {
		dogCount = total;
		total++;
		System.out.println(dogCount);
		
	}
}

public class App {
	public static void main(String[] args) {

		Dog bonnie = new Dog();
		//bonnie.age = 8;
		bonnie.setAge(8);
		//bonnie.furColor = "brown and white";
		bonnie.setFurColor("brown and white");
		bonnie.type = "collie";
		//int age = bonnie.getAge();
		System.out.println(bonnie.age);
		System.out.println(bonnie.getFurColor());
		Dog laddie = new Dog();
		laddie.setType("Another collie!");
		System.out.println(laddie.getType());

	}
}
