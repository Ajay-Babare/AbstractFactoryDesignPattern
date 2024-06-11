
public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("I am a Android Developer");
		return "Android Developer";
	}

}
