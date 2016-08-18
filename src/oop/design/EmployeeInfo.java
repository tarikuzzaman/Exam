package oop.design;

public class EmployeeInfo extends AbsClass{



 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 *
 * Important: YOU MUST USE the
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static final String companyName = "Apple";
	private String department;
	private int employeeId;
	private String name;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;

	}
	public EmployeeInfo(String name, int employeeId){
		this.name = name;
		this.employeeId = employeeId;

	}
	public EmployeeInfo(){
		name = "Employee";
		employeeId = 0000;

	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeBonus(int salary, char performance){
		double bonus = 0;
		if(performance == 'A'){
			bonus = salary * .1;
		}
		else if (performance == 'B'){
			bonus = salary * .08;
		}
		else if (performance == 'C'){
			bonus = salary * .05;
		}
		else if (performance == 'F'){
			bonus = salary * 0;
		}
		else
			System.out.println("Invalid performance grade!");

		return bonus;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployePension(int salary, int years){
		double pension=0;
		pension = salary * (.05 * years);
		return pension;
	}
	public int employeeId(){
		return employeeId;
	}
	public int calculateSalary(int base, int hours){
		return base*hours;
	}
	public String employeeName(){
		return name;
	}
	public void assignDepartment(String department){
		this.department = department;

	}
	public String getDepartment(){
		return department;

	}

}
