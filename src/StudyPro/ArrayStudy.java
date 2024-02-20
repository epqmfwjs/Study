package StudyPro;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4};
        //String[] newStrArr = new String[5];

       // System.arraycopy(arr1,0,newStrArr,0,arr1.length);

        for (int i=1;i< arr1.length;i++){

            arr1[i] = arr1[i-1] + i;
            System.out.println(arr1[i]+", ");
        }

//        for(String arr2 : newStrArr){
//            System.out.println(arr2);
//        }
    }
}
