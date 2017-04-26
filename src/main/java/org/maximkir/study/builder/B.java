package org.maximkir.study.builder;

public class B extends A {

    private final String cString;

    B(Builder builder) {
        super(builder);
        this.cString = builder.cString;
    }


    public static class Builder<T extends Builder<T>> extends A.Builder<T> {

        private String cString;

        public T cString(String c){
            this.cString = c;
            return (T)this;
        }

        public B build(){
            return new B(this);
        }
    }
}
