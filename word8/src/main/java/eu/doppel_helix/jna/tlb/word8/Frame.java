
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002092A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002092A-0000-0000-C000-000000000046}")
public interface Frame extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "HeightRule", dispId = 0x1)
    WdFrameSizeRule getHeightRule();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "HeightRule", dispId = 0x1)
    void setHeightRule(WdFrameSizeRule param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "WidthRule", dispId = 0x2)
    WdFrameSizeRule getWidthRule();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "WidthRule", dispId = 0x2)
    void setWidthRule(WdFrameSizeRule param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "HorizontalDistanceFromText", dispId = 0x3)
    Float getHorizontalDistanceFromText();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "HorizontalDistanceFromText", dispId = 0x3)
    void setHorizontalDistanceFromText(Float param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Height", dispId = 0x4)
    Float getHeight();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Height", dispId = 0x4)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "HorizontalPosition", dispId = 0x5)
    Float getHorizontalPosition();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "HorizontalPosition", dispId = 0x5)
    void setHorizontalPosition(Float param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "LockAnchor", dispId = 0x6)
    Boolean getLockAnchor();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "LockAnchor", dispId = 0x6)
    void setLockAnchor(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "RelativeHorizontalPosition", dispId = 0x7)
    WdRelativeHorizontalPosition getRelativeHorizontalPosition();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "RelativeHorizontalPosition", dispId = 0x7)
    void setRelativeHorizontalPosition(WdRelativeHorizontalPosition param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "RelativeVerticalPosition", dispId = 0x8)
    WdRelativeVerticalPosition getRelativeVerticalPosition();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "RelativeVerticalPosition", dispId = 0x8)
    void setRelativeVerticalPosition(WdRelativeVerticalPosition param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "VerticalDistanceFromText", dispId = 0x9)
    Float getVerticalDistanceFromText();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "VerticalDistanceFromText", dispId = 0x9)
    void setVerticalDistanceFromText(Float param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "VerticalPosition", dispId = 0xa)
    Float getVerticalPosition();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "VerticalPosition", dispId = 0xa)
    void setVerticalPosition(Float param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Width", dispId = 0xb)
    Float getWidth();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Width", dispId = 0xb)
    void setWidth(Float param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "TextWrap", dispId = 0xc)
    Boolean getTextWrap();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "TextWrap", dispId = 0xc)
    void setTextWrap(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Shading", dispId = 0xd)
    Shading getShading();
            
    /**
     * <p>id(0x44c)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Range", dispId = 0xf)
    Range getRange();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x65)
    void Copy();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x66)
    void Cut();
            
    
}