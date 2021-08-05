package construct;
import java.util.*;
public class EmployeeWage {
	public static void main(String[] args)
	{
	Employee emp=new Employee();
	emp.attendence();
	emp.dailyWage();
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
	void dailyWage()
	{
		int wage_Per_Hour=20;
		int daily_Hours=8;
		int dailyWage=wage_Per_Hour*daily_Hours;
		System.out.println("Daily wage of Employee = " +dailyWage);
	}
}




