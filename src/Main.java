public class Main {
    public static void main(String[] args) {

        User user1 = new User("Smith");
        User user2 = new User("Roy", "roy@gmail.com");
        User user3 = new User("Sarah", "sarah@gmail.com", 27);
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }

}