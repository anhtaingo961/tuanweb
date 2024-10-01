/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import models.coder;

/**
 *
 * @author LOQ
 */
public class OOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        coder coder1 = new coder();
        coder[] coder = {
            new coder1(),
            new coder2(),
            new coder3()
                    };
        System.out.println("nhập tên ");
        String name = sc.next();
        coder1.setName(name);
        System.out.println("yêu cầu nhập tuổi");
        int age = sc.nextInt();
        coder1.setAge(age);
        while (coder1.getAge() == 0) {
            age = sc.nextInt();
            coder1.setAge(age);
        }
        System.out.println("yêu cầu nhập số điện thoại");
        String phone = sc.next();
        coder1.setPhone(phone);
        System.out.println("yêu cầu nhập ngôn ngữ lập trình");
        System.out.println("\tnhap lua chon cua ban");
        System.out.println("1. java");
        System.out.println("2. C");
        System.out.println("3. C#");
        System.out.println("4. phython");
        int lc = sc.nextInt();
        switch (lc) {
            case 1:
                System.out.println("ban da chon java");
                coder1.setPrograming_language("java");

                break;
            case 2:
                System.out.println("ban da chon C");
                coder1.setPrograming_language("C");

                break;
            case 3:
                System.out.println("ban da chon c#");
                coder1.setPrograming_language("c#");

                break;
            case 4:
                System.out.println("ban da chon python");
                coder1.setPrograming_language("python");

                break;
            default:
                throw new AssertionError();
        }
        System.out.println("ten" + coder1.getName() + "\ntuoi" + coder1.getAge() + "\nsdt" + coder1.getPhone() + "\nngon ngu lap trinh" + coder1.getPrograming_language());
    }
}
