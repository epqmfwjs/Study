package operator;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("프로그랩을 시작합니다.");
            System.out.println("1. 과일종류\t2. 야채종류\t3. 종료");
            String str = scanner.nextLine();
            if (str.equals("1")) {
                System.out.println("1사과 2바나나 3복숭아 4오렌지");
                String apoll = scanner.nextLine();
                if (apoll.equals("1")){
                    System.out.println("사과를 선택 하였습니다.\n");
                    System.out.println("갯수를입렵해주세요.");
                    int set1 = scanner.nextInt();
                    System.out.println("사과 " + set1 + "개 를 주문합니다.");
                    System.out.println();
                    break;
                }
                if (apoll.equals("2")){
                    System.out.println("바나나를 선택 하였습니다.\n");
                    System.out.println("갯수를입렵해주세요.");
                    int set2 = scanner.nextInt();
                    System.out.println("바나나 " + set2 + "개 를 주문합니다.");
                    System.out.println();
                    break;
                }
                if (apoll.equals("3")){
                    System.out.println("복숭아를 선택 하였습니다.\n");
                    System.out.println("갯수를입렵해주세요.");
                    int set3 = scanner.nextInt();
                    System.out.println("복숭아 " + set3 + "개 를 주문합니다.");
                    System.out.println();
                    break;
                }
                if (apoll.equals("4")){
                    System.out.println("오렌지를 선택 하였습니다.\n");
                    System.out.println("갯수를입렵해주세요.");
                    int set4 = scanner.nextInt();
                    System.out.println("바나나 " + set4 + "개 를 주문합니다.");
                    System.out.println();
                    break;
                }
            }else if (str.equals("2")) {
                System.out.println("1오이 2상추 3깻잎 4호박");
                continue;
            }else{
                System.out.println("프로그랩을 종료합니다.");
                break;
            }
        }

    }
}
