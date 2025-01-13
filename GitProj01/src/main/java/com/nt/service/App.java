package com.nt.service;

import com.nt.comp.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       Arithmetic ar = new Arithmetic();
       long result = ar.sum(10, 20);
       System.out.println("Result is :: "+result);
       long subResult = ar.sub(50, 20);
       System.out.println(subResult);
    }
}
