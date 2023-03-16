package chapter1;

public enum Language {
    HY("Armienia"),
    ENG,
    RU("Russia"),
    FR("France");
    private String country;

    Language(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    Language() {
    }
}



