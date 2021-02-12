import java.util.Scanner;

public class patternprinting {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int middleindex = getMiddleCharcterIndex(input);
        String substring = input.substring(middleindex);
        String first = input.substring(0, middleindex);
        String newString = substring.concat(first);
        printPattern(newString);
    }

    static int getMiddleCharcterIndex(String input) {
        int len = input.length();
        int middle = len / 2;
        return middle;
    }

    static void printPattern(String input) {
        int length = input.length();
        char c[] = input.toCharArray();
        int row = length;
        for (int i = 0; i < row; i++) {
            for (int j = 2 * (row - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}
