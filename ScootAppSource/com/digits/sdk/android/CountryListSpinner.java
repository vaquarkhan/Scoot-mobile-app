package com.digits.sdk.android;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import b.a.a.a.a.b.m;
import java.util.List;
import java.util.Locale;

public class CountryListSpinner
  extends TextView
  implements View.OnClickListener, ak
{
  private String a;
  private al b;
  private ai c;
  private View.OnClickListener d;
  private String e;
  
  public CountryListSpinner(Context paramContext)
  {
    this(paramContext, null, 16842881);
  }
  
  public CountryListSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842881);
  }
  
  public CountryListSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    super.setOnClickListener(this);
    this.c = new ai(getContext());
    this.b = new al(this, this.c);
    this.a = getResources().getString(R.string.dgts__country_spinner_format);
    this.e = "";
    a(1, Locale.US.getDisplayCountry());
  }
  
  private void a(int paramInt, String paramString)
  {
    setText(String.format(this.a, new Object[] { paramString, Integer.valueOf(paramInt) }));
    setTag(Integer.valueOf(paramInt));
  }
  
  private void a(View paramView)
  {
    if (this.d != null) {
      this.d.onClick(paramView);
    }
  }
  
  private void b()
  {
    new aj(this).a(ao.d().l(), new Void[0]);
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)))
    {
      this.e = paramString1;
      a(Integer.valueOf(paramString2).intValue(), paramString1);
    }
  }
  
  public void a(List<ah> paramList)
  {
    this.c.a(paramList);
    this.b.a(this.c.a(this.e));
  }
  
  public void onClick(View paramView)
  {
    if (this.c.getCount() == 0) {
      b();
    }
    for (;;)
    {
      m.a(getContext(), this);
      a(paramView);
      return;
      this.b.a(this.c.a(this.e));
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.b.b()) {
      this.b.a();
    }
  }
  
  void setDialogPopup(al paramal)
  {
    this.b = paramal;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.d = paramOnClickListener;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\CountryListSpinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */