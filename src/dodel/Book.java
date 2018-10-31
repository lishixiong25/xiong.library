package dodel;

import java.util.Objects;

/**
 * @author lishixiong
 * @since 2018/10/31 12:52
 * Singularity Sky Technologies Limited.
 */
public class Book {
  private String name;
  private String author;
  private String descrition;

  @Override
  public String toString() {
    return "图书信息{" +
        "书名：'" + name + '\'' +
        ", 作者：'" + author + '\'' +
        ", 描述：'" + descrition + '\'' +
        '}';
  }

  public Book() {
    this.name = name;
    this.author = author;
    this.descrition = descrition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return Objects.equals(name, book.name) &&
        Objects.equals(author, book.author) &&
        Objects.equals(descrition, book.descrition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, author, descrition);
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getDescrition() {
    return descrition;
  }

  public void setDescrition(String descrition) {
    this.descrition = descrition;
  }
}
