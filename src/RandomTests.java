import java.util.Scanner;

public class RandomTests {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entre com a qntidade de lados do dado: ");
        int diceFaces = sc.nextInt();
        System.out.println("Quantas vezes o dado será jogado?");
        int diceTimes = sc.nextInt();
        for (int i = 1; i <= diceTimes; i++) {
            System.out.println(i+ "ª jogada = " + dice(diceFaces));
        }
    }

    public static int dice(int max) {
        return (int) (Math.random() * (max - 2) + 1);
    }
}

