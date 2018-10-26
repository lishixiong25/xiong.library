package com.lishixiong.Utils;

import com.lishixiong.model.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lishixiong
 * @since 2018/10/26 14:38
 * Singularity Sky Technologies Limited.
 */
public class BooksUtils {
  private static List<Book> books = new ArrayList<>();

  public static void get(int index) {
    if (index >= books.size()) {
      if (index >= books.size()) {
        throw new Error("操作有误,请重试");
      }
      Book book = books.get(index);
      System.out.println(book.toString());
    }
  }

  public static void update(int index, String bookName, String bookType, String bookPictureQuality, String bookSuitable, BigDecimal bookPrice) {
    Book book = books.get(index);
    book.setBookName(bookName);
    book.setBookType(bookType);
    book.setBookPictureQuality(bookPictureQuality);
    book.setBookSuitable(bookSuitable);
    book.setBookPrice(bookPrice);
  }

  public static void read() {
    for (int i = 0; i < books.size(); i++) {
      Book book = books.get(i);
      System.out.println("<" + i + ">" + book.toString());
    }
  }

  public static void create(String bookName, String bookType, String bookPictureQuality, String bookSuitable, BigDecimal bookPrice) {
    Book book = new Book();
    book.setBookName(bookName);
    book.setBookType(bookType);
    book.setBookPictureQuality(bookPictureQuality);
    book.setBookSuitable(bookSuitable);
    book.setBookPrice(bookPrice);
    books.add(book);
  }

  public static void delete(int index) {
    if (index >= books.size()) {
      throw new Error("会不会用？重新再试试");
    }
    books.remove(index);
  }
}
