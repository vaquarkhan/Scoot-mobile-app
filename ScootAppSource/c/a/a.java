package c.a;

public class a
{
  public static String a()
  {
    Object localObject1 = Thread.currentThread().getStackTrace();
    int i;
    if (localObject1 != null)
    {
      i = 0;
      if (i < localObject1.length)
      {
        Object localObject2 = localObject1[i];
        if ((((StackTraceElement)localObject2).getClassName().equalsIgnoreCase(Thread.class.getName())) && (((StackTraceElement)localObject2).getMethodName().equalsIgnoreCase("getStackTrace")) && (i + 1 < localObject1.length))
        {
          localObject1 = localObject1[(i + 1)];
          if (localObject1 == null) {
            break label114;
          }
        }
      }
    }
    label114:
    for (localObject1 = ((StackTraceElement)localObject1).getMethodName();; localObject1 = null)
    {
      if (localObject1 == null)
      {
        return null;
        i += 1;
        break;
      }
      return a.class.getName() + "." + (String)localObject1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */