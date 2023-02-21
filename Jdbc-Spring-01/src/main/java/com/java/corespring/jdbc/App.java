package com.java.corespring.jdbc;

import com.java.corespring.jdbc.normal.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\t\t\t"+"Student Details"+"\n------------------------------------------------------------" );
        Student st=new Student(1, "meraj", "java", 99888767659l, "lko", "jun@gmail.com");
        System.out.println(st);
    }
    
}
