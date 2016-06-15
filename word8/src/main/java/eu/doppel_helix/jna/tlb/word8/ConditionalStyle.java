
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({1498F56D-ED33-41F9-B37B-EF30E50B08AC})</p>
 */
@ComInterface(iid="{1498F56D-ED33-41F9-B37B-EF30E50B08AC}")
public interface ConditionalStyle extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x1)
    Shading getShading();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x2)
    Borders getBorders();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x2)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x3)
    Float getBottomPadding();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x3)
    void setBottomPadding(Float param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x4)
    Float getTopPadding();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x4)
    void setTopPadding(Float param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x5)
    Float getLeftPadding();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x5)
    void setLeftPadding(Float param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x6)
    Float getRightPadding();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x6)
    void setRightPadding(Float param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x9)
    ParagraphFormat getParagraphFormat();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x9)
    void setParagraphFormat(ParagraphFormat param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Font", dispId = 0xa)
    Font getFont();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Font", dispId = 0xa)
    void setFont(Font param0);
            
    
}