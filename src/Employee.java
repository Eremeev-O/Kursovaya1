import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String surName;
    private final String lastName;
    private int department;
    private float salary;
    private int id;

    public Employee(String surName, String firstName, String lastName, int department, float salary, int id) {
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

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean equals(Object otherEmployee) {
        if (this.getClass() != otherEmployee.getClass()) {
            return false;
        }
        // Сравниваем все поля, кроме поля с id
        return this.firstName.equals(((Employee) otherEmployee).firstName) && this.lastName.equals(((Employee) otherEmployee).lastName) && this.surName.equals(((Employee) otherEmployee).surName) && this.department == ((Employee) otherEmployee).department && this.salary == ((Employee) otherEmployee).salary;
    }

    public int hashCode() {
        // Рассчитываем хэш в купе для всех полей, кроме поля с id
        return java.util.Objects.hash(this.firstName, this.lastName, this.surName, this.department, this.salary);
    }

    public String toString() {
        return "id: " + this.id + ", " + this.surName + " " + this.firstName + " " + this.lastName + ", отдел: " + this.department + ", зарплата: " + this.salary;
    }
    public String toStringNoDep() {
        return "id: " + this.id + ", " + this.surName + " " + this.firstName + " " + this.lastName + ", зарплата: " + this.salary;
    }
}