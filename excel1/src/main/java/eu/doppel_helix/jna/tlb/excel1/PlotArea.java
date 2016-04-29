
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208CB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208CB-0000-0000-C000-000000000046}")
public interface PlotArea {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0xa5e)</p>
     */
    @ComProperty(name = "_InsideLeft", dispId = 0xa5e)
    Double get_InsideLeft();
            
    /**
     * <p>id(0xa5f)</p>
     */
    @ComProperty(name = "_InsideTop", dispId = 0xa5f)
    Double get_InsideTop();
            
    /**
     * <p>id(0xa60)</p>
     */
    @ComProperty(name = "_InsideWidth", dispId = 0xa60)
    Double get_InsideWidth();
            
    /**
     * <p>id(0xa61)</p>
     */
    @ComProperty(name = "_InsideHeight", dispId = 0xa61)
    Double get_InsideHeight();
            
    /**
     * <p>id(0x683)</p>
     */
    @ComProperty(name = "InsideLeft", dispId = 0x683)
    Double getInsideLeft();
            
    /**
     * <p>id(0x683)</p>
     */
    @ComProperty(name = "InsideLeft", dispId = 0x683)
    void setInsideLeft(Double param0);
            
    /**
     * <p>id(0x684)</p>
     */
    @ComProperty(name = "InsideTop", dispId = 0x684)
    Double getInsideTop();
            
    /**
     * <p>id(0x684)</p>
     */
    @ComProperty(name = "InsideTop", dispId = 0x684)
    void setInsideTop(Double param0);
            
    /**
     * <p>id(0x685)</p>
     */
    @ComProperty(name = "InsideWidth", dispId = 0x685)
    Double getInsideWidth();
            
    /**
     * <p>id(0x685)</p>
     */
    @ComProperty(name = "InsideWidth", dispId = 0x685)
    void setInsideWidth(Double param0);
            
    /**
     * <p>id(0x686)</p>
     */
    @ComProperty(name = "InsideHeight", dispId = 0x686)
    Double getInsideHeight();
            
    /**
     * <p>id(0x686)</p>
     */
    @ComProperty(name = "InsideHeight", dispId = 0x686)
    void setInsideHeight(Double param0);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    XlChartElementPosition getPosition();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(XlChartElementPosition param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    
}