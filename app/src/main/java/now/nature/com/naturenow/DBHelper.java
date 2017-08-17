package now.nature.com.naturenow;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by root on 6/24/16.
 */
public class DBHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "user.db";
    private static final String CREDENTIALS_TABLE = "user";
    private static final String USER_NAME = "user_name";
    private static final String USER_USERNAME = "user_username";
    private static final String USER_PASSWORD = "user_password";
    private static final String USER_AGE = "user_age";
    private static final String USER_EMAIL = "user_email";

    SharedPreferences sharedPreferences;


    SQLiteDatabase mDb;

    public DBHelper(Context ctx) {
        super(ctx, DB_NAME, null, DB_VERSION);
        SQLiteDatabase db = getWritableDatabase();
        mDb = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table  " +CREDENTIALS_TABLE+ "( "
                +USER_NAME+ " text , "
                +USER_USERNAME+ " text , "
                +USER_PASSWORD+" text , "
                +USER_AGE+" text , "
                +USER_EMAIL+" text )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }

    public boolean insert_2_CREDENTIALS_TABLE(String name, String username , String password, String age, String email) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(USER_NAME, name);
        contentValues.put(USER_USERNAME, username);
        contentValues.put(USER_PASSWORD, password);
        contentValues.put(USER_AGE, age);
        contentValues.put(USER_EMAIL, email);
        db.insert(CREDENTIALS_TABLE, null, contentValues);
        return true;
    }


    public String validate(String username) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor result = db.rawQuery("select "+USER_USERNAME+" , "+USER_PASSWORD+" from " + CREDENTIALS_TABLE, null);
        String u, p = "NOT FOUND";
        if (result.moveToFirst()) {

            do {

                u = result.getString(0);
                if (u.equals(username)) {
                    p = result.getString(1);
                    break;
                }

            } while (result.moveToNext());

        }
        return p;
    }

}
