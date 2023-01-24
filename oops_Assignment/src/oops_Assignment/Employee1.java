package oops_Assignment;
import java.util.ArrayList;
class Employee1 {
	long salary = 30000;
	public int getSalary(int salary) {
		this.salary=salary;
		return salary;
	}
	public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries) {
		int totalSal=0;
	for (int sal:employeeSalaries) {
		totalSal+=sal;
	}
	return totalSal;
	}
	public static void main(String[] args) {
		Employee1 employee=new Employee1();
		Manager manager=new Manager();
		long managerSalary=manager.getSalary(employee.salary);
		Labour labour=new Labour();
		long labourSalary=labour.getSalary(employee.salary);
		ArrayList<Integer> employeeSalaryList=new ArrayList<>();
		employeeSalaryList.add((int) labourSalary);
		System.out.println(Employee1.totalEmployeesSalary(employeeSalaryList));
	}
}

class Manager extends Employee1{
	public long getSalary(long salary) {
		int incentive=4000;
		return salary+incentive;
	}
	}
class Labour extends Employee1{
	public long getSalary(long salary) {
		int overtime=1000;
		return salary+overtime;
	}
}
