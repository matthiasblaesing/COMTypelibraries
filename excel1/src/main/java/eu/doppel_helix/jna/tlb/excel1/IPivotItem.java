
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020876-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020876-0001-0000-C000-000000000046}")
public interface IPivotItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param RHS [out] {@code PivotField}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x2da)</p>
     * <p>vtableId(10)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ChildItems", dispId = 0x2da)
    com.sun.jna.platform.win32.WinNT.HRESULT getChildItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2d0)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "DataRange", dispId = 0x2d0)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataRange(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(String RHS);
            
    /**
     * <p>id(0x2cf)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "LabelRange", dispId = 0x2cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getLabelRange(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x2e5)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code PivotItem}
     */
    @ComProperty(name = "ParentItem", dispId = 0x2e5)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentItem(VARIANT RHS);
            
    /**
     * <p>id(0x2e3)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ParentShowDetail", dispId = 0x2e3)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentShowDetail(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(Integer RHS);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowDetail(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowDetail(Boolean RHS);
            
    /**
     * <p>id(0x2d1)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(String RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x5e8)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IsCalculated", dispId = 0x5e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsCalculated(VARIANT RHS);
            
    /**
     * <p>id(0x5c6)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecordCount(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(34)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x73a)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    com.sun.jna.platform.win32.WinNT.HRESULT getDrilledDown(VARIANT RHS);
            
    /**
     * <p>id(0x73a)</p>
     * <p>vtableId(36)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    com.sun.jna.platform.win32.WinNT.HRESULT setDrilledDown(Boolean RHS);
            
    /**
     * <p>id(0x824)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    com.sun.jna.platform.win32.WinNT.HRESULT getStandardFormula(VARIANT RHS);
            
    /**
     * <p>id(0x824)</p>
     * <p>vtableId(38)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    com.sun.jna.platform.win32.WinNT.HRESULT setStandardFormula(String RHS);
            
    /**
     * <p>id(0x864)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceNameStandard", dispId = 0x864)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceNameStandard(VARIANT RHS);
            
    /**
     * <p>id(0xa14)</p>
     * <p>vtableId(40)</p>
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    com.sun.jna.platform.win32.WinNT.HRESULT DrillTo(String Field);
            
    
}