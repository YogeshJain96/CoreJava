package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Student;

public interface IStuDao {
	// add a method to fetch stu dtls by course name
	List<Student> getStuDetails(String coursename) throws SQLException;

	// insert stu record
	String admitStudent(Student s) throws SQLException;

	// Display Topper as per Course
	String dispTopper(String coursename) throws SQLException;

	// TC Stu
	String stuRemove(int id) throws SQLException;
	
	//Update Marks via stuid
	String updateMarks(int id,int marks) throws SQLException;
}
