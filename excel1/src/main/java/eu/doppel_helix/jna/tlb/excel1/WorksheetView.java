
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024487-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024487-0000-0000-C000-000000000046}")
public interface WorksheetView {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2ef)</p>
     */
    @ComProperty(name = "Sheet", dispId = 0x2ef)
    com.sun.jna.platform.win32.COM.util.IDispatch getSheet();
            
    /**
     * <p>id(0x285)</p>
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    Boolean getDisplayGridlines();
            
    /**
     * <p>id(0x285)</p>
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    void setDisplayGridlines(Boolean param0);
            
    /**
     * <p>id(0x284)</p>
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    Boolean getDisplayFormulas();
            
    /**
     * <p>id(0x284)</p>
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    void setDisplayFormulas(Boolean param0);
            
    /**
     * <p>id(0x286)</p>
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    Boolean getDisplayHeadings();
            
    /**
     * <p>id(0x286)</p>
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    void setDisplayHeadings(Boolean param0);
            
    /**
     * <p>id(0x287)</p>
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    Boolean getDisplayOutline();
            
    /**
     * <p>id(0x287)</p>
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    void setDisplayOutline(Boolean param0);
            
    /**
     * <p>id(0x289)</p>
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    Boolean getDisplayZeros();
            
    /**
     * <p>id(0x289)</p>
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    void setDisplayZeros(Boolean param0);
            
    
}