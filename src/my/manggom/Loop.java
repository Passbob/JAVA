package my.manggom;

public class Loop {

    public static void main(String[] args) {
//여기서는 sellpage에서 값을 1로 들고오면 종료 아니면 다시 sellpage 진행
        Customer sellStart = new Customer();
        Manager manager = new Manager();

        //반복문쓰자 쓸 수 있을 것 같다. for문을 쓴다면 i를 9999로 설정하자
//        아니다 i를 9999로 설정할 필요 없이 3으로 두고 loopStart 값에 따라 i의 값을 조정시키자
//      아래에서 굳이 판매페이지를 if문에 넣을 필요없이 for문에서 반복시키면 됐었다. 앞으로도 for문을 사용할 때
//        내가 계속 반복하고 싶은 부분은 if에 넣지말고 꺼내 놓고 조건이 필수인 것들만 안에다 넣어놓자.


        for (int i = 0; i <= 4; i++) {
            int loopStart = sellStart.SellPage();
            System.out.println("loopStart = " + loopStart);
            if (loopStart == 1) {
                System.out.println("loopStart = " + loopStart);
                break;
            } else {if (loopStart == 2) {
                System.out.println("loopStart = " + loopStart);
                manager.Managiment();
            }}
        }
        System.out.println("구매창이 종료되었습니다.");
    }

}
