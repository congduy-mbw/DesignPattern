package Employee_Composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends EmployeeComponent{
	private String name;
	private List<EmployeeComponent> children;
	
	public Department(String name) {
		this.name = name;
		this.children = new ArrayList<EmployeeComponent>();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	@Override
	public List<EmployeeComponent> getChildren(){
		return this.children;
	}
	
	@Override
	public void addElement(EmployeeComponent e) {
		this.children.add(e);
	}

	@Override
	public void generateElement() {
		// TODO Auto-generated method stub
		System.out.println("Phòng ban: " + this.name);
		for(EmployeeComponent e: this.children) {
			e.generateElement();
		}
	}
	
	
}
