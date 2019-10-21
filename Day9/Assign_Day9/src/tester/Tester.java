package tester;

/*Options
1. New Student admission
2. Accept course name from user
Display names of all students for a specific course.
3. Update student marks
I/P --prn & new marks
O/P success message or err message via custom exception
4. Display prn & names  of all students born after specific date & enrolled in a specific course.
I/P date & course name
O/P prn & names.
5. Cancel Admission
I/P --prn 
O/P success message or err message via custom exception

6. Sort students as per prns , using natural ordering & display the same.

7. Sort students as per dob & marks  , using custom ordering & display the same.

8. Display name of a topper for a specific course(assume 1 topper only)
I/P course name.
O/P name of a topper.
Hint(Can directly use max() of Collections)
*/
import java.util.Scanner;
import java.util.ArrayList;
import com.app.core.Student;
import utils.ValidationUtils;
import static utils.CollectionUtils.populateStudents;
//import java.text.SimpleDateFormat;

public class Tester {

	public static void main(String[] args) {

		// Menu
		try (Scanner sc = new Scanner(System.in);) {
			boolean exit = false;
			ArrayList<Student> s_al = new ArrayList<Student>();
			s_al.addAll(populateStudents());
			while (!exit) {
				try {
					System.out.println("Menu");
					System.out.println("1. Register A new Student");
					System.out.println("2. Display All Student");
					System.out.println("3. Display names of all students for a specific course");
					System.out.println("4. Update student marks via PRN");
					System.out.println(
							"5. Display prn & names  of all students born after specific date & enrolled in a specific course.");
					System.out.println("6. Cancel Admission");
					System.out.println("7. Sort students as per prns , using natural ordering & display the same.");
					System.out.println(
							"8. Sort students as per dob & marks  , using custom ordering & display the same.");
					System.out.println("9. Display name of a topper for a specific course(assume 1 topper only)");
					System.out.println("0. Exit");
					System.out.print("Enter Choice:");

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter prn, name, email, course, marks, dob");
						Student temp = new Student(ValidationUtils.checkPRN(sc.next(),s_al), ValidationUtils.checkName(sc.next()),
								ValidationUtils.checkEmail(sc.next()), ValidationUtils.checkCourse(sc.next()),
								sc.nextInt(), ValidationUtils.checkDate(sc.next()));
						s_al.add(temp);
						System.out.println("New Student Registered");
						break;
					case 2:
						System.out.println("Displaying All Student");
						for (Student s : s_al)
							System.out.println(s);
						break;
					case 3:
						System.out.println("Enter course name");
						// Display names of all students for a specific course.
						String course = sc.next();
						for (Student s : s_al)
							if (s.getCourse().equalsIgnoreCase(course))
								System.out.println(s);
						break;
					case 4: {
						System.out.println("Enter PRN to Update student marks");
						String prn = sc.next();
						System.out.println("Enter New Marks");
						int newmarks = sc.nextInt();
						System.out.println(ValidationUtils.updateMarks(prn, newmarks, s_al));
					}
						break;
					case 5:
						System.out.println(
								" Display prn & names  of all students born after specific date & enrolled in a specific course");
						// I/P date & course name
						// O/P prn & names.
						break;
					case 6: {
						System.out.println("Enter PRN to Cancel Admission");
						String prn = sc.next();
						System.out.println(ValidationUtils.removeStudent(prn, s_al));
					}
						break;
					case 7:
						System.out.println(" Sort students as per prns , using natural ordering & display the same");
						break;
					case 8:
						System.out.println(
								"Sort students as per dob & marks  , using custom ordering & display the same.");
						break;
					case 9:
						System.out.println("Display name of a topper for a specific course(assume 1 topper only");

						// Hint(Can directly use max() of Collections)
						break;
					case 0:
						exit = true;
						System.out.println("Bye!");
						break;
					default:
						System.out.println("Invalid Choice");
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
