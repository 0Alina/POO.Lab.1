// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
            public static void main(String[] args) {
                // Declarați variabile
                int numar = 10;
                String nume = "John";

                // Utilizați o condiție
                if (numar > 5) {
                    System.out.println("Numărul este mai mare decât 5.");
                } else {
                    System.out.println("Numărul nu este mai mare decât 5.");
                }

                // Declarați și utilizați o listă
                List<String> listaNume = new ArrayList<>();
                listaNume.add("Alice");
                listaNume.add("Bob");
                listaNume.add("Charlie");

                // Utilizați un stream pentru a filtra elementele din listă
                List<String> rezultatFiltrat = listaNume.stream()
                        .filter(n -> n.length() > 4)
                        .collect(Collectors.toList());

                System.out.println("Numele cu lungimea mai mare de 4 caractere: " + rezultatFiltrat);

                try {
                    // Aruncați o excepție
                    int rezultat = 5 / 0; // Aruncați o excepție de divizare la zero
                } catch (ArithmeticException e) {
                    System.out.println("A apărut o excepție: " + e.getMessage());
                }
            }
        }