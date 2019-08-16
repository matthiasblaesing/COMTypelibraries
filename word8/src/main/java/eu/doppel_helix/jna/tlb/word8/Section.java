
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020959-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020959-0000-0000-C000-000000000046}")
public interface Section extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Range", dispId = 0x0)
    Range getRange();
            
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
     * <p>id(0x44d)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code PageSetup}
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    void setPageSetup(PageSetup param0);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Headers", dispId = 0x79)
    HeadersFooters getHeaders();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Footers", dispId = 0x7a)
    HeadersFooters getFooters();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ProtectedForForms", dispId = 0x7b)
    Boolean getProtectedForForms();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ProtectedForForms", dispId = 0x7b)
    void setProtectedForForms(Boolean param0);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Index", dispId = 0x7c)
    Integer getIndex();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    
}