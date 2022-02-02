package com.company;

public class Employee {
    String employeeName;
    String employeeLastName;
    String employeeMiddleName;
    int employeeDepartment;
    float employeeSalary;
    int iD;
    static int count = 1;

    public Employee( String employeeLastName, String employeeName, String employeeMiddleName, int employeeDepartment, float employeeSalary) {
        this.employeeName = employeeName;
        this.employeeLastName = employeeLastName;
        this.employeeMiddleName = employeeMiddleName;
        this.employeeDepartment = employeeDepartment;
        departmentNumberCheck(employeeDepartment);
        this.employeeSalary = employeeSalary;
        this.iD = count++;
    }

    public int getID() {
        return iD;
    }

    public static void departmentNumberCheck(int employeeDepartment) {
        if (employeeDepartment <= 0 || employeeDepartment > 5) {
            throw new IllegalArgumentException("Отдела с номером " + employeeDepartment + " не существует");
        }
        return;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmployeeMiddleName() {
        return employeeMiddleName;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment() {
        employeeDepartment = employeeDepartment;
    }

    public void setEmployeeSalary() {
        employeeSalary = employeeSalary;
    }

    public boolean departmentNumberCheck() {
        return getEmployeeDepartment() < 5 && getEmployeeDepartment() > 0;
    }

    public String toString() {
        return "Отдел: " + employeeDepartment + "; Фамилия: " + employeeLastName + "; Имя: " + employeeName + "; Отчесво: " + employeeMiddleName + "; Зарплата: " + employeeSalary + ";";
    }

}
