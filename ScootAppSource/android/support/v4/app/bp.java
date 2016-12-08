package android.support.v4.app;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public final class bp
{
  private static final bx a = new ca();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new bz();
      return;
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      a = new by();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new cf();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new ce();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new cd();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new cc();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new cb();
      return;
    }
  }
  
  private static void b(bn parambn, ArrayList<bq> paramArrayList)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      parambn.a((bq)paramArrayList.next());
    }
  }
  
  private static void b(bo parambo, cg paramcg)
  {
    if (paramcg != null)
    {
      if (!(paramcg instanceof bt)) {
        break label37;
      }
      paramcg = (bt)paramcg;
      cs.a(parambo, paramcg.d, paramcg.f, paramcg.e, paramcg.a);
    }
    label37:
    do
    {
      return;
      if ((paramcg instanceof bw))
      {
        paramcg = (bw)paramcg;
        cs.a(parambo, paramcg.d, paramcg.f, paramcg.e, paramcg.a);
        return;
      }
    } while (!(paramcg instanceof bs));
    paramcg = (bs)paramcg;
    cs.a(parambo, paramcg.d, paramcg.f, paramcg.e, paramcg.a, paramcg.b, paramcg.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */