package com.firstapp.portrait_mode_to_landscape_mode;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class HelperClass extends SQLiteOpenHelper {


    public HelperClass(@Nullable Context context) {
        super(context, "ODS.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry="create table employeedetails(id integer primary key autoincrement,function text,equipment text,work text,description text)";
        db.execSQL(qry);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String qry="DROP TABLE IF EXISTS employeedetails";
        db.execSQL(qry);
        onCreate(db);

    }
    public String addrecord(String desc, String fn, String work, String equi)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("description",desc);
        cv.put("function",fn);
        cv.put("work", work);
        cv.put("equipment",equi);

        float res=db.insert("employeedetails",null,cv);

        if (res==-1)
            return "Data Insertion Failed";
        else
            return "Successfully inserted Data";

    }

    public Cursor readallData(){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        String qry="select * from employeedetails order by id desc";
        Cursor cursor=sqLiteDatabase.rawQuery(qry,null);
        return cursor;
    }
}
