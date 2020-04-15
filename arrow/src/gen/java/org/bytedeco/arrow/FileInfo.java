// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::fs::internal") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FileInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FileInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FileInfo position(long position) {
        return (FileInfo)super.position(position);
    }

  public native @StdString String full_path(); public native FileInfo full_path(String setter);
  public native @ByRef @Cast("arrow::fs::TimePoint*") Pointer mtime(); public native FileInfo mtime(Pointer setter);
  public native @StdString String data(); public native FileInfo data(String setter);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef FileInfo other);

  
}