package ProgramsForVirusGame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		//Variables
		boolean bool = true;
		String text = "File does exist";
		String text2 = "File does not exist";
		
		while(bool) {
			int checkNum = CheckFile();
			if (checkNum == 1) {
				bool = false;
			}
		}
		
		
		
	}
	public static int CheckFile() {
		//Variables
		int numberError = -1, numberNoError = 1;
		Boolean bool = true;
		
		try {
			String filename = "Symptoms";
			File symptomsFile = new File(filename);
			
			//Check if file exists, else catch exception
			Scanner fileScan = new Scanner(symptomsFile);
			
			//Grab each line
			while (fileScan.hasNext()) {
				String symptomInfo = fileScan.nextLine();
				System.out.println(symptomInfo);
				
				String[] split = symptomInfo.split(",");
				
				//Number Country
				String num = split[0];
				int numSymptom = Integer.parseInt(num);
				
				//Symptom Name
				String symptomName = split[1];
				
				//Infectivity Number
				String num2 = split[2];
				int infectNum = Integer.parseInt(num2);
				
				//Lethality Number
				String num3 = split[3];
				int lethalNum = Integer.parseInt(num3);
				
				SymptomSuperclass symptom = new SymptomObjects(numSymptom, symptomName, infectNum, lethalNum);
				
				ArrayList<Object> symptoms = new ArrayList<Object>();
				symptoms.add(symptom);
			}
			
			return numberNoError;
			
			
		}catch(FileNotFoundException error) {
			System.out.println("Can't Find File");
			return numberError;
		}

	}

}
