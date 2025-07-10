package com.java.workshop.basic.bean.filess;

import java.io.File;

public class Filehandling {
    public static void main(String[] args) {
        File file=new File("src");
        if(file.exists()){
            System.out.println("file exists:"+file);
        }else{
            System.out.println("file does not exsists");
        }
    if(file.isDirectory()){
        System.out.println("it is directory");
        File[] files=file.listFiles();
        if(files !=null){
            for(File f:files){
                System.out.println("file:"+f.getName());
            }
        }else{
            System.out.println("the directory is empty");
        }
    }else{
        System.out.println("it is not a directory");
    }
  } 
    
    
}
