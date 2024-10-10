package AdapterPattern;

public class AdapterMain {

	public static void main(String[] args) {
		OldSound oldSound = new OldSoundImp("Đặng Duy", 1998);
		oldSound.sound();
		NewSound newSound = new SoundAdapter(oldSound);
		newSound.sound();
		System.out.println(newSound.getNameS());
		System.out.println(newSound.getYearS());

	}

}
