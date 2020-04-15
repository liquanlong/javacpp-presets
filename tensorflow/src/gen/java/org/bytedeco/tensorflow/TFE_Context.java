// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_Context extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_Context(Pointer p) { super(p); }

  public TFE_Context(@Const @ByRef SessionOptions opts,
                @Cast("TFE_ContextDevicePlacementPolicy") int default_device_placement_policy,
                @ByVal @Cast("TFE_ContextMirroringPolicy*") Pointer default_mirroring_policy, @Cast("bool") boolean async,
                @Const DeviceMgr device_mgr, @Cast("bool") boolean device_mgr_owned,
                Rendezvous rendezvous,
                @Const CustomKernelCreator custom_kernel_creator) { super((Pointer)null); allocate(opts, default_device_placement_policy, default_mirroring_policy, async, device_mgr, device_mgr_owned, rendezvous, custom_kernel_creator); }
  private native void allocate(@Const @ByRef SessionOptions opts,
                @Cast("TFE_ContextDevicePlacementPolicy") int default_device_placement_policy,
                @ByVal @Cast("TFE_ContextMirroringPolicy*") Pointer default_mirroring_policy, @Cast("bool") boolean async,
                @Const DeviceMgr device_mgr, @Cast("bool") boolean device_mgr_owned,
                Rendezvous rendezvous,
                @Const CustomKernelCreator custom_kernel_creator);

  public native EagerContext context(); public native TFE_Context context(EagerContext setter);
}