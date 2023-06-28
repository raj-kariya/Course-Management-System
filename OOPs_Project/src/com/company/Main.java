package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Student st = new Student();
        Faculty f = new Faculty();
        Admin a = new Admin();

        Scanner sc
                = new Scanner(System.in);
        while (st.login) {
            System.out.println("--------------------------------------------");
            System.out.println("Login Form");
            System.out.println("--------------------------------------------");
            System.out.println("1. Student Login");
            System.out.println("2. Staff Login");
            System.out.println("-1. Exit");
            System.out.println("--------------------------------------------");
            int x;
            x = sc.nextInt();
            if(x==1)
            {
                st.StudentManagementSystem();
            }
            else if(x==2)
            {
                System.out.println("--------------------------------------------");
                System.out.println("Login Form");
                System.out.println("--------------------------------------------");
                System.out.println("1. Faculty Login");
                System.out.println("2. Admin Login");
                System.out.println("--------------------------------------------");
                int y;
                y= sc.nextInt();
                if(y==1) {
                    f.FacultyManagementSystem();
                }
                else if(y==2)
                {
                    a.AdminManagementSystem();
                }
            }
            else
            {
                break;
            }
        }
    }
}
