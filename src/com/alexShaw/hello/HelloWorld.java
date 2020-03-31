package com.alexShaw.hello;
import java.util.Scanner;

/**
 * @Author:alexShaw
 * @Date:2020/3/31 1:28
 */
public class HelloWorld {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请您输入内容：");
        int contents=input.nextInt();
        String contents1=input.next();
        System.out.println(contents+" "+contents1);
        System.out.println("HelloWorld\n");
        input.close();
    }
}
