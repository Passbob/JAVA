package my.firstweek;

public class a_literal {
    public static void main(String[] args) {
         /*자바 만들 때 어떻게 진행해야할까?
    1. 프로젝트가 없을 시 새 프로젝트를 생성한다.
    2. 프로젝트 생성 후 패키지를 만든다 -> 패키지는 foldername1.foldername2 식으로 .을 붙이면 하위 폴더를 생성
    3. 그 안에 new -> java로 원하는 파일명을 만든다.
    4. class filename 안에 main을 넣고 코딩을 진행한다.
    */

//      sout = System.out.printIn();을 호출하는 단축어
        System.out.println(1);  //정수
        System.out.println(1.4); //실수
        System.out.println('a'); //문자
        System.out.println("asdf"); //문자열
        System.out.println(true); //논리
        // 문자는 유니코드로 인해 숫자로 인식되기 때문에 사칙연산 모두 가능
        // + = 합 ,- = 차 ,* = 곱 ,/ = 나눈 몫 ,% = 나눈 나머지



        //사칙연산에 대하여 -> 사칙연산은 기본적으로 왼쪽에서 오른쪽으로 진행되지만 괄호가 있다면 내부의 값부터 계산한다.
        //정수랑 실수랑 문자는 서로 사칙연산이 모두 가능하다.
        // 하지만 문자열은 +만 가능하며 계산이 되는 값들을 문자열로 바꿔 문자열 합치기가 일어난다. -> 위의 4가지 모두와 +가능
        // 논리는 문자열의 + 즉, 문자열 합치기를 제외하고는 사칙연산 사용이 불가하다.

        //문자열 합치기는 같이 계산되는 값들을 모두 문자열로 반환한다. 하지만 괄호안의 값이 먼저 계산되기 때문에
        //만약, 정수 or 실수 or 문자 값의 합을 먼저 한 뒤에 문자열로 합치길 원한다면 괄호를 쓰자
        System.out.println("이건 문자열로 된다." + 1 + 2 );
        System.out.println(1 + 2 + "이건 왼쪽부터 오른쪽으로 가니까 1+2가 먼저 실행되어 3이 문자열이랑 더해진다." );
        System.out.println("이건 괄호 안 먼저 계산되기 때문에 12가 아닌 3이 뒤에 붙는다." + (1 + 2) );


        //행을 복사하려면 Ctrl+D,  행 잘라내려면 Ctrl+X 나머지는 vs랑 비슷한데 뭔가 타이핑이 이상하면 insert눌렀는지 확인
    }
}
