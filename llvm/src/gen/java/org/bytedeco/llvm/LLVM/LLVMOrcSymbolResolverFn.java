// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;

@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcSymbolResolverFn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOrcSymbolResolverFn(Pointer p) { super(p); }
    protected LLVMOrcSymbolResolverFn() { allocate(); }
    private native void allocate();
    public native @Cast("uint64_t") long call(@Cast("const char*") BytePointer Name, Pointer LookupCtx);
}
