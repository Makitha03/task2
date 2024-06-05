 class person
{

    private String name;
    private int age;


    public person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

// Define the subclass Employee that inherits from Person
class Employee extends Person
{
    private int employeeID;
    private double salary;
    public Employee(String name, int age, int employeeID, double salary)
    {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public void display()
    {
        super.display();
        System.out.println("employeeid: " +employeeID);
        System.out.println(": salr" + salary);
    }
}
public class PerEmploy
{
    public static void main(String[] args)
    {
        // Create an Employee object
        Employee employee1 = new Employee("John Doe", 30, 1001, 50000.0);
        employee1.display();

    }
}


