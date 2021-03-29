package com.hyperbench.hyperbench.springboot;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FileUtil {

    public static void main(String[] args) {


        File dir=new File("D:\\BaiduNetdiskDownload");

        List<File> files = Arrays.asList(dir.listFiles());

        files.stream().sorted(Comparator.comparing(a->{
            if(a.getName().contains("-")){
                String b=a.getName().split("-")[0];
                if(b.matches("[0-9]+")){
                    return Integer.parseInt(a.getName().split("-")[0]);
                }
            }
            return 0;
        })).forEach(item-> System.out.println(item.getName()));


    }
}
