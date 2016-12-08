package com.google.android.gms.location;

import java.util.Comparator;

final class b
  implements Comparator<DetectedActivity>
{
  public int a(DetectedActivity paramDetectedActivity1, DetectedActivity paramDetectedActivity2)
  {
    int j = Integer.valueOf(paramDetectedActivity2.b()).compareTo(Integer.valueOf(paramDetectedActivity1.b()));
    int i = j;
    if (j == 0) {
      i = Integer.valueOf(paramDetectedActivity1.a()).compareTo(Integer.valueOf(paramDetectedActivity2.a()));
    }
    return i;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */