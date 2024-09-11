package my.MonsterMaker;

import java.util.Scanner;

public class Play {

    public void startTour() {
        MonsterInfo monster1 = new MonsterInfo();
        monster1.setName("트롤");
        monster1.setHp(1000);
        monster1.setDmg(100);
        monster1.setProbability(30);

        MonsterInfo monster2 = new MonsterInfo();
        monster2.setName("뱀파이어");
        monster2.setHp(300);
        monster2.setDmg(50);
        monster2.setProbability(90);

        MonsterInfo monster3 = new MonsterInfo();
        monster3.setName("칠색조");
        monster3.setHp(500);
        monster3.setDmg(70);
        monster3.setProbability(60);

//        ========난이도 설정파트========
        WarriorInfo warrior1 = new WarriorInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("용사 이름을 입력해주세요 : ");
        warrior1.setName(sc.nextLine());
        System.out.println("=======난이도를 입력해주세요======");
        System.out.println("======easy , normal, hard======");
        int warriorHp = warrior1.warriorHp(sc.nextLine());
        System.out.println(warrior1.getName() + "의 체력은 " + warriorHp + "입니다.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(warrior1.getName() + "(은)는 숲에 진입을 하고 있습니다.");
        System.out.println();
        System.out.println();
        System.out.println();



//       ========= 몬스터 출현파트==========
        //        int i = (int)(Math.random()*3+1);
        int i = 1;
        if (i == 1) {
            int trollHp = monster1.getHp();
            System.out.println(monster1.getInfo());
            for (int j = 0; j < 100; j++) {
                System.out.println(monster1.getStat());
                System.out.print("공격할 장비를 입력해주세요 : ");
                System.out.println("sword , bow, garlic");
                trollHp -= warrior1.warriorEquipmentForTroll(sc.nextLine());
                System.out.println("트롤 HP : " + trollHp);
                System.out.println();
                warriorHp -= monster1.getTrollAttack();
                System.out.println(warrior1.getName() + "의 남은 HP : " + warriorHp);
                if (trollHp <= 0) {
                    break;
                } else if (warriorHp <= 0) {
                    break;
                }
            }
            System.out.println("숲을 떠납니다.");


        }


    }
}
