package dodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author lishixiong
 * @since 2018/10/31 12:52
 * Singularity Sky Technologies Limited.
 */
public class Library {
  private List<Book> newBooks;
  private List<Set<Book>> shelves;

  public List<Book> getNewBooks() {
    if (newBooks == null) {
      newBooks = new ArrayList<>();
    }
    return newBooks;
  }

  public void setNewBooks(List<Book> newBooks) {
    this.newBooks = newBooks;
  }

  public List<Set<Book>> getShelves() {
    if (shelves == null) {
      shelves = new ArrayList<>();
    }
    return shelves;
  }

  public void setShelves(List<Set<Book>> shelves) {
    this.shelves = shelves;
  }
}
