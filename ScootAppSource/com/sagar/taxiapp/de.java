package com.sagar.taxiapp;

import android.content.Context;
import android.graphics.Typeface;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.b;
import com.google.android.gms.location.places.d;
import com.google.android.gms.location.places.m;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class de
  extends ArrayAdapter<b>
  implements Filterable
{
  private static final CharacterStyle b = new StyleSpan(2);
  private static final CharacterStyle c = null;
  Typeface a;
  private ArrayList<b> d;
  private q e;
  private LatLngBounds f;
  private AutocompleteFilter g;
  
  public de(Context paramContext, q paramq, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter)
  {
    super(paramContext, 17367047, 16908308);
    this.e = paramq;
    this.f = paramLatLngBounds;
    this.g = paramAutocompleteFilter;
    this.a = ds.a(paramContext, "fonts/Roboto-Regular.ttf");
  }
  
  private ArrayList<b> a(CharSequence paramCharSequence)
  {
    if (this.e.i())
    {
      paramCharSequence = (com.google.android.gms.location.places.c)m.e.a(this.e, paramCharSequence.toString(), this.f, this.g).a(60L, TimeUnit.SECONDS);
      Object localObject = paramCharSequence.b();
      if (!((Status)localObject).f())
      {
        Toast.makeText(getContext(), "Error contacting API: " + ((Status)localObject).toString(), 0).show();
        paramCharSequence.a();
        return null;
      }
      this.d = com.google.android.gms.common.data.c.a(paramCharSequence);
      paramCharSequence = new ArrayList();
      localObject = this.d.iterator();
      while (((Iterator)localObject).hasNext())
      {
        b localb = (b)((Iterator)localObject).next();
        if (localb.c(null).toString().contains("India")) {
          paramCharSequence.add(localb);
        }
      }
      return paramCharSequence;
    }
    return null;
  }
  
  public b a(int paramInt)
  {
    try
    {
      b localb = (b)this.d.get(paramInt);
      return localb;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
    return null;
  }
  
  public int getCount()
  {
    return this.d.size();
  }
  
  public Filter getFilter()
  {
    return new df(this);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramViewGroup = super.getView(paramInt, paramView, paramViewGroup);
      TextView localTextView1;
      TextView localTextView2;
      paramView.printStackTrace();
    }
    catch (Exception paramView)
    {
      try
      {
        paramView = a(paramInt);
        if (paramView != null)
        {
          localTextView1 = (TextView)paramViewGroup.findViewById(16908308);
          localTextView2 = (TextView)paramViewGroup.findViewById(16908309);
          localTextView1.setText(paramView.b(b));
          localTextView2.setText(paramView.c(b));
        }
        return paramViewGroup;
      }
      catch (Exception paramView)
      {
        for (;;) {}
      }
      paramView = paramView;
      paramViewGroup = null;
    }
    return paramViewGroup;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */