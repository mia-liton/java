public class Main {
    public static void main(String[] args) {

        Person person = new Person("Harry", "Potter");
        Student student = new Student("Steve", "Smith", 3.55);
        Employee employee = new Employee("Joe", "Root", 25000);

        employee.showName();
        employee.showSalary();

    }

}