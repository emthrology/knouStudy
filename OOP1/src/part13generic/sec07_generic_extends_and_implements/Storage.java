package part13generic.sec07_generic_extends_and_implements;

public interface Storage<T> {
	public void add(T item, int index);
	
	public T get(int index);
}
