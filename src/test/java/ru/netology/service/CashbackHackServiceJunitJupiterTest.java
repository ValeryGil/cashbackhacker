package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceJunitJupiterTest {

    @Test
    public void shouldMakeDecreaseAmount() {
        CashbackHackService cash = new CashbackHackService();

        int expected = 1;
        int actual = cash.remain(999);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeIncreaseAmount() {
        CashbackHackService cash = new CashbackHackService();

        int expected = 999;
        int actual = cash.remain(1_001);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeAmountEqualSumOfCashback() {
        CashbackHackService cash = new CashbackHackService();

        int expected = 0;
        int actual = cash.remain(1_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeZeroAmount() {
        CashbackHackService cash = new CashbackHackService();

        int expected = 1_000;
        int actual = cash.remain(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeAmount() {
        CashbackHackService cash = new CashbackHackService();

        int expected = 100;
        int actual = cash.remain(900);

        Assertions.assertEquals(expected, actual);
    }
}
