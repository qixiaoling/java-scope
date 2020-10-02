package nl.novi.javaprogrammeren.extra;
import java.util.List;
import java.util.ArrayList;

public class exercises {
   /* Op de auto verkoopbeurs hebben we verschillende verkopers met verschillende auto's.
   Van de verkopers willen we de
    bedrijfsnaam, telefoonnummers, website en btw-nummer registreren. De verkopers
     kunnen meerdere auto's verkopen.

    Van de auto's willen we het bouwjaar, merk, soort, kenteken en aantal gereden kilometers registreren.
    Daarnaast heeft elke auto een vraagprijs en willen we de uiteindelijke verkoopprijs registreren.
     De prijzen die we registreren zijn ex Btw.

    Maak bovenstaande klasse aan.

    Voeg aan de klasse auto twee methodes toes: askPriceVatInclusive() en sellPriceVatInclusive()
    en laat deze de vraag- en verkoopprijs inclusief btw terugggeven.

    Maak een vijftal verkopers aan. Geeft elke verkoper 2-10 auto's. Druk van elke verkoper zijn auto's af.
     Het netste is om dit in een toString() methode te doen in Verkoper!*/

    public static void main(String[] args) {
        List<Auto> carsOne=new ArrayList();
        Auto carOne_1=new Auto("2000", "BMW", "111", "abc", 100, 20000.00, 19000.00);
        Auto carOne_2=new Auto("1996", "Mazda", "222", "eid", 100, 20000.00, 19000.00);
        Auto carOne_3=new Auto("2000", "Audi", "333", "tss", 100, 20000.00, 19000.00);
        Auto carOne_4=new Auto("2005", "Fiat", "444", "uyt", 100, 20000.00, 19000.00);
        Auto carOne_5=new Auto("2000", "Volkswagen", "555", "222", 100, 20000.00, 19000.00);
        carsOne.add(carOne_1);
        carsOne.add(carOne_2);
        carsOne.add(carOne_3);

        Verkoper sellerOne= new Verkoper("sellOne", "111", "www.sellOne.com", "11111",carsOne);
        System.out.println(sellerOne.toString());
    }

}
