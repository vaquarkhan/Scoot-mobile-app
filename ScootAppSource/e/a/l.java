package e.a;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public abstract class l
{
  protected aw b;
  
  public l(aw paramaw)
  {
    this.b = paramaw;
  }
  
  public static <T> T a(br parambr, Class<T> paramClass, String... paramVarArgs)
  {
    parambr = (Object[])a(parambr, paramClass, paramVarArgs);
    if (parambr.length > 0) {
      return parambr[0];
    }
    return null;
  }
  
  private static void a(l paraml, List<String> paramList, Collection<l> paramCollection)
  {
    if (paramList.size() > 0)
    {
      String str = (String)paramList.remove(0);
      if ((paraml instanceof br))
      {
        paraml = ((br)paraml).b().iterator();
        while (paraml.hasNext())
        {
          l locall = (l)paraml.next();
          if ((str == null) || (str.equals(locall.b.b()))) {
            a(locall, paramList, paramCollection);
          }
        }
      }
      paramList.add(0, str);
      return;
    }
    paramCollection.add(paraml);
  }
  
  public static <T> T[] a(l paraml, Class<T> paramClass, String... paramVarArgs)
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      localLinkedList2.add(paramVarArgs[i]);
      i += 1;
    }
    a(paraml, localLinkedList2, localLinkedList1);
    return localLinkedList1.toArray((Object[])Array.newInstance(paramClass, 0));
  }
  
  protected void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("'" + this.b.b() + "'");
  }
  
  protected abstract void a(ByteBuffer paramByteBuffer);
  
  public void b(ByteBuffer paramByteBuffer)
  {
    ByteBuffer localByteBuffer = paramByteBuffer.duplicate();
    bp.b(paramByteBuffer, 8);
    a(paramByteBuffer);
    this.b.a(paramByteBuffer.position() - localByteBuffer.position() - 8);
    Assert.assertEquals(this.b.a(), 8L);
    this.b.a(localByteBuffer);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder);
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */