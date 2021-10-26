package hw6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
 private int[] arr;
 private int[] newArr;

    public Task1(int[] arr) {
        this.arr = arr;
    }

    public int[] getArray() {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isContainFour = false;

        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[arr.length - i - 1] != 4) {
                    list.add(0, arr[arr.length - i - 1]);
                } else {
                    isContainFour = true;
                    break;
                }
            }
        }

        if (!isContainFour) {
            throw new RuntimeException("ОШИБКА!!! Нет цифры 4");
        }

        newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

}
