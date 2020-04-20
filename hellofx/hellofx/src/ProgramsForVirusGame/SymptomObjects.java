package ProgramsForVirusGame;

public class SymptomObjects extends SymptomSuperclass{
		
	private int infectivityNum;
	private int lethalityNum;
	
	public SymptomObjects (int num, String symptomName, int infectNum, int lethalNum) {
		super(symptomName,num);
		this.infectivityNum = infectNum;
		this.lethalityNum = lethalNum;
		//l
	}
}
