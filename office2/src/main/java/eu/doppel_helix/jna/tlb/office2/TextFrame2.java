
package eu.doppel_helix.jna.tlb.office2;

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
    MsoTextOrientation getOrientation();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code MsoTextOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x68)
    void setOrientation(MsoTextOrientation param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x69)
    MsoHorizontalAnchor getHorizontalAnchor();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code MsoHorizontalAnchor}
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x69)
    void setHorizontalAnchor(MsoHorizontalAnchor param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x6a)
    MsoVerticalAnchor getVerticalAnchor();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code MsoVerticalAnchor}
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x6a)
    void setVerticalAnchor(MsoVerticalAnchor param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x6b)
    MsoPathFormat getPathFormat();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code MsoPathFormat}
     */
    @ComProperty(name = "PathFormat", dispId = 0x6b)
    void setPathFormat(MsoPathFormat param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x6c)
    MsoWarpFormat getWarpFormat();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code MsoWarpFormat}
     */
    @ComProperty(name = "WarpFormat", dispId = 0x6c)
    void setWarpFormat(MsoWarpFormat param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x6d)
    MsoPresetTextEffect getWordArtformat();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code MsoPresetTextEffect}
     */
    @ComProperty(name = "WordArtformat", dispId = 0x6d)
    void setWordArtformat(MsoPresetTextEffect param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6e)
    MsoTriState getWordWrap();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "WordWrap", dispId = 0x6e)
    void setWordWrap(MsoTriState param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x6f)
    MsoAutoSize getAutoSize();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code MsoAutoSize}
     */
    @ComProperty(name = "AutoSize", dispId = 0x6f)
    void setAutoSize(MsoAutoSize param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x70)
    ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "HasText", dispId = 0x71)
    MsoTriState getHasText();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "TextRange", dispId = 0x72)
    TextRange2 getTextRange();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Column", dispId = 0x73)
    TextColumn2 getColumn();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Ruler", dispId = 0x74)
    Ruler2 getRuler();
            
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
    MsoTriState getNoTextRotation();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x76)
    void setNoTextRotation(MsoTriState param0);
            
    
}