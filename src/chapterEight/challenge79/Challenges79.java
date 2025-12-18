package chapterEight.challenge79;

public class Challenges79 {
    public static void main(String[] args) {
        Employee employee = new Employee("Torab", 22, 89000);
        System.out.println(employee.getEmployeeDetails());
        employee.setName("Rina");
        employee.setAge(16);
        employee.setSalary(78000);
        System.out.println(employee.getEmployeeDetails());
    }
}
