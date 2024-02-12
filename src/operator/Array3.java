package operator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Maxproducts = 3;
        String[] productNames = new String[Maxproducts];
        int[] produtPrices = new int[Maxproducts];
        int productCount = 0;

        while(true) {
            System.out.print("1상품등록 ㅣ 2상품목록 ㅣ 3종료\n메뉴를 선택하세요");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if (productCount > Maxproducts) {
                System.out.println(" 더이상 상품을 등록할수없습니다.");
                continue;
            }

            if (menu == 1) {
                System.out.print("상품의 이름을 입력해주세요: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력해주세요: ");
                produtPrices[productCount] = scanner.nextInt();

                productCount++;

            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ":" + produtPrices[i] + "원");
                }


            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
