
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024411-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024411-0001-0000-C000-000000000046}")
public interface IDocEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x607)</p>
     */
    @ComMethod(name = "SelectionChange", dispId = 0x607)
    com.sun.jna.platform.win32.WinNT.HRESULT SelectionChange(Range Target);
            
    /**
     * <p>id(0x601)</p>
     */
    @ComMethod(name = "BeforeDoubleClick", dispId = 0x601)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeDoubleClick(Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x5fe)</p>
     */
    @ComMethod(name = "BeforeRightClick", dispId = 0x5fe)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeRightClick(Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0x5fa)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0x5fa)
    com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0x117)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    com.sun.jna.platform.win32.WinNT.HRESULT Calculate();
            
    /**
     * <p>id(0x609)</p>
     */
    @ComMethod(name = "Change", dispId = 0x609)
    com.sun.jna.platform.win32.WinNT.HRESULT Change(Range Target);
            
    /**
     * <p>id(0x5be)</p>
     */
    @ComMethod(name = "FollowHyperlink", dispId = 0x5be)
    com.sun.jna.platform.win32.WinNT.HRESULT FollowHyperlink(Hyperlink Target);
            
    /**
     * <p>id(0x86c)</p>
     */
    @ComMethod(name = "PivotTableUpdate", dispId = 0x86c)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableUpdate(PivotTable Target);
            
    /**
     * <p>id(0xb46)</p>
     */
    @ComMethod(name = "PivotTableAfterValueChange", dispId = 0xb46)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableAfterValueChange(PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb49)</p>
     */
    @ComMethod(name = "PivotTableBeforeAllocateChanges", dispId = 0xb49)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableBeforeAllocateChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb4c)</p>
     */
    @ComMethod(name = "PivotTableBeforeCommitChanges", dispId = 0xb4c)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableBeforeCommitChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb4d)</p>
     */
    @ComMethod(name = "PivotTableBeforeDiscardChanges", dispId = 0xb4d)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableBeforeDiscardChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb4e)</p>
     */
    @ComMethod(name = "PivotTableChangeSync", dispId = 0xb4e)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableChangeSync(PivotTable Target);
            
    /**
     * <p>id(0xc00)</p>
     */
    @ComMethod(name = "LensGalleryRenderComplete", dispId = 0xc00)
    com.sun.jna.platform.win32.WinNT.HRESULT LensGalleryRenderComplete();
            
    /**
     * <p>id(0xc01)</p>
     */
    @ComMethod(name = "TableUpdate", dispId = 0xc01)
    com.sun.jna.platform.win32.WinNT.HRESULT TableUpdate(TableObject Target);
            
    /**
     * <p>id(0xc02)</p>
     */
    @ComMethod(name = "BeforeDelete", dispId = 0xc02)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeDelete();
            
    
}