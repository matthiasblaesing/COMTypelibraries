
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002084C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002084C-0000-0000-C000-000000000046}")
public interface DisplayUnitLabel extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(18)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    Characters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(Object param0);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    Object getOrientation();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(Object param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    String getText();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    void setText(String param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(Object param0);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x10015)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "_Dummy21", dispId = 0x10015)
    void _Dummy21();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    XlChartElementPosition getPosition();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code XlChartElementPosition}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(XlChartElementPosition param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    String getFormulaR1C1();
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    void setFormulaR1C1(String param0);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    String getFormulaLocal();
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    void setFormulaLocal(String param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    String getFormulaR1C1Local();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    void setFormulaR1C1Local(String param0);
            
    
}