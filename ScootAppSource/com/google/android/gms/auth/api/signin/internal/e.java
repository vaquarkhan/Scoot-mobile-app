package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.Iterator;
import java.util.Set;

public final class e
  implements com.google.android.gms.auth.api.signin.b
{
  public Intent a(q paramq)
  {
    com.google.android.gms.common.internal.b.a(paramq);
    return ((i)paramq.a(a.d)).e();
  }
  
  public com.google.android.gms.auth.api.signin.e a(Intent paramIntent)
  {
    if ((paramIntent == null) || ((!paramIntent.hasExtra("googleSignInStatus")) && (!paramIntent.hasExtra("googleSignInAccount")))) {
      return null;
    }
    GoogleSignInAccount localGoogleSignInAccount = (GoogleSignInAccount)paramIntent.getParcelableExtra("googleSignInAccount");
    paramIntent = (Status)paramIntent.getParcelableExtra("googleSignInStatus");
    if (localGoogleSignInAccount != null) {
      paramIntent = Status.a;
    }
    return new com.google.android.gms.auth.api.signin.e(localGoogleSignInAccount, paramIntent);
  }
  
  public com.google.android.gms.common.api.u<Status> b(q paramq)
  {
    u.a(paramq.b()).c();
    Iterator localIterator = q.a().iterator();
    while (localIterator.hasNext()) {
      ((q)localIterator.next()).d();
    }
    return paramq.b(new f(this, paramq));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */