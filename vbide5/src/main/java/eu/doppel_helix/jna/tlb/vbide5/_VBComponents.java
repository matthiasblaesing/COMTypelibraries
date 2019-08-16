
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EEE0091C-E393-11D1-BB03-00C04FB6C4A6})</p>
 */
@ComInterface(iid="{EEE0091C-E393-11D1-BB03-00C04FB6C4A6}")
public interface _VBComponents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    VBComponent Item(Object index);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    VBProject getParent();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0xa)
    Integer getCount();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(11)</p>
     * @param VBComponent [in] {@code VBComponent}
     */
    @ComMethod(name = "Remove", dispId = 0xb)
    void Remove(VBComponent VBComponent);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(12)</p>
     * @param ComponentType [in] {@code vbext_ComponentType}
     */
    @ComMethod(name = "Add", dispId = 0xc)
    VBComponent Add(vbext_ComponentType ComponentType);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(13)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "Import", dispId = 0xd)
    VBComponent Import(String FileName);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x14)
    VBE getVBE();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(15)</p>
     * @param ProgId [in] {@code String}
     */
    @ComMethod(name = "AddCustom", dispId = 0x19)
    VBComponent AddCustom(String ProgId);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(16)</p>
     * @param index [in, optional] {@code Integer}
     */
    @ComMethod(name = "AddMTDesigner", dispId = 0x1a)
    VBComponent AddMTDesigner(Integer index);
            
    
}