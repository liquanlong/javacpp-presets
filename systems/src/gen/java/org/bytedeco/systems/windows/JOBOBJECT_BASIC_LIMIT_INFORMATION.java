// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JOBOBJECT_BASIC_LIMIT_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JOBOBJECT_BASIC_LIMIT_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JOBOBJECT_BASIC_LIMIT_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JOBOBJECT_BASIC_LIMIT_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JOBOBJECT_BASIC_LIMIT_INFORMATION position(long position) {
        return (JOBOBJECT_BASIC_LIMIT_INFORMATION)super.position(position);
    }

    public native @ByRef LARGE_INTEGER PerProcessUserTimeLimit(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION PerProcessUserTimeLimit(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER PerJobUserTimeLimit(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION PerJobUserTimeLimit(LARGE_INTEGER setter);
    public native @Cast("DWORD") int LimitFlags(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION LimitFlags(int setter);
    public native @Cast("SIZE_T") long MinimumWorkingSetSize(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION MinimumWorkingSetSize(long setter);
    public native @Cast("SIZE_T") long MaximumWorkingSetSize(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION MaximumWorkingSetSize(long setter);
    public native @Cast("DWORD") int ActiveProcessLimit(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION ActiveProcessLimit(int setter);
    public native @Cast("ULONG_PTR") long Affinity(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION Affinity(long setter);
    public native @Cast("DWORD") int PriorityClass(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION PriorityClass(int setter);
    public native @Cast("DWORD") int SchedulingClass(); public native JOBOBJECT_BASIC_LIMIT_INFORMATION SchedulingClass(int setter);
}