package pojos;

import java.sql.Date;

/*courses table -- course_id(int PK auto increment),name(unique),fees(double),strt_date,end_date(date)*/
public class Course {
	private int course_id;
	private String name;
	private double fees;
	private Date strt_date,end_date;
	public Course(int course_id, String name, double fees, Date strt_date, Date end_date) {
		super();
		this.course_id = course_id;
		this.name = name;
		this.fees = fees;
		this.strt_date = strt_date;
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", name=" + name + ", fees=" + fees + ", strt_date=" + strt_date
				+ ", end_date=" + end_date + "]";
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
}
