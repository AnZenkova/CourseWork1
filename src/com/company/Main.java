package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employees[] = new Employee[10];
        Employee employee1 = new Employee("Крылов", "Тихон", "Петрович", 1, 105_853);
        addEmployeeToDatabase(employee1, employees);
        Employee employee2 = new Employee("Маслова", "Милиса", "Викторовна", 1, 45_083);
        addEmployeeToDatabase(employee2, employees);
        Employee employee3 = new Employee("Яковлев", "Леонид", "Аристархович", 2, 83_012);
        addEmployeeToDatabase(employee3, employees);
        Employee employee4 = new Employee("Полякова", "Божена", "Семёновна", 2, 119_540);
        addEmployeeToDatabase(employee4, employees);
        Employee employee5 = new Employee("Волков", "Мирослав", "Онисимович", 3, 148_005);
        addEmployeeToDatabase(employee5, employees);
        Employee employee6 = new Employee("Анисимова", "Данна", "Максимовна", 3, 114_430);
        addEmployeeToDatabase(employee6, employees);
        Employee employee7 = new Employee("Соловьёв", "Ефрем", "Леонидович", 4, 38_911);
        addEmployeeToDatabase(employee7, employees);
        Employee employee8 = new Employee("Меркушева", "Глория", "Созонова", 4, 52_291);
        addEmployeeToDatabase(employee8, employees);
        Employee employee9 = new Employee("Никитин", "Адам", "Якунович", 5, 66_058);
        addEmployeeToDatabase(employee9, employees);
        Employee employee10 = new Employee("Кудрявцева", "Галина", "Мироновна", 5, 47_832);
        addEmployeeToDatabase(employee10, employees);
        printListOfEmployees(employees);
        System.out.println("Сумма затрат на зарплаты: " + calculateCostOfSalary(employees) + " рублей;");
        findEmployeeWithMinSalary(employees);
        findEmployeeWithMaxSalary(employees);
        System.out.println("Средняя зарплата: " + findAverageSalary(employees) + " рублей;");
        printAllEmployees(employees);
        indexationSalaryAllEmployees(employees,3);
        findEmployeeMaxSalaryDepartment(employees,3);
        findEmployeeMinSalaryDepartment(employees,3);
        System.out.println("Сумма затрат на зарплаты: " + calculateCostOfSalaryDepartment(employees,5) + " рублей;");
        System.out.println("Средняя зарплата в отделе: " + findAverageSalaryDepartment(employees,5) + " рублей;");
        indexationSalaryAllEmployeesDepartment(employees, 2, 20);
        printEmployeesDepartment(employees,1);
        findEmployeesWithSalaryLessThenNumber(employees, 100_000);
        findEmployeesWithSalaryGreaterThanNumber(employees,100_000);
    }

    private static void addEmployeeToDatabase(Employee name, Employee[] database) { // Добавить сотрудника в базу данных
        for (int i = 0; i < database.length; i++) {
            if (database[i] == null) {
                database[i] = name;
                break;
            }
        }
    }

    private static void printListOfEmployees(Employee[] employees) { // распечатать сотрудников и их данные
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static float calculateCostOfSalary(Employee[] employees) { // сумма затрат на зарплаты
        float sum = 0f;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].employeeSalary;
        }
        return sum;
    }

    private static void findEmployeeWithMinSalary(Employee[] employees) { // найти сотрудника с минимальной зарплатой
        float minSalary = 10000000;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].employeeSalary){
                minSalary = employees[i].employeeSalary;
                index = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой:  " + employees[index]);
    }

    private static void findEmployeeWithMaxSalary(Employee[] employees){ // найти сотрудника с максимальной зарплатой
        float maxSalary = -1f;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].employeeSalary){
                maxSalary = employees[i].employeeSalary;
                index = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой:  " + employees[index]);
    }

    private static float findAverageSalary(Employee[] employees) { // средняя зарплата сотрудников
        float averageSalary = (float) (calculateCostOfSalary(employees) / employees.length);
        return averageSalary;
    }

    private static void printAllEmployees(Employee[] employees) { // Ф. И. О. всех сотрудников
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].employeeLastName+ " " + employees[i].employeeName + " " + employees[i].employeeMiddleName);
        }
    }

    private static void indexationSalaryAllEmployees(Employee[] employees, int argument) { // индексация всех зарплат на %
        for (int i = 0; i < employees.length; i++) {
            employees[i].employeeSalary = employees[i].employeeSalary + (employees[i].employeeSalary * argument)/100;
        }
    }

    private static void findEmployeeMaxSalaryDepartment(Employee[] employees, int department) { // нахождение сотрудника с максимальной зарплатой в отделе
        float maxSalary = -1f;
        int index = 0;
        Employee[] employeesDepartment = new Employee[2];
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].employeeDepartment == department) {
                    if (employees[i].employeeSalary > maxSalary)
                    index = i;
                    maxSalary = employees[i].employeeSalary;
                }
            }
        System.out.println("Сотрудник с максимальной зарплатой в отделе" + department +":  " + employees[index]);
    }

    private static void findEmployeeMinSalaryDepartment(Employee[] employees, int department) { // нахождение сотрудника с минимальной зарплатой в отделе
        float minSalary = 1000000;
        int index = 0;
        Employee[] employeesDepartment = new Employee[2];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].employeeDepartment == department) {
                if (employees[i].employeeSalary < minSalary)
                    index = i;
                minSalary = employees[i].employeeSalary;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ":  " + employees[index]);
    }

    private static float calculateCostOfSalaryDepartment(Employee[] employees, int department) { // сумма затрат на зарплаты в отделе
        float sum = 0f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].employeeDepartment == department) {
                sum = sum + employees[i].employeeSalary;
            }
        }
        return sum;
    }

    private static float findAverageSalaryDepartment(Employee[] employees, int department) { // средняя зарплата сотрудников в отделе
        int lengthDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].employeeDepartment == department) {
                lengthDepartment++;
            }
        }
        float averageSalary = (calculateCostOfSalaryDepartment(employees,department) / lengthDepartment);
        return averageSalary;
    }

    private static void indexationSalaryAllEmployeesDepartment(Employee[] employees,int department, int argument) { // индексация всех зарплат на % в отделе
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].employeeDepartment == department) {
                employees[i].employeeSalary = employees[i].employeeSalary + (employees[i].employeeSalary * argument)/100;
            }
        }
    }

    private static void printEmployeesDepartment(Employee[] employees, int department) { // печать сотрудников отдела
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].employeeDepartment == department) {
                System.out.println(employees[i].employeeLastName + " " + employees[i].employeeName + " " + employees[i].employeeMiddleName + " " + employees[i].employeeSalary);
            }
        }
    }

    private static void findEmployeesWithSalaryLessThenNumber(Employee[] employees, float number) { // сотрудников с зарплатой меньше числа
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].employeeSalary < number) {
                System.out.println(employees[i].getID() + ": " + employees[i].employeeLastName + " " + employees[i].employeeName + " " + employees[i].employeeMiddleName + " " + employees[i].employeeSalary);
            }
        }
    }

    private static void findEmployeesWithSalaryGreaterThanNumber(Employee[] employees, float number) { // сотрудников с зарплатой больше или равно числу
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].employeeSalary >= number) {
                System.out.println(employees[i].getID() + ": " + employees[i].employeeLastName + " " + employees[i].employeeName + " " + employees[i].employeeMiddleName + " " + employees[i].employeeSalary);
            }
        }
    }
}
