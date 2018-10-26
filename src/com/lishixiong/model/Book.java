package com.lishixiong.model;

import java.math.BigDecimal;

/**
 * @author lishixiong
 * @since 2018/10/26 13:42
 * Singularity Sky Technologies Limited.
 */
public class Book {
  @Override
  public String toString() {
    return "Book{" +
        "bookName='" + bookName + '\'' +
        ", bookType='" + bookType + '\'' +
        ", bookPictureQuality='" + bookPictureQuality + '\'' +
        ", bookSuitable='" + bookSuitable + '\'' +
        ", bookPrice=" + bookPrice +
        '}';
  }

  private String bookName;
  private String bookType;
  private String bookPictureQuality;
  private String bookSuitable;
  private BigDecimal bookPrice;

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getBookType() {
    return bookType;
  }

  public void setBookType(String bookType) {
    this.bookType = bookType;
  }

  public String getBookPictureQuality() {
    return bookPictureQuality;
  }

  public void setBookPictureQuality(String bookPictureQuality) {
    this.bookPictureQuality = bookPictureQuality;
  }

  public String getBookSuitable() {
    return bookSuitable;
  }

  public void setBookSuitable(String bookSuitable) {
    this.bookSuitable = bookSuitable;
  }

  public BigDecimal getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(BigDecimal bookPrice) {
    this.bookPrice = bookPrice;
  }
}
