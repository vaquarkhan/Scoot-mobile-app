package com.google.android.gms.maps.model.a;

import android.os.IBinder;

final class aa
  implements y
{
  private IBinder a;
  
  aa(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public com.google.android.gms.maps.model.Tile a(int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 5
    //   5: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 6
    //   10: aload 5
    //   12: ldc 25
    //   14: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 5
    //   19: iload_1
    //   20: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   23: aload 5
    //   25: iload_2
    //   26: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   29: aload 5
    //   31: iload_3
    //   32: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/maps/model/a/aa:a	Landroid/os/IBinder;
    //   39: iconst_1
    //   40: aload 5
    //   42: aload 6
    //   44: iconst_0
    //   45: invokeinterface 39 5 0
    //   50: pop
    //   51: aload 6
    //   53: invokevirtual 42	android/os/Parcel:readException	()V
    //   56: aload 6
    //   58: invokevirtual 46	android/os/Parcel:readInt	()I
    //   61: ifeq +29 -> 90
    //   64: getstatic 52	com/google/android/gms/maps/model/Tile:CREATOR	Lcom/google/android/gms/maps/model/x;
    //   67: aload 6
    //   69: invokevirtual 58	com/google/android/gms/maps/model/x:createFromParcel	(Landroid/os/Parcel;)Ljava/lang/Object;
    //   72: checkcast 48	com/google/android/gms/maps/model/Tile
    //   75: astore 4
    //   77: aload 6
    //   79: invokevirtual 61	android/os/Parcel:recycle	()V
    //   82: aload 5
    //   84: invokevirtual 61	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: areturn
    //   90: aconst_null
    //   91: astore 4
    //   93: goto -16 -> 77
    //   96: astore 4
    //   98: aload 6
    //   100: invokevirtual 61	android/os/Parcel:recycle	()V
    //   103: aload 5
    //   105: invokevirtual 61	android/os/Parcel:recycle	()V
    //   108: aload 4
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	aa
    //   0	111	1	paramInt1	int
    //   0	111	2	paramInt2	int
    //   0	111	3	paramInt3	int
    //   75	17	4	localTile	com.google.android.gms.maps.model.Tile
    //   96	13	4	localObject	Object
    //   3	101	5	localParcel1	android.os.Parcel
    //   8	91	6	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   10	77	96	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */