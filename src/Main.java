public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        System.out.println(employeeBook.addEmployee("Иванов", "Лев", "Александрович", "1", 15000));
        System.out.println(employeeBook.addEmployee("Петров", "Иван", "Анатольевич", "1", 21000));
        System.out.println(employeeBook.addEmployee("Баширов", "Серей", "Петрович", "3", 18000));
        System.out.println(employeeBook.addEmployee("Юдин", "Петр", "Семенович", "1", 32000));
        System.out.println(employeeBook.addEmployee("Семенов", "Олег", "Владимирович", "5", 18000));
        System.out.println(employeeBook.addEmployee("Ивановский", "Семен", "Владиславович", "3", 40000));
        employeeBook.printAllEmployee();
        employeeBook.removeEmployee(3);
        employeeBook.printAllEmployee();
        System.out.println(employeeBook.addEmployee("Ивановский", "Семен", "Владиславович", "3", 40000));
        employeeBook.printAllEmployee();
        System.out.println("Результат поиска - " + employeeBook.returnEmployee(4).toString());
        System.out.println("Результат поиска - " + employeeBook.returnEmployee(8).toString());
        employeeBook.indexationSalary(10);
        System.out.println("Результат индексации зарплаты:");
        employeeBook.printAllEmployee();
        employeeBook.minSalary("2");
        employeeBook.maxSalary("3");
    }
}