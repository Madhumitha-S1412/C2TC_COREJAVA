package com.tns.ifet.activity1.employee_details;

public abstract class Employee {
	 private int id;
	    private String name;
	    private String department;

	    public Employee(int id, String name, String department) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public abstract double calculateSalary();
	}