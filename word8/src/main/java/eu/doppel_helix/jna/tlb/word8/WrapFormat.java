
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209C3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209C3-0000-0000-C000-000000000046}")
public interface WrapFormat {
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Type", dispId = 0x64)
    WdWrapType getType();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Type", dispId = 0x64)
    void setType(WdWrapType param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Side", dispId = 0x65)
    WdWrapSideType getSide();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Side", dispId = 0x65)
    void setSide(WdWrapSideType param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "DistanceTop", dispId = 0x66)
    Float getDistanceTop();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "DistanceTop", dispId = 0x66)
    void setDistanceTop(Float param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "DistanceBottom", dispId = 0x67)
    Float getDistanceBottom();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "DistanceBottom", dispId = 0x67)
    void setDistanceBottom(Float param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "DistanceLeft", dispId = 0x68)
    Float getDistanceLeft();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "DistanceLeft", dispId = 0x68)
    void setDistanceLeft(Float param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "DistanceRight", dispId = 0x69)
    Float getDistanceRight();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "DistanceRight", dispId = 0x69)
    void setDistanceRight(Float param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "AllowOverlap", dispId = 0x6a)
    Integer getAllowOverlap();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "AllowOverlap", dispId = 0x6a)
    void setAllowOverlap(Integer param0);
            
    
}