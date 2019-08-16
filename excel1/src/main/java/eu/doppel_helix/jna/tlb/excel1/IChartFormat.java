
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
     * <p>id(0x67f)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.FillFormat}
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0xa67)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.GlowFormat}
     */
    @ComProperty(name = "Glow", dispId = 0xa67)
    com.sun.jna.platform.win32.WinNT.HRESULT getGlow(VARIANT RHS);
            
    /**
     * <p>id(0x331)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "Line", dispId = 0x331)
    com.sun.jna.platform.win32.WinNT.HRESULT getLine(VARIANT RHS);
            
    /**
     * <p>id(0x65f)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.PictureFormat}
     */
    @ComProperty(name = "PictureFormat", dispId = 0x65f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureFormat(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.ShadowFormat}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0xa66)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.SoftEdgeFormat}
     */
    @ComProperty(name = "SoftEdge", dispId = 0xa66)
    com.sun.jna.platform.win32.WinNT.HRESULT getSoftEdge(VARIANT RHS);
            
    /**
     * <p>id(0xa63)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "TextFrame2", dispId = 0xa63)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFrame2(VARIANT RHS);
            
    /**
     * <p>id(0x6a7)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.ThreeDFormat}
     */
    @ComProperty(name = "ThreeD", dispId = 0x6a7)
    com.sun.jna.platform.win32.WinNT.HRESULT getThreeD(VARIANT RHS);
            
    /**
     * <p>id(0x69b)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.Adjustments}
     */
    @ComProperty(name = "Adjustments", dispId = 0x69b)
    com.sun.jna.platform.win32.WinNT.HRESULT getAdjustments(VARIANT RHS);
            
    /**
     * <p>id(0x69d)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType}
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShapeType(VARIANT RHS);
            
    /**
     * <p>id(0x69d)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType}
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoShapeType(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType RHS);
            
    
}