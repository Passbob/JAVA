package my.MonsterMaker.info.monster;

public class Vampire extends Monster{

    public void setVampire(int level){
        MName = "뱀파이어";


        if (level == 1){
            MHp = 1000;
        }else if(level == 2){
            MHp = 1500;
        }else if(level == 3){
            MHp = 2000;
        }

        if (level == 1){
            MProbability = 20;
        }else if(level == 2){
            MProbability = 25;
        }else if(level == 3){
            MProbability = 30;
        }

        if (level == 1){
            MDmg = 200;
        }else if(level == 2){
            MDmg = 250;
        }else if(level == 3){
            MDmg = 300;
        }

    }

}