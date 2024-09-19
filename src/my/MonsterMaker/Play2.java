package my.MonsterMaker;

import my.MonsterMaker.info.Level;
import my.MonsterMaker.info.WarriorInfo;
import my.MonsterMaker.info.monster.Monster;
import my.MonsterMaker.info.monster.Troll;

import java.util.Scanner;

public class Play2 {

    public void startTour(){

        Scanner sc = new Scanner(System.in);
        WarriorInfo warrior = new WarriorInfo();
        Troll troll = new Troll();


        System.out.print("모험을 시작하시려면 아무 키나 입력해주세요 : ");
        sc.nextLine();

        System.out.println();
        System.out.print("용사의 이름을 입력해주세요 : ");
        warrior.setWarriorName(sc.nextLine());
        System.out.println("=======난이도를 입력해주세요======");
        System.out.println("======easy , normal, hard======");
        int level = Level.level(sc.nextLine());
        warrior.setWarriorHp(level);
        troll.setTroll(level);


        System.out.println();
        System.out.println(warrior.getWarriorName()  + "은(는) 모험을 떠납니다.");





    }

}
