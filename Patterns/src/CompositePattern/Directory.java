package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
	private String name;
	private List<FileSystemComponent> components = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	public void addComponent(FileSystemComponent component) {
		this.components.add(component);
	}

	@Override
	public void showDetail() {
		// TODO Auto-generated method stub
		System.out.println("Directory: " + this.name);
		for(FileSystemComponent file: this.components) {
			file.showDetail();
		}
	}
	
	
}
