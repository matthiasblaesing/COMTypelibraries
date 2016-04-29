
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002447E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002447E-0000-0000-C000-000000000046}")
public interface XPath {
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
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x8d6)</p>
     */
    @ComProperty(name = "Map", dispId = 0x8d6)
    XmlMap getMap();
            
    /**
     * <p>id(0x936)</p>
     */
    @ComMethod(name = "SetValue", dispId = 0x936)
    void SetValue(XmlMap Map,
            String XPath,
            Object SelectionNamespace,
            Object Repeating);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    void Clear();
            
    /**
     * <p>id(0x938)</p>
     */
    @ComProperty(name = "Repeating", dispId = 0x938)
    Boolean getRepeating();
            
    
}