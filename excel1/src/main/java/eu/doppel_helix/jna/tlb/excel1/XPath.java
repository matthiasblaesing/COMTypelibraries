
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002447E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002447E-0000-0000-C000-000000000046}")
public interface XPath extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x8d6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Map", dispId = 0x8d6)
    XmlMap getMap();
            
    /**
     * <p>id(0x936)</p>
     * <p>vtableId(13)</p>
     * @param Map [in] {@code XmlMap}
     * @param XPath [in] {@code String}
     * @param SelectionNamespace [in, optional] {@code Object}
     * @param Repeating [in, optional] {@code Object}
     */
    @ComMethod(name = "SetValue", dispId = 0x936)
    void SetValue(XmlMap Map,
            String XPath,
            Object SelectionNamespace,
            Object Repeating);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    void Clear();
            
    /**
     * <p>id(0x938)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Repeating", dispId = 0x938)
    Boolean getRepeating();
            
    
}