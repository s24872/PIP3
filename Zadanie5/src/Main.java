import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Napisz program, który po wczytaniu tytułów i długości trwania dwóch utworów muzycznych (w minutach i sekundach) wyświetla najpierw informację o krótszym, a następnie o dłuższym utworze oraz podaje łączny czas trwania tych utworów.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tytuł pierwszego utworu: ");
        String tytul1 = scanner.nextLine();
        System.out.print("Podaj czas trwania pierwszego utworu (minuty) : ");
        int minuty1 = scanner.nextInt();
        System.out.print ("Podaj czas trwania pierwszego utworu (sekundy) : ");
        int sekundy1 = scanner.nextInt();

        scanner.nextLine();
        System.out.print("\nPodaj tytuł drugiego utworu: ");
        String tytul2 = scanner.nextLine();
        System.out.print("Podaj czas trwania pierwszego utworu (minuty) : ");
        int minuty2 = scanner.nextInt();
        System.out.print("Podaj czas trwania pierwszego utworu (sekundy) : ");
        int sekundy2 = scanner.nextInt();

        System.out.println("------------------------------------------------");
        int dlugoscUtworu1 = minuty1*60+sekundy1;
        int dlugoscUtworu2 = minuty2*60+sekundy2;

        System.out.println("UTWORY: ");


        if(dlugoscUtworu1 <= dlugoscUtworu2)
        {
            System.out.println("1. " + tytul1 + " " + getCzas(minuty1, sekundy1));
            System.out.println("2. " + tytul2 +" "+ getCzas(minuty2, sekundy2));
        }
        else
        {
            System.out.println("1. " + tytul2 + " " + getCzas(minuty2, sekundy2));
            System.out.println("2. " + tytul1 + " " + getCzas(minuty1, sekundy1));
        }

        int czasTrwania = dlugoscUtworu1 + dlugoscUtworu2;
        int czasTrwaniaMinuty = czasTrwania / 60;
        int czasTrwaniaSekundy = czasTrwania % 60;
        System.out.println("LACZNY CZAS TRWANIA: " + getCzas(czasTrwaniaMinuty, czasTrwaniaSekundy));
        System.out.println("------------------------------------------------");
    }

    public static String getCzas(int minuty, int sekundy){
        return minuty +":"+(sekundy>=10?sekundy:"0"+sekundy);
    }
}
