package school_management_system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public  void receiveSalary() {
        if (School.getNetBalance() >= salary) {
            salaryEarned += salary;
            School.updateTotal_money_spent(salary);
            System.out.println("Salary paid successfully to " + name);
        } else {
            System.out.println("Insufficient funds in the school to pay salary of " + name);
        }
    }


}
