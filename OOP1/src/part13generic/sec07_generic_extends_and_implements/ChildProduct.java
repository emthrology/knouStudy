package part13generic.sec07_generic_extends_and_implements;

public class ChildProduct<K, M, C> extends Product<K, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	
}
