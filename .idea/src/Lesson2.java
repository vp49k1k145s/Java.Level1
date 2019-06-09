/**
 * Java1.Level1.Lesson2
 *
 * @autor Dzyubenko  Vadim
 * @version DATE 02,06,2019
 */

import java.util.Arrays;


public class Lesson2 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minAndMaxArray();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;

            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr1 = new int[8];
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = counter;
            counter += 3;

        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
        }
        System.out.println(Arrays.toString(w));
    }


    public static void fillDiagonal() {
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }

    public static void minAndMaxArray() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }
        System.out.println("РњР°РєСЃРёРјР°Р»СЊРЅС‹Р№ СЌР»РµРјРµРЅС‚Р° РјР°СЃСЃРёРІР° : " + max + "   " + "РњРёРЅРёРјР°Р»СЊРЅС‹Р№ СЌР»РµРјРµРЅС‚ РјР°СЃСЃРёРІР° : " + min);
    }
}