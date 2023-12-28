/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.openintents.openpgp;
public interface IOpenPgpService2 extends android.os.IInterface
{
  /** Default implementation for IOpenPgpService2. */
  public static class Default implements org.openintents.openpgp.IOpenPgpService2
  {
    /** see org.openintents.openpgp.util.OpenPgpApi for documentation */
    @Override public android.os.ParcelFileDescriptor createOutputPipe(int pipeId) throws android.os.RemoteException
    {
      return null;
    }
    /** see org.openintents.openpgp.util.OpenPgpApi for documentation */
    @Override public android.content.Intent execute(android.content.Intent data, android.os.ParcelFileDescriptor input, int pipeId) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.openintents.openpgp.IOpenPgpService2
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.openintents.openpgp.IOpenPgpService2 interface,
     * generating a proxy if needed.
     */
    public static org.openintents.openpgp.IOpenPgpService2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.openintents.openpgp.IOpenPgpService2))) {
        return ((org.openintents.openpgp.IOpenPgpService2)iin);
      }
      return new org.openintents.openpgp.IOpenPgpService2.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_createOutputPipe:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.ParcelFileDescriptor _result = this.createOutputPipe(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_execute:
        {
          android.content.Intent _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.content.Intent.CREATOR);
          android.os.ParcelFileDescriptor _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.ParcelFileDescriptor.CREATOR);
          int _arg2;
          _arg2 = data.readInt();
          android.content.Intent _result = this.execute(_arg0, _arg1, _arg2);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.openintents.openpgp.IOpenPgpService2
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /** see org.openintents.openpgp.util.OpenPgpApi for documentation */
      @Override public android.os.ParcelFileDescriptor createOutputPipe(int pipeId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.ParcelFileDescriptor _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pipeId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createOutputPipe, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.os.ParcelFileDescriptor.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** see org.openintents.openpgp.util.OpenPgpApi for documentation */
      @Override public android.content.Intent execute(android.content.Intent data, android.os.ParcelFileDescriptor input, int pipeId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.Intent _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, data, 0);
          _Parcel.writeTypedObject(_data, input, 0);
          _data.writeInt(pipeId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_execute, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.content.Intent.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_createOutputPipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_execute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "org.openintents.openpgp.IOpenPgpService2";
  /** see org.openintents.openpgp.util.OpenPgpApi for documentation */
  public android.os.ParcelFileDescriptor createOutputPipe(int pipeId) throws android.os.RemoteException;
  /** see org.openintents.openpgp.util.OpenPgpApi for documentation */
  public android.content.Intent execute(android.content.Intent data, android.os.ParcelFileDescriptor input, int pipeId) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
