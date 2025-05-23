package org.example;


import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidator {

    private static final Pattern MOBILE_PATTERN =
            Pattern.compile("^(070|080|090|050)-\\d{4}-\\d{4}$");

    public static boolean isValidMobileNumber(String number) {
        return MOBILE_PATTERN.matcher(number).matches();
    }

    public static void runMobileValidator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("携帯電話番号を入力してください（例: 090-1234-5678）：");
        String input = scanner.nextLine();

        if (isValidMobileNumber(input)) {
            System.out.println("有効な携帯電話番号です。");
        } else {
            System.out.println("無効な携帯電話番号です。");
        }

//        scanner.close();
    }
}
