package com.company;

import javax.sound.midi.Soundbank;
import java.util.IllegalFormatCodePointException;
import java.util.Objects;
import java.util.Scanner;

public class Admin {

    String[] Admin = new String[8];
    final private String[] AdminPassword = new String[8];
    int i;
    Scanner sc = new Scanner(System.in);
    int[] Student_ID = new int[10];
    String[] Student_name = new String[10];
    String[] mailid = new String[10];
    String[] Course = new String[15];

    int[] CourseId = new int[10];

    String[] Fname = new String[10];

    String[] department = new String[10];
    String[] coursesoffered = new String[10];
    String[] qualifications = new String[10];

    String[] Fmailid = new String[10];

    void AdminManagementSystem() throws Exception {
        System.out.println("-----------------------------------------------");
        System.out.print("Username: ");
        Admin[i] = sc.next();
        System.out.print("Password: ");
        AdminPassword[i] = sc.next();
        System.out.println("-----------------------------------------------");
        try {
            if (Objects.equals(Admin[i], "admin") && Objects.equals(AdminPassword[i], "admin")) {
                boolean AdminManegement = true;

                Thread.sleep(1000);
                System.out.println();
                System.out.println();
                System.out.println("Welcome Admin !");
                System.out.println();
                System.out.println();
                System.out.println("-----------------------------------------------");

                while (AdminManegement) {
                    System.out.println("***************************************************");
                    System.out.println("1. Students");
                    System.out.println("2. Faculties");
                    System.out.println("3. Courses");
                    System.out.println("4. Logout");
                    System.out.println("***************************************************");

                    int Amanagement;
                    Amanagement = sc.nextInt();

                    if (Amanagement == 4) {
                        AdminManegement = false;
                        break;
                    }

                    else if (Amanagement == 1) {
                        boolean stuManagement = true;

                        while (stuManagement) {

                        System.out.println("-----------------------------------------------");
                        System.out.println("1. Add Student");
                        System.out.println("2. Remove Student");
                        System.out.println("3. View Student List");
                        System.out.println("4. Exit");
                        System.out.println("-----------------------------------------------");

                        int Smanagement;
                        Smanagement = sc.nextInt();



                            if (Smanagement == 1) {
                                try {
                                    Scanner Stu = new Scanner(System.in);
                                    System.out.print("Add Student Name : ");
                                    Student_name[i] = Stu.next();
                                    System.out.print("Add Student Id : ");
                                    Student_ID[i] = Stu.nextInt();
                                    System.out.print("Add MailID: ");
                                    mailid[i] = Stu.next();
                                    System.out.print("Add Branch: ");
                                    department[i] = Stu.next();
                                    break;
                                    //stuManagement = false;
                                } catch (Exception e) {
                                    System.out.println("Unexpected error!!");
                                    System.out.println(e);
                                }
                            } else if (Smanagement == 2) {

                                    Student_name[i] = Student_name[i + 1];
                                    Student_ID[i] = Student_ID[i + 1];
                                Thread.sleep(400);
                                System.out.println("Student Removed!");
                                break;
                            } else if (Smanagement == 3) {
                                Thread.sleep(1000);
                                System.out.println("-----------------------------------------------");
                                System.out.println("List of the Students");
                                System.out.println("-----------------------------------------------");
                                System.out.println("202103002 - Aadesh Minz");
                                System.out.println("202103003 - Kalp Shah");
                                System.out.println("202103004 - Parag Sharma");
                                System.out.println("202103005 - Kanishk Dad");
                                System.out.println("202103006 - Arman Makhani");
                                System.out.println("202103007 - Keertivardhan Goyel");
                                System.out.println("202103008 - Rishit Vaghela");
                                System.out.println("202103009 - Shreyansh Jain");
                                System.out.println("202103010 - Parv Agrawal");
                                System.out.println("202103011 - Shrut Sutariya");
                                System.out.println("202103013 - Mit Desai");
                                System.out.println("202103015 - Asish Joel");
                                System.out.println("202103016 - Manav Shah");
                                System.out.println("202103017 - Dhruv Shah");
                                System.out.println("202103018 - Kunj Kapadiya");
                                System.out.println("202103020 - M Akhyayeeka");
                                System.out.println("202103021 - Arsh Jindal");
                                System.out.println("202103022 - Vatsal Shah");
                                System.out.println("202103023 - Aditya Tanna");
                                System.out.println("202103024 - Aditya Meher");
                                System.out.println("202103025 - Aditya Bhatt");
                                System.out.println("202103026 - Aarzoo Khambhoo");
                                System.out.println("202103027 - Shruti Verma");
                                System.out.println("202103029 - Saravgana Khatri");
                                System.out.println("202103030 - Vraj Patel");
                                System.out.println("202103031 - Rajnandini Ambasana");
                                System.out.println("202103033 - Dhruv Goti");
                                System.out.println("202103034 - Harsh Vaghela");
                                System.out.println("202103035 - Sanjay Kodiyatar");
                                System.out.println("202103037 - Srushti Kaneriya");
                                System.out.println("202103038 - Dharmik Solanki");
                                System.out.println("202103039 - Harit Rajkotiya");
                                System.out.println("202103040 - Pranav Patel");
                                System.out.println("202103042 - Jay Rathod");
                                System.out.println("202103043 - Dhruti Patel");
                                System.out.println("202103044 - Manan Patel");
                                System.out.println("202103045 - Yash Mashroo");
                                System.out.println("202103048 - Raj Kariya");
                                System.out.println("202103050 - Harsh Kanani");
                                System.out.println("202103052 - Vraj Thakker");
                                System.out.println("202103053 - Dhyey Patel");
                                System.out.println("202103054 - Sanchit Satija");
                                System.out.println(Student_ID[i] + " - " + Student_name[i]);
                                System.out.println("-----------------------------------------------");
                                break;
                            } else if (Smanagement == 4) {
                                stuManagement = false;
                                Thread.sleep(300);
                                break;
                            }
                        }

                    } else if (Amanagement == 2) {
                        boolean facManagement = true;
                        while (facManagement) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("1. Add Faculty: ");
                        System.out.println("2. Remove Faculty: ");
                        System.out.println("3. View Faculty List: ");
                        System.out.println("4. Exit");
                        System.out.println("-----------------------------------------------");

                            int facultyManagement;
                            facultyManagement = sc.nextInt();

                            if (facultyManagement == 1) {
                                try {
                                    Scanner sc = new Scanner(System.in);
                                    System.out.print("Enter Faculty Name : ");
                                    Fname[i] = sc.next();
                                    System.out.print("Enter Course ID: ");
                                    CourseId[i] = sc.nextInt();
                                    System.out.print("Enter Mail ID : ");
                                    Fmailid[i] = sc.next();
                                    System.out.print("Enter Faculty qualifications : ");
                                    qualifications[i] = sc.next();
                                    System.out.print("Enter Course Name : ");
                                    coursesoffered[i] = sc.next();
                                } catch (Exception e) {
                                    System.out.println("Unexpected error!!");
                                    System.out.println(e);
                                }
                            } else if (facultyManagement == 2) {
                                CourseId[i]=0;
                                Fname[i]=null;
                                coursesoffered[i]=null;
                                qualifications[i]=null;
                                Fmailid[i]=null;
                                Thread.sleep(400);
                                System.out.println("Faculty Removed!");

                            } else if (facultyManagement == 3) {
                                Thread.sleep(1000);
                                System.out.println("**********************************************");
                                System.out.println("List of the Faculties");
                                System.out.println("**********************************************");
                                System.out.println();
                                System.out.println("-----------------------------------------------");
                                System.out.println("Bharani Kolipara");
                                System.out.println("PhD (English), The English and Foreign Languages University, Hyderabad");
                                System.out.println("Course - Aproches to Indian Society");
                                System.out.println("Course Id - HM106");
                                System.out.println("-----------------------------------------------");
                                System.out.println("Avik Hati");
                                System.out.println("PhD (Electrical Engineering), IIT Bombay");
                                System.out.println("Course - Data-Strucures and Algorithm");
                                System.out.println("Course Id - MC124 ");
                                System.out.println("-----------------------------------------------");
                                System.out.println("Madhukant Sharma");
                                System.out.println("PhD (Mathematics), IIT Madras");
                                System.out.println("Course - Function of Single variables &ODE");
                                System.out.println("Course Id - MC123");
                                System.out.println("-----------------------------------------------");
                                System.out.println("Jaideep Mulherkar");
                                System.out.println("PhD (Mathematics), University of California, Davis, USA");
                                System.out.println("Course - Linear Algebra");
                                System.out.println("Course Id - MC215");
                                System.out.println("-----------------------------------------------");
                                System.out.println("Saurabh Tiwari");
                                System.out.println("PhD (Computer Science & Engineering), IIITDM, Jabalpur");
                                System.out.println("Course - Object Oriented Programming");
                                System.out.println("Course Id -MC122");
                                System.out.println("-----------------------------------------------");
                                System.out.println("Supantha Pandit");
                                System.out.println("PhD (Computer Science), IIT Ropar");
                                System.out.println("Course - Discrete Mathematics");
                                System.out.println("Course Id - MC116");
                                System.out.println("-----------------------------------------------");
                                System.out.println("Shruti Bhilare");
                                System.out.println("PhD (Computer Science and Engineering), IIT Indore");
                                System.out.println("Course - Computer Organization & Programming Lab");
                                System.out.println("Course Id - MC113");
                                System.out.println("-----------------------------------------------");
                                System.out.println(Fname[i]);
                                System.out.println(qualifications[i]);
                                System.out.println("Course - "+ coursesoffered[i]);
                                System.out.println("Course Id - " + CourseId[i]);
                                System.out.println("-----------------------------------------------");
                            } else if (facultyManagement == 4) {
                                facManagement = false;
                                Thread.sleep(500);
                                break;
                            }


                        }

                    } else if (Amanagement == 3) {
                        boolean CourseManagement = true;
                        while (CourseManagement) {

                        System.out.println("1. Add Course");
                        System.out.println("2. Drop Course");
                        System.out.println("3. View Course");
                        System.out.println("4. Exit");

                            int cManagement;
                            cManagement = sc.nextInt();

                            if (cManagement == 1) {
                                try {
                                    System.out.println("Enter Course Id and Course Name: ");

                                    CourseId[i] = sc.nextInt();
                                    Course[i] = sc.next();

                                } catch (Exception e) {
                                    System.out.println("Unexpected Error!!");
                                    System.out.println(e);
                                }
                            } else if (cManagement == 2) {
                                Course[i]=null;
                                Thread.sleep(400);
                                System.out.println("Course Dropped.");
                            } else if (cManagement == 3) {
                                Thread.sleep(1000);
                                System.out.println("View Courses : ");
                                System.out.println("------------------------------------------------------------------------");
                                System.out.println("\t Course ID \t Course \t \t \t \t \t \t \tCredits");
                                System.out.println("------------------------------------------------------------------------");
                                System.out.println("0 : (HM106) \t Approches to Indian Society \t \t (4-3-0-0) ");
                                System.out.println("1 : (MC124) \t Data Structure and Algorithm \t \t (5-3-1-0)");
                                System.out.println("2 : (MC123) \t Function of Single variable and ODE  (5-3-0-1)");
                                System.out.println("3 : (MC215) \t Linear Algebra \t \t \t \t \t  (5-3-0-1)");
                                System.out.println("4 : (MC122) \t Object Orienter Programming \t \t  (4-2-1-0)");
                                System.out.println("5 : (MC117) \t Discreate Mathematics \t \t \t \t  (4-2-0-1)");
                                System.out.println("6 : (MC113) \t Computer Organization and Programming (5-0-0-4)");
                                System.out.println("7 : (MC116) \t "+Course[i] +" \t\t\t\t\t(5-3-0-2)");
                                System.out.println("------------------------------------------------------------------------");

                            } else if (cManagement == 4) {
                                CourseManagement = false;
                                Thread.sleep(300);
                                break;
                            }
                        }
                    }

                }
            }
        } catch (Exception e) {
            Thread.sleep(2000);
            throw new Exception("Login Failed");
        }
    }
}

