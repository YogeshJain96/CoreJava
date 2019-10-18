package generic;
/*
 * Create a holder class that can hold ANY type of data
 * (primitive or ref type)  ---use generic synatx
 */
public class Holder<T> {
	//state --data member
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}
	
}
