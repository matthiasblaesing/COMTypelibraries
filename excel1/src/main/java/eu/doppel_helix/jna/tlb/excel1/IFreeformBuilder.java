
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443F-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443F-0001-0000-C000-000000000046}")
public interface IFreeformBuilder extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e2)</p>
     * <p>vtableId(10)</p>
     * @param SegmentType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoSegmentType}
     * @param EditingType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEditingType}
     * @param X1 [in] {@code Float}
     * @param Y1 [in] {@code Float}
     * @param X2 [in, optional] {@code Object}
     * @param Y2 [in, optional] {@code Object}
     * @param X3 [in, optional] {@code Object}
     * @param Y3 [in, optional] {@code Object}
     */
    @ComMethod(name = "AddNodes", dispId = 0x6e2)
    com.sun.jna.platform.win32.WinNT.HRESULT AddNodes(eu.doppel_helix.jna.tlb.office2.MsoSegmentType SegmentType,
            eu.doppel_helix.jna.tlb.office2.MsoEditingType EditingType,
            Float X1,
            Float Y1,
            Object X2,
            Object Y2,
            Object X3,
            Object Y3);
            
    /**
     * <p>id(0x6e6)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComMethod(name = "ConvertToShape", dispId = 0x6e6)
    com.sun.jna.platform.win32.WinNT.HRESULT ConvertToShape(VARIANT RHS);
            
    
}