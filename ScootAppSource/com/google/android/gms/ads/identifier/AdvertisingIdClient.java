package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.b.q;
import com.google.android.gms.b.r;
import com.google.android.gms.common.c;
import com.google.android.gms.common.h;
import com.google.android.gms.common.j;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient
{
  private final Context mContext;
  h zzpE;
  q zzpF;
  boolean zzpG;
  Object zzpH = new Object();
  a zzpI;
  final long zzpJ;
  
  public AdvertisingIdClient(Context paramContext)
  {
    this(paramContext, 30000L);
  }
  
  public AdvertisingIdClient(Context paramContext, long paramLong)
  {
    com.google.android.gms.common.internal.b.a(paramContext);
    this.mContext = paramContext;
    this.zzpG = false;
    this.zzpJ = paramLong;
  }
  
  public static AdvertisingIdClient.Info getAdvertisingIdInfo(Context paramContext)
  {
    paramContext = new AdvertisingIdClient(paramContext, -1L);
    try
    {
      paramContext.zzd(false);
      AdvertisingIdClient.Info localInfo = paramContext.getInfo();
      return localInfo;
    }
    finally
    {
      paramContext.finish();
    }
  }
  
  public static void setShouldSkipGmsCoreVersionCheck(boolean paramBoolean) {}
  
  static q zza(Context paramContext, h paramh)
  {
    try
    {
      paramContext = r.a(paramh.a(10000L, TimeUnit.MILLISECONDS));
      return paramContext;
    }
    catch (InterruptedException paramContext)
    {
      throw new IOException("Interrupted exception");
    }
    catch (Throwable paramContext)
    {
      throw new IOException(paramContext);
    }
  }
  
  private void zzbd()
  {
    synchronized (this.zzpH)
    {
      if (this.zzpI != null) {
        this.zzpI.a();
      }
    }
    try
    {
      this.zzpI.join();
      if (this.zzpJ > 0L) {
        this.zzpI = new a(this, this.zzpJ);
      }
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  static h zzh(Context paramContext)
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      switch (j.b().a(paramContext))
      {
      case 1: 
      default: 
        throw new IOException("Google Play services not available");
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new c(9);
    }
    h localh = new h();
    Intent localIntent = new Intent("com.google.android.gms.ads.identifier.service.START");
    localIntent.setPackage("com.google.android.gms");
    try
    {
      boolean bool = com.google.android.gms.common.stats.b.a().a(paramContext, localIntent, localh, 1);
      if (bool) {
        return localh;
      }
    }
    catch (Throwable paramContext)
    {
      throw new IOException(paramContext);
    }
    throw new IOException("Connection failure");
  }
  
  protected void finalize()
  {
    finish();
    super.finalize();
  }
  
  /* Error */
  public void finish()
  {
    // Byte code:
    //   0: ldc -87
    //   2: invokestatic 172	com/google/android/gms/common/internal/b:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 39	com/google/android/gms/ads/identifier/AdvertisingIdClient:mContext	Landroid/content/Context;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 174	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpE	Lcom/google/android/gms/common/h;
    //   18: ifnonnull +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 41	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpG	Z
    //   28: ifeq +17 -> 45
    //   31: invokestatic 157	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   34: aload_0
    //   35: getfield 39	com/google/android/gms/ads/identifier/AdvertisingIdClient:mContext	Landroid/content/Context;
    //   38: aload_0
    //   39: getfield 174	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpE	Lcom/google/android/gms/common/h;
    //   42: invokevirtual 177	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield 41	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpG	Z
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield 179	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpF	Lcom/google/android/gms/b/q;
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 174	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpE	Lcom/google/android/gms/common/h;
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: ldc -75
    //   71: ldc -73
    //   73: aload_1
    //   74: invokestatic 189	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   77: pop
    //   78: goto -33 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	AdvertisingIdClient
    //   63	4	1	localObject	Object
    //   68	6	1	localIllegalArgumentException	IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   7	21	63	finally
    //   21	23	63	finally
    //   24	45	63	finally
    //   45	62	63	finally
    //   64	66	63	finally
    //   69	78	63	finally
    //   24	45	68	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public AdvertisingIdClient.Info getInfo()
  {
    // Byte code:
    //   0: ldc -87
    //   2: invokestatic 172	com/google/android/gms/common/internal/b:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 41	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpG	Z
    //   11: ifne +83 -> 94
    //   14: aload_0
    //   15: getfield 31	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpH	Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 96	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpI	Lcom/google/android/gms/ads/identifier/a;
    //   25: ifnull +13 -> 38
    //   28: aload_0
    //   29: getfield 96	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpI	Lcom/google/android/gms/ads/identifier/a;
    //   32: invokevirtual 196	com/google/android/gms/ads/identifier/a:b	()Z
    //   35: ifne +23 -> 58
    //   38: new 85	java/io/IOException
    //   41: dup
    //   42: ldc -58
    //   44: invokespecial 90	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   47: athrow
    //   48: astore_2
    //   49: aload_1
    //   50: monitorexit
    //   51: aload_2
    //   52: athrow
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    //   58: aload_1
    //   59: monitorexit
    //   60: aload_0
    //   61: iconst_0
    //   62: invokevirtual 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzd	(Z)V
    //   65: aload_0
    //   66: getfield 41	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpG	Z
    //   69: ifne +25 -> 94
    //   72: new 85	java/io/IOException
    //   75: dup
    //   76: ldc -56
    //   78: invokespecial 90	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   81: athrow
    //   82: astore_1
    //   83: new 85	java/io/IOException
    //   86: dup
    //   87: ldc -56
    //   89: aload_1
    //   90: invokespecial 203	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: athrow
    //   94: aload_0
    //   95: getfield 174	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpE	Lcom/google/android/gms/common/h;
    //   98: invokestatic 37	com/google/android/gms/common/internal/b:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   101: pop
    //   102: aload_0
    //   103: getfield 179	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpF	Lcom/google/android/gms/b/q;
    //   106: invokestatic 37	com/google/android/gms/common/internal/b:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   109: pop
    //   110: new 205	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info
    //   113: dup
    //   114: aload_0
    //   115: getfield 179	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpF	Lcom/google/android/gms/b/q;
    //   118: invokeinterface 210 1 0
    //   123: aload_0
    //   124: getfield 179	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzpF	Lcom/google/android/gms/b/q;
    //   127: iconst_1
    //   128: invokeinterface 213 2 0
    //   133: invokespecial 216	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info:<init>	(Ljava/lang/String;Z)V
    //   136: astore_1
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_0
    //   140: invokespecial 218	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzbd	()V
    //   143: aload_1
    //   144: areturn
    //   145: astore_1
    //   146: ldc -75
    //   148: ldc -36
    //   150: aload_1
    //   151: invokestatic 189	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   154: pop
    //   155: new 85	java/io/IOException
    //   158: dup
    //   159: ldc -34
    //   161: invokespecial 90	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	AdvertisingIdClient
    //   53	6	1	localObject2	Object
    //   82	8	1	localException	Exception
    //   136	8	1	localInfo	AdvertisingIdClient.Info
    //   145	6	1	localRemoteException	android.os.RemoteException
    //   48	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   21	38	48	finally
    //   38	48	48	finally
    //   49	51	48	finally
    //   58	60	48	finally
    //   7	21	53	finally
    //   51	53	53	finally
    //   54	56	53	finally
    //   60	65	53	finally
    //   65	82	53	finally
    //   83	94	53	finally
    //   94	110	53	finally
    //   110	137	53	finally
    //   137	139	53	finally
    //   146	165	53	finally
    //   60	65	82	java/lang/Exception
    //   110	137	145	android/os/RemoteException
  }
  
  public void start()
  {
    zzd(true);
  }
  
  protected void zzd(boolean paramBoolean)
  {
    com.google.android.gms.common.internal.b.c("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.zzpG) {
        finish();
      }
      this.zzpE = zzh(this.mContext);
      this.zzpF = zza(this.mContext, this.zzpE);
      this.zzpG = true;
      if (paramBoolean) {
        zzbd();
      }
      return;
    }
    finally {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\ads\identifier\AdvertisingIdClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */