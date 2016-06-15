
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B2-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B2-0001-0000-C000-000000000046}")
public interface IChartFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0xa67)</p>
     */
    @ComProperty(name = "Glow", dispId = 0xa67)
    com.sun.jna.platform.win32.WinNT.HRESULT getGlow(VARIANT RHS);
            
    /**
     * <p>id(0x331)</p>
     */
    @ComProperty(name = "Line", dispId = 0x331)
    com.sun.jna.platform.win32.WinNT.HRESULT getLine(VARIANT RHS);
            
    /**
     * <p>id(0x65f)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x65f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureFormat(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0xa66)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0xa66)
    com.sun.jna.platform.win32.WinNT.HRESULT getSoftEdge(VARIANT RHS);
            
    /**
     * <p>id(0xa63)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0xa63)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFrame2(VARIANT RHS);
            
    /**
     * <p>id(0x6a7)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x6a7)
    com.sun.jna.platform.win32.WinNT.HRESULT getThreeD(VARIANT RHS);
            
    /**
     * <p>id(0x69b)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0x69b)
    com.sun.jna.platform.win32.WinNT.HRESULT getAdjustments(VARIANT RHS);
            
    /**
     * <p>id(0x69d)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShapeType(VARIANT RHS);
            
    /**
     * <p>id(0x69d)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoShapeType(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType RHS);
            
    
}