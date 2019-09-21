// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Manages the partially known dimensions of a Tensor and their sizes. */
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class PartialTensorShape extends TensorShapeBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PartialTensorShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PartialTensorShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PartialTensorShape position(long position) {
        return (PartialTensorShape)super.position(position);
    }

  public PartialTensorShape() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Add a dimension to the end ("inner-most"), returns a new
   *  PartialTensorShape.
   *  REQUIRES: {@code size >= -1}, where -1 means unknown */
  public native @ByVal PartialTensorShape Concatenate(@Cast("tensorflow::int64") long size);

  /** Appends all the dimensions from {@code shape}.  Returns a new
   *  PartialTensorShape. */
  public native @ByVal PartialTensorShape Concatenate(@Const @ByRef PartialTensorShape shape);

  /** Merges all the dimensions from {@code shape}.  Returns
   *  {@code InvalidArgument} error if either {@code shape} has a different rank
   *  or if any of the dimensions are incompatible. */
  public native @ByVal Status MergeWith(@Const @ByRef PartialTensorShape shape,
                     PartialTensorShape result);

  /** Exact equality test. Returns true iff the ranks match (i.e., both are
   *  unknown, or both are known and equal), and all dimensions are equal (i.e.,
   *  both dimensions are known, or both are known and equal). This is a
   *  stronger condition that IsCompatibleWith. */
  public native @Cast("bool") boolean IsIdenticalTo(@Const @ByRef PartialTensorShape shape);

  /** Return true iff the ranks match, and if the
   *  dimensions all either match or one is unknown. */
  public native @Cast("bool") boolean IsCompatibleWith(@Const @ByRef PartialTensorShape shape);

  // Fill `*shape` from `*this`.
  // If `*this` is not fully defined, returns false and
  // `*shape` is left in an intermediate state.  Otherwise
  // returns true.
  public native @Cast("bool") boolean AsTensorShape(TensorShape shape);

  /** \brief Returns a {@code PartialTensorShape} whose dimensions are
   *  {@code dims[0]}, {@code dims[1]}, ..., {@code dims[n-1]}.  Values of -1 are
   *  considered "unknown". */
}