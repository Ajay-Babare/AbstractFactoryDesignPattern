
public class WebDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	Employee create() {
		return new WebDeveloper();
	}

}
