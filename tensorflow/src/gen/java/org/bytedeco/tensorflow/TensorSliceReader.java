// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// The reader reads in all the meta data about all the tensor slices. Then it
// will try to read the relevant data on-demand to produce the data for the
// slices needed.
// NOTE(yangke): another way to do this is to first load a list of the tensor
// slices needed and then just selectively read some of the meta data. That
// might optimize the loading but makes the logic a bit more complicated. We
// might want to revisit that.
// TODO(yangke): consider moving to TensorProto.
@Namespace("tensorflow::checkpoint") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorSliceReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorSliceReader(Pointer p) { super(p); }

  // Abstract interface for reading data out of a tensor slice checkpoint file
  public static class Table extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Table(Pointer p) { super(p); }
  
    public native @Cast("bool") boolean Get(@StdString BytePointer key, @StdString @Cast({"char*", "std::string*"}) BytePointer value);
    public native @Cast("bool") boolean Get(@StdString String key, @StdString @Cast({"char*", "std::string*"}) BytePointer value);
  }

  @MemberGetter public static native int kLoadAllShards();
  public static final int kLoadAllShards = kLoadAllShards();
  public TensorSliceReader(@StdString BytePointer filepattern) { super((Pointer)null); allocate(filepattern); }
  private native void allocate(@StdString BytePointer filepattern);
  public TensorSliceReader(@StdString String filepattern) { super((Pointer)null); allocate(filepattern); }
  private native void allocate(@StdString String filepattern);
  public TensorSliceReader(@StdString BytePointer filepattern, @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::OpenTableFunction*") Pointer open_function) { super((Pointer)null); allocate(filepattern, open_function); }
  private native void allocate(@StdString BytePointer filepattern, @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::OpenTableFunction*") Pointer open_function);
  public TensorSliceReader(@StdString String filepattern, @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::OpenTableFunction*") Pointer open_function) { super((Pointer)null); allocate(filepattern, open_function); }
  private native void allocate(@StdString String filepattern, @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::OpenTableFunction*") Pointer open_function);
  public TensorSliceReader(@StdString BytePointer filepattern, @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::OpenTableFunction*") Pointer open_function,
                      int preferred_shard) { super((Pointer)null); allocate(filepattern, open_function, preferred_shard); }
  private native void allocate(@StdString BytePointer filepattern, @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::OpenTableFunction*") Pointer open_function,
                      int preferred_shard);
  public TensorSliceReader(@StdString String filepattern, @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::OpenTableFunction*") Pointer open_function,
                      int preferred_shard) { super((Pointer)null); allocate(filepattern, open_function, preferred_shard); }
  private native void allocate(@StdString String filepattern, @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::OpenTableFunction*") Pointer open_function,
                      int preferred_shard);

  // Get the filename this reader is attached to.
  public native @StdString BytePointer filepattern();

  // Get the number of files matched.
  public native int num_files();

  // Get the status of the reader.
  public native @Const @ByVal Status status();

  // Checks if the reader contains any slice of a tensor. In case the reader
  // does contain the tensor, if "shape" is not nullptr, fill "shape" with the
  // shape of the tensor; if "type" is not nullptr, fill "type" with the type
  // of the tensor.
  public native @Cast("bool") boolean HasTensor(@StdString BytePointer name, TensorShape shape, @Cast("tensorflow::DataType*") IntPointer type);
  public native @Cast("bool") boolean HasTensor(@StdString String name, TensorShape shape, @Cast("tensorflow::DataType*") IntPointer type);

  // Checks if the reader contains all the data about a tensor slice, and if
  // yes, copies the data of the slice to "data". The caller needs to make sure
  // that "data" points to a buffer that holds enough data.
  // This is a slow function since it needs to read sstables.

  // Get the tensors.
  public native @Const @ByRef StringTensorSliceSetMap Tensors();

  // Returns value for one tensor. Only single slice checkpoints are supported
  // at the moment.
  public native @ByVal Status GetTensor(@StdString BytePointer name,
                     @UniquePtr Tensor out_tensor);
  public native @ByVal Status GetTensor(@StdString String name,
                     @UniquePtr Tensor out_tensor);

  // Returns a map from tensor name to shape.
  public native @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::VarToShapeMap*") StringIntUnorderedMap GetVariableToShapeMap();

  // Returns a map from tensor name to data type.
  public native @ByVal @Cast("tensorflow::checkpoint::TensorSliceReader::VarToDataTypeMap*") StringIntUnorderedMap GetVariableToDataTypeMap();

  // Returns a string containing names and shapes of all the tensors.
  public native @StdString BytePointer DebugString();
}