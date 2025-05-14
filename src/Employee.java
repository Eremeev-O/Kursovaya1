import java.util.Objects;

public class Employee {
    private String firstName;
    private String surName;
    private String lastName;
    private String department;
    private int salary;
    // id сотрудника делаем уникальным!
    private int id;

    public Employee(String surName, String firstName, String lastName, String department, int salary, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }
        public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSurName() {
        return this.surName;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean equals(Object otherEmployee) {
        if (this.getClass() != otherEmployee.getClass()) {
            return false;
        }
        // Сравниваем все поля, кроме поля с id
        return this.firstName.equals(((Employee) otherEmployee).firstName) && this.lastName.equals(((Employee) otherEmployee).lastName) && this.surName.equals(((Employee) otherEmployee).surName) && this.department.equals(((Employee) otherEmployee).department) && this.salary == ((Employee) otherEmployee).salary;
    }

    public int hashCode() {
        // Рассчитываем хэш в купе для всех полей, кроме поля с id
        return java.util.Objects.hash(this.firstName, this.lastName, this.surName, this.department, this.salary);
    }

    public String toString() {
        return "id: " + this.id + " " + this.surName + " " + this.firstName + " " + this.lastName + ", отдел: " + this.department + ", зарплата: " + this.salary;
    }
}