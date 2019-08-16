
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024487-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024487-0000-0000-C000-000000000046}")
public interface WorksheetView extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2ef)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Sheet", dispId = 0x2ef)
    com.sun.jna.platform.win32.COM.util.IDispatch getSheet();
            
    /**
     * <p>id(0x285)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    Boolean getDisplayGridlines();
            
    /**
     * <p>id(0x285)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    void setDisplayGridlines(Boolean param0);
            
    /**
     * <p>id(0x284)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    Boolean getDisplayFormulas();
            
    /**
     * <p>id(0x284)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    void setDisplayFormulas(Boolean param0);
            
    /**
     * <p>id(0x286)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    Boolean getDisplayHeadings();
            
    /**
     * <p>id(0x286)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    void setDisplayHeadings(Boolean param0);
            
    /**
     * <p>id(0x287)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    Boolean getDisplayOutline();
            
    /**
     * <p>id(0x287)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    void setDisplayOutline(Boolean param0);
            
    /**
     * <p>id(0x289)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    Boolean getDisplayZeros();
            
    /**
     * <p>id(0x289)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    void setDisplayZeros(Boolean param0);
            
    
}