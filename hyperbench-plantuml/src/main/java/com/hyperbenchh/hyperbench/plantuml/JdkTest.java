package com.hyperbenchh.hyperbench.plantuml;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JdkTest {

    public static void main(String[] args) {

        SimpleDateFormat sdf=new SimpleDateFormat("dd");
        Calendar instance = Calendar.getInstance();
        System.out.print(sdf.format(instance.getTime())+"+");
        for(int i=0;i<5000;i++){
            instance.add(Calendar.DAY_OF_MONTH,1);

            int year = instance.get(Calendar.YEAR);
            int month = instance.get(Calendar.MONTH)+1;
            int weeks = instance.get(Calendar.WEEK_OF_YEAR);

            String split=instance.getActualMaximum(Calendar.DAY_OF_MONTH)==Integer.parseInt(sdf.format(instance.getTime()))?" ":"-";

            if(instance.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(sdf.format(instance.getTime())+ "("+   year+"-"+month+"-"+weeks+ ")");
                System.out.print("## ");
            }else{
                System.out.print(sdf.format(instance.getTime())+split);
            }
        }
    }

}
