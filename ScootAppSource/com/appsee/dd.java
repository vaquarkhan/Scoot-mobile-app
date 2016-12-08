package com.appsee;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
class dd
  implements d
{
  private static final String E = "video/avc";
  private static final int i = 1000000;
  private long A;
  private String B;
  private qi D = bc.C().C(sb.C("\032;\025-,\0005\0131\035*\001-"));
  private int F;
  private MediaCodec.BufferInfo G;
  private qi H = bc.C().C(qc.C("M5q5B:d;c=i3"));
  private boolean I;
  private ByteBuffer[] J;
  private MediaCodec K;
  private int M;
  private int a = -1;
  private MediaFormat b;
  private boolean c;
  private ByteBuffer[] d;
  private String e;
  private qi f = bc.C().C(qc.C("\021i7h0b\035j5`1"));
  private ByteBuffer g;
  private int h;
  private FileChannel j;
  private boolean k = false;
  private List<Long> l = new ArrayList();
  private int m;
  
  public static List<String> C()
  {
    int i3 = MediaCodecList.getCodecCount();
    ArrayList localArrayList = new ArrayList(i3);
    int i1 = 0;
    int n = 0;
    if (i1 < i3)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(n);
      if ((!localMediaCodecInfo.isEncoder()) || (C(localMediaCodecInfo.getName()))) {}
      label108:
      for (;;)
      {
        i1 = n + 1;
        n = i1;
        break;
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        i1 = 0;
        for (int i2 = 0;; i2 = i1)
        {
          if (i1 >= arrayOfString.length) {
            break label108;
          }
          if (arrayOfString[i2].equalsIgnoreCase("video/avc"))
          {
            localArrayList.add(localMediaCodecInfo.getName());
            break;
          }
          i1 = i2 + 1;
        }
      }
    }
    return localArrayList;
  }
  
  public void C()
  {
    if (this.K == null) {
      throw new Exception(sb.C("+-\r,\n&\034c\0070N-\033/\002b"));
    }
    a();
    this.D.C();
    this.H.C();
    this.f.C();
    vd.H(1, qc.C("T h$w=i3'1i7h0b&"));
    this.K.stop();
    this.K.release();
    if (this.j != null)
    {
      vd.H(1, sb.C("(/\0330\006*\000$N+\\uZc\b*\002&"));
      this.j.close();
    }
    try
    {
      this.c = true;
      qi localqi = bc.C().C(qc.C("J!=i3"));
      localqi.K();
      H();
      localqi.H();
      localqi.C();
      return;
    }
    finally
    {
      this.c = false;
    }
  }
  
  public void C(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean)
  {
    vd.H(1, sb.C("\n\000*\032*\017/\0079\013c\004\"\030\"N5\007'\013,N&\000 \001'\0131"));
    this.F = paramInt1;
    this.M = paramInt2;
    this.m = paramInt3;
    this.h = paramInt4;
    this.B = paramString;
    this.e = String.format(qc.C("qtz\"'"), new Object[] { ye.C().a(), "h264" });
    this.I = paramBoolean;
    this.G = new MediaCodec.BufferInfo();
    this.l.clear();
    K();
  }
  
  public void C(bd parambd, long paramLong)
  {
    this.f.K();
    if (this.I) {
      vd.H(1, sb.C("+-\r,\n*\000$N%\034\"\003&"));
    }
    C(parambd);
    this.H.K();
    C(paramLong);
    if (this.I) {
      vd.H(1, qc.C("C&f=i=i3'1i7h0b&"));
    }
    C(false);
    this.H.H();
    this.f.H();
  }
  
  public boolean C()
  {
    return this.c;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */