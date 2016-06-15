
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({696F2367-6619-49BD-BA96-904DC2609990})</p>
 */
@ComInterface(iid="{696F2367-6619-49BD-BA96-904DC2609990}")
public interface IVector extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns/Sets the specified item in the vector by position
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    Object getItem(Integer Index);
            
    /**
     * Returns/Sets the specified item in the vector by position
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    void setItem(Integer Index,
            Object param1);
            
    /**
     * Returns the number of members in the vector
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * If the Vector of Bytes contains an image file, then Width and Height are ignored. Otherwise a Vector of Bytes must be RGB data and a Vector of Longs must be ARGB data. Returns a Picture object on success. See the ImageFile method for more details.
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Picture", dispId = 0x2)
    Object getPicture(Integer Width,
            Integer Height);
            
    /**
     * Used to get the Thumbnail property of an ImageFile which is an image file, The thumbnail property of an Item which is RGB data, or creating an ImageFile from raw ARGB data. Returns an ImageFile object on success. See the Picture method for more details.
     *
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ImageFile", dispId = 0x3)
    IImageFile getImageFile(Integer Width,
            Integer Height);
            
    /**
     * Returns/Sets the Vector of Bytes as an array of bytes
     *
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "BinaryData", dispId = 0x4)
    Object getBinaryData();
            
    /**
     * Returns/Sets the Vector of Bytes as an array of bytes
     *
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "BinaryData", dispId = 0x4)
    void setBinaryData(Object param0);
            
    /**
     * Returns a Vector of Bytes as a String
     *
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "String", dispId = 0x5)
    String getString(Boolean Unicode);
            
    /**
     * Returns/Sets the Vector of Integers from a Date
     *
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Date", dispId = 0x6)
    java.util.Date getDate();
            
    /**
     * Returns/Sets the Vector of Integers from a Date
     *
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Date", dispId = 0x6)
    void setDate(java.util.Date param0);
            
    /**
     * If Index is not zero, Inserts a new element into the Vector collection before the specified Index. If Index is zero, Appends a new element to the Vector collection.
     *
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "Add", dispId = 0x7)
    void Add(Object Value,
            Integer Index);
            
    /**
     * Removes the designated element and returns it if successful
     *
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "Remove", dispId = 0x8)
    Object Remove(Integer Index);
            
    /**
     * Removes all elements.
     *
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x9)
    void Clear();
            
    /**
     * Stores the string Value into the Vector of Bytes including the NULL terminator. Value may be truncated unless Resizable is True. The string will be stored as an ANSI string unless Unicode is True, in which case it will be stored as a Unicode string.
     *
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "SetFromString", dispId = 0xa)
    void SetFromString(String Value,
            Boolean Resizable,
            Boolean Unicode);
            
    
}