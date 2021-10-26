package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 task;

    @ParameterizedTest
    @MethodSource("dataForArray")
    void checkArray(int[] arr, boolean result) {
        task = new Task2(arr);
        Assertions.assertEquals(result, task.checkArray());
    }

    public static Stream<Arguments> dataForArray() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[] {1, 1, 1, 4, 4, 1, 4, 4}, true));
        out.add(Arguments.arguments(new int[] {1, 4, 4, 1, 1, 4, 3}, false));
        out.add(Arguments.arguments(new int[] {1, 1, 1, 1, 1, 1}, false));
        out.add(Arguments.arguments(new int[] {4, 4, 4, 4, 4}, false));
        return out.stream();
    }

}