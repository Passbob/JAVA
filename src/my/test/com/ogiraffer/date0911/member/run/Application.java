package my.test.com.ogiraffer.date0911.member.run;

import my.test.com.ogiraffer.date0911.member.DTO.MemberDTO;

public class Application {
    public static void main(String[] args) {

    MemberDTO info = new MemberDTO();
        System.out.println("id : "+info.getId());
        System.out.println("id : "+info.getPwd());
        System.out.println("id : "+info.getName());
        System.out.println("id : "+info.getAge());
        System.out.println("id : "+info.getGender());
        System.out.println("id : "+info.getPhone());
        System.out.println("id : "+info.getEmail());

        info.setId("user01");
        info.setPwd("pass01");
        info.setName("홍길동");
        info.setAge(20);
        info.setGender('M');
        info.setPhone("010-1234-5678");
        info.setEmail("hong123@ohgiraffers.com");

        System.out.println();
        System.out.println();

        System.out.println("id : "+info.getId());
        System.out.println("id : "+info.getPwd());
        System.out.println("id : "+info.getName());
        System.out.println("id : "+info.getAge());
        System.out.println("id : "+info.getGender());
        System.out.println("id : "+info.getPhone());
        System.out.println("id : "+info.getEmail());

    }
}
