import java.util.Arrays;

public class IntermediateTasks {
    static void main() {

//        3. Binary Search alqoritmini tətbiq edərək sıralanmış massivdə element axtarın.
//        5. Massivdən təkrarlanan elementləri silərək unikal elementlərdən ibarət yeni massiv
//        yaradın.
//        6. Massivi sağa/sola N pozisiya sürüşdürün (array rotation).
//        7. İki sıralanmış massivi birləşdirərək (merge) yeni sıralanmış massiv yaradın.
//        8. Massivdə hər bir elementin neçə dəfə təkrarlandığını hesablayan proqram yazın (frequency count).
//        9. Kadane alqoritmindən istifadə edərək massivdəki ardıcıl elementlərin maksimum
//        cəmini (maximum subarray sum) tapın.
//        12. İki massivin birləşməsini (union) — təkrarsız şəkildə — tapan proqram yazın.
//
//

        // 1. İki ölçülü (2D) massiv yaradıb, onun bütün elementlərinin cəmini tapın.

//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum = sum + arr[i][j];
//
//            }
//        }
//        System.out.println(sum);


        // 2. 2D massivin əsas diaqonalındakı elementlərin cəmini hesablayın.

//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//
//                if (i == j) {
//                    sum = sum + arr[i][j];
//                }
//            }
//        }
//        System.out.println(sum);
//
        // 4. Massivdəki təkrarlanan (duplicate) elementləri tapıb çap edin.

//        int []arr={2,3,2,8,3,5,7,8};
//
//        for (int i = 0; i < arr.length; i++) {
//            for ( int j = i+1; j < arr.length; j++) {
//
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                   break;
//                }
//            }
//        }


        //10. Massivin palindrom olub-olmadığını yoxlayın
//
//        int arr[] = {1, 2, 3, 2, 1, 5};
//        boolean situation = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == arr[arr.length - 1 - i]) {
//                situation = true;
//            }
//
//        }
//        String result = situation == true ? "array polindromdur" : "array polindrom deyil";
//        System.out.println(result);


        //15. NxN ölçülü matrisin transponentini (transpose) hesablayan proqram yazın.

//        int arr[][] = {
//
//                {2, 3, 4, 5},
//                {8, 12, 5, 4},
//                {0, 1, 5, 4},
//                {6, 8, 9, 0}
//
//        };
//
//        int newArr[][] = new int[arr.length][arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                newArr[i][j] = arr[j][i];
//
//            }
//        }
//        System.out.println(Arrays.deepToString(newArr));

        // 14. Verilmiş cəmə bərabər olan iki elementin indekslərini tapın (Two Sum məsələsi,
        //      massiv üzərində).

//        int[] arr = {2, 8, 11, 7, 0};
//        int sum = 10;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    System.out.println(i + ".indeks ile " + j + ".indeks cemidir");
//                }
//
//            }
//
//        }

        //13. Massivi iki hissəyə bölün: mənfi ədədlər solda,
        // müsbət ədədlər sağda yerləşsin (partition).

//        int arr[] = {2, -1, 3, -4, 8, 9, -5, -18};
//
//        int newArr[] = new int[arr.length];
//        int index = 0;
//
//        for (int numArr : arr) {
//            if (numArr < 0) {
//                newArr[index++] = numArr;
//            }
//        }
//
//        for (int numArr : arr) {
//            if (numArr > 0) {
//                newArr[index++] = numArr;
//            }
//        }
//
//        System.out.println(Arrays.toString(newArr));


        // 11. İki massivin kəsişməsini (intersection) tapan proqram yazın.
//
//        int arr1[] = {1, 5, 6, 7, 8};
//        int arr2[] = {5, 3, 1, 8, 12, 4};
//        int count = 0;
//
//        int newArr[] = new int[arr1.length];
//
//        for (int i = 0; i < arr1.length; i++) {//0
//            for (int j = 0; j < arr2.length; j++) {//0
//
//                if (arr1[i] == arr2[j]) {//1==5-
//                    newArr[count] = arr1[i];
//                    count++;
//                    break;
//                }
//
//            }
//        }
//        int result[] = new int[count];
//
//        for (int j = 0; j < count; j++) {
//            result[j] = newArr[j];
//
//        }
//        System.out.println(Arrays.toString(result));



    }


}





