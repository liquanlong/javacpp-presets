// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer_plugin;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;


/**
 *  \brief The DetectionOutput plugin layer generates the detection output based on location and confidence predictions by doing non maximum suppression.
 *  This plugin first decodes the bounding boxes based on the anchors generated. It then performs non_max_suppression on the decoded bouding boxes.
 *  DetectionOutputParameters defines a set of parameters for creating the DetectionOutput plugin layer.
 *  It contains:
 *  @param shareLocation If true, bounding box are shared among different classes.
 *  @param varianceEncodedInTarget If true, variance is encoded in target. Otherwise we need to adjust the predicted offset accordingly.
 *  @param backgroundLabelId Background label ID. If there is no background class, set it as -1.
 *  @param numClasses Number of classes to be predicted.
 *  @param topK Number of boxes per image with top confidence scores that are fed into the NMS algorithm.
 *  @param keepTopK Number of total bounding boxes to be kept per image after NMS step.
 *  @param confidenceThreshold Only consider detections whose confidences are larger than a threshold.
 *  @param nmsThreshold Threshold to be used in NMS.
 *  @param codeType Type of coding method for bbox.
 *  @param inputOrder Specifies the order of inputs {loc_data, conf_data, priorbox_data}.
 *  @param confSigmoid Set to true to calculate sigmoid of confidence scores.
 *  @param isNormalized Set to true if bounding box data is normalized by the network.
 *  */
@Namespace("nvinfer1::plugin") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer_plugin.class)
public class DetectionOutputParameters extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DetectionOutputParameters() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectionOutputParameters(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionOutputParameters(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DetectionOutputParameters position(long position) {
        return (DetectionOutputParameters)super.position(position);
    }

    public native @Cast("bool") boolean shareLocation(); public native DetectionOutputParameters shareLocation(boolean setter);
    public native @Cast("bool") boolean varianceEncodedInTarget(); public native DetectionOutputParameters varianceEncodedInTarget(boolean setter);
    public native int backgroundLabelId(); public native DetectionOutputParameters backgroundLabelId(int setter);
    public native int numClasses(); public native DetectionOutputParameters numClasses(int setter);
    public native int topK(); public native DetectionOutputParameters topK(int setter);
    public native int keepTopK(); public native DetectionOutputParameters keepTopK(int setter);
    public native float confidenceThreshold(); public native DetectionOutputParameters confidenceThreshold(float setter);
    public native float nmsThreshold(); public native DetectionOutputParameters nmsThreshold(float setter);
    public native CodeTypeSSD codeType(); public native DetectionOutputParameters codeType(CodeTypeSSD setter);
    public native int inputOrder(int i); public native DetectionOutputParameters inputOrder(int i, int setter);
    @MemberGetter public native IntPointer inputOrder();
    public native @Cast("bool") boolean confSigmoid(); public native DetectionOutputParameters confSigmoid(boolean setter);
    public native @Cast("bool") boolean isNormalized(); public native DetectionOutputParameters isNormalized(boolean setter);
}