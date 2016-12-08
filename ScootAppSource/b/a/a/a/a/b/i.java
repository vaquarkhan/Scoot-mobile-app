package b.a.a.a.a.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.a.a.a.f;
import b.a.a.a.t;

final class i
  implements IInterface
{
  private final IBinder a;
  
  public i(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public String a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    catch (Exception localException)
    {
      f.h().a("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
      return null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: aload_3
    //   12: ldc 27
    //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_3
    //   18: iconst_1
    //   19: invokevirtual 69	android/os/Parcel:writeInt	(I)V
    //   22: aload_0
    //   23: getfield 15	b/a/a/a/a/b/i:a	Landroid/os/IBinder;
    //   26: iconst_2
    //   27: aload_3
    //   28: aload 4
    //   30: iconst_0
    //   31: invokeinterface 37 5 0
    //   36: pop
    //   37: aload 4
    //   39: invokevirtual 40	android/os/Parcel:readException	()V
    //   42: aload 4
    //   44: invokevirtual 73	android/os/Parcel:readInt	()I
    //   47: istore_1
    //   48: iload_1
    //   49: ifeq +14 -> 63
    //   52: aload 4
    //   54: invokevirtual 46	android/os/Parcel:recycle	()V
    //   57: aload_3
    //   58: invokevirtual 46	android/os/Parcel:recycle	()V
    //   61: iload_2
    //   62: ireturn
    //   63: iconst_0
    //   64: istore_2
    //   65: goto -13 -> 52
    //   68: astore 5
    //   70: invokestatic 52	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   73: ldc 54
    //   75: ldc 75
    //   77: invokeinterface 61 3 0
    //   82: aload 4
    //   84: invokevirtual 46	android/os/Parcel:recycle	()V
    //   87: aload_3
    //   88: invokevirtual 46	android/os/Parcel:recycle	()V
    //   91: iconst_0
    //   92: ireturn
    //   93: astore 5
    //   95: aload 4
    //   97: invokevirtual 46	android/os/Parcel:recycle	()V
    //   100: aload_3
    //   101: invokevirtual 46	android/os/Parcel:recycle	()V
    //   104: aload 5
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	i
    //   47	2	1	i	int
    //   1	64	2	bool	boolean
    //   5	96	3	localParcel1	Parcel
    //   9	87	4	localParcel2	Parcel
    //   68	1	5	localException	Exception
    //   93	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	48	68	java/lang/Exception
    //   11	48	93	finally
    //   70	82	93	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */