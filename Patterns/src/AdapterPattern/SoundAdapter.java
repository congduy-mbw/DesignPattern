package AdapterPattern;

public class SoundAdapter implements NewSound {
	private String nameS;
	private int yearS;
	
	private final OldSound oldSound;
	
	public SoundAdapter(OldSound oldSound) {
		this.oldSound = oldSound;
		this.setProps();
	}

	@Override
	public void sound() {
		System.out.println("New System");
		
	}

	@Override
	public void setNameS(String nameS) {
		this.nameS = nameS;
	}

	@Override
	public void setYearS(int yearS) {
		this.yearS = yearS;
	}

	@Override
	public String getNameS() {
		return this.nameS;
	}

	@Override
	public int getYearS() {
		return this.yearS;
	}
	
	private void setProps() {
		this.setNameS(this.oldSound.getName());
		this.setYearS(this.oldSound.getYear());
	}
	
}
