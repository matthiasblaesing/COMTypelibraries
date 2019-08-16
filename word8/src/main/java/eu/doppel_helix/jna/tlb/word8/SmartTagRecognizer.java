
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({15EBE471-0182-4CCE-98D0-B6614D1C32A1})</p>
 */
@ComInterface(iid="{15EBE471-0182-4CCE-98D0-B6614D1C32A1}")
public interface SmartTagRecognizer extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x1)
    String getFullName();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x3eb)
    Boolean getEnabled();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x3eb)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ProgID", dispId = 0x0)
    String getProgID();
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x3ec)
    String getCaption();
            
    
}