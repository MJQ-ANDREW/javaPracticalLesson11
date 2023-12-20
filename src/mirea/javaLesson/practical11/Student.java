package mirea.javaLesson.practical11;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    private String name;
    private int age;
    private Calendar dateBD;
    public Student(String name, int age, int year, int month, int day){
        this.name = name;
        this.age = age;
        this.dateBD = new GregorianCalendar(year, month - 1, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Calendar getDateBD() {
        return dateBD;
    }

    public void setDateBD(Calendar dateBD) {
        this.dateBD = dateBD;
    }

    private String StringDateBD(){
        return dateBD.get(Calendar.DAY_OF_MONTH) + "." + dateBD.get(Calendar.MONTH) + "." + dateBD.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateBD=" + StringDateBD() +
                '}';
    }
}
