package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "db";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "Student";
    private static final String SROLL="Student_Rn";
    private static final String SName="Student_name";
    private static final String SAddress="Student_Address";
    private static final String SMarks="Student_marks";


    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="CREATE TABLE "+TABLE_NAME+"("+SROLL+" int primary key ,"+SName+" Text Not Null ,"+
                SAddress+" text not null,"+SMarks+" int Not null)";
        db.execSQL(query);
    }

    public void adddata(String roll,String name,String address,String marks)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SROLL,roll);
        values.put(SName,name);
        values.put(SAddress,address);
        values.put(SMarks,marks);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }
    public ArrayList<Student> List()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorStudent = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        ArrayList<Student> studentArrayList=new ArrayList<>();
        if (cursorStudent.moveToFirst()) {
            do {
                studentArrayList.add(new Student(cursorStudent.getString(0),
                        cursorStudent.getString(1),
                        cursorStudent.getString(2),
                        cursorStudent.getString(3)));
            } while (cursorStudent.moveToNext());
        }
        cursorStudent.close();
        return studentArrayList;
    }

    public void updateStudent(String roll,String name,String address,String marks) {
        // calling a method to get writable database.
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(SROLL,roll);
        values.put(SName,name);
        values.put(SAddress,address);
        values.put(SMarks,marks);

        db.update(TABLE_NAME, values, "Student_name=?", new String[]{name});
        db.update(TABLE_NAME, values, "Student_Address=?", new String[]{address});
        db.update(TABLE_NAME, values, "Student_marks=?", new String[]{marks});
        db.close();
    }
    public String deleteData(String rn)
    {
        Student data=null;
        data=find(rn);
        if(data==null)
        {
            return "-1";
        }
        else
        {
            SQLiteDatabase db = this.getWritableDatabase();
            db.delete(TABLE_NAME, "Student_Rn=?", new String[]{rn});
            db.close();
        }
        return "0";
    }
    public Student find(String rn)
    {
        Student data=null;
        ArrayList <Student> arr=List();
        Iterator<Student> itr= arr.iterator();
        while(itr.hasNext())
        {
            data=itr.next();
            if(data.RollNo.compareTo(rn)==0) {
                return data;
            }
            else
            {
                data=null;
            }
        }
        return data;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
