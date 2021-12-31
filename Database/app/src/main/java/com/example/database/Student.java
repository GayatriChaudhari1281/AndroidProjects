package com.example.database;

public class Student {
    String RollNo;
    String Name;
    String address;
    String marks;
    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }


    public Student(String RollNo,String Name,String address,String marks)
    {
        this.RollNo=RollNo;
        this.Name=Name;
        this.marks=marks;
        this.address=address;
    }
}
