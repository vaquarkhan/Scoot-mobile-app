package e.a;

import java.nio.ByteBuffer;
import java.util.List;

public class ce
  extends br
{
  public static final cf a = new cf();
  
  public ce()
  {
    this(new aw(a()));
  }
  
  public ce(aw paramaw)
  {
    super(paramaw);
    this.d = a;
  }
  
  public ce(cg... paramVarArgs)
  {
    this();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      cg localcg = paramVarArgs[i];
      this.c.add(localcg);
      i += 1;
    }
  }
  
  public static String a()
  {
    return "stsd";
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(0);
    paramByteBuffer.putInt(this.c.size());
    super.a(paramByteBuffer);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */