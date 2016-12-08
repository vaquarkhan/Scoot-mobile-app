package e.a;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class an
  extends l
{
  private String a;
  private int c;
  private Collection<String> d = new LinkedList();
  
  public an()
  {
    super(new aw(a()));
  }
  
  public an(String paramString, int paramInt, Collection<String> paramCollection)
  {
    super(new aw(a()));
    this.a = paramString;
    this.c = paramInt;
    this.d = paramCollection;
  }
  
  public static String a()
  {
    return "ftyp";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put(az.a(this.a));
    paramByteBuffer.putInt(this.c);
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      paramByteBuffer.put(az.a((String)localIterator.next()));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */