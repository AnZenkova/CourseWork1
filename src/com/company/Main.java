package com.company;

public class Main {

    public static void main(String[] args) {

        EmployeesBook employeesBook = new EmployeesBook();
        employeesBook.addEmployee("Крылов", "Тихон", "Петрович", 1, 105_853);
        employeesBook.addEmployee("Маслова", "Милиса", "Викторовна", 1, 45_083);
        employeesBook.addEmployee("Яковлев", "Леонид", "Аристархович", 2, 83_012);
        employeesBook.addEmployee("Полякова", "Божена", "Семёновна", 2, 119_540);
        employeesBook.addEmployee("Волков", "Мирослав", "Онисимович", 3, 148_005);
        employeesBook.addEmployee("Анисимова", "Данна", "Максимовна", 3, 114_430);
        employeesBook.addEmployee("Соловьёв", "Ефрем", "Леонидович", 4, 38_911);
        employeesBook.addEmployee("Меркушева", "Глория", "Созонова", 4, 52_291);
        employeesBook.addEmployee("Никитин", "Адам", "Якунович", 5, 66_058);
        employeesBook.addEmployee("Кудрявцева", "Галина", "Мироновна", 5, 47_832);
        employeesBook.printListOfEmployees();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты: " + employeesBook.calculateCostOfSalary() + " рублей;");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой:  " + employeesBook.findEmployeeWithMinSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой:  " + employeesBook.findEmployeeWithMaxSalary());
        System.out.println();
        System.out.println("Средняя зарплата: " + employeesBook.findAverageSalary() + " рублей;");
        System.out.println();
        employeesBook.printAllEmployees();
        employeesBook.indexationSalaryAllEmployees(3);
        employeesBook.printListOfEmployees();
        System.out.println();
        employeesBook.findEmployeeMaxSalaryDepartment(3);
        System.out.println();
        employeesBook.findEmployeeMinSalaryDepartment(3);
        System.out.println();
        System.out.println("Сумма затрат на зарплаты: " + employeesBook.calculateCostOfSalaryDepartment(5) + " рублей;");
        System.out.println();
        System.out.println("Средняя зарплата в отделе: " + employeesBook.findAverageSalaryDepartment(5) + " рублей;");
        System.out.println();
        employeesBook.indexationSalaryAllEmployeesDepartment(5,20);
        employeesBook.printListOfEmployees();
        System.out.println();
        employeesBook.printEmployeesDepartment(1);
        System.out.println();
        employeesBook.findEmployeesWithSalaryLessThenNumber(100_000);
        System.out.println();
        employeesBook.findEmployeesWithSalaryGreaterThanNumber(100_000);
        System.out.println();
        employeesBook.removeEmployee("Полякова","Божена","Семёновна");
        employeesBook.printListOfEmployees();
        System.out.println();
        employeesBook.addNewEmployee("Зенкова", "Анастасия", "Алексеевна", 1, 150_000);
        employeesBook.printListOfEmployees();
        System.out.println();
        employeesBook.changeSalaryAndDepartmentOfEmployee("Зенкова", "Анастасия", "Алексеевна", 100_000, 3);
        employeesBook.printListOfEmployees();
        System.out.println();
        employeesBook.printListOfEmployeesByDepartment();
    }
}
