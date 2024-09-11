package my.enjoy.hj;

public class MethodHj {

    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();
        int randomNum = random.nextInt(16) - 5 ;
        System.out.println("난수의 절대값 = " + Math.abs(randomNum));



    }

}
