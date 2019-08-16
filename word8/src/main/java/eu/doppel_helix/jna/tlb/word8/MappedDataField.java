
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({5D311669-EA51-11D3-87CC-00105AA31A34})</p>
 */
@ComInterface(iid="{5D311669-EA51-11D3-87CC-00105AA31A34}")
public interface MappedDataField extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DataFieldName", dispId = 0x2)
    String getDataFieldName();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Value", dispId = 0x4)
    String getValue();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "DataFieldIndex", dispId = 0x5)
    Integer getDataFieldIndex();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DataFieldIndex", dispId = 0x5)
    void setDataFieldIndex(Integer param0);
            
    
}