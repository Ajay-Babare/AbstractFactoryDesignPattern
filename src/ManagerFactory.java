
public class ManagerFactory extends EmployeeAbstractFactory {

	@Override
	Employee create() {
		return new Manager();
	}


}
