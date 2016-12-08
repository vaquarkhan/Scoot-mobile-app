package com.appsee;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build.VERSION;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.HashMap;

@TargetApi(18)
class pb
  implements d
{
  private String A;
  private int B;
  private qi D = bc.C().C(bc.C("\017\001.\022=\0279>=\002=12\0273\0205\032;"));
  private HashMap<Long, Long> E = new HashMap();
  private qi F = bc.C().C(bc.C("7=\032*\025/73\032*\021.\0075\0332"));
  private int G;
  private Rect H;
  private int M;
  private MediaCodec.BufferInfo b;
  private Surface c;
  private boolean d;
  private MediaMuxer e;
  private long f;
  private qi g = bc.C().C(bc.C("\031\032?\0338\021\025\031=\0239"));
  private int h;
  private ByteBuffer[] i;
  private long j;
  private MediaCodec k;
  private MediaFormat l;
  private int m;
  
  @TargetApi(21)
  public void C()
  {
    this.F.C();
    this.D.C();
    this.g.C();
    if (this.k != null)
    {
      vd.H(1, bc.C("\013\0065\0005\032;T\031;\017"));
      this.k.signalEndOfInputStream();
      C(true);
      vd.C(1, bc.C("\017\0003\004,\0352\023|\0212\0273\0209\006|\\y\020u"), new Object[] { Integer.valueOf(this.E.size()) });
      if ((Build.VERSION.SDK_INT >= 21) && (!ye.C().D())) {
        this.k.reset();
      }
      this.k.stop();
      this.k.release();
    }
    if (this.e != null)
    {
      this.e.stop();
      this.e.release();
    }
    if (this.c != null) {
      this.c.release();
    }
    this.i = null;
    this.k = null;
    this.l = null;
    this.c = null;
    this.e = null;
    this.b = null;
  }
  
  public void C(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean)
  {
    vd.H(1, bc.C("=2\035(\035=\0305\0169T/\001.\022=\0279T*\0358\0213T9\032?\0338\021."));
    this.h = paramInt1;
    this.m = paramInt2;
    this.H = new Rect(0, 0, this.h, this.m);
    this.G = paramInt3;
    this.M = paramInt4;
    this.A = paramString;
    this.d = paramBoolean;
    this.b = new MediaCodec.BufferInfo();
    this.E.clear();
    this.f = 0L;
    this.j = 0L;
    a();
  }
  
  public void C(bd parambd, long paramLong)
  {
    Object localObject = null;
    this.g.K();
    if (this.d) {
      vd.H(1, bc.C("39\000(\0352\023|\0212\0273\0209\006|\027=\032*\025/"));
    }
    if (!this.c.isValid()) {
      return;
    }
    try
    {
      Canvas localCanvas = this.c.lockCanvas(this.H);
      localObject = localCanvas;
      if (this.d)
      {
        localObject = localCanvas;
        vd.H(1, bc.C("\030\006=\0035\032;T3\032|\0212\0273\0209\006|\027=\032*\025/"));
      }
      localObject = localCanvas;
      this.F.K();
      localObject = localCanvas;
      localCanvas.drawColor(-16777216);
      localObject = localCanvas;
      localCanvas.drawBitmap(parambd.C(), 0.0F, 0.0F, null);
      localObject = localCanvas;
      this.F.H();
      this.c.unlockCanvasAndPost(localCanvas);
      parambd = this.E;
      long l1 = this.j;
      this.j = (1L + l1);
      parambd.put(Long.valueOf(l1), Long.valueOf(paramLong));
      if (this.d) {
        vd.H(1, bc.C("0.\0255\0325\032;T9\032?\0338\021."));
      }
      this.D.K();
      C(false);
      this.D.H();
      this.g.H();
      return;
    }
    finally
    {
      this.c.unlockCanvasAndPost((Canvas)localObject);
    }
  }
  
  public boolean C()
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */