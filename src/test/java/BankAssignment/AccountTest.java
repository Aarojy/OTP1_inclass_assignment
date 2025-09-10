package BankAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account a;

    @BeforeEach
    void setUp() {
        a = new Account();
        a.deposit(100);
    }

    @Test
    void deposit() {
        a.deposit(100);
        assertEquals(200, a.getBalance());
        assertThrows(IllegalArgumentException.class, () -> a.deposit(-50));
    }

    @Test
    void withdraw() {
        assertEquals(40, a.withdraw(40));
        assertEquals(60, a.getBalance());
        assertEquals(0, a.withdraw(100));
        assertThrows(IllegalArgumentException.class, () -> a.withdraw(-20));
    }

    @Test
    void getBalance() {
        assertEquals(100, a.getBalance());
    }
}