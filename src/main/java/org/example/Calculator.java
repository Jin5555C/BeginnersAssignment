package org.example;
import java.util.Scanner;

import static org.example.InputUtil.readDouble;
import static org.example.InputUtil.readOperator;

public class Calculator {
  public static void runCalculator() {
    Scanner scanner = new Scanner(System.in);

    double num1 = readDouble(scanner, "1つ目の数値を入力してください: ");
    char operator = readOperator(scanner, "演算子を入力してください (+, -, *, /): ");
    double num2 = readDouble(scanner, "2つ目の数値を入力してください: ");

    double result = 0;
    boolean valid = true;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("エラー: 0で割ることはできません。");
          valid = false;
        }
        break;
      default:
        valid = false;
    }

    if (valid){
      System.out.println("結果: " + num1  + " " + operator + " "  + num2 + " = "+ result);
    }
//    scanner.close();
  }
}
