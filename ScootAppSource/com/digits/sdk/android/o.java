package com.digits.sdk.android;

import android.content.Context;
import android.os.ResultReceiver;
import android.widget.EditText;
import android.widget.TextView;

final class o
  extends bo
{
  private final String k;
  private final Boolean l;
  private final InvertedStateButton m;
  private final InvertedStateButton n;
  private final TextView o;
  
  o(ResultReceiver paramResultReceiver, StateButton paramStateButton, InvertedStateButton paramInvertedStateButton1, InvertedStateButton paramInvertedStateButton2, EditText paramEditText, String paramString, ca paramca, boolean paramBoolean, TextView paramTextView)
  {
    this(paramResultReceiver, paramStateButton, paramInvertedStateButton1, paramInvertedStateButton2, paramEditText, paramString, ao.f(), ao.d().i(), new u(paramStateButton.getContext().getResources()), ao.d().m(), paramca, paramBoolean, paramTextView);
  }
  
  o(ResultReceiver paramResultReceiver, StateButton paramStateButton, InvertedStateButton paramInvertedStateButton1, InvertedStateButton paramInvertedStateButton2, EditText paramEditText, String paramString, com.twitter.sdk.android.core.m<cb> paramm, bf parambf, co paramco, a parama, ca paramca, boolean paramBoolean, TextView paramTextView)
  {
    super(paramResultReceiver, paramStateButton, paramEditText, parambf, paramco, parama, paramm, paramca);
    this.k = paramString;
    this.l = Boolean.valueOf(paramBoolean);
    this.m = paramInvertedStateButton1;
    this.n = paramInvertedStateButton2;
    this.j = a(15000, paramTextView, paramInvertedStateButton1, paramInvertedStateButton2);
    this.o = paramTextView;
  }
  
  public void a(Context paramContext)
  {
    this.h.a(bz.b);
    if (a(this.e.getText()))
    {
      this.f.d();
      b.a.a.a.a.b.m.a(paramContext, this.e);
      String str = this.e.getText().toString();
      this.a.a(str, this.k, new p(this, paramContext, this, paramContext));
    }
  }
  
  public void a(Context paramContext, InvertedStateButton paramInvertedStateButton, ef paramef)
  {
    paramInvertedStateButton.d();
    this.a.b(this.k, paramef, new q(this, paramContext, this, paramInvertedStateButton));
  }
  
  public void a(Context paramContext, bs parambs)
  {
    this.n.f();
    this.m.f();
    super.a(paramContext, parambs);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */