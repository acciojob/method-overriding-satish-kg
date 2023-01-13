package com.driver;
import java.io.*;
import java.lang.*;
import java.sql.SQLOutput;
import java.util.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static class A{
        public static String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
//        public static String meth(){
//            return "Method is overridden in Extendend class B";
//        }
    }

    public static void main(String[] args){
        B newB = new B();
        System.out.println(newB.meth());
    }

  
}