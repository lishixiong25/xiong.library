import runloop.ManagementSystem;
import runloop.ReaderSystem;

import java.util.Scanner;

/**
 * @author lishixiong
 * @since 2018/10/31 12:47
 * Singularity Sky Technologies Limited.
 */
public class Main {
  public static void main(String[] args) {
    for (; ; ) {
      try {
        System.out.println("1、管理员身份\n" +
            "2、读者身份");
        int i = new Scanner(System.in).nextInt();
        if (i == 1) {
          ManagementSystem.run();
        }
        if (i == 2) {
          ReaderSystem.run();
        }


      } catch (Throwable t) {

      }
    }
  }
}
