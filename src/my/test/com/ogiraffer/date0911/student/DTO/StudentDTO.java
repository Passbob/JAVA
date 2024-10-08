package my.test.com.ogiraffer.date0911.student.DTO;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public StudentDTO(){}
    public StudentDTO(int grade, int classroom, String name, double height, char gender){
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public void printInformation(){
        System.out.println("학년 : "+grade);
        System.out.println("반 : "+classroom);
        System.out.println("이름 : "+name);
        System.out.println("키 : "+height);
        System.out.println("성별 : "+gender);
    }

}
