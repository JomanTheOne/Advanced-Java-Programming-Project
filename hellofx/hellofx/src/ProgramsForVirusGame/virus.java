package ProgramsForVirusGame;

public class virus {
	
//l
	private String name;
	private Object symptom;
	private int lethality;
	private int infectivity;
	
	public virus (String name, Object symptom, int lethal, int infect) {
		this.name = name;
		this.symptom = symptom;
		this.infectivity = infect;
		this.lethality = lethal;
	}
	
	public String getVirusName() {
		return this.name;
	}
	
	public Object getSymptomName() {
		return this.symptom;
	}
	
	public int getLethal() {
		return this.infectivity;
	}
	
	public int getInfect() {
		return this.lethality;
	}
	
}
