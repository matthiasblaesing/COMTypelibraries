
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B8-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B8-0001-0000-C000-000000000046}")
public interface ISparkPoints extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb8b)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code SparkColor}
     */
    @ComProperty(name = "Negative", dispId = 0xb8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getNegative(VARIANT RHS);
            
    /**
     * <p>id(0xb8c)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code SparkColor}
     */
    @ComProperty(name = "Markers", dispId = 0xb8c)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkers(VARIANT RHS);
            
    /**
     * <p>id(0xb8d)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code SparkColor}
     */
    @ComProperty(name = "Highpoint", dispId = 0xb8d)
    com.sun.jna.platform.win32.WinNT.HRESULT getHighpoint(VARIANT RHS);
            
    /**
     * <p>id(0xb8e)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code SparkColor}
     */
    @ComProperty(name = "Lowpoint", dispId = 0xb8e)
    com.sun.jna.platform.win32.WinNT.HRESULT getLowpoint(VARIANT RHS);
            
    /**
     * <p>id(0xb8f)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code SparkColor}
     */
    @ComProperty(name = "Firstpoint", dispId = 0xb8f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFirstpoint(VARIANT RHS);
            
    /**
     * <p>id(0xb90)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code SparkColor}
     */
    @ComProperty(name = "Lastpoint", dispId = 0xb90)
    com.sun.jna.platform.win32.WinNT.HRESULT getLastpoint(VARIANT RHS);
            
    
}