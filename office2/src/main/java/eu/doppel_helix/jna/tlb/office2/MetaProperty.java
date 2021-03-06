
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C038F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C038F-0000-0000-C000-000000000046}")
public interface MetaProperty extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Id", dispId = 0x2)
    String getId();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "IsReadOnly", dispId = 0x3)
    Boolean getIsReadOnly();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsRequired", dispId = 0x4)
    Boolean getIsRequired();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Type", dispId = 0x5)
    MsoMetaPropertyType getType();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Validate", dispId = 0x6)
    String Validate();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ValidationError", dispId = 0x7)
    String getValidationError();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}