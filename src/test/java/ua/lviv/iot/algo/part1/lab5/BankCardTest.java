package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankCardTest {
    @ParameterizedTest
    @CsvSource({
            "1111 1111 1111 1111 and 1111111111111111 and 2222 2222 2222 2222 and 1111 1111  11111111, '', ' and  and  and '",
            "1111 1111 1111 1111 and 1111111111111111 and 2222 2222 2222 2222 and 1111 1111  11111111, 1111, ' and  and 2222 2222 2222 2222 and '",
            "111 1111 1111 1111 and 1111111111111111 and 2222 2222 2222 2222 and 1111 1111  11111111, 2222, 111 1111 1111 1111 and 1111111111111111 and  and 1111 1111  11111111",
            "111 1111 1111 1111 and 1111111111111111 and 2222 2222 2222 2222 and 1111 1111  11111111, 3333, 111 1111 1111 1111 and 1111111111111111 and 2222 2222 2222 2222 and 1111 1111  11111111",
            "'', 1111, ''",
            "'', '', ''"
    })
    public void testBankCode(String text, String bankCode, String expected) {
        BankCard bankCard = new BankCard();
        StringBuilder result = bankCard.bankCode(text, bankCode);
        Assertions.assertEquals(expected, result != null ? result.toString() : null);
    }
}