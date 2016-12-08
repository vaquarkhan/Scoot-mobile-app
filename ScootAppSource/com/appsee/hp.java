package com.appsee;

import android.annotation.TargetApi;
import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

class hp
{
  private static byte[] A;
  public static final String B = String.format(fc.C("EwttabJfpnrb!t"), new Object[] { Appsee.B });
  private static byte[] D;
  private static final String E = "appsee";
  public static final String F = "log";
  public static final String G = "h264";
  public static final int M = 1048576;
  public static final int c = 1024;
  public static final String e = "aac";
  public static final String f = "md";
  public static final String g = "png";
  public static final String h = "ico";
  public static final int i = 8192;
  public static final String j = "zip";
  public static final String l = "mp4";
  
  /* Error */
  public static int C(File paramFile, long paramLong, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 73	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 76	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore 5
    //   10: aload 5
    //   12: lload_1
    //   13: invokevirtual 80	java/io/FileInputStream:skip	(J)J
    //   16: pop2
    //   17: aload 5
    //   19: aload_3
    //   20: invokevirtual 84	java/io/FileInputStream:read	([B)I
    //   23: istore 4
    //   25: aload 5
    //   27: ifnull +8 -> 35
    //   30: aload 5
    //   32: invokevirtual 87	java/io/FileInputStream:close	()V
    //   35: iload 4
    //   37: ireturn
    //   38: astore_0
    //   39: aconst_null
    //   40: astore_3
    //   41: aload_3
    //   42: ifnull +7 -> 49
    //   45: aload_3
    //   46: invokevirtual 87	java/io/FileInputStream:close	()V
    //   49: aload_0
    //   50: athrow
    //   51: astore_0
    //   52: iload 4
    //   54: ireturn
    //   55: astore_3
    //   56: goto -7 -> 49
    //   59: astore_0
    //   60: aload 5
    //   62: astore_3
    //   63: goto -22 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	paramFile	File
    //   0	66	1	paramLong	long
    //   0	66	3	paramArrayOfByte	byte[]
    //   23	30	4	k	int
    //   8	53	5	localFileInputStream	FileInputStream
    // Exception table:
    //   from	to	target	type
    //   0	10	38	finally
    //   30	35	51	java/lang/Exception
    //   45	49	55	java/lang/Exception
    //   10	25	59	finally
  }
  
  public static File C(File paramFile)
  {
    if (paramFile.getName().endsWith("zip"))
    {
      ue.C(fc.C("Kum`miek$amka'mt$fhuaf`~$dkjtuatwb`)"));
      return paramFile;
    }
    if (!paramFile.exists())
    {
      ue.C(kl.C("\bA.T.]&_gU._\"\023#\\4]`GgV?Z4G4\037g](GgP(^7A\"@4Z)Ti"));
      return null;
    }
    localObject4 = bc.C().C(fc.C("AmkaDkjtuatwnki"));
    ((qi)localObject4).K();
    String str = String.format(kl.C("b@i\0264"), new Object[] { paramFile.getAbsolutePath(), "zip" });
    vd.C(1, fc.C("Ghiwvbwtmic'bnhb$sk'!t"), new Object[] { str });
    File localFile = new File(str);
    for (;;)
    {
      try
      {
        localObject1 = new FileOutputStream(localFile, true);
        paramFile = new FileInputStream(paramFile);
      }
      finally
      {
        int k;
        localObject4 = null;
        Object localObject1 = null;
        if (localObject1 != null) {
          ((DeflaterOutputStream)localObject1).close();
        }
        if (localObject4 != null) {
          ((FileInputStream)localObject4).close();
        }
      }
      try
      {
        localObject1 = new DeflaterOutputStream((OutputStream)localObject1, new Deflater());
      }
      finally
      {
        localObject4 = paramFile;
        paramFile = (File)localObject2;
        Object localObject3 = null;
      }
      try
      {
        if (A != null) {
          break label279;
        }
        A = new byte[' '];
      }
      finally
      {
        localObject4 = paramFile;
        paramFile = (File)localObject5;
        continue;
        continue;
      }
      k = paramFile.read(A);
      if (k <= 0)
      {
        ((DeflaterOutputStream)localObject1).finish();
        if (localObject1 != null) {
          ((DeflaterOutputStream)localObject1).close();
        }
        if (paramFile != null) {
          paramFile.close();
        }
        vd.C(1, kl.C("\003\\)VgP(^7A\"@4Z)TgG(\tg\0264"), new Object[] { str });
        ((qi)localObject4).H();
        ((qi)localObject4).C();
        return localFile;
      }
      ((DeflaterOutputStream)localObject1).write(A, 0, k);
    }
  }
  
  public static File C(String paramString)
  {
    paramString = H(paramString);
    if (paramString.exists()) {
      return paramString;
    }
    return null;
  }
  
  public static File C(String paramString1, String paramString2)
  {
    paramString1 = String.format(kl.C("\0264\0264\0264"), new Object[] { C(), File.separator, paramString1 });
    File localFile = new File(paramString1);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    return new File(paramString1, paramString2);
  }
  
  /* Error */
  public static String C(File paramFile)
  {
    // Byte code:
    //   0: new 73	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 76	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore_0
    //   9: aload_0
    //   10: invokevirtual 236	java/io/FileInputStream:available	()I
    //   13: newarray <illegal type>
    //   15: astore_1
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 84	java/io/FileInputStream:read	([B)I
    //   21: pop
    //   22: new 59	java/lang/String
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 239	java/lang/String:<init>	([B)V
    //   30: astore_1
    //   31: aload_0
    //   32: ifnull +7 -> 39
    //   35: aload_0
    //   36: invokevirtual 87	java/io/FileInputStream:close	()V
    //   39: aload_1
    //   40: areturn
    //   41: astore_0
    //   42: aconst_null
    //   43: astore_0
    //   44: aload_0
    //   45: ifnull +10 -> 55
    //   48: aload_0
    //   49: invokevirtual 87	java/io/FileInputStream:close	()V
    //   52: aconst_null
    //   53: areturn
    //   54: astore_0
    //   55: aconst_null
    //   56: areturn
    //   57: astore_1
    //   58: aconst_null
    //   59: astore_0
    //   60: aload_0
    //   61: ifnull +7 -> 68
    //   64: aload_0
    //   65: invokevirtual 87	java/io/FileInputStream:close	()V
    //   68: aload_1
    //   69: athrow
    //   70: astore_0
    //   71: aload_1
    //   72: areturn
    //   73: astore_0
    //   74: goto -6 -> 68
    //   77: astore_1
    //   78: goto -18 -> 60
    //   81: astore_1
    //   82: goto -38 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	paramFile	File
    //   15	25	1	localObject1	Object
    //   57	15	1	str	String
    //   77	1	1	localObject2	Object
    //   81	1	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   0	9	41	java/io/IOException
    //   48	52	54	java/io/IOException
    //   0	9	57	finally
    //   35	39	70	java/io/IOException
    //   64	68	73	java/io/IOException
    //   9	31	77	finally
    //   9	31	81	java/io/IOException
  }
  
  public static List<File> C()
  {
    return C(null);
  }
  
  public static List<File> C(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    File localFile = C();
    if (localFile.exists()) {
      C(localFile, localArrayList, paramString);
    }
    return localArrayList;
  }
  
  @TargetApi(21)
  public static void C()
  {
    if (Build.VERSION.SDK_INT < 21) {}
    File localFile;
    do
    {
      return;
      localFile = new File(String.format(kl.C("\0264\0264\0264"), new Object[] { bp.C().getFilesDir(), File.separator, "appsee" }));
    } while (!localFile.exists());
    vd.H(1, fc.C("Sv~mic'ph$jkqa'amtpnj`$ftwwba'bhhcau$sk'jh)eedort'bhhcau"));
    C(localFile, new File(String.format(kl.C("\0264\0264\0264"), new Object[] { bp.C().getNoBackupFilesDir(), File.separator, "appsee" })));
    C(localFile);
  }
  
  public static void C(File paramFile)
  {
    if ((paramFile != null) && (paramFile.exists()))
    {
      if (paramFile.isDirectory())
      {
        String[] arrayOfString = paramFile.list();
        int n = arrayOfString.length;
        int k = 0;
        for (int m = 0; k < n; m = k)
        {
          String str = arrayOfString[m];
          k = m + 1;
          C(new File(paramFile, str));
        }
      }
      paramFile.delete();
    }
  }
  
  public static void C(File paramFile1, File paramFile2)
  {
    Object localObject1;
    if (paramFile1.isDirectory())
    {
      localObject1 = paramFile1.list();
      if (localObject1.length <= 0) {
        vd.C(1, kl.C("\006C7@\"VgU(_#V5\tg\0264\023.@gV*C3Jk\023)\\g]\"V#\0233\\g^(E\""), new Object[] { paramFile1.toString() });
      }
    }
    do
    {
      int k;
      for (;;)
      {
        return;
        if (!paramFile2.exists()) {
          paramFile2.mkdir();
        }
        k = 0;
        for (int m = 0; k < localObject1.length; m = k)
        {
          File localFile1 = new File(paramFile1, localObject1[m]);
          File localFile2 = new File(paramFile2, localObject1[m]);
          vd.C(1, fc.C("Jkqmic'ewttab$amka=$\"w'ph>'!t"), new Object[] { localFile1.toString(), localFile2.toString() });
          k = m + 1;
          C(localFile1, localFile2);
          C(localFile1);
        }
      }
      paramFile1 = new FileInputStream(paramFile1);
      paramFile2 = new FileOutputStream(paramFile2, true);
      try
      {
        localObject1 = new byte['Ѐ'];
        for (;;)
        {
          k = paramFile1.read((byte[])localObject1);
          if (k <= 0) {
            break;
          }
          paramFile2.write((byte[])localObject1, 0, k);
        }
        if (paramFile1 == null) {
          continue;
        }
      }
      finally
      {
        if (paramFile1 != null) {
          paramFile1.close();
        }
        if (paramFile2 != null) {
          paramFile2.close();
        }
      }
      paramFile1.close();
    } while (paramFile2 == null);
    paramFile2.close();
  }
  
  public static void C(String paramString)
  {
    try
    {
      File localFile = H(String.format(fc.C("auvhv)!t"), new Object[] { "log" }));
      if ((localFile.exists()) && (localFile.length() >= 1048576L)) {
        return;
      }
      C(localFile, bb.C(String.format(kl.C("\026#:j:b@M"), new Object[] { Long.valueOf(fc.C().C()), paramString })), true);
      return;
    }
    catch (Exception paramString)
    {
      Log.e("appsee", fc.C("Auvhv'sumsmic'ph$kk`"), paramString);
    }
  }
  
  public static void C(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return;
    }
    vd.C(1, kl.C("\024R1Z)TgZ*R VgW&G&\0233\\g\0264"), new Object[] { paramString });
    C(paramString, C(paramDrawable));
  }
  
  public static void C(String paramString1, String paramString2)
  {
    paramString2 = String.format(kl.C("b@i\0264"), new Object[] { paramString2, "md" });
    File localFile = H(String.format(fc.C("!t[siw"), new Object[] { paramString2 }));
    if (localFile.exists())
    {
      ue.C(kl.C("*V3R#R3RgU._\"\023&_5V&W>\023\"K.@3@k\023)\\3\0234R1Z)Ti"));
      return;
    }
    vd.C(1, fc.C("Wfrnj`$J@'`fpf$sk'!t"), new Object[] { localFile.getAbsolutePath() });
    C(localFile, bb.C(paramString1), false);
    localFile.renameTo(H(paramString2));
  }
  
  public static void C(String paramString, byte[] paramArrayOfByte)
  {
    C(H(paramString), paramArrayOfByte, false);
  }
  
  public static boolean C(int paramInt)
  {
    return C(C()) >= paramInt;
  }
  
  public static byte[] C()
  {
    try
    {
      int k = (int)ye.C().C();
      if ((D == null) || (D.length != k)) {
        D = new byte[k];
      }
      byte[] arrayOfByte = D;
      return arrayOfByte;
    }
    finally {}
  }
  
  /* Error */
  public static byte[] C(Drawable paramDrawable)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 366	com/appsee/ab:C	(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    //   4: astore_0
    //   5: new 368	java/io/ByteArrayOutputStream
    //   8: dup
    //   9: invokespecial 369	java/io/ByteArrayOutputStream:<init>	()V
    //   12: astore_1
    //   13: aload_0
    //   14: getstatic 375	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   17: bipush 100
    //   19: aload_1
    //   20: invokevirtual 381	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   23: pop
    //   24: aload_1
    //   25: invokevirtual 384	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   28: astore_0
    //   29: aload_1
    //   30: ifnull +7 -> 37
    //   33: aload_1
    //   34: invokevirtual 385	java/io/ByteArrayOutputStream:close	()V
    //   37: aload_0
    //   38: areturn
    //   39: astore_0
    //   40: aconst_null
    //   41: astore_1
    //   42: aload_1
    //   43: ifnull +7 -> 50
    //   46: aload_1
    //   47: invokevirtual 385	java/io/ByteArrayOutputStream:close	()V
    //   50: aload_0
    //   51: athrow
    //   52: astore_1
    //   53: aload_0
    //   54: areturn
    //   55: astore_1
    //   56: goto -6 -> 50
    //   59: astore_0
    //   60: goto -18 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	paramDrawable	Drawable
    //   12	35	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   52	1	1	localIOException1	IOException
    //   55	1	1	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   5	13	39	finally
    //   33	37	52	java/io/IOException
    //   46	50	55	java/io/IOException
    //   13	29	59	finally
  }
  
  public static File H(String paramString)
  {
    return new File(C(), paramString);
  }
  
  public static void H()
  {
    File localFile = C();
    boolean bool = localFile.mkdirs();
    if (bool) {
      vd.C(1, fc.C("Guafpb`'ffwb$cmuadphv~>'!t"), new Object[] { "appsee" });
    }
    if ((!bool) && ((!localFile.exists()) || (!localFile.isDirectory()))) {
      throw new IOException(kl.C("\004R)](GgP5V&G\"\023&C7@\"VgU(_#V5"));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */