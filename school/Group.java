package sk.itsovy.nemeth.school;

import java.util.Random;

public class Group {
    private int size;
    private int capacity;
    private Student[]arr;
    private String name;

    public Group(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.size = 0;
        this.arr = new Student[capacity];
    }

    public boolean addStudent(Student student) {
        if (student==null || size==capacity) return false;
        arr[size]=student;
        size++;
        return true;
    }

    public Student getStudent(String firstName, String lastName) {
        return null;
    }

    public boolean deleteStudent(Student student) {
        if (student==null) return false;
        for (int i=0; i<size; i++) {
            if (arr[i]==student) {
                arr[i-1]=arr[i];
            }
        }
        return true;
    }

    public void print() {
        System.out.println("List of students in "+name+":");
        for (int i=0; i<size; i++) {
            System.out.println("   "+arr[i].toString());
        }
    }

    public void sort() {
        if (size>0) {
            for (int i=0; i<size-1; i++) {
                for (int j=0; j<size-1-i; j++) {
                    if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName())>0) {
                        Student temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                    if (arr[i].getFirstName().compareToIgnoreCase(arr[j].getFirstName())>0) {
                        Student temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
    }

    public Student randomStudent() {
        Random rnd=new Random();
        int n=rnd.nextInt(size);
        if (size<=0) return null;
        return arr[n];
    }

    public Student[] getStudentsByMonth(int month) {
        int count=0;
        for (int i=0; i<size; i++) {
            //if () count++;
        }
        Student[]monthArr=new Student[count];
        for (int i=0; i<count; i++) {
            //monthArr[i]=;
        }
        return null;
    }

    public Student[] getStudentBySubject() {
        return null;
    }
}
