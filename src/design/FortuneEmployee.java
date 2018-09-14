//package design;

//public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
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
		EmployeeInfo EMP1 = new EmployeeInfo("Mina Hossain",201);
		EmployeeInfo EMP2 = new EmployeeInfo("Jahid Islam",202);
		EmployeeInfo EMP3 = new EmployeeInfo("Syed Ali",203);


		EMP1.assignDepartment("QA tester");
		EMP2.assignDepartment("Developer");
		EMP3.assignDepartment("VP");

		EMP1.calculateSalary(10000);
		EMP2.calculateSalary(20000);
		EMP3.calculateSalary(30000);


		EMP1.setPerformance(4);
		double bonous1 = (EMP1.calculateEmployeeBonus(EMP1.getPerformane());

	}

}
