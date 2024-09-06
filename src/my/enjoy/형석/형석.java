package my.enjoy.형석;

public class 형석 {

    public static void main(String[] args) {
        //         인조이조의 총합 점수를 계산하려고 한다. 최종점수가 정수(int)로 나오도록 만들어라 프로젝트퀄리티의 최고점은 D이다.
//         최종점수 계산법 = 랭킹 : 1등 10점, 2등 8점, 3등 6점 / 퀄리티점수 : 유니코드 숫자 / 프로젝트점수 스코어 곱하기 프로젝트갯수
//         인조이 조의 랭킹은 1등(byte), 프로젝트수는 3개(long), 스코어는 95.8(float), 퀄리티는 D(char)이다.

        byte ranking = 1;
        long projects = 3L;
        float Score = 95.8f;
        char projectQulity = 'D';


        ranking = 10;
        int projectScore = (int)(Score * projects);
        int total1 = projectScore + ranking + projectQulity;
        System.out.println("최종점수 = " + total1);



        /*
         * 사원 a의  8월달 월급을 구해라. -> 보너스까지 포함해서 세금계산하기, 계산 결과마다 소수점은 다 없애기
         * 연봉 = 30000000 보너스 = 500000  세금 = 3.3%
         * 만약 a사원의 8월달 세후 월급이 300만원이 넘는다면
         * if 310만원 = 축하드립니다. 이번 월급은 3000000원입니다.
         *   넘지 않는다면
         * if 250만원 = 이번 월급은 2500000원입니다.
         * */


        int aSalary24 = 30000000;
        int aAugustSalary = aSalary24/12;
        System.out.println("aAugustSalary = " + aAugustSalary);
        int bonus = 500000;
        double tax = 3.3;

        int aAugustRevenue = (int)((double)(aAugustSalary + bonus)/100 * (100-tax));
        System.out.println("aAugustRevenue = " + aAugustRevenue);

        String resurlt3 = (aAugustRevenue>=3000000)? "축하드립니다. 이번 월급은 " + aAugustRevenue + "원입니다." : "이번 월급은 " + aAugustRevenue + "원입니다.";
        System.out.println("결과 = " + resurlt3);

    }

}
