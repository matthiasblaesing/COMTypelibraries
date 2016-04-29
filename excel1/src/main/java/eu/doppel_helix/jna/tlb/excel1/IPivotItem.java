
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020876-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020876-0001-0000-C000-000000000046}")
public interface IPivotItem {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x2da)</p>
     */
    @ComProperty(name = "ChildItems", dispId = 0x2da)
    com.sun.jna.platform.win32.WinNT.HRESULT getChildItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2d0)</p>
     */
    @ComProperty(name = "DataRange", dispId = 0x2d0)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataRange(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(String RHS);
            
    /**
     * <p>id(0x2cf)</p>
     */
    @ComProperty(name = "LabelRange", dispId = 0x2cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getLabelRange(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x2e5)</p>
     */
    @ComProperty(name = "ParentItem", dispId = 0x2e5)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentItem(VARIANT RHS);
            
    /**
     * <p>id(0x2e3)</p>
     */
    @ComProperty(name = "ParentShowDetail", dispId = 0x2e3)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentShowDetail(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(Integer RHS);
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowDetail(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowDetail(Boolean RHS);
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(String RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x5e8)</p>
     */
    @ComProperty(name = "IsCalculated", dispId = 0x5e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsCalculated(VARIANT RHS);
            
    /**
     * <p>id(0x5c6)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecordCount(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x73a)</p>
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    com.sun.jna.platform.win32.WinNT.HRESULT getDrilledDown(VARIANT RHS);
            
    /**
     * <p>id(0x73a)</p>
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    com.sun.jna.platform.win32.WinNT.HRESULT setDrilledDown(Boolean RHS);
            
    /**
     * <p>id(0x824)</p>
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    com.sun.jna.platform.win32.WinNT.HRESULT getStandardFormula(VARIANT RHS);
            
    /**
     * <p>id(0x824)</p>
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    com.sun.jna.platform.win32.WinNT.HRESULT setStandardFormula(String RHS);
            
    /**
     * <p>id(0x864)</p>
     */
    @ComProperty(name = "SourceNameStandard", dispId = 0x864)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceNameStandard(VARIANT RHS);
            
    /**
     * <p>id(0xa14)</p>
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    com.sun.jna.platform.win32.WinNT.HRESULT DrillTo(String Field);
            
    
}