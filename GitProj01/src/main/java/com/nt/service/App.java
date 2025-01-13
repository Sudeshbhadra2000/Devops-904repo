package com.nt.service;

import com.nt.comp.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       Arithmetic ar = new Arithmetic();
       int result = ar.sum(10, 20);
       System.out.println("Result is :: "+result);
    }
}
