package com.hyperbenchh.hyperbench.plantuml;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JdkTest {

    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E");
        Calendar instance = Calendar.getInstance();
        System.out.println(sdf.format(instance.getTime()));
        for(int i=0;i<5000;i++){
            instance.add(Calendar.DAY_OF_MONTH,1);
            System.out.println(sdf.format(instance.getTime()));
        }
    }

}
