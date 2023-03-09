package cn.edu.zjbc.wlw56122100738;

public class CollegeStudent extends Person implements Test{
    private String major;
    private Integer score;

    private static int numberOfCollegeStudent = 0;

    public CollegeStudent(String inputName,String inputSex,String inputMajor,Integer inputScore){
        super(inputName,inputSex);
        major = inputMajor;
        score = inputScore;

        numberOfCollegeStudent++;

    }
    public static int getNumberOfCollegeStudent(){
        return numberOfCollegeStudent;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public Integer getScore() {
        return score;
    }
    public int getTotalScore() {
        return score;
    }
}
