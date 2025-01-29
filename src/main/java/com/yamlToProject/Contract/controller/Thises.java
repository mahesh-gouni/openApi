package com.yamlToProject.Contract.controller;



public class Thises {
 int a =1;
 public void test(int a) {
     this.a =a;
     System.out.println(a);
 }

    public static void main(String[] args) {

        Thises thises = new Thises();

    }
}
