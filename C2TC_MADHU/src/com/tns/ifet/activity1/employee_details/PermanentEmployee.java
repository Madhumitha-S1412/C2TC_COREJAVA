package com.tns.ifet.activity1.employee_details;

public class PermanentEmployee extends Employee{
	 private double basicSalary;
	    private double allowance;

	    public PermanentEmployee(int id, String name, String department, double basicSalary, double allowance) {
	        super(id, name, department);
	        this.basicSalary = basicSalary;
	        this.allowance = allowance;
	    }

	    @Override
	    public double calculateSalary() {
	        return basicSalary + allowance;
	    }
	}

