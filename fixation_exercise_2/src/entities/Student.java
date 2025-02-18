package entities;

public class Student {
	
	public String name;
	public double firstQuarter;
	public double secondQuarter;
	public double thirdQuarter;

	
	private double sumPoints() {
		return firstQuarter + secondQuarter + thirdQuarter;
	}

	
	public String checkApprovation() {
		String finalMessage = null;
		double missingPoints;
		if (firstQuarter > 30.00 || secondQuarter > 35.00 || thirdQuarter > 35.00) {
			finalMessage = "Nota inválida";
		}
		else if (this.sumPoints() > 60.00) {
			finalMessage = "FINAL GRADE = " + this.sumPoints() + "\nPASS";
		} else {
			missingPoints = 60.00 - this.sumPoints();
			finalMessage = "FINAL GRADE = " + this.sumPoints() + "\nFAILED\nMISSING " + missingPoints + " POINTS";
		}
		return finalMessage;
	}
	
}
