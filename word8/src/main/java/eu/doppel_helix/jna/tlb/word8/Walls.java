
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({A2E94180-7564-4D97-806B-BBC0D0A1350C})</p>
 */
@ComInterface(iid="{A2E94180-7564-4D97-806B-BBC0D0A1350C}")
public interface Walls {
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    Object getPictureType();
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    void setPictureType(Object param0);
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    void Paste();
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    Object getPictureUnit();
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    void setPictureUnit(Object param0);
            
    /**
     * <p>id(0x973)</p>
     */
    @ComProperty(name = "Thickness", dispId = 0x973)
    Integer getThickness();
            
    /**
     * <p>id(0x973)</p>
     */
    @ComProperty(name = "Thickness", dispId = 0x973)
    void setThickness(Integer param0);
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "Format", dispId = 0x6002000e)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    
}