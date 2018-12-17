package sample;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Football football=new Football();
        Form_343 a=new Form_343();
        Form_433 b=new Form_433();
        Form_442 c=new Form_442();
        Form_451 d=new Form_451();
        System.out.println( football.setFormation(a));

        System.out.println(football.setFormation(b));

        System.out.println(football.setFormation(c));

        System.out.println(football.setFormation(d));


    }
}

