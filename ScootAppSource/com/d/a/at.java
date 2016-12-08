package com.d.a;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

final class at
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    ArrayList localArrayList1 = (ArrayList)an.l().get();
    ArrayList localArrayList2 = (ArrayList)an.m().get();
    int i;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      paramMessage = (ArrayList)an.n().get();
      if ((localArrayList1.size() > 0) || (localArrayList2.size() > 0)) {
        i = 0;
      }
      break;
    }
    for (;;)
    {
      int k = i;
      Object localObject;
      int j;
      an localan;
      if (paramMessage.size() > 0)
      {
        localObject = (ArrayList)paramMessage.clone();
        paramMessage.clear();
        k = ((ArrayList)localObject).size();
        j = 0;
        if (j < k)
        {
          localan = (an)((ArrayList)localObject).get(j);
          if (an.a(localan) == 0L) {
            an.b(localan);
          }
          for (;;)
          {
            j += 1;
            break;
            localArrayList2.add(localan);
          }
          k = 1;
        }
      }
      else
      {
        long l = AnimationUtils.currentAnimationTimeMillis();
        localObject = (ArrayList)an.o().get();
        paramMessage = (ArrayList)an.p().get();
        j = localArrayList2.size();
        i = 0;
        while (i < j)
        {
          localan = (an)localArrayList2.get(i);
          if (an.a(localan, l)) {
            ((ArrayList)localObject).add(localan);
          }
          i += 1;
        }
        j = ((ArrayList)localObject).size();
        if (j > 0)
        {
          i = 0;
          while (i < j)
          {
            localan = (an)((ArrayList)localObject).get(i);
            an.b(localan);
            an.a(localan, true);
            localArrayList2.remove(localan);
            i += 1;
          }
          ((ArrayList)localObject).clear();
        }
        i = localArrayList1.size();
        j = 0;
        if (j < i)
        {
          localObject = (an)localArrayList1.get(j);
          if (((an)localObject).e(l)) {
            paramMessage.add(localObject);
          }
          int m;
          if (localArrayList1.size() == i)
          {
            m = j + 1;
            j = i;
            i = m;
          }
          for (;;)
          {
            m = j;
            j = i;
            i = m;
            break;
            paramMessage.remove(localObject);
            m = i - 1;
            i = j;
            j = m;
          }
        }
        if (paramMessage.size() > 0)
        {
          i = 0;
          while (i < paramMessage.size())
          {
            an.c((an)paramMessage.get(i));
            i += 1;
          }
          paramMessage.clear();
        }
        if ((k == 0) || ((localArrayList1.isEmpty()) && (localArrayList2.isEmpty()))) {
          break;
        }
        sendEmptyMessageDelayed(1, Math.max(0L, an.q() - (AnimationUtils.currentAnimationTimeMillis() - l)));
        return;
        i = 1;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */