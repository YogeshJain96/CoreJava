package dao;

import java.sql.*;
import static utils.DBUtils.*;

import java.util.ArrayList;
import java.util.List;

import pojos.Student;

/*
 * "\n1. Display student details for a specific course name\r"
						+ "\n2. Student admission\r"
						+ "\n3. Display topper details for a specific course\r"
						+ "\n4. Cancel Admission\r"
						+ "\n5. Update marks\r\n"
 * */
public class StuDaoImpl implements IStuDao {
	// d.m
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3, pst4, pst5;

	// constr
	public StuDaoImpl() throws Exception {
		// get cn from DB utils
		cn = fetchConnection();
		// pst1 --select
		pst1 = cn.prepareStatement(
				"select * from students s inner join courses c on c.id=s.course_id where c.course_name like ?");
		pst2 = cn.prepareStatement("insert into students values(default,?,?,?,?,?,?)");
		pst3 = cn.prepareStatement("select * from students s inner join courses c on c.id=s.course_id where c.course_name like ? and s.marks=(select max(marks) from students s inner join courses c on c.id=s.course_id where c.course_name like ?);");
		pst4 = cn.prepareStatement("delete from students where id=?");
		pst5 = cn.prepareStatement("update students set marks=? where id=?");
		System.out.println("emp dao created");
	}

	// clean up
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();

		if (cn != null)
			cn.close();
		System.out.println("emp dao cleaned up...");

	}

	@Override
	public List<Student> getStuDetails(String coursename) throws SQLException {
		pst1.setString(1, coursename);
		List<Student> l1 = new ArrayList<>();
		// exec query
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				l1.add(new Student(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDate(5),
						rst.getInt(6), rst.getInt(7)));
		}
		return l1;
	}

	@Override
	public String admitStudent(Student s) throws SQLException {
		pst2.setString(1, s.getName());
		pst2.setString(2, s.getEmail());
		pst2.setString(3, s.getAddr());
		pst2.setDate(4, s.getDob());
		pst2.setInt(5, s.getMarks());
		pst2.setInt(6, s.getCourseid());
		int updateCount = pst2.executeUpdate();
		if (updateCount == 1)
			return "Stu admit successful";
		return "Stu admit failed!!!!!!";
	}

	@Override
	public String dispTopper(String cname) throws SQLException {
		pst3.setString(1,cname);
		pst3.setString(2,cname);
		String s="";
		try (ResultSet rst = pst3.executeQuery()) {
			while (rst.next())
				s=s+rst.getInt(1)+"  "+rst.getString(2)+" "+rst.getString(3)+" "+rst.getString(4)+" "+rst.getDate(5)+" "+rst.getInt(6)+" "+rst.getInt(7);
		}
		return s;
	}

	@Override
	public String stuRemove(int id) throws SQLException {
		pst4.setInt(1, id);
		int cnt = pst4.executeUpdate();
		if (cnt == 1)
			return "Student Removed successfully";
		return "Student Remove failed!!!!!!";
	}

	@Override
	public String updateMarks(int id, int marks) throws SQLException {
		pst5.setInt(2, id);
		pst5.setInt(1, marks);
		int cnt=pst5.executeUpdate();
		if (cnt == 1)
			return "Student Marks Update";
		return "Update Failed";
	}

}
