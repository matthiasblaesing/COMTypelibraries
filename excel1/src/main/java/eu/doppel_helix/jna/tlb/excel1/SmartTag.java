
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024460-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024460-0000-0000-C000-000000000046}")
public interface SmartTag extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x8a4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "DownloadURL", dispId = 0x8a4)
    String getDownloadURL();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x8a5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "XML", dispId = 0x8a5)
    String getXML();
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x8a6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "SmartTagActions", dispId = 0x8a6)
    SmartTagActions getSmartTagActions();
            
    /**
     * <p>id(0x857)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x857)
    CustomProperties getProperties();
            
    
}