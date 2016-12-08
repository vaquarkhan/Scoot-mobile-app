package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.GooglePlayServicesUtil;

public final class s
  extends l
{
  private final Context a;
  
  public s(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private void b()
  {
    if (!GooglePlayServicesUtil.zze(this.a, Binder.getCallingUid()))
    {
      int i = Binder.getCallingUid();
      throw new SecurityException(52 + "Calling UID " + i + " is not Google Play services.");
    }
  }
  
  /* Error */
  private void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/google/android/gms/auth/api/signin/internal/s:a	Landroid/content/Context;
    //   4: invokestatic 58	com/google/android/gms/auth/api/signin/internal/u:a	(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/u;
    //   7: astore_3
    //   8: aload_3
    //   9: invokevirtual 61	com/google/android/gms/auth/api/signin/internal/u:a	()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   12: astore_2
    //   13: getstatic 67	com/google/android/gms/auth/api/signin/GoogleSignInOptions:d	Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   16: astore_1
    //   17: aload_2
    //   18: ifnull +8 -> 26
    //   21: aload_3
    //   22: invokevirtual 70	com/google/android/gms/auth/api/signin/internal/u:b	()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   25: astore_1
    //   26: new 72	com/google/android/gms/common/api/r
    //   29: dup
    //   30: aload_0
    //   31: getfield 13	com/google/android/gms/auth/api/signin/internal/s:a	Landroid/content/Context;
    //   34: invokespecial 74	com/google/android/gms/common/api/r:<init>	(Landroid/content/Context;)V
    //   37: getstatic 80	com/google/android/gms/auth/api/a:g	Lcom/google/android/gms/common/api/a;
    //   40: aload_1
    //   41: invokevirtual 83	com/google/android/gms/common/api/r:a	(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/c;)Lcom/google/android/gms/common/api/r;
    //   44: invokevirtual 86	com/google/android/gms/common/api/r:b	()Lcom/google/android/gms/common/api/q;
    //   47: astore_1
    //   48: aload_1
    //   49: invokevirtual 92	com/google/android/gms/common/api/q:f	()Lcom/google/android/gms/common/ConnectionResult;
    //   52: invokevirtual 97	com/google/android/gms/common/ConnectionResult:b	()Z
    //   55: ifeq +17 -> 72
    //   58: aload_2
    //   59: ifnull +18 -> 77
    //   62: getstatic 101	com/google/android/gms/auth/api/a:l	Lcom/google/android/gms/auth/api/signin/b;
    //   65: aload_1
    //   66: invokeinterface 106 2 0
    //   71: pop
    //   72: aload_1
    //   73: invokevirtual 108	com/google/android/gms/common/api/q:g	()V
    //   76: return
    //   77: aload_1
    //   78: invokevirtual 112	com/google/android/gms/common/api/q:h	()Lcom/google/android/gms/common/api/u;
    //   81: pop
    //   82: goto -10 -> 72
    //   85: astore_2
    //   86: aload_1
    //   87: invokevirtual 108	com/google/android/gms/common/api/q:g	()V
    //   90: aload_2
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	s
    //   16	71	1	localObject1	Object
    //   12	47	2	localGoogleSignInAccount	com.google.android.gms.auth.api.signin.GoogleSignInAccount
    //   85	6	2	localObject2	Object
    //   7	15	3	localu	u
    // Exception table:
    //   from	to	target	type
    //   48	58	85	finally
    //   62	72	85	finally
    //   77	82	85	finally
  }
  
  public void a()
  {
    b();
    c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */