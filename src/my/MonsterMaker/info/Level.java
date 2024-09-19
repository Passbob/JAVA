package my.MonsterMaker.info;

public class Level {
    
    public static int level (String choice){
        int level = 0;
        if(choice.equals("easy")){
            level = 1;
        }else if(choice.equals("normal")){
            level = 2;
        }else if(choice.equals("hard")){
            level = 3;
        }else{
            System.out.println("제대로 입력해주세요.");
        }

        return level;
    }
    
}
