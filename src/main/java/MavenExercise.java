import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        String userInput = sc.nextLine();
        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println("enter a string to have its cases flipped!");
        userInput = sc.nextLine();
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
