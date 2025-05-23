package org.example;

import java.util.Scanner;

public class CombinedMain {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Command-line argument driven
            String programToRun = args[0].toLowerCase();
            switch (programToRun) {
                case "calculator":
                    System.out.println("電卓プログラムを実行します...");
                    Calculator.runCalculator();
                    break;
                case "mobile_validator":
                    System.out.println("携帯電話番号検証プログラムを実行します...");
                    MobileNumberValidator.runMobileValidator();
                    break;
                case "student_list":
                    System.out.println("学生リストプログラムを実行します...");
                    StudentList.runStudentList();
                    break;
                default:
                    System.out.println("無効なプログラム名です: " + args[0]);
                    printUsage();
                    break;
            }
        } else {
            runInteractiveMenu();
        }
    }

    private static void runInteractiveMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n実行するプログラムを選択してください:");
            System.out.println("1. 電卓 (Calculator)");
            System.out.println("2. 携帯電話番号検証 (Mobile Number Validator)");
            System.out.println("3. 学生リスト (Student List)");
            System.out.println("4. 終了 (Exit)");
            System.out.print("選択 (1-4): ");

            String choiceStr = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("無効な入力です。1から4の数字を入力してください。");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- 電卓プログラム開始 ---");
                    Calculator.runCalculator();
                    System.out.println("--- 電卓プログラム終了 ---\n");
                    break;
                case 2:
                    System.out.println("\n--- 携帯電話番号検証プログラム開始 ---");
                    MobileNumberValidator.runMobileValidator();
                    System.out.println("--- 携帯電話番号検証プログラム終了 ---\n");
                    break;
                case 3:
                    System.out.println("\n--- 学生リストプログラム開始 ---");
                    StudentList.runStudentList();
                    // StudentList has its own exit message, so no "終了" message here
                    System.out.println("--- 学生リストプログラム終了 (メインメニューに戻ります) ---\n");
                    break;
                case 4:
                    System.out.println("プログラムを終了します。");
                    scanner.close();
                    return;
                default:
                    System.out.println("無効な選択肢です。1から4の数字を入力してください。");
            }
        }
    }

    private static void printUsage() {
        System.out.println("使用方法: java org.example.CombinedMain [プログラム名]");
        System.out.println("利用可能なプログラム名:");
        System.out.println("  calculator         - 電卓プログラムを実行します。");
        System.out.println("  mobile_validator   - 携帯電話番号検証プログラムを実行します。");
        System.out.println("  student_list       - 学生リストプログラムを実行します。");
        System.out.println("引数なしで実行すると、対話型メニューが表示されます。");
    }
}