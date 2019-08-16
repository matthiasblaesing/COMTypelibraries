
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B2-0000-0000-C000-000000000046}")
public interface TextFrame extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f40)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1f40)
    Application getApplication();
            
    /**
     * <p>id(0x1f41)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x1f41)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    Shape getParent();
            
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
    eu.doppel_helix.jna.tlb.office2.MsoTextOrientation getOrientation();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x68)
    void setOrientation(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation param0);
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "TextRange", dispId = 0x3e9)
    Range getTextRange();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ContainingRange", dispId = 0x3ea)
    Range getContainingRange();
            
    /**
     * <p>id(0x1389)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1389)
    TextFrame getNext();
            
    /**
     * <p>id(0x1389)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code TextFrame}
     */
    @ComProperty(name = "Next", dispId = 0x1389)
    void setNext(TextFrame param0);
            
    /**
     * <p>id(0x138a)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x138a)
    TextFrame getPrevious();
            
    /**
     * <p>id(0x138a)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code TextFrame}
     */
    @ComProperty(name = "Previous", dispId = 0x138a)
    void setPrevious(TextFrame param0);
            
    /**
     * <p>id(0x138b)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Overflowing", dispId = 0x138b)
    Boolean getOverflowing();
            
    /**
     * <p>id(0x1390)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "HasText", dispId = 0x1390)
    Integer getHasText();
            
    /**
     * <p>id(0x138c)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "BreakForwardLink", dispId = 0x138c)
    void BreakForwardLink();
            
    /**
     * <p>id(0x138e)</p>
     * <p>vtableId(29)</p>
     * @param TargetTextFrame [in] {@code TextFrame}
     */
    @ComMethod(name = "ValidLinkTarget", dispId = 0x138e)
    Boolean ValidLinkTarget(TextFrame TargetTextFrame);
            
    /**
     * <p>id(0x1391)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x1391)
    Integer getAutoSize();
            
    /**
     * <p>id(0x1391)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AutoSize", dispId = 0x1391)
    void setAutoSize(Integer param0);
            
    /**
     * <p>id(0x1392)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x1392)
    Integer getWordWrap();
            
    /**
     * <p>id(0x1392)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "WordWrap", dispId = 0x1392)
    void setWordWrap(Integer param0);
            
    /**
     * <p>id(0x1393)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1393)
    eu.doppel_helix.jna.tlb.office2.MsoVerticalAnchor getVerticalAnchor();
            
    /**
     * <p>id(0x1393)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoVerticalAnchor}
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x1393)
    void setVerticalAnchor(eu.doppel_helix.jna.tlb.office2.MsoVerticalAnchor param0);
            
    /**
     * <p>id(0x1394)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1394)
    eu.doppel_helix.jna.tlb.office2.MsoHorizontalAnchor getHorizontalAnchor();
            
    /**
     * <p>id(0x1394)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoHorizontalAnchor}
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x1394)
    void setHorizontalAnchor(eu.doppel_helix.jna.tlb.office2.MsoHorizontalAnchor param0);
            
    /**
     * <p>id(0x1395)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x1395)
    eu.doppel_helix.jna.tlb.office2.MsoPathFormat getPathFormat();
            
    /**
     * <p>id(0x1395)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPathFormat}
     */
    @ComProperty(name = "PathFormat", dispId = 0x1395)
    void setPathFormat(eu.doppel_helix.jna.tlb.office2.MsoPathFormat param0);
            
    /**
     * <p>id(0x1396)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x1396)
    eu.doppel_helix.jna.tlb.office2.MsoWarpFormat getWarpFormat();
            
    /**
     * <p>id(0x1396)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoWarpFormat}
     */
    @ComProperty(name = "WarpFormat", dispId = 0x1396)
    void setWarpFormat(eu.doppel_helix.jna.tlb.office2.MsoWarpFormat param0);
            
    /**
     * <p>id(0x1397)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Column", dispId = 0x1397)
    eu.doppel_helix.jna.tlb.office2.TextColumn2 getColumn();
            
    /**
     * <p>id(0x1398)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x1398)
    ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x1399)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x1399)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getNoTextRotation();
            
    /**
     * <p>id(0x1399)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x1399)
    void setNoTextRotation(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x139a)</p>
     * <p>vtableId(46)</p>
     */
    @ComMethod(name = "DeleteText", dispId = 0x139a)
    void DeleteText();
            
    
}