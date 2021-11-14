import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Napisz program, który po wczytaniu numeru porządkowego miesiąca i roku wyświetla komunikat z informacją, który to kwartał podanego roku.
        Scanner scanner= new Scanner(System.in);

        System.out.print("Podaj miesiąc: ");
        int miesiac = scanner.nextInt();
        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        kwartal(miesiac, rok);
    }

    public static void kwartal(int miesiac, int rok) {
        if (miesiac >=0 && miesiac <=3)
        {
            System.out.print(miesiac+"."+rok+ " to I" +" kwartal " +rok + " roku");
        }
        else if (miesiac>=4 && miesiac<=6)
        {
            System.out.print(miesiac+"."+rok+ " to II" + " kwartal " + rok + " roku");
        }
        else if (miesiac>=7 && miesiac<= 9)
        {
            System.out.print(miesiac+"."+rok+ " to III" + " kwartal " + rok + " roku");
        }
        else if ( miesiac>=10 && miesiac<= 12)
        {
            System.out.print(miesiac+"."+rok+ " to IV" + " kwartal " + rok + " roku");
        }
    }
}