package com.appsee;

import c.a.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class he
{
  private String A;
  private Throwable B;
  private String G;
  private List<ri> l;
  
  public he(int paramInt)
  {
    C(paramInt, null, null, false);
  }
  
  public he(Throwable paramThrowable)
  {
    C(paramThrowable.getClass().getName(), paramThrowable.getMessage(), paramThrowable, true);
  }
  
  public String C()
  {
    return this.A;
  }
  
  public Throwable C()
  {
    return this.B;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(mb.C("\020~4b"), this.G);
    localJSONObject.put(sb.C("\016\0130\035\"\t&"), this.A);
    Object localObject2 = mb.C("M%q%B<d!w0n+i");
    if (this.B == null) {}
    for (Object localObject1 = null;; localObject1 = C(this.B))
    {
      localJSONObject.put((String)localObject2, localObject1);
      localJSONObject.put(sb.C("!!:&\0357 \"\003&"), a.a());
      localObject1 = new JSONArray();
      localObject2 = this.l.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((JSONArray)localObject1).put(((ri)((Iterator)localObject2).next()).C());
      }
    }
    localJSONObject.put(mb.C("S,u!f t"), localObject1);
    return localJSONObject;
  }
  
  public void C(String paramString)
  {
    this.G = paramString;
  }
  
  public void C(Throwable paramThrowable)
  {
    this.B = paramThrowable;
  }
  
  public String H()
  {
    return this.G;
  }
  
  public void H(String paramString)
  {
    this.A = paramString;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */