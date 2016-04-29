
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E18C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E18C-0000-0000-C000-000000000046}")
public interface Property {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IndexedValue", dispId = 0x3)
    Object getIndexedValue(Object Index1,
            Object Index2,
            Object Index3,
            Object Index4);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IndexedValue", dispId = 0x3)
    void setIndexedValue(Object Index1,
            Object Index2,
            Object Index3,
            Object Index4,
            Object param4);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "NumIndices", dispId = 0x4)
    Short getNumIndices();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    Application getApplication();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    Properties getParent();
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "Name", dispId = 0x28)
    String getName();
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x29)
    VBE getVBE();
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "Collection", dispId = 0x2a)
    Properties getCollection();
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "Object", dispId = 0x2d)
    com.sun.jna.platform.win32.COM.util.IUnknown getObject();
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "Object", dispId = 0x2d)
    void setObject(com.sun.jna.platform.win32.COM.util.IUnknown param0);
            
    
}