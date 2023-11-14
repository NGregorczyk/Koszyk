package pl.gornik.model;

public class Product{
private String tytul;
private int liczbaSztuk;
private double cena;

public Product(String tytul, int liczbaSztuk, double cena) {
        this.tytul = tytul;
        this.liczbaSztuk = liczbaSztuk;
        this.cena = cena;
        }

// Copy constructor
public Product(Product other) {
        this.tytul = other.tytul;
        this.liczbaSztuk = other.liczbaSztuk;
        this.cena = other.cena;
        }

public String displayProduct() {
        return "Product{" +
        "tytuł='" + tytul + '\'' +
        ", liczbaSztuk=" + liczbaSztuk +
        ", cena=" + cena +
        '}';
        }

public double countPrice() {
        return liczbaSztuk * cena;
        }

public String getTytul() {
        return tytul;
        }

public void setTytul(String tytul) {
        this.tytul = tytul;
        }

public int getLiczbaSztuk() {
        return liczbaSztuk;
        }

public void setLiczbaSztuk(int liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
        }

public double getCena() {
        return cena;
        }

public void setCena(double cena) {
        this.cena = cena;
        }
        }