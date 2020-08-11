package sample_attend;

import java.io.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Attend {

	
    @Test
	public static void main(String[] args) {
	    int NoOfLecturesAttended,NoOfLecturesConducted;
	    int AttendencePercentDoYouWant;
	    float AttendencePercent,per;
	    int i,mode,count=0,count1=0;
	    int Percent;
	    Scanner sc=new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("0.00");
	    System.out.print("No of Lectures Attended : ");
	    NoOfLecturesAttended=sc.nextInt();
	    System.out.print("No of Lectures Conducted : ");
	    NoOfLecturesConducted=sc.nextInt();
	    System.out.print("% Attendance You want : ");
	    int DoUWant=sc.nextInt();
	    AttendencePercent=(float)NoOfLecturesAttended/NoOfLecturesConducted*100;
	    Percent=(int)AttendencePercent;
	    System.out.println("Your Attendence is "+df.format(AttendencePercent)+"%");
	    if(Percent<DoUWant)
	    {
	        for(i=1;i<10000000;i++)
	        {
	            NoOfLecturesAttended=NoOfLecturesAttended+1;
	            NoOfLecturesConducted=NoOfLecturesConducted+1;
	            per=(float)NoOfLecturesAttended/NoOfLecturesConducted*100;
	            mode=(int)per;
	            count++;
	            if(mode==DoUWant)
	            {
	                System.out.println();
	                System.out.println("Total Lectures To Attend is "+count);
	                System.out.println("So you'll have to attend "+count+".00 days more");
	                System.exit(0);
	            }
	        }
	    }
	    
	    else{
	        for(i=1;i<10;i++)
	        {
	            NoOfLecturesConducted=NoOfLecturesConducted+1;
	            per=(float)NoOfLecturesAttended/NoOfLecturesConducted*100;
	            mode=(int)per;
	            count1++;
	            if(mode==DoUWant)
	            {
	                System.out.println();
	                System.out.println("You can Bunk "+count1+" lectures");
	                System.exit(0);
	            }
	            
	        }
	    }
	}
}
