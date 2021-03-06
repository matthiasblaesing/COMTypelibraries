
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020973-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020973-0000-0000-C000-000000000046}")
public interface TextColumns extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "EvenlySpaced", dispId = 0x64)
    Integer getEvenlySpaced();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "EvenlySpaced", dispId = 0x64)
    void setEvenlySpaced(Integer param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "LineBetween", dispId = 0x65)
    Integer getLineBetween();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LineBetween", dispId = 0x65)
    void setLineBetween(Integer param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Width", dispId = 0x66)
    Float getWidth();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x66)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0x67)
    Float getSpacing();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Spacing", dispId = 0x67)
    void setSpacing(Float param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(20)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    TextColumn Item(Integer Index);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(21)</p>
     * @param Width [in, optional] {@code Object}
     * @param Spacing [in, optional] {@code Object}
     * @param EvenlySpaced [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xc9)
    TextColumn Add(Object Width,
            Object Spacing,
            Object EvenlySpaced);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(22)</p>
     * @param NumColumns [in] {@code Integer}
     */
    @ComMethod(name = "SetCount", dispId = 0xca)
    void SetCount(Integer NumColumns);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "FlowDirection", dispId = 0x68)
    WdFlowDirection getFlowDirection();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code WdFlowDirection}
     */
    @ComProperty(name = "FlowDirection", dispId = 0x68)
    void setFlowDirection(WdFlowDirection param0);
            
    
}