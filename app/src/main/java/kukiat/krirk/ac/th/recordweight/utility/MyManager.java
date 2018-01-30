package kukiat.krirk.ac.th.recordweight.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Cnz on 30/01/2018.
 */

public class MyManager {

    private Context context;
    private MyOpenHelperSQLite myOpenHelperSQLite;
    private SQLiteDatabase sqLiteDatabase;

    public MyManager(Context context) {
        this.context = context;

        myOpenHelperSQLite = new MyOpenHelperSQLite(context);
        sqLiteDatabase = myOpenHelperSQLite.getWritableDatabase();

    } // Constructor
} // Main Class