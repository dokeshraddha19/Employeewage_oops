package construct;
import java.util.*;
public class EmployeeWage {
	public static void main(String[] args)
	{
	Employee emp=new Employee();
	emp.attendence();
	emp.dailyWage();
	emp.partTime();
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
	void partTime()
	{
		 int partTime=1;
        	 int fullTime=2;
	         int empCheck = (int)Math.floor(Math.random() * 10)%3;

		   switch((int)(empCheck)) {

                                case 1:
                                       int emphr = 4;
						System.out.println("parttime");
                                        break;
                                case 2:
                                        emphr = 8;
						System.out.println("fulltime");
                                        break;
                                default:
                                     	emphr = 0;
                         System.out.println("absent");
                         int totalWorkingHours=0;
                         totalWorkingHours = totalWorkingHours + emphr;
                         int WagePerHour=20;
                     	int Salary_20Days=WagePerHour*totalWorkingHours;
                     	System.out.println("salary for 20 day = " +Salary_20Days);

                               }
	}
}




