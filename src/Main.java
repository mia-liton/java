public class Main {
    public static void main(String[] args) {

        int age = 14;
        int year = 2026;
        int quantity = 1;

        double price = 19425.32;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Bro Code";
        String food = "pizza";
        String email = "litonmioa@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car + " for sale");

        }
        else {
            System.out.println("The " + car + " is not for sale");
        }
    }
}
