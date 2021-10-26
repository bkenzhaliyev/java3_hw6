package hw6;

public class Main {
    public static void main(String[] args) {
//      Task1 task = new Task1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7});
//      int[] arr1 = task.getArray();

        Task2 task = new Task2(new int[]{1, 1, 1, 4, 4, 1, 4, 4});
        System.out.println(task.checkArray());

        Task2 task1 = new Task2(new int[]{1, 4, 4, 1, 1, 4, 3});
        System.out.println(task1.checkArray());

        Task2 task3 = new Task2(new int[]{1, 1, 1, 1, 1, 1});
        System.out.println(task3.checkArray());

        Task2 task4 = new Task2(new int[]{4, 4, 4, 4, 4});
        System.out.println(task4.checkArray());
    }
}
