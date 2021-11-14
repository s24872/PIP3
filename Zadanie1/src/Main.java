import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Napisz program, który wyświetla informację o studentce/studencie, uwzględniając jej/jego płeć.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Podaj płeć (kobieta/mężczyzna): ");
        String plec = scanner.nextLine();

        daneOsobowe(imie, nazwisko,plec);
    }

    public static void daneOsobowe (String imie, String nazwisko,String plec) {
        String napis = "Student";

        if (plec.equals("mężczyzna"))
        {
            napis = "Student";
        }
        else if (plec.equals("kobieta"))
        {
            napis = "Studentka";
        }

        System.out.print("\n" + napis + ": " + imie + " " + nazwisko);
    }
}