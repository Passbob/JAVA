package my.firstweek;

public class g_forAndWhile {

//    for while구문은 흐름의 중요성을 잘 알아야 구현하기 쉬울 것 같다.
//    안에서 일어나는 루프들의 흐름을 알고 그것을 잘 활용하는 것이 관건일 듯 하다.
//    개인적으로 느낀 것들은 무한 루프의 구조를 활용해서 그 루프에서 빠져나오는 조건을 만들어
//    내가 원하는 기능을 여러개 작성하는 것이 아닌 하나의 메서드에서 돌리는 것인데 루프 과정에서 생각보다 까다로운 조건들이 나오는 느낌이었다.
//    그래서 그 조건을 if문을 잘 사용해서 걸어보자.
//    일단 루프에서는 break같이 탈출할 수 있는 분기문을 조건의 맨 위에 두는 것이 굉장히 중요해보였다.
//    분기문이 아래에 있으면 위에것을 한번 더 실행했기 때문이다.

//    그래서 과일 자판기를 조금 더 다듬어서 진행해보자
//    과일 자판기를 아래처럼 진행해서 exit를 사용하지 않으면 무한루프가 발생할 수 있도록 만들었다.
//    만약 망곰이처럼 하나의 기능을 더 넣고 싶을 때는 break가 if문의 맨 윗부분에 올 수 있도록 만들면 좋을 것 같다.
//    그렇다면 값이 중첩으로 쌓이는 계산기를 만드려면 어떻게 할까? -> 첫번째 계산이후에 메소드를 넣어서 진행하면 될 것 같다.
//    총 10번 계산이 가능한 계산기를 만들었다. 첫번째 계산 이후에 정수 하나와 연산을 기입할 수 있는 칸을 넣고
//    그 값을 그대로 들고와서 다시 계산하는 식으로 만들었다. 잘 실행된다. 굿

    public static void main(String[] args) {

        f_flowControlMethod fruit = new f_flowControlMethod();
//        for(int i=0; i<10; i++){
//            i = fruit.testSwitchVendingMachine();
//            if (i== 10) {
//                System.out.println("구매를 종료합니다.");
//            }
//        }
        int result = fruit.test1();
        System.out.println("result = " + result);
        int result2 = fruit.test2(result);
        for (int i=0; i<10; i++){
            fruit.test2(result2);


        }

    }

}
