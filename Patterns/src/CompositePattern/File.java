package CompositePattern;

public class File implements FileSystemComponent {
	
	private String name;
	
	public File(String name) {
		this.name = name;
	}

	@Override
	public void showDetail() {
		// TODO Auto-generated method stub
		System.out.println("File: " + this.name);
	}
	
	
}
