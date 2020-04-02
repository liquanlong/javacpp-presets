// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Evaluation result of a cursor
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXEvalResult extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXEvalResult() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXEvalResult(Pointer p) { super(p); }

    public String getString() {
        String s = clang_EvalResult_getAsStr(this).getString();
        clang_EvalResult_dispose(this);
        return s;
    }
}
