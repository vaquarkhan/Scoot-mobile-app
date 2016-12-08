package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class PasswordSpecification
  extends AbstractSafeParcelable
{
  public static final j CREATOR = new j();
  public static final PasswordSpecification a = new d().a(12, 16).a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").a("abcdefghijkmnopqrstxyz", 1).a("ABCDEFGHJKLMNPQRSTXY", 1).a("3456789", 1).a();
  public static final PasswordSpecification b = new d().a(12, 16).a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").a("abcdefghijklmnopqrstuvwxyz", 1).a("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).a("1234567890", 1).a();
  final int c;
  final String d;
  final List<String> e;
  final List<Integer> f;
  final int g;
  final int h;
  private final int[] i;
  private final Random j;
  
  PasswordSpecification(int paramInt1, String paramString, List<String> paramList, List<Integer> paramList1, int paramInt2, int paramInt3)
  {
    this.c = paramInt1;
    this.d = paramString;
    this.e = Collections.unmodifiableList(paramList);
    this.f = Collections.unmodifiableList(paramList1);
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = a();
    this.j = new SecureRandom();
  }
  
  private int a(char paramChar)
  {
    return paramChar - ' ';
  }
  
  private int[] a()
  {
    int[] arrayOfInt = new int[95];
    Arrays.fill(arrayOfInt, -1);
    Iterator localIterator = this.e.iterator();
    int k = 0;
    while (localIterator.hasNext())
    {
      char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
      int n = arrayOfChar.length;
      int m = 0;
      while (m < n)
      {
        arrayOfInt[a(arrayOfChar[m])] = k;
        m += 1;
      }
      k += 1;
    }
    return arrayOfInt;
  }
  
  private static String b(Collection<Character> paramCollection)
  {
    char[] arrayOfChar = new char[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    int k = 0;
    while (paramCollection.hasNext())
    {
      arrayOfChar[k] = ((Character)paramCollection.next()).charValue();
      k += 1;
    }
    return new String(arrayOfChar);
  }
  
  private static boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt1 < paramInt2) || (paramInt1 > paramInt3);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\PasswordSpecification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */