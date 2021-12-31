package com.example.blooddonation;

public class Donors {
    String id;
    String name;
    String blood_grp;
    String location;
    String email_d;

    public String getDate_D() {
        return Date_D;
    }

    public void setDate_D(String date_D) {
        Date_D = date_D;
    }

    String Date_D;
    public String getEmail_d() {
        return email_d;
    }

    public void setEmail_d(String email_d) {
        this.email_d = email_d;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    String con;
    public Donors(){}
    public Donors(String name,String blood_grp,String location,String email_d,String con,String Date_d){
        //this.id = id;
        this.name = name;
        this.blood_grp = blood_grp;
        this.location = location;
        this.email_d=email_d;
        this.con = con;
        this.Date_D=Date_d;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlood_grp(){return blood_grp;}

    public String getLocation(){return location;}

}
