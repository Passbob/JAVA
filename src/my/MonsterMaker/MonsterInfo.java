package my.MonsterMaker;

public class MonsterInfo {

    private String name;
    private int hp;
    private int dmg;

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public String getInfo() {
        return this.name+"가 출현했습니다.";
    }
    public String getStat() {
        return "HP : "+ this.hp +" 데미지 : " +this.dmg;
    }



}
