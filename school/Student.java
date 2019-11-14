package sk.itsovy.nemeth.school;

import java.util.Calendar;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Calendar cal;
    private String[]subjects;
    private int subSize=0;


    public Student(String firstName, String lastName, String strBirthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthDate=new Date(strBirthDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String strBirthDate) {
        birthDate=new Date(strBirthDate);
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }

    public String getZodiacSign(Student student) {
        cal.setTime(birthDate);
        int m=cal.get(Calendar.MONTH);
        int d=cal.get(Calendar.DAY_OF_MONTH);
        if ((m<1 || d<1 || d>31) || (((m==4 || m==6 || m==9 || m==11) && d==31) || (m==2 && d>28))) {
            return "Wrong date!";
        } else if ((m==3 && d>=21) || (m==4 && d<=19)) {
            return "Aries";
        } else if ((m==4 && d>=20) || (m==5 && d<=20)) {
            return "Taurus";
        } else if ((m==5 && d>=21) || (m==6 && d<=20)) {
            return "Gemini";
        } else if ((m==6 && d>=21) || (m==7 && d<=22)) {
            return "Cancer";
        } else if ((m==7 && d>=23) || (m==8 && d<=22)) {
            return "Leo";
        } else if ((m==8 && d>=23) || (m==9 && d<=22)) {
            return "Virgo";
        } else if ((m==9 && d>=23) || (m==10 && d<=22)) {
            return "Libra";
        } else if ((m==10 && d>=23) || (m==11 && d<=21)) {
            return "Scorpio";
        } else if ((m==11 && d>=22) || (m==12 && d<=21)) {
            return "Sagittarius";
        } else if ((m==12 && d>=22) || (m==1 && d<=19)) {
            return "Capricorn";
        } else if ((m==1 && d>=20) || (m==2 && d<=18)) {
            return "Aquarius";
        } else if ((m==2 && d>=19) || (m==3 && d<=20)) {
            return "Pisces";
        }
        return null;
    }

    public int getAge(Student student) {
        Date currentDate=new Date();
        return 0;
    }

    public void addSubject(String subject) {
        if (subject.length()>3) {
            System.out.println("Subject name is too long!");
        } else {
            for (int i=0; i<=subSize; i++) {
                if (subjects[i]==subject) {
                    System.out.println("Subject already added!");
                    break;
                }
                if (subjects[i]==null) {
                    subjects[i]=subject;
                    subSize++;
                }
            }
        }
    }
}
