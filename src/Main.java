import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int colNumber;
        int[][] arr = {{1,2,3}, {4,5,6,1}, {7,8}};
        int sum = 0;

        System.out.println("Enter the column number you wanna take sum");
        colNumber = sc.nextInt();
        while (colNumber < 1 || colNumber > 3) {
            System.out.println("Wrong column. Enter again:");
            colNumber = sc.nextInt();
        }
        System.out.println("You wanna take sum of the numbers in column " + colNumber);
        for (int i = 0; i < arr[colNumber - 1].length; i++) {
            sum += arr[colNumber - 1][i];
        }
        System.out.println("The sum of the elements in column " + colNumber + " is: " + sum);
    }
}