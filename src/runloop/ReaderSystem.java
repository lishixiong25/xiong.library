package runloop;

import dodel.Book;
import dodel.Library;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lishixiong
 * @since 2018/10/31 13:01
 * Singularity Sky Technologies Limited.
 */
public class ReaderSystem {
  private static Library library = new Library();
  public static void run(){
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("\n读毛书，挣钱\n");
    System.out.println(" ");
    System.out.println(" ");
      LookBookShelves();         //显示图书书架信息
      System.out.println("选择一个书架序号看图书");
      int indexOfShelf = new Scanner(System.in).nextInt(); //定义indexofshelf用来存储输入书架编号信息
      Set<Book> books = library.getShelves().get(indexOfShelf);//定义book用来存储书架信息
      for (Book book : books) {            //遍历循环book的数组
        System.out.println(book.toString());
      }


    }

  private static void LookBookShelves() {
    List<Set<Book>> shelves = library.getShelves();  //列举图书馆模型中获得书架图书信息，并加入到新shelves分组
    for (int i = 0; i < shelves.size(); i++) {    //遍历新建书架分组，显示图书数量
      Set<Book> books = shelves.get(i);   //建立books用来存储书架信息
      System.out.println("<" + i + "> 一共有" + books.size() + "本书");
    }
  }

}
