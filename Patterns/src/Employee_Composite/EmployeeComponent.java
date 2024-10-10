package Employee_Composite;

import java.util.List;

public abstract class EmployeeComponent {
	public abstract void setName(String name);
	
	public void setGender(String gender) {
		throw new UnsupportedOperationException("Operation is not support");
	}
	
	public void addElement(EmployeeComponent e) {
		throw new UnsupportedOperationException("Operation is not support");
	}
	
	public List<EmployeeComponent> getChildren(){
		throw new UnsupportedOperationException("Operation is not support");
	}
	
	public abstract void generateElement();
}
