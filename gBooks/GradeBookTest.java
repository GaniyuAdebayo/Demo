package gBooks;

public class GradeBookTest {
	
	public static void main (String [] args){
		
		int [] grades = {58, 69, 84, 32, 54, 68, 77, 65, 48, 94, 21, 59};
		
		GradeBook myGradeBook = new GradeBook ("Chemical Engineering Thermodynamics", grades);
		
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	}

}
