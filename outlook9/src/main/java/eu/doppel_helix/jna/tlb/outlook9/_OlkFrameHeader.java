
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00067352-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00067352-0000-0000-C000-000000000046}")
public interface _OlkFrameHeader extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2c6)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x2c6)
    OlAlignment getAlignment();
            
    /**
     * <p>id(0x2c6)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code OlAlignment}
     */
    @ComProperty(name = "Alignment", dispId = 0x2c6)
    void setAlignment(OlAlignment param0);
            
    /**
     * <p>id(0xfffffdfa)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Caption", dispId = 0xfffffdfa)
    String getCaption();
            
    /**
     * <p>id(0xfffffdfa)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0xfffffdfa)
    void setCaption(String param0);
            
    /**
     * <p>id(0xfffffe00)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    eu.doppel_helix.jna.tlb.stdole2.Font getFont();
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    Integer getForeColor();
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Boolean getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xfffffdf6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    eu.doppel_helix.jna.tlb.stdole2.Picture getMouseIcon();
            
    /**
     * <p>id(0xfffffdf6)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.stdole2.Picture}
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    void setMouseIcon(eu.doppel_helix.jna.tlb.stdole2.Picture param0);
            
    /**
     * <p>id(0xfffffdf7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    OlMousePointer getMousePointer();
            
    /**
     * <p>id(0xfffffdf7)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code OlMousePointer}
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    void setMousePointer(OlMousePointer param0);
            
    
}