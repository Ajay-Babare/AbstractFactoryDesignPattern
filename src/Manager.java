
public class Manager implements Employee {

	@Override
	public int getSalary() {
		return 100000;
	}

	@Override
	public String name() {
		System.out.println("I am Manager");
		return "Manager";
	}

}
