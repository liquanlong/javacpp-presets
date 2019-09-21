// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;



/* Register a function to be called when `exit' is called.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class __func extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    __func(Pointer p) { super(p); }
    protected __func() { allocate(); }
    private native void allocate();
    public native void call();
}