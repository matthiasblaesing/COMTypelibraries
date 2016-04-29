
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024478-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024478-0000-0000-C000-000000000046}")
public interface XmlDataBinding {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    XlXmlImportResult Refresh();
            
    /**
     * <p>id(0x919)</p>
     */
    @ComMethod(name = "LoadSettings", dispId = 0x919)
    void LoadSettings(String Url);
            
    /**
     * <p>id(0x91a)</p>
     */
    @ComMethod(name = "ClearSettings", dispId = 0x91a)
    void ClearSettings();
            
    /**
     * <p>id(0x91b)</p>
     */
    @ComProperty(name = "SourceUrl", dispId = 0x91b)
    String getSourceUrl();
            
    
}