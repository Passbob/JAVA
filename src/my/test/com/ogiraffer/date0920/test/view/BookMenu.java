package my.test.com.ogiraffer.date0920.test.view;

import my.test.com.ogiraffer.date0920.test.controller.BookManager;
import my.test.com.ogiraffer.date0920.test.model.dto.BookDTO;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu(){}

    public void menu(){

        int select = 0;
        do {
//        도서관리 프로그램
            System.out.println("1. 새 도서 추가  2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제  4. 도서 검색 출력");
            System.out.println("5. 전체 출력  6. 끝내기");
            System.out.print("메뉴 번호를 선택해주세요. : ");
            select = sc.nextInt();
            System.out.println();


            switch (select) {
                case 1 :
                    bm.addBook(inputBook());
                    break;

                case 2 :
                    System.out.print("정렬방식을 선택해주세요. : ");
                    int choice = sc.nextInt();
                    System.out.println();
                    if (choice == 1 || choice == 2) {
                        ArrayList<BookDTO> good = bm.sortedBookList(choice);
                        bm.printBookList(good);
                    } else {
                        System.out.println("번호를 잘못입력하였습니다.");
                    }
                    break;

                case 3 :
                    String deleteSearch = inputBookTitle();
                    int deleteBook = bm.searchBook(deleteSearch);
                    bm.deleteBook(deleteBook);
                    if (deleteBook != -1){
                        System.out.println("성공적으로 삭제");
                    }else{
                        System.out.println("삭제할 책이 존재하지 않음");
                    }
                    break;
                case 4 :
                    String title = inputBookTitle();
                    System.out.println(title);
                    int searchBook = bm.searchBook(title);
                    if(searchBook == -1){
                        System.out.println("조회한 도서가 존재하지 않음");
                    }else {
                        bm.printBook(searchBook);
                    }
                    break;

                case 5 :
                    bm.displayAll();
                    break;
            }

        }while(!(select == 6));

    }

    public BookDTO inputBook(){
//        도서 번호 >>임의 값 입?
        System.out.print("도서 번호를 입력해주세요.: ");
        int bookNum = sc.nextInt();
        System.out.println();
//        도서 제목
        System.out.println("도서 제목을 입력해주세요. : ");
        sc.nextLine();
        String bookTitle = sc.nextLine();

        System.out.println();
//        도서 장르
        System.out.println("장르를 선택하세요. (1. 인문/2. 자연과학/3. 의료/4. 기타)");
        int bookCategory = sc.nextInt();
        System.out.println();
//        도서 저자
        System.out.println("도서 저자를 입력해주세요. : ");
        sc.nextLine();
        String bookAuthor = sc.nextLine();
        System.out.println();
        BookDTO bt = new BookDTO(bookNum, bookCategory, bookTitle, bookAuthor);


        return bt;
    }

    public String inputBookTitle(){
        System.out.print("도서 제목을 입력해주세요. : ");
        sc.nextLine();
        String bookTitle = sc.nextLine();
        return bookTitle;
    }

}
