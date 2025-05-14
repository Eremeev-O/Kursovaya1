import java.util.Objects;

public class EmployeeBook {
    private final Employee[] employees;
//    private int size = 1;
    private int id;
    private int salTemp;
    private int idTemp;
    private int trigger;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }
    public boolean addEmployee(String employeeFirstName, String employeeLastName,String employeeSurName, String employeeDepartment, int employeeSalary) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                id++;
                Employee newEmployee = new Employee(employeeFirstName, employeeLastName, employeeSurName, employeeDepartment, employeeSalary, id);
                this.employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }
    public void printAllEmployee() {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                Employee employee = employees[i];
                System.out.println(" id: " + employee.getId() + ", " + employee.getSurName() + " " + employee.getFirstName() + " " + employee.getLastName() + ", отдел: " + employee.getDepartment() + ", зарплата: " + employee.getSalary());
            }
        }
    }
    public void printFIO (){
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                Employee employee = employees[i];
                System.out.println(employee.getSurName() + " " + employee.getFirstName() + " " + employee.getLastName());
            }
        }
    }
    public void removeEmployee (int removeId) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].getId() == removeId) {
                System.out.println("Сотрудник: " + employees[i].getSurName() + " " + employees[i].getFirstName() + " " + employees[i].getLastName() + " - удален");
                this.employees[i] = null;
            //    size = this.employees.length;
                return;
            }
        }
    }
    public void returnEmployee (int returnID) {
        trigger = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getId() == returnID) {
                System.out.println("Найден сотрудник с id: " + employees[i].getId() + ", " + employees[i].getSurName() + " " + employees[i].getFirstName() + " " + employees[i].getLastName() + ", отдел: " + employees[i].getDepartment() + ", зарплата: " + employees[i].getSalary());
                trigger = 1;
            }
        }
        if (trigger == 0) {
            System.out.println("Сотрудник не найден");
        }
    }
    public void indexationSalary(int div) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                this.employees[i].setSalary(employees[i].getSalary() + (this.employees[i].getSalary() * div / 100));
            }
        }
    }
    public void indexationSalary(int div, String depName) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getDepartment().equals(depName)) {
                this.employees[i].setSalary(employees[i].getSalary() + (this.employees[i].getSalary() * div / 100));
            }
        }
    }
    public void minSalary () {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && i == 0) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
            if (this.employees[i] != null && salTemp > this.employees[i].getSalary()) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
        }
        System.out.println("Минимальная ЗП у : " + this.employees[idTemp].toString());
    }
    public void minSalary (String depName) {
        idTemp = -1;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && i == 0 && this.employees[i].getDepartment().equals(depName)) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
            if (this.employees[i] != null && salTemp > this.employees[i].getSalary() && this.employees[i].getDepartment().equals(depName)) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
        }
        if (idTemp >= 0) {
            System.out.println("Минимальная ЗП у : " + this.employees[idTemp].toString());
        } else {
            System.out.println("Нет такого отдела!");
        }
    }
    public void maxSalary () {
        salTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && salTemp < this.employees[i].getSalary()) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
        }
        System.out.println("Максимальная ЗП у : " + this.employees[idTemp].toString());
    }
    public void maxSalary (String depName) {
        salTemp = 0;
        idTemp = -1;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && salTemp < this.employees[i].getSalary() && this.employees[i].getDepartment().equals(depName)) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
        }
        if (idTemp >= 0) {
            System.out.println("Максимальная ЗП у : " + this.employees[idTemp].toString());
        } else {
            System.out.println("Нет такого отдела!");
        }
    }
    public int costAmount (String depName){
        salTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getDepartment().equals(depName)) {
                salTemp += this.employees[i].getSalary();
            }
        }
        return salTemp;
    }
    public int costAmount (){
        salTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                salTemp += this.employees[i].getSalary();
            }
        }
        return salTemp;
    }
    public int averageSalary (){
        salTemp = 0;
        idTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                salTemp += this.employees[i].getSalary();
                idTemp++;
            }
        }
        return salTemp/idTemp;
    }
    public int averageSalary (String depName){
        salTemp = 0;
        idTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getDepartment().equals(depName)) {
                salTemp += this.employees[i].getSalary();
                idTemp++;
            }
        }
        return salTemp/idTemp;
    }
    public void departmentEmployees (String depName){
        idTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getDepartment().equals(depName)) {
                System.out.println("id: " + this.employees[i].getId() + ", " + this.employees[i].getSurName() + " " + this.employees[i].getFirstName() + " " + this.employees[i].getLastName() + ", зарплата: " + this.employees[i].getSalary());
                idTemp++;
            }
        }
        if (idTemp == 0) {
            System.out.println("Нет такого отдела");
        }
    }
    public void minSalaryOtnos(int summ) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && summ > this.employees[i].getSalary()) {
                System.out.println("id: " + this.employees[i].getId() + ", " + this.employees[i].getSurName() + " " + this.employees[i].getFirstName() + " " + this.employees[i].getLastName() + ", зарплата: " + this.employees[i].getSalary());
            }
        }
    }
    public void maxSalaryOtnos(int summ) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && summ <= this.employees[i].getSalary()) {
                System.out.println("id: " + this.employees[i].getId() + ", " + this.employees[i].getSurName() + " " + this.employees[i].getFirstName() + " " + this.employees[i].getLastName() + ", зарплата: " + this.employees[i].getSalary());
            }
        }
    }
}
