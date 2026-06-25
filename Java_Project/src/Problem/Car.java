package Problem;

public class Car {
	private String model;
	private String[] features;
	public Car(String model , String...features) {
		this.model = model;
		this.features = features;
		// TODO Auto-generated constructor stub
	}
	public void specs() {
		System.out.println("Feature of "+model);
		for(String f : features)
			System.out.println(f);
	}
	public static void main(String [] args) {
		String model = "BMW A5";
//		String[] Features = {
//			    "Advanced Driver Assistance Systems (ADAS)",
//			    "Multi-point Airbags",
//			    "Anti-lock Braking System (ABS)",
//			    "Touchscreen Infotainment",
//			    "Multi-zone Climate Control",
//			    "Keyless Entry",
//			    "Electric/Hybrid Powertrain",
//			    "All-Wheel Drive (AWD)",
//			    "Regenerative Braking"
//			};
		Car c1 = new Car(model ,"Advanced Driver Assistance Systems (ADAS)",
			    "Multi-point Airbags",
			    "Anti-lock Braking System (ABS)"
			    );
		c1.specs();
	}
}
