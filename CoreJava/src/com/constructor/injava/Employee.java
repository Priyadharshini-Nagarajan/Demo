package com.constructor.injava;

public class Employee {
	private String name;
    private int age;
    private String department;

    // Constructor
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
   
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", department='" + department + '\'' + '}';
    }

	public static void main(String[] args) {
		 Employee emp = new Employee("Priyadharshini", 23, "IT");
	     System.out.println(emp);

	}

}
