package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="Merve";
        System.out.println(Employee.manager);
        Employee.printManager();
    }
}
