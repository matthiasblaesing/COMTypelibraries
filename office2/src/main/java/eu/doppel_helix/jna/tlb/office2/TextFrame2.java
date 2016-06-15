
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
    MsoTextOrientation getOrientation();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x68)
    void setOrientation(MsoTextOrientation param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x69)
    MsoHorizontalAnchor getHorizontalAnchor();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "HorizontalAnchor", dispId = 0x69)
    void setHorizontalAnchor(MsoHorizontalAnchor param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x6a)
    MsoVerticalAnchor getVerticalAnchor();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "VerticalAnchor", dispId = 0x6a)
    void setVerticalAnchor(MsoVerticalAnchor param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x6b)
    MsoPathFormat getPathFormat();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PathFormat", dispId = 0x6b)
    void setPathFormat(MsoPathFormat param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x6c)
    MsoWarpFormat getWarpFormat();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "WarpFormat", dispId = 0x6c)
    void setWarpFormat(MsoWarpFormat param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x6d)
    MsoPresetTextEffect getWordArtformat();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x6d)
    void setWordArtformat(MsoPresetTextEffect param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6e)
    MsoTriState getWordWrap();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6e)
    void setWordWrap(MsoTriState param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x6f)
    MsoAutoSize getAutoSize();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x6f)
    void setAutoSize(MsoAutoSize param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x70)
    ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "HasText", dispId = 0x71)
    MsoTriState getHasText();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "TextRange", dispId = 0x72)
    TextRange2 getTextRange();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "Column", dispId = 0x73)
    TextColumn2 getColumn();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Ruler", dispId = 0x74)
    Ruler2 getRuler();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "DeleteText", dispId = 0x75)
    void DeleteText();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x76)
    MsoTriState getNoTextRotation();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "NoTextRotation", dispId = 0x76)
    void setNoTextRotation(MsoTriState param0);
            
    
}