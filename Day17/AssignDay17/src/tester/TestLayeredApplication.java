package tester;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import dao.StuDaoImpl;
import pojos.Student;

public class TestLayeredApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init code -- create DAO instance
			StuDaoImpl dao = new StuDaoImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options\r" + "\n1. Display student details for a specific course name\r"
						+ "\n2. Student admission\r" + "\n3. Display topper details for a specific course\r"
						+ "\n4. Cancel Admission\r" + "\n5. Update marks\r\n" + "\n9.Exit");
				System.out.println("Enter option");
				switch (sc.nextInt()) {
				case 1: // display emp details
					System.out.println("Display student details for a specific course name");
					List<Student> l1 = dao.getStuDetails(sc.next());
					System.out.println("Student List");
					for (Student e : l1)
						System.out.println(e);
					break;
				case 2:
					System.out.println("Student admission name, email, addr, dob, marks, courseid");
					System.out.println("Status " + dao.admitStudent(new Student(sc.next(), sc.next(), sc.next(),
							Date.valueOf(sc.next()), sc.nextInt(), sc.nextInt())));
					break;

				case 3:
					System.out.println("Display topper details for a specific course name");
					System.out.println("Topper: " + dao.dispTopper(sc.next()));
					break;

				case 4:
					System.out.println("Cancel Admission: Enter Student ID");
					System.out.println("Status " + dao.stuRemove(sc.nextInt()));
					break;

				case 5:
					System.out.println("Update Marks: Enter Student ID and New Marks");
					System.out.println("Status " + dao.updateMarks(sc.nextInt(), sc.nextInt()));
					break;

				case 9:
					exit = true;
					dao.cleanUp();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
