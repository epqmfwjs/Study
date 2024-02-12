public class StudyEx1 {
/*    2. 문제 - 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
    아래의 내용처럼 처리하세요.
            _______________________________________________________
|         |    0열    |    1열    |    2열    |    3열    |
    _______________________________________________________
|    0행   |    25    |    12    |     3     |0행 값들의 합|
    _______________________________________________________
|    1행   |     5    |    32    |     13    |0행 값들의 합|
    _______________________________________________________
|    2행   |    45    |    16    |     0     |0행 값들의 합|
    _______________________________________________________
|    3행   |0열 값들의 합|1열 값들의 합| 2열 값들의 합|    총합   |
    _______________________________________________________*/
    public static void main(String[] args) {
        int[][] arr1= new int [][] {{1,2,3,0},
                                    {5,6,7,0},
                                    {1,2,3,0},
                                    {0,0,0,0}};
        int sum = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;


        for (int i = 0; i < 1; i++) {
            for ( int j = 0; j < 3; j++) {
                a += arr1[i][j];
                arr1[0][3] = a;
            }
        }
        System.out.println(arr1[0][3]);
        for (int i = 1; i < 2; i++) {
            for ( int j = 0; j < 3; j++) {
                b += arr1[i][j];
                arr1[1][3] = b;
            }
        }
        System.out.println(arr1[1][3]);
        for (int i = 2; i < 3; i++) {
            for ( int j = 0; j < 3; j++) {
                c += arr1[i][j];
                arr1[2][3] = c;
            }
        }
        System.out.println(arr1[2][3]);
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 1; j++) {
                d += arr1[i][j];
                arr1[3][0] = d;
            }
        }
        System.out.println(arr1[3][0]);
        for (int i = 0; i < 3; i++) {
            for ( int j = 1; j < 2; j++) {
                e += arr1[i][j];
                arr1[3][1] = e;
            }
        }
        System.out.println(arr1[3][1]);
        for (int i = 0; i < 3; i++) {
            for ( int j = 2; j < 3; j++) {
                f += arr1[i][j];
                arr1[3][2] = f;
            }
        }
        System.out.println(arr1[3][2]);
        for (int i = 0; i < 4; i++) {
            for ( int j = 0; j < 4; j++) {
                sum += arr1[i][j];

            }
        }
        System.out.println(sum);

    }
}
