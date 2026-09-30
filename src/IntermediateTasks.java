public class IntermediateTasks {
    static void main() {

//        3. Binary Search alqoritmini tətbiq edərək sıralanmış massivdə element axtarın.
//        5. Massivdən təkrarlanan elementləri silərək unikal elementlərdən ibarət yeni massiv
//        yaradın.
//        6. Massivi sağa/sola N pozisiya sürüşdürün (array rotation).
//        7. İki sıralanmış massivi birləşdirərək (merge) yeni sıralanmış massiv yaradın.
//        8. Massivdə hər bir elementin neçə dəfə təkrarlandığını hesablayan proqram yazın
//        (frequency count).
//        9. Kadane alqoritmindən istifadə edərək massivdəki ardıcıl elementlərin maksimum
//        cəmini (maximum subarray sum) tapın.
//        10. Massivin palindrom olub-olmadığını yoxlayın (məsələn: {1,2,3,2,1}).
//        11. İki massivin kəsişməsini (intersection) tapan proqram yazın.
//        12. İki massivin birləşməsini (union) — təkrarsız şəkildə — tapan proqram yazın.
//        13. Massivi iki hissəyə bölün: mənfi ədədlər solda, müsbət ədədlər sağda yerləşsin
//                (partition).
//        14. Verilmiş cəmə bərabər olan iki elementin indekslərini tapın (Two Sum məsələsi,
//        massiv üzərində).
//        15. NxN ölçülü matrisin transponentini (transpose) hesablayan proqram yazın.


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
//        for (int i = 0; i < arr.length; i++) {//0
//            for ( int j = i+1; j < arr.length; j++) {//1, 2
//
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                   break;
//                }
//            }
//        }

        // 8. Massivdə hər bir elementin neçə dəfə təkrarlandığını hesablayan proqram yazın
        int []arr={2,3,2,3,8};
        int count=0;

        for (int i = 0; i < arr.length; i++) {//i=0
            for ( int j = i+1; j < arr.length; j++) {//

                if(arr[i]==arr[j]){
                    count++;
                   // System.out.println(arr[i]+count+"defe tekrarlanir");

                }
                System.out.println(arr[i]+count+"defe tekrarlanir");

            }
        }





    }
    }

