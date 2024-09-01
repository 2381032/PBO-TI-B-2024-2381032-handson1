public class TipeDataArray {
    public static void main(String[] args) {
        // Array kumpulan sebuah data yang memiliki tipe yang sama?

        //One Dimension
        int[] arrayInteger = new int[3];
        arrayInteger[0] = 20;
        arrayInteger[1] = 40;
        arrayInteger[2] = 50;

        int[] arrayInteger2 = new int[]{20, 40, 50};
        arrayInteger2[1] = 60;
//        System.out.println(arrayInteger2);

        //Multi Dimension
        int[][] arrayInteger3 = new int[][] {{20, 40, 50}, {90, 100, 120}, {70, 30, 190}};
//        System.out.println(arrayInteger3[0][2] + arrayInteger3[1][2]);

        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = 20;
        arrayOfObject[1] = "Yecoef";
        arrayOfObject[2] = 20L;
        System.out.println(arrayOfObject[1]);
    }
}
