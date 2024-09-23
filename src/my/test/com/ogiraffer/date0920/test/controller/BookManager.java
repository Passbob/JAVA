package my.test.com.ogiraffer.date0920.test.controller;

import my.test.com.ogiraffer.date0920.test.model.comparator.AscBNo;
import my.test.com.ogiraffer.date0920.test.model.comparator.AscCategory;
import my.test.com.ogiraffer.date0920.test.model.comparator.DescCategory;
import my.test.com.ogiraffer.date0920.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookManager {


    private ArrayList<BookDTO> bookList;



    public BookManager(){
        bookList = new ArrayList<BookDTO>();
    }

    public void addBook(BookDTO book){
        bookList.add(book);
        book.setbNo(bookList.size());
    }


    public void deleteBook(int index){
        ArrayList<BookDTO> AscNum = new ArrayList<>();
        bookList.sort(new AscBNo());
        for(BookDTO book : bookList){
            AscNum.add(book);
        }
            bookList.remove(index);
            for(int i =0;i < bookList.size(); i++){
                int j = 1;
                j += i;
                bookList.get(i).setbNo(j);
            }


    }

    public int searchBook(String title){

        int match = 0;
        if(bookList.size() == 0){
            match = -1;
        }else {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getTitle().equals(title)) {
                    match = i;
                }
            }
        }
        return match;

    }

    public ArrayList<Integer> searchAllBook(String title){

        ArrayList<Integer> match = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getTitle().contains(title)) {
                match.add(i);
            }
        }
        return match;
    }

    public void printBook(int index){
        System.out.println(bookList.get(index));
    }
    public void printSearchBook(ArrayList<Integer> index){
        for (int i = 0; i < index.size(); i++) {
            int a = index.get(i);
            System.out.println(bookList.get(a));
        }
    }

    public void displayAll(){
        for (int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        ArrayList<BookDTO> AscOrDesc = new ArrayList<>();

        if(select == 1){
            bookList.sort(new AscCategory());
            for(BookDTO book : bookList){
                AscOrDesc.add(book);
            }
        }else if(select == 2){
            bookList.sort(new DescCategory());
            for(BookDTO book : bookList){
                AscOrDesc.add(book);
            }
        }
        return AscOrDesc;
    }

    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO book : br){
            System.out.println("book = " + book);
        }
    }

}
