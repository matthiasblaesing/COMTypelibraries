
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024464-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024464-0000-0000-C000-000000000046}")
public interface SmartTagOptions {
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
     * <p>id(0x8aa)</p>
     */
    @ComProperty(name = "DisplaySmartTags", dispId = 0x8aa)
    XlSmartTagDisplayMode getDisplaySmartTags();
            
    /**
     * <p>id(0x8aa)</p>
     */
    @ComProperty(name = "DisplaySmartTags", dispId = 0x8aa)
    void setDisplaySmartTags(XlSmartTagDisplayMode param0);
            
    /**
     * <p>id(0x8ab)</p>
     */
    @ComProperty(name = "EmbedSmartTags", dispId = 0x8ab)
    Boolean getEmbedSmartTags();
            
    /**
     * <p>id(0x8ab)</p>
     */
    @ComProperty(name = "EmbedSmartTags", dispId = 0x8ab)
    void setEmbedSmartTags(Boolean param0);
            
    
}