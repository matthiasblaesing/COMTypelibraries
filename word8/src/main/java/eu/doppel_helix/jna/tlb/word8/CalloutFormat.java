
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209C5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209C5-0000-0000-C000-000000000046}")
public interface CalloutFormat {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Accent", dispId = 0x64)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getAccent();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Accent", dispId = 0x64)
    void setAccent(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Angle", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.MsoCalloutAngleType getAngle();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Angle", dispId = 0x65)
    void setAngle(eu.doppel_helix.jna.tlb.office2.MsoCalloutAngleType param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "AutoAttach", dispId = 0x66)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getAutoAttach();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "AutoAttach", dispId = 0x66)
    void setAutoAttach(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "AutoLength", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getAutoLength();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Border", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getBorder();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Border", dispId = 0x68)
    void setBorder(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Drop", dispId = 0x69)
    Float getDrop();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "DropType", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.MsoCalloutDropType getDropType();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Gap", dispId = 0x6b)
    Float getGap();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Gap", dispId = 0x6b)
    void setGap(Float param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Length", dispId = 0x6c)
    Float getLength();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6d)
    eu.doppel_helix.jna.tlb.office2.MsoCalloutType getType();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6d)
    void setType(eu.doppel_helix.jna.tlb.office2.MsoCalloutType param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "AutomaticLength", dispId = 0xa)
    void AutomaticLength();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "CustomDrop", dispId = 0xb)
    void CustomDrop(Float Drop);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "CustomLength", dispId = 0xc)
    void CustomLength(Float Length);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "PresetDrop", dispId = 0xd)
    void PresetDrop(eu.doppel_helix.jna.tlb.office2.MsoCalloutDropType DropType);
            
    
}