import java.util.Scanner;

public class RandomTests {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=======DICE ROLL=======");
        System.out.print("Entry with the number of sides: ");
        int diceFaces = sc.nextInt();

        System.out.print("How many times will be play? ");
        int diceTimes = sc.nextInt();

        int odd = 0;
        int even = 0;
        int total = 0;
        for (int i = 1; i <= diceTimes; i++) {
            int dicePlayed = dice(diceFaces);
            System.out.println(i+ "ª time = " + dicePlayed );
            if (dicePlayed % 2 == 0) {
                odd++;
            } else {
                even++;
            }
            total += dicePlayed;
        }
        System.out.println("\nLuck = " + (int)total/diceTimes);
        System.out.println("Odd times = "+odd + " / Even times = " + even);
    }

    public static int dice(int max) {
        return (int) (Math.random() * (max - 2) + 1);
    }
}

