import java.util.Scanner;

public class PrintYourNameAndSurname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert your name: ");
        String name = scan.nextLine();

        System.out.print("Insert your name: ");
        String surname = scan.nextLine();

        System.out.println(name);
        System.out.println(surname);
    }
}
