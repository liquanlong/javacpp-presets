// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;

// #endif

// Workaround for cuda_fp16.h C incompatibility
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp16f extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp16f() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp16f(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp16f(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp16f position(long position) {
        return (Npp16f)super.position(position);
    }

   public native short fp16(); public native Npp16f fp16(short setter);
}