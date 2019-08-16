
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3E061A7E-67AD-4EAA-BC1E-55057D5E596F})</p>
 */
@ComInterface(iid="{3E061A7E-67AD-4EAA-BC1E-55057D5E596F}")
public interface OMathMat extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Rows", dispId = 0x67)
    OMathMatRows getRows();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Cols", dispId = 0x68)
    OMathMatCols getCols();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(12)</p>
     * @param Row [in] {@code Integer}
     * @param Col [in] {@code Integer}
     */
    @ComProperty(name = "Cell", dispId = 0x69)
    OMath getCell(Integer Row,
            Integer Col);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Align", dispId = 0x6a)
    WdOMathVertAlignType getAlign();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code WdOMathVertAlignType}
     */
    @ComProperty(name = "Align", dispId = 0x6a)
    void setAlign(WdOMathVertAlignType param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "PlcHoldHidden", dispId = 0x6b)
    Boolean getPlcHoldHidden();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PlcHoldHidden", dispId = 0x6b)
    void setPlcHoldHidden(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "RowSpacingRule", dispId = 0x6c)
    WdOMathSpacingRule getRowSpacingRule();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code WdOMathSpacingRule}
     */
    @ComProperty(name = "RowSpacingRule", dispId = 0x6c)
    void setRowSpacingRule(WdOMathSpacingRule param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "RowSpacing", dispId = 0x6d)
    Integer getRowSpacing();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RowSpacing", dispId = 0x6d)
    void setRowSpacing(Integer param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ColSpacing", dispId = 0x6e)
    Integer getColSpacing();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ColSpacing", dispId = 0x6e)
    void setColSpacing(Integer param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ColGapRule", dispId = 0x6f)
    WdOMathSpacingRule getColGapRule();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code WdOMathSpacingRule}
     */
    @ComProperty(name = "ColGapRule", dispId = 0x6f)
    void setColGapRule(WdOMathSpacingRule param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ColGap", dispId = 0x70)
    Integer getColGap();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ColGap", dispId = 0x70)
    void setColGap(Integer param0);
            
    
}