
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C170A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C170A-0000-0000-C000-000000000046}")
public interface SeriesCollection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(8)</p>
     * @param Source [in] {@code Object}
     * @param Rowcol [in, optional] {@code XlRowCol}
     * @param SeriesLabels [in, optional] {@code Object}
     * @param CategoryLabels [in, optional] {@code Object}
     * @param Replace [in, optional] {@code Object}
     * @param RHS [out] {@code IMsoSeries}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(Object Source,
            XlRowCol Rowcol,
            Object SeriesLabels,
            Object CategoryLabels,
            Object Replace,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xe3)</p>
     * <p>vtableId(10)</p>
     * @param Source [in] {@code Object}
     * @param Rowcol [in, optional] {@code Object}
     * @param CategoryLabels [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Extend", dispId = 0xe3)
    com.sun.jna.platform.win32.WinNT.HRESULT Extend(Object Source,
            Object Rowcol,
            Object CategoryLabels,
            VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code IMsoSeries}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(13)</p>
     * @param Rowcol [in, optional] {@code XlRowCol}
     * @param SeriesLabels [in, optional] {@code Object}
     * @param CategoryLabels [in, optional] {@code Object}
     * @param Replace [in, optional] {@code Object}
     * @param NewSeries [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    com.sun.jna.platform.win32.WinNT.HRESULT Paste(XlRowCol Rowcol,
            Object SeriesLabels,
            Object CategoryLabels,
            Object Replace,
            Object NewSeries,
            VARIANT RHS);
            
    /**
     * <p>id(0x45d)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code IMsoSeries}
     */
    @ComMethod(name = "NewSeries", dispId = 0x45d)
    com.sun.jna.platform.win32.WinNT.HRESULT NewSeries(VARIANT RHS);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(15)</p>
     * @param ppval [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppval);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(16)</p>
     * @param pval [out] {@code Integer}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT pval);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(17)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code IMsoSeries}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    
}