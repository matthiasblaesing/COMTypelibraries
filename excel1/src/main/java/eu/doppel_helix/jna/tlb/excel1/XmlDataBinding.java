
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024478-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024478-0000-0000-C000-000000000046}")
public interface XmlDataBinding extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    XlXmlImportResult Refresh();
            
    /**
     * <p>id(0x919)</p>
     * <p>vtableId(12)</p>
     * @param Url [in] {@code String}
     */
    @ComMethod(name = "LoadSettings", dispId = 0x919)
    void LoadSettings(String Url);
            
    /**
     * <p>id(0x91a)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "ClearSettings", dispId = 0x91a)
    void ClearSettings();
            
    /**
     * <p>id(0x91b)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "SourceUrl", dispId = 0x91b)
    String getSourceUrl();
            
    
}