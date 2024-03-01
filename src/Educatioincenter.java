import java.time.LocalDate;

public abstract class Educatioincenter {
    private String name;
    private String locatedcountry;
    private LocalDate localdateFountationyear;




    public Educatioincenter(String name, String locatedcountry, LocalDate localdateFountationyear) {
        this.name = name;
        this.locatedcountry = locatedcountry;
        this.localdateFountationyear = localdateFountationyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedcountry() {
        return locatedcountry;
    }

    public void setLocatedcountry(String locatedcountry) {
        this.locatedcountry = locatedcountry;
    }

    public LocalDate getLocaldateFountationyear() {
        return localdateFountationyear;
    }

    public void setLocaldateFountationyear(LocalDate localdateFountationyear) {
        this.localdateFountationyear = localdateFountationyear;
    }

    @Override
    public String toString() {
        return "Educatioincenter{" +
                "name='" + name + '\'' +
                ", locatedcountry='" + locatedcountry + '\'' +
                ", localdateFountationyear=" + localdateFountationyear +
                '}';
    }
}
