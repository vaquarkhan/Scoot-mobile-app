package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.b.az;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest
{
  public static final String a = GraphRequest.class.getSimpleName();
  private static String b;
  private static Pattern c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
  private static volatile String q;
  private AccessToken d;
  private at e;
  private String f;
  private JSONObject g;
  private String h;
  private String i;
  private boolean j = true;
  private Bundle k;
  private ai l;
  private String m;
  private Object n;
  private String o;
  private boolean p = false;
  
  public GraphRequest()
  {
    this(null, null, null, null, null);
  }
  
  public GraphRequest(AccessToken paramAccessToken, String paramString, Bundle paramBundle, at paramat, ai paramai)
  {
    this(paramAccessToken, paramString, paramBundle, paramat, paramai, null);
  }
  
  public GraphRequest(AccessToken paramAccessToken, String paramString1, Bundle paramBundle, at paramat, ai paramai, String paramString2)
  {
    this.d = paramAccessToken;
    this.f = paramString1;
    this.o = paramString2;
    a(paramai);
    a(paramat);
    if (paramBundle != null) {}
    for (this.k = new Bundle(paramBundle);; this.k = new Bundle())
    {
      if (this.o == null) {
        this.o = com.facebook.b.ar.d();
      }
      return;
    }
  }
  
  public static GraphRequest a(AccessToken paramAccessToken, aj paramaj)
  {
    return new GraphRequest(paramAccessToken, "me", null, null, new ad(paramaj));
  }
  
  public static GraphRequest a(AccessToken paramAccessToken, String paramString, ai paramai)
  {
    return new GraphRequest(paramAccessToken, paramString, null, null, paramai);
  }
  
  public static GraphRequest a(AccessToken paramAccessToken, String paramString, JSONObject paramJSONObject, ai paramai)
  {
    paramAccessToken = new GraphRequest(paramAccessToken, paramString, null, at.b, paramai);
    paramAccessToken.a(paramJSONObject);
    return paramAccessToken;
  }
  
  public static as a(GraphRequest paramGraphRequest)
  {
    paramGraphRequest = a(new GraphRequest[] { paramGraphRequest });
    if ((paramGraphRequest == null) || (paramGraphRequest.size() != 1)) {
      throw new p("invalid state: expected a single response");
    }
    return (as)paramGraphRequest.get(0);
  }
  
  private String a(String paramString)
  {
    Uri.Builder localBuilder = new Uri.Builder().encodedPath(paramString);
    Iterator localIterator = this.k.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = this.k.get(str);
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = "";
      }
      if (e(paramString)) {
        localBuilder.appendQueryParameter(str, f(paramString).toString());
      } else if (this.e == at.a) {
        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] { paramString.getClass().getSimpleName() }));
      }
    }
    return localBuilder.toString();
  }
  
  public static HttpURLConnection a(ap paramap)
  {
    d(paramap);
    for (;;)
    {
      try
      {
        if (paramap.size() == 1) {
          localObject = new URL(paramap.a(0).l());
        }
      }
      catch (MalformedURLException paramap)
      {
        Object localObject;
        throw new p("could not construct URL for request", paramap);
      }
      try
      {
        localObject = a((URL)localObject);
        a(paramap, (HttpURLConnection)localObject);
        return (HttpURLConnection)localObject;
      }
      catch (IOException paramap)
      {
        throw new p("could not construct request body", paramap);
      }
      catch (JSONException paramap)
      {
        throw new p("could not construct request body", paramap);
      }
      localObject = new URL(com.facebook.b.ar.b());
    }
  }
  
  private static HttpURLConnection a(URL paramURL)
  {
    paramURL = (HttpURLConnection)paramURL.openConnection();
    paramURL.setRequestProperty("User-Agent", p());
    paramURL.setRequestProperty("Accept-Language", Locale.getDefault().toString());
    paramURL.setChunkedStreamingMode(0);
    return paramURL;
  }
  
  public static List<as> a(HttpURLConnection paramHttpURLConnection, ap paramap)
  {
    List localList = as.a(paramHttpURLConnection, paramap);
    com.facebook.b.as.a(paramHttpURLConnection);
    int i1 = paramap.size();
    if (i1 != localList.size()) {
      throw new p(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] { Integer.valueOf(localList.size()), Integer.valueOf(i1) }));
    }
    a(paramap, localList);
    d.a().d();
    return localList;
  }
  
  public static List<as> a(Collection<GraphRequest> paramCollection)
  {
    return b(new ap(paramCollection));
  }
  
  public static List<as> a(GraphRequest... paramVarArgs)
  {
    az.a(paramVarArgs, "requests");
    return a(Arrays.asList(paramVarArgs));
  }
  
  private static void a(Bundle paramBundle, an paraman, GraphRequest paramGraphRequest)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (e(localObject)) {
        paraman.a(str, localObject, paramGraphRequest);
      }
    }
  }
  
  private static void a(an paraman, Collection<GraphRequest> paramCollection, Map<String, ah> paramMap)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      ((GraphRequest)localIterator.next()).a(localJSONArray, paramMap);
    }
    paraman.a("batch", localJSONArray, paramCollection);
  }
  
  private static void a(ap paramap, com.facebook.b.ag paramag, int paramInt, URL paramURL, OutputStream paramOutputStream, boolean paramBoolean)
  {
    paramOutputStream = new an(paramOutputStream, paramag, paramBoolean);
    if (paramInt == 1)
    {
      paramap = paramap.a(0);
      HashMap localHashMap = new HashMap();
      Iterator localIterator = paramap.k.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramap.k.get(str);
        if (d(localObject)) {
          localHashMap.put(str, new ah(paramap, localObject));
        }
      }
      if (paramag != null) {
        paramag.c("  Parameters:\n");
      }
      a(paramap.k, paramOutputStream, paramap);
      if (paramag != null) {
        paramag.c("  Attachments:\n");
      }
      a(localHashMap, paramOutputStream);
      if (paramap.g != null) {
        a(paramap.g, paramURL.getPath(), paramOutputStream);
      }
      return;
    }
    paramURL = g(paramap);
    if (com.facebook.b.as.a(paramURL)) {
      throw new p("App ID was not specified at the request or Settings.");
    }
    paramOutputStream.a("batch_app_id", paramURL);
    paramURL = new HashMap();
    a(paramOutputStream, paramap, paramURL);
    if (paramag != null) {
      paramag.c("  Attachments:\n");
    }
    a(paramURL, paramOutputStream);
  }
  
  /* Error */
  static final void a(ap paramap, HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: new 359	com/facebook/b/ag
    //   3: dup
    //   4: getstatic 395	com/facebook/av:a	Lcom/facebook/av;
    //   7: ldc_w 397
    //   10: invokespecial 400	com/facebook/b/ag:<init>	(Lcom/facebook/av;Ljava/lang/String;)V
    //   13: astore 7
    //   15: aload_0
    //   16: invokevirtual 213	com/facebook/ap:size	()I
    //   19: istore_3
    //   20: aload_0
    //   21: invokestatic 403	com/facebook/GraphRequest:f	(Lcom/facebook/ap;)Z
    //   24: istore 4
    //   26: iload_3
    //   27: iconst_1
    //   28: if_icmpne +140 -> 168
    //   31: aload_0
    //   32: iconst_0
    //   33: invokevirtual 218	com/facebook/ap:a	(I)Lcom/facebook/GraphRequest;
    //   36: getfield 178	com/facebook/GraphRequest:e	Lcom/facebook/at;
    //   39: astore 5
    //   41: aload_1
    //   42: aload 5
    //   44: invokevirtual 406	com/facebook/at:name	()Ljava/lang/String;
    //   47: invokevirtual 409	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   50: aload_1
    //   51: iload 4
    //   53: invokestatic 412	com/facebook/GraphRequest:a	(Ljava/net/HttpURLConnection;Z)V
    //   56: aload_1
    //   57: invokevirtual 416	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   60: astore 8
    //   62: aload 7
    //   64: ldc_w 418
    //   67: invokevirtual 361	com/facebook/b/ag:c	(Ljava/lang/String;)V
    //   70: aload 7
    //   72: ldc_w 420
    //   75: aload_0
    //   76: invokevirtual 421	com/facebook/ap:b	()Ljava/lang/String;
    //   79: invokevirtual 424	com/facebook/b/ag:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   82: aload 7
    //   84: ldc_w 426
    //   87: aload 8
    //   89: invokevirtual 424	com/facebook/b/ag:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   92: aload 7
    //   94: ldc_w 428
    //   97: aload_1
    //   98: invokevirtual 431	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   101: invokevirtual 424	com/facebook/b/ag:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   104: aload 7
    //   106: ldc -12
    //   108: aload_1
    //   109: ldc -12
    //   111: invokevirtual 434	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   114: invokevirtual 424	com/facebook/b/ag:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   117: aload 7
    //   119: ldc_w 436
    //   122: aload_1
    //   123: ldc_w 436
    //   126: invokevirtual 434	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   129: invokevirtual 424	com/facebook/b/ag:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   132: aload_1
    //   133: aload_0
    //   134: invokevirtual 438	com/facebook/ap:a	()I
    //   137: invokevirtual 441	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   140: aload_1
    //   141: aload_0
    //   142: invokevirtual 438	com/facebook/ap:a	()I
    //   145: invokevirtual 444	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   148: aload 5
    //   150: getstatic 102	com/facebook/at:b	Lcom/facebook/at;
    //   153: if_acmpne +23 -> 176
    //   156: iconst_1
    //   157: istore_2
    //   158: iload_2
    //   159: ifne +22 -> 181
    //   162: aload 7
    //   164: invokevirtual 446	com/facebook/b/ag:a	()V
    //   167: return
    //   168: getstatic 102	com/facebook/at:b	Lcom/facebook/at;
    //   171: astore 5
    //   173: goto -132 -> 41
    //   176: iconst_0
    //   177: istore_2
    //   178: goto -20 -> 158
    //   181: aload_1
    //   182: iconst_1
    //   183: invokevirtual 450	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   186: new 452	java/io/BufferedOutputStream
    //   189: dup
    //   190: aload_1
    //   191: invokevirtual 456	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   194: invokespecial 459	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   197: astore 6
    //   199: aload 6
    //   201: astore_1
    //   202: iload 4
    //   204: ifeq +17 -> 221
    //   207: aload 6
    //   209: astore 5
    //   211: new 461	java/util/zip/GZIPOutputStream
    //   214: dup
    //   215: aload 6
    //   217: invokespecial 462	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   220: astore_1
    //   221: aload_1
    //   222: astore 5
    //   224: aload_0
    //   225: invokestatic 464	com/facebook/GraphRequest:e	(Lcom/facebook/ap;)Z
    //   228: ifeq +116 -> 344
    //   231: aload_1
    //   232: astore 5
    //   234: new 466	com/facebook/ba
    //   237: dup
    //   238: aload_0
    //   239: invokevirtual 469	com/facebook/ap:c	()Landroid/os/Handler;
    //   242: invokespecial 472	com/facebook/ba:<init>	(Landroid/os/Handler;)V
    //   245: astore 6
    //   247: aload_1
    //   248: astore 5
    //   250: aload_0
    //   251: aconst_null
    //   252: iload_3
    //   253: aload 8
    //   255: aload 6
    //   257: iload 4
    //   259: invokestatic 474	com/facebook/GraphRequest:a	(Lcom/facebook/ap;Lcom/facebook/b/ag;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   262: aload_1
    //   263: astore 5
    //   265: aload 6
    //   267: invokevirtual 475	com/facebook/ba:a	()I
    //   270: istore_2
    //   271: aload_1
    //   272: astore 5
    //   274: new 477	com/facebook/bb
    //   277: dup
    //   278: aload_1
    //   279: aload_0
    //   280: aload 6
    //   282: invokevirtual 480	com/facebook/ba:b	()Ljava/util/Map;
    //   285: iload_2
    //   286: i2l
    //   287: invokespecial 483	com/facebook/bb:<init>	(Ljava/io/OutputStream;Lcom/facebook/ap;Ljava/util/Map;J)V
    //   290: astore_1
    //   291: aload_0
    //   292: aload 7
    //   294: iload_3
    //   295: aload 8
    //   297: aload_1
    //   298: iload 4
    //   300: invokestatic 474	com/facebook/GraphRequest:a	(Lcom/facebook/ap;Lcom/facebook/b/ag;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   303: aload_1
    //   304: ifnull +7 -> 311
    //   307: aload_1
    //   308: invokevirtual 488	java/io/OutputStream:close	()V
    //   311: aload 7
    //   313: invokevirtual 446	com/facebook/b/ag:a	()V
    //   316: return
    //   317: astore_0
    //   318: aconst_null
    //   319: astore 5
    //   321: aload 5
    //   323: ifnull +8 -> 331
    //   326: aload 5
    //   328: invokevirtual 488	java/io/OutputStream:close	()V
    //   331: aload_0
    //   332: athrow
    //   333: astore_0
    //   334: goto -13 -> 321
    //   337: astore_0
    //   338: aload_1
    //   339: astore 5
    //   341: goto -20 -> 321
    //   344: goto -53 -> 291
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	347	0	paramap	ap
    //   0	347	1	paramHttpURLConnection	HttpURLConnection
    //   157	129	2	i1	int
    //   19	276	3	i2	int
    //   24	275	4	bool	boolean
    //   39	301	5	localObject1	Object
    //   197	84	6	localObject2	Object
    //   13	299	7	localag	com.facebook.b.ag
    //   60	236	8	localURL	URL
    // Exception table:
    //   from	to	target	type
    //   186	199	317	finally
    //   211	221	333	finally
    //   224	231	333	finally
    //   234	247	333	finally
    //   250	262	333	finally
    //   265	271	333	finally
    //   274	291	333	finally
    //   291	303	337	finally
  }
  
  static void a(ap paramap, List<as> paramList)
  {
    int i2 = paramap.size();
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while (i1 < i2)
    {
      GraphRequest localGraphRequest = paramap.a(i1);
      if (localGraphRequest.l != null) {
        localArrayList.add(new Pair(localGraphRequest.l, paramList.get(i1)));
      }
      i1 += 1;
    }
    if (localArrayList.size() > 0)
    {
      paramList = new af(localArrayList, paramap);
      paramap = paramap.c();
      if (paramap == null) {
        paramList.run();
      }
    }
    else
    {
      return;
    }
    paramap.post(paramList);
  }
  
  private static void a(String paramString, Object paramObject, ak paramak, boolean paramBoolean)
  {
    Object localObject = paramObject.getClass();
    if (JSONObject.class.isAssignableFrom((Class)localObject))
    {
      paramObject = (JSONObject)paramObject;
      if (paramBoolean)
      {
        localObject = ((JSONObject)paramObject).keys();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          a(String.format("%s[%s]", new Object[] { paramString, str }), ((JSONObject)paramObject).opt(str), paramak, paramBoolean);
        }
      }
      if (((JSONObject)paramObject).has("id")) {
        a(paramString, ((JSONObject)paramObject).optString("id"), paramak, paramBoolean);
      }
    }
    do
    {
      for (;;)
      {
        return;
        if (((JSONObject)paramObject).has("url"))
        {
          a(paramString, ((JSONObject)paramObject).optString("url"), paramak, paramBoolean);
          return;
        }
        if (((JSONObject)paramObject).has("fbsdk:create_object"))
        {
          a(paramString, ((JSONObject)paramObject).toString(), paramak, paramBoolean);
          return;
          if (!JSONArray.class.isAssignableFrom((Class)localObject)) {
            break;
          }
          paramObject = (JSONArray)paramObject;
          int i2 = ((JSONArray)paramObject).length();
          int i1 = 0;
          while (i1 < i2)
          {
            a(String.format(Locale.ROOT, "%s[%d]", new Object[] { paramString, Integer.valueOf(i1) }), ((JSONArray)paramObject).opt(i1), paramak, paramBoolean);
            i1 += 1;
          }
        }
      }
      if ((String.class.isAssignableFrom((Class)localObject)) || (Number.class.isAssignableFrom((Class)localObject)) || (Boolean.class.isAssignableFrom((Class)localObject)))
      {
        paramak.a(paramString, paramObject.toString());
        return;
      }
    } while (!Date.class.isAssignableFrom((Class)localObject));
    paramObject = (Date)paramObject;
    paramak.a(paramString, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)paramObject));
  }
  
  private static void a(HttpURLConnection paramHttpURLConnection, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      paramHttpURLConnection.setRequestProperty("Content-Encoding", "gzip");
      return;
    }
    paramHttpURLConnection.setRequestProperty("Content-Type", o());
  }
  
  private static void a(Map<String, ah> paramMap, an paraman)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ah localah = (ah)paramMap.get(str);
      if (d(localah.b())) {
        paraman.a(str, localah.b(), localah.a());
      }
    }
  }
  
  private void a(JSONArray paramJSONArray, Map<String, ah> paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    if (this.h != null)
    {
      localJSONObject.put("name", this.h);
      localJSONObject.put("omit_response_on_success", this.j);
    }
    if (this.i != null) {
      localJSONObject.put("depends_on", this.i);
    }
    String str1 = k();
    localJSONObject.put("relative_url", str1);
    localJSONObject.put("method", this.e);
    if (this.d != null) {
      com.facebook.b.ag.a(this.d.b());
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.k.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = this.k.get((String)localObject);
      if (d(localObject))
      {
        String str2 = String.format(Locale.ROOT, "%s%d", new Object[] { "file", Integer.valueOf(paramMap.size()) });
        localArrayList.add(str2);
        paramMap.put(str2, new ah(this, localObject));
      }
    }
    if (!localArrayList.isEmpty()) {
      localJSONObject.put("attached_files", TextUtils.join(",", localArrayList));
    }
    if (this.g != null)
    {
      paramMap = new ArrayList();
      a(this.g, str1, new ag(this, paramMap));
      localJSONObject.put("body", TextUtils.join("&", paramMap));
    }
    paramJSONArray.put(localJSONObject);
  }
  
  private static void a(JSONObject paramJSONObject, String paramString, ak paramak)
  {
    int i1;
    if (b(paramString))
    {
      i1 = paramString.indexOf(":");
      int i2 = paramString.indexOf("?");
      if ((i1 > 3) && ((i2 == -1) || (i1 < i2))) {
        i1 = 1;
      }
    }
    for (;;)
    {
      paramString = paramJSONObject.keys();
      label48:
      if (paramString.hasNext())
      {
        String str = (String)paramString.next();
        Object localObject = paramJSONObject.opt(str);
        if ((i1 != 0) && (str.equalsIgnoreCase("image"))) {}
        for (boolean bool = true;; bool = false)
        {
          a(str, localObject, paramak, bool);
          break label48;
          i1 = 0;
          break;
        }
      }
      return;
      i1 = 0;
    }
  }
  
  public static ao b(Collection<GraphRequest> paramCollection)
  {
    return c(new ap(paramCollection));
  }
  
  public static ao b(GraphRequest... paramVarArgs)
  {
    az.a(paramVarArgs, "requests");
    return b(Arrays.asList(paramVarArgs));
  }
  
  public static List<as> b(ap paramap)
  {
    az.c(paramap, "requests");
    try
    {
      HttpURLConnection localHttpURLConnection = a(paramap);
      return a(localHttpURLConnection, paramap);
    }
    catch (Exception localException)
    {
      List localList = as.a(paramap.d(), null, new p(localException));
      a(paramap, localList);
      return localList;
    }
  }
  
  static final boolean b(GraphRequest paramGraphRequest)
  {
    String str = paramGraphRequest.d();
    if (com.facebook.b.as.a(str)) {
      return true;
    }
    paramGraphRequest = str;
    if (str.startsWith("v")) {
      paramGraphRequest = str.substring(1);
    }
    paramGraphRequest = paramGraphRequest.split("\\.");
    if (((paramGraphRequest.length >= 2) && (Integer.parseInt(paramGraphRequest[0]) > 2)) || ((Integer.parseInt(paramGraphRequest[0]) >= 2) && (Integer.parseInt(paramGraphRequest[1]) >= 4))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean b(String paramString)
  {
    Matcher localMatcher = c.matcher(paramString);
    if (localMatcher.matches()) {
      paramString = localMatcher.group(1);
    }
    return (paramString.startsWith("me/")) || (paramString.startsWith("/me/"));
  }
  
  public static ao c(ap paramap)
  {
    az.c(paramap, "requests");
    paramap = new ao(paramap);
    paramap.executeOnExecutor(w.d(), null);
    return paramap;
  }
  
  static final void d(ap paramap)
  {
    paramap = paramap.iterator();
    while (paramap.hasNext())
    {
      GraphRequest localGraphRequest = (GraphRequest)paramap.next();
      if ((at.a.equals(localGraphRequest.c())) && (b(localGraphRequest)))
      {
        Bundle localBundle = localGraphRequest.e();
        if ((!localBundle.containsKey("fields")) || (com.facebook.b.as.a(localBundle.getString("fields")))) {
          com.facebook.b.ag.a(av.f, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", new Object[] { localGraphRequest.b() });
        }
      }
    }
  }
  
  private static boolean d(Object paramObject)
  {
    return ((paramObject instanceof Bitmap)) || ((paramObject instanceof byte[])) || ((paramObject instanceof Uri)) || ((paramObject instanceof ParcelFileDescriptor)) || ((paramObject instanceof GraphRequest.ParcelableResourceWithMimeType));
  }
  
  private static boolean e(ap paramap)
  {
    Iterator localIterator = paramap.e().iterator();
    while (localIterator.hasNext()) {
      if (((aq)localIterator.next() instanceof ar)) {
        return true;
      }
    }
    paramap = paramap.iterator();
    while (paramap.hasNext()) {
      if ((((GraphRequest)paramap.next()).g() instanceof al)) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean e(Object paramObject)
  {
    return ((paramObject instanceof String)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Number)) || ((paramObject instanceof Date));
  }
  
  private static String f(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if (((paramObject instanceof Boolean)) || ((paramObject instanceof Number))) {
      return paramObject.toString();
    }
    if ((paramObject instanceof Date)) {
      return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject);
    }
    throw new IllegalArgumentException("Unsupported parameter type.");
  }
  
  private static boolean f(ap paramap)
  {
    GraphRequest localGraphRequest;
    String str;
    do
    {
      paramap = paramap.iterator();
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        if (!paramap.hasNext()) {
          break;
        }
        localGraphRequest = (GraphRequest)paramap.next();
        localIterator = localGraphRequest.k.keySet().iterator();
      }
      str = (String)localIterator.next();
    } while (!d(localGraphRequest.k.get(str)));
    return false;
    return true;
  }
  
  private static String g(ap paramap)
  {
    if (!com.facebook.b.as.a(paramap.f())) {
      return paramap.f();
    }
    paramap = paramap.iterator();
    while (paramap.hasNext())
    {
      Object localObject = ((GraphRequest)paramap.next()).d;
      if (localObject != null)
      {
        localObject = ((AccessToken)localObject).h();
        if (localObject != null) {
          return (String)localObject;
        }
      }
    }
    if (!com.facebook.b.as.a(b)) {
      return b;
    }
    return w.i();
  }
  
  private void m()
  {
    String str1;
    if (this.d != null) {
      if (!this.k.containsKey("access_token"))
      {
        str1 = this.d.b();
        com.facebook.b.ag.a(str1);
        this.k.putString("access_token", str1);
      }
    }
    do
    {
      for (;;)
      {
        this.k.putString("sdk", "android");
        this.k.putString("format", "json");
        if (!w.a(av.h)) {
          break;
        }
        this.k.putString("debug", "info");
        return;
        if ((!this.p) && (!this.k.containsKey("access_token")))
        {
          str1 = w.i();
          String str2 = w.j();
          if ((!com.facebook.b.as.a(str1)) && (!com.facebook.b.as.a(str2)))
          {
            str1 = str1 + "|" + str2;
            this.k.putString("access_token", str1);
          }
          else
          {
            Log.d(a, "Warning: Request without access token missing application ID or client token.");
          }
        }
      }
    } while (!w.a(av.g));
    this.k.putString("debug", "warning");
  }
  
  private String n()
  {
    if (c.matcher(this.f).matches()) {
      return this.f;
    }
    return String.format("%s/%s", new Object[] { this.o, this.f });
  }
  
  private static String o()
  {
    return String.format("multipart/form-data; boundary=%s", new Object[] { "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" });
  }
  
  private static String p()
  {
    if (q == null)
    {
      q = String.format("%s.%s", new Object[] { "FBAndroidSDK", "4.7.0" });
      String str = com.facebook.b.ad.a();
      if (!com.facebook.b.as.a(str)) {
        q = String.format(Locale.ROOT, "%s/%s", new Object[] { q, str });
      }
    }
    return q;
  }
  
  public final JSONObject a()
  {
    return this.g;
  }
  
  public final void a(Bundle paramBundle)
  {
    this.k = paramBundle;
  }
  
  public final void a(ai paramai)
  {
    if ((w.a(av.h)) || (w.a(av.g)))
    {
      this.l = new ae(this, paramai);
      return;
    }
    this.l = paramai;
  }
  
  public final void a(at paramat)
  {
    if ((this.m != null) && (paramat != at.a)) {
      throw new p("Can't change HTTP method on request with overridden URL.");
    }
    if (paramat != null) {}
    for (;;)
    {
      this.e = paramat;
      return;
      paramat = at.a;
    }
  }
  
  public final void a(Object paramObject)
  {
    this.n = paramObject;
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    this.g = paramJSONObject;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public final String b()
  {
    return this.f;
  }
  
  public final at c()
  {
    return this.e;
  }
  
  public final String d()
  {
    return this.o;
  }
  
  public final Bundle e()
  {
    return this.k;
  }
  
  public final AccessToken f()
  {
    return this.d;
  }
  
  public final ai g()
  {
    return this.l;
  }
  
  public final Object h()
  {
    return this.n;
  }
  
  public final as i()
  {
    return a(this);
  }
  
  public final ao j()
  {
    return b(new GraphRequest[] { this });
  }
  
  final String k()
  {
    if (this.m != null) {
      throw new p("Can't override URL for a batch request");
    }
    String str = n();
    m();
    return a(str);
  }
  
  final String l()
  {
    if (this.m != null) {
      return this.m.toString();
    }
    if ((c() == at.b) && (this.f != null) && (this.f.endsWith("/videos"))) {}
    for (String str = com.facebook.b.ar.c();; str = com.facebook.b.ar.b())
    {
      str = String.format("%s/%s", new Object[] { str, n() });
      m();
      return a(str);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("{Request: ").append(" accessToken: ");
    if (this.d == null) {}
    for (Object localObject = "null";; localObject = this.d) {
      return localObject + ", graphPath: " + this.f + ", graphObject: " + this.g + ", httpMethod: " + this.e + ", parameters: " + this.k + "}";
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\GraphRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */