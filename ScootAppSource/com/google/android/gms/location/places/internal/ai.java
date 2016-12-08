package com.google.android.gms.location.places.internal;

import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.b.a;
import com.google.android.gms.b.l;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ai
  extends j
{
  private final String c = "SafeDataBufferRef";
  
  public ai(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  protected float a(String paramString, float paramFloat)
  {
    float f = paramFloat;
    if (a(paramString))
    {
      f = paramFloat;
      if (!g(paramString)) {
        f = e(paramString);
      }
    }
    return f;
  }
  
  protected int a(String paramString, int paramInt)
  {
    int i = paramInt;
    if (a(paramString))
    {
      i = paramInt;
      if (!g(paramString)) {
        i = b(paramString);
      }
    }
    return i;
  }
  
  protected <E extends SafeParcelable> E a(String paramString, Parcelable.Creator<E> paramCreator)
  {
    paramString = a(paramString, null);
    if (paramString == null) {
      return null;
    }
    return d.a(paramString, paramCreator);
  }
  
  protected String a(String paramString1, String paramString2)
  {
    String str = paramString2;
    if (a(paramString1))
    {
      str = paramString2;
      if (!g(paramString1)) {
        str = d(paramString1);
      }
    }
    return str;
  }
  
  protected <E extends SafeParcelable> List<E> a(String paramString, Parcelable.Creator<E> paramCreator, List<E> paramList)
  {
    paramString = a(paramString, null);
    if (paramString == null) {}
    do
    {
      for (;;)
      {
        return paramList;
        try
        {
          Object localObject = a.a(paramString);
          if (((a)localObject).c != null)
          {
            paramString = new ArrayList(((a)localObject).c.length);
            localObject = ((a)localObject).c;
            int j = localObject.length;
            int i = 0;
            while (i < j)
            {
              paramString.add(d.a(localObject[i], paramCreator));
              i += 1;
            }
            return paramString;
          }
        }
        catch (l paramString) {}
      }
    } while (!Log.isLoggable("SafeDataBufferRef", 6));
    Log.e("SafeDataBufferRef", "Cannot parse byte[]", paramString);
    return paramList;
  }
  
  protected List<Integer> a(String paramString, List<Integer> paramList)
  {
    paramString = a(paramString, null);
    if (paramString == null) {}
    do
    {
      for (;;)
      {
        return paramList;
        try
        {
          paramString = a.a(paramString);
          if (paramString.b != null)
          {
            ArrayList localArrayList = new ArrayList(paramString.b.length);
            int i = 0;
            while (i < paramString.b.length)
            {
              localArrayList.add(Integer.valueOf(paramString.b[i]));
              i += 1;
            }
            return localArrayList;
          }
        }
        catch (l paramString) {}
      }
    } while (!Log.isLoggable("SafeDataBufferRef", 6));
    Log.e("SafeDataBufferRef", "Cannot parse byte[]", paramString);
    return paramList;
  }
  
  protected boolean a(String paramString, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    if (a(paramString))
    {
      bool = paramBoolean;
      if (!g(paramString)) {
        bool = c(paramString);
      }
    }
    return bool;
  }
  
  protected byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (a(paramString))
    {
      arrayOfByte = paramArrayOfByte;
      if (!g(paramString)) {
        arrayOfByte = f(paramString);
      }
    }
    return arrayOfByte;
  }
  
  protected List<String> b(String paramString, List<String> paramList)
  {
    paramString = a(paramString, null);
    if (paramString == null) {}
    do
    {
      for (;;)
      {
        return paramList;
        try
        {
          paramString = a.a(paramString);
          if (paramString.a != null)
          {
            paramString = Arrays.asList(paramString.a);
            return paramString;
          }
        }
        catch (l paramString) {}
      }
    } while (!Log.isLoggable("SafeDataBufferRef", 6));
    Log.e("SafeDataBufferRef", "Cannot parse byte[]", paramString);
    return paramList;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */