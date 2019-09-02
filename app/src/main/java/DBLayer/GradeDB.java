package DBLayer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class GradeDB {



    AssetDatabaseOpenHelper assetDatabaseOpenHelper ;


    public GradeDB(Context applicationContext) {

        assetDatabaseOpenHelper = new AssetDatabaseOpenHelper(applicationContext);//initialize the database helper

//		try {
//			dbHelper.createDataBase();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		database = dbHelper.openDataBase();//open the database connection to the existing database and assign the SQLiteDatabase

//		String settings = "CREATE TABLE IF NOT EXISTS " + "EXAM" + " ("
//				+ "EXAM_ID" + " INTEGER PRIMARY KEY AUTOINCREMENT, "
//				+ "EXAM_NAME" + " TEXT, "
//				+ "INSTITUTION_NAME" + " TEXT, "
//				+ "COUNTRY_ID" + " INTEGER, "+ ");";
//		database.execSQL(settings);

    }

    public void insertGrade(HashMap<String, String> queryValues){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        ContentValues values = new ContentValues();

        values.put("GRADE_ID", queryValues.get("GRADE_ID"));
        values.put("GRADE_ID_LOCAL", queryValues.get("GRADE_ID_LOCAL"));
        values.put("GRADE_NAME", queryValues.get("GRADE_NAME"));
        values.put("MINIMUM_PERCENTAGE", queryValues.get("MINIMUM_PERCENTAGE"));
        values.put("MAXIMUM_PERCENTAGE", queryValues.get("MAXIMUM_PERCENTAGE"));
        values.put("SCHOOL_ID", queryValues.get("SCHOOL_ID"));
        values.put("UPLOADED", queryValues.get("UPLOADED"));

        db.insert("GRADE", null, values);

        db.close();

        values.put("GRADE_ID", queryValues.get("GRADE_ID"));
    }


    public void updateGrade(HashMap<String, String> queryValues){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        ContentValues values = new ContentValues();

        values.put("GRADE_ID", queryValues.get("GRADE_ID"));
        values.put("GRADE_ID_LOCAL", queryValues.get("GRADE_ID_LOCAL"));
        values.put("GRADE_NAME", queryValues.get("GRADE_NAME"));
        values.put("MINIMUM_PERCENTAGE", queryValues.get("MINIMUM_PERCENTAGE"));
        values.put("MAXIMUM_PERCENTAGE", queryValues.get("MAXIMUM_PERCENTAGE"));
        values.put("SCHOOL_ID", queryValues.get("SCHOOL_ID"));
        values.put("UPLOADED", queryValues.get("UPLOADED"));

        db.update("GRADE", values, "GRADE_ID" + "= ?", new String[]{queryValues.get("GRADE_ID")});


        db.close();

    }


    public void deleteGrade(String gradeId){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        String deleteQuery = "DELETE FROM GRADE WHERE GRADE_ID ='"+gradeId+"'";

        db.execSQL(deleteQuery);

    }




    public ArrayList<HashMap<String, String>> getAllGrades(){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        ArrayList<HashMap<String, String>> objectArrayList = new ArrayList<HashMap<String, String>>();

        String selectQuery = "SELECT * FROM GRADE ORDER BY GRADE_ID ASC";

        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){

            do{
                HashMap<String, String> objectMap = new HashMap<String, String>();

                objectMap.put("GRADE_ID", cursor.getString(0));
                objectMap.put("GRADE_ID_LOCAL", cursor.getString(1));
                objectMap.put("GRADE_NAME", cursor.getString(2));
                objectMap.put("MINIMUM_PERCENTAGE", cursor.getString(3));
                objectMap.put("MAXIMUM_PERCENTAGE", cursor.getString(4));
                objectMap.put("SCHOOL_ID", cursor.getString(5));
                objectMap.put("UPLOADED", cursor.getString(6));


                objectArrayList.add(objectMap);

            }while(cursor.moveToNext());

        }


        cursor.close();
        db.close();

        return objectArrayList;

    }



    public HashMap<String, String> getGradeByGradeId(String gradeId){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        HashMap<String, String> objectMap = new HashMap<String, String>();

        String selectQuery = "SELECT * FROM GRADE WHERE GRADE_ID = '"+gradeId+"'";

        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){

            do{

                objectMap.put("GRADE_ID", cursor.getString(0));
                objectMap.put("GRADE_ID_LOCAL", cursor.getString(1));
                objectMap.put("GRADE_NAME", cursor.getString(2));
                objectMap.put("MINIMUM_PERCENTAGE", cursor.getString(3));
                objectMap.put("MAXIMUM_PERCENTAGE", cursor.getString(4));
                objectMap.put("SCHOOL_ID", cursor.getString(5));
                objectMap.put("UPLOADED", cursor.getString(6));


            }while(cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return objectMap;

    }



    public HashMap<String, String> getGradeByGradeName(String gradeName){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        HashMap<String, String> objectMap = new HashMap<String, String>();

        String selectQuery = "SELECT * FROM GRADE WHERE GRADE_NAME = '"+gradeName+"'";

        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){

            do{

                objectMap.put("GRADE_ID", cursor.getString(0));
                objectMap.put("GRADE_ID_LOCAL", cursor.getString(1));
                objectMap.put("GRADE_NAME", cursor.getString(2));
                objectMap.put("MINIMUM_PERCENTAGE", cursor.getString(3));
                objectMap.put("MAXIMUM_PERCENTAGE", cursor.getString(4));
                objectMap.put("SCHOOL_ID", cursor.getString(5));
                objectMap.put("UPLOADED", cursor.getString(6));


            }while(cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return objectMap;

    }


}
