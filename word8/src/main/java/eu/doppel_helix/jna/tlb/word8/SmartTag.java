
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209ED-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209ED-0000-0000-C000-000000000046}")
public interface SmartTag extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "XML", dispId = 0x2)
    String getXML();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Range", dispId = 0x3)
    Range getRange();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "DownloadURL", dispId = 0x4)
    String getDownloadURL();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x5)
    CustomProperties getProperties();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xb)
    void Delete();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SmartTagActions", dispId = 0x3eb)
    SmartTagActions getSmartTagActions();
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "XMLNode", dispId = 0x3ec)
    XMLNode getXMLNode();
            
    
}