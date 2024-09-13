package my.MonsterMaker;

public class WarriorInfo {

    private String name;
    private int hp;

    public void setName(String name) {this.name = name;}

    public void setHp(int hp) {this.hp = hp;}

    public String getName() {return name;}

    public int getHp() {return hp;}

    public int warriorHp(String level) {
    if(level.equals("easy")){
        hp = 1000;
        MonsterInfo trollEasy = new MonsterInfo("트롤", 1000, 100, 30);
    }else if(level.equals("normal")){
        hp = 500;
        MonsterInfo trollNormal = new MonsterInfo("트롤", 1300, 150, 30);
    }else if(level.equals("hard")){
        hp = 300;
        MonsterInfo trollHard = new MonsterInfo("트롤", 1700, 200, 30);
    }else {
        System.out.println("다시 입력해주세요");
    }
        return hp;
    }

    public int warriorEquipmentForTroll (String equipment) {
        int warriorDmg = 0;

        if (equipment.equals("sword")){
            int random = (int) (Math.random()*10) + 1;
            if(random <=8){
            warriorDmg = (int)(Math.random()*100)+200;
            System.out.println("강한 일격이 들어갔습니다.");
            }else{
                System.out.println("빗나감!!");
            }

        }else if (equipment.equals("bow")){
            int random = (int) (Math.random()*10) + 1;
            if(random <=8){
            warriorDmg = (int)(Math.random()*50)+50;
            System.out.println("피부가 두꺼워 화살이 박히지 않습니다.");
            }else{
                System.out.println("빗나감!!");
            }


        } if (equipment.equals("garlic")){
            warriorDmg = 0;
            System.out.println("마늘을 맛있게 먹습니다.");
        }
        return warriorDmg;
    }

}
