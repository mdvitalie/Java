package sheet7EmployeeAndClockClasses;

public class Ex1EmployeeClassMain {

	public static void main(String[] args) {
		
		
		Ex1EmployeeClass employee = new Ex1EmployeeClass("Adam", 25,25_000,2);
		System.out.println(employee);
		employee.increaseSalary(1.04);
		System.out.println(" New salary: " +employee.getSalary());

		System.out.println("----------------------------------\n");
		Ex1EmployeeClass employee1 = new Ex1EmployeeClass();
		employee1.setName("Vladimir");
		employee1.setAge(23);
		employee1.setSalary(21_000);
		employee1.setSickDays(8);
//		System.out.println("Employee number: " + Ex1EmployeeClass.employeeNumCounter);
		System.out.println("Employee number: " + employee1.employeeNumber);
		
		System.out.println("Employee name: "+	employee1.getName());
		System.out.println("Employee age: "+	employee1.getAge());
		System.out.println("Employee salary: "	+employee1.getSalary());
		System.out.println("Employee sick days: "+employee1.getSickDays());
		employee1.increaseSalary(1.04);
		System.out.println(" New salary: " +employee1.getSalary());
		
		System.out.println("\n_______________________________\n");
		
		Ex1EmployeeClass employee2 = new Ex1EmployeeClass("Ted Morphy");
		employee2.setAge(56);
		employee2.setSalary(65_000);
		employee2.setSickDays(2);
		System.out.println(employee2);
		
		employee2.increaseSalary(1.04);
		System.out.println(" New salary: " +employee2.getSalary());
		
		System.out.println("\n_______________________________\n");
		
		Ex1EmployeeClass employee3 = new Ex1EmployeeClass("Ted Morphy");
		employee3.setAge(56);
		employee3.setSalary(65_000);
		employee3.setSickDays(2);
		System.out.println(employee3);
		
		employee2.increaseSalary(1.06);
		System.out.println(" New salary: " +employee2.getSalary());
		
		System.out.println("\n---------------------------------");
		System.out.println(" Number of Employee created: | " +Ex1EmployeeClass.employeeCounter);
		System.out.println("---------------------------------");
	
		

	}

}
