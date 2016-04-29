
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({15EBE471-0182-4CCE-98D0-B6614D1C32A1})</p>
 */
@ComInterface(iid="{15EBE471-0182-4CCE-98D0-B6614D1C32A1}")
public interface SmartTagRecognizer {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x1)
    String getFullName();
            
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x3eb)
    Boolean getEnabled();
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x3eb)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "ProgID", dispId = 0x0)
    String getProgID();
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x3ec)
    String getCaption();
            
    
}