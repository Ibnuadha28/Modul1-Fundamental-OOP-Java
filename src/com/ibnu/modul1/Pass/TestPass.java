package com.ibnu.modul1.Pass;

public class TestPass {
    int nomer1;
    int nomer2;

    //Constructor
    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    //Pass by value
    public void calculate(int m, int n){//parameter berupa tipe data primitif
        m = m * 10;
        n = n / 2;
    }

    //Pass by Refernce
    public void calculate(TestPass pass){//parameter berupa tipe data class
        pass.nomer1 = pass.nomer1 * 10;
        pass.nomer2 = pass.nomer2 / 2;
    }
}
