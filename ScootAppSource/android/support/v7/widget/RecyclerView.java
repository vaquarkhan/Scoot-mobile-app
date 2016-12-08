package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.e.i;
import android.support.v4.view.a.a;
import android.support.v4.view.bf;
import android.support.v4.view.bo;
import android.support.v4.view.bp;
import android.support.v4.view.bu;
import android.support.v4.view.bw;
import android.support.v4.view.cb;
import android.support.v4.view.db;
import android.support.v4.widget.ah;
import android.support.v7.recyclerview.R.styleable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView
  extends ViewGroup
  implements bo, bu
{
  static final boolean a;
  private static final Interpolator aq;
  private static final int[] k = { 16843830 };
  private static final boolean l;
  private static final Class<?>[] m;
  private int A = 0;
  private boolean B;
  private boolean C;
  private boolean D;
  private int E;
  private boolean F;
  private final boolean G;
  private final AccessibilityManager H;
  private List<eq> I;
  private boolean J = false;
  private int K = 0;
  private ah L;
  private ah M;
  private ah N;
  private ah O;
  private int P = 0;
  private int Q = -1;
  private VelocityTracker R;
  private int S;
  private int T;
  private int U;
  private int V;
  private int W;
  private final int aa;
  private final int ab;
  private float ac = Float.MIN_VALUE;
  private final fc ad = new fc(this);
  private es ae;
  private List<es> af;
  private ej ag = new el(this, null);
  private boolean ah = false;
  private fe ai;
  private eg aj;
  private final int[] ak = new int[2];
  private bp al;
  private final int[] am = new int[2];
  private final int[] an = new int[2];
  private final int[] ao = new int[2];
  private Runnable ap = new dy(this);
  private final ha ar = new ea(this);
  final eu b = new eu(this);
  ai c;
  by d;
  final gy e = new gy();
  en f;
  eh g = new ce();
  final fa h = new fa();
  boolean i = false;
  boolean j = false;
  private final ew n = new ew(this, null);
  private RecyclerView.SavedState o;
  private boolean p;
  private final Runnable q = new dx(this);
  private final Rect r = new Rect();
  private ed s;
  private ev t;
  private final ArrayList<em> u = new ArrayList();
  private final ArrayList<er> v = new ArrayList();
  private er w;
  private boolean x;
  private boolean y;
  private boolean z;
  
  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20))
    {
      bool = true;
      l = bool;
      if (Build.VERSION.SDK_INT < 23) {
        break label100;
      }
    }
    label100:
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      m = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
      aq = new dz();
      return;
      bool = false;
      break;
    }
  }
  
  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 16)
    {
      bool1 = true;
      this.G = bool1;
      localObject = ViewConfiguration.get(paramContext);
      this.W = ((ViewConfiguration)localObject).getScaledTouchSlop();
      this.aa = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
      this.ab = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
      if (cb.a(this) != 2) {
        break label466;
      }
    }
    label466:
    for (boolean bool1 = true;; bool1 = false)
    {
      setWillNotDraw(bool1);
      this.g.a(this.ag);
      a();
      s();
      if (cb.e(this) == 0) {
        cb.c(this, 1);
      }
      this.H = ((AccessibilityManager)getContext().getSystemService("accessibility"));
      setAccessibilityDelegateCompat(new fe(this));
      bool1 = bool2;
      if (paramAttributeSet != null)
      {
        localObject = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RecyclerView, paramInt, 0);
        String str = ((TypedArray)localObject).getString(R.styleable.RecyclerView_layoutManager);
        ((TypedArray)localObject).recycle();
        a(paramContext, str, paramAttributeSet, paramInt, 0);
        bool1 = bool2;
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, k, paramInt, 0);
          bool1 = paramContext.getBoolean(0, true);
          paramContext.recycle();
        }
      }
      setNestedScrollingEnabled(bool1);
      return;
      bool1 = false;
      break;
    }
  }
  
  private void A()
  {
    this.K -= 1;
    if (this.K < 1)
    {
      this.K = 0;
      B();
    }
  }
  
  private void B()
  {
    int i1 = this.E;
    this.E = 0;
    if ((i1 != 0) && (i()))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
      localAccessibilityEvent.setEventType(2048);
      a.a(localAccessibilityEvent, i1);
      sendAccessibilityEventUnchecked(localAccessibilityEvent);
    }
  }
  
  private void C()
  {
    if ((!this.ah) && (this.x))
    {
      cb.a(this, this.ap);
      this.ah = true;
    }
  }
  
  private boolean D()
  {
    return (this.g != null) && (this.f.b());
  }
  
  private void E()
  {
    boolean bool2 = true;
    if (this.J)
    {
      this.c.a();
      o();
      this.f.a(this);
    }
    int i1;
    label58:
    fa localfa;
    if (D())
    {
      this.c.b();
      if ((!this.i) && (!this.j)) {
        break label179;
      }
      i1 = 1;
      localfa = this.h;
      if ((!this.z) || (this.g == null) || ((!this.J) && (i1 == 0) && (!en.b(this.f))) || ((this.J) && (!this.s.b()))) {
        break label184;
      }
      bool1 = true;
      label118:
      fa.d(localfa, bool1);
      localfa = this.h;
      if ((!fa.c(this.h)) || (i1 == 0) || (this.J) || (!D())) {
        break label189;
      }
    }
    label179:
    label184:
    label189:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      fa.e(localfa, bool1);
      return;
      this.c.e();
      break;
      i1 = 0;
      break label58;
      bool1 = false;
      break label118;
    }
  }
  
  private void F()
  {
    boolean bool = true;
    this.h.a(1);
    fa.b(this.h, false);
    b();
    this.e.a();
    z();
    E();
    Object localObject = this.h;
    int i2;
    int i1;
    if ((fa.c(this.h)) && (this.j))
    {
      fa.f((fa)localObject, bool);
      this.j = false;
      this.i = false;
      fa.c(this.h, fa.b(this.h));
      this.h.a = this.s.a();
      a(this.ak);
      if (!fa.c(this.h)) {
        break label294;
      }
      i2 = this.d.b();
      i1 = 0;
      label137:
      if (i1 >= i2) {
        break label294;
      }
      localObject = c(this.d.b(i1));
      if ((!((fd)localObject).c()) && ((!((fd)localObject).n()) || (this.s.b()))) {
        break label194;
      }
    }
    label194:
    ek localek;
    for (;;)
    {
      i1 += 1;
      break label137;
      bool = false;
      break;
      localek = this.g.a(this.h, (fd)localObject, eh.d((fd)localObject), ((fd)localObject).u());
      this.e.a((fd)localObject, localek);
      if ((fa.d(this.h)) && (((fd)localObject).x()) && (!((fd)localObject).q()) && (!((fd)localObject).c()) && (!((fd)localObject).n()))
      {
        long l1 = a((fd)localObject);
        this.e.a(l1, (fd)localObject);
      }
    }
    label294:
    if (fa.b(this.h))
    {
      m();
      bool = fa.e(this.h);
      fa.a(this.h, false);
      this.f.c(this.b, this.h);
      fa.a(this.h, bool);
      i1 = 0;
      if (i1 < this.d.b())
      {
        localObject = c(this.d.b(i1));
        if (((fd)localObject).c()) {}
        for (;;)
        {
          i1 += 1;
          break;
          if (!this.e.d((fd)localObject))
          {
            int i3 = eh.d((fd)localObject);
            bool = ((fd)localObject).a(8192);
            i2 = i3;
            if (!bool) {
              i2 = i3 | 0x1000;
            }
            localek = this.g.a(this.h, (fd)localObject, i2, ((fd)localObject).u());
            if (bool) {
              a((fd)localObject, localek);
            } else {
              this.e.b((fd)localObject, localek);
            }
          }
        }
      }
      n();
    }
    for (;;)
    {
      A();
      a(false);
      fa.b(this.h, 2);
      return;
      n();
    }
  }
  
  private void G()
  {
    b();
    z();
    this.h.a(6);
    this.c.e();
    this.h.a = this.s.a();
    fa.c(this.h, 0);
    fa.c(this.h, false);
    this.f.c(this.b, this.h);
    fa.a(this.h, false);
    this.o = null;
    fa localfa = this.h;
    if ((fa.c(this.h)) && (this.g != null)) {}
    for (boolean bool = true;; bool = false)
    {
      fa.d(localfa, bool);
      fa.b(this.h, 4);
      A();
      a(false);
      return;
    }
  }
  
  private void H()
  {
    this.h.a(4);
    b();
    z();
    fa.b(this.h, 1);
    if (fa.c(this.h))
    {
      int i1 = this.d.b() - 1;
      if (i1 >= 0)
      {
        fd localfd1 = c(this.d.b(i1));
        if (localfd1.c()) {}
        for (;;)
        {
          i1 -= 1;
          break;
          long l1 = a(localfd1);
          ek localek2 = this.g.a(this.h, localfd1);
          fd localfd2 = this.e.a(l1);
          if ((localfd2 != null) && (!localfd2.c()))
          {
            boolean bool1 = this.e.a(localfd2);
            boolean bool2 = this.e.a(localfd1);
            if ((bool1) && (localfd2 == localfd1))
            {
              this.e.c(localfd1, localek2);
            }
            else
            {
              ek localek1 = this.e.b(localfd2);
              this.e.c(localfd1, localek2);
              localek2 = this.e.c(localfd1);
              if (localek1 == null) {
                a(l1, localfd1, localfd2);
              } else {
                a(localfd2, localfd1, localek1, localek2, bool1, bool2);
              }
            }
          }
          else
          {
            this.e.c(localfd1, localek2);
          }
        }
      }
      this.e.a(this.ar);
    }
    this.f.b(this.b);
    fa.d(this.h, this.h.a);
    this.J = false;
    fa.d(this.h, false);
    fa.e(this.h, false);
    en.a(this.f, false);
    if (eu.a(this.b) != null) {
      eu.a(this.b).clear();
    }
    A();
    a(false);
    this.e.a();
    if (j(this.ak[0], this.ak[1])) {
      h(0, 0);
    }
  }
  
  private void I()
  {
    if (this.J) {
      return;
    }
    this.J = true;
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fd localfd = c(this.d.c(i1));
      if ((localfd != null) && (!localfd.c())) {
        localfd.b(512);
      }
      i1 += 1;
    }
    this.b.g();
  }
  
  private void J()
  {
    int i2 = this.d.b();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = this.d.b(i1);
      Object localObject = a(localView);
      if ((localObject != null) && (((fd)localObject).h != null))
      {
        localObject = ((fd)localObject).h.a;
        int i3 = localView.getLeft();
        int i4 = localView.getTop();
        if ((i3 != ((View)localObject).getLeft()) || (i4 != ((View)localObject).getTop())) {
          ((View)localObject).layout(i3, i4, ((View)localObject).getWidth() + i3, ((View)localObject).getHeight() + i4);
        }
      }
      i1 += 1;
    }
  }
  
  private String a(Context paramContext, String paramString)
  {
    if (paramString.charAt(0) == '.') {
      paramContext = paramContext.getPackageName() + paramString;
    }
    do
    {
      return paramContext;
      paramContext = paramString;
    } while (paramString.contains("."));
    return RecyclerView.class.getPackage().getName() + '.' + paramString;
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i2 = 1;
    int i3 = 0;
    int i1;
    if (paramFloat2 < 0.0F)
    {
      d();
      i1 = i3;
      if (this.L.a(-paramFloat2 / getWidth(), 1.0F - paramFloat3 / getHeight())) {
        i1 = 1;
      }
      if (paramFloat4 >= 0.0F) {
        break label158;
      }
      f();
      if (!this.M.a(-paramFloat4 / getHeight(), paramFloat1 / getWidth())) {
        break label196;
      }
    }
    for (;;)
    {
      if ((i2 != 0) || (paramFloat2 != 0.0F) || (paramFloat4 != 0.0F)) {
        cb.d(this);
      }
      return;
      i1 = i3;
      if (paramFloat2 <= 0.0F) {
        break;
      }
      e();
      i1 = i3;
      if (!this.N.a(paramFloat2 / getWidth(), paramFloat3 / getHeight())) {
        break;
      }
      i1 = 1;
      break;
      label158:
      if (paramFloat4 > 0.0F)
      {
        g();
        if (this.O.a(paramFloat4 / getHeight(), 1.0F - paramFloat1 / getWidth())) {}
      }
      else
      {
        label196:
        i2 = i1;
      }
    }
  }
  
  private void a(long paramLong, fd paramfd1, fd paramfd2)
  {
    int i2 = this.d.b();
    int i1 = 0;
    if (i1 < i2)
    {
      fd localfd = c(this.d.b(i1));
      if (localfd == paramfd1) {}
      while (a(localfd) != paramLong)
      {
        i1 += 1;
        break;
      }
      if ((this.s != null) && (this.s.b())) {
        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + localfd + " \n View Holder 2:" + paramfd1);
      }
      throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + localfd + " \n View Holder 2:" + paramfd1);
    }
    Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + paramfd2 + " cannot be found but it is necessary for " + paramfd1);
  }
  
  private void a(Context paramContext, String paramString, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      paramString = paramString.trim();
      if (paramString.length() != 0)
      {
        String str = a(paramContext, paramString);
        try
        {
          if (isInEditMode()) {}
          Class localClass;
          for (paramString = getClass().getClassLoader();; paramString = paramContext.getClassLoader())
          {
            localClass = paramString.loadClass(str).asSubclass(en.class);
            try
            {
              paramString = localClass.getConstructor(m);
              Object[] arrayOfObject = new Object[4];
              arrayOfObject[0] = paramContext;
              arrayOfObject[1] = paramAttributeSet;
              arrayOfObject[2] = Integer.valueOf(paramInt1);
              arrayOfObject[3] = Integer.valueOf(paramInt2);
              paramContext = arrayOfObject;
            }
            catch (NoSuchMethodException paramContext)
            {
              try
              {
                paramString = localClass.getConstructor(new Class[0]);
                paramContext = null;
              }
              catch (NoSuchMethodException paramString)
              {
                paramString.initCause(paramContext);
                throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, paramString);
              }
            }
            paramString.setAccessible(true);
            setLayoutManager((en)paramString.newInstance(paramContext));
            return;
          }
          return;
        }
        catch (ClassNotFoundException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, paramContext);
        }
        catch (InvocationTargetException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, paramContext);
        }
        catch (InstantiationException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, paramContext);
        }
        catch (IllegalAccessException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, paramContext);
        }
        catch (ClassCastException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, paramContext);
        }
      }
    }
  }
  
  private void a(ed paramed, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.s != null)
    {
      this.s.b(this.n);
      this.s.b(this);
    }
    if ((!paramBoolean1) || (paramBoolean2))
    {
      if (this.g != null) {
        this.g.c();
      }
      if (this.f != null)
      {
        this.f.c(this.b);
        this.f.b(this.b);
      }
      this.b.a();
    }
    this.c.a();
    ed localed = this.s;
    this.s = paramed;
    if (paramed != null)
    {
      paramed.a(this.n);
      paramed.a(this);
    }
    if (this.f != null) {
      this.f.a(localed, this.s);
    }
    this.b.a(localed, this.s, paramBoolean1);
    fa.a(this.h, true);
    o();
  }
  
  private void a(fd paramfd, ek paramek)
  {
    paramfd.a(0, 8192);
    if ((fa.d(this.h)) && (paramfd.x()) && (!paramfd.q()) && (!paramfd.c()))
    {
      long l1 = a(paramfd);
      this.e.a(l1, paramfd);
    }
    this.e.a(paramfd, paramek);
  }
  
  private void a(fd paramfd, ek paramek1, ek paramek2)
  {
    paramfd.a(false);
    if (this.g.b(paramfd, paramek1, paramek2)) {
      C();
    }
  }
  
  private void a(fd paramfd1, fd paramfd2, ek paramek1, ek paramek2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramfd1.a(false);
    if (paramBoolean1) {
      b(paramfd1);
    }
    if (paramfd1 != paramfd2)
    {
      if (paramBoolean2) {
        b(paramfd2);
      }
      paramfd1.g = paramfd2;
      b(paramfd1);
      this.b.d(paramfd1);
      paramfd2.a(false);
      paramfd2.h = paramfd1;
    }
    if (this.g.a(paramfd1, paramfd2, paramek1, paramek2)) {
      C();
    }
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int i6 = this.d.b();
    if (i6 == 0)
    {
      paramArrayOfInt[0] = 0;
      paramArrayOfInt[1] = 0;
      return;
    }
    int i1 = Integer.MAX_VALUE;
    int i4 = Integer.MIN_VALUE;
    int i3 = 0;
    fd localfd;
    if (i3 < i6)
    {
      localfd = c(this.d.b(i3));
      if (!localfd.c()) {}
    }
    for (;;)
    {
      i3 += 1;
      break;
      int i5 = localfd.d();
      int i2 = i1;
      if (i5 < i1) {
        i2 = i5;
      }
      if (i5 > i4)
      {
        i4 = i5;
        i1 = i2;
        continue;
        paramArrayOfInt[0] = i1;
        paramArrayOfInt[1] = i4;
      }
      else
      {
        i1 = i2;
      }
    }
  }
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    int i2 = paramMotionEvent.getAction();
    if ((i2 == 3) || (i2 == 0)) {
      this.w = null;
    }
    int i3 = this.v.size();
    int i1 = 0;
    while (i1 < i3)
    {
      er localer = (er)this.v.get(i1);
      if ((localer.a(this, paramMotionEvent)) && (i2 != 3))
      {
        this.w = localer;
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  private void b(fd paramfd)
  {
    View localView = paramfd.a;
    if (localView.getParent() == this) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.b.d(a(localView));
      if (!paramfd.r()) {
        break;
      }
      this.d.a(localView, -1, localView.getLayoutParams(), true);
      return;
    }
    if (i1 == 0)
    {
      this.d.a(localView, true);
      return;
    }
    this.d.d(localView);
  }
  
  private void b(fd paramfd, ek paramek1, ek paramek2)
  {
    b(paramfd);
    paramfd.a(false);
    if (this.g.a(paramfd, paramek1, paramek2)) {
      C();
    }
  }
  
  private boolean b(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    int i2;
    if (this.w != null)
    {
      if (i1 == 0) {
        this.w = null;
      }
    }
    else
    {
      if (i1 == 0) {
        break label108;
      }
      i2 = this.v.size();
      i1 = 0;
    }
    while (i1 < i2)
    {
      er localer = (er)this.v.get(i1);
      if (localer.a(this, paramMotionEvent))
      {
        this.w = localer;
        return true;
        this.w.b(this, paramMotionEvent);
        if ((i1 == 3) || (i1 == 1)) {
          this.w = null;
        }
        return true;
      }
      i1 += 1;
    }
    label108:
    return false;
  }
  
  static fd c(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return ((ep)paramView.getLayoutParams()).a;
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    int i1 = bf.b(paramMotionEvent);
    if (bf.b(paramMotionEvent, i1) == this.Q) {
      if (i1 != 0) {
        break label75;
      }
    }
    label75:
    for (i1 = 1;; i1 = 0)
    {
      this.Q = bf.b(paramMotionEvent, i1);
      int i2 = (int)(bf.c(paramMotionEvent, i1) + 0.5F);
      this.U = i2;
      this.S = i2;
      i1 = (int)(bf.d(paramMotionEvent, i1) + 0.5F);
      this.V = i1;
      this.T = i1;
      return;
    }
  }
  
  private boolean c(fd paramfd)
  {
    return (this.g == null) || (this.g.a(paramfd, paramfd.u()));
  }
  
  private int d(fd paramfd)
  {
    if ((paramfd.a(524)) || (!paramfd.p())) {
      return -1;
    }
    return this.c.c(paramfd.b);
  }
  
  private void e(int paramInt)
  {
    if (this.f == null) {
      return;
    }
    this.f.d(paramInt);
    awakenScrollBars();
  }
  
  private float getScrollFactor()
  {
    if (this.ac == Float.MIN_VALUE)
    {
      TypedValue localTypedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        this.ac = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
      }
    }
    else
    {
      return this.ac;
    }
    return 0.0F;
  }
  
  private bp getScrollingChildHelper()
  {
    if (this.al == null) {
      this.al = new bp(this);
    }
    return this.al;
  }
  
  private void i(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.L != null)
    {
      bool1 = bool2;
      if (!this.L.a())
      {
        bool1 = bool2;
        if (paramInt1 > 0) {
          bool1 = this.L.c();
        }
      }
    }
    bool2 = bool1;
    if (this.N != null)
    {
      bool2 = bool1;
      if (!this.N.a())
      {
        bool2 = bool1;
        if (paramInt1 < 0) {
          bool2 = bool1 | this.N.c();
        }
      }
    }
    bool1 = bool2;
    if (this.M != null)
    {
      bool1 = bool2;
      if (!this.M.a())
      {
        bool1 = bool2;
        if (paramInt2 > 0) {
          bool1 = bool2 | this.M.c();
        }
      }
    }
    bool2 = bool1;
    if (this.O != null)
    {
      bool2 = bool1;
      if (!this.O.a())
      {
        bool2 = bool1;
        if (paramInt2 < 0) {
          bool2 = bool1 | this.O.c();
        }
      }
    }
    if (bool2) {
      cb.d(this);
    }
  }
  
  private boolean i(View paramView)
  {
    b();
    boolean bool2 = this.d.f(paramView);
    if (bool2)
    {
      paramView = c(paramView);
      this.b.d(paramView);
      this.b.b(paramView);
    }
    if (!bool2) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      a(bool1);
      return bool2;
    }
  }
  
  private void j(View paramView)
  {
    fd localfd = c(paramView);
    g(paramView);
    if ((this.s != null) && (localfd != null)) {
      this.s.d(localfd);
    }
    if (this.I != null)
    {
      int i1 = this.I.size() - 1;
      while (i1 >= 0)
      {
        ((eq)this.I.get(i1)).b(paramView);
        i1 -= 1;
      }
    }
  }
  
  private boolean j(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (this.d.b() == 0) {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        bool = true;
      }
    }
    do
    {
      return bool;
      a(this.ak);
    } while ((this.ak[0] == paramInt1) && (this.ak[1] == paramInt2));
    return true;
  }
  
  private void k(View paramView)
  {
    fd localfd = c(paramView);
    f(paramView);
    if ((this.s != null) && (localfd != null)) {
      this.s.c(localfd);
    }
    if (this.I != null)
    {
      int i1 = this.I.size() - 1;
      while (i1 >= 0)
      {
        ((eq)this.I.get(i1)).a(paramView);
        i1 -= 1;
      }
    }
  }
  
  private void s()
  {
    this.d = new by(new eb(this));
  }
  
  private void setScrollState(int paramInt)
  {
    if (paramInt == this.P) {
      return;
    }
    this.P = paramInt;
    if (paramInt != 2) {
      v();
    }
    d(paramInt);
  }
  
  private void t()
  {
    if (!this.z) {}
    label106:
    do
    {
      do
      {
        return;
        if (this.J)
        {
          i.a("RV FullInvalidate");
          k();
          i.a();
          return;
        }
      } while (!this.c.d());
      if ((this.c.a(4)) && (!this.c.a(11)))
      {
        i.a("RV PartialInvalidate");
        b();
        this.c.b();
        if (!this.B)
        {
          if (!u()) {
            break label106;
          }
          k();
        }
        for (;;)
        {
          a(true);
          i.a();
          return;
          this.c.c();
        }
      }
    } while (!this.c.d());
    i.a("RV FullInvalidate");
    k();
    i.a();
  }
  
  private boolean u()
  {
    boolean bool2 = false;
    int i2 = this.d.b();
    int i1 = 0;
    boolean bool1 = bool2;
    if (i1 < i2)
    {
      fd localfd = c(this.d.b(i1));
      if ((localfd == null) || (localfd.c())) {}
      while (!localfd.x())
      {
        i1 += 1;
        break;
      }
      bool1 = true;
    }
    return bool1;
  }
  
  private void v()
  {
    this.ad.b();
    if (this.f != null) {
      this.f.F();
    }
  }
  
  private void w()
  {
    boolean bool2 = false;
    if (this.L != null) {
      bool2 = this.L.c();
    }
    boolean bool1 = bool2;
    if (this.M != null) {
      bool1 = bool2 | this.M.c();
    }
    bool2 = bool1;
    if (this.N != null) {
      bool2 = bool1 | this.N.c();
    }
    bool1 = bool2;
    if (this.O != null) {
      bool1 = bool2 | this.O.c();
    }
    if (bool1) {
      cb.d(this);
    }
  }
  
  private void x()
  {
    if (this.R != null) {
      this.R.clear();
    }
    stopNestedScroll();
    w();
  }
  
  private void y()
  {
    x();
    setScrollState(0);
  }
  
  private void z()
  {
    this.K += 1;
  }
  
  long a(fd paramfd)
  {
    if (this.s.b()) {
      return paramfd.g();
    }
    return paramfd.b;
  }
  
  fd a(int paramInt, boolean paramBoolean)
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fd localfd = c(this.d.c(i1));
      if ((localfd != null) && (!localfd.q())) {
        if (paramBoolean)
        {
          if (localfd.b != paramInt) {}
        }
        else {
          while (localfd.d() == paramInt) {
            return localfd;
          }
        }
      }
      i1 += 1;
    }
    return null;
  }
  
  public fd a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this)) {
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    }
    return c(paramView);
  }
  
  public View a(float paramFloat1, float paramFloat2)
  {
    int i1 = this.d.b() - 1;
    while (i1 >= 0)
    {
      View localView = this.d.b(i1);
      float f1 = cb.o(localView);
      float f2 = cb.p(localView);
      if ((paramFloat1 >= localView.getLeft() + f1) && (paramFloat1 <= f1 + localView.getRight()) && (paramFloat2 >= localView.getTop() + f2) && (paramFloat2 <= localView.getBottom() + f2)) {
        return localView;
      }
      i1 -= 1;
    }
    return null;
  }
  
  void a()
  {
    this.c = new ai(new ec(this));
  }
  
  public void a(int paramInt)
  {
    int i2 = this.d.b();
    int i1 = 0;
    while (i1 < i2)
    {
      this.d.b(i1).offsetTopAndBottom(paramInt);
      i1 += 1;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (this.f == null) {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    for (;;)
    {
      return;
      if (!this.C)
      {
        if (!this.f.d()) {
          paramInt1 = 0;
        }
        if (!this.f.e()) {
          paramInt2 = i1;
        }
        while ((paramInt1 != 0) || (paramInt2 != 0))
        {
          this.ad.b(paramInt1, paramInt2);
          return;
        }
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, Object paramObject)
  {
    int i2 = this.d.c();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = this.d.c(i1);
      fd localfd = c(localView);
      if ((localfd == null) || (localfd.c())) {}
      for (;;)
      {
        i1 += 1;
        break;
        if ((localfd.b >= paramInt1) && (localfd.b < paramInt1 + paramInt2))
        {
          localfd.b(2);
          localfd.a(paramObject);
          ((ep)localView.getLayoutParams()).c = true;
        }
      }
    }
    this.b.c(paramInt1, paramInt2);
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i2 = this.d.c();
    int i1 = 0;
    if (i1 < i2)
    {
      fd localfd = c(this.d.c(i1));
      if ((localfd != null) && (!localfd.c()))
      {
        if (localfd.b < paramInt1 + paramInt2) {
          break label83;
        }
        localfd.a(-paramInt2, paramBoolean);
        fa.a(this.h, true);
      }
      for (;;)
      {
        i1 += 1;
        break;
        label83:
        if (localfd.b >= paramInt1)
        {
          localfd.a(paramInt1 - 1, -paramInt2, paramBoolean);
          fa.a(this.h, true);
        }
      }
    }
    this.b.b(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }
  
  public void a(er paramer)
  {
    this.v.add(paramer);
  }
  
  public void a(es parames)
  {
    if (this.af == null) {
      this.af = new ArrayList();
    }
    this.af.add(parames);
  }
  
  void a(String paramString)
  {
    if (j())
    {
      if (paramString == null) {
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      }
      throw new IllegalStateException(paramString);
    }
  }
  
  void a(boolean paramBoolean)
  {
    if (this.A < 1) {
      this.A = 1;
    }
    if (!paramBoolean) {
      this.B = false;
    }
    if (this.A == 1)
    {
      if ((paramBoolean) && (this.B) && (!this.C) && (this.f != null) && (this.s != null)) {
        k();
      }
      if (!this.C) {
        this.B = false;
      }
    }
    this.A -= 1;
  }
  
  boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    t();
    int i2;
    int i1;
    int i3;
    int i4;
    if (this.s != null)
    {
      b();
      z();
      i.a("RV Scroll");
      if (paramInt1 != 0)
      {
        i2 = this.f.a(paramInt1, this.b, this.h);
        i1 = paramInt1 - i2;
        if (paramInt2 != 0)
        {
          i3 = this.f.b(paramInt2, this.b, this.h);
          i4 = paramInt2 - i3;
          label84:
          i.a();
          J();
          A();
          a(false);
          int i5 = i3;
          i3 = i1;
          i1 = i5;
        }
      }
    }
    for (;;)
    {
      if (!this.u.isEmpty()) {
        invalidate();
      }
      if (dispatchNestedScroll(i2, i1, i3, i4, this.am))
      {
        this.U -= this.am[0];
        this.V -= this.am[1];
        if (paramMotionEvent != null) {
          paramMotionEvent.offsetLocation(this.am[0], this.am[1]);
        }
        paramMotionEvent = this.ao;
        paramMotionEvent[0] += this.am[0];
        paramMotionEvent = this.ao;
        paramMotionEvent[1] += this.am[1];
      }
      for (;;)
      {
        if ((i2 != 0) || (i1 != 0)) {
          h(i2, i1);
        }
        if (!awakenScrollBars()) {
          invalidate();
        }
        if ((i2 != 0) || (i1 != 0)) {
          bool = true;
        }
        return bool;
        if (cb.a(this) != 2)
        {
          if (paramMotionEvent != null) {
            a(paramMotionEvent.getX(), i3, paramMotionEvent.getY(), i4);
          }
          i(paramInt1, paramInt2);
        }
      }
      i3 = 0;
      i4 = 0;
      break label84;
      i2 = 0;
      i1 = 0;
      break;
      i1 = 0;
      i2 = 0;
      i4 = 0;
      i3 = 0;
    }
  }
  
  boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = false;
    int i2 = 0;
    if (j()) {
      if (paramAccessibilityEvent == null) {
        break label46;
      }
    }
    label46:
    for (int i1 = a.b(paramAccessibilityEvent);; i1 = 0)
    {
      if (i1 == 0) {
        i1 = i2;
      }
      for (;;)
      {
        this.E = (i1 | this.E);
        bool = true;
        return bool;
      }
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    if ((this.f == null) || (!this.f.a(this, paramArrayList, paramInt1, paramInt2))) {
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
    }
  }
  
  public View b(View paramView)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (localViewParent != this) && ((localViewParent instanceof View)); localViewParent = paramView.getParent()) {
      paramView = (View)localViewParent;
    }
    if (localViewParent == this) {
      return paramView;
    }
    return null;
  }
  
  void b()
  {
    this.A += 1;
    if ((this.A == 1) && (!this.C)) {
      this.B = false;
    }
  }
  
  public void b(int paramInt)
  {
    int i2 = this.d.b();
    int i1 = 0;
    while (i1 < i2)
    {
      this.d.b(i1).offsetLeftAndRight(paramInt);
      i1 += 1;
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (this.f == null) {
      Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    boolean bool2;
    int i1;
    do
    {
      do
      {
        return false;
      } while (this.C);
      bool1 = this.f.d();
      bool2 = this.f.e();
      if (bool1)
      {
        i1 = paramInt1;
        if (Math.abs(paramInt1) >= this.aa) {}
      }
      else
      {
        i1 = 0;
      }
      if (bool2)
      {
        paramInt1 = paramInt2;
        if (Math.abs(paramInt2) >= this.aa) {}
      }
      else
      {
        paramInt1 = 0;
      }
    } while (((i1 == 0) && (paramInt1 == 0)) || (dispatchNestedPreFling(i1, paramInt1)));
    if ((bool1) || (bool2)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      dispatchNestedFling(i1, paramInt1, bool1);
      if (!bool1) {
        break;
      }
      paramInt2 = Math.max(-this.ab, Math.min(i1, this.ab));
      paramInt1 = Math.max(-this.ab, Math.min(paramInt1, this.ab));
      this.ad.a(paramInt2, paramInt1);
      return true;
    }
  }
  
  public void c()
  {
    setScrollState(0);
    v();
  }
  
  public void c(int paramInt) {}
  
  void c(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      d();
      this.L.a(-paramInt1);
      if (paramInt2 >= 0) {
        break label69;
      }
      f();
      this.M.a(-paramInt2);
    }
    for (;;)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        cb.d(this);
      }
      return;
      if (paramInt1 <= 0) {
        break;
      }
      e();
      this.N.a(paramInt1);
      break;
      label69:
      if (paramInt2 > 0)
      {
        g();
        this.O.a(paramInt2);
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof ep)) && (this.f.a((ep)paramLayoutParams));
  }
  
  public int computeHorizontalScrollExtent()
  {
    if (this.f == null) {}
    while (!this.f.d()) {
      return 0;
    }
    return this.f.d(this.h);
  }
  
  public int computeHorizontalScrollOffset()
  {
    if (this.f == null) {}
    while (!this.f.d()) {
      return 0;
    }
    return this.f.b(this.h);
  }
  
  public int computeHorizontalScrollRange()
  {
    if (this.f == null) {}
    while (!this.f.d()) {
      return 0;
    }
    return this.f.f(this.h);
  }
  
  public int computeVerticalScrollExtent()
  {
    if (this.f == null) {}
    while (!this.f.e()) {
      return 0;
    }
    return this.f.e(this.h);
  }
  
  public int computeVerticalScrollOffset()
  {
    if (this.f == null) {}
    while (!this.f.e()) {
      return 0;
    }
    return this.f.c(this.h);
  }
  
  public int computeVerticalScrollRange()
  {
    if (this.f == null) {}
    while (!this.f.e()) {
      return 0;
    }
    return this.f.g(this.h);
  }
  
  public int d(View paramView)
  {
    paramView = c(paramView);
    if (paramView != null) {
      return paramView.e();
    }
    return -1;
  }
  
  void d()
  {
    if (this.L != null) {
      return;
    }
    this.L = new ah(getContext());
    if (this.p)
    {
      this.L.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.L.a(getMeasuredHeight(), getMeasuredWidth());
  }
  
  void d(int paramInt)
  {
    if (this.f != null) {
      this.f.k(paramInt);
    }
    c(paramInt);
    if (this.ae != null) {
      this.ae.a(this, paramInt);
    }
    if (this.af != null)
    {
      int i1 = this.af.size() - 1;
      while (i1 >= 0)
      {
        ((es)this.af.get(i1)).a(this, paramInt);
        i1 -= 1;
      }
    }
  }
  
  void d(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(en.a(paramInt1, getPaddingLeft() + getPaddingRight(), cb.q(this)), en.a(paramInt2, getPaddingTop() + getPaddingBottom(), cb.r(this)));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i3 = 1;
    int i4 = 0;
    super.draw(paramCanvas);
    int i2 = this.u.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((em)this.u.get(i1)).b(paramCanvas, this, this.h);
      i1 += 1;
    }
    int i5;
    if ((this.L != null) && (!this.L.a()))
    {
      i5 = paramCanvas.save();
      if (this.p)
      {
        i1 = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i1 + -getHeight(), 0.0F);
        if ((this.L == null) || (!this.L.a(paramCanvas))) {
          break label456;
        }
        i2 = 1;
        label128:
        paramCanvas.restoreToCount(i5);
      }
    }
    for (;;)
    {
      i1 = i2;
      if (this.M != null)
      {
        i1 = i2;
        if (!this.M.a())
        {
          i5 = paramCanvas.save();
          if (this.p) {
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          }
          if ((this.M == null) || (!this.M.a(paramCanvas))) {
            break label461;
          }
          i1 = 1;
          label202:
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      i2 = i1;
      if (this.N != null)
      {
        i2 = i1;
        if (!this.N.a())
        {
          i5 = paramCanvas.save();
          int i6 = getWidth();
          if (!this.p) {
            break label466;
          }
          i2 = getPaddingTop();
          label257:
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i2, -i6);
          if ((this.N == null) || (!this.N.a(paramCanvas))) {
            break label471;
          }
          i2 = 1;
          label295:
          i2 = i1 | i2;
          paramCanvas.restoreToCount(i5);
        }
      }
      i1 = i2;
      if (this.O != null)
      {
        i1 = i2;
        if (!this.O.a())
        {
          i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.p) {
            break label476;
          }
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label372:
          i1 = i4;
          if (this.O != null)
          {
            i1 = i4;
            if (this.O.a(paramCanvas)) {
              i1 = 1;
            }
          }
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      if ((i1 == 0) && (this.g != null) && (this.u.size() > 0) && (this.g.b())) {
        i1 = i3;
      }
      for (;;)
      {
        if (i1 != 0) {
          cb.d(this);
        }
        return;
        i1 = 0;
        break;
        label456:
        i2 = 0;
        break label128;
        label461:
        i1 = 0;
        break label202;
        label466:
        i2 = 0;
        break label257;
        label471:
        i2 = 0;
        break label295;
        label476:
        paramCanvas.translate(-getWidth(), -getHeight());
        break label372;
      }
      i2 = 0;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public int e(View paramView)
  {
    paramView = c(paramView);
    if (paramView != null) {
      return paramView.d();
    }
    return -1;
  }
  
  void e()
  {
    if (this.N != null) {
      return;
    }
    this.N = new ah(getContext());
    if (this.p)
    {
      this.N.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.N.a(getMeasuredHeight(), getMeasuredWidth());
  }
  
  void e(int paramInt1, int paramInt2)
  {
    int i5 = this.d.c();
    int i1;
    int i2;
    if (paramInt1 < paramInt2)
    {
      i1 = -1;
      i2 = paramInt2;
    }
    fd localfd;
    for (int i3 = paramInt1;; i3 = paramInt2)
    {
      int i4 = 0;
      for (;;)
      {
        if (i4 >= i5) {
          break label131;
        }
        localfd = c(this.d.c(i4));
        if ((localfd != null) && (localfd.b >= i3) && (localfd.b <= i2)) {
          break;
        }
        i4 += 1;
      }
      i1 = 1;
      i2 = paramInt1;
    }
    if (localfd.b == paramInt1) {
      localfd.a(paramInt2 - paramInt1, false);
    }
    for (;;)
    {
      fa.a(this.h, true);
      break;
      localfd.a(i1, false);
    }
    label131:
    this.b.a(paramInt1, paramInt2);
    requestLayout();
  }
  
  void f()
  {
    if (this.M != null) {
      return;
    }
    this.M = new ah(getContext());
    if (this.p)
    {
      this.M.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.M.a(getMeasuredWidth(), getMeasuredHeight());
  }
  
  void f(int paramInt1, int paramInt2)
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fd localfd = c(this.d.c(i1));
      if ((localfd != null) && (!localfd.c()) && (localfd.b >= paramInt1))
      {
        localfd.a(paramInt2, false);
        fa.a(this.h, true);
      }
      i1 += 1;
    }
    this.b.b(paramInt1, paramInt2);
    requestLayout();
  }
  
  public void f(View paramView) {}
  
  public View focusSearch(View paramView, int paramInt)
  {
    Object localObject2 = this.f.d(paramView, paramInt);
    if (localObject2 != null) {}
    Object localObject1;
    do
    {
      return (View)localObject2;
      localObject2 = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (this.s != null)
        {
          localObject1 = localObject2;
          if (this.f != null)
          {
            localObject1 = localObject2;
            if (!j())
            {
              localObject1 = localObject2;
              if (!this.C)
              {
                b();
                localObject1 = this.f.a(paramView, paramInt, this.b, this.h);
                a(false);
              }
            }
          }
        }
      }
      localObject2 = localObject1;
    } while (localObject1 != null);
    return super.focusSearch(paramView, paramInt);
  }
  
  void g()
  {
    if (this.O != null) {
      return;
    }
    this.O = new ah(getContext());
    if (this.p)
    {
      this.O.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.O.a(getMeasuredWidth(), getMeasuredHeight());
  }
  
  public void g(int paramInt1, int paramInt2) {}
  
  public void g(View paramView) {}
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.f == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.f.a();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.f == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.f.a(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.f == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.f.a(paramLayoutParams);
  }
  
  public ed getAdapter()
  {
    return this.s;
  }
  
  public int getBaseline()
  {
    if (this.f != null) {
      return this.f.s();
    }
    return super.getBaseline();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.aj == null) {
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    }
    return this.aj.a(paramInt1, paramInt2);
  }
  
  public fe getCompatAccessibilityDelegate()
  {
    return this.ai;
  }
  
  public eh getItemAnimator()
  {
    return this.g;
  }
  
  public en getLayoutManager()
  {
    return this.f;
  }
  
  public int getMaxFlingVelocity()
  {
    return this.ab;
  }
  
  public int getMinFlingVelocity()
  {
    return this.aa;
  }
  
  public et getRecycledViewPool()
  {
    return this.b.f();
  }
  
  public int getScrollState()
  {
    return this.P;
  }
  
  Rect h(View paramView)
  {
    ep localep = (ep)paramView.getLayoutParams();
    if (!localep.c) {
      return localep.b;
    }
    Rect localRect = localep.b;
    localRect.set(0, 0, 0, 0);
    int i2 = this.u.size();
    int i1 = 0;
    while (i1 < i2)
    {
      this.r.set(0, 0, 0, 0);
      ((em)this.u.get(i1)).a(this.r, paramView, this, this.h);
      localRect.left += this.r.left;
      localRect.top += this.r.top;
      localRect.right += this.r.right;
      localRect.bottom += this.r.bottom;
      i1 += 1;
    }
    localep.c = false;
    return localRect;
  }
  
  void h()
  {
    this.O = null;
    this.M = null;
    this.N = null;
    this.L = null;
  }
  
  void h(int paramInt1, int paramInt2)
  {
    int i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    g(paramInt1, paramInt2);
    if (this.ae != null) {
      this.ae.a(this, paramInt1, paramInt2);
    }
    if (this.af != null)
    {
      i1 = this.af.size() - 1;
      while (i1 >= 0)
      {
        ((es)this.af.get(i1)).a(this, paramInt1, paramInt2);
        i1 -= 1;
      }
    }
  }
  
  public boolean hasNestedScrollingParent()
  {
    return getScrollingChildHelper().b();
  }
  
  boolean i()
  {
    return (this.H != null) && (this.H.isEnabled());
  }
  
  public boolean isAttachedToWindow()
  {
    return this.x;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return getScrollingChildHelper().a();
  }
  
  public boolean j()
  {
    return this.K > 0;
  }
  
  void k()
  {
    if (this.s == null)
    {
      Log.e("RecyclerView", "No adapter attached; skipping layout");
      return;
    }
    if (this.f == null)
    {
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
      return;
    }
    fa.b(this.h, false);
    if (fa.a(this.h) == 1)
    {
      F();
      this.f.f(this);
      G();
    }
    for (;;)
    {
      H();
      return;
      if ((this.c.f()) || (this.f.w() != getWidth()) || (this.f.x() != getHeight()))
      {
        this.f.f(this);
        G();
      }
      else
      {
        this.f.f(this);
      }
    }
  }
  
  void l()
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      ((ep)this.d.c(i1).getLayoutParams()).c = true;
      i1 += 1;
    }
    this.b.j();
  }
  
  void m()
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fd localfd = c(this.d.c(i1));
      if (!localfd.c()) {
        localfd.b();
      }
      i1 += 1;
    }
  }
  
  void n()
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fd localfd = c(this.d.c(i1));
      if (!localfd.c()) {
        localfd.a();
      }
      i1 += 1;
    }
    this.b.i();
  }
  
  void o()
  {
    int i2 = this.d.c();
    int i1 = 0;
    while (i1 < i2)
    {
      fd localfd = c(this.d.c(i1));
      if ((localfd != null) && (!localfd.c())) {
        localfd.b(6);
      }
      i1 += 1;
    }
    l();
    this.b.h();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.K = 0;
    this.x = true;
    this.z = false;
    if (this.f != null) {
      this.f.c(this);
    }
    this.ah = false;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.g != null) {
      this.g.c();
    }
    this.z = false;
    c();
    this.x = false;
    if (this.f != null) {
      this.f.b(this, this.b);
    }
    removeCallbacks(this.ap);
    this.e.b();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i2 = this.u.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((em)this.u.get(i1)).a(paramCanvas, this, this.h);
      i1 += 1;
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (this.f == null) {}
    label110:
    label113:
    for (;;)
    {
      return false;
      if ((!this.C) && ((bf.d(paramMotionEvent) & 0x2) != 0) && (paramMotionEvent.getAction() == 8))
      {
        float f1;
        if (this.f.e())
        {
          f1 = -bf.e(paramMotionEvent, 9);
          if (!this.f.d()) {
            break label110;
          }
        }
        for (float f2 = bf.e(paramMotionEvent, 10);; f2 = 0.0F)
        {
          if ((f1 == 0.0F) && (f2 == 0.0F)) {
            break label113;
          }
          float f3 = getScrollFactor();
          a((int)(f2 * f3), (int)(f1 * f3), paramMotionEvent);
          return false;
          f1 = 0.0F;
          break;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i3 = -1;
    boolean bool1 = true;
    if (this.C) {}
    do
    {
      return false;
      if (a(paramMotionEvent))
      {
        y();
        return true;
      }
    } while (this.f == null);
    boolean bool2 = this.f.d();
    boolean bool3 = this.f.e();
    if (this.R == null) {
      this.R = VelocityTracker.obtain();
    }
    this.R.addMovement(paramMotionEvent);
    int i2 = bf.a(paramMotionEvent);
    int i1 = bf.b(paramMotionEvent);
    switch (i2)
    {
    case 4: 
    default: 
      if (this.P == 1) {
        return bool1;
      }
      break;
    case 0: 
      label136:
      if (this.D) {
        this.D = false;
      }
      this.Q = bf.b(paramMotionEvent, 0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      this.U = i1;
      this.S = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      this.V = i1;
      this.T = i1;
      if (this.P == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
      }
      paramMotionEvent = this.ao;
      this.ao[1] = 0;
      paramMotionEvent[0] = 0;
      if (!bool2) {}
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool3) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      break;
      this.Q = bf.b(paramMotionEvent, i1);
      i2 = (int)(bf.c(paramMotionEvent, i1) + 0.5F);
      this.U = i2;
      this.S = i2;
      i1 = (int)(bf.d(paramMotionEvent, i1) + 0.5F);
      this.V = i1;
      this.T = i1;
      break;
      i2 = bf.a(paramMotionEvent, this.Q);
      if (i2 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      i1 = (int)(bf.c(paramMotionEvent, i2) + 0.5F);
      i2 = (int)(bf.d(paramMotionEvent, i2) + 0.5F);
      if (this.P == 1) {
        break;
      }
      i1 -= this.S;
      int i4 = i2 - this.T;
      int i5;
      if ((bool2) && (Math.abs(i1) > this.W))
      {
        i2 = this.S;
        i5 = this.W;
        if (i1 < 0)
        {
          i1 = -1;
          label449:
          this.U = (i1 * i5 + i2);
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        i2 = i1;
        if (bool3)
        {
          i2 = i1;
          if (Math.abs(i4) > this.W)
          {
            i2 = this.T;
            i5 = this.W;
            if (i4 >= 0) {
              break label530;
            }
          }
        }
        label530:
        for (i1 = i3;; i1 = 1)
        {
          this.V = (i2 + i1 * i5);
          i2 = 1;
          if (i2 == 0) {
            break;
          }
          setScrollState(1);
          break;
          i1 = 1;
          break label449;
        }
        c(paramMotionEvent);
        break;
        this.R.clear();
        stopNestedScroll();
        break;
        y();
        break;
        bool1 = false;
        break label136;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    i.a("RV OnLayout");
    k();
    i.a();
    this.z = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = 0;
    if (this.f == null) {
      d(paramInt1, paramInt2);
    }
    do
    {
      int i1;
      do
      {
        return;
        if (!en.a(this.f)) {
          break;
        }
        int i3 = View.MeasureSpec.getMode(paramInt1);
        int i4 = View.MeasureSpec.getMode(paramInt2);
        i1 = i2;
        if (i3 == 1073741824)
        {
          i1 = i2;
          if (i4 == 1073741824) {
            i1 = 1;
          }
        }
        this.f.a(this.b, this.h, paramInt1, paramInt2);
      } while ((i1 != 0) || (this.s == null));
      if (fa.a(this.h) == 1) {
        F();
      }
      this.f.a(paramInt1, paramInt2);
      fa.b(this.h, true);
      G();
      this.f.b(paramInt1, paramInt2);
    } while (!this.f.k());
    this.f.a(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    fa.b(this.h, true);
    G();
    this.f.b(paramInt1, paramInt2);
    return;
    if (this.y)
    {
      this.f.a(this.b, this.h, paramInt1, paramInt2);
      return;
    }
    if (this.F)
    {
      b();
      E();
      if (fa.b(this.h))
      {
        fa.c(this.h, true);
        this.F = false;
        a(false);
      }
    }
    else
    {
      if (this.s == null) {
        break label342;
      }
    }
    label342:
    for (this.h.a = this.s.a();; this.h.a = 0)
    {
      b();
      this.f.a(this.b, this.h, paramInt1, paramInt2);
      a(false);
      fa.c(this.h, false);
      return;
      this.c.e();
      fa.c(this.h, false);
      break;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof RecyclerView.SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    do
    {
      return;
      this.o = ((RecyclerView.SavedState)paramParcelable);
      super.onRestoreInstanceState(this.o.getSuperState());
    } while ((this.f == null) || (this.o.a == null));
    this.f.a(this.o.a);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    RecyclerView.SavedState localSavedState = new RecyclerView.SavedState(super.onSaveInstanceState());
    if (this.o != null)
    {
      RecyclerView.SavedState.a(localSavedState, this.o);
      return localSavedState;
    }
    if (this.f != null)
    {
      localSavedState.a = this.f.c();
      return localSavedState;
    }
    localSavedState.a = null;
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      h();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i7 = 0;
    if ((this.C) || (this.D)) {}
    do
    {
      return false;
      if (b(paramMotionEvent))
      {
        y();
        return true;
      }
    } while (this.f == null);
    boolean bool1 = this.f.d();
    boolean bool2 = this.f.e();
    if (this.R == null) {
      this.R = VelocityTracker.obtain();
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i3 = bf.a(paramMotionEvent);
    int i2 = bf.b(paramMotionEvent);
    if (i3 == 0)
    {
      int[] arrayOfInt = this.ao;
      this.ao[1] = 0;
      arrayOfInt[0] = 0;
    }
    localMotionEvent.offsetLocation(this.ao[0], this.ao[1]);
    int i1 = i7;
    switch (i3)
    {
    default: 
      i1 = i7;
    case 4: 
      if (i1 == 0) {
        this.R.addMovement(localMotionEvent);
      }
      localMotionEvent.recycle();
      return true;
    case 0: 
      this.Q = bf.b(paramMotionEvent, 0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      this.U = i1;
      this.S = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      this.V = i1;
      this.T = i1;
      if (!bool1) {
        break;
      }
    }
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool2) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      i1 = i7;
      break;
      this.Q = bf.b(paramMotionEvent, i2);
      i1 = (int)(bf.c(paramMotionEvent, i2) + 0.5F);
      this.U = i1;
      this.S = i1;
      i1 = (int)(bf.d(paramMotionEvent, i2) + 0.5F);
      this.V = i1;
      this.T = i1;
      i1 = i7;
      break;
      i1 = bf.a(paramMotionEvent, this.Q);
      if (i1 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i8 = (int)(bf.c(paramMotionEvent, i1) + 0.5F);
      int i9 = (int)(bf.d(paramMotionEvent, i1) + 0.5F);
      int i4 = this.U - i8;
      i3 = this.V - i9;
      i1 = i3;
      i2 = i4;
      if (dispatchNestedPreScroll(i4, i3, this.an, this.am))
      {
        i2 = i4 - this.an[0];
        i1 = i3 - this.an[1];
        localMotionEvent.offsetLocation(this.am[0], this.am[1]);
        paramMotionEvent = this.ao;
        paramMotionEvent[0] += this.am[0];
        paramMotionEvent = this.ao;
        paramMotionEvent[1] += this.am[1];
      }
      i3 = i1;
      i4 = i2;
      if (this.P != 1)
      {
        if ((!bool1) || (Math.abs(i2) <= this.W)) {
          break label940;
        }
        if (i2 <= 0) {
          break label773;
        }
        i2 -= this.W;
      }
      label612:
      label662:
      label734:
      label773:
      label785:
      label803:
      label863:
      label924:
      label940:
      for (i3 = 1;; i3 = 0)
      {
        int i5 = i1;
        int i6 = i3;
        if (bool2)
        {
          i5 = i1;
          i6 = i3;
          if (Math.abs(i1) > this.W)
          {
            if (i1 <= 0) {
              break label785;
            }
            i5 = i1 - this.W;
            i6 = 1;
          }
        }
        i3 = i5;
        i4 = i2;
        if (i6 != 0)
        {
          setScrollState(1);
          i4 = i2;
          i3 = i5;
        }
        i1 = i7;
        if (this.P != 1) {
          break;
        }
        this.U = (i8 - this.am[0]);
        this.V = (i9 - this.am[1]);
        if (bool1) {
          if (!bool2) {
            break label803;
          }
        }
        for (;;)
        {
          i1 = i7;
          if (!a(i4, i3, localMotionEvent)) {
            break;
          }
          getParent().requestDisallowInterceptTouchEvent(true);
          i1 = i7;
          break;
          i2 += this.W;
          break label612;
          i5 = i1 + this.W;
          break label662;
          i4 = 0;
          break label734;
          i3 = 0;
        }
        c(paramMotionEvent);
        i1 = i7;
        break;
        this.R.addMovement(localMotionEvent);
        this.R.computeCurrentVelocity(1000, this.ab);
        float f1;
        if (bool1)
        {
          f1 = -bw.a(this.R, this.Q);
          if (!bool2) {
            break label924;
          }
        }
        for (float f2 = -bw.b(this.R, this.Q);; f2 = 0.0F)
        {
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!b((int)f1, (int)f2))) {
            setScrollState(0);
          }
          x();
          i1 = 1;
          break;
          f1 = 0.0F;
          break label863;
        }
        y();
        i1 = i7;
        break;
      }
    }
  }
  
  public boolean p()
  {
    return (!this.z) || (this.J) || (this.c.d());
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    fd localfd = c(paramView);
    if (localfd != null)
    {
      if (!localfd.r()) {
        break label32;
      }
      localfd.m();
    }
    label32:
    while (localfd.c())
    {
      j(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localfd);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    Object localObject;
    if ((!this.f.a(this, this.h, paramView1, paramView2)) && (paramView2 != null))
    {
      this.r.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
      localObject = paramView2.getLayoutParams();
      if ((localObject instanceof ep))
      {
        localObject = (ep)localObject;
        if (!((ep)localObject).c)
        {
          localObject = ((ep)localObject).b;
          Rect localRect = this.r;
          localRect.left -= ((Rect)localObject).left;
          localRect = this.r;
          localRect.right += ((Rect)localObject).right;
          localRect = this.r;
          localRect.top -= ((Rect)localObject).top;
          localRect = this.r;
          int i1 = localRect.bottom;
          localRect.bottom = (((Rect)localObject).bottom + i1);
        }
      }
      offsetDescendantRectToMyCoords(paramView2, this.r);
      offsetRectIntoDescendantCoords(paramView1, this.r);
      localObject = this.r;
      if (this.z) {
        break label215;
      }
    }
    label215:
    for (boolean bool = true;; bool = false)
    {
      requestChildRectangleOnScreen(paramView1, (Rect)localObject, bool);
      super.requestChildFocus(paramView1, paramView2);
      return;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return this.f.a(this, paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i2 = this.v.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((er)this.v.get(i1)).a(paramBoolean);
      i1 += 1;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if ((this.A == 0) && (!this.C))
    {
      super.requestLayout();
      return;
    }
    this.B = true;
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.f == null) {}
    boolean bool1;
    boolean bool2;
    do
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      do
      {
        return;
      } while (this.C);
      bool1 = this.f.d();
      bool2 = this.f.e();
    } while ((!bool1) && (!bool2));
    if (bool1) {
      if (!bool2) {
        break label74;
      }
    }
    for (;;)
    {
      a(paramInt1, paramInt2, null);
      return;
      paramInt1 = 0;
      break;
      label74:
      paramInt2 = 0;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    if (a(paramAccessibilityEvent)) {
      return;
    }
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(fe paramfe)
  {
    this.ai = paramfe;
    cb.a(this, this.ai);
  }
  
  public void setAdapter(ed paramed)
  {
    setLayoutFrozen(false);
    a(paramed, false, true);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(eg parameg)
  {
    if (parameg == this.aj) {
      return;
    }
    this.aj = parameg;
    if (this.aj != null) {}
    for (boolean bool = true;; bool = false)
    {
      setChildrenDrawingOrderEnabled(bool);
      return;
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.p) {
      h();
    }
    this.p = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.z) {
      requestLayout();
    }
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  
  public void setItemAnimator(eh parameh)
  {
    if (this.g != null)
    {
      this.g.c();
      this.g.a(null);
    }
    this.g = parameh;
    if (this.g != null) {
      this.g.a(this.ag);
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public void setLayoutFrozen(boolean paramBoolean)
  {
    if (paramBoolean != this.C)
    {
      a("Do not setLayoutFrozen in layout or scroll");
      if (!paramBoolean)
      {
        this.C = false;
        if ((this.B) && (this.f != null) && (this.s != null)) {
          requestLayout();
        }
        this.B = false;
      }
    }
    else
    {
      return;
    }
    long l1 = SystemClock.uptimeMillis();
    onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
    this.C = true;
    this.D = true;
    c();
  }
  
  public void setLayoutManager(en paramen)
  {
    if (paramen == this.f) {
      return;
    }
    c();
    if (this.f != null)
    {
      if (this.x) {
        this.f.b(this, this.b);
      }
      this.f.b(null);
    }
    this.b.a();
    this.d.a();
    this.f = paramen;
    if (paramen != null)
    {
      if (paramen.q != null) {
        throw new IllegalArgumentException("LayoutManager " + paramen + " is already attached to a RecyclerView: " + paramen.q);
      }
      this.f.b(this);
      if (this.x) {
        this.f.c(this);
      }
    }
    requestLayout();
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    getScrollingChildHelper().a(paramBoolean);
  }
  
  @Deprecated
  public void setOnScrollListener(es parames)
  {
    this.ae = parames;
  }
  
  public void setRecycledViewPool(et paramet)
  {
    this.b.a(paramet);
  }
  
  public void setRecyclerListener(ev paramev)
  {
    this.t = paramev;
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    switch (paramInt)
    {
    default: 
      Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + paramInt + "; using default value");
    case 0: 
      this.W = localViewConfiguration.getScaledTouchSlop();
      return;
    }
    this.W = db.a(localViewConfiguration);
  }
  
  public void setViewCacheExtension(fb paramfb)
  {
    this.b.a(paramfb);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return getScrollingChildHelper().a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    getScrollingChildHelper().c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */