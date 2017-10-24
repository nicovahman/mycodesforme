package Opgave_20;

public class TestCar {
	public static void main(String[] args) {
		Car car1 = new Car("Citroen", "SV 34234", "Rød");
		Car car2 = new Car("Citroen", "SK 34233", "Blå");
		Car car3 = new Car("Citroen", "LI 23432", "Rød");
		Car car4 = new Car("Citroen", "SV 34234", "Rød");
		System.out.println(car1.toString());
		System.out.println(car1.equals(car4));
		System.out.println(car1.alike(car4));
		System.out.println(car2.toString());
		System.out.println(car2.equals(car3));
		System.out.println(car2.alike(car3));
		System.out.println(car3.toString());
		System.out.println(car3.equals(car4));
		System.out.println(car3.alike(car4));
		System.out.println(car4.toString());
		System.out.println(car4.equals(car1));
		System.out.println(car4.alike(car1));
	}

}
