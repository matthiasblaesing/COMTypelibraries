
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CAE36175-3818-4C60-BCBF-0645D51EB33B})</p>
 */
@ComInterface(iid="{CAE36175-3818-4C60-BCBF-0645D51EB33B}")
public interface OMathMatCol {
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Args", dispId = 0x67)
    OMathArgs getArgs();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "ColIndex", dispId = 0x68)
    Integer getColIndex();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Align", dispId = 0x69)
    WdOMathHorizAlignType getAlign();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Align", dispId = 0x69)
    void setAlign(WdOMathHorizAlignType param0);
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete();
            
    
}