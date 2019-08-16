
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({1F998A61-71C6-44C2-A0F2-1D66169B47CB})</p>
 */
@ComInterface(iid="{1F998A61-71C6-44C2-A0F2-1D66169B47CB}")
public interface OMathEqArray extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "MaxDist", dispId = 0x68)
    Boolean getMaxDist();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MaxDist", dispId = 0x68)
    void setMaxDist(Boolean param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ObjDist", dispId = 0x69)
    Boolean getObjDist();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ObjDist", dispId = 0x69)
    void setObjDist(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Align", dispId = 0x6a)
    WdOMathVertAlignType getAlign();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code WdOMathVertAlignType}
     */
    @ComProperty(name = "Align", dispId = 0x6a)
    void setAlign(WdOMathVertAlignType param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "RowSpacingRule", dispId = 0x6b)
    WdOMathSpacingRule getRowSpacingRule();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code WdOMathSpacingRule}
     */
    @ComProperty(name = "RowSpacingRule", dispId = 0x6b)
    void setRowSpacingRule(WdOMathSpacingRule param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "RowSpacing", dispId = 0x6c)
    Integer getRowSpacing();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RowSpacing", dispId = 0x6c)
    void setRowSpacing(Integer param0);
            
    
}