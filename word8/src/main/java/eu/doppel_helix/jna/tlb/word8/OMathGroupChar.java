
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({02B17CB4-7D55-4B34-B38B-10381433441F})</p>
 */
@ComInterface(iid="{02B17CB4-7D55-4B34-B38B-10381433441F}")
public interface OMathGroupChar {
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
    OMath getE();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Char", dispId = 0x68)
    Short get_Char();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Char", dispId = 0x68)
    void set_Char(Short param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "CharTop", dispId = 0x69)
    Boolean getCharTop();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "CharTop", dispId = 0x69)
    void setCharTop(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "AlignTop", dispId = 0x6a)
    Boolean getAlignTop();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "AlignTop", dispId = 0x6a)
    void setAlignTop(Boolean param0);
            
    
}