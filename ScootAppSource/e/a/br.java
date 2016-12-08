package e.a;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class br
  extends l
{
  protected List<l> c = new LinkedList();
  protected m d = m.a();
  
  public br(aw paramaw)
  {
    super(paramaw);
  }
  
  public void a(bm parambm)
  {
    this.c.add(0, parambm);
  }
  
  public void a(l paraml)
  {
    this.c.add(paraml);
  }
  
  public void a(StringBuilder paramStringBuilder)
  {
    super.a(paramStringBuilder);
    paramStringBuilder.append(": {\n");
    b(paramStringBuilder);
    paramStringBuilder.append("\n}");
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((l)localIterator.next()).b(paramByteBuffer);
    }
  }
  
  public List<l> b()
  {
    return this.c;
  }
  
  protected void b(StringBuilder paramStringBuilder)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      ((l)localIterator.next()).a(localStringBuilder);
      if (localIterator.hasNext()) {
        localStringBuilder.append(",\n");
      }
    }
    paramStringBuilder.append(localStringBuilder.toString().replaceAll("([^\n]*)\n", "  $1\n"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */