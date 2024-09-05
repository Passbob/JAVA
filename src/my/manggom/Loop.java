package my.manggom;

public class Loop {

    public static void main(String[] args) {
//여기서는 sellpage에서 값을 1로 들고오면 종료 아니면 다시 sellpage 진행
    Customer sellStart =  new Customer();
    Manager manager = new Manager();

    int loopStart = sellStart.SellPage();
    if (loopStart == 3) {
        sellStart.SellPage();
    }else if (loopStart == 2) {
        manager.Managiment();
    }

    }


}
