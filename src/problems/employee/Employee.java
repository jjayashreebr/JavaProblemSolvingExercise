package problems.employee;

public class Employee extends Person {
	double annualSalary;
	int yearStartedToWork;
	String insuranceNumber;
	
	public Employee(String name, double annualSalary, int yearStartedToWork, String insuranceNumber) {
		super(name);
		this.annualSalary = annualSalary;
		this.yearStartedToWork = yearStartedToWork;
		this.insuranceNumber = insuranceNumber;
	}
	

	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getYearStartedToWork() {
		return yearStartedToWork;
	}
	public void setYearStartedToWork(int yearStartedToWork) {
		this.yearStartedToWork = yearStartedToWork;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

}
