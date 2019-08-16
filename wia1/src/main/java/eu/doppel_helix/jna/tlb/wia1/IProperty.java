
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({706038DC-9F4B-4E45-88E2-5EB7D665B815})</p>
 */
@ComInterface(iid="{706038DC-9F4B-4E45-88E2-5EB7D665B815}")
public interface IProperty extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns/Sets the Property Value
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * Returns/Sets the Property Value
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * Returns the Property Name
     *
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * Returns the PropertyID of this Property
     *
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "PropertyID", dispId = 0x2)
    Integer getPropertyID();
            
    /**
     * Returns either a WiaPropertyType or a WiaImagePropertyType
     *
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    Integer getType();
            
    /**
     * Indicates whether the Property Value is read only
     *
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "IsReadOnly", dispId = 0x4)
    Boolean getIsReadOnly();
            
    /**
     * Indicates whether the Property Value is a vector
     *
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsVector", dispId = 0x5)
    Boolean getIsVector();
            
    /**
     * Returns the SubType of the Property, if any
     *
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SubType", dispId = 0x6)
    WiaSubType getSubType();
            
    /**
     * Returns the default Property Value if the SubType is not UnspecifiedSubType
     *
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "SubTypeDefault", dispId = 0x7)
    Object getSubTypeDefault();
            
    /**
     * Returns a Vector of valid Property Values if the SubType is ListSubType or valid flag Values that can be ored together if the SubType is FlagSubType
     *
     * <p>id(0x8)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SubTypeValues", dispId = 0x8)
    IVector getSubTypeValues();
            
    /**
     * Returns the minimum valid Property Value if the SubType is RangeSubType
     *
     * <p>id(0x9)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "SubTypeMin", dispId = 0x9)
    Integer getSubTypeMin();
            
    /**
     * Returns the maximum valid Property Value if the SubType is RangeSubType
     *
     * <p>id(0xa)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "SubTypeMax", dispId = 0xa)
    Integer getSubTypeMax();
            
    /**
     * Returns the step increment of Property Values if the SubType is RangeSubType
     *
     * <p>id(0xb)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "SubTypeStep", dispId = 0xb)
    Integer getSubTypeStep();
            
    
}