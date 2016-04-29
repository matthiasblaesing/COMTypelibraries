
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209E7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209E7-0000-0000-C000-000000000046}")
public interface HTMLDivision {
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
    @ComProperty(name = "Range", dispId = 0x1)
    Range getRange();
            
    /**
     * <p>id(0x44c)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x3)
    Float getLeftIndent();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x3)
    void setLeftIndent(Float param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "RightIndent", dispId = 0x4)
    Float getRightIndent();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "RightIndent", dispId = 0x4)
    void setRightIndent(Float param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "SpaceBefore", dispId = 0x5)
    Float getSpaceBefore();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "SpaceBefore", dispId = 0x5)
    void setSpaceBefore(Float param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0x6)
    Float getSpaceAfter();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0x6)
    void setSpaceAfter(Float param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "HTMLDivisions", dispId = 0x7)
    HTMLDivisions getHTMLDivisions();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "HTMLDivisionParent", dispId = 0x8)
    HTMLDivision HTMLDivisionParent(Object LevelsUp);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x65)
    void Delete();
            
    
}