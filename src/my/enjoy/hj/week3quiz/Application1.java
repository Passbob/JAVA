package my.enjoy.hj.week3quiz;

import java.util.ArrayList;

public class Application1 {

    public static void main(String[] args) {
    Application1 app = new Application1();
        /*1번 문제 (직접 낸 문제)
        1 ~ 50에서의 램덤숫자로 7개의 숫자 생성 후 배열넣기

        조건 1. 그냥 배열이 아닌 ArrayList 사용해주세요 :)

        조건 2. 랜덤숫자가 배열에 들어가는 메소드는 return을 사용해서 메소드를 하나만 만들어주세요.

                조건 3. 출력은 메인에서 사용해주세요. (힌트 : 얕은복사를 사용해서 만들어주세요.)
*/

        ArrayList<int[]> randomNum = new ArrayList<>();
        int[] result = new int[7];
        randomNum.add(app.randomNumInput());
        result = randomNum.get(0);
        for (int i = 1; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public int[] randomNumInput(){

        int[] randomNumArray = new int[7];
        for (int i = 0; i < randomNumArray.length; i++) {
            randomNumArray[i] = (int)(Math.random()*50)+1;
        }

        return randomNumArray;
    }

}
