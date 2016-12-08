package com.digits.sdk.android;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.widget.EditText;

final class dk
  extends dc
{
  dk(dj paramdj, Context paramContext1, bf parambf, String paramString, ef paramef, boolean paramBoolean, ResultReceiver paramResultReceiver, a parama, Context paramContext2)
  {
    super(paramContext1, parambf, paramString, paramef, paramBoolean, paramResultReceiver, parama);
  }
  
  public void a(Intent paramIntent)
  {
    this.b.f.e();
    this.b.e.postDelayed(new dl(this, paramIntent), 1500L);
  }
  
  public void a(bs parambs)
  {
    if ((parambs instanceof df))
    {
      this.b.l = parambs.b().b;
      this.b.g();
      this.b.a(this.a, parambs);
      return;
    }
    this.b.a(this.a, parambs);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */