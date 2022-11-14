package entities;

public class Student {
	public String name;
	public double gradeFirstTrimester;
	public double gradeSecondTrimester;
	public double gradeThirdTrimester;
	
	public double finalGrade() {
		return this.gradeFirstTrimester + this.gradeSecondTrimester + this.gradeThirdTrimester;
	}
}
