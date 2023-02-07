package be.intecbrussel;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.Collectors;
public class MainApp {
    public static void main(String[] args) {
        //Opdrachten voormiddag

        /* Opdracht 1

        - Maak een Random generator en vraag verschillende integers op.
        - Zorg ervoor at je alleen maar getallen kunt genereren tussen 0 en 99.
        - Maak nu een applicatie die maar 6 getallen opvraagt.

         */

        Random random = new Random();

        List<Integer> integerList = new Random().ints(6, 0, 99).boxed().collect(Collectors.toList());
        System.out.println(integerList);

        /* Opdracht 3

        Maak een nieuwe Scanner die een String opvraagt.
        Maak nu een programma dat het volgende doet:
        - druk de tekst af in grote letters.
        - druk de tekst af in kleine letters
        - Vervang alle ‘e’ door ‘u’
        - Druk af hoeveel keer de letter ‘r’ in je String voorkomt.(een beetje moeilijk, wees creatief ;) )
        - Maak twee strings en vergelijk ze met elkaar met een String methode.
        - Vergelijk twee Strings alfabetisch, en druk ze allebei  af. De String die eerst alfabetisch komt, moet eerst afgedrukt worden.
        - Maak een string met extra spaties vooraan en achteraan. Druk de string dan af zonder de spaties.

         */

        System.out.println("Your text: ");
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        //- druk de tekst af in grote letters

        System.out.println(text.toUpperCase());

        //- druk de tekst af in kleine letters

        System.out.println(text.toLowerCase());

        //- Vervang alle ‘e’ door ‘u’

        System.out.println(text.replace('e', 'u'));

        //- Druk af hoeveel keer de letter ‘r’ in je String voorkomt.

        char ch = 'r';

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                counter++;
            }
        }
        System.out.println(counter);

        //- Maak een string met extra spaties vooraan en achteraan. Druk de string dan af zonder de spaties.

        System.out.println(text.strip());

        //- Vergelijk twee Strings alfabetisch, en druk ze allebei  af. De String die eerst alfabetisch komt, moet eerst afgedrukt worden.

        String s1 = "orange";
        String s2 = "apple";

        compareStrings(s1, s2);


    }

    private static void compareStrings(String s1, String s2) {
        int compareResult = s1.compareTo(s2);

        if (compareResult > 0) {
            System.out.println(s2 + " " + s1);
        } else if (compareResult < 0) {
            System.out.println(s1 + " " + s2);
        } else {
            System.out.println(s1 + " is equal to " + s2);
        }

        //- Maak twee strings en vergelijk ze met elkaar met een String methode.

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


        /*
        Opdracht 4

        Bekijk de documentatie van StringBuilder (https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html )
        - Maak een programma dat twee Strings opvraagt met Stringbuilder
        - Aan de eerste Stringbuilder voeg je extra tekst toe
        - Van de tweede Stringbuilder draai je de tekst om
        - Verwijder alle spaties van de eerste Stringbuilder
        - Verdubbel iedere letter ‘t’ in de tweede Stringbuilder
        - Verwijder bij de 2de StringBuilder 2 woorden.

         */

        //- Maak een programma dat twee Strings opvraagt met Stringbuilder

        Scanner myScanner = new Scanner(System.in);

        StringBuilder stringBuilder;
        StringBuilder stringBuilder_2;

        System.out.println("Your text 1: ");
        stringBuilder = new StringBuilder(myScanner.nextLine());

        //- Aan de eerste Stringbuilder voeg je extra tekst toe

        stringBuilder.append(" extra tekst ");
        System.out.println(stringBuilder);

        System.out.println("Your text 2: ");

        stringBuilder_2 = new StringBuilder(myScanner.nextLine());

        //- Van de tweede Stringbuilder draai je de tekst om
        System.out.println(stringBuilder_2.reverse());

        //- Verdubbel iedere letter ‘t’ in de tweede Stringbuilder

        StringBuilder sb2 = new StringBuilder(stringBuilder_2);
        int i = 0;
        while (i < sb2.length()) {
            if (sb2.charAt(i) == 't') {
                sb2.insert(i + 1, 't');
                i += 2;
            } else {
                i++;
            }
        }
        System.out.println(sb2);

        // - Verwijder alle spaties van de eerste Stringbuilder

        for (int index = 0; index < stringBuilder_2.length(); index++) {
            if (stringBuilder_2.charAt(index) == ' ') {
                stringBuilder_2.delete(index, index + 1);

            }
        }

        System.out.println(stringBuilder_2);


       /*Opdracht 5
       Maak een programma dat de eenheid ‘meter’ omzet naar de eenheid ‘voet’.
       Toon de waarden van 1 meter tot en met 20 meter (je doet telkens +0.5meter).
       Je mag maar twee cijfers na de komma hebben, en alle getallen moeten mooi naast elkaar gaan.
       Je gaat hier formatting voor moeten gebruiken.

        */

        System.out.println("Meter\tFeet");

        for (double meter = 1.0; meter < 20.0; meter += 0.5) {

            double feet = meter * 3.28;

            System.out.printf("%.2f\t\t%.2f\n", meter, feet);

        }
    }
}
