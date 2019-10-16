package test_equals;

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
	public boolean equals(Object e) {
		// PK id
		System.out.println("in emp equals");
		if (e instanceof Emp)
			return this.id == ((Emp) e).id;
		return false;

	}

}
