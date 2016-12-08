package com.appsee;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.Build.VERSION;
import android.view.Surface;
import java.io.InvalidObjectException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
class xn
  implements d
{
  private int A;
  private CountDownLatch B;
  private int D;
  private yl E;
  private qi F = bc.C().C(wc.C("s\032U\033R\021\031W\023S"));
  private MediaMuxer G;
  private long H;
  private String M;
  private HashMap<Long, Long> b = new HashMap();
  private int c;
  private qi d = bc.C().C(mb.C("\007f*q%t\007h*q!u7n+i"));
  private qi e = bc.C().C(wc.C("e\001D\022W\027S>W\002W1X\027Y\020_\032Q"));
  private int f;
  private int g;
  private Surface h;
  private nn i;
  private boolean j;
  private MediaCodec k;
  private Rect l;
  private long m;
  
  public void C()
  {
    this.d.C();
    this.e.C();
    this.F.C();
    if (this.k != null)
    {
      vd.H(1, mb.C("P6n0n*`dB\013T"));
      this.k.signalEndOfInputStream();
      if (!this.B.await(10L, TimeUnit.SECONDS)) {
        vd.C(2, wc.C(" _\031S\020\026\033C\000\026\022Y\006\026\003W\000_\032QT@\035R\021YTs;eTB\033\026\026STA\006_\000B\021X"));
      }
      vd.C(1, mb.C("T0h4w-i#'!i'h b6'l\" ."), new Object[] { Integer.valueOf(this.b.size()) });
      if (!ye.C().D())
      {
        this.E.C();
        this.k.reset();
      }
      this.k.stop();
      this.k.release();
      this.E = null;
    }
    if (this.G != null)
    {
      this.G.stop();
      this.G.release();
    }
    if (this.h != null) {
      this.h.release();
    }
    if (this.i != null)
    {
      this.i.a();
      this.i = null;
    }
    this.k = null;
    this.h = null;
    this.G = null;
  }
  
  public void C(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean)
  {
    vd.H(1, wc.C("\032_\000_\025Z\035L\021\0268Y\030Z\035F\033FTW\007O\032UTE\001D\022W\027ST@\035R\021YTS\032U\033R\021D"));
    if (Build.VERSION.SDK_INT < 21) {
      throw new InvalidObjectException(mb.C("\bh(k-w+w\022n b+B*d+c!udd%i*h0'&bdn*t0f*d-f0bdh*'(h3b6'%i u+n '2b6t-h*t"));
    }
    this.A = paramInt1;
    this.g = paramInt2;
    this.l = new Rect(0, 0, this.A, this.g);
    this.D = paramInt3;
    this.f = paramInt4;
    this.M = paramString;
    this.j = paramBoolean;
    this.b.clear();
    this.H = 0L;
    this.m = 0L;
    this.i = new nn(this);
    this.i.start();
    this.i.H();
  }
  
  public void C(bd parambd, long paramLong)
  {
    Object localObject = null;
    this.F.K();
    if (this.j) {
      vd.H(1, mb.C("\003b0s-i#'!i'h b6''f*q%t"));
    }
    if (!this.h.isValid()) {
      return;
    }
    try
    {
      Canvas localCanvas = this.h.lockCanvas(this.l);
      localObject = localCanvas;
      if (this.j)
      {
        localObject = localCanvas;
        vd.H(1, wc.C("r\006W\003_\032QTY\032\026\021X\027Y\020S\006\026\027W\032@\025E"));
      }
      localObject = localCanvas;
      this.d.K();
      localObject = localCanvas;
      localCanvas.drawColor(-16777216);
      localObject = localCanvas;
      localCanvas.drawBitmap(parambd.C(), 0.0F, 0.0F, null);
      localObject = localCanvas;
      this.d.H();
      this.h.unlockCanvasAndPost(localCanvas);
      parambd = this.b;
      long l1 = this.m;
      this.m = (1L + l1);
      parambd.put(Long.valueOf(l1), Long.valueOf(paramLong));
      this.F.H();
      return;
    }
    finally
    {
      this.h.unlockCanvasAndPost((Canvas)localObject);
    }
  }
  
  public boolean C()
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */