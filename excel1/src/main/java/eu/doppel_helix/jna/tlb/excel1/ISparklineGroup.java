
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B7-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B7-0001-0000-C000-000000000046}")
public interface ISparklineGroup {
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
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocation(VARIANT RHS);
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocation(Range RHS);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceData(VARIANT RHS);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceData(String RHS);
            
    /**
     * <p>id(0xb84)</p>
     */
    @ComProperty(name = "DateRange", dispId = 0xb84)
    com.sun.jna.platform.win32.WinNT.HRESULT getDateRange(VARIANT RHS);
            
    /**
     * <p>id(0xb84)</p>
     */
    @ComProperty(name = "DateRange", dispId = 0xb84)
    com.sun.jna.platform.win32.WinNT.HRESULT setDateRange(String RHS);
            
    /**
     * <p>id(0xb85)</p>
     */
    @ComMethod(name = "ModifyLocation", dispId = 0xb85)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifyLocation(Range Location);
            
    /**
     * <p>id(0xb86)</p>
     */
    @ComMethod(name = "ModifySourceData", dispId = 0xb86)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifySourceData(String SourceData);
            
    /**
     * <p>id(0x62d)</p>
     */
    @ComMethod(name = "Modify", dispId = 0x62d)
    com.sun.jna.platform.win32.WinNT.HRESULT Modify(Range Location,
            String SourceData);
            
    /**
     * <p>id(0xb87)</p>
     */
    @ComMethod(name = "ModifyDateRange", dispId = 0xb87)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifyDateRange(String DateRange);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(XlSparkType RHS);
            
    /**
     * <p>id(0xb88)</p>
     */
    @ComProperty(name = "SeriesColor", dispId = 0xb88)
    com.sun.jna.platform.win32.WinNT.HRESULT getSeriesColor(VARIANT RHS);
            
    /**
     * <p>id(0x46)</p>
     */
    @ComProperty(name = "Points", dispId = 0x46)
    com.sun.jna.platform.win32.WinNT.HRESULT getPoints(VARIANT RHS);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Axes", dispId = 0x17)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxes(VARIANT RHS);
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayBlanksAs(VARIANT RHS);
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "DisplayBlanksAs", dispId = 0x5d)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayBlanksAs(XlDisplayBlanksAs RHS);
            
    /**
     * <p>id(0xb89)</p>
     */
    @ComProperty(name = "DisplayHidden", dispId = 0xb89)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayHidden(VARIANT RHS);
            
    /**
     * <p>id(0xb89)</p>
     */
    @ComProperty(name = "DisplayHidden", dispId = 0xb89)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayHidden(Boolean RHS);
            
    /**
     * <p>id(0xb8a)</p>
     */
    @ComProperty(name = "LineWeight", dispId = 0xb8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getLineWeight(VARIANT RHS);
            
    /**
     * <p>id(0xb8a)</p>
     */
    @ComProperty(name = "LineWeight", dispId = 0xb8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setLineWeight(Object RHS);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlotBy(VARIANT RHS);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "PlotBy", dispId = 0xca)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlotBy(XlSparklineRowCol RHS);
            
    
}