
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0398-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0398-0000-0000-C000-000000000046}")
public interface TextFrame2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "MarginBottom", dispId = 0x64)
    Float getMarginBottom();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "MarginBottom", dispId = 0x64)
    void setMarginBottom(Float param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "MarginLeft", dispId = 0x65)
    Float getMarginLeft();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "MarginLeft", dispId = 0x65)
    void setMarginLeft(Float param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "MarginRight", dispId = 0x66)
    Float getMarginRight();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "MarginRight", dispId = 0x66)
    void setMarginRight(Float param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MarginTop", dispId = 0x67)
    Float getMarginTop();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "MarginTop", dispId = 0x67)
    void setMarginTop(Float param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getOrientation();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "Orientation", dispId = 0x68)
    void setOrientation(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getHorizontalAnchor();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x69)
    void setHorizontalAnchor(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getVerticalAnchor();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x6a)
    void setVerticalAnchor(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x6b)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getPathFormat();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "PathFormat", dispId = 0x6b)
    void setPathFormat(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getWarpFormat();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "WarpFormat", dispId = 0x6c)
    void setWarpFormat(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x6d)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getWordArtformat();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "WordArtformat", dispId = 0x6d)
    void setWordArtformat(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6e)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getWordWrap();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "WordWrap", dispId = 0x6e)
    void setWordWrap(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x6f)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getAutoSize();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "AutoSize", dispId = 0x6f)
    void setAutoSize(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x70)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getThreeD();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "HasText", dispId = 0x71)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getHasText();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "TextRange", dispId = 0x72)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getTextRange();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Column", dispId = 0x73)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getColumn();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Ruler", dispId = 0x74)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getRuler();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(39)</p>
     */
    @ComMethod(name = "DeleteText", dispId = 0x75)
    void DeleteText();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x76)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getNoTextRotation();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextFrame2}
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x76)
    void setNoTextRotation(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    
}