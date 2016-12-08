package com.sagar.taxiapp.a;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.sagar.taxiapp.ds;
import java.util.ArrayList;
import java.util.List;

public final class bq<T>
  extends BaseAdapter
  implements Filterable
{
  private List<T> a;
  private final Object b = new Object();
  private int c;
  private int d;
  private int e = 0;
  private int f = 0;
  private boolean g = true;
  private Context h;
  private ArrayList<T> i;
  private bq<T>.bs j;
  private LayoutInflater k;
  private Typeface l;
  
  public bq(Context paramContext, int paramInt1, int paramInt2, int paramInt3, List<T> paramList)
  {
    a(paramContext, paramInt1, paramInt2, paramInt3, paramList);
  }
  
  private View a(int paramInt1, View paramView, ViewGroup paramViewGroup, int paramInt2)
  {
    int m = 1;
    if (paramView == null) {
      paramViewGroup = this.k.inflate(paramInt2, paramViewGroup, false);
    }
    TextView localTextView2;
    TextView localTextView1;
    for (;;)
    {
      try
      {
        if (this.f == 0)
        {
          localTextView2 = (TextView)paramViewGroup;
          localTextView1 = (TextView)paramViewGroup;
          if (this.l == null) {
            this.l = ds.a(this.h, "fonts/Roboto-Condensed.ttf");
          }
          localTextView2.setTypeface(this.l);
          paramView = getItem(paramInt1);
          if (!(paramView instanceof CharSequence)) {
            break label250;
          }
          localObject = paramView.toString();
          paramView = "";
          localObject = ((String)localObject).split(",");
          localCharSequence = localObject[0];
          paramInt1 = 1;
          if (paramInt1 >= localObject.length) {
            break;
          }
          if (paramInt1 == localObject.length - 1)
          {
            paramView = paramView + localObject[paramInt1];
            paramInt1 += 1;
            continue;
            paramViewGroup = paramView;
          }
        }
        else
        {
          localTextView2 = (TextView)paramViewGroup.findViewById(this.f);
          localTextView1 = (TextView)paramViewGroup.findViewById(this.e);
          continue;
        }
        paramView = paramView + localObject[paramInt1] + ",";
      }
      catch (ClassCastException paramView)
      {
        Log.e("ArrayAdapter", "You must supply a resource ID for a TextView");
        throw new IllegalStateException("ArrayAdapter requires the resource ID to be a TextView", paramView);
      }
    }
    localTextView2.setText(localCharSequence);
    localTextView1.setText(paramView);
    return paramViewGroup;
    label250:
    Object localObject = paramView.toString();
    paramView = "";
    localObject = ((String)localObject).split(",");
    CharSequence localCharSequence = localObject[0];
    paramInt1 = m;
    if (paramInt1 < localObject.length)
    {
      if (paramInt1 == localObject.length - 1) {}
      for (paramView = paramView + localObject[paramInt1];; paramView = paramView + localObject[paramInt1] + ",")
      {
        paramInt1 += 1;
        break;
      }
    }
    localTextView2.setText(localCharSequence);
    localTextView1.setText(paramView);
    return paramViewGroup;
  }
  
  private void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, List<T> paramList)
  {
    this.h = paramContext;
    this.k = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    this.d = paramInt1;
    this.c = paramInt1;
    this.a = paramList;
    this.f = paramInt2;
    this.e = paramInt3;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(paramInt, paramView, paramViewGroup, this.d);
  }
  
  public Filter getFilter()
  {
    if (this.j == null) {
      this.j = new bs(this, null);
    }
    return this.j;
  }
  
  public T getItem(int paramInt)
  {
    return (T)this.a.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return a(paramInt, paramView, paramViewGroup, this.c);
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    this.g = true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */