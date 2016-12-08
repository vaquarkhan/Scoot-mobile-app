package com.parse;

import a.o;
import java.util.ArrayList;

class OfflineStore$OfflineEncoder
  extends ParseEncoder
{
  private ParseSQLiteDatabase db;
  private ArrayList<o<Void>> tasks = new ArrayList();
  private final Object tasksLock = new Object();
  
  public OfflineStore$OfflineEncoder(OfflineStore paramOfflineStore, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    this.db = paramParseSQLiteDatabase;
  }
  
  /* Error */
  public org.json.JSONObject encodeRelatedObject(ParseObject paramParseObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 47	com/parse/ParseObject:getObjectId	()Ljava/lang/String;
    //   4: ifnull +44 -> 48
    //   7: new 49	org/json/JSONObject
    //   10: dup
    //   11: invokespecial 50	org/json/JSONObject:<init>	()V
    //   14: astore_2
    //   15: aload_2
    //   16: ldc 52
    //   18: ldc 54
    //   20: invokevirtual 58	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   23: pop
    //   24: aload_2
    //   25: ldc 60
    //   27: aload_1
    //   28: invokevirtual 47	com/parse/ParseObject:getObjectId	()Ljava/lang/String;
    //   31: invokevirtual 58	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   34: pop
    //   35: aload_2
    //   36: ldc 62
    //   38: aload_1
    //   39: invokevirtual 65	com/parse/ParseObject:getClassName	()Ljava/lang/String;
    //   42: invokevirtual 58	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   45: pop
    //   46: aload_2
    //   47: areturn
    //   48: new 49	org/json/JSONObject
    //   51: dup
    //   52: invokespecial 50	org/json/JSONObject:<init>	()V
    //   55: astore_3
    //   56: aload_3
    //   57: ldc 52
    //   59: ldc 67
    //   61: invokevirtual 58	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   64: pop
    //   65: aload_0
    //   66: getfield 30	com/parse/OfflineStore$OfflineEncoder:tasksLock	Ljava/lang/Object;
    //   69: astore_2
    //   70: aload_2
    //   71: monitorenter
    //   72: aload_0
    //   73: getfield 25	com/parse/OfflineStore$OfflineEncoder:tasks	Ljava/util/ArrayList;
    //   76: aload_0
    //   77: getfield 17	com/parse/OfflineStore$OfflineEncoder:this$0	Lcom/parse/OfflineStore;
    //   80: aload_1
    //   81: aload_0
    //   82: getfield 32	com/parse/OfflineStore$OfflineEncoder:db	Lcom/parse/ParseSQLiteDatabase;
    //   85: invokestatic 73	com/parse/OfflineStore:access$200	(Lcom/parse/OfflineStore;Lcom/parse/ParseObject;Lcom/parse/ParseSQLiteDatabase;)La/o;
    //   88: new 75	com/parse/OfflineStore$OfflineEncoder$2
    //   91: dup
    //   92: aload_0
    //   93: aload_3
    //   94: invokespecial 78	com/parse/OfflineStore$OfflineEncoder$2:<init>	(Lcom/parse/OfflineStore$OfflineEncoder;Lorg/json/JSONObject;)V
    //   97: invokevirtual 84	a/o:c	(La/m;)La/o;
    //   100: invokevirtual 88	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   103: pop
    //   104: aload_2
    //   105: monitorexit
    //   106: aload_3
    //   107: areturn
    //   108: astore_1
    //   109: aload_2
    //   110: monitorexit
    //   111: aload_1
    //   112: athrow
    //   113: astore_1
    //   114: new 90	java/lang/RuntimeException
    //   117: dup
    //   118: aload_1
    //   119: invokespecial 93	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   122: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	OfflineEncoder
    //   0	123	1	paramParseObject	ParseObject
    //   55	52	3	localJSONObject	org.json.JSONObject
    // Exception table:
    //   from	to	target	type
    //   72	106	108	finally
    //   109	111	108	finally
    //   0	46	113	org/json/JSONException
    //   48	72	113	org/json/JSONException
    //   111	113	113	org/json/JSONException
  }
  
  public o<Void> whenFinished()
  {
    return o.a(this.tasks).b(new OfflineStore.OfflineEncoder.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$OfflineEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */