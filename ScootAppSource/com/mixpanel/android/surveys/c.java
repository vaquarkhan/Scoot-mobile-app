package com.mixpanel.android.surveys;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.mixpanel.android.R.id;
import com.mixpanel.android.R.layout;
import java.util.List;

final class c
  implements ListAdapter
{
  private final List<String> a;
  private final LayoutInflater b;
  
  public c(List<String> paramList, LayoutInflater paramLayoutInflater)
  {
    this.a = paramList;
    this.b = paramLayoutInflater;
  }
  
  public String a(int paramInt)
  {
    return (String)this.a.get(paramInt);
  }
  
  public boolean areAllItemsEnabled()
  {
    return true;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    if (paramInt == this.a.size() - 1) {
      return 1;
    }
    return 2;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = -1;
    View localView = paramView;
    if (paramView == null) {
      switch (getItemViewType(paramInt))
      {
      }
    }
    for (;;)
    {
      localView = this.b.inflate(i, paramViewGroup, false);
      ((TextView)localView.findViewById(R.id.com_mixpanel_android_multiple_choice_answer_text)).setText((String)this.a.get(paramInt));
      return localView;
      i = R.layout.com_mixpanel_android_first_choice_answer;
      continue;
      i = R.layout.com_mixpanel_android_last_choice_answer;
      continue;
      i = R.layout.com_mixpanel_android_middle_choice_answer;
    }
  }
  
  public int getViewTypeCount()
  {
    return 3;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
  
  public boolean isEmpty()
  {
    return this.a.isEmpty();
  }
  
  public boolean isEnabled(int paramInt)
  {
    return true;
  }
  
  public void registerDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\surveys\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */