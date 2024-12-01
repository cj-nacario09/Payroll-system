import java.util.Scanner;

public class PayrollMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PayrollForm payroll = new PayrollForm();

		// Getting employee details
		System.out.print("Enter employee name: ");
		payroll.setName(scanner.nextLine());

		System.out.print("Enter employee type (F for FullTime / P for PartTime): ");
		payroll.setType(scanner.nextLine());

		if ("F".equalsIgnoreCase(payroll.getType())) {
			System.out.println("\n+++++ FULL-TIME employee +++++");
			System.out.print("Enter monthly salary: ");
			payroll.setMon_salary(scanner.nextDouble());
		}
		else if ("P".equalsIgnoreCase(payroll.getType())) {
			System.out.println("\n+++++ PART-TIME employee +++++");
			System.out.print("Enter hourly rate: ");
			payroll.setRate(scanner.nextDouble());

			System.out.print("Enter hours worked: ");
			payroll.setHours_worked(scanner.nextInt());
		}
		else {
			System.out.println("Invalid employee type entered.");
			return;
		}

		// Displaying employee details
		System.out.println("\n===== Employee Payroll Details =====");
		System.out.println("Name: " + payroll.getName());
		System.out.println("Employee Type: " + payroll.getType());
		if ("F".equalsIgnoreCase(payroll.getType())) {
			System.out.println("\n+++++ FULL-TIME employee +++++");
			System.out.println("\nMonthly Salary: " + payroll.getMon_salary() + " pesos");
		}
		else if ("P".equalsIgnoreCase(payroll.getType())) {
			System.out.println("\n+++++ PART-TIME employee +++++");
			System.out.println("Hourly Rate: " + payroll.getRate());
			System.out.println("Hours Worked: " + payroll.getHours_worked());
			System.out.println("\nTotal Wage: " + payroll.getWage() + " pesos");
		}


	}
}
