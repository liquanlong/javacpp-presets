// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ApiDef_Arg extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ApiDef_Arg(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ApiDef_Arg(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ApiDef_Arg position(long position) {
        return (ApiDef_Arg)super.position(position);
    }

  public ApiDef_Arg() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ApiDef_Arg(@Const @ByRef ApiDef_Arg from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ApiDef_Arg from);

  public native @ByRef @Name("operator =") ApiDef_Arg put(@Const @ByRef ApiDef_Arg from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef ApiDef_Arg default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ApiDef_Arg internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ApiDef_Arg other);
  public native void Swap(ApiDef_Arg other);
  

  // implements Message ----------------------------------------------

  public native ApiDef_Arg New();

  public native ApiDef_Arg New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ApiDef_Arg from);
  public native void MergeFrom(@Const @ByRef ApiDef_Arg from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string name = 1;
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // string rename_to = 2;
  public native void clear_rename_to();
  @MemberGetter public static native int kRenameToFieldNumber();
  public static final int kRenameToFieldNumber = kRenameToFieldNumber();
  public native @StdString BytePointer rename_to();
  public native void set_rename_to(@StdString BytePointer value);
  public native void set_rename_to(@StdString String value);
  public native void set_rename_to(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_rename_to(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_rename_to();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_rename_to();
  public native void set_allocated_rename_to(@StdString @Cast({"char*", "std::string*"}) BytePointer rename_to);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_rename_to();
  public native void unsafe_arena_set_allocated_rename_to(
        @StdString @Cast({"char*", "std::string*"}) BytePointer rename_to);

  // string description = 3;
  public native void clear_description();
  @MemberGetter public static native int kDescriptionFieldNumber();
  public static final int kDescriptionFieldNumber = kDescriptionFieldNumber();
  public native @StdString BytePointer description();
  public native void set_description(@StdString BytePointer value);
  public native void set_description(@StdString String value);
  public native void set_description(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_description(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_description();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_description();
  public native void set_allocated_description(@StdString @Cast({"char*", "std::string*"}) BytePointer description);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_description();
  public native void unsafe_arena_set_allocated_description(
        @StdString @Cast({"char*", "std::string*"}) BytePointer description);
}