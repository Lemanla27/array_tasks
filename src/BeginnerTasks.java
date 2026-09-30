import java.util.Arrays;
import java.util.Scanner;

public class BeginnerTasks {
    static void main() {


        // 1. İstifadəçidən 10 tam ədəd daxil edərək massiv yaradın və ekrana çap edin.

        /*int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("eded daxil edin:");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));*/


        // 2. Massivdəki bütün elementlərin cəmini tapın.

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Massiv neche olchulu olacaq?");
        int arrlength=sc.nextInt();
        int arr[] = new int[arrlength];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("eded daxil edin:");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("cem=" + sum);*/


        //3. Massivdəki bütün elementlərin orta qiymətini (average) hesablayın.

      /*  int arr[] = {3, 8, 15, 4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println(average);
    */


        //6. Massivdəki cüt ədədlərin sayını hesablayın.

       /* int arr[] = {1, 2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);*/


        // 7. Massivdəki tək ədədlərin sayını hesablayın.
       /* int arr[] = {1, 2, 3, 4, 5, 6};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }

        }
        System.out.println(count);*/


        //9. Massivdə verilmiş bir ədədin olub-olmadığını yoxlayın (linear search).

       /* Scanner sc = new Scanner(System.in);
        System.out.println("yoxlamaq istediyiniz ededi daxil edin:");
        int num = sc.nextInt();

        int arr[] = {1, 2, 3, 4, 5, 6};
        boolean exist = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                exist = true;
                break;

            }
        }
        String result = exist == true ? "eded massivin elementidir " : "eded massivin elementi deyil";
        System.out.println(result);*/


        //12. Massivdəki mənfi ədədlərin sayını tapın.

        /*int arr[] = {1, -2, 3, -4, 5, 6};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                count++;

        }
        System.out.println("menfi ededlerin sayi:" + count);*/


        // 11. Massivdəki bütün elementləri 2-yə vurub yeni massivə yazın.

        /*int arr[] = {1, 2, 3, 4, 5, 6};

        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 2;

        }

        System.out.println(Arrays.toString(newArr));*/


        //10. İki massivin eyni ölçüdə olduğunu fərz edərək, uyğun indekslərdəki elementləri
        //        toplayıb üçüncü massivə yazın.


        /*int arr1[] = {1, 2, 3, 4,};
        int arr2[] = {7, 8, 9, 10};
        int arrSum[] = new int[arr1.length];

        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            arrSum[i] = arr1[i] + arr2[i];

        }
        System.out.println(Arrays.toString(arrSum));*/


//        8. Massivi tərsinə çevirin (reverse) — yeni massivə yazmadan, elementlərin yerini
//        dəyişməklə.


       /* int arr[] = {5, 8, 9, 2, 0};

        int[] arrNew = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            arrNew[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arrNew));*/


        //15. Massivin elementlərini vergüllə ayıraraq bir sətir (String) şəklində çap edin.

       /* int arr[] = {3, 6, 7, 8, 2};
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];


            if (i < arr.length - 1) {
                result = result + ",";
            }
        }
        System.out.println(result);*/


//        4. Massivdəki ən böyük (maksimum) elementi tapın.

        /*int[] arr = {550, 8, 9, 230000, 1};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);*/


        //5. Massivdəki ən kiçik (minimum) elementi tapın..

      /*  int[] arr = {550, 8, -1, 230000, 1};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);*/


        //13.Massivin elementlərini artan qaydada sıralayın (sadə bubble sort istifadə edərək).

      /*  int[] arr = {2, 10, 8, 3, 7};
        int length = arr.length;//5

        for (int i = 0; i < length - 1; i++) {
            for (int j =i+1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(arr));*/


        //14. Massivdə ən böyük ikinci elementi tapın.

        /*int[] arr = {2, 10, 8, 3, 7};
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int secondMax = arr[length - 2];
        System.out.println("ikinci en boyuk element: " + secondMax);*/
    }
}