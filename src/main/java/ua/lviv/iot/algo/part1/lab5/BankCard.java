package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankCard {
    public static final Pattern BANK_NUMBER = Pattern.compile("\\b\\d{4}\\s*\\d{4}\\s*\\d{4}\\s*\\d{4}\\b");

    public String removeBankCardFrom(final String text, final String bankCode) {
        Matcher matcher = BANK_NUMBER.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String cardNumber = matcher.group();
            if (cardNumber.startsWith(bankCode)) {
                matcher.appendReplacement(result, "");
            }
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
