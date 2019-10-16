package test_equals2;

public class Emp {
	private int id;
	private String name;
	private double salary;

	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object o) {
		// PK id & name
		System.out.println("in emp equals");
		if (o instanceof Emp) {
			Emp e=(Emp)o;
			return this.id == e.id && name.equals(e.name);
		}
			return false;

	}

}
