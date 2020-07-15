package part13generic.sec03_multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel(new String("스마트 tv"));
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		
		Product<Car,String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel(new String("하이브리드"));
		
		Car car = product2.getKind();
		String carModel = product2.getModel();

	}

}
