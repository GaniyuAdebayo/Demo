package gBooks;

public class GradeBook {
	
	private String courseName;
	private int [] grades;
	
	public GradeBook (String courseName, int [] grades){
		
		this.courseName = courseName;
		this.grades = grades;
	}
	
	public void setCourseName(String courseName){
		
		this.courseName = courseName;
	}
	
	public String getCourseName(){
		
		return courseName;
	}
	
	public void displayMessage(){
		
		System.out.printf("Welcome to the class of \n%s\n\n", getCourseName());
	}
	
	public void processGrades(){
		
		outputGrades();
		
		System.out.printf("\nThe minimum and maximum of the grades are %d and %d respectively\n\n", getMinimum(), getMaximum());
		
		System.out.printf("The average of the grades is %.2f\n\n", getAverage());
		
		outputBarChart();
		
	}
	
	public int getMinimum(){
		
		int lowGrade = grades[0];
		
		for (int lGrade: grades){
			
			if (lGrade < lowGrade)
				
				lowGrade = lGrade;
		}
		
		return lowGrade;
		
	}
	
	public int getMaximum(){
		
		int highGrade = grades[0];
		
		for (int hGrade: grades ){
			
			if (hGrade > highGrade)
				
				highGrade = hGrade;
		}
		
		return highGrade;
	}
	
	public double getAverage(){
		
		int sum = 0;
		
		for (int numbers: grades)
			
			sum += numbers;
		
		return (double) sum/grades.length;
	}
	
	public void outputBarChart(){
		
		int [] frequency = new int [11];
		
		System.out.println("Grades Distribution\n");
		
		for (int grade: grades)
			
			++frequency[grade/10];
		
		for (int numbers = 0; numbers < frequency.length; numbers++){
			
			if (numbers == 10)
				
				System.out.printf("%5d: %d\t", 100, frequency[10]);
			else
				System.out.printf("%02d-%02d: %d\t", numbers * 10, (numbers + 1)*10 -1, frequency[numbers]);
			
			for (int stars = 0; stars < frequency[numbers]; stars++)
				
				System.out.print("*");
			System.out.println();
		}
	}
	
	public void outputGrades(){
		
		for (int numbers = 0; numbers < grades.length; numbers++)
			
			System.out.printf("Student %d: %d\n", numbers + 1, grades[numbers]);
	}

}
