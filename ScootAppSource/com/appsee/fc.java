package com.appsee;

import android.graphics.Rect;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class fc
{
  private static final int G = 2000;
  private static fc c;
  private final List<ec> A;
  private String B;
  private String D;
  private final List<we> E;
  private Rect F;
  private long M;
  private ml e;
  private final List<xi> f;
  private boolean g;
  private boolean h;
  private od j;
  private he l;
  
  public static fc C()
  {
    try
    {
      if (c == null) {
        c = new fc();
      }
      fc localfc = c;
      return localfc;
    }
    finally {}
  }
  
  public static String C(String paramString)
  {
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int k = i - 1;
    for (i = k; k >= 0; i = k)
    {
      k = paramString.charAt(i);
      int m = i - 1;
      arrayOfChar[i] = ((char)(k ^ 0x7));
      if (m < 0) {
        break;
      }
      k = m - 1;
      arrayOfChar[m] = ((char)(paramString.charAt(m) ^ 0x4));
    }
    return new String(arrayOfChar);
  }
  
  public long C()
  {
    if (ye.C().F()) {
      if (k.C().C() != 0L) {}
    }
    while (this.M == 0L)
    {
      return -1L;
      return wn.C() - k.C().C();
    }
    return wn.C() - this.M;
  }
  
  public Rect C()
  {
    return this.F;
  }
  
  public he C()
  {
    return this.l;
  }
  
  public od C()
  {
    return this.j;
  }
  
  public String C()
  {
    return this.B;
  }
  
  public void C()
  {
    synchronized (this.f)
    {
      this.f.clear();
      return;
    }
  }
  
  public void C(Rect paramRect)
  {
    C(paramRect, C());
  }
  
  public void C(he paramhe)
  {
    this.l = paramhe;
  }
  
  public void C(ml paramml)
  {
    if (!this.h) {
      return;
    }
    long l1 = C();
    if ((wn.H()) && (!ye.C().f())) {
      C(ab.C(kb.C().C()), l1);
    }
    label167:
    for (;;)
    {
      synchronized (this.A)
      {
        if (this.A.isEmpty())
        {
          localObject = this.e;
          if (paramml != localObject)
          {
            vd.C(1, wc.C("5R\020_\032QTY\006_\021X\000W\000_\033XTS\002S\032BN\026QE"), new Object[] { paramml.toString() });
            localObject = this.A;
            if (l1 >= 0L) {
              break label167;
            }
            l1 = 0L;
            ((List)localObject).add(new ec(l1, paramml));
          }
          return;
        }
      }
      Object localObject = ((ec)this.A.get(this.A.size() - 1)).C();
    }
  }
  
  public void C(od paramod)
  {
    this.j = paramod;
  }
  
  public void C(String paramString)
  {
    this.D = paramString;
  }
  
  public void C(String arg1, Map<String, Object> paramMap)
  {
    if (bb.C(???))
    {
      vd.H(3, kl.C("&W#v1V)G}d.G/c5\\7V5G.V4\tgz)E&_.WgV1V)Gg]&^\"\tg\024`"));
      return;
    }
    Object localObject;
    HashMap localHashMap;
    Iterator localIterator;
    Map.Entry localEntry;
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      localObject = bb.C(paramMap.values(), wc.C("X\026"));
      vd.C(1, kl.C("r#W.] \023$F4G(^gV1V)G}\023b@g\0264"), new Object[] { ???, localObject });
      localHashMap = new HashMap();
      if ((paramMap != null) && (!paramMap.isEmpty())) {
        localIterator = paramMap.entrySet().iterator();
      }
    }
    else
    {
      for (;;)
      {
        if (localIterator.hasNext())
        {
          localEntry = (Map.Entry)localIterator.next();
          localObject = localEntry.getValue();
          if (bb.C((String)localEntry.getKey()))
          {
            vd.C(3, wc.C("=X\002W\030_\020\026\004D\033F\021D\000OTX\025[\021\fT\021S\026\022Y\006\026\021@\021X\000\026S\023\007\021"), new Object[] { ??? });
            continue;
            localObject = "";
            break;
          }
          if (!C(localObject))
          {
            vd.C(3, kl.C("\016]1R+Z#\0231R+F\"\023!\\5\0237A(C\"A3Jg\024b@`\023(UgV1V)Gg\024b@`"), new Object[] { localEntry.getKey(), ??? });
          }
          else
          {
            if (localObject != null) {
              break label469;
            }
            localObject = "";
          }
        }
      }
    }
    label469:
    for (;;)
    {
      paramMap = (Map<String, Object>)localObject;
      if (localObject.getClass().equals(URL.class)) {
        paramMap = ((URL)localObject).toString();
      }
      localObject = paramMap;
      if (paramMap.getClass().equals(Date.class)) {
        localObject = bb.C((Date)paramMap);
      }
      paramMap = (Map<String, Object>)localObject;
      if (localObject.getClass().equals(Boolean.class)) {
        paramMap = localObject.toString().toLowerCase();
      }
      localHashMap.put(localEntry.getKey(), paramMap);
      break;
      if (localHashMap.isEmpty()) {}
      for (paramMap = null;; paramMap = localHashMap)
      {
        long l2 = C();
        long l1 = l2;
        if (l2 < 0L) {
          l1 = 0L;
        }
        paramMap = new xi(???, l1, paramMap);
        if (paramMap.C() != null) {}
        for (int i = paramMap.C().size(); (ye.C().H() > 0) && (i + C() > ye.C().H()); i = 1)
        {
          vd.C(3, wc.C("\023X\033D\035X\023\026\021@\021X\000\026S\023\007\021TE\035X\027STO\033CTS\fU\021S\020S\020\026\000^\021\026\025[\033C\032BTY\022\026\021@\021X\000ETW\002W\035Z\025T\030ST_\032\026\rY\001DTF\030W\032\030"), new Object[] { paramMap.C() });
          return;
        }
        synchronized (this.f)
        {
          this.f.add(paramMap);
          return;
        }
      }
    }
  }
  
  public void C(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean C()
  {
    return this.h;
  }
  
  public String H()
  {
    return this.D;
  }
  
  /* Error */
  public void H()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 221	com/appsee/fc:C	()J
    //   4: lstore_1
    //   5: lload_1
    //   6: lconst_0
    //   7: lcmp
    //   8: ifge +880 -> 888
    //   11: lconst_0
    //   12: lstore_1
    //   13: invokestatic 341	com/appsee/bh:C	()Lcom/appsee/bh;
    //   16: invokevirtual 344	com/appsee/bh:C	()Lorg/json/JSONArray;
    //   19: astore_3
    //   20: invokestatic 349	com/appsee/uj:C	()Lcom/appsee/uj;
    //   23: invokevirtual 350	com/appsee/uj:C	()Lorg/json/JSONArray;
    //   26: astore 4
    //   28: invokestatic 355	com/appsee/zc:C	()Lcom/appsee/zc;
    //   31: invokevirtual 356	com/appsee/zc:C	()Lorg/json/JSONArray;
    //   34: astore 5
    //   36: invokestatic 355	com/appsee/zc:C	()Lcom/appsee/zc;
    //   39: invokevirtual 358	com/appsee/zc:H	()Lorg/json/JSONArray;
    //   42: astore 6
    //   44: invokestatic 363	com/appsee/fb:C	()Lcom/appsee/fb;
    //   47: invokevirtual 364	com/appsee/fb:C	()Lorg/json/JSONArray;
    //   50: astore 7
    //   52: new 366	org/json/JSONArray
    //   55: dup
    //   56: invokespecial 367	org/json/JSONArray:<init>	()V
    //   59: astore 8
    //   61: aload_0
    //   62: getfield 49	com/appsee/fc:f	Ljava/util/List;
    //   65: astore 9
    //   67: aload 9
    //   69: monitorenter
    //   70: aload_0
    //   71: getfield 49	com/appsee/fc:f	Ljava/util/List;
    //   74: invokeinterface 66 1 0
    //   79: astore 10
    //   81: aload 10
    //   83: invokeinterface 72 1 0
    //   88: ifeq +25 -> 113
    //   91: aload 8
    //   93: aload 10
    //   95: invokeinterface 76 1 0
    //   100: checkcast 78	com/appsee/xi
    //   103: invokevirtual 370	com/appsee/xi:C	()Lorg/json/JSONObject;
    //   106: invokevirtual 373	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   109: pop
    //   110: goto -29 -> 81
    //   113: aload 9
    //   115: monitorexit
    //   116: new 366	org/json/JSONArray
    //   119: dup
    //   120: invokespecial 367	org/json/JSONArray:<init>	()V
    //   123: astore 9
    //   125: new 375	java/util/HashSet
    //   128: dup
    //   129: invokespecial 376	java/util/HashSet:<init>	()V
    //   132: astore 10
    //   134: aload_0
    //   135: getfield 47	com/appsee/fc:A	Ljava/util/List;
    //   138: astore 11
    //   140: aload 11
    //   142: monitorenter
    //   143: aload_0
    //   144: getfield 47	com/appsee/fc:A	Ljava/util/List;
    //   147: invokeinterface 66 1 0
    //   152: astore 12
    //   154: aload 12
    //   156: invokeinterface 72 1 0
    //   161: ifeq +105 -> 266
    //   164: aload 12
    //   166: invokeinterface 76 1 0
    //   171: checkcast 248	com/appsee/ec
    //   174: astore 13
    //   176: lload_1
    //   177: aload 13
    //   179: invokevirtual 377	com/appsee/ec:C	()J
    //   182: lsub
    //   183: ldc2_w 378
    //   186: lcmp
    //   187: ifle +37 -> 224
    //   190: aload 9
    //   192: aload 13
    //   194: invokevirtual 380	com/appsee/ec:C	()Lorg/json/JSONObject;
    //   197: invokevirtual 373	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   200: pop
    //   201: goto -47 -> 154
    //   204: astore_3
    //   205: aload 11
    //   207: monitorexit
    //   208: aload_3
    //   209: athrow
    //   210: astore_3
    //   211: aload_0
    //   212: iconst_1
    //   213: invokevirtual 382	com/appsee/fc:H	(Z)V
    //   216: aload_3
    //   217: athrow
    //   218: astore_3
    //   219: aload 9
    //   221: monitorexit
    //   222: aload_3
    //   223: athrow
    //   224: aload 10
    //   226: aload 13
    //   228: invokevirtual 377	com/appsee/ec:C	()J
    //   231: invokestatic 388	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   234: invokevirtual 389	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   237: pop
    //   238: iconst_1
    //   239: ldc_w 391
    //   242: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   245: iconst_1
    //   246: anewarray 4	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: aload 13
    //   253: invokevirtual 380	com/appsee/ec:C	()Lorg/json/JSONObject;
    //   256: invokevirtual 394	org/json/JSONObject:toString	()Ljava/lang/String;
    //   259: aastore
    //   260: invokestatic 142	com/appsee/vd:C	(ILjava/lang/String;[Ljava/lang/Object;)V
    //   263: goto -109 -> 154
    //   266: aload 11
    //   268: monitorexit
    //   269: new 366	org/json/JSONArray
    //   272: dup
    //   273: invokespecial 367	org/json/JSONArray:<init>	()V
    //   276: astore 11
    //   278: aload_0
    //   279: getfield 108	com/appsee/fc:F	Landroid/graphics/Rect;
    //   282: ifnonnull +10 -> 292
    //   285: aload_0
    //   286: invokestatic 395	com/appsee/ab:C	()Landroid/graphics/Rect;
    //   289: putfield 108	com/appsee/fc:F	Landroid/graphics/Rect;
    //   292: aload 11
    //   294: aload_0
    //   295: getfield 108	com/appsee/fc:F	Landroid/graphics/Rect;
    //   298: getfield 398	android/graphics/Rect:left	I
    //   301: invokevirtual 401	org/json/JSONArray:put	(I)Lorg/json/JSONArray;
    //   304: pop
    //   305: aload 11
    //   307: aload_0
    //   308: getfield 108	com/appsee/fc:F	Landroid/graphics/Rect;
    //   311: getfield 404	android/graphics/Rect:top	I
    //   314: invokevirtual 401	org/json/JSONArray:put	(I)Lorg/json/JSONArray;
    //   317: pop
    //   318: aload 11
    //   320: aload_0
    //   321: getfield 108	com/appsee/fc:F	Landroid/graphics/Rect;
    //   324: invokevirtual 407	android/graphics/Rect:width	()I
    //   327: invokevirtual 401	org/json/JSONArray:put	(I)Lorg/json/JSONArray;
    //   330: pop
    //   331: aload 11
    //   333: aload_0
    //   334: getfield 108	com/appsee/fc:F	Landroid/graphics/Rect;
    //   337: invokevirtual 410	android/graphics/Rect:height	()I
    //   340: invokevirtual 401	org/json/JSONArray:put	(I)Lorg/json/JSONArray;
    //   343: pop
    //   344: aload_0
    //   345: aconst_null
    //   346: putfield 108	com/appsee/fc:F	Landroid/graphics/Rect;
    //   349: new 366	org/json/JSONArray
    //   352: dup
    //   353: invokespecial 367	org/json/JSONArray:<init>	()V
    //   356: astore 12
    //   358: aload_0
    //   359: getfield 51	com/appsee/fc:E	Ljava/util/List;
    //   362: astore 13
    //   364: aload 13
    //   366: monitorenter
    //   367: aload_0
    //   368: getfield 51	com/appsee/fc:E	Ljava/util/List;
    //   371: invokeinterface 66 1 0
    //   376: astore 14
    //   378: aload 14
    //   380: invokeinterface 72 1 0
    //   385: ifeq +51 -> 436
    //   388: aload 14
    //   390: invokeinterface 76 1 0
    //   395: checkcast 118	com/appsee/we
    //   398: astore 15
    //   400: aload 10
    //   402: aload 15
    //   404: invokevirtual 147	com/appsee/we:C	()J
    //   407: invokestatic 388	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   410: invokevirtual 413	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   413: ifne -35 -> 378
    //   416: aload 12
    //   418: aload 15
    //   420: invokevirtual 414	com/appsee/we:C	()Lorg/json/JSONObject;
    //   423: invokevirtual 373	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   426: pop
    //   427: goto -49 -> 378
    //   430: astore_3
    //   431: aload 13
    //   433: monitorexit
    //   434: aload_3
    //   435: athrow
    //   436: aload 13
    //   438: monitorexit
    //   439: new 393	org/json/JSONObject
    //   442: dup
    //   443: invokespecial 415	org/json/JSONObject:<init>	()V
    //   446: astore 10
    //   448: aload 10
    //   450: ldc_w 417
    //   453: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   456: aload_0
    //   457: getfield 57	com/appsee/fc:e	Lcom/appsee/ml;
    //   460: invokevirtual 420	com/appsee/ml:ordinal	()I
    //   463: invokevirtual 423	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   466: pop
    //   467: aload 10
    //   469: ldc_w 425
    //   472: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   475: aload 11
    //   477: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   480: pop
    //   481: aload 10
    //   483: ldc_w 430
    //   486: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   489: aload_0
    //   490: getfield 40	com/appsee/fc:g	Z
    //   493: invokevirtual 433	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   496: pop
    //   497: aload 10
    //   499: ldc_w 435
    //   502: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   505: lload_1
    //   506: invokevirtual 438	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   509: pop
    //   510: aload 10
    //   512: ldc_w 440
    //   515: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   518: invokestatic 195	com/appsee/ye:C	()Lcom/appsee/ye;
    //   521: invokevirtual 197	com/appsee/ye:F	()Z
    //   524: invokevirtual 433	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   527: pop
    //   528: aload 10
    //   530: ldc_w 442
    //   533: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   536: aload 8
    //   538: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   541: pop
    //   542: aload 10
    //   544: ldc_w 444
    //   547: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   550: aload 5
    //   552: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   555: pop
    //   556: aload 10
    //   558: ldc_w 446
    //   561: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   564: aload 6
    //   566: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   569: pop
    //   570: aload 10
    //   572: ldc_w 448
    //   575: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   578: aload_3
    //   579: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   582: pop
    //   583: aload 10
    //   585: ldc_w 450
    //   588: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   591: aload 4
    //   593: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   596: pop
    //   597: aload 10
    //   599: ldc_w 452
    //   602: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   605: aload 9
    //   607: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   610: pop
    //   611: aload 10
    //   613: ldc_w 454
    //   616: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   619: aload 12
    //   621: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   624: pop
    //   625: aload 10
    //   627: ldc_w 456
    //   630: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   633: aload 7
    //   635: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   638: pop
    //   639: aload_0
    //   640: getfield 216	com/appsee/fc:B	Ljava/lang/String;
    //   643: invokestatic 264	com/appsee/bb:C	(Ljava/lang/String;)Z
    //   646: ifne +19 -> 665
    //   649: aload 10
    //   651: ldc_w 458
    //   654: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   657: aload_0
    //   658: getfield 216	com/appsee/fc:B	Ljava/lang/String;
    //   661: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   664: pop
    //   665: aload_0
    //   666: getfield 214	com/appsee/fc:j	Lcom/appsee/od;
    //   669: ifnull +22 -> 691
    //   672: aload 10
    //   674: ldc_w 460
    //   677: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   680: aload_0
    //   681: getfield 214	com/appsee/fc:j	Lcom/appsee/od;
    //   684: invokevirtual 463	com/appsee/od:C	()Lorg/json/JSONObject;
    //   687: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   690: pop
    //   691: aload_0
    //   692: getfield 258	com/appsee/fc:D	Ljava/lang/String;
    //   695: invokestatic 264	com/appsee/bb:C	(Ljava/lang/String;)Z
    //   698: ifne +19 -> 717
    //   701: aload 10
    //   703: ldc_w 465
    //   706: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   709: aload_0
    //   710: getfield 258	com/appsee/fc:D	Ljava/lang/String;
    //   713: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   716: pop
    //   717: invokestatic 195	com/appsee/ye:C	()Lcom/appsee/ye;
    //   720: invokevirtual 468	com/appsee/ye:L	()Z
    //   723: ifeq +21 -> 744
    //   726: aload 10
    //   728: ldc_w 470
    //   731: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   734: invokestatic 475	com/appsee/lb:C	()Lcom/appsee/lb;
    //   737: invokevirtual 476	com/appsee/lb:C	()Lorg/json/JSONArray;
    //   740: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   743: pop
    //   744: invokestatic 195	com/appsee/ye:C	()Lcom/appsee/ye;
    //   747: invokevirtual 477	com/appsee/ye:C	()Lorg/json/JSONArray;
    //   750: ifnull +21 -> 771
    //   753: aload 10
    //   755: ldc_w 479
    //   758: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   761: invokestatic 195	com/appsee/ye:C	()Lcom/appsee/ye;
    //   764: invokevirtual 477	com/appsee/ye:C	()Lorg/json/JSONArray;
    //   767: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   770: pop
    //   771: aload_0
    //   772: getfield 42	com/appsee/fc:l	Lcom/appsee/he;
    //   775: ifnull +22 -> 797
    //   778: aload 10
    //   780: ldc_w 481
    //   783: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   786: aload_0
    //   787: getfield 42	com/appsee/fc:l	Lcom/appsee/he;
    //   790: invokevirtual 484	com/appsee/he:C	()Lorg/json/JSONObject;
    //   793: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   796: pop
    //   797: invokestatic 195	com/appsee/ye:C	()Lcom/appsee/ye;
    //   800: invokevirtual 485	com/appsee/ye:C	()Z
    //   803: ifeq +21 -> 824
    //   806: aload 10
    //   808: ldc_w 487
    //   811: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   814: invokestatic 492	com/appsee/bc:C	()Lcom/appsee/bc;
    //   817: invokevirtual 493	com/appsee/bc:C	()Lorg/json/JSONObject;
    //   820: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   823: pop
    //   824: invokestatic 498	com/appsee/dl:C	()Lcom/appsee/dl;
    //   827: invokevirtual 499	com/appsee/dl:C	()Lorg/json/JSONObject;
    //   830: astore_3
    //   831: aload_3
    //   832: ifnull +16 -> 848
    //   835: aload 10
    //   837: ldc_w 501
    //   840: invokestatic 133	com/appsee/wc:C	(Ljava/lang/String;)Ljava/lang/String;
    //   843: aload_3
    //   844: invokevirtual 428	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   847: pop
    //   848: aload 10
    //   850: invokevirtual 394	org/json/JSONObject:toString	()Ljava/lang/String;
    //   853: astore_3
    //   854: iconst_1
    //   855: ldc_w 503
    //   858: invokestatic 269	com/appsee/kl:C	(Ljava/lang/String;)Ljava/lang/String;
    //   861: iconst_1
    //   862: anewarray 4	java/lang/Object
    //   865: dup
    //   866: iconst_0
    //   867: aload_3
    //   868: aastore
    //   869: invokestatic 142	com/appsee/vd:C	(ILjava/lang/String;[Ljava/lang/Object;)V
    //   872: aload_3
    //   873: invokestatic 195	com/appsee/ye:C	()Lcom/appsee/ye;
    //   876: invokevirtual 506	com/appsee/ye:a	()Ljava/lang/String;
    //   879: invokestatic 511	com/appsee/hp:C	(Ljava/lang/String;Ljava/lang/String;)V
    //   882: aload_0
    //   883: iconst_1
    //   884: invokevirtual 382	com/appsee/fc:H	(Z)V
    //   887: return
    //   888: goto -875 -> 13
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	891	0	this	fc
    //   4	502	1	l1	long
    //   19	1	3	localJSONArray1	org.json.JSONArray
    //   204	5	3	localObject1	Object
    //   210	7	3	localObject2	Object
    //   218	5	3	localObject3	Object
    //   430	149	3	localObject4	Object
    //   830	43	3	localObject5	Object
    //   26	566	4	localJSONArray2	org.json.JSONArray
    //   34	517	5	localJSONArray3	org.json.JSONArray
    //   42	523	6	localJSONArray4	org.json.JSONArray
    //   50	584	7	localJSONArray5	org.json.JSONArray
    //   59	478	8	localJSONArray6	org.json.JSONArray
    //   79	770	10	localObject7	Object
    //   152	468	12	localObject9	Object
    //   376	13	14	localIterator	Iterator
    //   398	21	15	localwe	we
    // Exception table:
    //   from	to	target	type
    //   143	154	204	finally
    //   154	201	204	finally
    //   205	208	204	finally
    //   224	263	204	finally
    //   266	269	204	finally
    //   0	5	210	finally
    //   13	70	210	finally
    //   116	143	210	finally
    //   208	210	210	finally
    //   222	224	210	finally
    //   269	292	210	finally
    //   292	367	210	finally
    //   434	436	210	finally
    //   439	665	210	finally
    //   665	691	210	finally
    //   691	717	210	finally
    //   717	744	210	finally
    //   744	771	210	finally
    //   771	797	210	finally
    //   797	824	210	finally
    //   824	831	210	finally
    //   835	848	210	finally
    //   848	882	210	finally
    //   70	81	218	finally
    //   81	110	218	finally
    //   113	116	218	finally
    //   219	222	218	finally
    //   367	378	430	finally
    //   378	427	430	finally
    //   431	434	430	finally
    //   436	439	430	finally
  }
  
  public void H(Rect paramRect)
  {
    this.F = paramRect;
  }
  
  public void H(String paramString)
  {
    this.B = paramString;
  }
  
  public void H(boolean paramBoolean)
  {
    this.M = 0L;
    this.h = false;
    synchronized (this.A)
    {
      this.A.clear();
    }
    synchronized (this.E)
    {
      this.E.clear();
      lb.C().C();
      bh.C().C();
      uj.C().H();
      bc.C().C();
      if (paramBoolean) {
        a();
      }
      return;
      localObject1 = finally;
      throw ((Throwable)localObject1);
    }
  }
  
  public boolean H()
  {
    return this.g;
  }
  
  public void K()
  {
    this.M = wn.C();
    this.h = true;
    this.g = false;
    this.l = null;
    uj localuj;
    tl localtl;
    if (rd.C().C())
    {
      localuj = uj.C();
      localtl = tl.E;
      if (!rd.C().H()) {
        break label75;
      }
    }
    label75:
    for (String str = wc.C("\000D\001S");; str = kl.C("!R+@\""))
    {
      localuj.C(localtl, str, null, null);
      this.e = wn.C().C(true);
      return;
    }
  }
  
  public void a()
  {
    zc.C().C();
    fb.C().H();
    C();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */