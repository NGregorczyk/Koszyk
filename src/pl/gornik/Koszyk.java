package pl.gornik;

import pl.gornik.model.Book;
import pl.gornik.model.Disc;
import pl.gornik.model.Product;
import pl.gornik.model.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koszyk {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Product> starSklepu = new ArrayList<>();
        List<Product> koszyk = new ArrayList<>();

        Book book2 = new Book("Ksiazka", 5, 55, "autor1");
        Book book1 = new Book("Podrecznik", 2, 5, "autor2");


        Disc disc1 = new Disc("Plyta", 3, 35, "wykonawca1");
        Disc disc2 = new Disc("Dysk", 5, 50, "wykonawca2");

        Toy toy1 = new Toy("Zabawka", 3, 35, 4);
        Toy toy2 = new Toy("Klocki", 6, 55, 10);


        starSklepu.add(book1);
        starSklepu.add(book2);
        starSklepu.add(disc1);
        starSklepu.add(disc2);
        starSklepu.add(toy1);
        starSklepu.add(toy2);


        System.out.println("Dostępne produkty:");

        for (Product product : starSklepu) {
            System.out.println(product);
        }

        while (true) {
            System.out.println("Wpisz produkt lub 'koniec' aby zakończyć:");
            String choice = scanner.nextLine();

            if (choice.equals("koniec")) {
                break;
            }


            for (int i = 0; i < starSklepu.size(); i++) {
                Product sklep = starSklepu.get(i);

                if (sklep.getTytul().equalsIgnoreCase(choice)) {
                    System.out.println("Podaj ilość " + sklep.getTytul() + " do dodania:");
                    int ilosc = scanner.nextInt();
                    scanner.nextLine();

                    if (ilosc > 0 && ilosc <= sklep.getLiczbaSztuk()) {

                        Product selectedProduct = new Product(sklep);
                        selectedProduct.setLiczbaSztuk(ilosc);

                        koszyk.add(selectedProduct);
                        System.out.println(sklep.getTytul() + " dodano do koszyka");

                        sklep.setLiczbaSztuk(sklep.getLiczbaSztuk() - ilosc);

                        if (sklep.getLiczbaSztuk() == 0) {
                            starSklepu.remove(i);
                        }

                        break;
                    } else {
                        System.out.println("Zła ilość");
                    }
                }
            }
        }

        double basket = 0;
        System.out.println("Twój koszyk zawiera:");

        for (Product prod : koszyk) {
            System.out.println(prod.getTytul() + " cena: " + prod.getCena() + " ilość: " + prod.getLiczbaSztuk());
            basket += prod.countPrice();

        }
        System.out.println("cena twojego koszyka" + basket);

        System.out.println("------------------------------------------------");
        double x = 0;
        System.out.println("Sklep zawiera");
        for (Product p : starSklepu) {
            System.out.println(p.getTytul() + " cena: " + p.getCena() + " ilość: " + p.getLiczbaSztuk());
            x += p.countPrice();
        }
        System.out.println("cena sklepu " + x);

    }

}


