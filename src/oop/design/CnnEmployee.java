package oop.design;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {


		EmployeeInfo generic = new EmployeeInfo();
		EmployeeInfo employeeOne = new EmployeeInfo("Zaman", 1);
		EmployeeInfo employeeTwo = new EmployeeInfo(2);
		employeeOne.assignDepartment("Software Tester");
		System.out.println("The assigned department for "+ employeeOne.employeeName()+" is "+employeeOne.getDepartment());

		System.out.println("The yearly calculated bonus for employee is "+EmployeeInfo.calculateEmployeBonus(10000, 'A'));
		System.out.println("The yearly calculated pension for employee is "+EmployeeInfo.calculateEmployePension(20000, 4));

		System.out.println("Weekly salary for "+employeeOne.employeeName()+" is "+employeeOne.calculateSalary(50, 40));



	}

}
