package my.MonsterMaker;

public class MonsterInfo {

    private String name;
    private int hp;
    private int dmg;
    private int probability;

    public MonsterInfo(){}

    public MonsterInfo(String name, int hp, int dmg){
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public String getName() {return name;}

    public int getHp() {
        return hp;
    }

    public int getDmg() {return dmg;}

    public int getProbability() {return probability;}

    public String getInfo() {
        return this.name+"(이)가 출현했습니다.";
    }

    public String getStat() {
        return "HP : "+ this.hp +" 데미지 : " +this.dmg+" 공격 확률 : "+this.probability+"%" ;
    }



    public int getTrollAttack() {
        int random = (int) (Math.random()*10) + 1;
        int trollDmg = 0;
        if(random <= 3){
            System.out.println("트롤의 공격에 피격당했습니다.");
            trollDmg = (int)(Math.random()*100)+200;
        }else {
            System.out.println("옆으로 굴러 회피했습니다.");
            trollDmg = 0;
        }

        return trollDmg;
    }


}
