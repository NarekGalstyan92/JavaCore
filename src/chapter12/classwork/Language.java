package chapter12.classwork;

public enum Language {
    HY("Armenia"),
    ENG("USA"),
    RU("Russia"),
    CH;


    private String country;
    Language(String country) {
        this.country = country;
    }
    Language(){

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
