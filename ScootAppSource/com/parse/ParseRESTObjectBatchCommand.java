package com.parse;

import a.o;
import com.parse.http.ParseHttpRequest.Method;
import com.parse.http.ParseHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

class ParseRESTObjectBatchCommand
  extends ParseRESTCommand
{
  public static final int COMMAND_OBJECT_BATCH_MAX_SIZE = 50;
  private static final String KEY_RESULTS = "results";
  
  private ParseRESTObjectBatchCommand(String paramString1, ParseHttpRequest.Method paramMethod, JSONObject paramJSONObject, String paramString2)
  {
    super(paramString1, paramMethod, paramJSONObject, paramString2);
  }
  
  /* Error */
  public static java.util.List<o<JSONObject>> executeBatch(ParseHttpClient paramParseHttpClient, java.util.List<ParseRESTObjectCommand> paramList, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: invokeinterface 28 1 0
    //   8: istore 4
    //   10: new 30	java/util/ArrayList
    //   13: dup
    //   14: iload 4
    //   16: invokespecial 33	java/util/ArrayList:<init>	(I)V
    //   19: astore 5
    //   21: iload 4
    //   23: iconst_1
    //   24: if_icmpne +28 -> 52
    //   27: aload 5
    //   29: aload_1
    //   30: iconst_0
    //   31: invokeinterface 37 2 0
    //   36: checkcast 39	com/parse/ParseRESTObjectCommand
    //   39: aload_0
    //   40: invokevirtual 43	com/parse/ParseRESTObjectCommand:executeAsync	(Lcom/parse/ParseHttpClient;)La/o;
    //   43: invokeinterface 47 2 0
    //   48: pop
    //   49: aload 5
    //   51: areturn
    //   52: iload 4
    //   54: bipush 50
    //   56: if_icmple +59 -> 115
    //   59: aload_1
    //   60: bipush 50
    //   62: invokestatic 53	com/parse/Lists:partition	(Ljava/util/List;I)Ljava/util/List;
    //   65: astore_1
    //   66: aload_1
    //   67: invokeinterface 28 1 0
    //   72: istore 4
    //   74: iconst_0
    //   75: istore_3
    //   76: iload_3
    //   77: iload 4
    //   79: if_icmpge +33 -> 112
    //   82: aload 5
    //   84: aload_0
    //   85: aload_1
    //   86: iload_3
    //   87: invokeinterface 37 2 0
    //   92: checkcast 24	java/util/List
    //   95: aload_2
    //   96: invokestatic 55	com/parse/ParseRESTObjectBatchCommand:executeBatch	(Lcom/parse/ParseHttpClient;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    //   99: invokeinterface 59 2 0
    //   104: pop
    //   105: iload_3
    //   106: iconst_1
    //   107: iadd
    //   108: istore_3
    //   109: goto -33 -> 76
    //   112: aload 5
    //   114: areturn
    //   115: new 30	java/util/ArrayList
    //   118: dup
    //   119: iload 4
    //   121: invokespecial 33	java/util/ArrayList:<init>	(I)V
    //   124: astore 6
    //   126: iload_3
    //   127: iload 4
    //   129: if_icmpge +42 -> 171
    //   132: new 61	a/ac
    //   135: dup
    //   136: invokespecial 64	a/ac:<init>	()V
    //   139: astore 7
    //   141: aload 6
    //   143: aload 7
    //   145: invokeinterface 47 2 0
    //   150: pop
    //   151: aload 5
    //   153: aload 7
    //   155: invokevirtual 68	a/ac:a	()La/o;
    //   158: invokeinterface 47 2 0
    //   163: pop
    //   164: iload_3
    //   165: iconst_1
    //   166: iadd
    //   167: istore_3
    //   168: goto -42 -> 126
    //   171: new 70	org/json/JSONObject
    //   174: dup
    //   175: invokespecial 71	org/json/JSONObject:<init>	()V
    //   178: astore 7
    //   180: new 73	org/json/JSONArray
    //   183: dup
    //   184: invokespecial 74	org/json/JSONArray:<init>	()V
    //   187: astore 8
    //   189: aload_1
    //   190: invokeinterface 78 1 0
    //   195: astore_1
    //   196: aload_1
    //   197: invokeinterface 84 1 0
    //   202: ifeq +108 -> 310
    //   205: aload_1
    //   206: invokeinterface 88 1 0
    //   211: checkcast 39	com/parse/ParseRESTObjectCommand
    //   214: astore 10
    //   216: new 70	org/json/JSONObject
    //   219: dup
    //   220: invokespecial 71	org/json/JSONObject:<init>	()V
    //   223: astore 9
    //   225: aload 9
    //   227: ldc 90
    //   229: aload 10
    //   231: getfield 93	com/parse/ParseRESTObjectCommand:method	Lcom/parse/http/ParseHttpRequest$Method;
    //   234: invokevirtual 99	com/parse/http/ParseHttpRequest$Method:toString	()Ljava/lang/String;
    //   237: invokevirtual 103	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   240: pop
    //   241: aload 9
    //   243: ldc 105
    //   245: new 107	java/net/URL
    //   248: dup
    //   249: getstatic 111	com/parse/ParseRESTObjectBatchCommand:server	Ljava/net/URL;
    //   252: aload 10
    //   254: getfield 114	com/parse/ParseRESTObjectCommand:httpPath	Ljava/lang/String;
    //   257: invokespecial 117	java/net/URL:<init>	(Ljava/net/URL;Ljava/lang/String;)V
    //   260: invokevirtual 120	java/net/URL:getPath	()Ljava/lang/String;
    //   263: invokevirtual 103	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   266: pop
    //   267: aload 10
    //   269: getfield 124	com/parse/ParseRESTObjectCommand:jsonParameters	Lorg/json/JSONObject;
    //   272: astore 10
    //   274: aload 10
    //   276: ifnull +13 -> 289
    //   279: aload 9
    //   281: ldc 126
    //   283: aload 10
    //   285: invokevirtual 103	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   288: pop
    //   289: aload 8
    //   291: aload 9
    //   293: invokevirtual 129	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   296: pop
    //   297: goto -101 -> 196
    //   300: astore_0
    //   301: new 131	java/lang/RuntimeException
    //   304: dup
    //   305: aload_0
    //   306: invokespecial 134	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   309: athrow
    //   310: aload 7
    //   312: ldc -120
    //   314: aload 8
    //   316: invokevirtual 103	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   319: pop
    //   320: new 2	com/parse/ParseRESTObjectBatchCommand
    //   323: dup
    //   324: ldc -118
    //   326: getstatic 141	com/parse/http/ParseHttpRequest$Method:POST	Lcom/parse/http/ParseHttpRequest$Method;
    //   329: aload 7
    //   331: aload_2
    //   332: invokespecial 142	com/parse/ParseRESTObjectBatchCommand:<init>	(Ljava/lang/String;Lcom/parse/http/ParseHttpRequest$Method;Lorg/json/JSONObject;Ljava/lang/String;)V
    //   335: aload_0
    //   336: invokevirtual 143	com/parse/ParseRESTCommand:executeAsync	(Lcom/parse/ParseHttpClient;)La/o;
    //   339: new 145	com/parse/ParseRESTObjectBatchCommand$1
    //   342: dup
    //   343: iload 4
    //   345: aload 6
    //   347: invokespecial 148	com/parse/ParseRESTObjectBatchCommand$1:<init>	(ILjava/util/List;)V
    //   350: invokevirtual 153	a/o:a	(La/m;)La/o;
    //   353: pop
    //   354: aload 5
    //   356: areturn
    //   357: astore_0
    //   358: new 131	java/lang/RuntimeException
    //   361: dup
    //   362: aload_0
    //   363: invokespecial 134	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   366: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	367	0	paramParseHttpClient	ParseHttpClient
    //   0	367	1	paramList	java.util.List<ParseRESTObjectCommand>
    //   0	367	2	paramString	String
    //   1	167	3	i	int
    //   8	336	4	j	int
    //   19	336	5	localArrayList1	java.util.ArrayList
    //   124	222	6	localArrayList2	java.util.ArrayList
    //   139	191	7	localObject1	Object
    //   187	128	8	localJSONArray	org.json.JSONArray
    //   223	69	9	localJSONObject	JSONObject
    //   214	70	10	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   189	196	300	org/json/JSONException
    //   196	274	300	org/json/JSONException
    //   279	289	300	org/json/JSONException
    //   289	297	300	org/json/JSONException
    //   310	320	300	org/json/JSONException
    //   189	196	357	java/net/MalformedURLException
    //   196	274	357	java/net/MalformedURLException
    //   279	289	357	java/net/MalformedURLException
    //   289	297	357	java/net/MalformedURLException
    //   310	320	357	java/net/MalformedURLException
  }
  
  protected o<JSONObject> onResponseAsync(ParseHttpResponse paramParseHttpResponse, ProgressCallback paramProgressCallback)
  {
    Object localObject = null;
    paramProgressCallback = null;
    try
    {
      paramParseHttpResponse = paramParseHttpResponse.getContent();
      paramProgressCallback = paramParseHttpResponse;
      localObject = paramParseHttpResponse;
      String str = new String(ParseIOUtils.toByteArray(paramParseHttpResponse));
      ParseIOUtils.closeQuietly(paramParseHttpResponse);
      return o.a(newTemporaryException("bad json response", paramParseHttpResponse));
    }
    catch (IOException paramParseHttpResponse)
    {
      paramParseHttpResponse = paramParseHttpResponse;
      localObject = paramProgressCallback;
      paramParseHttpResponse = o.a(paramParseHttpResponse);
      ParseIOUtils.closeQuietly(paramProgressCallback);
      return paramParseHttpResponse;
    }
    finally
    {
      ParseIOUtils.closeQuietly((InputStream)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRESTObjectBatchCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */