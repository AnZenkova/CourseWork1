package com.company;

    public class EmployeesBook {
        private static Employee[] employees;
        private static int size;

        public EmployeesBook() {
            this.employees = new Employee[10];
        }

        public void addEmployee(String employeeLastName, String employeeName, String employeeMiddleName, int employeeDepartment, double employeeSalary) {
            if (size >= employees.length) {
                System.out.println("Книга учёта сотрудников переполнена. Добавление нового сотрудника ограниченно.");
                return;
            }
            Employee newEmployee = new Employee(employeeLastName, employeeName, employeeMiddleName, employeeDepartment, employeeSalary);
            employees[size++] = newEmployee;
        }

        public void printListOfEmployees() { // распечатать сотрудников и их данные
            for (int i = 0; i < size; i++) {
                Employee employee = employees[i];
                System.out.println(employees[i]);
            }
        }

        public double calculateCostOfSalary() { // сумма затрат на зарплаты
            double sum = 0f;
            for (int i = 0; i < size; i++) {
                sum = sum + employees[i].getEmployeeSalary();
            }
            return sum;
        }

        public Employee findEmployeeWithMinSalary() { // найти сотрудника с минимальной зарплатой
            double minSalary = 1.0 / 0.0;
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (minSalary > employees[i].getEmployeeSalary()) {
                    minSalary = employees[i].getEmployeeSalary();
                    index = i;
                }
            }
            return employees[index];
        }

        public Employee findEmployeeWithMaxSalary() { // найти сотрудника с максимальной зарплатой
            double maxSalary = -1;
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (maxSalary < employees[i].getEmployeeSalary()) {
                    maxSalary = employees[i].getEmployeeSalary();
                    index = i;
                }
            }
            return employees[index];
        }

        public double findAverageSalary() { // средняя зарплата сотрудников
            double averageSalary = calculateCostOfSalary() / size;
            return averageSalary;
        }

        public void printAllEmployees() { // Ф. И. О. всех сотрудников
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i].getEmployeeLastName() + " " + employees[i].getEmployeeName() + " " + employees[i].getEmployeeMiddleName());
            }
        }

        public void indexationSalaryAllEmployees(int percent) { // индексация всех зарплат на %
            for (int i = 0; i < size; i++) {
                employees[i].employeeSalary = employees[i].getEmployeeSalary() + (employees[i].getEmployeeSalary() * percent) / 100;
            }
        }

        public void findEmployeeMaxSalaryDepartment(int department) { // нахождение сотрудника с максимальной зарплатой в отделе
            double maxSalary = -1f;
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeDepartment() == department) {
                    if (employees[i].employeeSalary > maxSalary)
                        index = i;
                    maxSalary = employees[i].employeeSalary;
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ":  " + employees[index]);
        }

        public void findEmployeeMinSalaryDepartment(int department) { // нахождение сотрудника с минимальной зарплатой в отделе
            double minSalary = 1.0 / 0.0;
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeDepartment() == department) {
                    if (employees[i].employeeSalary < minSalary)
                        index = i;
                    minSalary = employees[i].employeeSalary;
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ":  " + employees[index]);
        }

        public double calculateCostOfSalaryDepartment(int department) { // сумма затрат на зарплаты в отделе
            double sum = 0;
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeDepartment() == department) {
                    sum = sum + employees[i].employeeSalary;
                }
            }
            return sum;
        }

        public double findAverageSalaryDepartment(int department) { // средняя зарплата сотрудников в отделе
            int lengthDepartment = 0;
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeDepartment() == department) {
                    lengthDepartment++;
                }
            }
            return calculateCostOfSalaryDepartment(department) / lengthDepartment;
        }

        public void indexationSalaryAllEmployeesDepartment(int department, int percent) { // индексация всех зарплат на % в отделе
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeDepartment() == department) {
                    employees[i].employeeSalary = employees[i].employeeSalary + (employees[i].employeeSalary * percent) / 100;
                }
            }
        }

        public void printEmployeesDepartment(int department) { // печать сотрудников отдела
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeDepartment() == department) {
                    System.out.println(employees[i].getEmployeeLastName() + " " + employees[i].getEmployeeName() + " " + employees[i].getEmployeeMiddleName() + " " + employees[i].employeeSalary);
                }
            }
        }

        public void findEmployeesWithSalaryLessThenNumber(double number) { // сотрудников с зарплатой меньше числа
            for (int i = 0; i < size; i++) {
                if (employees[i].employeeSalary < number) {
                    System.out.println(employees[i].getID() + ": " + employees[i].getEmployeeLastName() + " " + employees[i].getEmployeeName() + " " + employees[i].getEmployeeMiddleName() + " " + employees[i].employeeSalary);
                }
            }
        }

        public void findEmployeesWithSalaryGreaterThanNumber(double number) { // сотрудников с зарплатой больше или равно числу
            for (int i = 0; i < size; i++) {
                if (employees[i].employeeSalary >= number) {
                    System.out.println(employees[i].getID() + ": " + employees[i].getEmployeeLastName() + " " + employees[i].getEmployeeName() + " " + employees[i].getEmployeeMiddleName() + " " + employees[i].employeeSalary);
                }
            }
        }

        public void addNewEmployee(String employeeLastName, String employeeName, String employeeMiddleName, int employeeDepartment, double employeeSalary) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    System.out.println(i);
                    employees[3] = new Employee(employeeLastName, employeeName, employeeMiddleName, employeeDepartment, employeeSalary);
                    break;
                }
            }
        }

        public void removeEmployee(String employeeLastName, String employeeName, String employeeMiddleName) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getEmployeeLastName().equals(employeeLastName) && employees[i].getEmployeeName().equals(employeeName) && employees[i].getEmployeeMiddleName().equals(employeeMiddleName)) {
                    employees[i] = null;
                }
            }
        }

        public void changeSalaryAndDepartmentOfEmployee(String employeeLastName, String employeeName, String employeeMiddleName, double newSalary, int newDepartment) {
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeLastName().equals(employeeLastName) && employees[i].getEmployeeName().equals(employeeName) && employees[i].getEmployeeMiddleName().equals(employeeMiddleName)) {
                    if (newSalary == 0 && newDepartment !=0) {
                        employees[i].employeeSalary = employees[i].employeeSalary;
                        employees[i].employeeDepartment = newDepartment;
                    } else if (newDepartment == 0 && newSalary != 0) {
                        employees[i].employeeDepartment = employees[i].employeeDepartment;
                        employees[i].employeeSalary = newSalary;
                    } else {
                        employees[i].employeeSalary = newSalary;
                        employees[i].employeeDepartment = newDepartment;
                    }
                }
            }
        }

        public void printListOfEmployeesByDepartment() {
            int maxDepartment = 0;
            for (int i = 0; i < size; i++) {
                if (employees[i].employeeDepartment > maxDepartment) {
                    maxDepartment = employees[i].employeeDepartment;
                }
            }
            for (int i = 1; i <= maxDepartment; i++) {
               System.out.println("Отдел № " + i);
                for (int j = 0; j < employees.length; j++) {
                    if (employees[j].employeeDepartment == i) {
                        System.out.println(employees[j].getEmployeeLastName() + " " + employees[j].getEmployeeName() + " " + employees[j].getEmployeeMiddleName());
                    }
                }
            }
        }
    }
