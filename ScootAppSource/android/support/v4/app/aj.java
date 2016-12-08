package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.g.d;
import android.support.v4.g.e;
import android.support.v4.view.ar;
import android.support.v4.view.cb;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class aj
  extends ah
  implements ar
{
  static final Interpolator A = new DecelerateInterpolator(2.5F);
  static final Interpolator B = new DecelerateInterpolator(1.5F);
  static final Interpolator C = new AccelerateInterpolator(2.5F);
  static final Interpolator D = new AccelerateInterpolator(1.5F);
  static boolean a;
  static final boolean b;
  static Field r;
  ArrayList<Runnable> c;
  Runnable[] d;
  boolean e;
  ArrayList<Fragment> f;
  ArrayList<Fragment> g;
  ArrayList<Integer> h;
  ArrayList<m> i;
  ArrayList<Fragment> j;
  ArrayList<m> k;
  ArrayList<Integer> l;
  ArrayList<ai> m;
  int n = 0;
  ag o;
  ae p;
  Fragment q;
  boolean s;
  boolean t;
  boolean u;
  String v;
  boolean w;
  Bundle x = null;
  SparseArray<Parcelable> y = null;
  Runnable z = new ak(this);
  
  static
  {
    boolean bool = false;
    a = false;
    if (Build.VERSION.SDK_INT >= 11) {
      bool = true;
    }
    b = bool;
    r = null;
  }
  
  static Animation a(Context paramContext, float paramFloat1, float paramFloat2)
  {
    paramContext = new AlphaAnimation(paramFloat1, paramFloat2);
    paramContext.setInterpolator(B);
    paramContext.setDuration(220L);
    return paramContext;
  }
  
  static Animation a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramContext = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(A);
    ((ScaleAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(B);
    ((AlphaAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    return paramContext;
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new e("FragmentManager"));
    if (this.o != null) {}
    for (;;)
    {
      try
      {
        this.o.a("  ", null, localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
        continue;
      }
      try
      {
        a("  ", null, localException1, new String[0]);
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
      }
    }
  }
  
  static boolean a(View paramView, Animation paramAnimation)
  {
    return (Build.VERSION.SDK_INT >= 19) && (cb.g(paramView) == 0) && (cb.z(paramView)) && (a(paramAnimation));
  }
  
  static boolean a(Animation paramAnimation)
  {
    boolean bool2 = false;
    boolean bool1;
    if ((paramAnimation instanceof AlphaAnimation)) {
      bool1 = true;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while (!(paramAnimation instanceof AnimationSet));
    paramAnimation = ((AnimationSet)paramAnimation).getAnimations();
    int i1 = 0;
    for (;;)
    {
      bool1 = bool2;
      if (i1 >= paramAnimation.size()) {
        break;
      }
      if ((paramAnimation.get(i1) instanceof AlphaAnimation)) {
        return true;
      }
      i1 += 1;
    }
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 4097: 
      if (paramBoolean) {
        return 1;
      }
      return 2;
    case 8194: 
      if (paramBoolean) {
        return 3;
      }
      return 4;
    }
    if (paramBoolean) {
      return 5;
    }
    return 6;
  }
  
  private void b(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {}
    while (!a(paramView, paramAnimation)) {
      return;
    }
    try
    {
      if (r == null)
      {
        r = Animation.class.getDeclaredField("mListener");
        r.setAccessible(true);
      }
      localAnimationListener = (Animation.AnimationListener)r.get(paramAnimation);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Animation.AnimationListener localAnimationListener;
        Log.e("FragmentManager", "No field with the name mListener is found in Animation class", localNoSuchFieldException);
        Object localObject1 = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Log.e("FragmentManager", "Cannot access Animation's mListener field", localIllegalAccessException);
        Object localObject2 = null;
      }
    }
    paramAnimation.setAnimationListener(new an(paramView, paramAnimation, localAnimationListener));
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private void u()
  {
    if (this.t) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.v != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.v);
    }
  }
  
  public int a(m paramm)
  {
    try
    {
      if ((this.l == null) || (this.l.size() <= 0))
      {
        if (this.k == null) {
          this.k = new ArrayList();
        }
        i1 = this.k.size();
        if (a) {
          Log.v("FragmentManager", "Setting back stack index " + i1 + " to " + paramm);
        }
        this.k.add(paramm);
        return i1;
      }
      int i1 = ((Integer)this.l.remove(this.l.size() - 1)).intValue();
      if (a) {
        Log.v("FragmentManager", "Adding back stack index " + i1 + " with " + paramm);
      }
      this.k.set(i1, paramm);
      return i1;
    }
    finally {}
  }
  
  public Fragment.SavedState a(Fragment paramFragment)
  {
    Object localObject2 = null;
    if (paramFragment.p < 0) {
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    Object localObject1 = localObject2;
    if (paramFragment.k > 0)
    {
      paramFragment = g(paramFragment);
      localObject1 = localObject2;
      if (paramFragment != null) {
        localObject1 = new Fragment.SavedState(paramFragment);
      }
    }
    return (Fragment.SavedState)localObject1;
  }
  
  public Fragment a(int paramInt)
  {
    int i1;
    Object localObject;
    if (this.g != null)
    {
      i1 = this.g.size() - 1;
      while (i1 >= 0)
      {
        localObject = (Fragment)this.g.get(i1);
        if ((localObject != null) && (((Fragment)localObject).F == paramInt)) {
          return (Fragment)localObject;
        }
        i1 -= 1;
      }
    }
    if (this.f != null)
    {
      i1 = this.f.size() - 1;
      for (;;)
      {
        if (i1 < 0) {
          break label112;
        }
        Fragment localFragment = (Fragment)this.f.get(i1);
        if (localFragment != null)
        {
          localObject = localFragment;
          if (localFragment.F == paramInt) {
            break;
          }
        }
        i1 -= 1;
      }
    }
    label112:
    return null;
  }
  
  public Fragment a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    if (i1 == -1) {
      paramBundle = null;
    }
    Fragment localFragment;
    do
    {
      return paramBundle;
      if (i1 >= this.f.size()) {
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
      }
      localFragment = (Fragment)this.f.get(i1);
      paramBundle = localFragment;
    } while (localFragment != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
    return localFragment;
  }
  
  public Fragment a(String paramString)
  {
    int i1;
    Object localObject;
    if ((this.g != null) && (paramString != null))
    {
      i1 = this.g.size() - 1;
      while (i1 >= 0)
      {
        localObject = (Fragment)this.g.get(i1);
        if ((localObject != null) && (paramString.equals(((Fragment)localObject).H))) {
          return (Fragment)localObject;
        }
        i1 -= 1;
      }
    }
    if ((this.f != null) && (paramString != null))
    {
      i1 = this.f.size() - 1;
      for (;;)
      {
        if (i1 < 0) {
          break label126;
        }
        Fragment localFragment = (Fragment)this.f.get(i1);
        if (localFragment != null)
        {
          localObject = localFragment;
          if (paramString.equals(localFragment.H)) {
            break;
          }
        }
        i1 -= 1;
      }
    }
    label126:
    return null;
  }
  
  public av a()
  {
    return new m(this);
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    paramString = paramContext.obtainStyledAttributes(paramAttributeSet, aq.a);
    if (str1 == null) {
      str1 = paramString.getString(0);
    }
    for (;;)
    {
      int i3 = paramString.getResourceId(1, -1);
      String str2 = paramString.getString(2);
      paramString.recycle();
      if (!Fragment.b(this.o.g(), str1)) {
        return null;
      }
      if (paramView != null) {}
      for (int i1 = paramView.getId(); (i1 == -1) && (i3 == -1) && (str2 == null); i1 = 0) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
      }
      int i2;
      if (i3 != -1)
      {
        paramString = a(i3);
        paramView = paramString;
        if (paramString == null)
        {
          paramView = paramString;
          if (str2 != null) {
            paramView = a(str2);
          }
        }
        paramString = paramView;
        if (paramView == null)
        {
          paramString = paramView;
          if (i1 != -1) {
            paramString = a(i1);
          }
        }
        if (a) {
          Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(i3) + " fname=" + str1 + " existing=" + paramString);
        }
        if (paramString != null) {
          break label428;
        }
        paramView = Fragment.a(paramContext, str1);
        paramView.x = true;
        if (i3 == 0) {
          break label421;
        }
        i2 = i3;
        label291:
        paramView.F = i2;
        paramView.G = i1;
        paramView.H = str2;
        paramView.y = true;
        paramView.B = this;
        paramView.C = this.o;
        paramView.a(this.o.g(), paramAttributeSet, paramView.n);
        a(paramView, true);
        label350:
        if ((this.n >= 1) || (!paramView.x)) {
          break label555;
        }
        a(paramView, 1, 0, 0, false);
      }
      for (;;)
      {
        if (paramView.R != null) {
          break label563;
        }
        throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
        paramString = null;
        break;
        label421:
        i2 = i1;
        break label291;
        label428:
        if (paramString.y) {
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i3) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i1) + " with another fragment for " + str1);
        }
        paramString.y = true;
        paramString.C = this.o;
        if (!paramString.L) {
          paramString.a(this.o.g(), paramAttributeSet, paramString.n);
        }
        paramView = paramString;
        break label350;
        label555:
        c(paramView);
      }
      label563:
      if (i3 != 0) {
        paramView.R.setId(i3);
      }
      if (paramView.R.getTag() == null) {
        paramView.R.setTag(str2);
      }
      return paramView.R;
    }
  }
  
  Animation a(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Animation localAnimation = paramFragment.a(paramInt1, paramBoolean, paramFragment.P);
    if (localAnimation != null) {
      paramFragment = localAnimation;
    }
    do
    {
      return paramFragment;
      if (paramFragment.P == 0) {
        break;
      }
      localAnimation = AnimationUtils.loadAnimation(this.o.g(), paramFragment.P);
      paramFragment = localAnimation;
    } while (localAnimation != null);
    if (paramInt1 == 0) {
      return null;
    }
    paramInt1 = b(paramInt1, paramBoolean);
    if (paramInt1 < 0) {
      return null;
    }
    switch (paramInt1)
    {
    default: 
      paramInt1 = paramInt2;
      if (paramInt2 == 0)
      {
        paramInt1 = paramInt2;
        if (this.o.d()) {
          paramInt1 = this.o.e();
        }
      }
      if (paramInt1 == 0) {
        return null;
      }
      break;
    case 1: 
      return a(this.o.g(), 1.125F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return a(this.o.g(), 1.0F, 0.975F, 1.0F, 0.0F);
    case 3: 
      return a(this.o.g(), 0.975F, 1.0F, 0.0F, 1.0F);
    case 4: 
      return a(this.o.g(), 1.0F, 1.075F, 1.0F, 0.0F);
    case 5: 
      return a(this.o.g(), 0.0F, 1.0F);
    case 6: 
      return a(this.o.g(), 1.0F, 0.0F);
    }
    return null;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Bad id: " + paramInt1);
    }
    a(new al(this, paramInt1, paramInt2), false);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.o == null) && (paramInt1 != 0)) {
      throw new IllegalStateException("No host");
    }
    if ((!paramBoolean) && (this.n == paramInt1)) {}
    do
    {
      return;
      this.n = paramInt1;
    } while (this.f == null);
    int i1 = 0;
    boolean bool = false;
    label54:
    if (i1 < this.f.size())
    {
      Fragment localFragment = (Fragment)this.f.get(i1);
      if (localFragment == null) {
        break label169;
      }
      a(localFragment, paramInt1, paramInt2, paramInt3, false);
      if (localFragment.V == null) {
        break label169;
      }
      bool |= localFragment.V.a();
    }
    label169:
    for (;;)
    {
      i1 += 1;
      break label54;
      if (!bool) {
        d();
      }
      if ((!this.s) || (this.o == null) || (this.n != 5)) {
        break;
      }
      this.o.c();
      this.s = false;
      return;
    }
  }
  
  /* Error */
  public void a(int paramInt, m paramm)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 279	android/support/v4/app/aj:k	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 276	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 280	java/util/ArrayList:<init>	()V
    //   17: putfield 279	android/support/v4/app/aj:k	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 279	android/support/v4/app/aj:k	Ljava/util/ArrayList;
    //   24: invokevirtual 277	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload 4
    //   31: istore_3
    //   32: iload_1
    //   33: iload 4
    //   35: if_icmpge +58 -> 93
    //   38: getstatic 59	android/support/v4/app/aj:a	Z
    //   41: ifeq +39 -> 80
    //   44: ldc -114
    //   46: new 261	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 262	java/lang/StringBuilder:<init>	()V
    //   53: ldc_w 282
    //   56: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: iload_1
    //   60: invokevirtual 285	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   63: ldc_w 287
    //   66: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_2
    //   70: invokevirtual 290	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 271	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokestatic 292	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   79: pop
    //   80: aload_0
    //   81: getfield 279	android/support/v4/app/aj:k	Ljava/util/ArrayList;
    //   84: iload_1
    //   85: aload_2
    //   86: invokevirtual 312	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: aload_0
    //   91: monitorexit
    //   92: return
    //   93: iload_3
    //   94: iload_1
    //   95: if_icmpge +81 -> 176
    //   98: aload_0
    //   99: getfield 279	android/support/v4/app/aj:k	Ljava/util/ArrayList;
    //   102: aconst_null
    //   103: invokevirtual 296	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   106: pop
    //   107: aload_0
    //   108: getfield 274	android/support/v4/app/aj:l	Ljava/util/ArrayList;
    //   111: ifnonnull +14 -> 125
    //   114: aload_0
    //   115: new 276	java/util/ArrayList
    //   118: dup
    //   119: invokespecial 280	java/util/ArrayList:<init>	()V
    //   122: putfield 274	android/support/v4/app/aj:l	Ljava/util/ArrayList;
    //   125: getstatic 59	android/support/v4/app/aj:a	Z
    //   128: ifeq +29 -> 157
    //   131: ldc -114
    //   133: new 261	java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial 262	java/lang/StringBuilder:<init>	()V
    //   140: ldc_w 547
    //   143: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: iload_3
    //   147: invokevirtual 285	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   150: invokevirtual 271	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokestatic 292	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   156: pop
    //   157: aload_0
    //   158: getfield 274	android/support/v4/app/aj:l	Ljava/util/ArrayList;
    //   161: iload_3
    //   162: invokestatic 551	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: invokevirtual 296	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   168: pop
    //   169: iload_3
    //   170: iconst_1
    //   171: iadd
    //   172: istore_3
    //   173: goto -80 -> 93
    //   176: getstatic 59	android/support/v4/app/aj:a	Z
    //   179: ifeq +39 -> 218
    //   182: ldc -114
    //   184: new 261	java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial 262	java/lang/StringBuilder:<init>	()V
    //   191: ldc_w 306
    //   194: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: iload_1
    //   198: invokevirtual 285	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   201: ldc_w 308
    //   204: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: aload_2
    //   208: invokevirtual 290	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 271	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: invokestatic 292	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   217: pop
    //   218: aload_0
    //   219: getfield 279	android/support/v4/app/aj:k	Ljava/util/ArrayList;
    //   222: aload_2
    //   223: invokevirtual 296	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   226: pop
    //   227: goto -137 -> 90
    //   230: astore_2
    //   231: aload_0
    //   232: monitorexit
    //   233: aload_2
    //   234: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	aj
    //   0	235	1	paramInt	int
    //   0	235	2	paramm	m
    //   31	142	3	i1	int
    //   27	9	4	i2	int
    // Exception table:
    //   from	to	target	type
    //   2	20	230	finally
    //   20	29	230	finally
    //   38	80	230	finally
    //   80	90	230	finally
    //   90	92	230	finally
    //   98	125	230	finally
    //   125	157	230	finally
    //   157	169	230	finally
    //   176	218	230	finally
    //   218	227	230	finally
    //   231	233	230	finally
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    a(paramInt, 0, 0, paramBoolean);
  }
  
  public void a(Configuration paramConfiguration)
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if (localFragment != null) {
          localFragment.a(paramConfiguration);
        }
        i1 += 1;
      }
    }
  }
  
  public void a(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    if (paramFragment.p < 0) {
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    paramBundle.putInt(paramString, paramFragment.p);
  }
  
  void a(Parcelable paramParcelable, List<Fragment> paramList)
  {
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      paramParcelable = (FragmentManagerState)paramParcelable;
      if (paramParcelable.a != null)
      {
        Object localObject1;
        Object localObject2;
        if (paramList != null)
        {
          i1 = 0;
          while (i1 < paramList.size())
          {
            localObject1 = (Fragment)paramList.get(i1);
            if (a) {
              Log.v("FragmentManager", "restoreAllState: re-attaching retained " + localObject1);
            }
            localObject2 = paramParcelable.a[localObject1.p];
            ((FragmentState)localObject2).k = ((Fragment)localObject1);
            ((Fragment)localObject1).o = null;
            ((Fragment)localObject1).A = 0;
            ((Fragment)localObject1).y = false;
            ((Fragment)localObject1).v = false;
            ((Fragment)localObject1).s = null;
            if (((FragmentState)localObject2).j != null)
            {
              ((FragmentState)localObject2).j.setClassLoader(this.o.g().getClassLoader());
              ((Fragment)localObject1).o = ((FragmentState)localObject2).j.getSparseParcelableArray("android:view_state");
              ((Fragment)localObject1).n = ((FragmentState)localObject2).j;
            }
            i1 += 1;
          }
        }
        this.f = new ArrayList(paramParcelable.a.length);
        if (this.h != null) {
          this.h.clear();
        }
        int i1 = 0;
        if (i1 < paramParcelable.a.length)
        {
          localObject1 = paramParcelable.a[i1];
          if (localObject1 != null)
          {
            localObject2 = ((FragmentState)localObject1).a(this.o, this.q);
            if (a) {
              Log.v("FragmentManager", "restoreAllState: active #" + i1 + ": " + localObject2);
            }
            this.f.add(localObject2);
            ((FragmentState)localObject1).k = null;
          }
          for (;;)
          {
            i1 += 1;
            break;
            this.f.add(null);
            if (this.h == null) {
              this.h = new ArrayList();
            }
            if (a) {
              Log.v("FragmentManager", "restoreAllState: avail #" + i1);
            }
            this.h.add(Integer.valueOf(i1));
          }
        }
        if (paramList != null)
        {
          i1 = 0;
          if (i1 < paramList.size())
          {
            localObject1 = (Fragment)paramList.get(i1);
            if (((Fragment)localObject1).t >= 0) {
              if (((Fragment)localObject1).t >= this.f.size()) {
                break label473;
              }
            }
            for (((Fragment)localObject1).s = ((Fragment)this.f.get(((Fragment)localObject1).t));; ((Fragment)localObject1).s = null)
            {
              i1 += 1;
              break;
              label473:
              Log.w("FragmentManager", "Re-attaching retained fragment " + localObject1 + " target no longer exists: " + ((Fragment)localObject1).t);
            }
          }
        }
        if (paramParcelable.b != null)
        {
          this.g = new ArrayList(paramParcelable.b.length);
          i1 = 0;
          while (i1 < paramParcelable.b.length)
          {
            paramList = (Fragment)this.f.get(paramParcelable.b[i1]);
            if (paramList == null) {
              a(new IllegalStateException("No instantiated fragment for index #" + paramParcelable.b[i1]));
            }
            paramList.v = true;
            if (a) {
              Log.v("FragmentManager", "restoreAllState: added #" + i1 + ": " + paramList);
            }
            if (this.g.contains(paramList)) {
              throw new IllegalStateException("Already added!");
            }
            this.g.add(paramList);
            i1 += 1;
          }
        }
        this.g = null;
        if (paramParcelable.c == null) {
          break;
        }
        this.i = new ArrayList(paramParcelable.c.length);
        i1 = 0;
        while (i1 < paramParcelable.c.length)
        {
          paramList = paramParcelable.c[i1].a(this);
          if (a)
          {
            Log.v("FragmentManager", "restoreAllState: back stack #" + i1 + " (index " + paramList.p + "): " + paramList);
            paramList.a("  ", new PrintWriter(new e("FragmentManager")), false);
          }
          this.i.add(paramList);
          if (paramList.p >= 0) {
            a(paramList.p, paramList);
          }
          i1 += 1;
        }
      }
    }
    this.i = null;
  }
  
  public void a(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "remove: " + paramFragment + " nesting=" + paramFragment.A);
    }
    if (!paramFragment.i())
    {
      i1 = 1;
      if ((!paramFragment.J) || (i1 != 0))
      {
        if (this.g != null) {
          this.g.remove(paramFragment);
        }
        if ((paramFragment.M) && (paramFragment.N)) {
          this.s = true;
        }
        paramFragment.v = false;
        paramFragment.w = true;
        if (i1 == 0) {
          break label137;
        }
      }
    }
    label137:
    for (int i1 = 0;; i1 = 1)
    {
      a(paramFragment, i1, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
    }
  }
  
  void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1;
    if (paramFragment.v)
    {
      i1 = paramInt1;
      if (!paramFragment.J) {}
    }
    else
    {
      i1 = paramInt1;
      if (paramInt1 > 1) {
        i1 = 1;
      }
    }
    int i2 = i1;
    if (paramFragment.w)
    {
      i2 = i1;
      if (i1 > paramFragment.k) {
        i2 = paramFragment.k;
      }
    }
    paramInt1 = i2;
    if (paramFragment.T)
    {
      paramInt1 = i2;
      if (paramFragment.k < 4)
      {
        paramInt1 = i2;
        if (i2 > 3) {
          paramInt1 = 3;
        }
      }
    }
    int i3;
    label615:
    label647:
    Object localObject2;
    if (paramFragment.k < paramInt1)
    {
      if ((paramFragment.x) && (!paramFragment.y)) {}
      do
      {
        return;
        if (paramFragment.l != null)
        {
          paramFragment.l = null;
          a(paramFragment, paramFragment.m, 0, 0, true);
        }
        i1 = paramInt1;
        i3 = paramInt1;
        i2 = paramInt1;
        switch (paramFragment.k)
        {
        default: 
          i1 = paramInt1;
        }
      } while (paramFragment.k == i1);
      Log.w("FragmentManager", "moveToState: Fragment state for " + paramFragment + " not updated inline; " + "expected state " + i1 + " found " + paramFragment.k);
      paramFragment.k = i1;
      return;
      if (a) {
        Log.v("FragmentManager", "moveto CREATED: " + paramFragment);
      }
      i2 = paramInt1;
      if (paramFragment.n != null)
      {
        paramFragment.n.setClassLoader(this.o.g().getClassLoader());
        paramFragment.o = paramFragment.n.getSparseParcelableArray("android:view_state");
        paramFragment.s = a(paramFragment.n, "android:target_state");
        if (paramFragment.s != null) {
          paramFragment.u = paramFragment.n.getInt("android:target_req_state", 0);
        }
        paramFragment.U = paramFragment.n.getBoolean("android:user_visible_hint", true);
        i2 = paramInt1;
        if (!paramFragment.U)
        {
          paramFragment.T = true;
          i2 = paramInt1;
          if (paramInt1 > 3) {
            i2 = 3;
          }
        }
      }
      paramFragment.C = this.o;
      paramFragment.E = this.q;
      if (this.q != null) {}
      for (localObject1 = this.q.D;; localObject1 = this.o.i())
      {
        paramFragment.B = ((aj)localObject1);
        paramFragment.O = false;
        paramFragment.a(this.o.g());
        if (paramFragment.O) {
          break;
        }
        throw new di("Fragment " + paramFragment + " did not call through to super.onAttach()");
      }
      if (paramFragment.E == null) {
        this.o.b(paramFragment);
      }
      if (!paramFragment.L) {
        paramFragment.i(paramFragment.n);
      }
      paramFragment.L = false;
      i1 = i2;
      if (paramFragment.x)
      {
        paramFragment.R = paramFragment.b(paramFragment.b(paramFragment.n), null, paramFragment.n);
        if (paramFragment.R == null) {
          break label1105;
        }
        paramFragment.S = paramFragment.R;
        if (Build.VERSION.SDK_INT >= 11)
        {
          cb.b(paramFragment.R, false);
          if (paramFragment.I) {
            paramFragment.R.setVisibility(8);
          }
          paramFragment.a(paramFragment.R, paramFragment.n);
          i1 = i2;
        }
      }
      else
      {
        i3 = i1;
        if (i1 > 1)
        {
          if (a) {
            Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + paramFragment);
          }
          if (!paramFragment.x)
          {
            if (paramFragment.G == 0) {
              break label1718;
            }
            localObject2 = (ViewGroup)this.p.a(paramFragment.G);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = localObject2;
              if (!paramFragment.z) {
                a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramFragment.G) + " (" + paramFragment.m().getResourceName(paramFragment.G) + ") for fragment " + paramFragment));
              }
            }
          }
        }
      }
    }
    label869:
    label1105:
    label1194:
    label1559:
    label1712:
    label1718:
    for (Object localObject1 = localObject2;; localObject1 = null)
    {
      paramFragment.Q = ((ViewGroup)localObject1);
      paramFragment.R = paramFragment.b(paramFragment.b(paramFragment.n), (ViewGroup)localObject1, paramFragment.n);
      if (paramFragment.R != null)
      {
        paramFragment.S = paramFragment.R;
        if (Build.VERSION.SDK_INT >= 11)
        {
          cb.b(paramFragment.R, false);
          if (localObject1 != null)
          {
            localObject2 = a(paramFragment, paramInt2, true, paramInt3);
            if (localObject2 != null)
            {
              b(paramFragment.R, (Animation)localObject2);
              paramFragment.R.startAnimation((Animation)localObject2);
            }
            ((ViewGroup)localObject1).addView(paramFragment.R);
          }
          if (paramFragment.I) {
            paramFragment.R.setVisibility(8);
          }
          paramFragment.a(paramFragment.R, paramFragment.n);
        }
      }
      for (;;)
      {
        paramFragment.j(paramFragment.n);
        if (paramFragment.R != null) {
          paramFragment.f(paramFragment.n);
        }
        paramFragment.n = null;
        i3 = i1;
        i2 = i3;
        if (i3 > 3)
        {
          if (a) {
            Log.v("FragmentManager", "moveto STARTED: " + paramFragment);
          }
          paramFragment.K();
          i2 = i3;
        }
        i1 = i2;
        if (i2 <= 4) {
          break;
        }
        if (a) {
          Log.v("FragmentManager", "moveto RESUMED: " + paramFragment);
        }
        paramFragment.L();
        paramFragment.n = null;
        paramFragment.o = null;
        i1 = i2;
        break;
        paramFragment.R = bm.a(paramFragment.R);
        break label615;
        paramFragment.S = null;
        i1 = i2;
        break label647;
        paramFragment.R = bm.a(paramFragment.R);
        break label869;
        paramFragment.S = null;
      }
      i1 = paramInt1;
      if (paramFragment.k <= paramInt1) {
        break;
      }
      switch (paramFragment.k)
      {
      default: 
        i1 = paramInt1;
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        do
        {
          i1 = paramInt1;
          if (paramInt1 >= 1) {
            break;
          }
          if ((this.u) && (paramFragment.l != null))
          {
            localObject1 = paramFragment.l;
            paramFragment.l = null;
            ((View)localObject1).clearAnimation();
          }
          if (paramFragment.l == null) {
            break label1559;
          }
          paramFragment.m = paramInt1;
          i1 = 1;
          break;
          if (paramInt1 < 5)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom RESUMED: " + paramFragment);
            }
            paramFragment.N();
          }
          if (paramInt1 < 4)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom STARTED: " + paramFragment);
            }
            paramFragment.O();
          }
          if (paramInt1 < 3)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom STOPPED: " + paramFragment);
            }
            paramFragment.P();
          }
        } while (paramInt1 >= 2);
        if (a) {
          Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + paramFragment);
        }
        if ((paramFragment.R != null) && (this.o.a(paramFragment)) && (paramFragment.o == null)) {
          f(paramFragment);
        }
        paramFragment.Q();
        if ((paramFragment.R != null) && (paramFragment.Q != null)) {
          if ((this.n <= 0) || (this.u)) {
            break label1712;
          }
        }
        for (localObject1 = a(paramFragment, paramInt2, false, paramInt3);; localObject1 = null)
        {
          if (localObject1 != null)
          {
            paramFragment.l = paramFragment.R;
            paramFragment.m = paramInt1;
            ((Animation)localObject1).setAnimationListener(new am(this, paramFragment.R, (Animation)localObject1, paramFragment));
            paramFragment.R.startAnimation((Animation)localObject1);
          }
          paramFragment.Q.removeView(paramFragment.R);
          paramFragment.Q = null;
          paramFragment.R = null;
          paramFragment.S = null;
          break label1194;
          if (a) {
            Log.v("FragmentManager", "movefrom CREATED: " + paramFragment);
          }
          if (!paramFragment.L) {
            paramFragment.R();
          }
          for (;;)
          {
            paramFragment.O = false;
            paramFragment.e();
            if (paramFragment.O) {
              break;
            }
            throw new di("Fragment " + paramFragment + " did not call through to super.onDetach()");
            paramFragment.k = 0;
          }
          i1 = paramInt1;
          if (paramBoolean) {
            break;
          }
          if (!paramFragment.L)
          {
            e(paramFragment);
            i1 = paramInt1;
            break;
          }
          paramFragment.C = null;
          paramFragment.E = null;
          paramFragment.B = null;
          paramFragment.D = null;
          i1 = paramInt1;
          break;
        }
      }
    }
  }
  
  public void a(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.g == null) {
      this.g = new ArrayList();
    }
    if (a) {
      Log.v("FragmentManager", "add: " + paramFragment);
    }
    d(paramFragment);
    if (!paramFragment.J)
    {
      if (this.g.contains(paramFragment)) {
        throw new IllegalStateException("Fragment already added: " + paramFragment);
      }
      this.g.add(paramFragment);
      paramFragment.v = true;
      paramFragment.w = false;
      if ((paramFragment.M) && (paramFragment.N)) {
        this.s = true;
      }
      if (paramBoolean) {
        c(paramFragment);
      }
    }
  }
  
  public void a(ag paramag, ae paramae, Fragment paramFragment)
  {
    if (this.o != null) {
      throw new IllegalStateException("Already attached");
    }
    this.o = paramag;
    this.p = paramae;
    this.q = paramFragment;
  }
  
  public void a(Runnable paramRunnable, boolean paramBoolean)
  {
    if (!paramBoolean) {
      u();
    }
    try
    {
      if ((this.u) || (this.o == null)) {
        throw new IllegalStateException("Activity has been destroyed");
      }
    }
    finally
    {
      throw paramRunnable;
      if (this.c == null) {
        this.c = new ArrayList();
      }
      this.c.add(paramRunnable);
      if (this.c.size() == 1) {
        this.o.h().removeCallbacks(this.z);
      }
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i2 = 0;
    String str = paramString + "    ";
    int i3;
    int i1;
    Object localObject;
    if (this.f != null)
    {
      i3 = this.f.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (Fragment)this.f.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localObject);
          if (localObject != null) {
            ((Fragment)localObject).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
          i1 += 1;
        }
      }
    }
    if (this.g != null)
    {
      i3 = this.g.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (Fragment)this.g.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((Fragment)localObject).toString());
          i1 += 1;
        }
      }
    }
    if (this.j != null)
    {
      i3 = this.j.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (Fragment)this.j.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((Fragment)localObject).toString());
          i1 += 1;
        }
      }
    }
    if (this.i != null)
    {
      i3 = this.i.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (m)this.i.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((m)localObject).toString());
          ((m)localObject).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          i1 += 1;
        }
      }
    }
    try
    {
      if (this.k != null)
      {
        i3 = this.k.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          i1 = 0;
          while (i1 < i3)
          {
            paramFileDescriptor = (m)this.k.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i1 += 1;
          }
        }
      }
      if ((this.l != null) && (this.l.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.l.toArray()));
      }
      if (this.c != null)
      {
        i3 = this.c.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          i1 = i2;
          while (i1 < i3)
          {
            paramFileDescriptor = (Runnable)this.c.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i1 += 1;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.o);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.p);
    if (this.q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.q);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.t);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.u);
    if (this.s)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.s);
    }
    if (this.v != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.v);
    }
    if ((this.h != null) && (this.h.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.h.toArray()));
    }
  }
  
  boolean a(Handler paramHandler, String paramString, int paramInt1, int paramInt2)
  {
    if (this.i == null) {
      break label145;
    }
    label7:
    do
    {
      return false;
      if ((paramString != null) || (paramInt1 >= 0) || ((paramInt2 & 0x1) != 0)) {
        break;
      }
      paramInt1 = this.i.size() - 1;
    } while (paramInt1 < 0);
    paramHandler = (m)this.i.remove(paramInt1);
    paramString = new SparseArray();
    SparseArray localSparseArray1 = new SparseArray();
    paramHandler.a(paramString, localSparseArray1);
    paramHandler.a(true, null, paramString, localSparseArray1);
    f();
    for (;;)
    {
      return true;
      int i1 = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        int i2 = this.i.size() - 1;
        for (;;)
        {
          if (i2 >= 0)
          {
            paramHandler = (m)this.i.get(i2);
            if ((paramString == null) || (!paramString.equals(paramHandler.c()))) {}
          }
          else
          {
            label145:
            if (i2 < 0) {
              break label7;
            }
            i1 = i2;
            if ((paramInt2 & 0x1) == 0) {
              break label254;
            }
            paramInt2 = i2 - 1;
            for (;;)
            {
              i1 = paramInt2;
              if (paramInt2 < 0) {
                break;
              }
              paramHandler = (m)this.i.get(paramInt2);
              if ((paramString == null) || (!paramString.equals(paramHandler.c())))
              {
                i1 = paramInt2;
                if (paramInt1 < 0) {
                  break;
                }
                i1 = paramInt2;
                if (paramInt1 != paramHandler.p) {
                  break;
                }
              }
              paramInt2 -= 1;
            }
          }
          if ((paramInt1 >= 0) && (paramInt1 == paramHandler.p)) {
            break;
          }
          i2 -= 1;
        }
      }
      label254:
      if (i1 == this.i.size() - 1) {
        break label7;
      }
      paramString = new ArrayList();
      paramInt1 = this.i.size() - 1;
      while (paramInt1 > i1)
      {
        paramString.add(this.i.remove(paramInt1));
        paramInt1 -= 1;
      }
      paramInt2 = paramString.size() - 1;
      localSparseArray1 = new SparseArray();
      SparseArray localSparseArray2 = new SparseArray();
      paramInt1 = 0;
      while (paramInt1 <= paramInt2)
      {
        ((m)paramString.get(paramInt1)).a(localSparseArray1, localSparseArray2);
        paramInt1 += 1;
      }
      paramHandler = null;
      paramInt1 = 0;
      if (paramInt1 <= paramInt2)
      {
        if (a) {
          Log.v("FragmentManager", "Popping back stack state: " + paramString.get(paramInt1));
        }
        m localm = (m)paramString.get(paramInt1);
        if (paramInt1 == paramInt2) {}
        for (boolean bool = true;; bool = false)
        {
          paramHandler = localm.a(bool, paramHandler, localSparseArray1, localSparseArray2);
          paramInt1 += 1;
          break;
        }
      }
      f();
    }
  }
  
  public boolean a(Menu paramMenu)
  {
    if (this.g != null)
    {
      int i1 = 0;
      for (boolean bool1 = false;; bool1 = bool2)
      {
        bool2 = bool1;
        if (i1 >= this.g.size()) {
          break;
        }
        Fragment localFragment = (Fragment)this.g.get(i1);
        bool2 = bool1;
        if (localFragment != null)
        {
          bool2 = bool1;
          if (localFragment.c(paramMenu)) {
            bool2 = true;
          }
        }
        i1 += 1;
      }
    }
    boolean bool2 = false;
    return bool2;
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i2 = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    int i1;
    if (this.g != null)
    {
      i1 = 0;
      boolean bool1 = false;
      for (;;)
      {
        localObject2 = localObject1;
        bool2 = bool1;
        if (i1 >= this.g.size()) {
          break;
        }
        Fragment localFragment = (Fragment)this.g.get(i1);
        localObject2 = localObject1;
        bool2 = bool1;
        if (localFragment != null)
        {
          localObject2 = localObject1;
          bool2 = bool1;
          if (localFragment.b(paramMenu, paramMenuInflater))
          {
            bool2 = true;
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localFragment);
          }
        }
        i1 += 1;
        bool1 = bool2;
        localObject1 = localObject2;
      }
    }
    boolean bool2 = false;
    if (this.j != null)
    {
      i1 = i2;
      while (i1 < this.j.size())
      {
        paramMenu = (Fragment)this.j.get(i1);
        if ((localObject2 == null) || (!((ArrayList)localObject2).contains(paramMenu))) {
          paramMenu.A();
        }
        i1 += 1;
      }
    }
    this.j = ((ArrayList)localObject2);
    return bool2;
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i1;
    if (this.g != null) {
      i1 = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i1 < this.g.size())
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (localFragment.c(paramMenuItem))) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  public Fragment b(String paramString)
  {
    if ((this.f != null) && (paramString != null))
    {
      int i1 = this.f.size() - 1;
      while (i1 >= 0)
      {
        Fragment localFragment = (Fragment)this.f.get(i1);
        if (localFragment != null)
        {
          localFragment = localFragment.a(paramString);
          if (localFragment != null) {
            return localFragment;
          }
        }
        i1 -= 1;
      }
    }
    return null;
  }
  
  public void b(int paramInt)
  {
    try
    {
      this.k.set(paramInt, null);
      if (this.l == null) {
        this.l = new ArrayList();
      }
      if (a) {
        Log.v("FragmentManager", "Freeing back stack index " + paramInt);
      }
      this.l.add(Integer.valueOf(paramInt));
      return;
    }
    finally {}
  }
  
  public void b(Fragment paramFragment)
  {
    if (paramFragment.T)
    {
      if (this.e) {
        this.w = true;
      }
    }
    else {
      return;
    }
    paramFragment.T = false;
    a(paramFragment, this.n, 0, 0, false);
  }
  
  public void b(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "hide: " + paramFragment);
    }
    if (!paramFragment.I)
    {
      paramFragment.I = true;
      if (paramFragment.R != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, false, paramInt2);
        if (localAnimation != null)
        {
          b(paramFragment.R, localAnimation);
          paramFragment.R.startAnimation(localAnimation);
        }
        paramFragment.R.setVisibility(8);
      }
      if ((paramFragment.v) && (paramFragment.M) && (paramFragment.N)) {
        this.s = true;
      }
      paramFragment.c(true);
    }
  }
  
  void b(m paramm)
  {
    if (this.i == null) {
      this.i = new ArrayList();
    }
    this.i.add(paramm);
    f();
  }
  
  public void b(Menu paramMenu)
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if (localFragment != null) {
          localFragment.d(paramMenu);
        }
        i1 += 1;
      }
    }
  }
  
  public boolean b()
  {
    return e();
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i1;
    if (this.g != null) {
      i1 = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i1 < this.g.size())
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (localFragment.d(paramMenuItem))) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  void c(Fragment paramFragment)
  {
    a(paramFragment, this.n, 0, 0, false);
  }
  
  public void c(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "show: " + paramFragment);
    }
    if (paramFragment.I)
    {
      paramFragment.I = false;
      if (paramFragment.R != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null)
        {
          b(paramFragment.R, localAnimation);
          paramFragment.R.startAnimation(localAnimation);
        }
        paramFragment.R.setVisibility(0);
      }
      if ((paramFragment.v) && (paramFragment.M) && (paramFragment.N)) {
        this.s = true;
      }
      paramFragment.c(false);
    }
  }
  
  public boolean c()
  {
    u();
    b();
    return a(this.o.h(), null, -1, 0);
  }
  
  void d()
  {
    if (this.f == null) {}
    for (;;)
    {
      return;
      int i1 = 0;
      while (i1 < this.f.size())
      {
        Fragment localFragment = (Fragment)this.f.get(i1);
        if (localFragment != null) {
          b(localFragment);
        }
        i1 += 1;
      }
    }
  }
  
  void d(Fragment paramFragment)
  {
    if (paramFragment.p >= 0) {}
    for (;;)
    {
      return;
      if ((this.h == null) || (this.h.size() <= 0))
      {
        if (this.f == null) {
          this.f = new ArrayList();
        }
        paramFragment.a(this.f.size(), this.q);
        this.f.add(paramFragment);
      }
      while (a)
      {
        Log.v("FragmentManager", "Allocated fragment index " + paramFragment);
        return;
        paramFragment.a(((Integer)this.h.remove(this.h.size() - 1)).intValue(), this.q);
        this.f.set(paramFragment.p, paramFragment);
      }
    }
  }
  
  public void d(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "detach: " + paramFragment);
    }
    if (!paramFragment.J)
    {
      paramFragment.J = true;
      if (paramFragment.v)
      {
        if (this.g != null)
        {
          if (a) {
            Log.v("FragmentManager", "remove from detach: " + paramFragment);
          }
          this.g.remove(paramFragment);
        }
        if ((paramFragment.M) && (paramFragment.N)) {
          this.s = true;
        }
        paramFragment.v = false;
        a(paramFragment, 1, paramInt1, paramInt2, false);
      }
    }
  }
  
  void e(Fragment paramFragment)
  {
    if (paramFragment.p < 0) {
      return;
    }
    if (a) {
      Log.v("FragmentManager", "Freeing fragment index " + paramFragment);
    }
    this.f.set(paramFragment.p, null);
    if (this.h == null) {
      this.h = new ArrayList();
    }
    this.h.add(Integer.valueOf(paramFragment.p));
    this.o.a(paramFragment.q);
    paramFragment.z();
  }
  
  public void e(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "attach: " + paramFragment);
    }
    if (paramFragment.J)
    {
      paramFragment.J = false;
      if (!paramFragment.v)
      {
        if (this.g == null) {
          this.g = new ArrayList();
        }
        if (this.g.contains(paramFragment)) {
          throw new IllegalStateException("Fragment already added: " + paramFragment);
        }
        if (a) {
          Log.v("FragmentManager", "add from attach: " + paramFragment);
        }
        this.g.add(paramFragment);
        paramFragment.v = true;
        if ((paramFragment.M) && (paramFragment.N)) {
          this.s = true;
        }
        a(paramFragment, this.n, paramInt1, paramInt2, false);
      }
    }
  }
  
  public boolean e()
  {
    if (this.e) {
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    }
    if (Looper.myLooper() != this.o.h().getLooper()) {
      throw new IllegalStateException("Must be called from main thread of process");
    }
    int i2;
    for (boolean bool = false;; bool = true) {
      try
      {
        if ((this.c == null) || (this.c.size() == 0))
        {
          if (!this.w) {
            break label276;
          }
          i1 = 0;
          int i4;
          for (i2 = 0; i1 < this.f.size(); i2 = i4)
          {
            Fragment localFragment = (Fragment)this.f.get(i1);
            int i3 = i2;
            if (localFragment != null)
            {
              i3 = i2;
              if (localFragment.V != null) {
                i4 = i2 | localFragment.V.a();
              }
            }
            i1 += 1;
          }
        }
        i2 = this.c.size();
        if ((this.d == null) || (this.d.length < i2)) {
          this.d = new Runnable[i2];
        }
        this.c.toArray(this.d);
        this.c.clear();
        this.o.h().removeCallbacks(this.z);
        this.e = true;
        int i1 = 0;
        while (i1 < i2)
        {
          this.d[i1].run();
          this.d[i1] = null;
          i1 += 1;
        }
        this.e = false;
      }
      finally {}
    }
    if (i2 == 0)
    {
      this.w = false;
      d();
    }
    label276:
    return bool;
  }
  
  void f()
  {
    if (this.m != null)
    {
      int i1 = 0;
      while (i1 < this.m.size())
      {
        ((ai)this.m.get(i1)).a();
        i1 += 1;
      }
    }
  }
  
  void f(Fragment paramFragment)
  {
    if (paramFragment.S == null) {
      return;
    }
    if (this.y == null) {
      this.y = new SparseArray();
    }
    for (;;)
    {
      paramFragment.S.saveHierarchyState(this.y);
      if (this.y.size() <= 0) {
        break;
      }
      paramFragment.o = this.y;
      this.y = null;
      return;
      this.y.clear();
    }
  }
  
  Bundle g(Fragment paramFragment)
  {
    if (this.x == null) {
      this.x = new Bundle();
    }
    paramFragment.k(this.x);
    Object localObject2;
    if (!this.x.isEmpty())
    {
      localObject2 = this.x;
      this.x = null;
    }
    for (;;)
    {
      if (paramFragment.R != null) {
        f(paramFragment);
      }
      Object localObject1 = localObject2;
      if (paramFragment.o != null)
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new Bundle();
        }
        ((Bundle)localObject1).putSparseParcelableArray("android:view_state", paramFragment.o);
      }
      localObject2 = localObject1;
      if (!paramFragment.U)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new Bundle();
        }
        ((Bundle)localObject2).putBoolean("android:user_visible_hint", paramFragment.U);
      }
      return (Bundle)localObject2;
      localObject2 = null;
    }
  }
  
  ArrayList<Fragment> g()
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (this.f != null)
    {
      int i1 = 0;
      localObject2 = localObject1;
      if (i1 < this.f.size())
      {
        Fragment localFragment = (Fragment)this.f.get(i1);
        Object localObject3 = localObject1;
        if (localFragment != null)
        {
          localObject3 = localObject1;
          if (localFragment.K)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localFragment);
            localFragment.L = true;
            if (localFragment.s == null) {
              break label164;
            }
          }
        }
        label164:
        for (int i2 = localFragment.s.p;; i2 = -1)
        {
          localFragment.t = i2;
          localObject3 = localObject2;
          if (a)
          {
            Log.v("FragmentManager", "retainNonConfig: keeping retained " + localFragment);
            localObject3 = localObject2;
          }
          i1 += 1;
          localObject1 = localObject3;
          break;
        }
      }
    }
    return (ArrayList<Fragment>)localObject2;
  }
  
  Parcelable h()
  {
    Object localObject3 = null;
    e();
    if (b) {
      this.t = true;
    }
    if ((this.f == null) || (this.f.size() <= 0)) {
      return null;
    }
    int i3 = this.f.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[i3];
    int i2 = 0;
    int i1 = 0;
    label56:
    Object localObject1;
    Object localObject2;
    if (i2 < i3)
    {
      localObject1 = (Fragment)this.f.get(i2);
      if (localObject1 == null) {
        break label718;
      }
      if (((Fragment)localObject1).p < 0) {
        a(new IllegalStateException("Failure saving state: active " + localObject1 + " has cleared index: " + ((Fragment)localObject1).p));
      }
      localObject2 = new FragmentState((Fragment)localObject1);
      arrayOfFragmentState[i2] = localObject2;
      if ((((Fragment)localObject1).k > 0) && (((FragmentState)localObject2).j == null))
      {
        ((FragmentState)localObject2).j = g((Fragment)localObject1);
        if (((Fragment)localObject1).s != null)
        {
          if (((Fragment)localObject1).s.p < 0) {
            a(new IllegalStateException("Failure saving state: " + localObject1 + " has target not in fragment manager: " + ((Fragment)localObject1).s));
          }
          if (((FragmentState)localObject2).j == null) {
            ((FragmentState)localObject2).j = new Bundle();
          }
          a(((FragmentState)localObject2).j, "android:target_state", ((Fragment)localObject1).s);
          if (((Fragment)localObject1).u != 0) {
            ((FragmentState)localObject2).j.putInt("android:target_req_state", ((Fragment)localObject1).u);
          }
        }
        label303:
        if (a) {
          Log.v("FragmentManager", "Saved state of " + localObject1 + ": " + ((FragmentState)localObject2).j);
        }
        i1 = 1;
      }
    }
    label718:
    for (;;)
    {
      i2 += 1;
      break label56;
      ((FragmentState)localObject2).j = ((Fragment)localObject1).n;
      break label303;
      if (i1 == 0)
      {
        if (!a) {
          break;
        }
        Log.v("FragmentManager", "saveAllState: no fragments!");
        return null;
      }
      if (this.g != null)
      {
        i2 = this.g.size();
        if (i2 > 0)
        {
          localObject2 = new int[i2];
          i1 = 0;
          for (;;)
          {
            localObject1 = localObject2;
            if (i1 >= i2) {
              break;
            }
            localObject2[i1] = ((Fragment)this.g.get(i1)).p;
            if (localObject2[i1] < 0) {
              a(new IllegalStateException("Failure saving state: active " + this.g.get(i1) + " has cleared index: " + localObject2[i1]));
            }
            if (a) {
              Log.v("FragmentManager", "saveAllState: adding fragment #" + i1 + ": " + this.g.get(i1));
            }
            i1 += 1;
          }
        }
      }
      localObject1 = null;
      localObject2 = localObject3;
      if (this.i != null)
      {
        i2 = this.i.size();
        localObject2 = localObject3;
        if (i2 > 0)
        {
          localObject3 = new BackStackState[i2];
          i1 = 0;
          for (;;)
          {
            localObject2 = localObject3;
            if (i1 >= i2) {
              break;
            }
            localObject3[i1] = new BackStackState((m)this.i.get(i1));
            if (a) {
              Log.v("FragmentManager", "saveAllState: adding back stack #" + i1 + ": " + this.i.get(i1));
            }
            i1 += 1;
          }
        }
      }
      localObject3 = new FragmentManagerState();
      ((FragmentManagerState)localObject3).a = arrayOfFragmentState;
      ((FragmentManagerState)localObject3).b = ((int[])localObject1);
      ((FragmentManagerState)localObject3).c = ((BackStackState[])localObject2);
      return (Parcelable)localObject3;
    }
  }
  
  public void i()
  {
    this.t = false;
  }
  
  public void j()
  {
    this.t = false;
    a(1, false);
  }
  
  public void k()
  {
    this.t = false;
    a(2, false);
  }
  
  public void l()
  {
    this.t = false;
    a(4, false);
  }
  
  public void m()
  {
    this.t = false;
    a(5, false);
  }
  
  public void n()
  {
    a(4, false);
  }
  
  public void o()
  {
    this.t = true;
    a(3, false);
  }
  
  public void p()
  {
    a(2, false);
  }
  
  public void q()
  {
    a(1, false);
  }
  
  public void r()
  {
    this.u = true;
    e();
    a(0, false);
    this.o = null;
    this.p = null;
    this.q = null;
  }
  
  public void s()
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if (localFragment != null) {
          localFragment.M();
        }
        i1 += 1;
      }
    }
  }
  
  ar t()
  {
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.q != null) {
      d.a(this.q, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      d.a(this.o, localStringBuilder);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */