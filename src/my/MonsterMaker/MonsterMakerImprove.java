package my.MonsterMaker;

public class MonsterMakerImprove {

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




    /*개선점
     MonsterInfo, WarriorInfo 클래스 내의 클래스변수 및 생성자  - Model
     Play클래스 - View
     MonsterInfo, WarriorInfo 클래스 내의 로직 - Control
     으로 사용

     몬스터에 관한 부분들은 생성자함수로 변환

     몬스터 출현파트를 메소드로 분리해서 다른쪽으로 보내면 좋을 것 같다.

     다형성이나 여러가지 부분들을 이용해 구성을 하려고하는데 강제로 둬야하는 부분들이나 그런 것들이 있을까?

     몬스터가 정해지면 그 몬스터 객체에 대한 전투를 담고 있는 클래스를 구현할 것이다.
     그러면 몬스터라는 부모클래스를 만들고 거기서 랜덤을 돌린 메소드에서 나온 값에 따라 하위 메소드가 진행될 수 있도록 만드는 것도 좋아보인다.
     예를 들어 코드를 짜보자


     Monster selectTroll = new FightTroll();
     Monster selectVenom = new FightVenom();
     Monster selectThunderBird = new FightThunderBird();

     int i = (int)Math.random()*3
     if(i == 0){

        selectTroll.trollAppear()
        selectTroll.warriorEquipmentForTroll()
        selectTroll.getTrollAttack()
    }
     if(i == 1){

        selectVenom.VenomAppear()
        selectVenom.warriorEquipmentForVenom()
        selectVenom.getVenomAttack()
    }
     if(i == 2){

        selectThunderBird.ThunderBirdAppear()
        selectThunderBird.warriorEquipmentForThunderBird()
        selectThunderBird.getThunderBirdAttack()
    }

     */






}
