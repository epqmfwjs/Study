package operator;

public class Array1 {
    public static void main(String[] args) {
        String[] members = {"a", "b", "c"};
        for (int i =0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "가 나왔습니다.");
        }
        String[] members1 = {"1", "2", "3"};
        for(String e : members1) {

            System.out.println(e + "이 나왔습니다.");
        }
    }
}
