package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.bh;
import android.support.v4.view.ah;
import android.support.v4.view.ar;
import android.support.v4.view.cb;
import android.support.v4.view.db;
import android.support.v4.view.en;
import android.support.v4.widget.bd;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.color;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.support.v7.view.e;
import android.support.v7.view.f;
import android.support.v7.view.menu.i;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.cc;
import android.support.v7.widget.cr;
import android.support.v7.widget.gx;
import android.support.v7.widget.hc;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

class at
  extends ak
  implements ar, j
{
  private boolean A;
  private bf[] B;
  private bf C;
  private boolean D;
  private boolean E;
  private int F;
  private final Runnable G = new au(this);
  private boolean H;
  private Rect I;
  private Rect J;
  private bi K;
  b m;
  ActionBarContextView n;
  PopupWindow o;
  Runnable p;
  en q = null;
  private cc r;
  private bb s;
  private bg t;
  private boolean u;
  private ViewGroup v;
  private TextView w;
  private View x;
  private boolean y;
  private boolean z;
  
  at(Context paramContext, Window paramWindow, ai paramai)
  {
    super(paramContext, paramWindow, paramai);
  }
  
  private bf a(int paramInt, boolean paramBoolean)
  {
    Object localObject2 = this.B;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > paramInt) {}
    }
    else
    {
      localObject1 = new bf[paramInt + 1];
      if (localObject2 != null) {
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
      }
      this.B = ((bf[])localObject1);
    }
    localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new bf(paramInt);
      localObject1[paramInt] = localObject2;
      return (bf)localObject2;
    }
    return (bf)localObject2;
  }
  
  private bf a(Menu paramMenu)
  {
    bf[] arrayOfbf = this.B;
    int i;
    int j;
    if (arrayOfbf != null)
    {
      i = arrayOfbf.length;
      j = 0;
    }
    for (;;)
    {
      if (j >= i) {
        break label57;
      }
      bf localbf = arrayOfbf[j];
      if ((localbf != null) && (localbf.j == paramMenu))
      {
        return localbf;
        i = 0;
        break;
      }
      j += 1;
    }
    label57:
    return null;
  }
  
  private void a(int paramInt, bf parambf, Menu paramMenu)
  {
    Object localObject1 = parambf;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      bf localbf = parambf;
      if (parambf == null)
      {
        localbf = parambf;
        if (paramInt >= 0)
        {
          localbf = parambf;
          if (paramInt < this.B.length) {
            localbf = this.B[paramInt];
          }
        }
      }
      localObject1 = localbf;
      localObject2 = paramMenu;
      if (localbf != null)
      {
        localObject2 = localbf.j;
        localObject1 = localbf;
      }
    }
    if ((localObject1 != null) && (!((bf)localObject1).o)) {}
    while (p()) {
      return;
    }
    this.c.onPanelClosed(paramInt, (Menu)localObject2);
  }
  
  private void a(bf parambf, KeyEvent paramKeyEvent)
  {
    int k = -1;
    if ((parambf.o) || (p())) {}
    Object localObject;
    int i;
    label112:
    label117:
    label121:
    label123:
    do
    {
      do
      {
        for (;;)
        {
          return;
          if (parambf.a == 0)
          {
            localObject = this.a;
            if ((((Context)localObject).getResources().getConfiguration().screenLayout & 0xF) != 4) {
              break label112;
            }
            i = 1;
            if (((Context)localObject).getApplicationInfo().targetSdkVersion < 11) {
              break label117;
            }
          }
          for (int j = 1;; j = 0)
          {
            if ((i != 0) && (j != 0)) {
              break label121;
            }
            localObject = q();
            if ((localObject == null) || (((Window.Callback)localObject).onMenuOpened(parambf.a, parambf.j))) {
              break label123;
            }
            a(parambf, true);
            return;
            i = 0;
            break;
          }
        }
        localObject = (WindowManager)this.a.getSystemService("window");
      } while ((localObject == null) || (!b(parambf, paramKeyEvent)));
      if ((parambf.g != null) && (!parambf.q)) {
        break label398;
      }
      if (parambf.g != null) {
        break;
      }
    } while ((!a(parambf)) || (parambf.g == null));
    label187:
    if ((c(parambf)) && (parambf.a()))
    {
      paramKeyEvent = parambf.h.getLayoutParams();
      if (paramKeyEvent != null) {
        break label434;
      }
      paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
    }
    label398:
    label434:
    for (;;)
    {
      i = parambf.b;
      parambf.g.setBackgroundResource(i);
      ViewParent localViewParent = parambf.h.getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup))) {
        ((ViewGroup)localViewParent).removeView(parambf.h);
      }
      parambf.g.addView(parambf.h, paramKeyEvent);
      if (!parambf.h.hasFocus()) {
        parambf.h.requestFocus();
      }
      i = -2;
      for (;;)
      {
        parambf.n = false;
        paramKeyEvent = new WindowManager.LayoutParams(i, -2, parambf.d, parambf.e, 1002, 8519680, -3);
        paramKeyEvent.gravity = parambf.c;
        paramKeyEvent.windowAnimations = parambf.f;
        ((WindowManager)localObject).addView(parambf.g, paramKeyEvent);
        parambf.o = true;
        return;
        if ((!parambf.q) || (parambf.g.getChildCount() <= 0)) {
          break label187;
        }
        parambf.g.removeAllViews();
        break label187;
        break;
        if (parambf.i != null)
        {
          paramKeyEvent = parambf.i.getLayoutParams();
          if (paramKeyEvent != null)
          {
            i = k;
            if (paramKeyEvent.width == -1) {
              continue;
            }
          }
        }
        i = -2;
      }
    }
  }
  
  private void a(bf parambf, boolean paramBoolean)
  {
    if ((paramBoolean) && (parambf.a == 0) && (this.r != null) && (this.r.e())) {
      b(parambf.j);
    }
    do
    {
      return;
      WindowManager localWindowManager = (WindowManager)this.a.getSystemService("window");
      if ((localWindowManager != null) && (parambf.o) && (parambf.g != null))
      {
        localWindowManager.removeView(parambf.g);
        if (paramBoolean) {
          a(parambf.a, parambf, null);
        }
      }
      parambf.m = false;
      parambf.n = false;
      parambf.o = false;
      parambf.h = null;
      parambf.q = true;
    } while (this.C != parambf);
    this.C = null;
  }
  
  private void a(i parami, boolean paramBoolean)
  {
    if ((this.r != null) && (this.r.d()) && ((!db.b(ViewConfiguration.get(this.a))) || (this.r.f())))
    {
      parami = q();
      if ((!this.r.e()) || (!paramBoolean)) {
        if ((parami != null) && (!p()))
        {
          if ((this.E) && ((this.F & 0x1) != 0))
          {
            this.b.getDecorView().removeCallbacks(this.G);
            this.G.run();
          }
          bf localbf = a(0, true);
          if ((localbf.j != null) && (!localbf.r) && (parami.onPreparePanel(0, localbf.i, localbf.j)))
          {
            parami.onMenuOpened(108, localbf.j);
            this.r.g();
          }
        }
      }
      do
      {
        return;
        this.r.h();
      } while (p());
      parami.onPanelClosed(108, a(0, true).j);
      return;
    }
    parami = a(0, true);
    parami.q = true;
    a(parami, false);
    a(parami, null);
  }
  
  private boolean a(bf parambf)
  {
    parambf.a(n());
    parambf.g = new be(this, parambf.l);
    parambf.c = 81;
    return true;
  }
  
  private boolean a(bf parambf, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramKeyEvent.isSystem()) {
      bool2 = bool1;
    }
    do
    {
      do
      {
        do
        {
          return bool2;
          if (!parambf.m)
          {
            bool1 = bool2;
            if (!b(parambf, paramKeyEvent)) {}
          }
          else
          {
            bool1 = bool2;
            if (parambf.j != null) {
              bool1 = parambf.j.performShortcut(paramInt1, paramKeyEvent, paramInt2);
            }
          }
          bool2 = bool1;
        } while (!bool1);
        bool2 = bool1;
      } while ((paramInt2 & 0x1) != 0);
      bool2 = bool1;
    } while (this.r != null);
    a(parambf, true);
    return bool1;
  }
  
  private boolean a(ViewParent paramViewParent)
  {
    if (paramViewParent == null) {
      return false;
    }
    View localView = this.b.getDecorView();
    for (;;)
    {
      if (paramViewParent == null) {
        return true;
      }
      if ((paramViewParent == localView) || (!(paramViewParent instanceof View)) || (cb.H((View)paramViewParent))) {
        return false;
      }
      paramViewParent = paramViewParent.getParent();
    }
  }
  
  private void b(i parami)
  {
    if (this.A) {
      return;
    }
    this.A = true;
    this.r.j();
    Window.Callback localCallback = q();
    if ((localCallback != null) && (!p())) {
      localCallback.onPanelClosed(108, parami);
    }
    this.A = false;
  }
  
  private boolean b(bf parambf)
  {
    Context localContext = this.a;
    TypedValue localTypedValue;
    Resources.Theme localTheme;
    Object localObject1;
    if (((parambf.a == 0) || (parambf.a == 108)) && (this.r != null))
    {
      localTypedValue = new TypedValue();
      localTheme = localContext.getTheme();
      localTheme.resolveAttribute(R.attr.actionBarTheme, localTypedValue, true);
      localObject1 = null;
      if (localTypedValue.resourceId != 0)
      {
        localObject1 = localContext.getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
        ((Resources.Theme)localObject1).resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
        Object localObject2 = localObject1;
        if (localTypedValue.resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(localTypedValue.resourceId, true);
        }
        if (localObject2 == null) {
          break label203;
        }
        localObject1 = new e(localContext, 0);
        ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new i((Context)localObject1);
      ((i)localObject1).a(this);
      parambf.a((i)localObject1);
      return true;
      localTheme.resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
      break;
      label203:
      localObject1 = localContext;
    }
  }
  
  private boolean b(bf parambf, KeyEvent paramKeyEvent)
  {
    if (p()) {
      return false;
    }
    if (parambf.m) {
      return true;
    }
    if ((this.C != null) && (this.C != parambf)) {
      a(this.C, false);
    }
    Window.Callback localCallback = q();
    if (localCallback != null) {
      parambf.i = localCallback.onCreatePanelView(parambf.a);
    }
    if ((parambf.a == 0) || (parambf.a == 108)) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (this.r != null)) {
        this.r.i();
      }
      if ((parambf.i != null) || ((i != 0) && ((m() instanceof bk)))) {
        break label408;
      }
      if ((parambf.j != null) && (!parambf.r)) {
        break label278;
      }
      if ((parambf.j == null) && ((!b(parambf)) || (parambf.j == null))) {
        break;
      }
      if ((i != 0) && (this.r != null))
      {
        if (this.s == null) {
          this.s = new bb(this, null);
        }
        this.r.a(parambf.j, this.s);
      }
      parambf.j.g();
      if (localCallback.onCreatePanelMenu(parambf.a, parambf.j)) {
        break label273;
      }
      parambf.a(null);
      if ((i == 0) || (this.r == null)) {
        break;
      }
      this.r.a(null, this.s);
      return false;
    }
    label273:
    parambf.r = false;
    label278:
    parambf.j.g();
    if (parambf.s != null)
    {
      parambf.j.b(parambf.s);
      parambf.s = null;
    }
    if (!localCallback.onPreparePanel(0, parambf.i, parambf.j))
    {
      if ((i != 0) && (this.r != null)) {
        this.r.a(null, this.s);
      }
      parambf.j.h();
      return false;
    }
    if (paramKeyEvent != null)
    {
      i = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
        break label430;
      }
    }
    label408:
    label430:
    for (boolean bool = true;; bool = false)
    {
      parambf.p = bool;
      parambf.j.setQwertyMode(parambf.p);
      parambf.j.h();
      parambf.m = true;
      parambf.n = false;
      this.C = parambf;
      return true;
      i = -1;
      break;
    }
  }
  
  private boolean c(bf parambf)
  {
    if (parambf.i != null)
    {
      parambf.h = parambf.i;
      return true;
    }
    if (parambf.j == null) {
      return false;
    }
    if (this.t == null) {
      this.t = new bg(this, null);
    }
    parambf.h = ((View)parambf.a(this.t));
    if (parambf.h != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void d(int paramInt)
  {
    a(a(paramInt, true), true);
  }
  
  private boolean d(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getRepeatCount() == 0)
    {
      bf localbf = a(paramInt, true);
      if (!localbf.o) {
        return b(localbf, paramKeyEvent);
      }
    }
    return false;
  }
  
  private void e(int paramInt)
  {
    this.F |= 1 << paramInt;
    if (!this.E)
    {
      cb.a(this.b.getDecorView(), this.G);
      this.E = true;
    }
  }
  
  private boolean e(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = true;
    if (this.m != null) {
      return false;
    }
    bf localbf = a(paramInt, true);
    if ((paramInt == 0) && (this.r != null) && (this.r.d()) && (!db.b(ViewConfiguration.get(this.a)))) {
      if (!this.r.e())
      {
        if ((p()) || (!b(localbf, paramKeyEvent))) {
          break label229;
        }
        bool1 = this.r.g();
      }
    }
    for (;;)
    {
      if (bool1)
      {
        paramKeyEvent = (AudioManager)this.a.getSystemService("audio");
        if (paramKeyEvent == null) {
          break label216;
        }
        paramKeyEvent.playSoundEffect(0);
      }
      label122:
      return bool1;
      bool1 = this.r.h();
      continue;
      if ((!localbf.o) && (!localbf.n)) {
        break;
      }
      bool1 = localbf.o;
      a(localbf, true);
    }
    if (localbf.m)
    {
      if (!localbf.r) {
        break label234;
      }
      localbf.m = false;
    }
    label216:
    label229:
    label234:
    for (boolean bool1 = b(localbf, paramKeyEvent);; bool1 = true)
    {
      if (bool1)
      {
        a(localbf, paramKeyEvent);
        bool1 = bool2;
        break;
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
        break label122;
      }
      bool1 = false;
      break;
    }
  }
  
  private void f(int paramInt)
  {
    bf localbf = a(paramInt, true);
    if (localbf.j != null)
    {
      Bundle localBundle = new Bundle();
      localbf.j.a(localBundle);
      if (localBundle.size() > 0) {
        localbf.s = localBundle;
      }
      localbf.j.g();
      localbf.j.clear();
    }
    localbf.r = true;
    localbf.q = true;
    if (((paramInt == 108) || (paramInt == 0)) && (this.r != null))
    {
      localbf = a(0, false);
      if (localbf != null)
      {
        localbf.m = false;
        b(localbf, null);
      }
    }
  }
  
  private int g(int paramInt)
  {
    int j = 1;
    int k = 1;
    int i1 = 0;
    Object localObject1;
    Object localObject2;
    int i;
    if ((this.n != null) && ((this.n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject1 = (ViewGroup.MarginLayoutParams)this.n.getLayoutParams();
      if (this.n.isShown())
      {
        if (this.I == null)
        {
          this.I = new Rect();
          this.J = new Rect();
        }
        localObject2 = this.I;
        Rect localRect = this.J;
        ((Rect)localObject2).set(0, paramInt, 0, 0);
        hc.a(this.v, (Rect)localObject2, localRect);
        if (localRect.top == 0)
        {
          i = paramInt;
          if (((ViewGroup.MarginLayoutParams)localObject1).topMargin == i) {
            break label355;
          }
          ((ViewGroup.MarginLayoutParams)localObject1).topMargin = paramInt;
          if (this.x != null) {
            break label279;
          }
          this.x = new View(this.a);
          this.x.setBackgroundColor(this.a.getResources().getColor(R.color.abc_input_method_navigation_guard));
          this.v.addView(this.x, -1, new ViewGroup.LayoutParams(-1, paramInt));
          i = 1;
          label201:
          if (this.x == null) {
            break label317;
          }
          label208:
          j = paramInt;
          if (!this.j)
          {
            j = paramInt;
            if (k != 0) {
              j = 0;
            }
          }
          paramInt = j;
          j = i;
          i = k;
          label233:
          if (j != 0) {
            this.n.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
    }
    for (;;)
    {
      if (this.x != null)
      {
        localObject1 = this.x;
        if (i == 0) {
          break label342;
        }
      }
      label279:
      label317:
      label342:
      for (i = i1;; i = 8)
      {
        ((View)localObject1).setVisibility(i);
        return paramInt;
        i = 0;
        break;
        localObject2 = this.x.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject2).height != paramInt)
        {
          ((ViewGroup.LayoutParams)localObject2).height = paramInt;
          this.x.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        i = 1;
        break label201;
        k = 0;
        break label208;
        if (((ViewGroup.MarginLayoutParams)localObject1).topMargin == 0) {
          break label348;
        }
        ((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;
        i = 0;
        break label233;
      }
      label348:
      j = 0;
      i = 0;
      break label233;
      label355:
      i = 0;
      break label201;
      i = 0;
    }
  }
  
  private int h(int paramInt)
  {
    int i;
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      i = 108;
    }
    do
    {
      return i;
      i = paramInt;
    } while (paramInt != 9);
    Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
    return 109;
  }
  
  private void t()
  {
    if (!this.u)
    {
      this.v = u();
      Object localObject = r();
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        b((CharSequence)localObject);
      }
      v();
      a(this.v);
      this.u = true;
      localObject = a(0, false);
      if ((!p()) && ((localObject == null) || (((bf)localObject).j == null))) {
        e(108);
      }
    }
  }
  
  private ViewGroup u()
  {
    Object localObject = this.a.obtainStyledAttributes(R.styleable.AppCompatTheme);
    if (!((TypedArray)localObject).hasValue(R.styleable.AppCompatTheme_windowActionBar))
    {
      ((TypedArray)localObject).recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    if (((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false))
    {
      c(1);
      if (((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
        c(109);
      }
      if (((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
        c(10);
      }
      this.k = ((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
      ((TypedArray)localObject).recycle();
      this.b.getDecorView();
      localObject = LayoutInflater.from(this.a);
      if (this.l) {
        break label430;
      }
      if (!this.k) {
        break label271;
      }
      localObject = (ViewGroup)((LayoutInflater)localObject).inflate(R.layout.abc_dialog_title_material, null);
      this.i = false;
      this.h = false;
    }
    for (;;)
    {
      if (localObject == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h + ", windowActionBarOverlay: " + this.i + ", android:windowIsFloating: " + this.k + ", windowActionModeOverlay: " + this.j + ", windowNoTitle: " + this.l + " }");
        if (!((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_windowActionBar, false)) {
          break;
        }
        c(108);
        break;
        label271:
        if (!this.h) {
          break label638;
        }
        localObject = new TypedValue();
        this.a.getTheme().resolveAttribute(R.attr.actionBarTheme, (TypedValue)localObject, true);
        if (((TypedValue)localObject).resourceId != 0) {}
        for (localObject = new e(this.a, ((TypedValue)localObject).resourceId);; localObject = this.a)
        {
          localObject = (ViewGroup)LayoutInflater.from((Context)localObject).inflate(R.layout.abc_screen_toolbar, null);
          this.r = ((cc)((ViewGroup)localObject).findViewById(R.id.decor_content_parent));
          this.r.setWindowCallback(q());
          if (this.i) {
            this.r.a(109);
          }
          if (this.y) {
            this.r.a(2);
          }
          if (this.z) {
            this.r.a(5);
          }
          break;
        }
        label430:
        if (this.j) {}
        for (localObject = (ViewGroup)((LayoutInflater)localObject).inflate(R.layout.abc_screen_simple_overlay_action_mode, null);; localObject = (ViewGroup)((LayoutInflater)localObject).inflate(R.layout.abc_screen_simple, null))
        {
          if (Build.VERSION.SDK_INT < 21) {
            break label487;
          }
          cb.a((View)localObject, new av(this));
          break;
        }
        label487:
        ((cr)localObject).setOnFitSystemWindowsListener(new aw(this));
        continue;
      }
      if (this.r == null) {
        this.w = ((TextView)((ViewGroup)localObject).findViewById(R.id.title));
      }
      hc.b((View)localObject);
      ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)((ViewGroup)localObject).findViewById(R.id.action_bar_activity_content);
      ViewGroup localViewGroup = (ViewGroup)this.b.findViewById(16908290);
      if (localViewGroup != null)
      {
        while (localViewGroup.getChildCount() > 0)
        {
          View localView = localViewGroup.getChildAt(0);
          localViewGroup.removeViewAt(0);
          localContentFrameLayout.addView(localView);
        }
        localViewGroup.setId(-1);
        localContentFrameLayout.setId(16908290);
        if ((localViewGroup instanceof FrameLayout)) {
          ((FrameLayout)localViewGroup).setForeground(null);
        }
      }
      this.b.setContentView((View)localObject);
      localContentFrameLayout.setAttachListener(new ax(this));
      return (ViewGroup)localObject;
      label638:
      localObject = null;
    }
  }
  
  private void v()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)this.v.findViewById(16908290);
    Object localObject = this.b.getDecorView();
    localContentFrameLayout.a(((View)localObject).getPaddingLeft(), ((View)localObject).getPaddingTop(), ((View)localObject).getPaddingRight(), ((View)localObject).getPaddingBottom());
    localObject = this.a.obtainStyledAttributes(R.styleable.AppCompatTheme);
    ((TypedArray)localObject).getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, localContentFrameLayout.getMinWidthMajor());
    ((TypedArray)localObject).getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, localContentFrameLayout.getMinWidthMinor());
    if (((TypedArray)localObject).hasValue(R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
      ((TypedArray)localObject).getValue(R.styleable.AppCompatTheme_windowFixedWidthMajor, localContentFrameLayout.getFixedWidthMajor());
    }
    if (((TypedArray)localObject).hasValue(R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
      ((TypedArray)localObject).getValue(R.styleable.AppCompatTheme_windowFixedWidthMinor, localContentFrameLayout.getFixedWidthMinor());
    }
    if (((TypedArray)localObject).hasValue(R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
      ((TypedArray)localObject).getValue(R.styleable.AppCompatTheme_windowFixedHeightMajor, localContentFrameLayout.getFixedHeightMajor());
    }
    if (((TypedArray)localObject).hasValue(R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
      ((TypedArray)localObject).getValue(R.styleable.AppCompatTheme_windowFixedHeightMinor, localContentFrameLayout.getFixedHeightMinor());
    }
    ((TypedArray)localObject).recycle();
    localContentFrameLayout.requestLayout();
  }
  
  private void w()
  {
    if (this.q != null) {
      this.q.b();
    }
  }
  
  private void x()
  {
    if (this.u) {
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
  }
  
  private void y()
  {
    if (this.r != null) {
      this.r.j();
    }
    if (this.o != null)
    {
      this.b.getDecorView().removeCallbacks(this.p);
      if (!this.o.isShowing()) {}
    }
    try
    {
      this.o.dismiss();
      this.o = null;
      w();
      bf localbf = a(0, false);
      if ((localbf != null) && (localbf.j != null)) {
        localbf.j.close();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  b a(c paramc)
  {
    w();
    if (this.m != null) {
      this.m.c();
    }
    bc localbc = new bc(this, paramc);
    if ((this.e != null) && (!p())) {}
    for (;;)
    {
      try
      {
        b localb = this.e.a(localbc);
        if (localb != null)
        {
          this.m = localb;
          if ((this.m != null) && (this.e != null)) {
            this.e.a(this.m);
          }
          return this.m;
        }
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        localObject1 = null;
        continue;
        Object localObject2;
        if (this.n == null)
        {
          if (!this.k) {
            continue;
          }
          localObject2 = new TypedValue();
          localObject1 = this.a.getTheme();
          ((Resources.Theme)localObject1).resolveAttribute(R.attr.actionBarTheme, (TypedValue)localObject2, true);
          if (((TypedValue)localObject2).resourceId != 0)
          {
            Resources.Theme localTheme = this.a.getResources().newTheme();
            localTheme.setTo((Resources.Theme)localObject1);
            localTheme.applyStyle(((TypedValue)localObject2).resourceId, true);
            localObject1 = new e(this.a, 0);
            ((Context)localObject1).getTheme().setTo(localTheme);
            this.n = new ActionBarContextView((Context)localObject1);
            this.o = new PopupWindow((Context)localObject1, null, R.attr.actionModePopupWindowStyle);
            bd.a(this.o, 2);
            this.o.setContentView(this.n);
            this.o.setWidth(-1);
            ((Context)localObject1).getTheme().resolveAttribute(R.attr.actionBarSize, (TypedValue)localObject2, true);
            int i = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject2).data, ((Context)localObject1).getResources().getDisplayMetrics());
            this.n.setContentHeight(i);
            this.o.setHeight(-2);
            this.p = new ay(this);
          }
        }
        else
        {
          if (this.n == null) {
            continue;
          }
          w();
          this.n.c();
          localObject1 = this.n.getContext();
          localObject2 = this.n;
          if (this.o != null) {
            continue;
          }
          bool = true;
          localObject1 = new f((Context)localObject1, (ActionBarContextView)localObject2, localbc, bool);
          if (!paramc.a((b)localObject1, ((b)localObject1).b())) {
            continue;
          }
          ((b)localObject1).d();
          this.n.a((b)localObject1);
          this.m = ((b)localObject1);
          cb.c(this.n, 0.0F);
          this.q = cb.s(this.n).a(1.0F);
          this.q.a(new ba(this));
          if (this.o == null) {
            continue;
          }
          this.b.getDecorView().post(this.p);
          continue;
        }
        localObject1 = this.a;
        continue;
        localObject1 = (ViewStubCompat)this.v.findViewById(R.id.action_mode_bar_stub);
        if (localObject1 == null) {
          continue;
        }
        ((ViewStubCompat)localObject1).setLayoutInflater(LayoutInflater.from(n()));
        this.n = ((ActionBarContextView)((ViewStubCompat)localObject1).a());
        continue;
        boolean bool = false;
        continue;
        this.m = null;
        continue;
      }
      Object localObject1 = null;
    }
  }
  
  public View a(int paramInt)
  {
    t();
    return this.b.findViewById(paramInt);
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = b(paramView, paramString, paramContext, paramAttributeSet);
    if (localView != null) {
      return localView;
    }
    return c(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  void a(int paramInt, Menu paramMenu)
  {
    if (paramInt == 108)
    {
      paramMenu = a();
      if (paramMenu != null) {
        paramMenu.h(false);
      }
    }
    do
    {
      do
      {
        return;
      } while (paramInt != 0);
      paramMenu = a(paramInt, true);
    } while (!paramMenu.o);
    a(paramMenu, false);
  }
  
  public void a(Configuration paramConfiguration)
  {
    if ((this.h) && (this.u))
    {
      a locala = a();
      if (locala != null) {
        locala.a(paramConfiguration);
      }
    }
    i();
  }
  
  public void a(Bundle paramBundle)
  {
    if (((this.c instanceof Activity)) && (bh.b((Activity)this.c) != null))
    {
      paramBundle = m();
      if (paramBundle == null) {
        this.H = true;
      }
    }
    else
    {
      return;
    }
    paramBundle.f(true);
  }
  
  public void a(i parami)
  {
    a(parami, true);
  }
  
  public void a(Toolbar paramToolbar)
  {
    if (!(this.c instanceof Activity)) {
      return;
    }
    a locala = a();
    if ((locala instanceof bv)) {
      throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    this.g = null;
    if (locala != null) {
      locala.h();
    }
    if (paramToolbar != null)
    {
      paramToolbar = new bk(paramToolbar, ((Activity)this.a).getTitle(), this.d);
      this.f = paramToolbar;
      this.b.setCallback(paramToolbar.i());
    }
    for (;;)
    {
      e();
      return;
      this.f = null;
      this.b.setCallback(this.d);
    }
  }
  
  public void a(View paramView)
  {
    t();
    ViewGroup localViewGroup = (ViewGroup)this.v.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.c.onContentChanged();
  }
  
  public void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    t();
    ViewGroup localViewGroup = (ViewGroup)this.v.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void a(ViewGroup paramViewGroup) {}
  
  boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = a();
    if ((localObject != null) && (((a)localObject).a(paramInt, paramKeyEvent))) {}
    boolean bool;
    do
    {
      do
      {
        return true;
        if ((this.C == null) || (!a(this.C, paramKeyEvent.getKeyCode(), paramKeyEvent, 1))) {
          break;
        }
      } while (this.C == null);
      this.C.n = true;
      return true;
      if (this.C != null) {
        break;
      }
      localObject = a(0, true);
      b((bf)localObject, paramKeyEvent);
      bool = a((bf)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
      ((bf)localObject).m = false;
    } while (bool);
    return false;
  }
  
  public boolean a(i parami, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = q();
    if ((localCallback != null) && (!p()))
    {
      parami = a(parami.p());
      if (parami != null) {
        return localCallback.onMenuItemSelected(parami.a, paramMenuItem);
      }
    }
    return false;
  }
  
  boolean a(KeyEvent paramKeyEvent)
  {
    int i = 1;
    if ((paramKeyEvent.getKeyCode() == 82) && (this.c.dispatchKeyEvent(paramKeyEvent))) {
      return true;
    }
    int j = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() == 0) {}
    while (i != 0)
    {
      return c(j, paramKeyEvent);
      i = 0;
    }
    return b(j, paramKeyEvent);
  }
  
  public b b(c paramc)
  {
    if (paramc == null) {
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    }
    if (this.m != null) {
      this.m.c();
    }
    paramc = new bc(this, paramc);
    a locala = a();
    if (locala != null)
    {
      this.m = locala.a(paramc);
      if ((this.m != null) && (this.e != null)) {
        this.e.a(this.m);
      }
    }
    if (this.m == null) {
      this.m = a(paramc);
    }
    return this.m;
  }
  
  View b(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((this.c instanceof LayoutInflater.Factory))
    {
      paramView = ((LayoutInflater.Factory)this.c).onCreateView(paramString, paramContext, paramAttributeSet);
      if (paramView != null) {
        return paramView;
      }
    }
    return null;
  }
  
  public void b(int paramInt)
  {
    t();
    ViewGroup localViewGroup = (ViewGroup)this.v.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.a).inflate(paramInt, localViewGroup);
    this.c.onContentChanged();
  }
  
  public void b(Bundle paramBundle)
  {
    t();
  }
  
  public void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    t();
    ((ViewGroup)this.v.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void b(CharSequence paramCharSequence)
  {
    if (this.r != null) {
      this.r.setWindowTitle(paramCharSequence);
    }
    do
    {
      return;
      if (m() != null)
      {
        m().a(paramCharSequence);
        return;
      }
    } while (this.w == null);
    this.w.setText(paramCharSequence);
  }
  
  boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    switch (paramInt)
    {
    }
    do
    {
      bool1 = false;
      boolean bool2;
      do
      {
        return bool1;
        e(0, paramKeyEvent);
        return true;
        bool2 = this.D;
        this.D = false;
        paramKeyEvent = a(0, false);
        if ((paramKeyEvent == null) || (!paramKeyEvent.o)) {
          break;
        }
      } while (bool2);
      a(paramKeyEvent, true);
      return true;
    } while (!s());
    return true;
  }
  
  boolean b(int paramInt, Menu paramMenu)
  {
    if (paramInt == 108)
    {
      paramMenu = a();
      if (paramMenu != null) {
        paramMenu.h(true);
      }
      return true;
    }
    return false;
  }
  
  public View c(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    boolean bool1;
    if (Build.VERSION.SDK_INT < 21)
    {
      bool1 = true;
      if (this.K == null) {
        this.K = new bi();
      }
      if ((!bool1) || (!a((ViewParent)paramView))) {
        break label75;
      }
    }
    label75:
    for (boolean bool2 = true;; bool2 = false)
    {
      return this.K.a(paramView, paramString, paramContext, paramAttributeSet, bool2, bool1, true, gx.a());
      bool1 = false;
      break;
    }
  }
  
  public void c()
  {
    a locala = a();
    if (locala != null) {
      locala.g(false);
    }
  }
  
  public boolean c(int paramInt)
  {
    paramInt = h(paramInt);
    if ((this.l) && (paramInt == 108)) {
      return false;
    }
    if ((this.h) && (paramInt == 1)) {
      this.h = false;
    }
    switch (paramInt)
    {
    default: 
      return this.b.requestFeature(paramInt);
    case 108: 
      x();
      this.h = true;
      return true;
    case 109: 
      x();
      this.i = true;
      return true;
    case 10: 
      x();
      this.j = true;
      return true;
    case 2: 
      x();
      this.y = true;
      return true;
    case 5: 
      x();
      this.z = true;
      return true;
    }
    x();
    this.l = true;
    return true;
  }
  
  boolean c(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default: 
      if (Build.VERSION.SDK_INT < 11) {
        a(paramInt, paramKeyEvent);
      }
      return false;
    case 82: 
      d(0, paramKeyEvent);
      return true;
    }
    if ((paramKeyEvent.getFlags() & 0x80) != 0) {}
    for (;;)
    {
      this.D = bool;
      break;
      bool = false;
    }
  }
  
  public void d()
  {
    a locala = a();
    if (locala != null) {
      locala.g(true);
    }
  }
  
  public void e()
  {
    a locala = a();
    if ((locala != null) && (locala.e())) {
      return;
    }
    e(0);
  }
  
  public void f()
  {
    super.f();
    if (this.f != null) {
      this.f.h();
    }
  }
  
  public void h()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.a);
    if (localLayoutInflater.getFactory() == null) {
      ah.a(localLayoutInflater, this);
    }
    while ((ah.a(localLayoutInflater) instanceof at)) {
      return;
    }
    Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
  }
  
  public void l()
  {
    t();
    if ((!this.h) || (this.f != null)) {}
    for (;;)
    {
      return;
      if ((this.c instanceof Activity)) {
        this.f = new bv((Activity)this.c, this.i);
      }
      while (this.f != null)
      {
        this.f.f(this.H);
        return;
        if ((this.c instanceof Dialog)) {
          this.f = new bv((Dialog)this.c);
        }
      }
    }
  }
  
  boolean s()
  {
    if (this.m != null) {
      this.m.c();
    }
    a locala;
    do
    {
      return true;
      locala = a();
    } while ((locala != null) && (locala.f()));
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */