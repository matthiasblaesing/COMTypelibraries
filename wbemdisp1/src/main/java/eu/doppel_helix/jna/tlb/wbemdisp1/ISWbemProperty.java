
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A Property
 *
 * <p>uuid({1A388F98-D4BA-11D1-8B09-00600806D9B6})</p>
 */
@ComInterface(iid="{1A388F98-D4BA-11D1-8B09-00600806D9B6}")
public interface ISWbemProperty extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * The value of this Property
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * The value of this Property
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * The name of this Property
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * Indicates whether this Property is local or propagated
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "IsLocal", dispId = 0x2)
    Boolean getIsLocal();
            
    /**
     * The originating class of this Property
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Origin", dispId = 0x3)
    String getOrigin();
            
    /**
     * The CIM Type of this Property
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CIMType", dispId = 0x4)
    WbemCimtypeEnum getCIMType();
            
    /**
     * The collection of Qualifiers of this Property
     *
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Qualifiers_", dispId = 0x5)
    ISWbemQualifierSet getQualifiers_();
            
    /**
     * Indicates whether this Property is an array type
     *
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsArray", dispId = 0x6)
    Boolean getIsArray();
            
    
}