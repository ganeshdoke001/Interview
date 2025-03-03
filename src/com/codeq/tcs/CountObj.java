package com.codeq.tcs;

public class CountObj {

    public static int count;

    public CountObj() {

        count++;
    }

    public static void main(
            String arg[]) {

        CountObj a1 = new CountObj();
        CountObj a2 = new CountObj();

        CountObj a3 = new CountObj();
        CountObj a4 = new CountObj();
        System.out.println(CountObj.count);
    }
}
