public class Main {
    public static void main(String[] args) {

        String name = "Bro Code";

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf("o");

//        name = name.toUpperCase();
//        name = name.toLowerCase();

//        if (name.isEmpty()) {
//            System.out.println("Your name is empty");
//        }
//        else {
//            System.out.println("Hello, " + name);
//        }

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello, " + name);
        }

    }
}