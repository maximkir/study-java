package org.maximkir.study.builder;

/**
 *
 * This example used to demonstrate how to extend a class with existing builder
 *
 */
public class A {

    private final String aString;
    private final String bString;

    A(Builder builder) {
        this.aString = builder.aString;
        this.bString = builder.bString;
    }

    public String getaString() {
        return aString;
    }

    public String getbString() {
        return bString;
    }

    @Override
    public String toString() {
        return "A{" +
                "aString='" + aString + '\'' +
                ", bString='" + bString + '\'' +
                '}';
    }


    public static class Builder <T extends Builder<T>> {

        private String aString;
        private String bString;

        public T aString(String a){
            this.aString = a;
            return (T)this;
        }

        public T bString(String b){
            this.bString = b;
            return (T)this;
        }

        public A build(){
            return new A(this);
        }
    }

}
