package part11.sec3.hashcode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			//진짜 비교해보고 싶은건 아래겠지만 우선 들어오는 값이 Key로 만들어진 객체인지부터 확인해야하잖아
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return number;
	}
	
}
