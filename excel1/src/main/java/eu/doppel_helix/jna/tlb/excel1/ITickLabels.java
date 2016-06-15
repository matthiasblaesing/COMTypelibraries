
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208C9-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208C9-0001-0000-C000-000000000046}")
public interface ITickLabels extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(String RHS);
            
    /**
     * <p>id(0xc2)</p>
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLinked(VARIANT RHS);
            
    /**
     * <p>id(0xc2)</p>
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormatLinked(Boolean RHS);
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLocal(VARIANT RHS);
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormatLocal(Object RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(XlTickLabelOrientation RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x5f5)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoScaleFont(VARIANT RHS);
            
    /**
     * <p>id(0x5f5)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoScaleFont(Object RHS);
            
    /**
     * <p>id(0x762)</p>
     */
    @ComProperty(name = "Depth", dispId = 0x762)
    com.sun.jna.platform.win32.WinNT.HRESULT getDepth(VARIANT RHS);
            
    /**
     * <p>id(0xfe)</p>
     */
    @ComProperty(name = "Offset", dispId = 0xfe)
    com.sun.jna.platform.win32.WinNT.HRESULT getOffset(VARIANT RHS);
            
    /**
     * <p>id(0xfe)</p>
     */
    @ComProperty(name = "Offset", dispId = 0xfe)
    com.sun.jna.platform.win32.WinNT.HRESULT setOffset(Integer RHS);
            
    /**
     * <p>id(0x1c5)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x1c5)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlignment(Integer RHS);
            
    /**
     * <p>id(0xa5d)</p>
     */
    @ComProperty(name = "MultiLevel", dispId = 0xa5d)
    com.sun.jna.platform.win32.WinNT.HRESULT getMultiLevel(VARIANT RHS);
            
    /**
     * <p>id(0xa5d)</p>
     */
    @ComProperty(name = "MultiLevel", dispId = 0xa5d)
    com.sun.jna.platform.win32.WinNT.HRESULT setMultiLevel(Boolean RHS);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}