import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Адамович Татьяна Владимировна", 1,75000);
        employees[1] = new Employee("Барг Александр Михайлович", 2,55000);
        employees[2] = new Employee("Веденина Варвара Юрьевна", 3,60000);
        employees[3] = new Employee("Гельфанд Сергей Израйлевич", 4,65000);
        employees[4] = new Employee("Белавин Александр Абрамович", 5,70000);
        employees[5] = new Employee("Давыдов Александр Абрамович", 1,50000);
        employees[6] = new Employee("Ерофеев Павел Давидович", 2,80000);
        employees[7] = new Employee("Вьюгин Владимир Вячеславович", 3,45000);
        employees[8] = new Employee("Иванов Кирилл Владимирович", 4,90000);
        employees[9] = new Employee("Зигангиров Дмитрий Камильевич", 5,95000);

        listOfEmployees(employees);
        System.out.println();

        int totalSalary = totalSalary(employees);
        System.out.println("Общая сумма затрат на зарплаты в месяц составляет: " + totalSalary);
        System.out.println();

        Employee minSalary = minSalary(employees);
        System.out.println("Минимальная зарплата в месяц у сотрудника: " + minSalary);
        System.out.println();

        Employee maxSalary = maxSalary(employees);
        System.out.println("Максимальная зарплата в месяц у сотрудника: " + maxSalary);
        System.out.println();

        double averageSalary = averageSalary(totalSalary);
        System.out.println("Средняя значение зарплат составляет: " + averageSalary);
        System.out.println();

        fullNameList(employees);
    }

    public static void listOfEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int totalSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary(Employee[] employees) {
        int minSum = employees[0].getSalary();
        Employee employee = new Employee("",0,0);
        for (Employee value : employees) {
            if (value.getSalary() < minSum) {
                minSum = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static Employee maxSalary(Employee[] employees) {
        int maxSum = employees[0].getSalary();;
        Employee employee = new Employee("",0,0);
        for (Employee value : employees) {
            if (value.getSalary() > maxSum) {
                maxSum = employee.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static double averageSalary(int totalSalary) {
        double averageSalary = totalSalary;
        averageSalary /= 30;
        return averageSalary;
    }

    public static void fullNameList(Employee[] employees) {
        String[] list = new String[employees.length];
        System.out.println("Список сотрудников:");
        for (int index = 0; index < employees.length; index++) {
            list[index] = employees[index].getFullName();
            System.out.println(list[index]);
        }
    }
}