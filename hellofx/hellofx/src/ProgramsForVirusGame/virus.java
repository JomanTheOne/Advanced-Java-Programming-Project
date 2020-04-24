package ProgramsForVirusGame;

public class virus {
	
//l
	private String name;
	private Object symptom;
	
	public virus (String name, Object symptom) {
		this.name = name;
		this.symptom = symptom;
	}
	
	public String getVirusName() {
		return this.name;
	}
	
	public Object getSymptomName() {
		return this.symptom;
	}
	
	
}
