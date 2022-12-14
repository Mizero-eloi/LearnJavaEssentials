package com.eloi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

    public static void main(String [] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("C:\\Users\\eloim\\IdeaProjects\\LearnJava5\\src\\com\\eloi\\input.txt");
            out = new FileOutputStream("output.txt");

            int c;

            while((c = in.read()) != -1){
                out.write(c);
            }

        }finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }

}
