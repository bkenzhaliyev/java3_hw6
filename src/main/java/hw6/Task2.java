package hw6;

public class Task2 {
    private int[] arr;

    public Task2(int[] arr) {
        this.arr = arr;
    }

    public boolean checkArray() {
        int numberOne = 0;
        int numberFour = 0;

        for (int i = 0; i < this.arr.length; i++) {

            if (this.arr[i] != 1 && this.arr[i] != 4) {
                return false;
            }

            if (this.arr[i] == 1 && numberOne != 1) {
                numberOne = this.arr[i];
            }

            if (this.arr[i] == 4 && numberFour != 4) {
                numberFour = this.arr[i];
            }
        }
        return numberOne + numberFour == 5;
    }
}
