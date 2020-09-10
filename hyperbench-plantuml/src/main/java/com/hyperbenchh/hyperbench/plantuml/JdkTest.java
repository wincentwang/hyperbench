package com.hyperbenchh.hyperbench.plantuml;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JdkTest {

    public static void main(String[] args) {
        format3();
    }

    public static void format3(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd");
        Calendar instance = Calendar.getInstance();
        System.out.print(sdf.format(instance.getTime())+"-");
        for(int i=0;i<5000;i++){
            instance.add(Calendar.DAY_OF_MONTH,1);
            int year = instance.get(Calendar.YEAR);
            int month = instance.get(Calendar.MONTH)+1;
            int weeks = instance.get(Calendar.WEEK_OF_YEAR);
            String split=instance.getActualMaximum(Calendar.DAY_OF_MONTH)==Integer.parseInt(sdf.format(instance.getTime()))?" ":"-";
            if(instance.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(sdf.format(instance.getTime())+ " ("+   year+"-"+month+") " + "第"+weeks+"周");
                System.out.println("#### life:");
                System.out.println("#### work:");
                System.out.println("#### study:");
                System.out.println("***");
                System.out.print("#### ");
            }else{
                System.out.print(sdf.format(instance.getTime())+split);
            }
        }
    }
    public static void format2(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E");
        Calendar instance = Calendar.getInstance();
        for(int i=0;i<200;i++){
            int weeks = instance.get(Calendar.WEEK_OF_YEAR);
            System.out.println("##### "+sdf.format(instance.getTime())+ " "+weeks);
            System.out.println("##### Life:");
            System.out.println("##### Work:");
            System.out.println("##### Study:");
            System.out.println("***");
            instance.add(Calendar.DAY_OF_MONTH,1);
        }
    }


    public static void format1(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd");
        Calendar instance = Calendar.getInstance();
        System.out.print(sdf.format(instance.getTime())+"-");
        for(int i=0;i<5000;i++){
            instance.add(Calendar.DAY_OF_MONTH,1);
            int year = instance.get(Calendar.YEAR);
            int month = instance.get(Calendar.MONTH)+1;
            int weeks = instance.get(Calendar.WEEK_OF_YEAR);
            String split=instance.getActualMaximum(Calendar.DAY_OF_MONTH)==Integer.parseInt(sdf.format(instance.getTime()))?" ":"-";
            if(instance.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(sdf.format(instance.getTime())+ " ("+   year+"-"+month+") " + "第"+weeks+"周");
                System.out.println("#### life:");
                System.out.println("#### work:");
                System.out.println("#### study:");
                System.out.println("***");
                System.out.print("#### ");
            }else{
                System.out.print(sdf.format(instance.getTime())+split);
            }
        }
    }
}
