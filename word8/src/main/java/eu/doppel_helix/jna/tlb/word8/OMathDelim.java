
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C94688A6-A2A7-4133-A26D-726CD569D5F3})</p>
 */
@ComInterface(iid="{C94688A6-A2A7-4133-A26D-726CD569D5F3}")
public interface OMathDelim extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "E", dispId = 0x67)
    OMathArgs getE();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "BegChar", dispId = 0x68)
    Short getBegChar();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "BegChar", dispId = 0x68)
    void setBegChar(Short param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "SepChar", dispId = 0x69)
    Short getSepChar();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "SepChar", dispId = 0x69)
    void setSepChar(Short param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "EndChar", dispId = 0x6a)
    Short getEndChar();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "EndChar", dispId = 0x6a)
    void setEndChar(Short param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Grow", dispId = 0x6b)
    Boolean getGrow();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Grow", dispId = 0x6b)
    void setGrow(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x6c)
    WdOMathShapeType getShape();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code WdOMathShapeType}
     */
    @ComProperty(name = "Shape", dispId = 0x6c)
    void setShape(WdOMathShapeType param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "NoLeftChar", dispId = 0x6d)
    Boolean getNoLeftChar();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NoLeftChar", dispId = 0x6d)
    void setNoLeftChar(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "NoRightChar", dispId = 0x6e)
    Boolean getNoRightChar();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NoRightChar", dispId = 0x6e)
    void setNoRightChar(Boolean param0);
            
    
}