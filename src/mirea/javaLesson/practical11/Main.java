package mirea.javaLesson.practical11;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Ex1();
        //Ex2();
        Date dt = new Date(1235432639999935L);
        //Ex4(dt);
        //System.out.println();
        Calendar cl = new GregorianCalendar(2023, 9, 21, 10, 10);
        //Ex4(cl);
        Ex5();
    }

    public static void Ex1(){
        System.out.println("Developer Andrew received the task on September 2 at 9:00");
        Date dt = new Date();
        System.out.print("Developer Andrew turned in the job on ");
        System.out.println(dt);
    }

    public static void Ex2(){
        Calendar today = new GregorianCalendar();
        int year, month, day;
        System.out.print("Enter year: ");
        year = in.nextInt();
        System.out.print("Enter month: ");
        month = in.nextInt();
        System.out.print("Enter day: ");
        day = in.nextInt();
        Calendar dt = new GregorianCalendar(year, month - 1, day);
        System.out.println(today.getTime());
        System.out.println(dt.getTime());
        int res = today.compareTo(dt);
        if(res == 0){
            System.out.println("This is today");
        }
        else if(res > 0){
            System.out.println("This is a past date");
        }
        else{
            System.out.println("This is a future date");
        }
    }

    public static void Ex4(Calendar cl){
        System.out.printf("<%s><%s><%s>\n<%s><%s>", cl.get(Calendar.YEAR), cl.get(Calendar.MONTH) + 1, cl.get(Calendar.DAY_OF_MONTH), cl.get(Calendar.HOUR), cl.get(Calendar.MINUTE));
    }

    public static void Ex4(Date dt){
        System.out.printf("<%s><%s><%s>\n<%s><%s>", dt.getYear(), dt.getMonth(), dt.getDay(), dt.getHours(), dt.getMinutes());
    }

    public static void Ex5(){
        long start, finish, resAL, resLL;
        ArrayList<String> arrAL = new ArrayList<String>();
        start = System.currentTimeMillis();
        arrAL.add("Jonh");
        arrAL.add("May");
        arrAL.add("Maybe");
        arrAL.add("Refrigerator");
        finish = System.currentTimeMillis();
        resAL = start - finish;
        LinkedList<String> arrLL = new LinkedList<String>();
        start = System.currentTimeMillis();
        arrLL.add("Jonh");
        arrLL.add("May");
        arrLL.add("Maybe");
        arrLL.add("Refrigerator");
        finish = System.currentTimeMillis();
        resLL = start - finish;
        if(resAL > resLL){
            System.out.println("ArrayList adds faster");
        }
        else{
            System.out.println("LinkedList adds faster");
        }
        start = System.currentTimeMillis();
        arrAL.remove(1);
        arrAL.remove(2);
        finish = System.currentTimeMillis();
        resAL = start - finish;
        start = System.currentTimeMillis();
        arrLL.remove(1);
        arrLL.remove(2);
        finish = System.currentTimeMillis();
        resLL = start - finish;
        if(resAL > resLL){
            System.out.println("ArrayList deletes faster");
        }
        else{
            System.out.println("LinkedList deletes faster");
        }
        arrLL.add("May");
        arrLL.add("Maybe");
        arrAL.add("May");
        arrAL.add("Maybe");
        start = System.currentTimeMillis();
        arrAL.contains("Maybe");
        finish = System.currentTimeMillis();
        resAL = start - finish;
        start = System.currentTimeMillis();
        arrLL.contains("Maybe");
        finish = System.currentTimeMillis();
        resLL = start - finish;
        if(resAL > resLL){
            System.out.println("ArrayList searchs faster");
        }
        else{
            System.out.println("LinkedList searchs faster");
        }
    }
}
