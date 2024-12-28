package jichenganli;

public class Test {
    public static void main(String[] args) {
        Coder co=new Coder("张三",23,15000);
        Manager ma=new Manager("李四",24,18000,5000);
        co.work();
        ma.work();
    }
}
