package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

final class ac
{
  private static final String a = "CREATE TABLE " + ae.a.a() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + "data" + " STRING NOT NULL, " + "created_at" + " INTEGER NOT NULL);";
  private static final String b = "CREATE TABLE " + ae.b.a() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + "data" + " STRING NOT NULL, " + "created_at" + " INTEGER NOT NULL);";
  private static final String c = "CREATE INDEX IF NOT EXISTS time_idx ON " + ae.a.a() + " (" + "created_at" + ");";
  private static final String d = "CREATE INDEX IF NOT EXISTS time_idx ON " + ae.b.a() + " (" + "created_at" + ");";
  private final ad e;
  
  public ac(Context paramContext)
  {
    this(paramContext, "mixpanel");
  }
  
  public ac(Context paramContext, String paramString)
  {
    this.e = new ad(paramContext, paramString);
  }
  
  /* Error */
  public int a(org.json.JSONObject paramJSONObject, ae paramae)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: invokevirtual 81	com/mixpanel/android/mpmetrics/ac:b	()Z
    //   10: ifne +14 -> 24
    //   13: ldc 83
    //   15: ldc 85
    //   17: invokestatic 90	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   20: pop
    //   21: bipush -2
    //   23: ireturn
    //   24: aload_2
    //   25: invokevirtual 32	com/mixpanel/android/mpmetrics/ae:a	()Ljava/lang/String;
    //   28: astore 6
    //   30: aload 4
    //   32: astore_2
    //   33: aload_0
    //   34: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   37: invokevirtual 94	com/mixpanel/android/mpmetrics/ad:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   40: astore 7
    //   42: aload 4
    //   44: astore_2
    //   45: new 96	android/content/ContentValues
    //   48: dup
    //   49: invokespecial 97	android/content/ContentValues:<init>	()V
    //   52: astore 8
    //   54: aload 4
    //   56: astore_2
    //   57: aload 8
    //   59: ldc 36
    //   61: aload_1
    //   62: invokevirtual 100	org/json/JSONObject:toString	()Ljava/lang/String;
    //   65: invokevirtual 104	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: aload 4
    //   70: astore_2
    //   71: aload 8
    //   73: ldc 40
    //   75: invokestatic 110	java/lang/System:currentTimeMillis	()J
    //   78: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   81: invokevirtual 119	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   84: aload 4
    //   86: astore_2
    //   87: aload 7
    //   89: aload 6
    //   91: aconst_null
    //   92: aload 8
    //   94: invokevirtual 125	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   97: pop2
    //   98: aload 4
    //   100: astore_2
    //   101: aload 7
    //   103: new 15	java/lang/StringBuilder
    //   106: dup
    //   107: invokespecial 18	java/lang/StringBuilder:<init>	()V
    //   110: ldc 127
    //   112: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: aload 6
    //   117: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: aconst_null
    //   124: invokevirtual 131	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   127: astore_1
    //   128: aload_1
    //   129: astore_2
    //   130: aload_1
    //   131: invokeinterface 136 1 0
    //   136: pop
    //   137: aload_1
    //   138: astore_2
    //   139: aload_1
    //   140: iconst_0
    //   141: invokeinterface 140 2 0
    //   146: istore_3
    //   147: aload_1
    //   148: ifnull +9 -> 157
    //   151: aload_1
    //   152: invokeinterface 143 1 0
    //   157: aload_0
    //   158: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   161: invokevirtual 144	com/mixpanel/android/mpmetrics/ad:close	()V
    //   164: iload_3
    //   165: ireturn
    //   166: astore 4
    //   168: aconst_null
    //   169: astore_1
    //   170: aload_1
    //   171: astore_2
    //   172: ldc 83
    //   174: new 15	java/lang/StringBuilder
    //   177: dup
    //   178: invokespecial 18	java/lang/StringBuilder:<init>	()V
    //   181: ldc -110
    //   183: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: aload 6
    //   188: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: ldc -108
    //   193: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: aload 4
    //   201: invokestatic 151	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   204: pop
    //   205: aload_1
    //   206: ifnull +71 -> 277
    //   209: aload_1
    //   210: astore_2
    //   211: aload_1
    //   212: invokeinterface 143 1 0
    //   217: aload 5
    //   219: astore_1
    //   220: aload_1
    //   221: astore_2
    //   222: aload_0
    //   223: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   226: invokevirtual 153	com/mixpanel/android/mpmetrics/ad:a	()V
    //   229: aload_1
    //   230: ifnull +9 -> 239
    //   233: aload_1
    //   234: invokeinterface 143 1 0
    //   239: aload_0
    //   240: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   243: invokevirtual 144	com/mixpanel/android/mpmetrics/ad:close	()V
    //   246: iconst_m1
    //   247: ireturn
    //   248: astore_1
    //   249: aload_2
    //   250: ifnull +9 -> 259
    //   253: aload_2
    //   254: invokeinterface 143 1 0
    //   259: aload_0
    //   260: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   263: invokevirtual 144	com/mixpanel/android/mpmetrics/ad:close	()V
    //   266: aload_1
    //   267: athrow
    //   268: astore_1
    //   269: goto -20 -> 249
    //   272: astore 4
    //   274: goto -104 -> 170
    //   277: goto -57 -> 220
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	280	0	this	ac
    //   0	280	1	paramJSONObject	org.json.JSONObject
    //   0	280	2	paramae	ae
    //   146	19	3	i	int
    //   1	98	4	localObject1	Object
    //   166	34	4	localSQLiteException1	SQLiteException
    //   272	1	4	localSQLiteException2	SQLiteException
    //   4	214	5	localObject2	Object
    //   28	159	6	str	String
    //   40	62	7	localSQLiteDatabase	SQLiteDatabase
    //   52	41	8	localContentValues	android.content.ContentValues
    // Exception table:
    //   from	to	target	type
    //   33	42	166	android/database/sqlite/SQLiteException
    //   45	54	166	android/database/sqlite/SQLiteException
    //   57	68	166	android/database/sqlite/SQLiteException
    //   71	84	166	android/database/sqlite/SQLiteException
    //   87	98	166	android/database/sqlite/SQLiteException
    //   101	128	166	android/database/sqlite/SQLiteException
    //   33	42	248	finally
    //   45	54	248	finally
    //   57	68	248	finally
    //   71	84	248	finally
    //   87	98	248	finally
    //   101	128	248	finally
    //   222	229	248	finally
    //   130	137	268	finally
    //   139	147	268	finally
    //   172	205	268	finally
    //   211	217	268	finally
    //   130	137	272	android/database/sqlite/SQLiteException
    //   139	147	272	android/database/sqlite/SQLiteException
  }
  
  public void a()
  {
    this.e.a();
  }
  
  public void a(long paramLong, ae paramae)
  {
    paramae = paramae.a();
    try
    {
      this.e.getWritableDatabase().delete(paramae, "created_at <= " + paramLong, null);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.e("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + paramae + ". Re-initializing database.", localSQLiteException);
      this.e.a();
      return;
    }
    finally
    {
      this.e.close();
    }
  }
  
  public void a(String paramString, ae paramae)
  {
    paramae = paramae.a();
    try
    {
      this.e.getWritableDatabase().delete(paramae, "_id <= " + paramString, null);
      return;
    }
    catch (SQLiteException paramString)
    {
      Log.e("MixpanelAPI.Database", "Could not clean sent Mixpanel records from " + paramae + ". Re-initializing database.", paramString);
      this.e.a();
      return;
    }
    finally
    {
      this.e.close();
    }
  }
  
  /* Error */
  public String[] a(ae paramae)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_1
    //   4: invokevirtual 32	com/mixpanel/android/mpmetrics/ae:a	()Ljava/lang/String;
    //   7: astore 6
    //   9: aload_0
    //   10: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   13: invokevirtual 176	com/mixpanel/android/mpmetrics/ad:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   16: new 15	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 18	java/lang/StringBuilder:<init>	()V
    //   23: ldc -78
    //   25: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload 6
    //   30: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: ldc -76
    //   35: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 40
    //   40: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: ldc -74
    //   45: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: aconst_null
    //   52: invokevirtual 131	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore_3
    //   56: aload_3
    //   57: astore_2
    //   58: new 184	org/json/JSONArray
    //   61: dup
    //   62: invokespecial 185	org/json/JSONArray:<init>	()V
    //   65: astore 5
    //   67: aconst_null
    //   68: astore_1
    //   69: aload_3
    //   70: astore_2
    //   71: aload_3
    //   72: invokeinterface 188 1 0
    //   77: ifeq +67 -> 144
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: invokeinterface 191 1 0
    //   88: ifeq +20 -> 108
    //   91: aload_3
    //   92: astore_2
    //   93: aload_3
    //   94: aload_3
    //   95: ldc -63
    //   97: invokeinterface 197 2 0
    //   102: invokeinterface 201 2 0
    //   107: astore_1
    //   108: aload_3
    //   109: astore_2
    //   110: aload 5
    //   112: new 99	org/json/JSONObject
    //   115: dup
    //   116: aload_3
    //   117: aload_3
    //   118: ldc 36
    //   120: invokeinterface 197 2 0
    //   125: invokeinterface 201 2 0
    //   130: invokespecial 204	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   133: invokevirtual 207	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   136: pop
    //   137: goto -68 -> 69
    //   140: astore_2
    //   141: goto -72 -> 69
    //   144: aload_3
    //   145: astore_2
    //   146: aload 5
    //   148: invokevirtual 211	org/json/JSONArray:length	()I
    //   151: ifle +162 -> 313
    //   154: aload_3
    //   155: astore_2
    //   156: aload 5
    //   158: invokevirtual 212	org/json/JSONArray:toString	()Ljava/lang/String;
    //   161: astore 5
    //   163: aload 5
    //   165: astore_2
    //   166: aload_0
    //   167: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   170: invokevirtual 144	com/mixpanel/android/mpmetrics/ad:close	()V
    //   173: aload_3
    //   174: ifnull +136 -> 310
    //   177: aload_3
    //   178: invokeinterface 143 1 0
    //   183: aload 4
    //   185: astore_3
    //   186: aload_1
    //   187: ifnull +23 -> 210
    //   190: aload 4
    //   192: astore_3
    //   193: aload_2
    //   194: ifnull +16 -> 210
    //   197: iconst_2
    //   198: anewarray 214	java/lang/String
    //   201: astore_3
    //   202: aload_3
    //   203: iconst_0
    //   204: aload_1
    //   205: aastore
    //   206: aload_3
    //   207: iconst_1
    //   208: aload_2
    //   209: aastore
    //   210: aload_3
    //   211: areturn
    //   212: astore_1
    //   213: aconst_null
    //   214: astore_3
    //   215: aload_3
    //   216: astore_2
    //   217: ldc 83
    //   219: new 15	java/lang/StringBuilder
    //   222: dup
    //   223: invokespecial 18	java/lang/StringBuilder:<init>	()V
    //   226: ldc -40
    //   228: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload 6
    //   233: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: ldc -38
    //   238: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: aload_1
    //   245: invokestatic 151	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   248: pop
    //   249: aload_0
    //   250: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   253: invokevirtual 144	com/mixpanel/android/mpmetrics/ad:close	()V
    //   256: aload_3
    //   257: ifnull +46 -> 303
    //   260: aload_3
    //   261: invokeinterface 143 1 0
    //   266: aconst_null
    //   267: astore_1
    //   268: aconst_null
    //   269: astore_2
    //   270: goto -87 -> 183
    //   273: astore_1
    //   274: aconst_null
    //   275: astore_2
    //   276: aload_0
    //   277: getfield 74	com/mixpanel/android/mpmetrics/ac:e	Lcom/mixpanel/android/mpmetrics/ad;
    //   280: invokevirtual 144	com/mixpanel/android/mpmetrics/ad:close	()V
    //   283: aload_2
    //   284: ifnull +9 -> 293
    //   287: aload_2
    //   288: invokeinterface 143 1 0
    //   293: aload_1
    //   294: athrow
    //   295: astore_1
    //   296: goto -20 -> 276
    //   299: astore_1
    //   300: goto -85 -> 215
    //   303: aconst_null
    //   304: astore_1
    //   305: aconst_null
    //   306: astore_2
    //   307: goto -124 -> 183
    //   310: goto -127 -> 183
    //   313: aconst_null
    //   314: astore_2
    //   315: goto -149 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	318	0	this	ac
    //   0	318	1	paramae	ae
    //   57	53	2	localObject1	Object
    //   140	1	2	localJSONException	org.json.JSONException
    //   145	170	2	localObject2	Object
    //   55	206	3	localObject3	Object
    //   1	190	4	localObject4	Object
    //   65	99	5	localObject5	Object
    //   7	225	6	str	String
    // Exception table:
    //   from	to	target	type
    //   110	137	140	org/json/JSONException
    //   9	56	212	android/database/sqlite/SQLiteException
    //   9	56	273	finally
    //   58	67	295	finally
    //   71	80	295	finally
    //   82	91	295	finally
    //   93	108	295	finally
    //   110	137	295	finally
    //   146	154	295	finally
    //   156	163	295	finally
    //   217	249	295	finally
    //   58	67	299	android/database/sqlite/SQLiteException
    //   71	80	299	android/database/sqlite/SQLiteException
    //   82	91	299	android/database/sqlite/SQLiteException
    //   93	108	299	android/database/sqlite/SQLiteException
    //   110	137	299	android/database/sqlite/SQLiteException
    //   146	154	299	android/database/sqlite/SQLiteException
    //   156	163	299	android/database/sqlite/SQLiteException
  }
  
  protected boolean b()
  {
    return this.e.b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */