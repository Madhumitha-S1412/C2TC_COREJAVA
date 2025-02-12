package com.tns.ifet.activity1.employee_details;

public class ContractEmployee extends Employee  {
	 private double hourlyRate;
	    private int workingHours;

	    public ContractEmployee(int id, String name, String department, double hourlyRate, int workingHours) {
	        super(id, name, department);
	        this.hourlyRate = hourlyRate;
	        this.workingHours = workingHours;
	    }

	    @Override
	    public double calculateSalary() {
	        return hourlyRate * workingHours;
	    }

}
