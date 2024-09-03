package my.firstweek;

public class b_variable_constant {
    public static void main(String[] args) {
    /*
    * 변수는 값이 변할 수 있고 간단하고 편리하게 표현하기 위해서 필요하다
    * */

        /*sout = System.out.printIn();을 불러오는 단축키*/

        // soutv = 위의 값을 sout에 바로 불러올 수 있는 단축키`

        //위처럼 스택이 쌓이는데 그걸 초기화 하고 다시 하는 방법은? -> 한 달 주기마다 사람들이 구매한 값을 초기화 시키기`


        //자료형

        //정수
        byte bnum; //1byte
        short snum; //2byte
        int inum; //4byte
        long lnum; //8byte
        //상수
        float fnum; //4byte
        double dnum; //8byte
        //문자
        char ch; //2byte
        //논리
        boolean isTrue; //1byte

        //문자열 취급
        String str; //4byte (엄밀히 따지자면 주소값이 4byte 정수형)

        //long와 float는 뒤에 문자가 붙음
        lnum = 100L;
        fnum = 5.2f;
        //boolean은 true와 false만 들어갈 수 있음

        //상수
        final int AGE;
        //상수는 앞에 final을 붙이고 변수 이름을 대문자, 숫자, 단어 연결 시 언더스코어(_)로 기입한다.

        //오버플로우와 언더플로우
        //오버플로우가 일어나면 최소값으로 순환시킨 뒤에 거기서부터 계산한다.
        //언더플로우는 반대로 최대값으로 순환시킨 뒤 거기서부터 계산`


        //데이터 형변환
        //자동 형변환과 강제 형변환이 있다. 자바에서 같은 데이터 타입끼리만 연산을 수행할 수 있기 때문에 변환을 해야한다.

        //자동 형변환
        //작은 자료형에서 큰 자료형으로는 자동으로 형변환 된다. -> 같은 바이트도 안됨
        //정수에서 실수로 가능
        //문자는 int형으로 자동 형변환
        //논리형은 형변환 규칙에서 제외된다.

        //강제 형변환
        //위를 제외한 상황에서는 강제형변환이 필요하지만 논리형은 제외다.

        //형변환 시 데이터 손실에 유의해야하는데 의도해서 데이터를 손실시킬 수 있다. ex)소수점 없애기

//        a사원의 salary + bonus 만들자

        String employee = "조형석";
        int salary = 1000000;
        int bonus = 500000;

        System.out.println(employee+"사원의 이번 달 월급은 "+(salary + bonus)+"원 입니다.");

        long total = salary + bonus;

        System.out.println(employee+"가 최우수 사원이 되어 보너스를 더블로 받았네요! 이번달 월급은 "+(total + bonus)+"입니다!");

        long triple = total + bonus;

        System.out.println("사장님이 미쳤어요! "+ employee+"가 트리플로 받았네요! 이번달 월급은 "+(triple + bonus)+"입니다!");

        int min = (int)triple - bonus*2;

        System.out.println("아...사장님이 화났어요..." + min + "가 최종 월급입니다...");


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

    }
}
