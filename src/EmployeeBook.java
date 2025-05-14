public class EmployeeBook {
    private final Employee[] employees;
    private int id;
    private float salTemp;
    private int idTemp;
    private int trigger;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }
    public boolean addEmployee(String employeeFirstName, String employeeLastName,String employeeSurName, int employeeDepartment, float employeeSalary) {
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
                Employee employee = this.employees[i];
                System.out.println(this.employees[i].toString());
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
                return;
            }
        }
    }
    public void findEmployee (int returnID) {
        trigger = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getId() == returnID) {
                System.out.println(this.employees[i].toString());
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
    public void indexationSalary(int div, int depName) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getDepartment() == depName) {
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
        System.out.println(this.employees[idTemp].toString());
    }
    public void minSalary (int depName) {
        idTemp = -1;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && i == 0 && this.employees[i].getDepartment() == depName) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
            if (this.employees[i] != null && salTemp > this.employees[i].getSalary() && this.employees[i].getDepartment() == depName) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
        }
        if (idTemp >= 0) {
            System.out.println(this.employees[idTemp].toString());
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
        System.out.println(this.employees[idTemp].toString());
    }
    public void maxSalary (int depName) {
        salTemp = 0;
        idTemp = -1;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && salTemp < this.employees[i].getSalary() && this.employees[i].getDepartment() == depName) {
                salTemp = this.employees[i].getSalary();
                idTemp = i;
            }
        }
        if (idTemp >= 0) {
            System.out.println(this.employees[idTemp].toString());
        } else {
            System.out.println("Нет такого отдела!");
        }
    }
    public float costAmount (int depName){
        salTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getDepartment() == depName) {
                salTemp += this.employees[i].getSalary();
            }
        }
        return salTemp;
    }
    public float costAmount (){
        salTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                salTemp += this.employees[i].getSalary();
            }
        }
        return salTemp;
    }
    public float averageSalary (){
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
    public float averageSalary (int depName){
        salTemp = 0;
        idTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getDepartment() == depName) {
                salTemp += this.employees[i].getSalary();
                idTemp++;
            }
        }
        return salTemp/idTemp;
    }
    public void departmentEmployees (int depName){
        idTemp = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getDepartment() == depName) {
                System.out.println(this.employees[i].toStringNoDep());
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
                System.out.println(this.employees[i].toStringNoDep());
            }
        }
    }
    public void maxSalaryOtnos(int summ) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null && summ <= this.employees[i].getSalary()) {
                System.out.println(this.employees[i].toStringNoDep());
            }
        }
    }
}
