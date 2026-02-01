public class Main {
    public static void main(String[] args) {

        String[][] groceries = {{"apple", "orange", "banana"},
                               {"potato", "onion", "carrot"},
                               {"chicken", "pork", "beef", "fish"}};

        groceries[1][0] = "celery";

        for (String[] foods : groceries) {
            for (String food: foods) {
                System.out.print(food + " ");
            }
            System.out.println();

        }

    }
}