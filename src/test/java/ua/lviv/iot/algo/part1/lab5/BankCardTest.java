package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankCardTest {
    @ParameterizedTest
    @CsvSource({
            "3333 3333 1111 1111 and 1111111111111111 and 2222 2222 2222 2222, '', ' and  and '",
            "1000 1000 1000 1000 and 1111111111111111, 1111, '1000 1000 1000 1000 and '",
            "1111111111111111 and 2222 2222 2222 2222, 2222, '1111111111111111 and '",
            "5555 5555 5555 5555 and 2222 2222 2222 2222, 3333, 5555 5555 5555 5555 and 2222 2222 2222 2222",
            "'', 1111, ''",
            "'', '', ''"
    })
    public void testRemoveBankCardFrom(String text, String bankCode, String expected) {
        BankCard bankCard = new BankCard();
        String result = bankCard.removeBankCardFrom(text, bankCode);
        Assertions.assertEquals(expected, result != null ? result.toString() : null);
    }
}