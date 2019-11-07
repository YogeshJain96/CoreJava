package pojos;
/*
1.1 students table -- id(int PK auto increment),name(varchar),email(varchar) unique,address(varchar),
dob(date),marks(int),course_id(int FK --references courses table)
courses table -- course_id(int PK auto increment),name(unique),fees(double),strt_date,end_date(date)*/
import java.sql.Date;

public class Student {
	//state --properties
	private int id;
	private String name,email,addr;
	private Date dob;
	private int marks,courseid;
	public Student(String name, String email, String addr, Date dob, int marks, int courseid) {
		super();
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.dob = dob;
		this.marks = marks;
		this.courseid = courseid;
	}
	public Student(int id,String name, String email, String addr, Date dob, int marks, int courseid) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.dob = dob;
		this.marks = marks;
		this.courseid = courseid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", addr=" + addr + ", dob=" + dob
				+ ", marks=" + marks + ", courseid=" + courseid + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddr() {
		return addr;
	}
	public Date getDob() {
		return dob;
	}
	public int getMarks() {
		return marks;
	}
	public int getCourseid() {
		return courseid;
	}

	
	

}
