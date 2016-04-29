
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C1AD33E4-F088-40A9-9D2F-D94017D115C4})</p>
 */
@ComInterface(iid="{C1AD33E4-F088-40A9-9D2F-D94017D115C4}")
public interface ChartTitle {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x60020000)
    String getCaption();
            
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x60020000)
    void setCaption(String param0);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x60020002)
    ChartCharacters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Font", dispId = 0x60020003)
    ChartFont getFont();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x60020004)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x60020004)
    void setHorizontalAlignment(Object param0);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60020006)
    Double getLeft();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60020006)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x60020008)
    Object getOrientation();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x60020008)
    void setOrientation(Object param0);
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x6002000a)
    Boolean getShadow();
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x6002000a)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6002000c)
    String getText();
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6002000c)
    void setText(String param0);
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6002000e)
    Double getTop();
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6002000e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x60020010)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x60020010)
    void setVerticalAlignment(Object param0);
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x60020012)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x60020012)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x60020014)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x60020014)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x60020016)
    Interior getInterior();
            
    /**
     * <p>id(0x60020017)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x60020017)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x60020018)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60020018)
    Object Delete();
            
    /**
     * <p>id(0x60020019)</p>
     */
    @ComProperty(name = "Border", dispId = 0x60020019)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x6002001a)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6002001a)
    String getName();
            
    /**
     * <p>id(0x6002001b)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x6002001b)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6002001c)</p>
     */
    @ComMethod(name = "Select", dispId = 0x6002001c)
    Object Select();
            
    /**
     * <p>id(0x972)</p>
     */
    @ComProperty(name = "IncludeInLayout", dispId = 0x972)
    Boolean getIncludeInLayout();
            
    /**
     * <p>id(0x972)</p>
     */
    @ComProperty(name = "IncludeInLayout", dispId = 0x972)
    void setIncludeInLayout(Boolean param0);
            
    /**
     * <p>id(0x687)</p>
     */
    @ComProperty(name = "Position", dispId = 0x687)
    XlChartElementPosition getPosition();
            
    /**
     * <p>id(0x687)</p>
     */
    @ComProperty(name = "Position", dispId = 0x687)
    void setPosition(XlChartElementPosition param0);
            
    /**
     * <p>id(0x60020021)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020021)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x60020022)</p>
     */
    @ComProperty(name = "Height", dispId = 0x60020022)
    Double getHeight();
            
    /**
     * <p>id(0x60020025)</p>
     */
    @ComProperty(name = "Width", dispId = 0x60020025)
    Double getWidth();
            
    /**
     * <p>id(0x60020026)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x60020026)
    String getFormula();
            
    /**
     * <p>id(0x60020026)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x60020026)
    void setFormula(String param0);
            
    /**
     * <p>id(0x60020028)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x60020028)
    String getFormulaR1C1();
            
    /**
     * <p>id(0x60020028)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x60020028)
    void setFormulaR1C1(String param0);
            
    /**
     * <p>id(0x6002002a)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x6002002a)
    String getFormulaLocal();
            
    /**
     * <p>id(0x6002002a)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x6002002a)
    void setFormulaLocal(String param0);
            
    /**
     * <p>id(0x6002002c)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x6002002c)
    String getFormulaR1C1Local();
            
    /**
     * <p>id(0x6002002c)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x6002002c)
    void setFormulaR1C1Local(String param0);
            
    
}