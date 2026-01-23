public class Main {
    public static void main(String[] args) {

        int income = 30000;

        double taxRate = (income >= 40000) ? 0.5 : 0.15;

        System.out.println(taxRate);

    }
}