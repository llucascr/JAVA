package ArraysMultidimensionais;

public class AulaArraysMultidimensionais {
    public static void main(String[] args) {
        // Arrays Multidimensionais = Arrays de Arrays

        // 1,2,3,4,5 Meses
        // 31,28,31,30 dias
//        int[][] dias = new int[3][3];
//        dias[0][0] = 31;
//        dias[0][1] = 28;
//        dias[0][2] = 31;
//
//        dias[1][0] = 31;
//        dias[1][1] = 28;
//        dias[1][2] = 31;
//
//        dias[2][0] = 31;
//        dias[2][1] = 28;
//        dias[2][2] = 31;
//
//
//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.println(dias[i][j]);
//            }
//        }

        // -------------------------------------------------------------------
        // Foreach em Arrays Multidimensionais
//        int[][] dias = new int[3][3];
//
//        dias[0][0] = 0;
//        dias[0][1] = 1;
//        dias[0][2] = 2;
//
//        for(int[] arrBase : dias){
//            for(int num : arrBase){
//                System.out.println(num);
//            }
//            System.out.println("--------");
//        }

        // -------------------------------------------------------------------
        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array; // arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println("ArrayInt:");
        for (int[] arrBase : arrayInt) {
            System.out.println("\n----------");
            for (int i : arrBase) {
                System.out.print(i + " ");
            }
        }

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        System.out.println("\n\nArraysInt2:");
        for (int[] arraBase : arrayInt2) {
            System.out.println("\n----------");
            for (int i : arraBase) {
                System.out.print(i + " ");
            }
        }
    }
}
