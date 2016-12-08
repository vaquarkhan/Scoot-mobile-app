package com.tushar.taxiapp.scootapp;

import android.os.AsyncTask;
import android.util.Log;

final class o
  extends AsyncTask<String, Void, String>
{
  private String c;
  
  static
  {
    if (!BookingConfirmation.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  private o(BookingConfirmation paramBookingConfirmation) {}
  
  /* Error */
  private String b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 4
    //   5: new 38	java/net/URL
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 41	java/net/URL:<init>	(Ljava/lang/String;)V
    //   13: invokevirtual 45	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   16: checkcast 47	java/net/HttpURLConnection
    //   19: astore_1
    //   20: aload_1
    //   21: invokevirtual 50	java/net/HttpURLConnection:connect	()V
    //   24: aload_1
    //   25: invokevirtual 54	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   28: astore 4
    //   30: new 56	java/io/BufferedReader
    //   33: dup
    //   34: new 58	java/io/InputStreamReader
    //   37: dup
    //   38: aload 4
    //   40: invokespecial 61	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   43: invokespecial 64	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: astore_3
    //   47: new 66	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   54: astore_2
    //   55: aload_3
    //   56: invokevirtual 71	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnull +61 -> 124
    //   66: aload_2
    //   67: aload 5
    //   69: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: goto -18 -> 55
    //   76: astore_3
    //   77: ldc 77
    //   79: astore_2
    //   80: ldc 79
    //   82: new 66	java/lang/StringBuilder
    //   85: dup
    //   86: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   89: ldc 81
    //   91: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: aload_3
    //   95: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokestatic 93	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   104: pop
    //   105: getstatic 23	com/tushar/taxiapp/scootapp/o:a	Z
    //   108: ifne +55 -> 163
    //   111: aload 4
    //   113: ifnonnull +50 -> 163
    //   116: new 95	java/lang/AssertionError
    //   119: dup
    //   120: invokespecial 96	java/lang/AssertionError:<init>	()V
    //   123: athrow
    //   124: aload_2
    //   125: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: astore_2
    //   129: aload_3
    //   130: invokevirtual 99	java/io/BufferedReader:close	()V
    //   133: getstatic 23	com/tushar/taxiapp/scootapp/o:a	Z
    //   136: ifne +16 -> 152
    //   139: aload 4
    //   141: ifnonnull +11 -> 152
    //   144: new 95	java/lang/AssertionError
    //   147: dup
    //   148: invokespecial 96	java/lang/AssertionError:<init>	()V
    //   151: athrow
    //   152: aload 4
    //   154: invokevirtual 102	java/io/InputStream:close	()V
    //   157: aload_1
    //   158: invokevirtual 105	java/net/HttpURLConnection:disconnect	()V
    //   161: aload_2
    //   162: areturn
    //   163: aload 4
    //   165: invokevirtual 102	java/io/InputStream:close	()V
    //   168: aload_1
    //   169: invokevirtual 105	java/net/HttpURLConnection:disconnect	()V
    //   172: aload_2
    //   173: areturn
    //   174: astore_3
    //   175: aconst_null
    //   176: astore 4
    //   178: aload_2
    //   179: astore_1
    //   180: aload_3
    //   181: astore_2
    //   182: getstatic 23	com/tushar/taxiapp/scootapp/o:a	Z
    //   185: ifne +16 -> 201
    //   188: aload 4
    //   190: ifnonnull +11 -> 201
    //   193: new 95	java/lang/AssertionError
    //   196: dup
    //   197: invokespecial 96	java/lang/AssertionError:<init>	()V
    //   200: athrow
    //   201: aload 4
    //   203: invokevirtual 102	java/io/InputStream:close	()V
    //   206: aload_1
    //   207: invokevirtual 105	java/net/HttpURLConnection:disconnect	()V
    //   210: aload_2
    //   211: athrow
    //   212: astore_2
    //   213: aconst_null
    //   214: astore 4
    //   216: goto -34 -> 182
    //   219: astore_2
    //   220: goto -38 -> 182
    //   223: astore_2
    //   224: goto -42 -> 182
    //   227: astore_3
    //   228: aconst_null
    //   229: astore 5
    //   231: ldc 77
    //   233: astore_2
    //   234: aload 4
    //   236: astore_1
    //   237: aload 5
    //   239: astore 4
    //   241: goto -161 -> 80
    //   244: astore_3
    //   245: aconst_null
    //   246: astore 4
    //   248: ldc 77
    //   250: astore_2
    //   251: goto -171 -> 80
    //   254: astore_3
    //   255: goto -175 -> 80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	this	o
    //   0	258	1	paramString	String
    //   1	210	2	localObject1	Object
    //   212	1	2	localObject2	Object
    //   219	1	2	localObject3	Object
    //   223	1	2	localObject4	Object
    //   233	18	2	str1	String
    //   46	10	3	localBufferedReader	java.io.BufferedReader
    //   76	54	3	localException1	Exception
    //   174	7	3	localObject5	Object
    //   227	1	3	localException2	Exception
    //   244	1	3	localException3	Exception
    //   254	1	3	localException4	Exception
    //   3	244	4	localObject6	Object
    //   59	179	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	55	76	java/lang/Exception
    //   55	61	76	java/lang/Exception
    //   66	73	76	java/lang/Exception
    //   124	129	76	java/lang/Exception
    //   5	20	174	finally
    //   20	30	212	finally
    //   30	55	219	finally
    //   55	61	219	finally
    //   66	73	219	finally
    //   124	129	219	finally
    //   129	133	219	finally
    //   80	105	223	finally
    //   5	20	227	java/lang/Exception
    //   20	30	244	java/lang/Exception
    //   129	133	254	java/lang/Exception
  }
  
  protected String a(String... paramVarArgs)
  {
    try
    {
      str = b(paramVarArgs[0]);
      Log.d(BookingConfirmation.class.getName(), "Exception while DownloadTask " + paramVarArgs);
    }
    catch (Exception paramVarArgs)
    {
      try
      {
        this.c = paramVarArgs[1];
        return str;
      }
      catch (Exception paramVarArgs)
      {
        String str;
        for (;;) {}
      }
      paramVarArgs = paramVarArgs;
      str = "";
    }
    return str;
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    new p(this.b, null).execute(new String[] { paramString, this.c });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */