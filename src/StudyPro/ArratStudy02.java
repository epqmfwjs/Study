package StudyPro;

public class ArratStudy02 {

    public static void main(String[] args) {
       // 2차원배열
        int [][] arr1 = {{80,90,100,70},{100,100,100,100},{20,40,30,50}};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i+1 +"번째");
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        //가변배열
        int [][] arr2 = {{80,90,100,70},{100,100,100},{30,50}};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(i+1 +"번째");
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");

            }
            System.out.println();
        }
    }
}
