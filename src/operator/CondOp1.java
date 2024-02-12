package operator;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("나이는 = " + age + "  능력치는 = " +status);
    }
}
