package my.MonsterMaker;

public class Application {
    public static void main(String[] args) {
//        몬스터 메이커는 몬스터의 이름과 체력 그리고 공격력을 설정할 것이다.
//        객체지향과 캡슐화에 따라 지정할 것이고
//        용사의 이름과 체력 그리고 무기를 만들자.
//        ex)용사여 이름이 무엇인가요?
//        몬스터 하나 잡으면 그 몬스터의 hp 1/4를 가질 수 있다.
//        무기 당 각 몬스터에게 들어가는 데미지가 다름
//        ex) 1. 검 2. 활 3. 마늘
//        몬스터는 3마리 트롤 hp = 1000 dmg = 100, 뱀파이어 hp = 300 dmg = 50 + hp 50+, 칠색조 hp = 500 dmg = 70
//        용사의 체력은 400
//        몬스터 랜덤

        MonsterInfo monster1 = new MonsterInfo();
        monster1.setName("트롤");
        monster1.setHp(1000);
        monster1.setDmg(100);

        MonsterInfo monster2 = new MonsterInfo();
        monster2.setName("뱀파이어");
        monster2.setHp(300);
        monster2.setDmg(50);

        MonsterInfo monster3 = new MonsterInfo();
        monster3.setName("트롤");
        monster3.setHp(500);
        monster3.setDmg(70);
        int i = (int)(Math.random()*3+1);
        if (i == 1){
            System.out.println(monster1.getInfo());
        }


        System.out.println();




    }
}
