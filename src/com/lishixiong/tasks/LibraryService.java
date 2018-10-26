package com.lishixiong.tasks;

import com.lishixiong.Utils.BooksUtils;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;

import static com.lishixiong.Utils.IOUtils.getScanner;
import static com.lishixiong.Utils.IOUtils.println;

/**
 * @author lishixiong
 * @since 2018/10/26 14:03
 * Singularity Sky Technologies Limited.
 */
public class LibraryService implements Runnable {
  private ScheduledExecutorService executors;

  public LibraryService(ScheduledExecutorService scheduledExecutorService) {
    this.executors = scheduledExecutorService;
  }

  @Override
  public void run() {
    try {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:MM:SS");
      simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT08:00"));
      println(MessageFormat.format("\n~~~图书馆管理系统，欢迎来上班{0}(按0退出)~~~\n",
          simpleDateFormat.format(new Date())));
      println("========1、增加书籍========\n" +
          "========2、调整书籍========\n" +
          "========3、查看书籍========\n" +
          "========4、删除书籍========\n");
      if ("q".equals(getScanner().nextLine())) {
        executors.shutdown();
        return;
      }
        try {
          int i = getScanner().nextInt();
          switch (i){
            case 1:{
              println("图书名字，类型，画质，适合人群，价格");
              BooksUtils.create(getScanner().nextLine(),getScanner().nextLine(),getScanner().nextLine(),getScanner().nextLine(),getScanner().nextBigDecimal());
              return;
            }
            case 2:{
              println("更改书架，名字，类型，画质，人群，价格");
              BooksUtils.update(getScanner().nextInt(),getScanner().nextLine(),getScanner().nextLine(),getScanner().nextLine(),getScanner().nextLine(),getScanner().nextBigDecimal());
              break;
            }
            case 3:{
              BooksUtils.read();
              break;
            }
            case 4:{
              println("删除书架号");
              BooksUtils.delete(getScanner().nextInt());
              break;
            }
            default:{
              println("命令不对，去学学再操作");
              return;
            }

          }

        }catch (Throwable t){
          println("不对，去学学怎么用");

        }


    } catch (Throwable t) {
      t.printStackTrace();

    }
  }


}
