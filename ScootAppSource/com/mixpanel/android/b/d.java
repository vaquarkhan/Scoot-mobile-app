package com.mixpanel.android.b;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.mixpanel.android.mpmetrics.ab;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class d
{
  private final File a;
  private final g b;
  private final MessageDigest c;
  private final ab d;
  
  public d(Context paramContext, String paramString)
  {
    this(paramContext, "MixpanelAPI.Images." + paramString, new c());
  }
  
  public d(Context paramContext, String paramString, g paramg)
  {
    this.a = paramContext.getDir(paramString, 0);
    this.b = paramg;
    this.d = ab.a(paramContext);
    try
    {
      paramContext = MessageDigest.getInstance("SHA1");
      this.c = paramContext;
      return;
    }
    catch (NoSuchAlgorithmException paramContext)
    {
      for (;;)
      {
        Log.w("MixpanelAPI.ImageStore", "Images won't be stored because this platform doesn't supply a SHA1 hash function");
        paramContext = null;
      }
    }
  }
  
  private File c(String paramString)
  {
    if (this.c == null) {
      return null;
    }
    paramString = this.c.digest(paramString.getBytes());
    paramString = "MP_IMG_" + Base64.encodeToString(paramString, 10);
    return new File(this.a, paramString);
  }
  
  /* Error */
  public android.graphics.Bitmap a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: aload_1
    //   7: invokespecial 109	com/mixpanel/android/b/d:c	(Ljava/lang/String;)Ljava/io/File;
    //   10: astore 5
    //   12: aload 5
    //   14: ifnull +11 -> 25
    //   17: aload 5
    //   19: invokevirtual 113	java/io/File:exists	()Z
    //   22: ifne +230 -> 252
    //   25: aload_0
    //   26: getfield 56	com/mixpanel/android/b/d:d	Lcom/mixpanel/android/mpmetrics/ab;
    //   29: invokevirtual 117	com/mixpanel/android/mpmetrics/ab:r	()Ljavax/net/ssl/SSLSocketFactory;
    //   32: astore_3
    //   33: aload_0
    //   34: getfield 49	com/mixpanel/android/b/d:b	Lcom/mixpanel/android/b/g;
    //   37: aload_1
    //   38: aconst_null
    //   39: aload_3
    //   40: invokeinterface 122 4 0
    //   45: astore_3
    //   46: aload_3
    //   47: ifnull +160 -> 207
    //   50: aload 5
    //   52: ifnull +35 -> 87
    //   55: aload_3
    //   56: arraylength
    //   57: ldc 123
    //   59: if_icmpge +28 -> 87
    //   62: new 125	java/io/FileOutputStream
    //   65: dup
    //   66: aload 5
    //   68: invokespecial 128	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   71: astore_1
    //   72: aload_1
    //   73: astore_2
    //   74: aload_1
    //   75: aload_3
    //   76: invokevirtual 134	java/io/OutputStream:write	([B)V
    //   79: aload_1
    //   80: ifnull +7 -> 87
    //   83: aload_1
    //   84: invokevirtual 137	java/io/OutputStream:close	()V
    //   87: aload_3
    //   88: iconst_0
    //   89: aload_3
    //   90: arraylength
    //   91: invokestatic 143	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   94: astore_2
    //   95: aload_2
    //   96: astore_1
    //   97: aload_2
    //   98: ifnonnull +140 -> 238
    //   101: new 145	com/mixpanel/android/b/e
    //   104: dup
    //   105: ldc -109
    //   107: invokespecial 150	com/mixpanel/android/b/e:<init>	(Ljava/lang/String;)V
    //   110: athrow
    //   111: astore_1
    //   112: new 145	com/mixpanel/android/b/e
    //   115: dup
    //   116: ldc -104
    //   118: aload_1
    //   119: invokespecial 155	com/mixpanel/android/b/e:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   122: athrow
    //   123: astore_1
    //   124: new 145	com/mixpanel/android/b/e
    //   127: dup
    //   128: ldc -99
    //   130: aload_1
    //   131: invokespecial 155	com/mixpanel/android/b/e:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   134: athrow
    //   135: astore_1
    //   136: ldc 68
    //   138: ldc -97
    //   140: aload_1
    //   141: invokestatic 162	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   144: pop
    //   145: goto -58 -> 87
    //   148: astore_3
    //   149: aconst_null
    //   150: astore_1
    //   151: aload_1
    //   152: astore_2
    //   153: new 145	com/mixpanel/android/b/e
    //   156: dup
    //   157: ldc -92
    //   159: aload_3
    //   160: invokespecial 155	com/mixpanel/android/b/e:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   163: athrow
    //   164: astore_1
    //   165: aload_2
    //   166: ifnull +7 -> 173
    //   169: aload_2
    //   170: invokevirtual 137	java/io/OutputStream:close	()V
    //   173: aload_1
    //   174: athrow
    //   175: astore_1
    //   176: aload 4
    //   178: astore_2
    //   179: new 145	com/mixpanel/android/b/e
    //   182: dup
    //   183: ldc -90
    //   185: aload_1
    //   186: invokespecial 155	com/mixpanel/android/b/e:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   189: athrow
    //   190: astore_1
    //   191: goto -26 -> 165
    //   194: astore_2
    //   195: ldc 68
    //   197: ldc -97
    //   199: aload_2
    //   200: invokestatic 162	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   203: pop
    //   204: goto -31 -> 173
    //   207: aload 5
    //   209: invokevirtual 169	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   212: invokestatic 172	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   215: astore_2
    //   216: aload_2
    //   217: astore_1
    //   218: aload_2
    //   219: ifnonnull +19 -> 238
    //   222: aload 5
    //   224: invokevirtual 175	java/io/File:delete	()Z
    //   227: pop
    //   228: new 145	com/mixpanel/android/b/e
    //   231: dup
    //   232: ldc -79
    //   234: invokespecial 150	com/mixpanel/android/b/e:<init>	(Ljava/lang/String;)V
    //   237: athrow
    //   238: aload_1
    //   239: areturn
    //   240: astore_3
    //   241: aload_1
    //   242: astore_2
    //   243: aload_3
    //   244: astore_1
    //   245: goto -66 -> 179
    //   248: astore_3
    //   249: goto -98 -> 151
    //   252: aconst_null
    //   253: astore_3
    //   254: goto -208 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	this	d
    //   0	257	1	paramString	String
    //   1	178	2	localObject1	Object
    //   194	6	2	localIOException1	java.io.IOException
    //   215	28	2	localObject2	Object
    //   32	58	3	localObject3	Object
    //   148	12	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   240	4	3	localIOException2	java.io.IOException
    //   248	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    //   253	1	3	localObject4	Object
    //   3	174	4	localObject5	Object
    //   10	213	5	localFile	File
    // Exception table:
    //   from	to	target	type
    //   25	46	111	java/io/IOException
    //   25	46	123	com/mixpanel/android/b/h
    //   83	87	135	java/io/IOException
    //   62	72	148	java/io/FileNotFoundException
    //   74	79	164	finally
    //   153	164	164	finally
    //   62	72	175	java/io/IOException
    //   62	72	190	finally
    //   179	190	190	finally
    //   169	173	194	java/io/IOException
    //   74	79	240	java/io/IOException
    //   74	79	248	java/io/FileNotFoundException
  }
  
  public void b(String paramString)
  {
    paramString = c(paramString);
    if (paramString != null) {
      paramString.delete();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */