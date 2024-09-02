package my.firstweek;

public class variable_constant {
    public static void main(String[] args) {
    /*
    * 변수는 값이 변할 수 있고 간단하고 편리하게 표현하기 위해서 필요하다
    * */

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



        /*sout = System.out.printIn();을 불러오는 단축키*/

        // soutv = 위의 값을 sout에 바로 불러올 수 있는 단축키`

        //위처럼 스택이 쌓이는데 그걸 초기화 하고 다시 하는 방법은? -> 한 달 주기마다 사람들이 구매한 값을 초기화 시키기`




    }
}
