package pl.gornik.model;

public class Disc extends Product {
private String wykonawca;

    public Disc(String tytul, int liczbaSztuk, double cena) {
        super(tytul, liczbaSztuk, cena);
    }
    public Disc(String tytuł, int liczbaSztuk, double cena, String wykonawca) {
        super(tytuł, liczbaSztuk, cena);
        this.wykonawca=wykonawca;
    }



    public String toString() {
        return "Book{" +
                "wykonawca='" + wykonawca+ '\'' +
                "tytuł='" + super.getTytul() + '\'' +
                ", liczbaSztuk=" + super.getLiczbaSztuk() +
                ", cena=" + super.getCena()+
                '}';
    }
}


