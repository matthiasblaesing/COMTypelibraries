
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002098F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002098F-0000-0000-C000-000000000046}")
public interface ListTemplate extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "OutlineNumbered", dispId = 0x1)
    Boolean getOutlineNumbered();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OutlineNumbered", dispId = 0x1)
    void setOutlineNumbered(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3)
    String getName();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x3)
    void setName(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ListLevels", dispId = 0x2)
    ListLevels getListLevels();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(15)</p>
     * @param Level [in, optional] {@code Object}
     */
    @ComMethod(name = "Convert", dispId = 0x65)
    ListTemplate Convert(Object Level);
            
    
}