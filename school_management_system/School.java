package school_management_system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned= 0;
        totalMoneySpent = 0;
    }

    public static void updateTotal_money_earned(int money) {
        totalMoneyEarned += money;
    }

    public static void updateTotal_money_spent(int money) {
        totalMoneyEarned = totalMoneyEarned - money;
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static int getNetBalance() {
        return totalMoneyEarned- totalMoneySpent;
    }

}
