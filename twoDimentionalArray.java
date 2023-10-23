package Practice.Array;

public class twoDimentionalArray {
    public static void main(String[] args) {
        // A 12*8 grid, in[row][col]
        int[][] array = new int[12][8];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = row * column + 1;
            }
        }
        //print array
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%3d", array[row][column]);
            }
            System.out.println();
        }
    }
}
