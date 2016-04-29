
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B2-0000-0000-C000-000000000046}")
public interface TextFrame {
    /**
     * <p>id(0x1f40)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1f40)
    Application getApplication();
            
    /**
     * <p>id(0x1f41)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x1f41)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    Shape getParent();
            
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
    eu.doppel_helix.jna.tlb.office2.MsoTextOrientation getOrientation();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x68)
    void setOrientation(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation param0);
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "TextRange", dispId = 0x3e9)
    Range getTextRange();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "ContainingRange", dispId = 0x3ea)
    Range getContainingRange();
            
    /**
     * <p>id(0x1389)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1389)
    TextFrame getNext();
            
    /**
     * <p>id(0x1389)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1389)
    void setNext(TextFrame param0);
            
    /**
     * <p>id(0x138a)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x138a)
    TextFrame getPrevious();
            
    /**
     * <p>id(0x138a)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x138a)
    void setPrevious(TextFrame param0);
            
    /**
     * <p>id(0x138b)</p>
     */
    @ComProperty(name = "Overflowing", dispId = 0x138b)
    Boolean getOverflowing();
            
    /**
     * <p>id(0x1390)</p>
     */
    @ComProperty(name = "HasText", dispId = 0x1390)
    Integer getHasText();
            
    /**
     * <p>id(0x138c)</p>
     */
    @ComMethod(name = "BreakForwardLink", dispId = 0x138c)
    void BreakForwardLink();
            
    /**
     * <p>id(0x138e)</p>
     */
    @ComMethod(name = "ValidLinkTarget", dispId = 0x138e)
    Boolean ValidLinkTarget(TextFrame TargetTextFrame);
            
    /**
     * <p>id(0x1391)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x1391)
    Integer getAutoSize();
            
    /**
     * <p>id(0x1391)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x1391)
    void setAutoSize(Integer param0);
            
    /**
     * <p>id(0x1392)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x1392)
    Integer getWordWrap();
            
    /**
     * <p>id(0x1392)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x1392)
    void setWordWrap(Integer param0);
            
    /**
     * <p>id(0x1393)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1393)
    eu.doppel_helix.jna.tlb.office2.MsoVerticalAnchor getVerticalAnchor();
            
    /**
     * <p>id(0x1393)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1393)
    void setVerticalAnchor(eu.doppel_helix.jna.tlb.office2.MsoVerticalAnchor param0);
            
    /**
     * <p>id(0x1394)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1394)
    eu.doppel_helix.jna.tlb.office2.MsoHorizontalAnchor getHorizontalAnchor();
            
    /**
     * <p>id(0x1394)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1394)
    void setHorizontalAnchor(eu.doppel_helix.jna.tlb.office2.MsoHorizontalAnchor param0);
            
    /**
     * <p>id(0x1395)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x1395)
    eu.doppel_helix.jna.tlb.office2.MsoPathFormat getPathFormat();
            
    /**
     * <p>id(0x1395)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x1395)
    void setPathFormat(eu.doppel_helix.jna.tlb.office2.MsoPathFormat param0);
            
    /**
     * <p>id(0x1396)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x1396)
    eu.doppel_helix.jna.tlb.office2.MsoWarpFormat getWarpFormat();
            
    /**
     * <p>id(0x1396)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x1396)
    void setWarpFormat(eu.doppel_helix.jna.tlb.office2.MsoWarpFormat param0);
            
    /**
     * <p>id(0x1397)</p>
     */
    @ComProperty(name = "Column", dispId = 0x1397)
    eu.doppel_helix.jna.tlb.office2.TextColumn2 getColumn();
            
    /**
     * <p>id(0x1398)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x1398)
    ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x1399)</p>
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x1399)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getNoTextRotation();
            
    /**
     * <p>id(0x1399)</p>
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x1399)
    void setNoTextRotation(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x139a)</p>
     */
    @ComMethod(name = "DeleteText", dispId = 0x139a)
    void DeleteText();
            
    
}