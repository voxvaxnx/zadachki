package com.example.zadachki;

import com.example.zadachki.indexVhoghdenya.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void testStrStr() {
        Solution solution = new Solution();

        // Тест 1: Подстрока 'll' найдена в строке 'hello'
        Assertions.assertEquals(2, solution.strStr("hello", "ll"));

        // Тест 2: Пустая подстрока должна возвращать 0, так как она содержится в любой строке
        Assertions.assertEquals(0, solution.strStr("hello", ""));

        // Тест 3: Подстрока 'z' не найдена в строке 'hello'
        Assertions.assertEquals(-1, solution.strStr("hello", "z"));

        // Тест 4: Подстрока 'apple' не найдена в строке 'banana'
        Assertions.assertEquals(-1, solution.strStr("banana", "apple"));

        // Тест 5: Подстрока 'an' найдена в строке 'banana' в нескольких местах, должен вернуть индекс первого вхождения
        Assertions.assertEquals(1, solution.strStr("banana", "an"));

        // Тест 6: Подстрока 'HayStack' найдена в строке 'HayStackNeedle'
        Assertions.assertEquals(0, solution.strStr("HayStackNeedle", "HayStack"));

        // Тест 7: Подстрока 'le' найдена в строке 'hello' в последних двух символах
        Assertions.assertEquals(-1, solution.strStr("hello", "le"));
    }
}

