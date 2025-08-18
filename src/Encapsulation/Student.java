package Encapsulation;

public class Student {
    //id name email phone

    private int studentId;
    private String studentName;

    public Student() {
    }

    public int getId() {
        return studentId;

    }

    public void setId(int id) {
        studentId = id;

    }

    public String getName() {
        return studentName;

    }

    public void setName(String studentName) {
        this.studentName = studentName;

    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "studentId=" + studentId +
//                ", studentName='" + studentName + '\'' +
//                '}';
//    }


//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + studentId +
//                ", Name=" + studentName +
//                "}";
//    }


    public String toString() {
        return "Student{id=" + studentId + ",name=" + studentName + "}";
    }


    public static void main(String[] args) {
        Student std = new Student();
        std.setId(123);
        std.setName("Amol");

        System.out.println(std);
    }
}
