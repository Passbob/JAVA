package my.enjoy.ys;

public class OperatorYs {
    public static void main(String[] args) {
        // 정사각형의 넓이와 둘레를 구하는 문제이다.
        // 너비 25 높이 25를 변수에 저장하고
        // 너비와 높이가 같은지 비교하고
        // 각각 넓이와 둘레를 계산해 변수에 담고
        // 밑에 예시와 똑같이 출력 되게 해주세요
    int width = 25;
    int height = 25;
    int area = (width * height);
    int sum = ((width*2) + (height*2));

    System.out.println("넓이 : " + area);
    System.out.println("둘레 : " + sum);
    System.out.println("너비와 높이가 같은지 비교 : " + (width == height));

        // 예시
//        넓이 : 625
//        둘레 : 100
//        너비와 높이가 같은지 비교 : true
    }
}
