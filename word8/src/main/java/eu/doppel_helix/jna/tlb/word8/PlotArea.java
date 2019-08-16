
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({56AFD330-440C-4F4C-A39C-ED306D084D5F})</p>
 */
@ComInterface(iid="{56AFD330-440C-4F4C-A39C-ED306D084D5F}")
public interface PlotArea extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
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
     * <p>id(0x7f)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x683)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "InsideLeft", dispId = 0x683)
    Double getInsideLeft();
            
    /**
     * <p>id(0x683)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "InsideLeft", dispId = 0x683)
    void setInsideLeft(Double param0);
            
    /**
     * <p>id(0x684)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "InsideTop", dispId = 0x684)
    Double getInsideTop();
            
    /**
     * <p>id(0x684)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "InsideTop", dispId = 0x684)
    void setInsideTop(Double param0);
            
    /**
     * <p>id(0x685)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "InsideWidth", dispId = 0x685)
    Double getInsideWidth();
            
    /**
     * <p>id(0x685)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "InsideWidth", dispId = 0x685)
    void setInsideWidth(Double param0);
            
    /**
     * <p>id(0x686)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "InsideHeight", dispId = 0x686)
    Double getInsideHeight();
            
    /**
     * <p>id(0x686)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "InsideHeight", dispId = 0x686)
    void setInsideHeight(Double param0);
            
    /**
     * <p>id(0x687)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Position", dispId = 0x687)
    XlChartElementPosition getPosition();
            
    /**
     * <p>id(0x687)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code XlChartElementPosition}
     */
    @ComProperty(name = "Position", dispId = 0x687)
    void setPosition(XlChartElementPosition param0);
            
    /**
     * <p>id(0x60020019)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020019)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    
}