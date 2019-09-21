// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;

import static org.bytedeco.opencv.global.opencv_features2d.*;


/****************************************************************************************\
*                                     Bag of visual words                                *
\****************************************************************************************/

/** \addtogroup features2d_category
/** \{
<p>
/** \brief Abstract base class for training the *bag of visual words* vocabulary from a set of descriptors.
<p>
For details, see, for example, *Visual Categorization with Bags of Keypoints* by Gabriella Csurka,
Christopher R. Dance, Lixin Fan, Jutta Willamowski, Cedric Bray, 2004. :
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class BOWTrainer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BOWTrainer(Pointer p) { super(p); }


    /** \brief Adds descriptors to a training set.
    <p>
    @param descriptors Descriptors to add to a training set. Each row of the descriptors matrix is a
    descriptor.
    <p>
    The training set is clustered using clustermethod to construct the vocabulary.
     */
    public native void add( @Const @ByRef Mat descriptors );

    /** \brief Returns a training set of descriptors.
    */
    public native @Const @ByRef MatVector getDescriptors();

    /** \brief Returns the count of all descriptors stored in the training set.
    */
    public native int descriptorsCount();

    public native void clear();

    /** \overload */
    public native @ByVal Mat cluster();

    /** \brief Clusters train descriptors.
    <p>
    @param descriptors Descriptors to cluster. Each row of the descriptors matrix is a descriptor.
    Descriptors are not added to the inner train descriptor set.
    <p>
    The vocabulary consists of cluster centers. So, this method returns the vocabulary. In the first
    variant of the method, train descriptors stored in the object are clustered. In the second variant,
    input descriptors are clustered.
     */
    public native @ByVal Mat cluster( @Const @ByRef Mat descriptors );
}