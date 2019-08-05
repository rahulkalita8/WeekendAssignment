import java.util.ArrayList;
import java.util.Scanner;

class EleventhUserMainCode{
	
	static String highestScorer(ArrayList<String> marksDetails){
		String nerdStudent = "";
		int topScore = 0;
		for (String student : marksDetails) {
			String[] marks = student.split("-");
			String name = marks[0];
			int Score = Integer.parseInt(marks[1]) + Integer.parseInt(marks[2]) + Integer.parseInt(marks[3]);  
			if(Score>topScore){
				topScore = Score;
				nerdStudent = name;
			}
		}		
		return nerdStudent;
				
	}
	
}

public class Eleventh {

	public static void main(String[] args) {
		ArrayList<String> details =  new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Students: ");
		int size = scan.nextInt();
		scan.nextLine();
		for(int i=0; i<size; i++){
			System.out.println("Enter name and marks of Student " + (i+1) 
					+ "\n(name-marks1-marks2-marks3");
			String str = scan.nextLine();
			details.add(str);
		}
		String bestStudent = EleventhUserMainCode.highestScorer(details);
		System.out.println("Top Scorer: " + bestStudent);
		scan.close();
		
	}
	
}
