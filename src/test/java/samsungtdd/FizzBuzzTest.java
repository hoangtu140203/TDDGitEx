package samsungtdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void test_retun_false_with_numberlessorequal0() {
        int n = 0;
        Exception ex = assertThrows(IllegalArgumentException.class, () -> FizzBuzz.solve(n));
        assertEquals("is invalid input", ex.getMessage());
    }

    @Test
    public void test_retun_false_with_numberlessorlessthan3() {
        int n = 2;
        String[] expected = new String[]{"1", "2"};
        assertArrayEquals(expected, FizzBuzz.solve(n));
    }

    @Test
    public void test_retun_false_with_numberlessthan5() {
        int n = 3;
        String[] expected = new String[]{"1","2","Fizz"};
        assertArrayEquals(expected, FizzBuzz.solve(n));
    }

    @Test
    public void test_retun_false_with_numberlessorlessthan6() {
        int n = 5;
        String[] expected = new String[]{"1","2","Fizz","4","Buzz"};
        assertArrayEquals(expected, FizzBuzz.solve(n));
    }

    @Test
    public void test_retun_false_with_numberequalorbiggerthan15() {
        int n =15;
        String[] expected = new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
        assertArrayEquals(expected, FizzBuzz.solve(n));
    }


}
