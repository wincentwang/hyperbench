package com.hyperbenchh.hyperbench.plantuml;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JdkTest {

    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("dd");
        Calendar instance = Calendar.getInstance();
        System.out.print(sdf.format(instance.getTime())+",");
        for(int i=0;i<5000;i++){
            instance.add(Calendar.DAY_OF_MONTH,1);

            if(instance.get(Calendar.DAY_OF_WEEK)==1){
                System.out.print(sdf.format(instance.getTime()));
                System.out.println();
                System.out.println(",,,,,,");
            }else{

                System.out.print(sdf.format(instance.getTime())+",");
            }
        }
    }

}
