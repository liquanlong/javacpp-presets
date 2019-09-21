// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Data for IndexerCallbacks#indexEntityReference.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxEntityRefInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxEntityRefInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxEntityRefInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxEntityRefInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxEntityRefInfo position(long position) {
        return (CXIdxEntityRefInfo)super.position(position);
    }

  public native @Cast("CXIdxEntityRefKind") int kind(); public native CXIdxEntityRefInfo kind(int setter);
  /**
   * Reference cursor.
   */
  public native @ByRef CXCursor cursor(); public native CXIdxEntityRefInfo cursor(CXCursor setter);
  public native @ByRef CXIdxLoc loc(); public native CXIdxEntityRefInfo loc(CXIdxLoc setter);
  /**
   * The entity that gets referenced.
   */
  public native @Const CXIdxEntityInfo referencedEntity(); public native CXIdxEntityRefInfo referencedEntity(CXIdxEntityInfo setter);
  /**
   * Immediate "parent" of the reference. For example:
   *
   * <pre>{@code
   * Foo *var;
   * }</pre>
   *
   * The parent of reference of type 'Foo' is the variable 'var'.
   * For references inside statement bodies of functions/methods,
   * the parentEntity will be the function/method.
   */
  public native @Const CXIdxEntityInfo parentEntity(); public native CXIdxEntityRefInfo parentEntity(CXIdxEntityInfo setter);
  /**
   * Lexical container context of the reference.
   */
  public native @Const CXIdxContainerInfo container(); public native CXIdxEntityRefInfo container(CXIdxContainerInfo setter);
  /**
   * Sets of symbol roles of the reference.
   */
  public native @Cast("CXSymbolRole") int role(); public native CXIdxEntityRefInfo role(int setter);
}