// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


/*
Type PyBytesObject represents a character string.  An extra zero byte is
reserved at the end to ensure it is zero-terminated, but a size is
present so strings with null bytes in them can be represented.  This
is an immutable object type.

There are functions to create new string objects, to test
an object for string-ness, and to get the
string value.  The latter function returns a null pointer
if the object is not of the proper type.
There is a variant that takes an explicit size as well as a
variant that assumes a zero-terminated string.  Note that none of the
functions should be applied to nil objects.
*/

/* Caching the hash (ob_shash) saves recalculation of a string's hash value.
   This significantly speeds up dict lookups. */

// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyBytesObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyBytesObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyBytesObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyBytesObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyBytesObject position(long position) {
        return (PyBytesObject)super.position(position);
    }

    public native @ByRef PyVarObject ob_base(); public native PyBytesObject ob_base(PyVarObject setter);
    public native @Cast("Py_hash_t") long ob_shash(); public native PyBytesObject ob_shash(long setter);
    public native @Cast("char") byte ob_sval(int i); public native PyBytesObject ob_sval(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer ob_sval();

    /* Invariants:
     *     ob_sval contains space for 'ob_size+1' elements.
     *     ob_sval[ob_size] == 0.
     *     ob_shash is the hash of the string or -1 if not computed yet.
     */
}