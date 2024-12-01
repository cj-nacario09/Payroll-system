public class PayrollForm {

	//attribute decleration
	private String name;
	private String employeeType;

	private double mon_salary;
	private double rate;
	private int hours_worked;
	private double wage;

	//construstor decleration
	PayrollForm() {
		System.out.println("\n========== Payroll Form ==========");
	}

	//method decleration
	//mutator
	public void setName(String temp) {
		name = temp;
	}
	public void setType(String temp) {
		employeeType = temp;
	}

	public void setMon_salary(double temp) {
		mon_salary = temp;
	}

	public void setRate(double temp) {
		rate = temp;
	}

	public void setHours_worked(int temp) {
		hours_worked = temp;
	}

	//accessor
	public String getName() {
		return name;
	}

	public String getType() {
		return employeeType;
	}

	public double getMon_salary() {
		return mon_salary;
	}

	public double getRate() {
		return rate;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public double getWage() {

		double total_wage = 0;
		total_wage = rate * hours_worked;
		wage = total_wage;

		return wage;
	}
}