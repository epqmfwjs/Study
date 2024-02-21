package StudyPro;

import java.util.ArrayList;
import java.util.List;

public class Member {
    public static void main(String[] args) {
        List<MemberDTO> list = new ArrayList<MemberDTO>();
        MemberDTO mdt = new MemberDTO();

        mdt.setName("최광현");
        mdt.setAge(33);
        mdt.setJob("java");

        list.add(mdt);

        System.out.println(list);



    }
}
