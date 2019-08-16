
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({8B0E45DB-3A7B-42EE-9D17-A92AF69B79C1})</p>
 */
@ComInterface(iid="{8B0E45DB-3A7B-42EE-9D17-A92AF69B79C1}")
public interface AxisTitle extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x60020000)
    String getCaption();
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x60020000)
    void setCaption(String param0);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComProperty(name = "Characters", dispId = 0x60020002)
    ChartCharacters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Font", dispId = 0x60020003)
    ChartFont getFont();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x60020004)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x60020004)
    void setHorizontalAlignment(Object param0);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60020006)
    Double getLeft();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x60020006)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x60020008)
    Object getOrientation();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x60020008)
    void setOrientation(Object param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x6002000a)
    Boolean getShadow();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x6002000a)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6002000c)
    String getText();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x6002000c)
    void setText(String param0);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6002000e)
    Double getTop();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x6002000e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x60020010)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x60020010)
    void setVerticalAlignment(Object param0);
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x60020012)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x60020012)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x60020014)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x60020014)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x60020016)
    Interior getInterior();
            
    /**
     * <p>id(0x60020017)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x60020017)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60020018)
    Object Delete();
            
    /**
     * <p>id(0x60020019)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Border", dispId = 0x60020019)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6002001a)
    String getName();
            
    /**
     * <p>id(0x6002001b)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x6002001b)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6002001c)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "Select", dispId = 0x6002001c)
    Object Select();
            
    /**
     * <p>id(0x972)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "IncludeInLayout", dispId = 0x972)
    Boolean getIncludeInLayout();
            
    /**
     * <p>id(0x972)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeInLayout", dispId = 0x972)
    void setIncludeInLayout(Boolean param0);
            
    /**
     * <p>id(0x687)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Position", dispId = 0x687)
    XlChartElementPosition getPosition();
            
    /**
     * <p>id(0x687)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code XlChartElementPosition}
     */
    @ComProperty(name = "Position", dispId = 0x687)
    void setPosition(XlChartElementPosition param0);
            
    /**
     * <p>id(0x60020021)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020021)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x60020022)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Height", dispId = 0x60020022)
    Double getHeight();
            
    /**
     * <p>id(0x60020025)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Width", dispId = 0x60020025)
    Double getWidth();
            
    /**
     * <p>id(0x60020026)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x60020026)
    String getFormula();
            
    /**
     * <p>id(0x60020026)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x60020026)
    void setFormula(String param0);
            
    /**
     * <p>id(0x60020028)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x60020028)
    String getFormulaR1C1();
            
    /**
     * <p>id(0x60020028)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x60020028)
    void setFormulaR1C1(String param0);
            
    /**
     * <p>id(0x6002002a)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x6002002a)
    String getFormulaLocal();
            
    /**
     * <p>id(0x6002002a)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x6002002a)
    void setFormulaLocal(String param0);
            
    /**
     * <p>id(0x6002002c)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x6002002c)
    String getFormulaR1C1Local();
            
    /**
     * <p>id(0x6002002c)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x6002002c)
    void setFormulaR1C1Local(String param0);
            
    
}