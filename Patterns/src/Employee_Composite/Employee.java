package Employee_Composite;

public class Employee extends EmployeeComponent {
	private String name;
	private String gender;
	
	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void generateElement() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " - " + this.gender);
	}
	
}
