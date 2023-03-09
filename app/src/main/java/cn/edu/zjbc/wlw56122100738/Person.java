package cn.edu.zjbc.wlw56122100738;

public class Person {
    private String name;
    private String sex;

    private static int numberOfPeople = 0;
    public static int getNumberOfPeople(){
        return numberOfPeople;
    }

    public Person(String inputName, String inputSex){
        numberOfPeople++;
        name = inputName;
        sex = inputSex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
