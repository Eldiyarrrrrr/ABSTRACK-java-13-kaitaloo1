import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        Educatioincenter school = new School("Eldiyar", "Bishkek", LocalDate.of(2002, 4, 12));
        Educatioincenter kollage = new University("beka", "kygyzstan", LocalDate.of(2003, 5, 23));
        Educatioincenter university = new College("zarip", "chui", LocalDate.of(2001, 3, 23));


        Student student1 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), school);
        Student student2 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), kollage);
        Student student3 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), kollage);
        Student student4 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), school);
        Student student5 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), university);
        Student student6 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), university);
        Student student7 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), school);
        Student student8 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), university);
        Student student9 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), school);
        Student student10 = new Student("name", "surname", 'm', LocalDate.of(2003, 2, 23), kollage);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        getInfo(students);
    }

    public static void getInfo(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}