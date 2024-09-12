package my.test.com.ogiraffer.date0912.emp.run;

import my.test.com.ogiraffer.date0912.emp.DTO.EmployeeDTO2;

import java.util.Scanner;

public class Application2 {

            public static void main(String[] args) {


            EmployeeDTO2 emp = new EmployeeDTO2();
            Scanner sc = new Scanner(System.in);
            String[] Q = new String[]{"직원번호", "직원이름", "부서", "직책", "나이", "성별", "연봉", "보너스", "전화번호", "주소"};
            String[] ans = new String[10];

            for (int i = 0; i < Q.length; i++) {
                System.out.println(Q[i] + " : ");
                String A = sc.nextLine();
                emp.setAnswer(A);
                ans[i] = emp.getAnswer();
            }

            for (int i = 0; i < Q.length; i++) {
                System.out.println(Q[i]+" : "+ans[i]);
            }
        }
}
