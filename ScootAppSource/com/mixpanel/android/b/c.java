package com.mixpanel.android.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.mixpanel.android.mpmetrics.ab;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class c
  implements g
{
  private static byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[' '];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    localByteArrayOutputStream.flush();
    return localByteArrayOutputStream.toByteArray();
  }
  
  public boolean a(Context paramContext)
  {
    for (;;)
    {
      try
      {
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if ((paramContext != null) && (paramContext.isConnectedOrConnecting()))
        {
          bool1 = true;
          boolean bool2 = bool1;
          if (ab.a)
          {
            StringBuilder localStringBuilder = new StringBuilder().append("ConnectivityManager says we ");
            if (bool1)
            {
              paramContext = "are";
              Log.v("MixpanelAPI.Message", paramContext + " online");
              return bool1;
            }
            paramContext = "are not";
            continue;
          }
          return bool2;
        }
      }
      catch (SecurityException paramContext)
      {
        if (ab.a) {
          Log.v("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
        }
        bool2 = true;
      }
      boolean bool1 = false;
    }
  }
  
  /* Error */
  public byte[] a(String paramString, java.util.List<org.apache.http.NameValuePair> paramList, javax.net.ssl.SSLSocketFactory paramSSLSocketFactory)
  {
    // Byte code:
    //   0: getstatic 61	com/mixpanel/android/mpmetrics/ab:a	Z
    //   3: ifeq +28 -> 31
    //   6: ldc 74
    //   8: new 63	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   15: ldc 97
    //   17: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: aload_1
    //   21: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokestatic 86	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   30: pop
    //   31: aconst_null
    //   32: astore 7
    //   34: iconst_0
    //   35: istore 5
    //   37: iconst_0
    //   38: istore 4
    //   40: iload 5
    //   42: iconst_3
    //   43: if_icmpge +560 -> 603
    //   46: iload 4
    //   48: ifne +555 -> 603
    //   51: aconst_null
    //   52: astore 14
    //   54: aconst_null
    //   55: astore 10
    //   57: aconst_null
    //   58: astore 15
    //   60: aconst_null
    //   61: astore 13
    //   63: aconst_null
    //   64: astore 12
    //   66: aconst_null
    //   67: astore 19
    //   69: aconst_null
    //   70: astore 8
    //   72: aconst_null
    //   73: astore 20
    //   75: aconst_null
    //   76: astore 11
    //   78: aconst_null
    //   79: astore 17
    //   81: aconst_null
    //   82: astore 16
    //   84: aconst_null
    //   85: astore 9
    //   87: aconst_null
    //   88: astore 18
    //   90: new 99	java/net/URL
    //   93: dup
    //   94: aload_1
    //   95: invokespecial 102	java/net/URL:<init>	(Ljava/lang/String;)V
    //   98: invokevirtual 106	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   101: checkcast 108	java/net/HttpURLConnection
    //   104: astore 6
    //   106: aload_3
    //   107: ifnull +36 -> 143
    //   110: aload 19
    //   112: astore 9
    //   114: aload 8
    //   116: astore 10
    //   118: aload 6
    //   120: instanceof 110
    //   123: ifeq +20 -> 143
    //   126: aload 19
    //   128: astore 9
    //   130: aload 8
    //   132: astore 10
    //   134: aload 6
    //   136: checkcast 110	javax/net/ssl/HttpsURLConnection
    //   139: aload_3
    //   140: invokevirtual 114	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   143: aload 19
    //   145: astore 9
    //   147: aload 8
    //   149: astore 10
    //   151: aload 6
    //   153: sipush 2000
    //   156: invokevirtual 118	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   159: aload 19
    //   161: astore 9
    //   163: aload 8
    //   165: astore 10
    //   167: aload 6
    //   169: sipush 10000
    //   172: invokevirtual 121	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   175: aload_2
    //   176: ifnull +867 -> 1043
    //   179: aload 19
    //   181: astore 9
    //   183: aload 8
    //   185: astore 10
    //   187: aload 6
    //   189: iconst_1
    //   190: invokevirtual 125	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   193: aload 19
    //   195: astore 9
    //   197: aload 8
    //   199: astore 10
    //   201: new 127	org/apache/http/client/entity/UrlEncodedFormEntity
    //   204: dup
    //   205: aload_2
    //   206: ldc -127
    //   208: invokespecial 132	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   211: astore 12
    //   213: aload 19
    //   215: astore 9
    //   217: aload 8
    //   219: astore 10
    //   221: aload 6
    //   223: ldc -122
    //   225: invokevirtual 137	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   228: aload 19
    //   230: astore 9
    //   232: aload 8
    //   234: astore 10
    //   236: aload 6
    //   238: aload 12
    //   240: invokevirtual 141	org/apache/http/client/entity/UrlEncodedFormEntity:getContentLength	()J
    //   243: l2i
    //   244: invokevirtual 144	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   247: aload 19
    //   249: astore 9
    //   251: aload 8
    //   253: astore 10
    //   255: aload 6
    //   257: invokevirtual 148	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   260: astore 8
    //   262: aload 8
    //   264: astore 9
    //   266: aload 8
    //   268: astore 10
    //   270: new 150	java/io/BufferedOutputStream
    //   273: dup
    //   274: aload 8
    //   276: invokespecial 153	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   279: astore 11
    //   281: aload 12
    //   283: aload 11
    //   285: invokevirtual 156	org/apache/http/client/entity/UrlEncodedFormEntity:writeTo	(Ljava/io/OutputStream;)V
    //   288: aload 11
    //   290: invokevirtual 159	java/io/BufferedOutputStream:close	()V
    //   293: aload 8
    //   295: invokevirtual 162	java/io/OutputStream:close	()V
    //   298: aconst_null
    //   299: astore 11
    //   301: aconst_null
    //   302: astore 12
    //   304: aload 6
    //   306: invokevirtual 166	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   309: astore 8
    //   311: aload 8
    //   313: invokestatic 168	com/mixpanel/android/b/c:a	(Ljava/io/InputStream;)[B
    //   316: astore 9
    //   318: aload 8
    //   320: invokevirtual 169	java/io/InputStream:close	()V
    //   323: iconst_0
    //   324: ifeq +11 -> 335
    //   327: new 171	java/lang/NullPointerException
    //   330: dup
    //   331: invokespecial 172	java/lang/NullPointerException:<init>	()V
    //   334: athrow
    //   335: iconst_0
    //   336: ifeq +11 -> 347
    //   339: new 171	java/lang/NullPointerException
    //   342: dup
    //   343: invokespecial 172	java/lang/NullPointerException:<init>	()V
    //   346: athrow
    //   347: iconst_0
    //   348: ifeq +11 -> 359
    //   351: new 171	java/lang/NullPointerException
    //   354: dup
    //   355: invokespecial 172	java/lang/NullPointerException:<init>	()V
    //   358: athrow
    //   359: aload 6
    //   361: ifnull +688 -> 1049
    //   364: aload 6
    //   366: invokevirtual 175	java/net/HttpURLConnection:disconnect	()V
    //   369: iconst_1
    //   370: istore 4
    //   372: aload 9
    //   374: astore 6
    //   376: aload 6
    //   378: astore 7
    //   380: goto -340 -> 40
    //   383: astore 6
    //   385: aconst_null
    //   386: astore 9
    //   388: aconst_null
    //   389: astore 8
    //   391: aconst_null
    //   392: astore 11
    //   394: aload 7
    //   396: astore 6
    //   398: aload 13
    //   400: astore 10
    //   402: aload 11
    //   404: astore 7
    //   406: getstatic 61	com/mixpanel/android/mpmetrics/ab:a	Z
    //   409: ifeq +11 -> 420
    //   412: ldc 74
    //   414: ldc -79
    //   416: invokestatic 180	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   419: pop
    //   420: iload 5
    //   422: iconst_1
    //   423: iadd
    //   424: istore 5
    //   426: aload 8
    //   428: ifnull +8 -> 436
    //   431: aload 8
    //   433: invokevirtual 159	java/io/BufferedOutputStream:close	()V
    //   436: aload 9
    //   438: ifnull +8 -> 446
    //   441: aload 9
    //   443: invokevirtual 162	java/io/OutputStream:close	()V
    //   446: aload 10
    //   448: ifnull +8 -> 456
    //   451: aload 10
    //   453: invokevirtual 169	java/io/InputStream:close	()V
    //   456: aload 7
    //   458: ifnull +588 -> 1046
    //   461: aload 7
    //   463: invokevirtual 175	java/net/HttpURLConnection:disconnect	()V
    //   466: goto -90 -> 376
    //   469: astore_2
    //   470: aload 14
    //   472: astore 6
    //   474: aload 20
    //   476: astore 8
    //   478: aload 16
    //   480: astore_3
    //   481: aload 18
    //   483: astore_1
    //   484: aload_1
    //   485: astore 9
    //   487: aload_3
    //   488: astore 11
    //   490: aload 8
    //   492: astore 12
    //   494: aload 6
    //   496: astore 10
    //   498: sipush 503
    //   501: aload_1
    //   502: invokevirtual 184	java/net/HttpURLConnection:getResponseCode	()I
    //   505: if_icmpne +82 -> 587
    //   508: aload_1
    //   509: astore 9
    //   511: aload_3
    //   512: astore 11
    //   514: aload 8
    //   516: astore 12
    //   518: aload 6
    //   520: astore 10
    //   522: new 186	com/mixpanel/android/b/h
    //   525: dup
    //   526: ldc -68
    //   528: aload_1
    //   529: ldc -66
    //   531: invokevirtual 194	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   534: invokespecial 197	com/mixpanel/android/b/h:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   537: athrow
    //   538: astore_1
    //   539: aload 12
    //   541: astore 8
    //   543: aload 11
    //   545: astore_3
    //   546: aload 9
    //   548: astore_2
    //   549: aload_3
    //   550: ifnull +7 -> 557
    //   553: aload_3
    //   554: invokevirtual 159	java/io/BufferedOutputStream:close	()V
    //   557: aload 8
    //   559: ifnull +8 -> 567
    //   562: aload 8
    //   564: invokevirtual 162	java/io/OutputStream:close	()V
    //   567: aload 10
    //   569: ifnull +8 -> 577
    //   572: aload 10
    //   574: invokevirtual 169	java/io/InputStream:close	()V
    //   577: aload_2
    //   578: ifnull +7 -> 585
    //   581: aload_2
    //   582: invokevirtual 175	java/net/HttpURLConnection:disconnect	()V
    //   585: aload_1
    //   586: athrow
    //   587: aload_1
    //   588: astore 9
    //   590: aload_3
    //   591: astore 11
    //   593: aload 8
    //   595: astore 12
    //   597: aload 6
    //   599: astore 10
    //   601: aload_2
    //   602: athrow
    //   603: getstatic 61	com/mixpanel/android/mpmetrics/ab:a	Z
    //   606: ifeq +17 -> 623
    //   609: iload 5
    //   611: iconst_3
    //   612: if_icmplt +11 -> 623
    //   615: ldc 74
    //   617: ldc -57
    //   619: invokestatic 86	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   622: pop
    //   623: aload 7
    //   625: areturn
    //   626: astore 7
    //   628: goto -293 -> 335
    //   631: astore 7
    //   633: goto -286 -> 347
    //   636: astore 7
    //   638: goto -279 -> 359
    //   641: astore 8
    //   643: goto -207 -> 436
    //   646: astore 8
    //   648: goto -202 -> 446
    //   651: astore 8
    //   653: goto -197 -> 456
    //   656: astore_3
    //   657: goto -100 -> 557
    //   660: astore_3
    //   661: goto -94 -> 567
    //   664: astore_3
    //   665: goto -88 -> 577
    //   668: astore_1
    //   669: aload 7
    //   671: astore_2
    //   672: aload 8
    //   674: astore_3
    //   675: aload 9
    //   677: astore 8
    //   679: goto -130 -> 549
    //   682: astore_1
    //   683: aload 6
    //   685: astore_2
    //   686: aload 17
    //   688: astore_3
    //   689: aload 9
    //   691: astore 8
    //   693: aload 15
    //   695: astore 10
    //   697: goto -148 -> 549
    //   700: astore_1
    //   701: aload 11
    //   703: astore_3
    //   704: aload 6
    //   706: astore_2
    //   707: aload 15
    //   709: astore 10
    //   711: goto -162 -> 549
    //   714: astore_1
    //   715: aconst_null
    //   716: astore_3
    //   717: aload 6
    //   719: astore_2
    //   720: aload 15
    //   722: astore 10
    //   724: goto -175 -> 549
    //   727: astore_1
    //   728: aconst_null
    //   729: astore_3
    //   730: aconst_null
    //   731: astore 8
    //   733: aload 6
    //   735: astore_2
    //   736: aload 15
    //   738: astore 10
    //   740: goto -191 -> 549
    //   743: astore_1
    //   744: aconst_null
    //   745: astore_3
    //   746: aload 8
    //   748: astore 10
    //   750: aconst_null
    //   751: astore 8
    //   753: aload 6
    //   755: astore_2
    //   756: goto -207 -> 549
    //   759: astore_2
    //   760: aload 6
    //   762: astore_1
    //   763: aload 16
    //   765: astore_3
    //   766: aload 10
    //   768: astore 8
    //   770: aload 14
    //   772: astore 6
    //   774: goto -290 -> 484
    //   777: astore_2
    //   778: aload 11
    //   780: astore_3
    //   781: aload 6
    //   783: astore_1
    //   784: aload 14
    //   786: astore 6
    //   788: goto -304 -> 484
    //   791: astore_2
    //   792: aconst_null
    //   793: astore_3
    //   794: aload 6
    //   796: astore_1
    //   797: aload 14
    //   799: astore 6
    //   801: goto -317 -> 484
    //   804: astore_2
    //   805: aconst_null
    //   806: astore_3
    //   807: aconst_null
    //   808: astore 8
    //   810: aload 6
    //   812: astore_1
    //   813: aload 14
    //   815: astore 6
    //   817: goto -333 -> 484
    //   820: astore_2
    //   821: aconst_null
    //   822: astore_3
    //   823: aload 8
    //   825: astore 7
    //   827: aconst_null
    //   828: astore 8
    //   830: aload 6
    //   832: astore_1
    //   833: aload 7
    //   835: astore 6
    //   837: goto -353 -> 484
    //   840: astore 8
    //   842: aconst_null
    //   843: astore 9
    //   845: aconst_null
    //   846: astore 10
    //   848: aload 6
    //   850: astore 8
    //   852: aload 7
    //   854: astore 6
    //   856: aload 8
    //   858: astore 7
    //   860: aload 10
    //   862: astore 8
    //   864: aload 13
    //   866: astore 10
    //   868: goto -462 -> 406
    //   871: astore 9
    //   873: aload 8
    //   875: astore 9
    //   877: aconst_null
    //   878: astore 10
    //   880: aload 6
    //   882: astore 8
    //   884: aload 7
    //   886: astore 6
    //   888: aload 8
    //   890: astore 7
    //   892: aload 10
    //   894: astore 8
    //   896: aload 13
    //   898: astore 10
    //   900: goto -494 -> 406
    //   903: astore 9
    //   905: aload 6
    //   907: astore 10
    //   909: aload 8
    //   911: astore 9
    //   913: aload 11
    //   915: astore 8
    //   917: aload 7
    //   919: astore 6
    //   921: aload 10
    //   923: astore 7
    //   925: aload 13
    //   927: astore 10
    //   929: goto -523 -> 406
    //   932: astore 9
    //   934: aload 6
    //   936: astore 10
    //   938: aload 8
    //   940: astore 9
    //   942: aconst_null
    //   943: astore 8
    //   945: aload 7
    //   947: astore 6
    //   949: aload 10
    //   951: astore 7
    //   953: aload 13
    //   955: astore 10
    //   957: goto -551 -> 406
    //   960: astore 8
    //   962: aload 6
    //   964: astore 8
    //   966: aload 7
    //   968: astore 6
    //   970: aload 8
    //   972: astore 7
    //   974: aload 12
    //   976: astore 8
    //   978: aload 11
    //   980: astore 9
    //   982: aload 13
    //   984: astore 10
    //   986: goto -580 -> 406
    //   989: astore 9
    //   991: aload 6
    //   993: astore 9
    //   995: aload 8
    //   997: astore 10
    //   999: aload 7
    //   1001: astore 6
    //   1003: aload 9
    //   1005: astore 7
    //   1007: aload 12
    //   1009: astore 8
    //   1011: aload 11
    //   1013: astore 9
    //   1015: goto -609 -> 406
    //   1018: astore 7
    //   1020: aload 8
    //   1022: astore 10
    //   1024: aload 6
    //   1026: astore 7
    //   1028: aload 9
    //   1030: astore 6
    //   1032: aload 12
    //   1034: astore 8
    //   1036: aload 11
    //   1038: astore 9
    //   1040: goto -634 -> 406
    //   1043: goto -745 -> 298
    //   1046: goto -670 -> 376
    //   1049: iconst_1
    //   1050: istore 4
    //   1052: aload 9
    //   1054: astore 6
    //   1056: goto -680 -> 376
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1059	0	this	c
    //   0	1059	1	paramString	String
    //   0	1059	2	paramList	java.util.List<org.apache.http.NameValuePair>
    //   0	1059	3	paramSSLSocketFactory	javax.net.ssl.SSLSocketFactory
    //   38	1013	4	i	int
    //   35	578	5	j	int
    //   104	273	6	localObject1	Object
    //   383	1	6	localEOFException1	java.io.EOFException
    //   396	659	6	localObject2	Object
    //   32	592	7	localObject3	Object
    //   626	1	7	localIOException1	java.io.IOException
    //   631	1	7	localIOException2	java.io.IOException
    //   636	34	7	localIOException3	java.io.IOException
    //   825	181	7	localObject4	Object
    //   1018	1	7	localEOFException2	java.io.EOFException
    //   1026	1	7	localObject5	Object
    //   70	524	8	localObject6	Object
    //   641	1	8	localIOException4	java.io.IOException
    //   646	1	8	localIOException5	java.io.IOException
    //   651	22	8	localIOException6	java.io.IOException
    //   677	152	8	localObject7	Object
    //   840	1	8	localEOFException3	java.io.EOFException
    //   850	94	8	localObject8	Object
    //   960	1	8	localEOFException4	java.io.EOFException
    //   964	71	8	localObject9	Object
    //   85	759	9	localObject10	Object
    //   871	1	9	localEOFException5	java.io.EOFException
    //   875	1	9	localObject11	Object
    //   903	1	9	localEOFException6	java.io.EOFException
    //   911	1	9	localObject12	Object
    //   932	1	9	localEOFException7	java.io.EOFException
    //   940	41	9	localObject13	Object
    //   989	1	9	localEOFException8	java.io.EOFException
    //   993	60	9	localObject14	Object
    //   55	968	10	localObject15	Object
    //   76	961	11	localObject16	Object
    //   64	969	12	localObject17	Object
    //   61	922	13	localObject18	Object
    //   52	762	14	localObject19	Object
    //   58	679	15	localObject20	Object
    //   82	682	16	localObject21	Object
    //   79	608	17	localObject22	Object
    //   88	394	18	localObject23	Object
    //   67	181	19	localObject24	Object
    //   73	402	20	localObject25	Object
    // Exception table:
    //   from	to	target	type
    //   90	106	383	java/io/EOFException
    //   90	106	469	java/io/IOException
    //   90	106	538	finally
    //   498	508	538	finally
    //   522	538	538	finally
    //   601	603	538	finally
    //   327	335	626	java/io/IOException
    //   339	347	631	java/io/IOException
    //   351	359	636	java/io/IOException
    //   431	436	641	java/io/IOException
    //   441	446	646	java/io/IOException
    //   451	456	651	java/io/IOException
    //   553	557	656	java/io/IOException
    //   562	567	660	java/io/IOException
    //   572	577	664	java/io/IOException
    //   406	420	668	finally
    //   118	126	682	finally
    //   134	143	682	finally
    //   151	159	682	finally
    //   167	175	682	finally
    //   187	193	682	finally
    //   201	213	682	finally
    //   221	228	682	finally
    //   236	247	682	finally
    //   255	262	682	finally
    //   270	281	682	finally
    //   281	293	700	finally
    //   293	298	714	finally
    //   304	311	727	finally
    //   311	318	743	finally
    //   318	323	743	finally
    //   118	126	759	java/io/IOException
    //   134	143	759	java/io/IOException
    //   151	159	759	java/io/IOException
    //   167	175	759	java/io/IOException
    //   187	193	759	java/io/IOException
    //   201	213	759	java/io/IOException
    //   221	228	759	java/io/IOException
    //   236	247	759	java/io/IOException
    //   255	262	759	java/io/IOException
    //   270	281	759	java/io/IOException
    //   281	293	777	java/io/IOException
    //   293	298	791	java/io/IOException
    //   304	311	804	java/io/IOException
    //   311	318	820	java/io/IOException
    //   318	323	820	java/io/IOException
    //   118	126	840	java/io/EOFException
    //   134	143	840	java/io/EOFException
    //   151	159	840	java/io/EOFException
    //   167	175	840	java/io/EOFException
    //   187	193	840	java/io/EOFException
    //   201	213	840	java/io/EOFException
    //   221	228	840	java/io/EOFException
    //   236	247	840	java/io/EOFException
    //   255	262	840	java/io/EOFException
    //   270	281	871	java/io/EOFException
    //   281	293	903	java/io/EOFException
    //   293	298	932	java/io/EOFException
    //   304	311	960	java/io/EOFException
    //   311	318	989	java/io/EOFException
    //   318	323	1018	java/io/EOFException
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */