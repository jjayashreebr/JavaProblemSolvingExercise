package problems.employee;

public class TestEmployee {

	public static void main(String[] args) {
	
		Employee e = new Employee("Jay", 70000, 2022, "HSA309");
		System.out.println("Name "+e.getName());
		System.out.println("Salary "+e.getAnnualSalary());
		System.out.println("year "+e.getYearStartedToWork());
		System.out.println("Insurance number "+e.getInsuranceNumber());
		e.setAnnualSalary(80000);
		e.setName("JJ");
		System.out.println("Name "+e.getName());
		System.out.println("Salary "+e.getAnnualSalary());
		System.out.println("year "+e.getYearStartedToWork());
		System.out.println("Insurance number "+e.getInsuranceNumber());

	}

}
