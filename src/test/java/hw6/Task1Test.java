package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {
    Task1 task;

    @Test
    void getArray() {
        task = new Task1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7});
        Assertions.assertArrayEquals(new int[]{1, 7}, task.getArray());
    }

    @Test
    void getEmptyArray() {
        task = new Task1(new int[]{1, 2, 4, 4, 2, 3, 4});
        Assertions.assertArrayEquals(new int[]{}, task.getArray());
    }

    @Test
    void getException() {
        task = new Task1(new int[]{1, 2});
        try {
            Assertions.assertArrayEquals(new int[]{}, task.getArray());
        } catch (RuntimeException e) {
            Assertions.fail("ОШИБКА!!! Нет цифры 4");
        }
    }

    @Test
    void getArray1() {
        task = new Task1(new int[]{1, 2, 4, 4, 2, 3, 1, 7});
        Assertions.assertArrayEquals(new int[]{2, 3, 1, 7}, task.getArray());
    }
}