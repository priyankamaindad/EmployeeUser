class User 
{
    int id;
    String name;

   public User(int id, String name)
   {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User {
    double salary;

    Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    void printSalary() {
        double annualSalary = salary * 12;
        System.out.println("Employee: " + name + "   " + annualSalary);
    }


public class UserEmployeeExample {
    public static void main(String[] args) {
                                    //  object of the Employee class using the constructor
        Employee employee = new Employee(1, "Priyanka", 10000.02);

                       // Print the annual salary 
        employee.printSalary();
    }
}
}



