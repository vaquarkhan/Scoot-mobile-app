package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.g.q;
import android.support.v4.g.r;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class aa
  extends v
  implements c, e
{
  final Handler a = new ab(this);
  final af b = af.a(new ac(this));
  boolean c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  boolean i;
  int j;
  boolean k;
  r<String> l;
  
  private static String a(View paramView)
  {
    char c3 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    char c1;
    label118:
    label135:
    label152:
    label169:
    label186:
    label203:
    label220:
    label244:
    label261:
    int m;
    Object localObject;
    switch (paramView.getVisibility())
    {
    default: 
      localStringBuilder.append('.');
      if (paramView.isFocusable())
      {
        c1 = 'F';
        localStringBuilder.append(c1);
        if (!paramView.isEnabled()) {
          break label562;
        }
        c1 = 'E';
        localStringBuilder.append(c1);
        if (!paramView.willNotDraw()) {
          break label568;
        }
        c1 = '.';
        localStringBuilder.append(c1);
        if (!paramView.isHorizontalScrollBarEnabled()) {
          break label574;
        }
        c1 = 'H';
        localStringBuilder.append(c1);
        if (!paramView.isVerticalScrollBarEnabled()) {
          break label580;
        }
        c1 = 'V';
        localStringBuilder.append(c1);
        if (!paramView.isClickable()) {
          break label586;
        }
        c1 = 'C';
        localStringBuilder.append(c1);
        if (!paramView.isLongClickable()) {
          break label592;
        }
        c1 = 'L';
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        if (!paramView.isFocused()) {
          break label598;
        }
        c1 = c3;
        localStringBuilder.append(c1);
        if (!paramView.isSelected()) {
          break label604;
        }
        c1 = 'S';
        localStringBuilder.append(c1);
        c1 = c2;
        if (paramView.isPressed()) {
          c1 = 'P';
        }
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        m = paramView.getId();
        if (m != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(m));
          localObject = paramView.getResources();
          if ((m != 0) && (localObject != null)) {
            switch (0xFF000000 & m)
            {
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(m);
        String str = ((Resources)localObject).getResourceTypeName(m);
        localObject = ((Resources)localObject).getResourceEntryName(m);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(":");
        localStringBuilder.append(str);
        localStringBuilder.append("/");
        localStringBuilder.append((String)localObject);
      }
      catch (Resources.NotFoundException paramView)
      {
        label562:
        label568:
        label574:
        label580:
        label586:
        label592:
        label598:
        label604:
        continue;
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append('V');
      break;
      localStringBuilder.append('I');
      break;
      localStringBuilder.append('G');
      break;
      c1 = '.';
      break label118;
      c1 = '.';
      break label135;
      c1 = 'D';
      break label152;
      c1 = '.';
      break label169;
      c1 = '.';
      break label186;
      c1 = '.';
      break label203;
      c1 = '.';
      break label220;
      c1 = '.';
      break label244;
      c1 = '.';
      break label261;
      paramView = "app";
      continue;
      paramView = "android";
    }
  }
  
  private void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    if (paramInt == -1)
    {
      a.a(this, paramArrayOfString, paramInt);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    try
    {
      this.i = true;
      a.a(this, paramArrayOfString, (b(paramFragment) + 1 << 16) + (0xFFFF & paramInt));
      return;
    }
    finally
    {
      this.i = false;
    }
  }
  
  private void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null) {
      paramPrintWriter.println("null");
    }
    for (;;)
    {
      return;
      paramPrintWriter.println(a(paramView));
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int n = paramView.getChildCount();
        if (n > 0)
        {
          paramString = paramString + "  ";
          int m = 0;
          while (m < n)
          {
            a(paramString, paramPrintWriter, paramView.getChildAt(m));
            m += 1;
          }
        }
      }
    }
  }
  
  private int b(Fragment paramFragment)
  {
    if (this.l.b() >= 65534) {
      throw new IllegalStateException("Too many pending Fragment activity results.");
    }
    while (this.l.f(this.j) >= 0) {
      this.j = ((this.j + 1) % 65534);
    }
    int m = this.j;
    this.l.b(m, paramFragment.q);
    this.j = ((this.j + 1) % 65534);
    return m;
  }
  
  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.b.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void a(Fragment paramFragment) {}
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    this.k = true;
    if (paramInt == -1) {}
    try
    {
      a.a(this, paramIntent, -1, paramBundle);
      return;
    }
    finally
    {
      this.k = false;
    }
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    a.a(this, paramIntent, (b(paramFragment) + 1 << 16) + (0xFFFF & paramInt), paramBundle);
    this.k = false;
  }
  
  void a(boolean paramBoolean)
  {
    if (!this.f)
    {
      this.f = true;
      this.g = paramBoolean;
      this.a.removeMessages(1);
      e();
    }
  }
  
  protected boolean a(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  protected void a_()
  {
    this.b.i();
  }
  
  public final void b_(int paramInt)
  {
    if ((!this.i) && (paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
  }
  
  public Object c()
  {
    return null;
  }
  
  public void d()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      f.a(this);
      return;
    }
    this.h = true;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.d);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.e);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.f);
    this.b.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    this.b.a().a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }
  
  void e()
  {
    this.b.a(this.g);
    this.b.l();
  }
  
  public ah f()
  {
    return this.b.a();
  }
  
  public bd g()
  {
    return this.b.b();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.b.c();
    int m = paramInt1 >> 16;
    if (m != 0)
    {
      m -= 1;
      String str = (String)this.l.a(m);
      this.l.c(m);
      if (str == null)
      {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        return;
      }
      Fragment localFragment = this.b.a(str);
      if (localFragment == null)
      {
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
        return;
      }
      localFragment.a(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    if (!this.b.a().c()) {
      b_();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.b.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.b.a(null);
    super.onCreate(paramBundle);
    Object localObject = (ad)getLastNonConfigurationInstance();
    if (localObject != null) {
      this.b.a(((ad)localObject).c);
    }
    if (paramBundle != null)
    {
      Parcelable localParcelable = paramBundle.getParcelable("android:support:fragments");
      af localaf = this.b;
      if (localObject == null) {
        break label165;
      }
      localObject = ((ad)localObject).b;
      localaf.a(localParcelable, (List)localObject);
      if (paramBundle.containsKey("android:support:next_request_index"))
      {
        this.j = paramBundle.getInt("android:support:next_request_index");
        localObject = paramBundle.getIntArray("android:support:request_indicies");
        paramBundle = paramBundle.getStringArray("android:support:request_fragment_who");
        if ((localObject != null) && (paramBundle != null) && (localObject.length == paramBundle.length)) {
          break label170;
        }
        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
      }
    }
    for (;;)
    {
      if (this.l == null)
      {
        this.l = new r();
        this.j = 0;
      }
      this.b.f();
      return;
      label165:
      localObject = null;
      break;
      label170:
      this.l = new r(localObject.length);
      int m = 0;
      while (m < localObject.length)
      {
        this.l.b(localObject[m], paramBundle[m]);
        m += 1;
      }
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      boolean bool2 = this.b.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT >= 11) {
        return bool1 | bool2;
      }
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    a(false);
    this.b.m();
    this.b.q();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.b.n();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 0: 
      return this.b.a(paramMenuItem);
    }
    return this.b.b(paramMenuItem);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.b.c();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.b.b(paramMenu);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    this.d = false;
    if (this.a.hasMessages(2))
    {
      this.a.removeMessages(2);
      a_();
    }
    this.b.j();
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    this.a.removeMessages(2);
    a_();
    this.b.o();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.h)
      {
        this.h = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return a(paramView, paramMenu) | this.b.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int m = paramInt >> 16 & 0xFFFF;
    String str;
    if (m != 0)
    {
      m -= 1;
      str = (String)this.l.a(m);
      this.l.c(m);
      if (str == null) {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
      }
    }
    else
    {
      return;
    }
    Fragment localFragment = this.b.a(str);
    if (localFragment == null)
    {
      Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
      return;
    }
    localFragment.a(paramInt & 0xFFFF, paramArrayOfString, paramArrayOfInt);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.a.sendEmptyMessage(2);
    this.d = true;
    this.b.o();
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    if (this.e) {
      a(true);
    }
    Object localObject = c();
    List localList = this.b.e();
    q localq = this.b.s();
    if ((localList == null) && (localq == null) && (localObject == null)) {
      return null;
    }
    ad localad = new ad();
    localad.a = localObject;
    localad.b = localList;
    localad.c = localq;
    return localad;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = this.b.d();
    if (localObject != null) {
      paramBundle.putParcelable("android:support:fragments", (Parcelable)localObject);
    }
    if (this.l.b() > 0)
    {
      paramBundle.putInt("android:support:next_request_index", this.j);
      localObject = new int[this.l.b()];
      String[] arrayOfString = new String[this.l.b()];
      int m = 0;
      while (m < this.l.b())
      {
        localObject[m] = this.l.d(m);
        arrayOfString[m] = ((String)this.l.e(m));
        m += 1;
      }
      paramBundle.putIntArray("android:support:request_indicies", (int[])localObject);
      paramBundle.putStringArray("android:support:request_fragment_who", arrayOfString);
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    this.e = false;
    this.f = false;
    this.a.removeMessages(1);
    if (!this.c)
    {
      this.c = true;
      this.b.g();
    }
    this.b.c();
    this.b.o();
    this.b.p();
    this.b.h();
    this.b.r();
  }
  
  public void onStateNotSaved()
  {
    this.b.c();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.e = true;
    this.a.sendEmptyMessage(1);
    this.b.k();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((!this.k) && (paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */