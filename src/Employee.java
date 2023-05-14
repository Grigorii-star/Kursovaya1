public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter;
    private int id;

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee( String fullName, int department, int salary) {
        counter++;
        this.id = counter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id " + id + " - Ф.И.О: " + fullName + "; отдел: " + department + "; зарплата: " + salary;
    }
}
