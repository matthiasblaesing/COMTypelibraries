
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB09-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB09-0000-0000-C000-000000000046}")
public interface _CustomXMLParts extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60030001)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    CustomXMLPart getItem(Object Index);
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComMethod(name = "Add", dispId = 0x60030003)
    CustomXMLPart Add(String XML,
            Object SchemaCollection);
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComMethod(name = "SelectByID", dispId = 0x60030004)
    CustomXMLPart SelectByID(String Id);
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComMethod(name = "SelectByNamespace", dispId = 0x60030005)
    CustomXMLParts SelectByNamespace(String NamespaceURI);
            
    
}