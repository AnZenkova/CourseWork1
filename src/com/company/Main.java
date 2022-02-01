package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employees[] = new Employee[10];
        Employee employee1 = new Employee("Крылов", "Тихон", "Петрович", 1, 105_853);
        addEmployeeToDatabase(employee1, employees);
        Employee employee2 = new Employee<>("Маслова", "Милиса", "Викторовна", 1, 45_083);
        addEmployeeToDatabase(employee2, employees);
        Employee employee3 = new Employee<>("Яковлев", "Леонид", "Аристархович", 2, 83_012);
        addEmployeeToDatabase(employee3, employees);
        Employee employee4 = new Employee<>("Полякова", "Божена", "Семёновна", 2, 119_540);
        addEmployeeToDatabase(employee4, employees);
        Employee employee5 = new Employee<>("Волков", "Мирослав", "Онисимович", 3, 148_005);
        addEmployeeToDatabase(employee5, employees);
        Employee employee6 = new Employee<>("Анисимова", "Данна", "Максимовна", 3, 114_430);
        addEmployeeToDatabase(employee6, employees);
        Employee employee7 = new Employee<>("Соловьёв", "Ефрем", "Леонидович", 4, 38_911);
        addEmployeeToDatabase(employee7, employees);
        Employee employee8 = new Employee<>("Меркушева", "Глория", "Созонова", 4, 52_291);
        addEmployeeToDatabase(employee8, employees);
        Employee employee9 = new Employee<>("Никитин", "Адам", "Якунович", 5, 66_058);
        addEmployeeToDatabase(employee9, employees);
        Employee employee10 = new Employee<>("Кудрявцева", "Галина", "Мироновна", 5, 47_832);
        addEmployeeToDatabase(employee10, employees);
        printListOfEmployees(employees);
        System.out.println("Сумма затрат на зарплаты: " + calculateCostOfSalary(employees) + " рублей;");
        findEmployeeWithMinSalary(employees);
        findEmployeeWithMaxSalary(employees);
        System.out.println("Средняя зарплата: " + findAverageSalary(employees) + " рублей;");
        printAllEmployees(employees);
    }

    private static void addEmployeeToDatabase(Employee name, Employee[] database) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] == null) {
                database[i] = name;
                break;
            }
        }
    }

    private static void printListOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static double calculateCostOfSalary(Employee[] employees) {
        double sum = 0f;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].employeeSalary;
        }
        return sum;
    }

    private static void findEmployeeWithMinSalary(Employee[] employees) {
        double minSalary = 1.0/0.0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].employeeSalary){
                minSalary = employees[i].employeeSalary;
                index = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой:  " + employees[index]);
    }

    private static void findEmployeeWithMaxSalary(Employee[] employees){
        double maxSalary = -1;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].employeeSalary){
                maxSalary = employees[i].employeeSalary;
                index = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой:  " + employees[index]);
    }

    private static double findAverageSalary(Employee[] employees) {
        double averageSalary = calculateCostOfSalary(employees) / employees.length;
        return averageSalary;
    }

    private static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].employeeLastName+ " " + employees[i].employeeName + " " + employees[i].employeeMiddleName);
        }
    }
}
