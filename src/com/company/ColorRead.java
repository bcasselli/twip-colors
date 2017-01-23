package com.company;

import java.io.*;


/**
 * Created by bc608 on 1/23/17.
 */
public class ColorRead {

    public static void fileRead(String args[]) throws IOException
    {
        FileReader color = new FileReader("color.txt");
        char [] a = new char[140];
        color.read(a);
        color.close();
    }
}
