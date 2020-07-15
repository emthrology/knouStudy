package part13generic.sec02.generic_type;

public class BoxExample {
	
	public static void main(String args[]) {
		/**
		 * Generic programming is a style of computer programming in which algorithms are written in 
		 * terms of types to-be-specified later
		 * that are then instantiated when needed for specific types provided as parameters
		 */
		Box<String> box = new Box<String>();
		box.set("홍길동");
		//box.set(100); // compile error occurred; type mismatch
		String str = box.get();
		
		Box<Integer> box1 = new Box<Integer>();
		box1.set(100);
		//box.set("홍길동"); // compile error occurred; type mismatch
		int num = box1.get();
		
		Box<TestObject> box2 = new Box<TestObject>();
		box2.set(new TestObject());
		TestObject to = box2.get();
	}

}
