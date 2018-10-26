package com.lishixiong.Utils;

import java.util.Scanner;

/**
 * @author lishixiong
 * @since 2018/10/26 13:44
 * Singularity Sky Technologies Limited.
 */
public class IOUtils {
  public static void println(String string){
    System.out.println(string);
  }

  public static Scanner getScanner(){
    return new Scanner(System.in);
  }
}
