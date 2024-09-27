package my.baekjoon.date0925;

import java.util.Scanner;

public class Main1 {
//왜 안올라가지냐
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();
        double pow = 0;
        int NoPow = 0;
        if((1 <= min) && (max >= min) && (max <= 1000000+min)) {
                for(int i = 2; i<=max; i++ ){
                    pow = Math.pow(i,2);
                    System.out.println(pow);
                    if(pow > max){
                        break;
                    }
                    if((int)pow == 1){
                        continue;
                    }else {
                        if(pow == 4.0) {
                            for (int j = min; j <= pow; j++) {
                                if (j % (int) pow != 0) {
                                    System.out.println(j % (int) pow);
                                    NoPow++;
                                }
                            }
                        }else{
                            for (int j = (int)(Math.pow(i-1, 2)+1); j <= pow; j++) {
                                if (j % (int) pow != 0) {
                                    System.out.println(j % (int) pow);
                                    NoPow++;
                                }
                            }
                        }
                    }


                    }

        }
        System.out.println(NoPow);




    }

}
