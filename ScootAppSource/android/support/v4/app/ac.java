package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class ac
  extends ag<aa>
{
  public ac(aa paramaa)
  {
    super(paramaa);
  }
  
  public View a(int paramInt)
  {
    return this.a.findViewById(paramInt);
  }
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    this.a.a(paramFragment, paramIntent, paramInt, paramBundle);
  }
  
  public void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    aa.a(this.a, paramFragment, paramArrayOfString, paramInt);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.a.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public boolean a()
  {
    Window localWindow = this.a.getWindow();
    return (localWindow != null) && (localWindow.peekDecorView() != null);
  }
  
  public boolean a(Fragment paramFragment)
  {
    return !this.a.isFinishing();
  }
  
  public LayoutInflater b()
  {
    return this.a.getLayoutInflater().cloneInContext(this.a);
  }
  
  public void b(Fragment paramFragment)
  {
    this.a.a(paramFragment);
  }
  
  public void c()
  {
    this.a.d();
  }
  
  public boolean d()
  {
    return this.a.getWindow() != null;
  }
  
  public int e()
  {
    Window localWindow = this.a.getWindow();
    if (localWindow == null) {
      return 0;
    }
    return localWindow.getAttributes().windowAnimations;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */