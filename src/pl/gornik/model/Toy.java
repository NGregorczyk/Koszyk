package pl.gornik.model;

public class Toy extends Product{

int minimalnyWiek;
    public Toy(String tytul, int liczbaSztuk, double cena) {
        super(tytul, liczbaSztuk, cena);
    }
    public Toy(String tytuł, int liczbaSztuk, double cena,int minimalnyWiek) {
        super(tytuł, liczbaSztuk, cena);
        this.minimalnyWiek=minimalnyWiek;
    }

    public String toString() {
        return "Book{" +
                "minimalnyWiek='" + minimalnyWiek+ '\'' +
                "tytuł='" + super.getTytul() + '\'' +
                ", liczbaSztuk=" + super.getLiczbaSztuk() +
                ", cena=" + super.getCena()+
                '}';
    }
}
