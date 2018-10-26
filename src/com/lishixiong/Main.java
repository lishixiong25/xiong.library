package com.lishixiong;

import com.lishixiong.tasks.Library;
import com.lishixiong.tasks.ReadBook;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.lishixiong.Utils.IOUtils.getScanner;
import static com.lishixiong.Utils.IOUtils.println;

/**
 * @author lishixiong
 * @since 2018/10/26 13:36
 * Singularity Sky Technologies Limited.
 */
public class Main {
  public static void main(String[] args) {
    for (; ; ) {
      try {
        println("进入图书馆\n" +
            "0、回家\n" +
            "1、图书管理员的身份\n" +
            "2、读者身份");

        int i = getScanner().nextInt();
        switch (i) {
          case 0: {
            println("走了");
            return;
          }
          case 1: {
            launghCalculatorUtilsTerminated();
            break;
          }
          case 2:{
            launghReaderBookUtilsTerminated();
          }
          default: {
            println("砸场子？滚开一点点");
            break;
          }
        }


      } catch (Throwable t) {
        println("ˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉˉ");

      }
    }
  }

  private static void launghReaderBookUtilsTerminated() {
    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    scheduledExecutorService.scheduleWithFixedDelay(new ReadBook(scheduledExecutorService),1,1,TimeUnit.MILLISECONDS);

    for(; ; ){
      if(scheduledExecutorService.isTerminated()){
        println("人家真的不看书了");
        break;
      }
    }


  }

  private static void launghCalculatorUtilsTerminated() {
    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    scheduledExecutorService.scheduleWithFixedDelay(new Library(scheduledExecutorService), 1, 1, TimeUnit.MILLISECONDS);
    for (; ; ) {
      if (scheduledExecutorService.isTerminated()) {
        println("已经离开挺老远了,人家下班了~");
        break;
      }
    }

  }


}
