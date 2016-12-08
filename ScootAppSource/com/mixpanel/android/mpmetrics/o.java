package com.mixpanel.android.mpmetrics;

import android.util.Log;
import com.mixpanel.android.c.ae;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

final class o
{
  private static final Set<Integer> j = new HashSet();
  private String a;
  private final String b;
  private final Set<Integer> c;
  private final Set<Integer> d;
  private final List<Survey> e;
  private final List<InAppNotification> f;
  private final p g;
  private final ae h;
  private JSONArray i;
  
  public o(String paramString, p paramp, ae paramae)
  {
    this.b = paramString;
    this.g = paramp;
    this.h = paramae;
    this.a = null;
    this.e = new LinkedList();
    this.f = new LinkedList();
    this.c = new HashSet();
    this.d = new HashSet();
  }
  
  /* Error */
  public Survey a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 48	com/mixpanel/android/mpmetrics/o:e	Ljava/util/List;
    //   6: invokeinterface 61 1 0
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +9 -> 22
    //   16: aconst_null
    //   17: astore_3
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_3
    //   21: areturn
    //   22: aload_0
    //   23: getfield 48	com/mixpanel/android/mpmetrics/o:e	Ljava/util/List;
    //   26: iconst_0
    //   27: invokeinterface 65 2 0
    //   32: checkcast 67	com/mixpanel/android/mpmetrics/Survey
    //   35: astore 4
    //   37: aload 4
    //   39: astore_3
    //   40: iload_1
    //   41: ifeq -23 -> 18
    //   44: aload_0
    //   45: getfield 48	com/mixpanel/android/mpmetrics/o:e	Ljava/util/List;
    //   48: aload_0
    //   49: getfield 48	com/mixpanel/android/mpmetrics/o:e	Ljava/util/List;
    //   52: invokeinterface 71 1 0
    //   57: aload 4
    //   59: invokeinterface 75 3 0
    //   64: aload 4
    //   66: astore_3
    //   67: goto -49 -> 18
    //   70: astore_3
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_3
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	o
    //   0	75	1	paramBoolean	boolean
    //   11	2	2	bool	boolean
    //   17	50	3	localObject1	Object
    //   70	4	3	localObject2	Object
    //   35	30	4	localSurvey	Survey
    // Exception table:
    //   from	to	target	type
    //   2	12	70	finally
    //   22	37	70	finally
    //   44	64	70	finally
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(String paramString)
  {
    try
    {
      this.e.clear();
      this.f.clear();
      this.a = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public void a(List<Survey> paramList, List<InAppNotification> paramList1, JSONArray paramJSONArray1, JSONArray paramJSONArray2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 7
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 41	com/mixpanel/android/mpmetrics/o:h	Lcom/mixpanel/android/c/ae;
    //   9: aload_3
    //   10: invokeinterface 88 2 0
    //   15: aload_1
    //   16: invokeinterface 92 1 0
    //   21: astore_3
    //   22: iconst_0
    //   23: istore 5
    //   25: aload_3
    //   26: invokeinterface 97 1 0
    //   31: ifeq +71 -> 102
    //   34: aload_3
    //   35: invokeinterface 101 1 0
    //   40: checkcast 67	com/mixpanel/android/mpmetrics/Survey
    //   43: astore 9
    //   45: aload 9
    //   47: invokevirtual 103	com/mixpanel/android/mpmetrics/Survey:b	()I
    //   50: istore 6
    //   52: aload_0
    //   53: getfield 52	com/mixpanel/android/mpmetrics/o:c	Ljava/util/Set;
    //   56: iload 6
    //   58: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   61: invokeinterface 115 2 0
    //   66: ifne +423 -> 489
    //   69: aload_0
    //   70: getfield 52	com/mixpanel/android/mpmetrics/o:c	Ljava/util/Set;
    //   73: iload 6
    //   75: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: invokeinterface 117 2 0
    //   83: pop
    //   84: aload_0
    //   85: getfield 48	com/mixpanel/android/mpmetrics/o:e	Ljava/util/List;
    //   88: aload 9
    //   90: invokeinterface 118 2 0
    //   95: pop
    //   96: iconst_1
    //   97: istore 5
    //   99: goto +390 -> 489
    //   102: aload_2
    //   103: invokeinterface 92 1 0
    //   108: astore_3
    //   109: aload_3
    //   110: invokeinterface 97 1 0
    //   115: ifeq +71 -> 186
    //   118: aload_3
    //   119: invokeinterface 101 1 0
    //   124: checkcast 120	com/mixpanel/android/mpmetrics/InAppNotification
    //   127: astore 9
    //   129: aload 9
    //   131: invokevirtual 121	com/mixpanel/android/mpmetrics/InAppNotification:b	()I
    //   134: istore 6
    //   136: aload_0
    //   137: getfield 54	com/mixpanel/android/mpmetrics/o:d	Ljava/util/Set;
    //   140: iload 6
    //   142: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   145: invokeinterface 115 2 0
    //   150: ifne +336 -> 486
    //   153: aload_0
    //   154: getfield 54	com/mixpanel/android/mpmetrics/o:d	Ljava/util/Set;
    //   157: iload 6
    //   159: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   162: invokeinterface 117 2 0
    //   167: pop
    //   168: aload_0
    //   169: getfield 50	com/mixpanel/android/mpmetrics/o:f	Ljava/util/List;
    //   172: aload 9
    //   174: invokeinterface 118 2 0
    //   179: pop
    //   180: iconst_1
    //   181: istore 5
    //   183: goto +309 -> 492
    //   186: aload 4
    //   188: invokevirtual 126	org/json/JSONArray:length	()I
    //   191: istore 8
    //   193: iconst_0
    //   194: istore 6
    //   196: iload 6
    //   198: iload 8
    //   200: if_icmpge +280 -> 480
    //   203: aload 4
    //   205: iload 6
    //   207: invokevirtual 130	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   210: astore_3
    //   211: getstatic 32	com/mixpanel/android/mpmetrics/o:j	Ljava/util/Set;
    //   214: aload_3
    //   215: ldc -124
    //   217: invokevirtual 138	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   220: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: invokeinterface 115 2 0
    //   228: ifne +267 -> 495
    //   231: aload_0
    //   232: aload 4
    //   234: putfield 140	com/mixpanel/android/mpmetrics/o:i	Lorg/json/JSONArray;
    //   237: iconst_1
    //   238: istore 5
    //   240: iload 7
    //   242: istore 6
    //   244: iload 6
    //   246: ifeq +135 -> 381
    //   249: getstatic 32	com/mixpanel/android/mpmetrics/o:j	Ljava/util/Set;
    //   252: invokeinterface 141 1 0
    //   257: iconst_0
    //   258: istore 6
    //   260: iload 6
    //   262: iload 8
    //   264: if_icmpge +117 -> 381
    //   267: aload_0
    //   268: getfield 140	com/mixpanel/android/mpmetrics/o:i	Lorg/json/JSONArray;
    //   271: iload 6
    //   273: invokevirtual 130	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   276: astore_3
    //   277: getstatic 32	com/mixpanel/android/mpmetrics/o:j	Ljava/util/Set;
    //   280: aload_3
    //   281: ldc -124
    //   283: invokevirtual 138	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   286: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   289: invokeinterface 117 2 0
    //   294: pop
    //   295: iload 6
    //   297: iconst_1
    //   298: iadd
    //   299: istore 6
    //   301: goto -41 -> 260
    //   304: astore_3
    //   305: ldc -113
    //   307: new 145	java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   314: ldc -108
    //   316: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: iload 6
    //   321: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   324: ldc -99
    //   326: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: aload_3
    //   333: invokestatic 165	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   336: pop
    //   337: goto +158 -> 495
    //   340: astore_3
    //   341: ldc -113
    //   343: new 145	java/lang/StringBuilder
    //   346: dup
    //   347: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   350: ldc -108
    //   352: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: iload 6
    //   357: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   360: ldc -89
    //   362: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   368: aload_3
    //   369: invokestatic 165	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   372: pop
    //   373: goto -78 -> 295
    //   376: astore_1
    //   377: aload_0
    //   378: monitorexit
    //   379: aload_1
    //   380: athrow
    //   381: getstatic 172	com/mixpanel/android/mpmetrics/ab:a	Z
    //   384: ifeq +65 -> 449
    //   387: ldc -113
    //   389: new 145	java/lang/StringBuilder
    //   392: dup
    //   393: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   396: ldc -82
    //   398: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: aload_1
    //   402: invokeinterface 71 1 0
    //   407: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   410: ldc -80
    //   412: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: aload_2
    //   416: invokeinterface 71 1 0
    //   421: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   424: ldc -78
    //   426: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: aload 4
    //   431: invokevirtual 126	org/json/JSONArray:length	()I
    //   434: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   437: ldc -76
    //   439: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   445: invokestatic 184	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   448: pop
    //   449: iload 5
    //   451: ifeq +26 -> 477
    //   454: aload_0
    //   455: invokevirtual 186	com/mixpanel/android/mpmetrics/o:d	()Z
    //   458: ifeq +19 -> 477
    //   461: aload_0
    //   462: getfield 39	com/mixpanel/android/mpmetrics/o:g	Lcom/mixpanel/android/mpmetrics/p;
    //   465: ifnull +12 -> 477
    //   468: aload_0
    //   469: getfield 39	com/mixpanel/android/mpmetrics/o:g	Lcom/mixpanel/android/mpmetrics/p;
    //   472: invokeinterface 190 1 0
    //   477: aload_0
    //   478: monitorexit
    //   479: return
    //   480: iconst_0
    //   481: istore 6
    //   483: goto -239 -> 244
    //   486: goto +6 -> 492
    //   489: goto -464 -> 25
    //   492: goto -383 -> 109
    //   495: iload 6
    //   497: iconst_1
    //   498: iadd
    //   499: istore 6
    //   501: goto -305 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	504	0	this	o
    //   0	504	1	paramList	List<Survey>
    //   0	504	2	paramList1	List<InAppNotification>
    //   0	504	3	paramJSONArray1	JSONArray
    //   0	504	4	paramJSONArray2	JSONArray
    //   23	427	5	k	int
    //   50	450	6	m	int
    //   1	240	7	n	int
    //   191	74	8	i1	int
    //   43	130	9	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   203	237	304	org/json/JSONException
    //   267	295	340	org/json/JSONException
    //   5	22	376	finally
    //   25	96	376	finally
    //   102	109	376	finally
    //   109	180	376	finally
    //   186	193	376	finally
    //   203	237	376	finally
    //   249	257	376	finally
    //   267	295	376	finally
    //   305	337	376	finally
    //   341	373	376	finally
    //   381	449	376	finally
    //   454	477	376	finally
  }
  
  public InAppNotification b(boolean paramBoolean)
  {
    for (;;)
    {
      InAppNotification localInAppNotification;
      try
      {
        Object localObject1;
        if (this.f.isEmpty())
        {
          if (ab.a) {
            Log.v("MixpanelAPI.DecideUpdts", "No unseen notifications exist, none will be returned.");
          }
          localObject1 = null;
          return (InAppNotification)localObject1;
        }
        localInAppNotification = (InAppNotification)this.f.remove(0);
        if (paramBoolean)
        {
          this.f.add(this.f.size(), localInAppNotification);
          localObject1 = localInAppNotification;
          continue;
        }
        localObject3 = localInAppNotification;
      }
      finally {}
      Object localObject3;
      if (ab.a)
      {
        Log.v("MixpanelAPI.DecideUpdts", "Recording notification " + localInAppNotification + " as seen.");
        localObject3 = localInAppNotification;
      }
    }
  }
  
  public String b()
  {
    try
    {
      String str = this.a;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public JSONArray c()
  {
    try
    {
      JSONArray localJSONArray = this.i;
      return localJSONArray;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	com/mixpanel/android/mpmetrics/o:f	Ljava/util/List;
    //   6: invokeinterface 61 1 0
    //   11: ifeq +24 -> 35
    //   14: aload_0
    //   15: getfield 48	com/mixpanel/android/mpmetrics/o:e	Ljava/util/List;
    //   18: invokeinterface 61 1 0
    //   23: ifeq +12 -> 35
    //   26: aload_0
    //   27: getfield 140	com/mixpanel/android/mpmetrics/o:i	Lorg/json/JSONArray;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnull +9 -> 41
    //   35: iconst_1
    //   36: istore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: iload_1
    //   40: ireturn
    //   41: iconst_0
    //   42: istore_1
    //   43: goto -6 -> 37
    //   46: astore_2
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_2
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	o
    //   36	7	1	bool	boolean
    //   30	2	2	localJSONArray	JSONArray
    //   46	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	31	46	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */