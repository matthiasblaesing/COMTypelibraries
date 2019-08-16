
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03A7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03A7-0000-0000-C000-000000000046}")
public interface IRibbonUI extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Invalidate", dispId = 0x1)
    void Invalidate();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param ControlID [in] {@code String}
     */
    @ComMethod(name = "InvalidateControl", dispId = 0x2)
    void InvalidateControl(String ControlID);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param ControlID [in] {@code String}
     */
    @ComMethod(name = "InvalidateControlMso", dispId = 0x3)
    void InvalidateControlMso(String ControlID);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param ControlID [in] {@code String}
     */
    @ComMethod(name = "ActivateTab", dispId = 0x4)
    void ActivateTab(String ControlID);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param ControlID [in] {@code String}
     */
    @ComMethod(name = "ActivateTabMso", dispId = 0x5)
    void ActivateTabMso(String ControlID);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param ControlID [in] {@code String}
     * @param Namespace [in] {@code String}
     */
    @ComMethod(name = "ActivateTabQ", dispId = 0x6)
    void ActivateTabQ(String ControlID,
            String Namespace);
            
    
}