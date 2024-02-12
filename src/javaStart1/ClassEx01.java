package javaStart1;

public class ClassEx01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
            System.out.println();

                int max = arr[0];
                int min = arr[0];

                for (int i = 0; i < arr.length; i++) {
                    if (max < arr[i]) {
                        max = arr[i];
                    } else if (min > arr[i]) {
                        min = arr[i];
                    }
                }
                System.out.println("가장 큰 수: " + max);
                System.out.println("가장 작은 수: " + min);
            }
        }

