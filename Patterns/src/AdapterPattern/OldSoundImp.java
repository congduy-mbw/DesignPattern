package AdapterPattern;

public class OldSoundImp implements OldSound {
	private String name;
	private int year;
	
	public OldSoundImp() {
		this.name = "";
		this.year = 0;
	}
	
	public OldSoundImp(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public int getYear() {
		return this.year;
	}
	
	@Override
	public void sound() {
		System.out.println("System sound");
	}
}
