package my.MonsterMaker;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        몬스터와 전투를 하는 프로그램
//        사용자의 선택에 따라 확률적으로 행동을 해서 전투를 함
//        객체지향과 캡슐화에 따라 지정할 것이고
//        용사의 이름과 체력 그리고 무기를 만들자.
//        ex)용사여 이름이 무엇인가요?
//        무기 당 각 몬스터에게 들어가는 데미지가 다름
//        ex) 1. 검 2. 활 3. 마늘
//        몬스터는 3마리 트롤 hp = 1000 dmg = 200 확률 20, 뱀파이어 hp = 300 dmg = 50 + hp 50+ 확률 90, 칠색조 hp = 500 dmg = 150 확률 60
//        용사의 체력은 500
//        몬스터 랜덤
//        트롤에게 검을 쓴다면 데미지 -> 200~300 활 -> 50~100 마늘 -> 0
//        칠색조 검 -> 30~50 활 ->100~150 마늘 -> 0
//        뱀파이어 검 -> 0 활 -> 0 마늘 -> 150
        
        /*메서드 흐름 및 필요한 내용
        * 각 개체의 세팅 값, 확률 계산, 데미지에 따른 HP변화, 끝
        *
        * 플레이 -> 모험시작 -> 몬스터 출현 ->끝
        * 전투 --> 개체 값의 체력과 데미지 확률 표기 -> 무기 선택 -> 공격 -> 데미지 계산 -> 피격 -> 데미지 계산  -> 루프 ->체력 0 끝
        * 마무리
        *
        * 데미지 계산 부분은 배열을 사용할까 아니면 반복문을 사용할까? 반복문 사용이 좋아보인다.
        * 공격에 대한 부분은 dmg를 계산하는 메서드를 간접으로 만들어서 값을 불러온 뒤에 계산하도록 만들자.
        * 체력 0이 되었을 때 반응들을 만들자.
        * */

        Play start = new Play();
        start.startTour();






//        MonsterInfo monster1 = new MonsterInfo();
//        monster1.setName("트롤");
//        monster1.setHp(1000);
//        monster1.setDmg(100);
//        monster1.setProbability(30);
//
//        MonsterInfo monster2 = new MonsterInfo();
//        monster2.setName("뱀파이어");
//        monster2.setHp(300);
//        monster2.setDmg(50);
//        monster2.setProbability(90);
//
//        MonsterInfo monster3 = new MonsterInfo();
//        monster3.setName("칠색조");
//        monster3.setHp(500);
//        monster3.setDmg(70);
//        monster3.setProbability(60);
//
//        WarriorInfo warrior1 = new WarriorInfo();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("용사 이름을 입력해주세요 : ");
//        warrior1.setName(sc.nextLine());
//        System.out.println("=======난이도를 입력해주세요======");
//        System.out.println("======easy , normal, hard======");
//        int warriorHp = warrior1.warriorHp(sc.nextLine());
//        System.out.println(warrior1.getName()+"의 체력은 "+warriorHp+"입니다.");
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println(warrior1.getName()+"(은)는 숲에 진입을 하고 있습니다.");
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
////        int i = (int)(Math.random()*3+1);
//        int i = 1;
//        if (i == 1){
//            int trollHp = monster1.getHp();
//            System.out.println(monster1.getInfo());
//            for(int j = 0; j < 100; j++){
//                System.out.println(monster1.getStat());
//                System.out.print("공격할 장비를 입력해주세요 : ");
//                System.out.println("sword , bow, garlic");
//                trollHp -= warrior1.warriorEquipmentForTroll(sc.nextLine());
//                System.out.println("트롤 HP : "+trollHp);
//                System.out.println();
//                warriorHp -= monster1.getTrollAttack();
//                System.out.println(warrior1.getName()+"의 남은 HP : "+warriorHp);
//                if(trollHp <= 0){
//                    break;
//                }else if(warriorHp <= 0){
//                    break;
//                }
//            }
//            System.out.println("숲을 떠납니다.");
//        }
//
//
//        System.out.println();




    }
}
