
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C171E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C171E-0000-0000-C000-000000000046}")
public interface IMsoLegendKey {
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertIfNegative(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertIfNegative(Boolean RHS);
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColor(Integer RHS);
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColor(Integer RHS);
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0xe7)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerSize(VARIANT RHS);
            
    /**
     * <p>id(0xe7)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerSize(Integer RHS);
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerStyle(VARIANT RHS);
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerStyle(XlMarkerStyle RHS);
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureType(VARIANT RHS);
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureType(Integer RHS);
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit(VARIANT RHS);
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit(Double RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0xa3)</p>
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmooth(VARIANT RHS);
            
    /**
     * <p>id(0xa3)</p>
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSmooth(Boolean RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x60020021)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020021)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT ppChartFormat);
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppval);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT pval);
            
    /**
     * <p>id(0xa59)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit2(VARIANT RHS);
            
    /**
     * <p>id(0xa59)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit2(Double RHS);
            
    
}