import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phoneNumber;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            String input = scanner.nextLine();
            String[] data = input.split(" ");

            students[i] = new Student();

            students[i].setStudentId(Integer.parseInt(data[0]));
            students[i].setName(data[1]);
            students[i].setMajor(data[2]);
            students[i].setPhoneNumber(Long.parseLong(data[3]));
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            String phone = Long.toString(students[i].getPhoneNumber());

            phone = "0" + phone;

            phone = phone.substring(0, 3) + "-"
                    + phone.substring(3, 7) + "-"
                    + phone.substring(7);

            System.out.println(
                (i + 1) + "번째 학생: "
                + students[i].getStudentId() + " "
                + students[i].getName() + " "
                + students[i].getMajor() + " "
                + phone
            );
        }

        scanner.close();
    }
}