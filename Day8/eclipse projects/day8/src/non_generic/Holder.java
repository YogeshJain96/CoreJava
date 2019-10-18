package non_generic;
/*
 * Create a holder class that can hold ANY type of data
 * (primitive or ref type)
 */
public class Holder {
	//state --data member
	private Object ref;

	public Holder(Object ref) {
		super();
		this.ref = ref;
	}

	public Object getRef() {
		return ref;
	}
	
}
