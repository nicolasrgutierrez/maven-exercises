package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: \"%s\"\n", userInput);
        if(StringUtils.isNumeric(userInput)) {
            System.out.printf("\"%s\" is a number!\n", userInput);
        }else {
            System.out.printf("\"%s\" is not a number!\n", userInput);
        }
//        char[] charArray = userInput.toCharArray();
//        for(int i=0; i < charArray.length; i++) {
//            if (Character.isUpperCase(charArray[i])) {
//                charArray[i] = Character.toLowerCase(charArray[i]);
//            } else if(Character.isLowerCase(charArray[i])) {
//                charArray[i] = Character.toUpperCase(charArray[i]);
//            }
//        }
//        String newUserInput = new String(charArray);
//
//        System.out.println(newUserInput);//StringUtils.swapCase

        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
