package jichenganli;

public class Manager extends Employee{
    private double Bonus;

    public Manager() {
    }
    public Manager(String name,int age,double money,double bonus){
        super(name,age,money);
        this.Bonus=bonus;
    }


    public double getBonus() {
        return Bonus;
    }

    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }
    public void work(){
        System.out.println("姓名为"+super.getName()+","+"年龄为"+super.getAge()+","+"工资为"+super.getMoney()+","
        +"奖金为"+this.Bonus+"的项目经理正在分配任务");
    }
}
