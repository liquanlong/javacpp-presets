// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// 32 and 64 bit specific version for wow64 and the debugger
//
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class NT_TIB32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NT_TIB32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NT_TIB32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NT_TIB32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NT_TIB32 position(long position) {
        return (NT_TIB32)super.position(position);
    }

    public native @Cast("DWORD") int ExceptionList(); public native NT_TIB32 ExceptionList(int setter);
    public native @Cast("DWORD") int StackBase(); public native NT_TIB32 StackBase(int setter);
    public native @Cast("DWORD") int StackLimit(); public native NT_TIB32 StackLimit(int setter);
    public native @Cast("DWORD") int SubSystemTib(); public native NT_TIB32 SubSystemTib(int setter);

// #if defined(_MSC_EXTENSIONS)
        public native @Cast("DWORD") int FiberData(); public native NT_TIB32 FiberData(int setter);
        public native @Cast("DWORD") int Version(); public native NT_TIB32 Version(int setter);
// #else
// #endif

    public native @Cast("DWORD") int ArbitraryUserPointer(); public native NT_TIB32 ArbitraryUserPointer(int setter);
    public native @Cast("DWORD") int Self(); public native NT_TIB32 Self(int setter);
}