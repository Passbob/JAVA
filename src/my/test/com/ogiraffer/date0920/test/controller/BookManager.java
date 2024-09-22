package my.test.com.ogiraffer.date0920.test.controller;

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
    }


    public void deleteBook(int index){

        bookList.remove(index);

    }

    public int searchBook(String title){

        int match = 0;
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getTitle().equals(title)) {
                match = i;
            }
        }
        return match;

    }    public ArrayList<Integer> searchAllBook(String title){

        ArrayList<Integer> match = new ArrayList<>();
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getTitle().equals(title)) {
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
