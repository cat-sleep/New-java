package jichenganli;

import supers.City;

public class Coder extends Employee{

    public Coder() {
    }

    public Coder(String name,int age,double money){
        super(name,age,money);
    }
    public void work(){
        System.out.println("姓名为"+super.getName()+","+"年龄为"+super.getAge()+","
                +"工资为"+super.getMoney()+"的程序员正在编写代码");
    }
}
