
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020895-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020895-0001-0000-C000-000000000046}")
public interface IPane extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x223)</p>
     * <p>vtableId(12)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "LargeScroll", dispId = 0x223)
    com.sun.jna.platform.win32.WinNT.HRESULT LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft,
            VARIANT RHS);
            
    /**
     * <p>id(0x28e)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    com.sun.jna.platform.win32.WinNT.HRESULT getScrollColumn(VARIANT RHS);
            
    /**
     * <p>id(0x28e)</p>
     * <p>vtableId(14)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    com.sun.jna.platform.win32.WinNT.HRESULT setScrollColumn(Integer RHS);
            
    /**
     * <p>id(0x28f)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    com.sun.jna.platform.win32.WinNT.HRESULT getScrollRow(VARIANT RHS);
            
    /**
     * <p>id(0x28f)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    com.sun.jna.platform.win32.WinNT.HRESULT setScrollRow(Integer RHS);
            
    /**
     * <p>id(0x224)</p>
     * <p>vtableId(17)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "SmallScroll", dispId = 0x224)
    com.sun.jna.platform.win32.WinNT.HRESULT SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft,
            VARIANT RHS);
            
    /**
     * <p>id(0x45e)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "VisibleRange", dispId = 0x45e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleRange(VARIANT RHS);
            
    /**
     * <p>id(0x6f5)</p>
     * <p>vtableId(19)</p>
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     * @param Start [in, optional] {@code Object}
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x6f5)
    com.sun.jna.platform.win32.WinNT.HRESULT ScrollIntoView(Integer Left,
            Integer Top,
            Integer Width,
            Integer Height,
            Object Start);
            
    /**
     * <p>id(0x6f0)</p>
     * <p>vtableId(20)</p>
     * @param Points [in] {@code Integer}
     * @param RHS [out] {@code Integer}
     */
    @ComMethod(name = "PointsToScreenPixelsX", dispId = 0x6f0)
    com.sun.jna.platform.win32.WinNT.HRESULT PointsToScreenPixelsX(Integer Points,
            VARIANT RHS);
            
    /**
     * <p>id(0x6f1)</p>
     * <p>vtableId(21)</p>
     * @param Points [in] {@code Integer}
     * @param RHS [out] {@code Integer}
     */
    @ComMethod(name = "PointsToScreenPixelsY", dispId = 0x6f1)
    com.sun.jna.platform.win32.WinNT.HRESULT PointsToScreenPixelsY(Integer Points,
            VARIANT RHS);
            
    
}