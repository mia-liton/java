public class Main {
    public static void main(String[] args) {

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product2.getItem());

    }

}