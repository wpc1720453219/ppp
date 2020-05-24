package com;

import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

public class MyZip {
    private void zip(String zipFileName, File inputFile) throws Exception{
        ZipOutputStream out=new ZipOutputStream((new FileOutputStream(zipFileName)));
         zip(out,inputFile,"");
        System.out.println("解压中...");
        out.close();
    }
    private void zip(ZipOutputStream out,File f,String base)throws Exception{
        if(f.isDirectory()){

        }
    }
    public static void main(String[] args) {

    }
}
