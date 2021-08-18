package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadKeyboard {
    public static char readChar() {
        char ch;
        try {
            ch = readString().charAt(0);
        } catch( Exception e ) {
            ch = 0;
        }
        return ch;
    }
    public static String readString() {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = br.readLine();
        } catch( Exception e ) {
            str = "";
        }
        return str;
    }
    public static int readInt() {
        int num;
        try {
            num = Integer.parseInt( readString().trim() );
        } catch( Exception e ) {
            num = 0;
            System.out.println(e.getMessage());
        }
        return num;
    }
    public static boolean readBoolean() {
        boolean num;
        try {
            num = Boolean.parseBoolean( readString().trim() );
        } catch( Exception e ) {
            num = false;
            System.out.println(e.getMessage());
        }
        return num;
    }
}
