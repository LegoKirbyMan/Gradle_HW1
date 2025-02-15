package ru.netology.service;

import org.testng.annotations.*;

import static org.testng.AssertJUnit.*;
class CashbackHackServiceTest {
    @Test
    public void ServiceTest(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}