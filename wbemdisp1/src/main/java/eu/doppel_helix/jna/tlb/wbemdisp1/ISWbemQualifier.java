
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A Qualifier
 *
 * <p>uuid({79B05932-D3B7-11D1-8B06-00600806D9B6})</p>
 */
@ComInterface(iid="{79B05932-D3B7-11D1-8B06-00600806D9B6}")
public interface ISWbemQualifier extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * The value of this Qualifier
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * The value of this Qualifier
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * The name of this Qualifier
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * Indicates whether this Qualifier is local or propagated
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "IsLocal", dispId = 0x2)
    Boolean getIsLocal();
            
    /**
     * Determines whether this Qualifier can propagate to subclasses
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "PropagatesToSubclass", dispId = 0x3)
    Boolean getPropagatesToSubclass();
            
    /**
     * Determines whether this Qualifier can propagate to subclasses
     *
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PropagatesToSubclass", dispId = 0x3)
    void setPropagatesToSubclass(Boolean param0);
            
    /**
     * Determines whether this Qualifier can propagate to instances
     *
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "PropagatesToInstance", dispId = 0x4)
    Boolean getPropagatesToInstance();
            
    /**
     * Determines whether this Qualifier can propagate to instances
     *
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PropagatesToInstance", dispId = 0x4)
    void setPropagatesToInstance(Boolean param0);
            
    /**
     * Determines whether this Qualifier can be overridden where propagated
     *
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "IsOverridable", dispId = 0x5)
    Boolean getIsOverridable();
            
    /**
     * Determines whether this Qualifier can be overridden where propagated
     *
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsOverridable", dispId = 0x5)
    void setIsOverridable(Boolean param0);
            
    /**
     * Determines whether the value of this Qualifier has been amended
     *
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "IsAmended", dispId = 0x6)
    Boolean getIsAmended();
            
    
}