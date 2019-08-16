
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C171D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C171D-0000-0000-C000-000000000046}")
public interface ChartColorFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x66e)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "SchemeColor", dispId = 0x66e)
    com.sun.jna.platform.win32.WinNT.HRESULT getSchemeColor(VARIANT RHS);
            
    /**
     * <p>id(0x66e)</p>
     * <p>vtableId(9)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "SchemeColor", dispId = 0x66e)
    com.sun.jna.platform.win32.WinNT.HRESULT setSchemeColor(Integer RHS);
            
    /**
     * <p>id(0x41f)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "RGB", dispId = 0x41f)
    com.sun.jna.platform.win32.WinNT.HRESULT getRGB(VARIANT RHS);
            
    /**
     * <p>id(0x41f)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "RGB", dispId = 0x41f)
    com.sun.jna.platform.win32.WinNT.HRESULT setRGB(Integer RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(14)</p>
     * @param ppval [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppval);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(15)</p>
     * @param pval [out] {@code Integer}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT pval);
            
    
}