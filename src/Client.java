
final class Client {

	public static void main(String[] args) {
		Employee emp1 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
		System.out.println(emp1.name()+" "+emp1.getSalary());
		
		Employee emp2 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		System.out.println(emp2.name()+" "+emp2.getSalary());
		
		Employee emp3 = EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println(emp3.name()+" "+emp3.getSalary());
	}

}
