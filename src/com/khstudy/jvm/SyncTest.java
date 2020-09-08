package com.khstudy.jvm;

public class SyncTest {
    synchronized void m(){

    }
    void n(){
        synchronized (this)
        {
            int i=8;
        }
    }

    public static void main(String[] args) {

    }
}
