public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println("Вводим данные работников и выводим результат их заведения (для наглядности true or false)");
        System.out.println(employeeBook.addEmployee("Иванов", "Лев", "Александрович", 1, 15000));
        System.out.println(employeeBook.addEmployee("Петров", "Иван", "Анатольевич", 1, 21000));
        System.out.println(employeeBook.addEmployee("Баширов", "Серей", "Петрович", 3, 18000));
        System.out.println(employeeBook.addEmployee("Юдин", "Петр", "Семенович", 1, 32000));
        System.out.println(employeeBook.addEmployee("Семенов", "Олег", "Владимирович", 5, 18000));
        System.out.println(employeeBook.addEmployee("Ивановский", "Семен", "Владиславович", 3, 40000));
        System.out.println(employeeBook.addEmployee("Усталченко", "Устал", "Усталович", 5, 12000));
        System.out.println(employeeBook.addEmployee("Усталченко1", "Устал1", "Усталович1", 3, 31000));
        System.out.println(employeeBook.addEmployee("Усталченко2", "Устал2", "Усталович2", 2, 48000));
        System.out.println(employeeBook.addEmployee("Усталченко3", "Устал3", "Усталович3", 3, 27000));
        System.out.println(employeeBook.addEmployee("Усталченко4", "Устал4", "Усталович4", 4, 41000));

        System.out.println();
        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными:");
        employeeBook.printAllEmployee();
        System.out.println();

        System.out.println("Посчитать сумму затрат на ЗП в месяц:");
        System.out.println("Сумма затрат на ЗП составила: " + employeeBook.costAmount());
        System.out.println();

        System.out.println("Найти сотрудника с минимальной ЗП:");
        employeeBook.minSalary();
        System.out.println();

        System.out.println("Найти сотрудника с максимальной ЗП:");
        employeeBook.maxSalary();
        System.out.println();

        System.out.println("Подсчитать среднее значение зарплат");
        System.out.println("Средняя заоплата: " + employeeBook.averageSalary());
        System.out.println();

        System.out.println("Распечатать ФИО всех сотрудников:");
        employeeBook.printFIO();
        System.out.println();

        System.out.println("Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %:");
        employeeBook.indexationSalary(10);
        System.out.println("Результат индексации зарплаты:");
        employeeBook.printAllEmployee();
        System.out.println();

        System.out.println("Сотрудника с минимальной зп по отделу:");
        employeeBook.minSalary(3);
        System.out.println();

        System.out.println("Сотрудника с максимальной зп по отделу:");
        employeeBook.maxSalary(3);
        System.out.println();

        System.out.println("Сумма затрат по отделу: " + employeeBook.costAmount(1));
        System.out.println();

        System.out.println("Средняя зарплата по отделу: " + employeeBook.averageSalary(1));
        System.out.println();

        System.out.println("Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра");
        employeeBook.indexationSalary(5, 3);
        System.out.println("Результат индексации зарплаты:");
        employeeBook.printAllEmployee();
        System.out.println();

        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела)");
        employeeBook.departmentEmployees(1);
        System.out.println();

        System.out.println("Все сотрудники с зп меньше числа (распечатать id, фио и зп в консоль");
        employeeBook.minSalaryOtnos(40000);
        System.out.println();

        System.out.println("Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль)");
        employeeBook.maxSalaryOtnos(40000);
        System.out.println();

        System.out.println("Удалить сотрудника (находим сотрудника по id, нуллим его ячейку в массиве)");
        employeeBook.removeEmployee(3);
        System.out.println("Результат удаления:");
        employeeBook.printAllEmployee();
        System.out.println();

        System.out.println("Добавляем нового сотрудника");
        employeeBook.addEmployee("Иванченко", "Борис", "Владимирович", 3, 40000);
        System.out.println("Результатт добавления нового сотрудника");
        employeeBook.printAllEmployee();
        System.out.println();

        System.out.println("Добавить метод для получения сотрудника по id:");
        System.out.println("Результат поиска:");
        employeeBook.findEmployee(4);
        System.out.println();


    }
}