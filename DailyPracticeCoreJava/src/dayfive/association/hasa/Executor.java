package dayfive.association.hasa;

public class Executor {
	public static void main(String[] args) {
		Address address = new Address("405 Elwin Enclave, French colony", "White Town", "Puducherry", "605 105");
		Person person = new Person("Edwin", address);
		person.displayInfo();
	}

}