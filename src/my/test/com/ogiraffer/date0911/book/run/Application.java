package my.test.com.ogiraffer.date0911.book.run;

import my.test.com.ogiraffer.date0911.book.DTO.BookDTO;

public class Application {

    public static void main(String[] args) {
        BookDTO basicC = new BookDTO();
        basicC.printInformation();

        BookDTO threeC = new BookDTO("자바의 정석", "도우출판", "남궁성");
        threeC.printInformation();

        BookDTO allC = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        allC.printInformation();
    }

}
