package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@KeepName
public final class DataHolder
  extends AbstractSafeParcelable
  implements Closeable
{
  public static final Parcelable.Creator<DataHolder> CREATOR = new l();
  private static final e l = new d(new String[0], null);
  Bundle a;
  int[] b;
  int c;
  boolean d = false;
  private final int e;
  private final String[] f;
  private final CursorWindow[] g;
  private final int h;
  private final Bundle i;
  private Object j;
  private boolean k = true;
  
  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.e = paramInt1;
    this.f = paramArrayOfString;
    this.g = paramArrayOfCursorWindow;
    this.h = paramInt2;
    this.i = paramBundle;
  }
  
  private DataHolder(e parame, int paramInt, Bundle paramBundle)
  {
    this(e.a(parame), a(parame, -1), paramInt, paramBundle);
  }
  
  public DataHolder(String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt, Bundle paramBundle)
  {
    this.e = 1;
    this.f = ((String[])b.a(paramArrayOfString));
    this.g = ((CursorWindow[])b.a(paramArrayOfCursorWindow));
    this.h = paramInt;
    this.i = paramBundle;
    a();
  }
  
  public static DataHolder a(int paramInt, Bundle paramBundle)
  {
    return new DataHolder(l, paramInt, paramBundle);
  }
  
  private void a(String paramString, int paramInt)
  {
    if ((this.a == null) || (!this.a.containsKey(paramString)))
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {}
      for (paramString = "No such column: ".concat(paramString);; paramString = new String("No such column: ")) {
        throw new IllegalArgumentException(paramString);
      }
    }
    if (h()) {
      throw new IllegalArgumentException("Buffer is closed.");
    }
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new CursorIndexOutOfBoundsException(paramInt, this.c);
    }
  }
  
  private static CursorWindow[] a(e parame, int paramInt)
  {
    int i1 = 0;
    if (e.a(parame).length == 0) {
      return new CursorWindow[0];
    }
    Object localObject3;
    Object localObject2;
    ArrayList localArrayList;
    int m;
    label88:
    Object localObject1;
    if ((paramInt < 0) || (paramInt >= e.b(parame).size()))
    {
      localObject3 = e.b(parame);
      int i2 = ((List)localObject3).size();
      localObject2 = new CursorWindow(false);
      localArrayList = new ArrayList();
      localArrayList.add(localObject2);
      ((CursorWindow)localObject2).setNumColumns(e.a(parame).length);
      paramInt = 0;
      m = 0;
      if (paramInt >= i2) {
        break label726;
      }
      localObject1 = localObject2;
    }
    for (;;)
    {
      int n;
      try
      {
        if (!((CursorWindow)localObject2).allocRow())
        {
          Log.d("DataHolder", 72 + "Allocating additional cursor window for large data set (row " + paramInt + ")");
          localObject2 = new CursorWindow(false);
          ((CursorWindow)localObject2).setStartPosition(paramInt);
          ((CursorWindow)localObject2).setNumColumns(e.a(parame).length);
          localArrayList.add(localObject2);
          localObject1 = localObject2;
          if (!((CursorWindow)localObject2).allocRow())
          {
            Log.e("DataHolder", "Unable to allocate row to hold data.");
            localArrayList.remove(localObject2);
            parame = (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
            return parame;
            localObject3 = e.b(parame).subList(0, paramInt);
            break;
          }
        }
        Map localMap = (Map)((List)localObject3).get(paramInt);
        n = 0;
        bool = true;
        if ((n < e.a(parame).length) && (bool))
        {
          localObject2 = e.a(parame)[n];
          Object localObject4 = localMap.get(localObject2);
          if (localObject4 == null)
          {
            bool = ((CursorWindow)localObject1).putNull(paramInt, n);
            break label743;
          }
          if ((localObject4 instanceof String))
          {
            bool = ((CursorWindow)localObject1).putString((String)localObject4, paramInt, n);
            break label743;
          }
          if ((localObject4 instanceof Long))
          {
            bool = ((CursorWindow)localObject1).putLong(((Long)localObject4).longValue(), paramInt, n);
            break label743;
          }
          if ((localObject4 instanceof Integer))
          {
            bool = ((CursorWindow)localObject1).putLong(((Integer)localObject4).intValue(), paramInt, n);
            break label743;
          }
          if ((localObject4 instanceof Boolean))
          {
            if (!((Boolean)localObject4).booleanValue()) {
              break label750;
            }
            l1 = 1L;
            bool = ((CursorWindow)localObject1).putLong(l1, paramInt, n);
            break label743;
          }
          if ((localObject4 instanceof byte[]))
          {
            bool = ((CursorWindow)localObject1).putBlob((byte[])localObject4, paramInt, n);
            break label743;
          }
          if ((localObject4 instanceof Double))
          {
            bool = ((CursorWindow)localObject1).putDouble(((Double)localObject4).doubleValue(), paramInt, n);
            break label743;
          }
          if ((localObject4 instanceof Float))
          {
            bool = ((CursorWindow)localObject1).putDouble(((Float)localObject4).floatValue(), paramInt, n);
            break label743;
          }
          parame = String.valueOf(localObject4);
          throw new IllegalArgumentException(String.valueOf(localObject2).length() + 32 + String.valueOf(parame).length() + "Unsupported object for column " + (String)localObject2 + ": " + parame);
        }
      }
      catch (RuntimeException parame)
      {
        boolean bool;
        m = localArrayList.size();
        paramInt = i1;
        if (paramInt < m)
        {
          ((CursorWindow)localArrayList.get(paramInt)).close();
          paramInt += 1;
          continue;
          if (!bool)
          {
            if (m != 0) {
              throw new f("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
            }
            Log.d("DataHolder", 74 + "Couldn't populate window data for row " + paramInt + " - allocating new window.");
            ((CursorWindow)localObject1).freeLastRow();
            localObject1 = new CursorWindow(false);
            ((CursorWindow)localObject1).setStartPosition(paramInt);
            ((CursorWindow)localObject1).setNumColumns(e.a(parame).length);
            localArrayList.add(localObject1);
            m = paramInt - 1;
            paramInt = 1;
            n = paramInt;
            paramInt = m + 1;
            localObject2 = localObject1;
            m = n;
            break label88;
          }
          n = 0;
          m = paramInt;
          paramInt = n;
          continue;
        }
        throw parame;
      }
      label726:
      return (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
      label743:
      n += 1;
      continue;
      label750:
      long l1 = 0L;
    }
  }
  
  public static DataHolder b(int paramInt)
  {
    return a(paramInt, null);
  }
  
  public int a(int paramInt)
  {
    int n = 0;
    boolean bool;
    if ((paramInt >= 0) && (paramInt < this.c))
    {
      bool = true;
      b.a(bool);
    }
    for (;;)
    {
      int m = n;
      if (n < this.b.length)
      {
        if (paramInt < this.b[n]) {
          m = n - 1;
        }
      }
      else
      {
        paramInt = m;
        if (m == this.b.length) {
          paramInt = m - 1;
        }
        return paramInt;
        bool = false;
        break;
      }
      n += 1;
    }
  }
  
  public int a(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].getInt(paramInt1, this.a.getInt(paramString));
  }
  
  public void a()
  {
    int n = 0;
    this.a = new Bundle();
    int m = 0;
    while (m < this.f.length)
    {
      this.a.putInt(this.f[m], m);
      m += 1;
    }
    this.b = new int[this.g.length];
    int i1 = 0;
    m = n;
    n = i1;
    while (m < this.g.length)
    {
      this.b[m] = n;
      i1 = this.g[m].getStartPosition();
      n += this.g[m].getNumRows() - (n - i1);
      m += 1;
    }
    this.c = n;
  }
  
  public void a(Object paramObject)
  {
    this.j = paramObject;
  }
  
  public boolean a(String paramString)
  {
    return this.a.containsKey(paramString);
  }
  
  int b()
  {
    return this.e;
  }
  
  public String b(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].getString(paramInt1, this.a.getInt(paramString));
  }
  
  public boolean c(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return Long.valueOf(this.g[paramInt2].getLong(paramInt1, this.a.getInt(paramString))).longValue() == 1L;
  }
  
  String[] c()
  {
    return this.f;
  }
  
  public void close()
  {
    try
    {
      if (!this.d)
      {
        this.d = true;
        int m = 0;
        while (m < this.g.length)
        {
          this.g[m].close();
          m += 1;
        }
      }
      return;
    }
    finally {}
  }
  
  public float d(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].getFloat(paramInt1, this.a.getInt(paramString));
  }
  
  CursorWindow[] d()
  {
    return this.g;
  }
  
  public int e()
  {
    return this.h;
  }
  
  public byte[] e(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].getBlob(paramInt1, this.a.getInt(paramString));
  }
  
  public Bundle f()
  {
    return this.i;
  }
  
  public boolean f(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].isNull(paramInt1, this.a.getInt(paramString));
  }
  
  protected void finalize()
  {
    label125:
    for (;;)
    {
      try
      {
        if ((this.k) && (this.g.length > 0) && (!h()))
        {
          if (this.j != null) {
            break label125;
          }
          str1 = String.valueOf(toString());
          if (str1.length() != 0)
          {
            str1 = "internal object: ".concat(str1);
            Log.e("DataBuffer", String.valueOf(str1).length() + 161 + "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + str1 + ")");
            close();
          }
        }
        else
        {
          return;
        }
        String str1 = new String("internal object: ");
        continue;
        String str2 = this.j.toString();
      }
      finally
      {
        super.finalize();
      }
    }
  }
  
  public int g()
  {
    return this.c;
  }
  
  public boolean h()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally {}
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\DataHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */