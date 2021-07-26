package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("请输入账号:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();
        if("123".equals(name)){
            if("123".equals(password)){
                System.out.println("登陆成功!");
                sc.nextLine();
            }else {
                System.out.println("账号或密码错误，请重试!");
                main(null);
            }
        }else {
            System.out.println("账号或密码错误，请重试!");
            main(null);
        }

    }
}
