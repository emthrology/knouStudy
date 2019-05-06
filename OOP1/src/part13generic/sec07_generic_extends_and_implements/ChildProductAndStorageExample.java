package part13generic.sec07_generic_extends_and_implements;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		//상속하는 클래스는 부모의 파라미터 + 자신이 추가한 파라미터를 적어야함
		ChildProduct<Tv, String, String> cp = new ChildProduct<>();
		cp.setKind(new Tv());
		cp.setModel("smart Tv");
		cp.setCompany("samsung");
		
		//인터페이스를 구현하는 클래스는 인터페이스의 파라미터의 숫자를 맞춰 적어야함?
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
	}

}
