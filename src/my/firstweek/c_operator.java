package my.firstweek;

public class c_operator {
    public static void main(String[] args) {

        //산술연산자는 기본으로 알고있던 +,-,*,/,%이다. 산술 복합 대입 연산자가 좀 중요해보이니 한번 해보자

        final int DEFULT = 10;
        int num1 = 0;
        num1 += DEFULT + 100;
        System.out.println("num1 = " + num1);
        num1 += num1 +5;
        System.out.println("num1 = " + num1);
        num1 /= 10;
        System.out.println("num1 = " + num1);
        num1 *= num1;
        System.out.println("num1 = " + num1);
        num1 -= num1 - DEFULT;
        System.out.println("num1 = " + num1);

        //월급에 대한 부분을 만들어본다고 생각해보자
        //조형석 사원의 24년 연봉은 2500만원이다.
        //8월달에 100만원의 보너스를 받게 되었고 고정비는 150만원이 빠진다. 조형석사원의 8월 순수익은?
        //산술 복합 대입 연산자를 이용해서 진행하게 하자
        int choSalary24 = 31000000;
        int choAugustSalary = choSalary24/12;
        System.out.println("choAugustSalary = " + choAugustSalary);
        int bonus = 500000;
        double tax = 3.3;
        int choAugustRevenue = (int)((double)(choAugustSalary + bonus)/100 * (100-tax));
        System.out.println("choAugustRevenue = " + choAugustRevenue);
        String resurlt3 = (choAugustRevenue>=3000000)? "축하드립니다. 이번 월급은 " + choAugustRevenue + "원입니다." : "이번 월급은 " + choAugustRevenue + "원입니다.";
        System.out.println("결과 = " + resurlt3);

//        int choAugustRevenue += choAugustSalary + bonus - pay;
// 선언되지 않은 상태에서 산술 복합 대입 연산자는 반응하지 않는 것 같다.
//        int choAugustRevenue;
// 선언은 하였으나 값이 없는 상태에서는 반응하지 않는 것 같다.
//        choAugustRevenue += choAugustSalary + bonus - pay;
        


    //위의 값을 만들 때 생각보다 산술 복합 대입연산자가 사용되지 않았다. 만약 이것을 자동화 시키려면 어떻게 만드는 것이 좋을까?
//        데이터가 없는 사람이 기입하게 만들고 수익을 나오게 만들기
//        1. 설정을 넣을 수 있는 창 이름, 연봉, 보너스, 고정비
//        2. 그 달의 월급이 나올 수 있게 하는 부분 monthSalary = salary/12 + salary%12 지정을 해도 될 것 같다.
//        3. 수익이 나면 축하하는 문구 , 수익이 나지 않았다면 응원하는 문구

        /*
        * 사원 a의  8월달 월급을 구해라. -> 보너스까지 포함해서 세금계산하기, 계산 결과마다 소수점은 다 없애기
        * 연봉 = 30000000  8월달 보너스 = 500000  세금 = 3.3%
        * 만약 a사원의 8월달 세후 월급이 300만원이 넘는다면
        * if 310만원 = 축하드립니다. 이번 월급은 3000000원입니다.
        *   넘지 않는다면
        * if 250만원 = 이번 월급은 2500000원입니다.
        * */



//        데이터베이스 기반으로 한다면
//        1.두 사람의 정보에서 이름과 연봉은 상수, 보너스는 변수로 될 것이다.
//        2.그러므로 연봉을 월로 바꿔서 monthSalary = salary/12 + salary%12로 지정
//        3.보너스는 일괄적으로 기입 , 플러스해서 값 나올 수 있도록 만들자
//


//        논리연결연산자의 특징을 이용해서 한정판 굿즈 판매를 진행해보자
        final int PRICE = 30000;
        int purchase = 0;
        int totalProduct = 100;
        //구매를 했을 때 구매를 완료했다면 1 하지 않았다면 0이 되도록 메서드 설정 후 카운트가 올라가는 논리연결연산자
        int result = (purchase == 1 && true)? purchase : ++purchase;
        //만약 5대가 구매가 되었다면
        purchase = 5;
        int product = purchase;
        int leftProduct = totalProduct - product;
        int sales = PRICE * purchase;
        //매출과 남은 제품은
        System.out.println("매출 = " + sales);
        System.out.println("남은수량 = " + leftProduct);

        
        




        //num =- 5는 산술 복합 대입연산자가 아니라 -5를 대입한 것이다.
        //산술 복합 대입 연산자는 간단하면서도 중요해보인다. 다양하게 써보자
        //계산기 : 초기값으로 돌리려면 대상 -= 대상 - 초기값(상수)를 하면 좋을 것 같다.
        //뒤에 플플이나 마이너스는 항에서 직접적으로 작용하는 것이 아닌 항의 계산이 끝난 이후에 피연산자에 작용을 한다.
        //상품의 매출을 알아보는 항을 만들어보고 싶지만 스크립트에서 하는건가? 여기서 그 기능을 만드는 것 보다 js에서 연습을 하는게 좋을까?
        // 클릭을 할 때마다 purchase가 증가하는 모델 -> 한정판으로 판매하고 있는 모니터 남은 갯수를 화면에 나올 수 있도록 하고 상품 현재 매출을 파악할 수 있게 해보자
        // 상품 매출 = price * purchase++ 남은 개수  left_product = totalProduct - purchase
        //오늘 문제를 위의 &&와 ||연산자의 참인지 거짓인지 맞추는 버튼을 만들고 버튼을 누른 뒤 마지막 합산 스코어를 확인하는 문제
        //합산스코어에 따라 alert다르게 나오도록 하기
        //이전에 js에서 했던 if else 대신 :를 사용하는 것과 굉장히 유사해보인다. 그때는 물음표를 쓰지 않았던 것 같은데 나중에 찾아보고
        //비교해보자 만약 그때 쓰지 않았다면 이걸 자바의 용어들이나 이런 부분들의 적용이 다를지 물어보자 -> 오 썼었다. 복습한번 하자
    }
}
