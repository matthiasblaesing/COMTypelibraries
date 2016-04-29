
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A2-0000-0000-C000-000000000046}")
public interface Page {
    /**
     * <p>id(0x3fa)</p>
     */
    @ComProperty(name = "LeftHeader", dispId = 0x3fa)
    HeaderFooter getLeftHeader();
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "CenterHeader", dispId = 0x3f3)
    HeaderFooter getCenterHeader();
            
    /**
     * <p>id(0x402)</p>
     */
    @ComProperty(name = "RightHeader", dispId = 0x402)
    HeaderFooter getRightHeader();
            
    /**
     * <p>id(0x3f9)</p>
     */
    @ComProperty(name = "LeftFooter", dispId = 0x3f9)
    HeaderFooter getLeftFooter();
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "CenterFooter", dispId = 0x3f2)
    HeaderFooter getCenterFooter();
            
    /**
     * <p>id(0x401)</p>
     */
    @ComProperty(name = "RightFooter", dispId = 0x401)
    HeaderFooter getRightFooter();
            
    
}