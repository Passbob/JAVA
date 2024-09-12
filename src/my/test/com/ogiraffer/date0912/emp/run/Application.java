package my.test.com.ogiraffer.date0912.emp.run;

import my.test.com.ogiraffer.date0912.emp.DTO.EmployeeDTO;
import my.test.com.ogiraffer.date0912.emp.DTO.EmployeeDTO2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO emp = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);

        System.out.print("직원번호 : ");
        emp.setNumber(sc.nextInt());
        System.out.print("직원이름 : ");
        emp.setName(sc.next());
        System.out.print("부서명 : ");
        emp.setDept(sc.next());
        System.out.print("직책 : ");
        emp.setJob(sc.next());
        System.out.print("나이 : ");
        emp.setAge(sc.nextInt());
        System.out.print("성별 : ");
        emp.setGender(sc.next().charAt(0));
        System.out.print("월급 : ");
        emp.setSalary(sc.nextInt());
        System.out.print("보너스 : ");
        emp.setBonusPoint(sc.nextDouble());
        System.out.print("전화번호 : ");
        emp.setPhone(sc.next());
        System.out.print("주소 : ");
        emp.setAddress(sc.nextLine());
        emp.setAddress(sc.nextLine());

        System.out.println("직원번호 : "+emp.getNumber());
        System.out.println("직원이름 : "+emp.getName());
        System.out.println("부서명 : "+emp.getDept());
        System.out.println("직책 : "+emp.getJob());
        System.out.println("나이 : "+emp.getAge());
        System.out.println("성별 : "+emp.getGender());
        System.out.println("월급 : "+emp.getSalary());
        System.out.println("보너스 : "+emp.getBonusPoint());
        System.out.println("전화번호 : "+emp.getPhone());
        System.out.println("주소 : "+emp.getAddress());




//        public static void main(String[] args) {
//
//
//            EmployeeDTO2 emp = new EmployeeDTO2();
//            Scanner sc = new Scanner(System.in);
//            String[] Q = new String[]{"직원번호", "직원이름", "부서", "직책", "나이", "성별", "연봉", "보너스", "전화번호", "주소"};
//            String[] ans = new String[10];
//
//            for (int i = 0; i < Q.length; i++) {
//                System.out.println(Q[i] + " : ");
//
//                String A = sc.nextLine();
//                emp.setAnswer(A);
//                ans[i] = emp.getAnswer();
//            }
//
//            for (int i = 0; i < Q.length; i++) {
//                System.out.println(Q[i]+" : "+ans[i]);
//            }
//        }
    }
}
