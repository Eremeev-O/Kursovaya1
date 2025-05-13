public class EmployeeBook {
    private final Employee[] employees;
    private final Employee employeesNull;
    private int size = 1;
    private int id;
    private int salTemp;
    private int idTemp;

    public EmployeeBook() {
        this.employees = new Employee[5];
        this.employeesNull = new Employee("отсутствует", "отсутствует", "отсутствует", "отсутствует", 0);
        this.employeesNull.setId(-1);

    }
    public boolean addEmployee(String employeeFirstName, String employeeLastName,String employeeSurName, String employeeDepartment, int employeeSalary) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                id++;
                System.out.println("i = " + i);
                Employee newEmployee = new Employee(employeeFirstName, employeeLastName, employeeSurName, employeeDepartment, employeeSalary);
                this.employees[i] = newEmployee;
                this.employees[i].setId(id);
                System.out.println("main id:" + id);
                System.out.println(this.employees[i].getId());
                size++;
                return true;
            }
        }
        return false;
    }
    public void printAllEmployee() {
        System.out.println("________________________________________________________________________");
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                Employee employee = employees[i];
                System.out.println(" id: " + employee.getId() + ", " + employee.getSurName() + " " + employee.getFirstName() + " " + employee.getLastName() + ", отдел: " + employee.getDepartment() + ", зарплата: " + employee.getSalary());
            }
        }
    }
    public void removeEmployee (int removeId) {
        System.out.println("________________________________________________________________________");
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].getId() == removeId) {
                System.out.println("Сотрудник: " + employees[i].getSurName() + " " + employees[i].getFirstName() + " " + employees[i].getLastName() + " - удален");
                this.employees[i] = null;
                size = this.employees.length;
                return;
            }
        }
    }
    public Employee returnEmployee (int returnID) {
        System.out.println("________________________________________________________________________");
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].getId() == returnID) {
                return this.employees[i];
                //return "Найден сотрудник с id: " + employees[i].getId() + ", " + employees[i].getSurName() + " " + employees[i].getFirstName() + " " + employees[i].getLastName() + ", отдел: " + employees[i].getDepartment() + ", зарплата: " + employees[i].getSalary();
                //return "Найден сотрудник с id: " + employees[i].getId() + ", " + employees[i].getSurName() + " " + employees[i].getFirstName() + " " + employees[i].getLastName() + ", отдел: " + employees[i].getDepartment() + ", зарплата: " + employees[i].getSalary();
            }
        }
        return employeesNull;
    }
    public void indexationSalary(int div) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                this.employees[i].setSalary(employees[i].getSalary() + (this.employees[i].getSalary() * div / 100));
            }
        }
    }
    public void minSalary (String depName) {
        salTemp = 0;
        idTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (salTemp == 0 && this.employees[i].getDepartment().equals(depName)) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
            if (salTemp > this.employees[i].getSalary() && this.employees[i].getDepartment().equals(depName)) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
        }
        if (salTemp != 0 && idTemp >= 0) {
            System.out.println("Минимальная ЗП у : " + this.employees[idTemp].toString());
        } else {
            System.out.println("Нет такого отдела!");
        }
    }
    public void maxSalary (String depName) {
        salTemp = 0;
        idTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (salTemp < this.employees[i].getSalary() && this.employees[i].getDepartment().equals(depName)) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
        }
        if (salTemp != 0 && idTemp >= 0) {
            System.out.println("Максимальная ЗП у : " + this.employees[idTemp].toString());
        } else {
            System.out.println("Нет такого отдела!");
        }
    }
}
