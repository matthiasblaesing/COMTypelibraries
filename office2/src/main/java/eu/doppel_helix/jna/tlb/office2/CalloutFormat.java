
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0311-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0311-0000-0000-C000-000000000046}")
public interface CalloutFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "AutomaticLength", dispId = 0xa)
    void AutomaticLength();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(11)</p>
     * @param Drop [in] {@code Float}
     */
    @ComMethod(name = "CustomDrop", dispId = 0xb)
    void CustomDrop(Float Drop);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(12)</p>
     * @param Length [in] {@code Float}
     */
    @ComMethod(name = "CustomLength", dispId = 0xc)
    void CustomLength(Float Length);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(13)</p>
     * @param DropType [in] {@code MsoCalloutDropType}
     */
    @ComMethod(name = "PresetDrop", dispId = 0xd)
    void PresetDrop(MsoCalloutDropType DropType);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Accent", dispId = 0x64)
    MsoTriState getAccent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Accent", dispId = 0x64)
    void setAccent(MsoTriState param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Angle", dispId = 0x65)
    MsoCalloutAngleType getAngle();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code MsoCalloutAngleType}
     */
    @ComProperty(name = "Angle", dispId = 0x65)
    void setAngle(MsoCalloutAngleType param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "AutoAttach", dispId = 0x66)
    MsoTriState getAutoAttach();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "AutoAttach", dispId = 0x66)
    void setAutoAttach(MsoTriState param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "AutoLength", dispId = 0x67)
    MsoTriState getAutoLength();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Border", dispId = 0x68)
    MsoTriState getBorder();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Border", dispId = 0x68)
    void setBorder(MsoTriState param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Drop", dispId = 0x69)
    Float getDrop();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "DropType", dispId = 0x6a)
    MsoCalloutDropType getDropType();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Gap", dispId = 0x6b)
    Float getGap();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Gap", dispId = 0x6b)
    void setGap(Float param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Length", dispId = 0x6c)
    Float getLength();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6d)
    MsoCalloutType getType();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code MsoCalloutType}
     */
    @ComProperty(name = "Type", dispId = 0x6d)
    void setType(MsoCalloutType param0);
            
    
}