package sec10.emtrhology.java.sec10_static_block;

public class TV {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company +  "-" + model;
	}
}
