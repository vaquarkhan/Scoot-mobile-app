package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

final class ad
  extends SQLiteOpenHelper
{
  private final File a;
  private final ab b;
  
  ad(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 4);
    this.a = paramContext.getDatabasePath(paramString);
    this.b = ab.a(paramContext);
  }
  
  public void a()
  {
    close();
    this.a.delete();
  }
  
  public boolean b()
  {
    return (!this.a.exists()) || (Math.max(this.a.getUsableSpace(), this.b.c()) >= this.a.length());
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    if (ab.a) {
      Log.v("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
    }
    paramSQLiteDatabase.execSQL(ac.c());
    paramSQLiteDatabase.execSQL(ac.d());
    paramSQLiteDatabase.execSQL(ac.e());
    paramSQLiteDatabase.execSQL(ac.f());
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (ab.a) {
      Log.v("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
    }
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ae.a.a());
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ae.b.a());
    paramSQLiteDatabase.execSQL(ac.c());
    paramSQLiteDatabase.execSQL(ac.d());
    paramSQLiteDatabase.execSQL(ac.e());
    paramSQLiteDatabase.execSQL(ac.f());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */