package com.lishixiong.tasks;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;

import static com.lishixiong.Utils.IOUtils.getScanner;

/**
 * @author lishixiong
 * @since 2018/10/26 14:03
 * Singularity Sky Technologies Limited.
 */
public class Library implements Runnable {
  private ScheduledExecutorService executors;

  public Library(ScheduledExecutorService scheduledExecutorService) {
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
          "========4、删除书籍\n");
      if ("q".equals(getScanner().nextLine())) {
        executors.shutdown();
        return;
      }

    } catch (Throwable t) {

    }
  }

  private void println(String format) {
  }


}
