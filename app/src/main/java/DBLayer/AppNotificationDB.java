package DBLayer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class AppNotificationDB {


    AssetDatabaseOpenHelper assetDatabaseOpenHelper ;


    public AppNotificationDB(Context applicationContext) {

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

    public void insertAppNotification(HashMap<String, String> queryValues){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        ContentValues values = new ContentValues();

        values.put("APP_NOTIFICATION_ID", queryValues.get("APP_NOTIFICATION_ID"));
        values.put("TITLE", queryValues.get("TITLE"));
        values.put("MESSAGE", queryValues.get("MESSAGE"));


        db.insert("APP_NOTIFICATION", null, values);

        db.close();

        values.put("APP_NOTIFICATION_ID", queryValues.get("APP_NOTIFICATION_ID"));
    }


    public void updateAppNotification(HashMap<String, String> queryValues){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        ContentValues values = new ContentValues();

        values.put("APP_NOTIFICATION_ID", queryValues.get("APP_NOTIFICATION_ID"));
        values.put("TITLE", queryValues.get("TITLE"));
        values.put("MESSAGE", queryValues.get("MESSAGE"));

        db.update("APP_NOTIFICATION", values, "APP_NOTIFICATION_ID" + "= ?", new String[]{queryValues.get("APP_NOTIFICATION_ID")});


        db.close();

    }


    public void deleteAppNotification(String appNotificationId){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        String deleteQuery = "DELETE FROM APP_NOTIFICATION WHERE APP_NOTIFICATION_ID ='"+appNotificationId+"'";

        db.execSQL(deleteQuery);

    }




    public ArrayList<HashMap<String, String>> getAllNotifications(){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        ArrayList<HashMap<String, String>> appNotificationArrayList = new ArrayList<HashMap<String, String>>();

        String selectQuery = "SELECT * FROM APP_NOTIFICATION ORDER BY APP_NOTIFICATION_ID ASC";

        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){

            do{
                HashMap<String, String> appNotificationMap = new HashMap<String, String>();

                appNotificationMap.put("APP_NOTIFICATION_ID", cursor.getString(0));
                appNotificationMap.put("TITLE", cursor.getString(1));
                appNotificationMap.put("MESSAGE", cursor.getString(2));


                appNotificationArrayList.add(appNotificationMap);
            }while(cursor.moveToNext());

        }


        cursor.close();
        db.close();

        return appNotificationArrayList;

    }



    public HashMap<String, String> getAppNotificationByAppNotificationId(String appNotificationId){

        //Open connection to write data
        SQLiteDatabase db = assetDatabaseOpenHelper.openDatabase();
        HashMap<String, String> appNotificationMap = new HashMap<String, String>();

        String selectQuery = "SELECT * FROM APP_NOTIFICATION WHERE APP_NOTIFICATION_ID = '"+appNotificationId+"'";

        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){

            do{

                appNotificationMap.put("APP_NOTIFICATION_ID", cursor.getString(0));
                appNotificationMap.put("TITLE", cursor.getString(1));
                appNotificationMap.put("MESSAGE", cursor.getString(2));


            }while(cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return appNotificationMap;

    }

}
