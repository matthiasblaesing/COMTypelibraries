
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B7564E97-0519-4C68-B400-3803E7C63242})</p>
 */
@ComInterface(iid="{B7564E97-0519-4C68-B400-3803E7C63242}")
public interface TableStyle extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AllowPageBreaks", dispId = 0x2)
    Boolean getAllowPageBreaks();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowPageBreaks", dispId = 0x2)
    void setAllowPageBreaks(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x3)
    Borders getBorders();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x3)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x4)
    Float getBottomPadding();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BottomPadding", dispId = 0x4)
    void setBottomPadding(Float param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x5)
    Float getLeftPadding();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftPadding", dispId = 0x5)
    void setLeftPadding(Float param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x6)
    Float getTopPadding();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TopPadding", dispId = 0x6)
    void setTopPadding(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x7)
    Float getRightPadding();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RightPadding", dispId = 0x7)
    void setRightPadding(Float param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x9)
    WdRowAlignment getAlignment();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code WdRowAlignment}
     */
    @ComProperty(name = "Alignment", dispId = 0x9)
    void setAlignment(WdRowAlignment param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0xa)
    Float getSpacing();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Spacing", dispId = 0xa)
    void setSpacing(Float param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(26)</p>
     * @param ConditionCode [in] {@code WdConditionCode}
     */
    @ComMethod(name = "Condition", dispId = 0x10)
    ConditionalStyle Condition(WdConditionCode ConditionCode);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "TableDirection", dispId = 0xc)
    WdTableDirection getTableDirection();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code WdTableDirection}
     */
    @ComProperty(name = "TableDirection", dispId = 0xc)
    void setTableDirection(WdTableDirection param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "AllowBreakAcrossPage", dispId = 0xd)
    Integer getAllowBreakAcrossPage();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AllowBreakAcrossPage", dispId = 0xd)
    void setAllowBreakAcrossPage(Integer param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0xe)
    Float getLeftIndent();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftIndent", dispId = 0xe)
    void setLeftIndent(Float param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Shading", dispId = 0xf)
    Shading getShading();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "RowStripe", dispId = 0x11)
    Integer getRowStripe();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RowStripe", dispId = 0x11)
    void setRowStripe(Integer param0);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "ColumnStripe", dispId = 0x12)
    Integer getColumnStripe();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ColumnStripe", dispId = 0x12)
    void setColumnStripe(Integer param0);
            
    
}