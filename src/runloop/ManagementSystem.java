package runloop;

import dodel.Book;
import dodel.Library;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lishixiong
 * @since 2018/10/31 13:01
 * Singularity Sky Technologies Limited.
 */
public class ManagementSystem {

  private static Library library = new Library();

  public static void run() {
    for (; ; ) {
      try {
        System.out.println("\n欢迎进入瞎BB图书馆管理系统\n" +
            "1、查看书架（已经添加的书架）\n" +
            "2、管理图书(将新书放到相应书架)\n" +
            "3、新增图书(录入新书信息)\n" +
            "4、查询书籍(根据需求查看书籍信息)\n" +
            "5、新建一个书架");
        int opertion = new Scanner(System.in).nextInt();
        switch (opertion) {
          case 1: {
            LookBookShelves();
            break;
          }
          case 2: {
            ManageBook();
            break;
          }
          case 3: {
            IncreaseBook();
            break;
          }
          case 4: {
            FindBook();
            break;
          }
          case 5: {
            IncreaseNewShelves();
            break;
          }
          default: {
            return;
          }
        }


      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
  }

  /**
   * 新增加书架
   */

  private static void IncreaseNewShelves() {
    library.getShelves().add(new HashSet<>());//调用图书管理中的书架信息，进行hashset累加
    LookBookShelves();   //显示书架

  }


  /**
   * 显示图书书架
   */
  private static void LookBookShelves() {

    List<Set<Book>> shelves = library.getShelves();  //列举图书馆模型中获得书架图书信息，并加入到新shelves分组
    for (int i = 0; i < shelves.size(); i++) {    //遍历新建书架分组，显示图书数量
      Set<Book> books = shelves.get(i);   //建立books用来存储书架信息
      System.out.println("<" + i + "> 一共有" + books.size() + "本书");
    }
  }


  /**
   * 查询书籍
   */
  private static void FindBook() {
    LookBookShelves();         //显示图书书架信息
    System.out.println("选择一个书架序号看图书");
    int indexOfShelf = new Scanner(System.in).nextInt(); //定义indexofshelf用来存储输入书架编号信息
    Set<Book> books = library.getShelves().get(indexOfShelf);//定义book用来存储书架信息
    for (Book book : books) {            //遍历循环book的数组
      System.out.println(book.toString());
    }


  }

  /**
   * 新增书籍
   */

  private static void IncreaseBook() {
    System.out.println("书名\n");
    String name = new Scanner(System.in).nextLine();
    System.out.println("作者\n");
    String author = new Scanner(System.in).nextLine();
    System.out.println("描述\n");
    String descrition = new Scanner(System.in).nextLine();
    Book book = new Book();   //将书籍信息定义为book 调用
    book.setName(name);   //调用姓名
    book.setAuthor(author);
    book.setDescrition(descrition);
    library.getNewBooks().add(book);  //调用图书馆的书籍，并累加书籍
  }


  /**
   * 管理图书
   */
  private static void ManageBook() {
    List<Book> newBooks = library.getNewBooks();  //创建newbooks结合，用来调用图书馆图书信息
    for (Book newBook : newBooks) {             //遍历Book来查找属性为newBooks的相关信息存储到新书newbook当中
      System.out.println(newBook.toString());      //显示newbook的信息
      System.out.println("将此书归类到书架吗？输入书架号归类 ，-1 跳过本书：");
      int i = new Scanner(System.in).nextInt();   //输入命令信息
      if (i == -1) {
        continue;
      }
      library.getNewBooks().remove(newBook);  //将获取的图书信息 传至新书集合中
      library.getShelves().get(i).add(newBook);//
      return;
    }
  }

}
