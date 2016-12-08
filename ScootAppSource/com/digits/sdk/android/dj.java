package com.digits.sdk.android;

import android.content.Context;
import android.os.ResultReceiver;
import android.widget.EditText;
import java.util.Locale;

final class dj
  extends bo
  implements dp
{
  final CountryListSpinner k;
  boolean l;
  boolean m;
  boolean n;
  private final eb o;
  
  dj(ResultReceiver paramResultReceiver, StateButton paramStateButton, EditText paramEditText, CountryListSpinner paramCountryListSpinner, bf parambf, co paramco, a parama, com.twitter.sdk.android.core.m<cb> paramm, eb parameb, ca paramca, boolean paramBoolean)
  {
    super(paramResultReceiver, paramStateButton, paramEditText, parambf, paramco, parama, paramm, paramca);
    this.k = paramCountryListSpinner;
    this.o = parameb;
    this.l = false;
    this.m = false;
    this.n = paramBoolean;
  }
  
  dj(ResultReceiver paramResultReceiver, StateButton paramStateButton, EditText paramEditText, CountryListSpinner paramCountryListSpinner, eb parameb, ca paramca, boolean paramBoolean)
  {
    this(paramResultReceiver, paramStateButton, paramEditText, paramCountryListSpinner, ao.d().i(), new dm(paramStateButton.getContext().getResources()), ao.d().m(), ao.f(), parameb, paramca, paramBoolean);
  }
  
  private String a(long paramLong, String paramString)
  {
    return "+" + String.valueOf(paramLong) + paramString;
  }
  
  private void h()
  {
    if (i())
    {
      this.h.a(bz.c);
      return;
    }
    this.h.a(bz.b);
  }
  
  private boolean i()
  {
    return this.i > 0;
  }
  
  private ef j()
  {
    if ((this.m) && (this.l)) {
      return ef.a;
    }
    return ef.b;
  }
  
  public void a(Context paramContext)
  {
    h();
    if (a(this.e.getText()))
    {
      this.f.d();
      b.a.a.a.a.b.m.a(paramContext, this.e);
      int i = ((Integer)this.k.getTag()).intValue();
      String str = this.e.getText().toString();
      b(paramContext, a(i, str)).a();
    }
  }
  
  public void a(dg paramdg)
  {
    b(paramdg);
    c(paramdg);
  }
  
  dc b(Context paramContext, String paramString)
  {
    return new dk(this, paramContext, this.a, paramString, j(), this.n, this.d, this.b, paramContext);
  }
  
  public void b(dg paramdg)
  {
    if (dg.a(paramdg))
    {
      this.e.setText(paramdg.c());
      this.e.setSelection(paramdg.c().length());
    }
  }
  
  public void c(dg paramdg)
  {
    if (dg.b(paramdg)) {
      this.k.a(new Locale("", paramdg.d()).getDisplayName(), paramdg.b());
    }
  }
  
  public void g()
  {
    this.m = true;
    if (this.l)
    {
      this.f.a(R.string.dgts__call_me, R.string.dgts__calling, R.string.dgts__calling);
      this.o.a(R.string.dgts__terms_text_call_me);
    }
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if (ef.a.equals(j()))
    {
      this.m = false;
      this.f.a(R.string.dgts__continue, R.string.dgts__sending, R.string.dgts__done);
      this.f.g();
      this.o.a(R.string.dgts__terms_text);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */