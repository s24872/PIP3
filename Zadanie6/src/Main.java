import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadanie dla wielbicieli umiarkowanej matematyki. Napisz program, który po wczytaniu trzech liczb określających długości trzech odcinków wyświetla informację, czy z tych odcinków da się zbudować trójkąt. Jeśli okaże się to możliwe, to informuje również, czy jest to trójkąt równoboczny, równoramienny czy prostokątny.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość piewrszego odcinka: ");
        int a = scanner.nextInt();
        System.out.print("Podaj długość drugiego odcinka: ");
        int b = scanner.nextInt();
        System.out.print("Podaj długość trzeciego odcinka: ");
        int c = scanner.nextInt();

        if (czyTrojkat(a, b, c)) {
            System.out.println("Da się zbudować trójkąt.");
            System.out.println("Rodzaj trójkąta: " + rodzajTrojkata(a, b, c));
        } else {
            System.out.println("Nie da się zbudować trójkąta.");
        }
    }

    public static boolean czyTrojkat(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static String rodzajTrojkata(int a, int b, int c) {
        if (a == b && b == c) {
            return "równoboczny";
        } else if (a == b || b == c || c == a ) {
            return "równoramienny";
        } else if (czyProstokatny(a,b,c)) {
            return "prostokątny";
        } else {
            return "zwykły";


        }
    }

    public static boolean czyProstokatny(int a, int b, int c) {
        boolean zestaw1 = Math.pow(a,2) + Math.pow(b,2)==Math.pow(c,2);
        boolean zestaw2 = Math.pow(a,2) + Math.pow(c,2)==Math.pow(b,2);
        boolean zestaw3 = Math.pow(c,2 )+ Math.pow(b,2)==Math.pow(a,2);

        return zestaw1 || zestaw2 || zestaw3 ;




            }

        }

