
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244E0-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244E0-0001-0000-C000-000000000046}")
public interface ITimelineViewState extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc43)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowHeader", dispId = 0xc43)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowHeader(VARIANT RHS);
            
    /**
     * <p>id(0xc43)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowHeader", dispId = 0xc43)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowHeader(Boolean RHS);
            
    /**
     * <p>id(0xc44)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowSelectionLabel", dispId = 0xc44)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowSelectionLabel(VARIANT RHS);
            
    /**
     * <p>id(0xc44)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSelectionLabel", dispId = 0xc44)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowSelectionLabel(Boolean RHS);
            
    /**
     * <p>id(0xc45)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowTimeLevel", dispId = 0xc45)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTimeLevel(VARIANT RHS);
            
    /**
     * <p>id(0xc45)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTimeLevel", dispId = 0xc45)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTimeLevel(Boolean RHS);
            
    /**
     * <p>id(0xc46)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowHorizontalScrollbar", dispId = 0xc46)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowHorizontalScrollbar(VARIANT RHS);
            
    /**
     * <p>id(0xc46)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowHorizontalScrollbar", dispId = 0xc46)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowHorizontalScrollbar(Boolean RHS);
            
    /**
     * <p>id(0xba4)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code XlTimelineLevel}
     */
    @ComProperty(name = "Level", dispId = 0xba4)
    com.sun.jna.platform.win32.WinNT.HRESULT getLevel(VARIANT RHS);
            
    /**
     * <p>id(0xba4)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code XlTimelineLevel}
     */
    @ComProperty(name = "Level", dispId = 0xba4)
    com.sun.jna.platform.win32.WinNT.HRESULT setLevel(XlTimelineLevel RHS);
            
    
}