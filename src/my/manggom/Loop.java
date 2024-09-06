package my.manggom;

public class Loop {

    public static void main(String[] args) {
//여기서는 sellpage에서 값을 1로 들고오면 종료 아니면 다시 sellpage 진행
        Customer sellStart = new Customer();
        Manager manager = new Manager();

        //반복문쓰자 쓸 수 있을 것 같다. for문을 쓴다면 i를 9999로 설정하자
//        아니다 i를 9999로 설정할 필요 없이 3으로 두고 loopStart 값에 따라 i의 값을 조정시키자


        int loopStart = sellStart.SellPage();
        for (int i = 0; i <= 3; i++) {
            System.out.println("loopStart = " + loopStart);
            if (loopStart == 1) {
                System.out.println("loopStart = " + loopStart);
                break;
            } else if (loopStart == 2) {
                System.out.println("loopStart = " + loopStart);
                manager.Managiment();
                loopStart = 3;
            }else if(loopStart == 3) {
                System.out.println("loopStart = " + loopStart);
                sellStart.SellPage();
                i=0;
            }
        }
        System.out.println("구매창이 종료되었습니다.");
    }

}
