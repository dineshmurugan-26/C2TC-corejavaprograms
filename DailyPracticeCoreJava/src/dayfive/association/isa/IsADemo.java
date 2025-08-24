package dayfive.association.isa;

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Edwin", 101, "IT");
		Manager manager = new Manager("Vijay", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}