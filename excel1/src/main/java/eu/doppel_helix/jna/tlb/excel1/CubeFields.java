
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002444D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002444D-0000-0000-C000-000000000046}")
public interface CubeFields {
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
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    CubeField getItem(Object Index);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    CubeField get_Default(Object Index);
            
    /**
     * <p>id(0x88a)</p>
     */
    @ComMethod(name = "AddSet", dispId = 0x88a)
    CubeField AddSet(String Name,
            String Caption);
            
    /**
     * <p>id(0xc11)</p>
     */
    @ComMethod(name = "GetMeasure", dispId = 0xc11)
    CubeField GetMeasure(Object AttributeHierarchy,
            XlConsolidationFunction Function,
            Object Caption);
            
    
}