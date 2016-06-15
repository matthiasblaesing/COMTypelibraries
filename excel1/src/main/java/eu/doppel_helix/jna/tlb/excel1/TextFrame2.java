
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
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "MarginBottom", dispId = 0x64)
    Float getMarginBottom();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "MarginBottom", dispId = 0x64)
    void setMarginBottom(Float param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "MarginLeft", dispId = 0x65)
    Float getMarginLeft();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "MarginLeft", dispId = 0x65)
    void setMarginLeft(Float param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "MarginRight", dispId = 0x66)
    Float getMarginRight();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "MarginRight", dispId = 0x66)
    void setMarginRight(Float param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "MarginTop", dispId = 0x67)
    Float getMarginTop();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "MarginTop", dispId = 0x67)
    void setMarginTop(Float param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getOrientation();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x68)
    void setOrientation(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getHorizontalAnchor();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x69)
    void setHorizontalAnchor(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getVerticalAnchor();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x6a)
    void setVerticalAnchor(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x6b)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getPathFormat();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x6b)
    void setPathFormat(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getWarpFormat();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x6c)
    void setWarpFormat(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x6d)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getWordArtformat();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x6d)
    void setWordArtformat(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6e)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getWordWrap();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6e)
    void setWordWrap(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x6f)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getAutoSize();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x6f)
    void setAutoSize(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x70)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getThreeD();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "HasText", dispId = 0x71)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getHasText();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "TextRange", dispId = 0x72)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getTextRange();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "Column", dispId = 0x73)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getColumn();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Ruler", dispId = 0x74)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getRuler();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "DeleteText", dispId = 0x75)
    void DeleteText();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x76)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getNoTextRotation();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x76)
    void setNoTextRotation(eu.doppel_helix.jna.tlb.office2.TextFrame2 param0);
            
    
}