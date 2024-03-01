import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private char gender;
    private LocalDate localDateEducationcenter;
    private Educatioincenter educationcenter;

    public Student(String name, String surname, char gender, LocalDate localDateEducationcenter, Educatioincenter educationcenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.localDateEducationcenter = localDateEducationcenter;
        this.educationcenter = educationcenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", localDateEducationcenter=" + localDateEducationcenter +
                ", educationcenter=" + educationcenter +
                '}';
    }
}
