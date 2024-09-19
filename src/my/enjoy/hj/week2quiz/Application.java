package my.enjoy.hj.week2quiz;

public class Application {
    public static void main(String[] args) {

        DTO member1 = new DTO();
        DTO member2 = new DTO();
        member1.setId("hi");
        member2.setId("Java");
        member1.setPw("combination");
        member2.setPw("Enjoy");
        member1.setPhone("010-0123-4567");
        member2.setPhone("010-0000-0000");
        member1.setAddress("Gwangjin-gu, Seoul, Republic of korea");
        member2.setAddress("Hanam-si, Gyeonggi-do, Republic of korea");
        member1.setGender('여');
        member2.setGender('남');

        System.out.println(member1.printInformation());
        System.out.println(member2.printInformation());



    }
}
