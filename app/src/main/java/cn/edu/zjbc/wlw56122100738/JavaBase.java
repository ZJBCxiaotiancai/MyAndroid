package cn.edu.zjbc.wlw56122100738;

public class JavaBase {
    public static void main(String[] args) {
        Person p1 = new Person("小明","男");
        Person p2 = new Person("小红","女");
        p1.setName("丁真");
        CollegeStudent s1 = new CollegeStudent("李华","男","物联网",100);
        System.out.println("p1Name:"+p1.getName());
        System.out.println(s1.getName()+":"+s1.getMajor());
        System.out.println(Person.getNumberOfPeople());
        System.out.println(CollegeStudent.getNumberOfCollegeStudent());
        System.out.println("getTotalScore:"+s1.getTotalScore());
    }
}
