package Employee_Composite;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeComponent department_root = new Department("Phòng sản phẩm");
		EmployeeComponent department_1 = new Department("Phòng ban 1");
		EmployeeComponent department_2 = new Department("Phòng ban 2");
		
		EmployeeComponent employee1 = new Employee("Đặng Duy", "1998");
		EmployeeComponent employee2 = new Employee("Đặng Nhất", "2000");
		department_1.addElement(employee1);
		department_1.addElement(employee2);
		department_root.addElement(department_1);
		department_root.addElement(department_2);
		department_root.generateElement();
	}

}
