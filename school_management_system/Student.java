package school_management_system;

//This class is responsible to keep track on students details and their fees.

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getblanceFees() {
        return feesTotal - feesPaid;
    }

    public void payFees(int amount) {
        if (feesPaid + amount <= feesTotal) {
            feesPaid += amount;
            School.updateTotal_money_earned(amount);
            System.out.println("Fees paid successfully.");
        } else {
            System.out.println("Payment exceeds total fees please pay RS.30000 or less!");
        }
    }

}