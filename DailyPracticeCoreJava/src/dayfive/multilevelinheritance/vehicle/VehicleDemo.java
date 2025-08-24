package dayfive.multilevelinheritance.vehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		Chevrolet m=new Chevrolet();
		m.vehicleType();
		m.brand();
		m.speed();
		
		ChevroletCamaroGen5 m1=new ChevroletCamaroGen5();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
		
	}

}