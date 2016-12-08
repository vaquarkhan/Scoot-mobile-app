package com.appsee;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

class ye
{
  private static ye E;
  private boolean A;
  private int AA;
  private double B;
  private JSONArray BA;
  private int C;
  private boolean D;
  private boolean EA;
  private boolean F;
  private int G;
  private long GA;
  private boolean H;
  private String I;
  private boolean J;
  private final long K;
  private String L;
  private boolean LA;
  private boolean M;
  private int N;
  private boolean O;
  private boolean P;
  private boolean Q;
  private boolean R;
  private boolean S;
  private boolean T;
  private boolean U;
  private boolean V;
  private boolean W;
  private ro X;
  private int Y;
  private boolean Z;
  private boolean a;
  private long aA;
  private boolean b;
  private List<m> bA;
  private boolean c;
  private boolean cA;
  private double d;
  private boolean e;
  private boolean f;
  private List<nc> g;
  private boolean h;
  private boolean hA;
  private int i;
  private boolean iA;
  private boolean j;
  private int k;
  private boolean l;
  private boolean m;
  private boolean n;
  private String o;
  private String p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  private int u;
  private List<String> v;
  private int w;
  private boolean x;
  private boolean y;
  private boolean z;
  
  public static ye C()
  {
    try
    {
      if (E == null) {
        E = new ye();
      }
      ye localye = E;
      return localye;
    }
    finally {}
  }
  
  public int A()
  {
    return this.k;
  }
  
  public String A()
  {
    return this.L;
  }
  
  public void A(int paramInt)
  {
    this.G = paramInt;
  }
  
  public void A(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public boolean A()
  {
    return this.l;
  }
  
  public void B(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public boolean B()
  {
    return this.F;
  }
  
  public double C()
  {
    return this.d;
  }
  
  public int C()
  {
    return this.G;
  }
  
  public long C()
  {
    return this.aA;
  }
  
  public ro C()
  {
    return this.X;
  }
  
  public Boolean C()
  {
    return Boolean.valueOf(this.W);
  }
  
  public String C()
  {
    String str = UUID.randomUUID().toString().replace(kl.C("j"), "");
    vd.C(2, mb.C("\007h*a-`\026b5r!t0N 'y'at"), new Object[] { str });
    return str;
  }
  
  public EnumSet<xo> C()
  {
    return xo.C(this.GA);
  }
  
  public List<String> C()
  {
    if ((H() == null) || (H().isEmpty())) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = H().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.startsWith(kl.C("@,Z7"))) {
        localArrayList.add(str.split(mb.C("="))[1]);
      }
    }
    return localArrayList;
  }
  
  public JSONArray C()
  {
    return this.BA;
  }
  
  public void C(double paramDouble)
  {
    this.d = paramDouble;
  }
  
  public void C(int paramInt)
  {
    this.w = paramInt;
  }
  
  public void C(ro paramro)
  {
    this.X = paramro;
  }
  
  public void C(String paramString)
  {
    this.I = paramString;
  }
  
  public void C(JSONArray paramJSONArray)
  {
    this.g = new ArrayList();
    if (paramJSONArray == null) {}
    for (;;)
    {
      return;
      int i1 = 0;
      for (int i2 = 0; i1 < paramJSONArray.length(); i2 = i1)
      {
        JSONObject localJSONObject = paramJSONArray.optJSONObject(i2);
        if (localJSONObject != null) {
          this.g.add(new nc(localJSONObject.optString(mb.C("\027d6b!i")), localJSONObject.optString(kl.C("r$G.\\)z#")), localJSONObject.optJSONArray(mb.C("\ff7o!t"))));
        }
        i1 = i2 + 1;
      }
    }
  }
  
  public void C(JSONObject paramJSONObject)
  {
    a(paramJSONObject.optString(mb.C("T!t7n+i\rc")));
    C(paramJSONObject.optString(kl.C("p+Z\"]3z#")));
    y(paramJSONObject.optBoolean(mb.C("U!d+u Q-c!h")));
    l(paramJSONObject.optBoolean(kl.C("\025V$\\5W\023V4G\021Z#V(")));
    O(paramJSONObject.optBoolean(mb.C("\026b'h6c\tb0f f0f")));
    L(paramJSONObject.optBoolean(kl.C("f7_(R#|)d.u.|)_>")));
    a(paramJSONObject.optInt(mb.C("\tf<Q-c!h\bb*`0o")));
    i(paramJSONObject.optInt(kl.C("e.W\"\\\005Z3A&G\"")));
    H(paramJSONObject.optInt(mb.C("\022n b+A\024T")));
    H(paramJSONObject.optInt(kl.C("e.W\"\\\020Z#G/")));
    A(paramJSONObject.optInt(mb.C("Q-c!h\fb-`,s")));
    G(paramJSONObject.optBoolean(kl.C("{.W\"`\"]4Z3Z1V\021Z\"D4")));
    h(paramJSONObject.optBoolean(mb.C("O-c!N*w1s")));
    a(paramJSONObject.optJSONArray(kl.C("{.W\"p(^7\\)V)G4")));
    F(paramJSONObject.optBoolean(mb.C("U!d+u F1c-h")));
    H(paramJSONObject.optString(kl.C("r2W.\\\t\\3Z!Z$R3Z(]\nV4@&T\"")));
    C(paramJSONObject.optBoolean(mb.C("F1s+C!s!d0T'u!b*t")));
    E(paramJSONObject.optBoolean(kl.C("w\"G\"P3t\"@3F5V4")));
    k(paramJSONObject.optBoolean(mb.C("C!s!d0F's-h*t")));
    a(paramJSONObject.optBoolean(kl.C("w\"G\"P3c(C2C4")));
    M(paramJSONObject.optBoolean(mb.C("C!s!d0D6f7o!t")));
    t(paramJSONObject.optBoolean(kl.C("f7_(R#e.W\"\\\b]\004A&@/")));
    i(paramJSONObject.optBoolean(mb.C("R4k+f S+r'o\001q!i0t")));
    H(paramJSONObject.optJSONArray(kl.C("\004\\)W.G.\\)@\nV3")));
    C(paramJSONObject.optJSONArray(mb.C("\tn7t-i#D+i0u+k\rj%`!t")));
    n(paramJSONObject.optBoolean(kl.C("g&X\"`$A\"V)@/\\3@\020[\"]\023\\2P/r$G.E\"")));
    D(paramJSONObject.optBoolean(mb.C("R4k+f F4w\rd+i")));
    C(paramJSONObject.optInt(kl.C("~&K\002E\"]3c5\\7V5G.V4")));
    x(paramJSONObject.optBoolean(mb.C("T/n4T!i7n0n2b\022n7n&n(n0~\020b7s")));
    j(paramJSONObject.optBoolean(kl.C("|+W\017Z3g\"@3")));
    Y(paramJSONObject.optBoolean(mb.C("\r`*h6b\021i6b7w+i7n2b\021i'k-d/f&k!t")));
    b(paramJSONObject.optBoolean(kl.C("f7_(R#q\"]$[*R5X4")));
    s(paramJSONObject.optBoolean(mb.C("N#i+u!A(f#T!d1u!P-i h3t")));
    q(paramJSONObject.optBoolean(kl.C("g&X\"`$A\"V)@/\\3@\020[\"]\006].^&G.] ")));
    e(paramJSONObject.optBoolean(mb.C("S%l!T'u!b*t,h0t\023o!i\026n4w(n*`")));
    B(paramJSONObject.optBoolean(kl.C("\003Z4R%_\"r4J)P\002]$\\#V5")));
    I(paramJSONObject.optBoolean(mb.C("\000n7f&k!F7~*d\001i'h b6U!t!s")));
    g(paramJSONObject.optBoolean(kl.C("\003Z4R%_\"r7C\001A&^\"@\003V3V$G.\\)")));
    S(paramJSONObject.optBoolean(mb.C("\001i%e(b\027b*t-s-q!B<s6f\024f7t")));
    H(paramJSONObject.optLong(kl.C("w\"Q2T\001_&T4")));
    m(paramJSONObject.optBoolean(mb.C("\000n7f&k!E+r*c-i#E+\027b*t-s-q-s=B*o%i'b)b*s")));
    J(paramJSONObject.optBoolean(kl.C("f4V\004\\*C5V4@.\\)"), true));
    D(paramJSONObject.optInt(mb.C("R4k+f U!s6~\005s0b)w0t"), 3));
    W(paramJSONObject.optBoolean(kl.C("e&_.W&G\"~\"G&W&G&y4\\)"), false));
    C(paramJSONObject.optLong(mb.C("D,r*l\027n>b"), 102400L));
    J(paramJSONObject.optInt(kl.C("f7_(R#a\"G5J\024_\"V7g.^\""), 0));
    c(paramJSONObject.optBoolean(mb.C("\021w(h%c\bh#A-u7s"), false));
    f(paramJSONObject.optBoolean(kl.C("\022C+\\&W\nV3R#R3R\bA#V5V#"), true));
    Q(paramJSONObject.optBoolean(mb.C("C-t%e(b\017b=e+f6c\fh+l\026b'h2b6~"), false));
    H(paramJSONObject.optBoolean(kl.C("`\"]#~\"G&W&G&f7_(R#v5A(A4"), false));
    if (paramJSONObject.has(mb.C("\tf<C-u!d0h6~\027n>b"))) {
      h(paramJSONObject.getInt(kl.C("~&K\003Z5V$G(A>`.I\"")));
    }
    if (paramJSONObject.has(mb.C("\007k-b*s\bh#t\021w(h%c\024h(n'~"))) {
      C(ro.values()[paramJSONObject.getInt(kl.C("p+Z\"]3(T4f7_(R#c(_.P>"))]);
    }
    if (paramJSONObject.has(mb.C("\ri7s%k(P-i h3D%k(e%d/t"))) {
      A(paramJSONObject.getBoolean(kl.C("z)@3R+_\020Z)W(D\004R+_%R$X4")));
    }
    if (paramJSONObject.has(mb.C("N*t0f(k\tb*r\020h1d,K-t0b*b6t"))) {
      K(paramJSONObject.getBoolean(kl.C("\016]4G&_+~\"]2g(F$[\013Z4G\"]\"A4")));
    }
    if (paramJSONObject.has(mb.C("\ri7s%k(L!~&h%u O+h/t"))) {
      R(paramJSONObject.getBoolean(kl.C("z)@3R+_\fV>Q(R5W\017\\(X4")));
    }
    if (paramJSONObject.has(mb.C("T1w4h6s!c\001i'h b6t"))) {
      H(paramJSONObject.getJSONObject(kl.C("\024F7C(A3V#v)P(W\"A4")));
    }
    if (paramJSONObject.has(mb.C("\021t!^\022R"))) {
      d(paramJSONObject.getBoolean(kl.C("f4V\036e\022")));
    }
    if (paramJSONObject.has(mb.C("\000b0b's\0010b6i%k\027C\017t"))) {
      dl.C().C(paramJSONObject.optJSONArray(kl.C("w\"G\"P3v?G\"A)R+`\003x4")));
    }
    gb.H();
  }
  
  public void C(boolean paramBoolean)
  {
    this.R = paramBoolean;
  }
  
  public boolean C()
  {
    return this.P;
  }
  
  public int D()
  {
    return this.AA;
  }
  
  public void D(boolean paramBoolean)
  {
    this.cA = paramBoolean;
  }
  
  public boolean D()
  {
    return this.Q;
  }
  
  public void E(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public boolean E()
  {
    return this.t;
  }
  
  public void F(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public boolean F()
  {
    return this.J;
  }
  
  public void G(boolean paramBoolean)
  {
    this.LA = paramBoolean;
  }
  
  public boolean G()
  {
    return this.h;
  }
  
  public double H()
  {
    return this.i;
  }
  
  public int H()
  {
    return this.w;
  }
  
  public String H()
  {
    return this.p;
  }
  
  public List<String> H()
  {
    return this.v;
  }
  
  public void H(double paramDouble)
  {
    this.B = paramDouble;
  }
  
  public void H(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void H(long paramLong)
  {
    this.GA = paramLong;
  }
  
  public void H(String paramString)
  {
    this.p = paramString;
  }
  
  public void H(JSONArray paramJSONArray)
  {
    this.BA = paramJSONArray;
  }
  
  public void H(JSONObject paramJSONObject)
  {
    this.bA = new ArrayList();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      m localm = new m();
      localm.l = ((String)localIterator.next());
      localm.A = Integer.valueOf(paramJSONObject.getInt(localm.l));
      this.bA.add(localm);
    }
  }
  
  public boolean H()
  {
    return this.hA;
  }
  
  public void I(boolean paramBoolean)
  {
    this.Q = paramBoolean;
  }
  
  public boolean I()
  {
    return this.U;
  }
  
  public int J()
  {
    return this.u;
  }
  
  public boolean J()
  {
    return this.b;
  }
  
  public int K()
  {
    return this.C;
  }
  
  public String K()
  {
    return this.I;
  }
  
  public List<nc> K()
  {
    return this.g;
  }
  
  public void K(int paramInt)
  {
    this.N = paramInt;
  }
  
  public void K(String paramString)
  {
    this.L = paramString;
  }
  
  public void K(boolean paramBoolean)
  {
    this.hA = paramBoolean;
  }
  
  public boolean K()
  {
    return this.V;
  }
  
  public void L(boolean paramBoolean)
  {
    this.M = paramBoolean;
  }
  
  public boolean L()
  {
    return this.c;
  }
  
  public void M(boolean paramBoolean)
  {
    this.F = paramBoolean;
  }
  
  public boolean M()
  {
    return this.R;
  }
  
  public void O(boolean paramBoolean)
  {
    this.S = paramBoolean;
  }
  
  public boolean O()
  {
    return this.S;
  }
  
  public boolean Q()
  {
    return this.T;
  }
  
  public void R(boolean paramBoolean)
  {
    this.V = paramBoolean;
  }
  
  public boolean R()
  {
    return this.q;
  }
  
  public void S(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  public boolean W()
  {
    return this.D;
  }
  
  public void Y(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
  
  public boolean Y()
  {
    return this.r;
  }
  
  public double a()
  {
    return this.B;
  }
  
  public int a()
  {
    return this.Y;
  }
  
  public String a()
  {
    return this.o;
  }
  
  public List<m> a()
  {
    if (this.bA == null) {
      return new ArrayList();
    }
    return this.bA;
  }
  
  public void a(int paramInt)
  {
    this.C = paramInt;
  }
  
  public void a(String paramString)
  {
    this.o = paramString;
  }
  
  public void a(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {}
    for (;;)
    {
      return;
      this.v = new ArrayList();
      int i2 = 0;
      for (int i1 = 0; i2 < paramJSONArray.length(); i1 = i2)
      {
        List localList = this.v;
        i2 = i1 + 1;
        localList.add(paramJSONArray.optString(i1));
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.H = paramBoolean;
  }
  
  public boolean a()
  {
    return this.x;
  }
  
  public void b(boolean paramBoolean)
  {
    this.P = paramBoolean;
  }
  
  public boolean b()
  {
    return this.O;
  }
  
  public boolean c()
  {
    return this.A;
  }
  
  public void d(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  
  public boolean d()
  {
    return this.cA;
  }
  
  public void e(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public boolean e()
  {
    return this.m;
  }
  
  public boolean f()
  {
    return this.Z;
  }
  
  public void g(boolean paramBoolean)
  {
    this.Z = paramBoolean;
  }
  
  public boolean g()
  {
    return this.iA;
  }
  
  public int h()
  {
    return this.N;
  }
  
  public void h(int paramInt)
  {
    this.AA = paramInt;
  }
  
  public void h(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public boolean h()
  {
    return this.H;
  }
  
  public void i(int paramInt)
  {
    this.Y = paramInt;
  }
  
  public void i(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean i()
  {
    return this.n;
  }
  
  public void j(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  
  public boolean j()
  {
    return this.e;
  }
  
  public void k(boolean paramBoolean)
  {
    this.iA = paramBoolean;
  }
  
  public boolean k()
  {
    return this.M;
  }
  
  public void l(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public boolean l()
  {
    return this.j;
  }
  
  public void m(boolean paramBoolean)
  {
    this.EA = paramBoolean;
  }
  
  public boolean m()
  {
    return this.f;
  }
  
  public void n(boolean paramBoolean)
  {
    this.T = paramBoolean;
  }
  
  public boolean n()
  {
    return this.LA;
  }
  
  public void q(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  public boolean q()
  {
    return this.EA;
  }
  
  public void s(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  public boolean s()
  {
    return this.s;
  }
  
  public void t(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public boolean t()
  {
    return this.a;
  }
  
  public void x(boolean paramBoolean)
  {
    this.D = paramBoolean;
  }
  
  public boolean x()
  {
    return this.y;
  }
  
  public void y(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  public boolean y()
  {
    return this.z;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */