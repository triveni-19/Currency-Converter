import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to the currency converter!");

        double result;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter the amount in rupees: ");
            double rupees=sc.nextDouble();
            System.out.println("Choose the currency type to convert");
            System.out.println("1.Dollars  2. Euro  3.British Pound  4.Japanese Yen  5.Bahrain Dinar");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    result = rupees / 82.516;
                    System.out.println("Rupees in dollar = " + result);
                    break;

                case 2:
                    result = rupees / 89.628;
                    System.out.println("Rupees in Euro = " + result);
                    break;

                case 3:
                    result = rupees / 104.772;
                    System.out.println("Rupees in British Pound = " + result);
                    break;

                case 4:
                    result = rupees / 0.567;
                    System.out.println("Rupees in Japanese Yen = " + result);
                    break;

                case 5:
                    result = rupees / 219.447;
                    System.out.println("Rupees in Bahrain Dinar = " + result);
                    break;

                default:
                    System.out.println("Invalid Choice");

            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input --> "+e);
        }
    }
}