package com.java.workshop.temdata.basic.bean.filess;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOsterm {
    public static void main(String[] args) {
        try(FileInputStream inputStream =new FileInputStream("km.jpeg");
        FileOutputStream outputStream = new FileOutputStream("madhu.jpeg")){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    
}
