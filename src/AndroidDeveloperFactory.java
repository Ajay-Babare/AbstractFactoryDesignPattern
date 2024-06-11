
public class AndroidDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	Employee create() {
		return new AndroidDeveloper();
	}

}
