
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C94688A6-A2A7-4133-A26D-726CD569D5F3})</p>
 */
@ComInterface(iid="{C94688A6-A2A7-4133-A26D-726CD569D5F3}")
public interface OMathDelim {
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "E", dispId = 0x67)
    OMathArgs getE();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "BegChar", dispId = 0x68)
    Short getBegChar();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "BegChar", dispId = 0x68)
    void setBegChar(Short param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "SepChar", dispId = 0x69)
    Short getSepChar();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "SepChar", dispId = 0x69)
    void setSepChar(Short param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "EndChar", dispId = 0x6a)
    Short getEndChar();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "EndChar", dispId = 0x6a)
    void setEndChar(Short param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Grow", dispId = 0x6b)
    Boolean getGrow();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Grow", dispId = 0x6b)
    void setGrow(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x6c)
    WdOMathShapeType getShape();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x6c)
    void setShape(WdOMathShapeType param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "NoLeftChar", dispId = 0x6d)
    Boolean getNoLeftChar();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "NoLeftChar", dispId = 0x6d)
    void setNoLeftChar(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "NoRightChar", dispId = 0x6e)
    Boolean getNoRightChar();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "NoRightChar", dispId = 0x6e)
    void setNoRightChar(Boolean param0);
            
    
}