
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020939-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020939-0000-0000-C000-000000000046}")
public interface TextRetrievalMode {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "ViewType", dispId = 0x0)
    WdViewType getViewType();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "ViewType", dispId = 0x0)
    void setViewType(WdViewType param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Duplicate", dispId = 0x1)
    TextRetrievalMode getDuplicate();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "IncludeHiddenText", dispId = 0x2)
    Boolean getIncludeHiddenText();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "IncludeHiddenText", dispId = 0x2)
    void setIncludeHiddenText(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IncludeFieldCodes", dispId = 0x3)
    Boolean getIncludeFieldCodes();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IncludeFieldCodes", dispId = 0x3)
    void setIncludeFieldCodes(Boolean param0);
            
    
}