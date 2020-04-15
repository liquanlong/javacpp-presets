// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Buffer classes

/** \class Buffer
 *  \brief Object containing a pointer to a piece of contiguous memory with a
 *  particular size.
 * 
 *  Buffers have two related notions of length: size and capacity. Size is
 *  the number of bytes that might have valid data. Capacity is the number
 *  of bytes that were allocated for the buffer in total.
 * 
 *  The Buffer base class does not own its memory, but subclasses often do.
 * 
 *  The following invariant is always true: Size <= Capacity */
@Name("arrow::Buffer") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ArrowBuffer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArrowBuffer(Pointer p) { super(p); }

  /** \brief Construct from buffer and size without copying memory
   * 
   *  @param data [in] a memory buffer
   *  @param size [in] buffer size
   * 
   *  \note The passed memory must be kept alive through some other means */
  
  ///
  ///
  public ArrowBuffer(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long size);
  public ArrowBuffer(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long size);
  public ArrowBuffer(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size) { super((Pointer)null); allocate(data, size); }
  private native void allocate(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long size);

  /** \brief Construct from string_view without copying memory
   * 
   *  @param data [in] a string_view object
   * 
   *  \note The memory viewed by data must not be deallocated in the lifetime of the
   *  Buffer; temporary rvalue strings must be stored in an lvalue somewhere */

  /** An offset into data that is owned by another buffer, but we want to be
   *  able to retain a valid pointer to it even after other shared_ptr's to the
   *  parent buffer have been destroyed
   * 
   *  This method makes no assertions about alignment or padding of the buffer but
   *  in general we expected buffers to be aligned and padded to 64 bytes.  In the future
   *  we might add utility methods to help determine if a buffer satisfies this contract. */
  public ArrowBuffer(@SharedPtr ArrowBuffer parent, @Cast("const int64_t") long offset, @Cast("const int64_t") long size) { super((Pointer)null); allocate(parent, offset, size); }
  private native void allocate(@SharedPtr ArrowBuffer parent, @Cast("const int64_t") long offset, @Cast("const int64_t") long size);

  public native @Cast("uint8_t") @Name("operator []") byte get(@Cast("std::size_t") long i);

  public native @Cast("bool") boolean is_mutable();

  /** \brief Construct a new std::string with a hexadecimal representation of the buffer.
   *  @return std::string */
  public native @StdString String ToHexString();

  /** Return true if both buffers are the same size and contain the same bytes
   *  up to the number of compared bytes */
  public native @Cast("bool") boolean Equals(@Const @ByRef ArrowBuffer other, @Cast("int64_t") long nbytes);

  /** Return true if both buffers are the same size and contain the same bytes */
  public native @Cast("bool") boolean Equals(@Const @ByRef ArrowBuffer other);

  /** Copy a section of the buffer into a new Buffer. */
  public native @ByVal Status Copy(@Cast("const int64_t") long start, @Cast("const int64_t") long nbytes, MemoryPool pool,
                @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);

  /** Copy a section of the buffer using the default memory pool into a new Buffer. */
  public native @ByVal Status Copy(@Cast("const int64_t") long start, @Cast("const int64_t") long nbytes,
                @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);

  /** Zero bytes in padding, i.e. bytes between size_ and capacity_. */
  
  ///
  ///
  public native void ZeroPadding();

  /** \brief Construct a new buffer that owns its memory from a std::string
   * 
   *  @param data [in] a std::string object
   *  @param pool [in] a memory pool
   *  @param out [out] the created buffer
   * 
   *  @return Status message */
  public static native @ByVal Status FromString(@StdString String data, MemoryPool pool,
                             @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);
  public static native @ByVal Status FromString(@StdString BytePointer data, MemoryPool pool,
                             @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);

  /** \brief Construct a new buffer that owns its memory from a std::string
   *  using the default memory pool */
  public static native @ByVal Status FromString(@StdString String data, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);
  public static native @ByVal Status FromString(@StdString BytePointer data, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Buffer>*"}) ArrowBuffer out);

  /** \brief Construct an immutable buffer that takes ownership of the contents
   *  of an std::string
   *  @param data [in] an rvalue-reference of a string
   *  @return a new Buffer instance */
  public static native @SharedPtr @ByVal ArrowBuffer FromString(@Cast({"", "std::string&&"}) @StdString BytePointer data);
  public static native @SharedPtr @ByVal ArrowBuffer FromString(@Cast({"", "std::string&&"}) @StdString String data);

  /** \brief Create buffer referencing typed memory with some length without
   *  copying
   *  @param data [in] the typed memory as C array
   *  @param length [in] the number of values in the array
   *  @return a new shared_ptr<Buffer> */

  /** \brief Create buffer referencing std::vector with some length without
   *  copying
   *  @param data [in] the vector to be referenced. If this vector is changed,
   *  the buffer may become invalid
   *  @return a new shared_ptr<Buffer> */

  /** \brief Copy buffer contents into a new std::string
   *  @return std::string
   *  \note Can throw std::bad_alloc if buffer is large */
  public native @StdString String ToString();

  /** \brief View buffer contents as a util::string_view
   *  @return util::string_view */

  /** \brief View buffer contents as a util::bytes_view
   *  @return util::bytes_view */

  /** \brief Return a pointer to the buffer's data */
  
  ///
  public native @Cast("const uint8_t*") BytePointer data();
  /** \brief Return a writable pointer to the buffer's data
   * 
   *  The buffer has to be mutable.  Otherwise, an assertion may be thrown
   *  or a null pointer may be returned. */
  public native @Cast("uint8_t*") BytePointer mutable_data();

  /** \brief Return the buffer's size in bytes */
  public native @Cast("int64_t") long size();

  /** \brief Return the buffer's capacity (number of allocated bytes) */
  public native @Cast("int64_t") @Name("capacity") long _capacity();

  public native @SharedPtr ArrowBuffer parent();
}