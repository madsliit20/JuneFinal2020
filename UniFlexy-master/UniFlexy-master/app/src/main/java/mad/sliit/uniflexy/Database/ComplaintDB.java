package mad.sliit.uniflexy.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

/*** Question 1   ***/

import android.provider.BaseColumns;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Blob;

public class ComplaintDB extends SQLiteOpenHelper {

    private static final String TAG = "ComplaintDB";

    public static final String DATABSE_NAME="ComplaintsInfo.db";

    //Table
    protected static class Complaint implements  /*** Question 2 - (i)   ***/{
        public static final String TABLE_NAME ="complaint";



        /*** Question 3  ***/
    }




    public ComplaintDB(@Nullable Context context) {
        super(context, DATABSE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.e(TAG, "onCreate: Table Created");
        String SQL_CREATE_ENTREES =


                /*** Question 4  ***/


        db.execSQL(SQL_CREATE_ENTREES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addComplaint( Context context,String type, String description, String name, int priority, byte[] image){
        Log.e(TAG, "addComplaint: data inserted");
        //get database in write mode

        SQLiteDatabase db = getWritableDatabase();

        //Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();



        /*** Question 5  ***/


        Toast.makeText(context, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();


    }

    public JSONArray viewComplaints() throws JSONException {

        SQLiteDatabase db = /*** Question 6  ***/
        JSONArray objs= new JSONArray();


        String[] projection = {
                Complaint._ID,
                Complaint.COLUMN_NAME_COMPLAINT_TYPE,
                Complaint.COLUMN_NAME_DESCRIPTION,
                Complaint.COLUMN_NAME_NAME,
                Complaint.COLUMN_NAME_PRIORITY,
                Complaint.COLUMN_NAME_IMAGE
        };

        String sortOrder = Complaint.TABLE_NAME + " DESC";
        String selectQuery = /*** Question 7  ***/

        Cursor cursor = db.rawQuery(selectQuery,null);

        while (cursor.moveToNext()){
            String type = cursor.getString(cursor.getColumnIndexOrThrow(Complaint.COLUMN_NAME_COMPLAINT_TYPE));
            String description = cursor.getString(cursor.getColumnIndexOrThrow(Complaint.COLUMN_NAME_DESCRIPTION));
            String name = cursor.getString(cursor.getColumnIndexOrThrow(Complaint.COLUMN_NAME_NAME));
            int priority = Integer.parseInt(cursor.getString(cursor.getColumnIndexOrThrow(Complaint.COLUMN_NAME_PRIORITY)));
            byte[] image = cursor.getBlob(cursor.getColumnIndexOrThrow(Complaint.COLUMN_NAME_IMAGE));
            JSONObject obj = new JSONObject();



            /*** Question 8  ***/


            objs.put(obj);

            Log.i(TAG, "viewComplaints: "+obj);
            Log.i(TAG, "viewComplaints: objs =>"+objs);

        }



        return objs;

    }
}
