
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DD8F80B8-9B80-4E89-9BEC-F12DF35E43B3})</p>
 */
@ComInterface(iid="{DD8F80B8-9B80-4E89-9BEC-F12DF35E43B3}")
public interface ChartColorFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x66e)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "SchemeColor", dispId = 0x66e)
    Integer getSchemeColor();
            
    /**
     * <p>id(0x66e)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SchemeColor", dispId = 0x66e)
    void setSchemeColor(Integer param0);
            
    /**
     * <p>id(0x41f)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "RGB", dispId = 0x41f)
    Integer getRGB();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x60020005)
    Integer get_Default();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    
}