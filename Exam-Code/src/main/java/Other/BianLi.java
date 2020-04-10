package Other;

public class BianLi {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int three = i % 3;
            int five = i % 5;
            if (three == 0) {
                System.out.print("fizz");
            }
            if (five == 0) {
                System.out.print("buzz");
            }
            if (three != 0 && five != 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
