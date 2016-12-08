package com.facebook.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.a;
import com.facebook.p;
import com.facebook.q;
import com.facebook.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ah
{
  private static final al a = new aj(null);
  private static List<al> b = e();
  private static Map<String, List<al>> c = f();
  private static AtomicBoolean d = new AtomicBoolean(false);
  private static final List<Integer> e = Arrays.asList(new Integer[] { Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101) });
  
  public static final int a()
  {
    return ((Integer)e.get(0)).intValue();
  }
  
  public static int a(Intent paramIntent)
  {
    return paramIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
  }
  
  private static int a(List<al> paramList, int[] paramArrayOfInt)
  {
    
    if (paramList == null) {
      return -1;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      int i = a(((al)paramList.next()).b(), a(), paramArrayOfInt);
      if (i != -1) {
        return i;
      }
    }
    return -1;
  }
  
  public static int a(TreeSet<Integer> paramTreeSet, int paramInt, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    paramTreeSet = paramTreeSet.descendingIterator();
    int j = -1;
    i -= 1;
    for (;;)
    {
      int k;
      if (paramTreeSet.hasNext())
      {
        k = ((Integer)paramTreeSet.next()).intValue();
        j = Math.max(j, k);
        while ((i >= 0) && (paramArrayOfInt[i] > k)) {
          i -= 1;
        }
        if (i >= 0) {
          break label72;
        }
      }
      label72:
      do
      {
        return -1;
        if (paramArrayOfInt[i] != k) {
          break;
        }
      } while (i % 2 != 0);
      return Math.min(j, paramInt);
    }
  }
  
  public static Intent a(Context paramContext)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (al)localIterator.next();
      localObject = b(paramContext, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((al)localObject).a()).addCategory("android.intent.category.DEFAULT"), (al)localObject);
      if (localObject != null) {
        return (Intent)localObject;
      }
    }
    return null;
  }
  
  static Intent a(Context paramContext, Intent paramIntent, al paramal)
  {
    if (paramIntent == null) {
      paramIntent = null;
    }
    ResolveInfo localResolveInfo;
    do
    {
      return paramIntent;
      localResolveInfo = paramContext.getPackageManager().resolveActivity(paramIntent, 0);
      if (localResolveInfo == null) {
        return null;
      }
    } while (paramal.a(paramContext, localResolveInfo.activityInfo.packageName));
    return null;
  }
  
  public static Intent a(Context paramContext, String paramString1, Collection<String> paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, a parama)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (al)localIterator.next();
      Intent localIntent = new Intent().setClassName(((al)localObject).a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", paramString1);
      if (!as.a(paramCollection)) {
        localIntent.putExtra("scope", TextUtils.join(",", paramCollection));
      }
      if (!as.a(paramString2)) {
        localIntent.putExtra("e2e", paramString2);
      }
      localIntent.putExtra("response_type", "token,signed_request");
      localIntent.putExtra("return_scopes", "true");
      if (paramBoolean2) {
        localIntent.putExtra("default_audience", parama.a());
      }
      localIntent.putExtra("legacy_override", "v2.5");
      if (paramBoolean1) {
        localIntent.putExtra("auth_type", "rerequest");
      }
      localObject = a(paramContext, localIntent, (al)localObject);
      if (localObject != null) {
        return (Intent)localObject;
      }
    }
    return null;
  }
  
  public static Intent a(Intent paramIntent, Bundle paramBundle, p paramp)
  {
    UUID localUUID = b(paramIntent);
    if (localUUID == null) {
      paramIntent = null;
    }
    Intent localIntent;
    do
    {
      return paramIntent;
      localIntent = new Intent();
      localIntent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", a(paramIntent));
      paramIntent = new Bundle();
      paramIntent.putString("action_id", localUUID.toString());
      if (paramp != null) {
        paramIntent.putBundle("error", a(paramp));
      }
      localIntent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", paramIntent);
      paramIntent = localIntent;
    } while (paramBundle == null);
    localIntent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", paramBundle);
    return localIntent;
  }
  
  public static Bundle a(p paramp)
  {
    Object localObject;
    if (paramp == null) {
      localObject = null;
    }
    Bundle localBundle;
    do
    {
      return (Bundle)localObject;
      localBundle = new Bundle();
      localBundle.putString("error_description", paramp.toString());
      localObject = localBundle;
    } while (!(paramp instanceof q));
    localBundle.putString("error_type", "UserCanceled");
    return localBundle;
  }
  
  public static p a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    Object localObject2 = paramBundle.getString("error_type");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = paramBundle.getString("com.facebook.platform.status.ERROR_TYPE");
    }
    String str = paramBundle.getString("error_description");
    localObject2 = str;
    if (str == null) {
      localObject2 = paramBundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
    }
    if ((localObject1 != null) && (((String)localObject1).equalsIgnoreCase("UserCanceled"))) {
      return new q((String)localObject2);
    }
    return new p((String)localObject2);
  }
  
  public static boolean a(int paramInt)
  {
    return (e.contains(Integer.valueOf(paramInt))) && (paramInt >= 20140701);
  }
  
  public static int b(int paramInt)
  {
    return a(b, new int[] { paramInt });
  }
  
  static Intent b(Context paramContext, Intent paramIntent, al paramal)
  {
    if (paramIntent == null) {
      paramIntent = null;
    }
    ResolveInfo localResolveInfo;
    do
    {
      return paramIntent;
      localResolveInfo = paramContext.getPackageManager().resolveService(paramIntent, 0);
      if (localResolveInfo == null) {
        return null;
      }
    } while (paramal.a(paramContext, localResolveInfo.serviceInfo.packageName));
    return null;
  }
  
  /* Error */
  private static TreeSet<Integer> b(al paramal)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 120	java/util/TreeSet
    //   5: dup
    //   6: invokespecial 327	java/util/TreeSet:<init>	()V
    //   9: astore_3
    //   10: invokestatic 332	com/facebook/w:f	()Landroid/content/Context;
    //   13: invokevirtual 336	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   16: astore_1
    //   17: aload_0
    //   18: invokestatic 339	com/facebook/b/ah:c	(Lcom/facebook/b/al;)Landroid/net/Uri;
    //   21: astore 4
    //   23: invokestatic 332	com/facebook/w:f	()Landroid/content/Context;
    //   26: invokevirtual 160	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   29: new 341	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 342	java/lang/StringBuilder:<init>	()V
    //   36: aload_0
    //   37: invokevirtual 142	com/facebook/b/al:a	()Ljava/lang/String;
    //   40: invokevirtual 346	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: ldc_w 348
    //   46: invokevirtual 346	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 349	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: iconst_0
    //   53: invokevirtual 353	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   56: ifnull +79 -> 135
    //   59: aload_1
    //   60: aload 4
    //   62: iconst_1
    //   63: anewarray 300	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: ldc_w 355
    //   71: aastore
    //   72: aconst_null
    //   73: aconst_null
    //   74: aconst_null
    //   75: invokevirtual 361	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore_0
    //   79: aload_0
    //   80: astore_1
    //   81: aload_0
    //   82: ifnull +55 -> 137
    //   85: aload_0
    //   86: astore_1
    //   87: aload_0
    //   88: invokeinterface 366 1 0
    //   93: ifeq +44 -> 137
    //   96: aload_3
    //   97: aload_0
    //   98: aload_0
    //   99: ldc_w 355
    //   102: invokeinterface 370 2 0
    //   107: invokeinterface 373 2 0
    //   112: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   115: invokevirtual 376	java/util/TreeSet:add	(Ljava/lang/Object;)Z
    //   118: pop
    //   119: goto -34 -> 85
    //   122: astore_1
    //   123: aload_0
    //   124: ifnull +9 -> 133
    //   127: aload_0
    //   128: invokeinterface 379 1 0
    //   133: aload_1
    //   134: athrow
    //   135: aconst_null
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull +9 -> 147
    //   141: aload_1
    //   142: invokeinterface 379 1 0
    //   147: aload_3
    //   148: areturn
    //   149: astore_1
    //   150: aload_2
    //   151: astore_0
    //   152: goto -29 -> 123
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	155	0	paramal	al
    //   16	71	1	localObject1	Object
    //   122	12	1	localObject2	Object
    //   136	6	1	localObject3	Object
    //   149	1	1	localObject4	Object
    //   1	150	2	localObject5	Object
    //   9	139	3	localTreeSet	TreeSet
    //   21	40	4	localUri	Uri
    // Exception table:
    //   from	to	target	type
    //   87	119	122	finally
    //   23	79	149	finally
  }
  
  public static UUID b(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (;;)
    {
      return null;
      if (a(a(paramIntent)))
      {
        paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        if (paramIntent == null) {
          break label60;
        }
        paramIntent = paramIntent.getString("action_id");
      }
      while (paramIntent != null)
      {
        try
        {
          paramIntent = UUID.fromString(paramIntent);
          return paramIntent;
        }
        catch (IllegalArgumentException paramIntent)
        {
          return null;
        }
        paramIntent = paramIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        continue;
        label60:
        paramIntent = null;
      }
    }
  }
  
  public static void b()
  {
    if (!d.compareAndSet(false, true)) {
      return;
    }
    w.d().execute(new ai());
  }
  
  private static Uri c(al paramal)
  {
    return Uri.parse("content://" + paramal.a() + ".provider.PlatformProvider/versions");
  }
  
  public static Bundle c(Intent paramIntent)
  {
    if (!a(a(paramIntent))) {
      return paramIntent.getExtras();
    }
    return paramIntent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
  }
  
  private static List<al> e()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(a);
    localArrayList.add(new am(null));
    return localArrayList;
  }
  
  private static Map<String, List<al>> f()
  {
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new ak(null));
    localHashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", b);
    localHashMap.put("com.facebook.platform.action.request.FEED_DIALOG", b);
    localHashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", b);
    localHashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", b);
    localHashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", localArrayList);
    localHashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", localArrayList);
    return localHashMap;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */