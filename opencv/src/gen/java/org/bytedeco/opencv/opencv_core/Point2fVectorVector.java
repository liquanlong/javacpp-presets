// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<std::vector<cv::Point2f> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point2fVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point2fVectorVector(Pointer p) { super(p); }
    public Point2fVectorVector(Point2fVector value) { this(1); put(0, value); }
    public Point2fVectorVector(Point2fVector ... array) { this(array.length); put(array); }
    public Point2fVectorVector()       { allocate();  }
    public Point2fVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef Point2fVectorVector put(@ByRef Point2fVectorVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Point2fVector get(@Cast("size_t") long i);
    public native Point2fVectorVector put(@Cast("size_t") long i, Point2fVector value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Point2fVector value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @ByRef @Const Point2fVector get();
    }

    public Point2fVector[] get() {
        Point2fVector[] array = new Point2fVector[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Point2fVector pop_back() {
        long size = size();
        Point2fVector value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public Point2fVectorVector push_back(Point2fVector value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public Point2fVectorVector put(Point2fVector value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public Point2fVectorVector put(Point2fVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}
