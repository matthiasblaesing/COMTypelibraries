
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002099C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002099C-0000-0000-C000-000000000046}")
public interface Hyperlinks extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Hyperlink Item(Object Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     * @param Anchor [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Address [in, optional] {@code Object}
     * @param SubAddress [in, optional] {@code Object}
     */
    @ComMethod(name = "_Add", dispId = 0x64)
    Hyperlink _Add(com.sun.jna.platform.win32.COM.util.IDispatch Anchor,
            Object Address,
            Object SubAddress);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     * @param Anchor [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Address [in, optional] {@code Object}
     * @param SubAddress [in, optional] {@code Object}
     * @param ScreenTip [in, optional] {@code Object}
     * @param TextToDisplay [in, optional] {@code Object}
     * @param Target [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x65)
    Hyperlink Add(com.sun.jna.platform.win32.COM.util.IDispatch Anchor,
            Object Address,
            Object SubAddress,
            Object ScreenTip,
            Object TextToDisplay,
            Object Target);
            
    
}