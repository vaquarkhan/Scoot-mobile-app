package e.a;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public class ah
  extends aq
{
  private List<ag> d;
  
  public ah()
  {
    this(new aw(a()));
  }
  
  public ah(aw paramaw)
  {
    super(paramaw);
  }
  
  public ah(List<ag> paramList)
  {
    this();
    this.d = paramList;
  }
  
  public static String a()
  {
    return "elst";
  }
  
  protected void a(StringBuilder paramStringBuilder)
  {
    super.a(paramStringBuilder);
    paramStringBuilder.append(": ");
    de.a(this, paramStringBuilder, new String[] { "edits" });
  }
  
  protected void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    paramByteBuffer.putInt(this.d.size());
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      ag localag = (ag)localIterator.next();
      paramByteBuffer.putInt((int)localag.a());
      paramByteBuffer.putInt((int)localag.b());
      paramByteBuffer.putInt((int)(localag.c() * 65536.0F));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */