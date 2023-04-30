package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class BankCard {
    public StringBuilder bankCode(String text, String bankCode) {
        if (text == null) {
            return null;
        }
        Pattern pattern = Pattern.compile("\\b\\d{4}\\s*\\d{4}\\s*\\d{4}\\s*\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String cardNumber = matcher.group();
            if (cardNumber.startsWith(bankCode)) {
                matcher.appendReplacement(result, "");
            }
        }
        matcher.appendTail(result);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        BankCard bankCard = new BankCard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        System.out.println("Enter a bank code: ");
        String bankCode = scanner.nextLine();
        bankCard.bankCode(text, bankCode);
        scanner.close();
    }
}

