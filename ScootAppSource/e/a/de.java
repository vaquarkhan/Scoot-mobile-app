package e.a;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class de
{
  static Set<Class> a = new HashSet();
  
  static
  {
    a.add(String.class);
    a.add(Byte.class);
    a.add(Short.class);
    a.add(Integer.class);
    a.add(Long.class);
    a.add(Float.class);
    a.add(Double.class);
    a.add(Character.class);
  }
  
  public static void a(Object paramObject, StringBuilder paramStringBuilder, String... paramVarArgs)
  {
    int i = 0;
    paramStringBuilder.append("{\n");
    HashSet localHashSet = new HashSet(Arrays.asList(paramVarArgs));
    Method[] arrayOfMethod = paramObject.getClass().getMethods();
    int j = arrayOfMethod.length;
    if (i < j)
    {
      Object localObject = arrayOfMethod[i];
      if (!a((Method)localObject)) {}
      for (;;)
      {
        i += 1;
        break;
        try
        {
          String str = b((Method)localObject);
          if ((paramVarArgs.length <= 0) || (localHashSet.contains(str)))
          {
            localObject = ((Method)localObject).invoke(paramObject, new Object[0]);
            if ((localObject.getClass().isPrimitive()) || (a.contains(localObject.getClass())) || ((localObject instanceof Iterable)))
            {
              paramStringBuilder.append(str + ": ");
              a(paramStringBuilder, localObject);
              paramStringBuilder.append(",\n");
            }
          }
        }
        catch (Exception localException) {}
      }
    }
    paramStringBuilder.append("}");
  }
  
  private static void a(StringBuilder paramStringBuilder, Object paramObject)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("null");
      return;
    }
    if (paramObject == String.class)
    {
      paramStringBuilder.append("'");
      paramStringBuilder.append((String)paramObject);
      paramStringBuilder.append("'");
      return;
    }
    if ((paramObject instanceof Iterable))
    {
      paramObject = ((Iterable)paramObject).iterator();
      paramStringBuilder.append("[");
      while (((Iterator)paramObject).hasNext())
      {
        a(((Iterator)paramObject).next(), paramStringBuilder, new String[0]);
        if (((Iterator)paramObject).hasNext()) {
          paramStringBuilder.append(",");
        }
      }
      paramStringBuilder.append("]");
      return;
    }
    paramStringBuilder.append(String.valueOf(paramObject));
  }
  
  public static boolean a(Method paramMethod)
  {
    if (!paramMethod.getName().startsWith("get")) {}
    while ((paramMethod.getParameterTypes().length != 0) || (Void.TYPE.equals(paramMethod.getReturnType()))) {
      return false;
    }
    return true;
  }
  
  private static String b(Method paramMethod)
  {
    paramMethod = paramMethod.getName().substring(3);
    return paramMethod.substring(0, 1).toLowerCase() + paramMethod.substring(1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */