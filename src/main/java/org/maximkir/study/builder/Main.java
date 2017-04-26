package org.maximkir.study.builder;

/**
 * Created by Maxim.Kirilov on 26-Apr-17.
 */
public class Main {

    public static void main(String[] args) {
        A a = new A.Builder()
                .aString("a")
                .bString("b")
                .build();

        System.out.println(a);

        B b = new B.Builder()
                .aString("a")
                .bString("b")
                .cString("c")
                .build();

    }
}
