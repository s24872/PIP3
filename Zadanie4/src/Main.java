import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cena = 10;

        System.out.println("Cena towaru wynosi "+cena+" zł.");
        System.out.print("Podaj liczbę sztuk zakupionego towaru: ");
        int liczbaTowaru = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Czy jest promocja (tak/nie)?: ");
        String odpowiedz = scanner.nextLine();

        double cenaOstateczna = obliczCeneProduktu(cena, liczbaTowaru, odpowiedz.equals("tak"));
        System.out.println("Cena ostateczna: " + cenaOstateczna + " zł");
    }

    public static double obliczCeneProduktu(int cena, int liczbaTowaru, boolean czyPromocja){
        if(czyPromocja)
        {
            if (liczbaTowaru <= 10)
            {
                return cena;
            }
            else
            {
                return cena/2.0;
            }
        }
        else
        {
            return (cena + cena * 0.1);
        }
    }
}