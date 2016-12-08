package com.google.android.gms.common.a;

public final class l
{
  private static int a(StackTraceElement[] paramArrayOfStackTraceElement1, StackTraceElement[] paramArrayOfStackTraceElement2)
  {
    int i = 0;
    int j = paramArrayOfStackTraceElement2.length;
    int k = paramArrayOfStackTraceElement1.length;
    for (;;)
    {
      k -= 1;
      if (k < 0) {
        break;
      }
      j -= 1;
      if ((j < 0) || (!paramArrayOfStackTraceElement2[j].equals(paramArrayOfStackTraceElement1[k]))) {
        break;
      }
      i += 1;
    }
    return i;
  }
  
  public static String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Throwable localThrowable = new Throwable();
    Object localObject1 = localThrowable.getStackTrace();
    localStringBuilder.append("Async stack trace:");
    int j = localObject1.length;
    int i = 0;
    Object localObject2;
    while (i < j)
    {
      localObject2 = localObject1[i];
      localStringBuilder.append("\n\tat ").append(localObject2);
      i += 1;
    }
    localThrowable = localThrowable.getCause();
    while (localThrowable != null)
    {
      localStringBuilder.append("\nCaused by: ");
      localStringBuilder.append(localThrowable);
      localObject2 = localThrowable.getStackTrace();
      j = a((StackTraceElement[])localObject2, (StackTraceElement[])localObject1);
      i = 0;
      while (i < localObject2.length - j)
      {
        localObject1 = String.valueOf(localObject2[i]);
        localStringBuilder.append(String.valueOf(localObject1).length() + 5 + "\n\tat " + (String)localObject1);
        i += 1;
      }
      if (j > 0) {
        localStringBuilder.append(22 + "\n\t... " + j + " more");
      }
      localThrowable = localThrowable.getCause();
      localObject1 = localObject2;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */