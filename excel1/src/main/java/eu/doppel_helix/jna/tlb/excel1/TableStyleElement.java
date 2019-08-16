
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A5-0000-0000-C000-000000000046}")
public interface TableStyleElement extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xaaf)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "HasFormat", dispId = 0xaaf)
    Boolean getHasFormat();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    Borders getBorders();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0xab0)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "StripeSize", dispId = 0xab0)
    Integer getStripeSize();
            
    /**
     * <p>id(0xab0)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "StripeSize", dispId = 0xab0)
    void setStripeSize(Integer param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    void Clear();
            
    
}