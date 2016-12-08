package com.appsee;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

class lb
{
  private static lb f;
  private short A;
  private List<zb> B;
  private HashMap<Integer, short[]> D;
  private final int G;
  private final int M;
  private short[] l;
  
  public static lb C()
  {
    try
    {
      if (f == null) {
        f = new lb();
      }
      lb locallb = f;
      return locallb;
    }
    finally {}
  }
  
  public static String C(String paramString)
  {
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int j = i - 1;
    for (i = j; j >= 0; i = j)
    {
      j = paramString.charAt(i);
      int k = i - 1;
      arrayOfChar[i] = ((char)(j ^ 0x1B));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x3E));
    }
    return new String(arrayOfChar);
  }
  
  public List<zb> C()
  {
    return this.B;
  }
  
  public JSONArray C()
  {
    synchronized (this.B)
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.B.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((zb)localIterator.next()).C());
      }
      return localJSONArray;
    }
  }
  
  public short C(int paramInt)
  {
    if (paramInt >= this.l.length) {
      return -1;
    }
    return this.l[paramInt];
  }
  
  public void C()
  {
    synchronized (this.B)
    {
      this.B.clear();
      return;
    }
  }
  
  public void C(MotionEvent paramMotionEvent, View paramView)
  {
    wb localwb = wb.A;
    short s3 = (short)(int)paramMotionEvent.getX(paramMotionEvent.getActionIndex());
    short s2 = (short)(int)paramMotionEvent.getY(paramMotionEvent.getActionIndex());
    Object localObject;
    short s1;
    switch (paramMotionEvent.getActionMasked())
    {
    case 3: 
    case 4: 
    default: 
      localObject = localwb;
      s1 = 0;
    }
    for (;;)
    {
      if ((localObject != wb.A) && (s1 > 0))
      {
        C(s1, s3, s2, localwb, paramView);
        C(paramMotionEvent, new short[] { s1 }, paramView);
      }
      return;
      localwb = wb.G;
      s1 = H(paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
      localObject = localwb;
      continue;
      localwb = wb.B;
      s1 = C(paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
      localObject = localwb;
      continue;
      localwb = wb.A;
      localObject = new short[paramMotionEvent.getPointerCount()];
      int i = 0;
      int j = 0;
      s1 = 0;
      while (i < paramMotionEvent.getPointerCount())
      {
        s1 = C(paramMotionEvent.getPointerId(j));
        localObject[j] = s1;
        if (s1 > 0)
        {
          s3 = (short)(int)paramMotionEvent.getX(j);
          s2 = (short)(int)paramMotionEvent.getY(j);
          C(s1, s3, s2, localwb, paramView);
        }
        i = j + 1;
        j = i;
      }
      C(paramMotionEvent, (short[])localObject, paramView);
      localObject = localwb;
      continue;
      localwb = wb.G;
      s1 = H(paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
      localObject = localwb;
      continue;
      localwb = wb.B;
      s1 = C(paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
      localObject = localwb;
    }
  }
  
  public void C(short paramShort1, short paramShort2, short paramShort3, wb paramwb, View arg5)
  {
    if (!fc.C().C()) {}
    while (fc.C().C() == -1L) {
      return;
    }
    if ((paramwb == wb.G) || (paramwb == wb.B)) {
      kb.C().M();
    }
    ??? = ab.C(???);
    short s1 = (short)(???.left + paramShort2);
    short s2 = (short)(???.top + paramShort3);
    ??? = ab.C(new Point(s1, s2));
    if ((k.C().H()) && (k.C().C()))
    {
      vd.H(1, sb.C("\n\t-\0011\007-\tc\036\"\0330\013'N5\007'\013,N7\0016\r+"));
      return;
    }
    zb localzb = new zb(paramShort1, (short)???.x, (short)???.y, fc.C().C(), paramwb, rd.C().C());
    for (;;)
    {
      synchronized (this.B)
      {
        if (paramwb != wb.A) {
          break;
        }
        if (this.B.isEmpty())
        {
          paramwb = null;
          if ((paramwb == null) || (paramwb.C() != wb.A) || (localzb.C() - paramwb.C() >= 120L)) {
            break;
          }
          return;
        }
      }
      paramwb = (zb)this.B.get(this.B.size() - 1);
    }
    vd.C(1, sb.C("(,\033-\nc\032,\033 \006cK'NnNkK'Bf\njN(S%\017/\035&"), new Object[] { Short.valueOf(paramShort1), Short.valueOf(s1), Short.valueOf(s2) });
    this.B.add(localzb);
  }
  
  public boolean C()
  {
    synchronized (this.B)
    {
      if (this.B.isEmpty()) {
        return false;
      }
      zb localzb = (zb)this.B.get(this.B.size() - 1);
      if ((localzb != null) && (localzb.C() == wb.A) && (fc.C().C() - localzb.C() <= 500L)) {
        return true;
      }
    }
    return false;
  }
  
  public short[] C(int paramInt)
  {
    if (this.D.containsKey(Integer.valueOf(paramInt))) {
      return (short[])this.D.get(Integer.valueOf(paramInt));
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */