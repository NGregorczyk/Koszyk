package pl.gornik.model;

public class Book extends   Product{
   private String autor;

    public Book(String tytul, int liczbaSztuk, double cena) {
        super(tytul, liczbaSztuk, cena);
    }
    public Book(String tytuł, int liczbaSztuk, double cena,String autor) {
        super(tytuł, liczbaSztuk, cena);
        this.autor=autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                "tytuł='" + super.getTytul() + '\'' +
                ", liczbaSztuk=" + super.getLiczbaSztuk() +
                ", cena=" + super.getCena()+
                '}';
    }
}
