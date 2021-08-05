package construct;
import java.util.*;
public class EmployeeWage_UC1 {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.attendence();
	}
}
class Employee {
	void attendence() {
		
	int is_Full_Time=1;
	int empCheck=(int)Math.floor(Math.random() *10) % 2;

	if(empCheck== is_Full_Time)
		System.out.println("Employee is Present");
	else
		System.out.println("Employee is Absent");
}

}
