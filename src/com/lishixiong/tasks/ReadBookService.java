package com.lishixiong.tasks;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;

import static com.lishixiong.Utils.IOUtils.getScanner;

/**
 * @author lishixiong
 * @since 2018/10/26 13:43
 * Singularity Sky Technologies Limited.
 */
public class ReadBookService implements Runnable {
  private ScheduledExecutorService executors;

  public ReadBookService(ScheduledExecutorService scheduledExecutorService) {
    this.executors = scheduledExecutorService;
  }

  @Override
  public void run() {
    try {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:MM:SS");
      simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT08:00"));
      println(MessageFormat.format("\n====开始无脑看书模式{0}(按q退出，任意继续)====\n",
          simpleDateFormat.format(new Date())));
      println("======== 1、选择书籍 ========\n" +
          "======== 2、还   书 ========\n" +
          "======== 3、选择书架 ========\n");
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
