package com.sagar.taxiapp.b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.bd;
import android.support.v4.app.be;
import android.support.v4.b.n;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sagar.taxiapp.a.d;
import com.sagar.taxiapp.beans.OlaBookingObject;
import java.util.ArrayList;
import java.util.List;
import jp.wasabeef.recyclerview.a.b;

public final class f
  extends Fragment
  implements be<List<OlaBookingObject>>
{
  private static List<d> a = new ArrayList();
  private static com.sagar.taxiapp.a.a b;
  private static List<OlaBookingObject> c = new ArrayList();
  private static TextView d;
  
  private static void b(List<OlaBookingObject> paramList)
  {
    if (paramList.size() > 0)
    {
      a.clear();
      d.setVisibility(8);
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        d locald = new d(0, (OlaBookingObject)paramList.get(i));
        locald.c = new ArrayList();
        locald.c.add(new d(1, null));
        a.add(locald);
        i += 1;
      }
      b.a(a);
    }
  }
  
  public n<List<OlaBookingObject>> a(int paramInt, Bundle paramBundle)
  {
    return new g(k());
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968689, paramViewGroup, false);
    paramViewGroup = (RecyclerView)paramLayoutInflater.findViewById(2131755552);
    d = (TextView)paramLayoutInflater.findViewById(2131755553);
    paramViewGroup.setLayoutManager(new LinearLayoutManager(k(), 1, false));
    c.clear();
    a.clear();
    b = new com.sagar.taxiapp.a.a(a);
    paramViewGroup.setAdapter(new b(b));
    paramViewGroup.setHasFixedSize(true);
    u().a(1, null, this).l();
    return paramLayoutInflater;
  }
  
  public void a(n<List<OlaBookingObject>> paramn) {}
  
  public void a(n<List<OlaBookingObject>> paramn, List<OlaBookingObject> paramList)
  {
    b(paramList);
  }
  
  public void w()
  {
    super.w();
    if (com.scootapp.tv.a.a.a)
    {
      Intent localIntent = new Intent();
      localIntent.setAction("BOOKING_UPDATED");
      l().sendBroadcast(localIntent);
      com.scootapp.tv.a.a.a = false;
    }
  }
  
  public void x()
  {
    super.x();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */