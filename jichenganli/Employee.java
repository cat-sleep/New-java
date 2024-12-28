package jichenganli;



public class Employee {
    private String name;
    private int age;
    private double money;

    public Employee() {
    }

    public Employee(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void work(){
        System.out.println("员工工作... ");
    }
}
