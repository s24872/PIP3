import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Napisz program, który po wczytaniu roku wyświetla informację, czy ten rok jest przestępny czy nie. Wiem, że bywasz roztargniony, więc przypominam: rok (jako liczba) jest przestępny wówczas, gdy jest podzielny przez cztery, ale nie dzieli się przez 100, chyba że dzieli się przez czterysta. Kalendarz, w którym istnieją lata przestępne, nazywany jest gregoriańskim. Został on wprowadzony w Polsce w 1582 roku.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        if(czyRokJestPrzestepny(rok)) {
            System.out.print("Podany rok jest przystępny.");
        } else {
            System.out.print("Podany rok nie jest przystępny.");
        }
    }
    public static boolean czyRokJestPrzestepny(int rok) {

        return (rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0;
    }
}