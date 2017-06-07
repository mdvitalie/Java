package sheet15Exceptions;

public class Ex1EmployeeClass {
	
	/* Member variables */
	
	private String name;
	private int age;
	private double salary;
	private int sickDays;
	public  int employeeNumber;
	public static int employeeNumCounter=100;
	public static int employeeCounter;
	
	
	
	
	
	public Ex1EmployeeClass() {
		this.employeeNumber=employeeNumCounter++;
		sickDays =4;
		employeeCounter++;
	}
	
	
	public Ex1EmployeeClass(String name) {
		this();
		//setName(name);
		this.name = name;
	}
	
	

	public Ex1EmployeeClass(String name, int age, double salary, int sickDays) {
		this();
		setName(name);
		setAge(age);
		setSalary(salary);
		setSickDays(sickDays);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		String regex = "[a-zA-z]+";
		
		if(name.matches(regex))
			this.name = name;
		else 
		System.out.println("invaled name.");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		
		if(age<=18 || age>=65)
			System.out.println("You take a break,");
		else
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		
		if(salary >= 21_000 || salary<= 100 )
			
		this.salary = salary;
		
		else
			System.out.println("The salary is to low.");
		
	}
	
	public int getSickDays() {
		return sickDays;
	}
	
	public void setSickDays(int sickDays) {
		
		if(sickDays ==0 )
			
		System.out.println("You have no sick days taken.");
		
		if(sickDays<=20)
			
			this.sickDays = sickDays;
		
		else
			System.out.println(sickDays+" You should be out of work\n");
	}
	
	public double increaseSalary(double salaryProsent){
		this.salary =salary * salaryProsent;
		return salary;
	}

	@Override
	public String toString() {
		return " Employee number: "+ employeeNumber+
				"\n Employee name: " + name +
				"\n Employee age: " + age + 
				"\n Employee salary: " + salary +
				"\n Employee sick days: " + sickDays
				;
	}
	
	
	
	

}
