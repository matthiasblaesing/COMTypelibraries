
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({935D59F5-E365-4F92-B7F5-1C499A63ECA8})</p>
 */
@ComInterface(iid="{935D59F5-E365-4F92-B7F5-1C499A63ECA8}")
public interface TickLabels extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60020001)
    Object Delete();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "Font", dispId = 0x60020002)
    ChartFont getFont();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020003)
    String getName();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0x60020004)
    String getNumberFormat();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0x60020004)
    void setNumberFormat(String param0);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0x60020006)
    Boolean getNumberFormatLinked();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0x60020006)
    void setNumberFormatLinked(Boolean param0);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x60020008)
    Object getNumberFormatLocal();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x60020008)
    void setNumberFormatLocal(Object param0);
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x6002000a)
    XlTickLabelOrientation getOrientation();
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x6002000a)
    void setOrientation(XlTickLabelOrientation param0);
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComMethod(name = "Select", dispId = 0x6002000c)
    Object Select();
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x6002000d)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x6002000d)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x6002000f)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x6002000f)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x60020011)</p>
     */
    @ComProperty(name = "Depth", dispId = 0x60020011)
    Integer getDepth();
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "Offset", dispId = 0x60020012)
    Integer getOffset();
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "Offset", dispId = 0x60020012)
    void setOffset(Integer param0);
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x60020014)
    Integer getAlignment();
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x60020014)
    void setAlignment(Integer param0);
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "MultiLevel", dispId = 0x60020016)
    Boolean getMultiLevel();
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "MultiLevel", dispId = 0x60020016)
    void setMultiLevel(Boolean param0);
            
    /**
     * <p>id(0x60020018)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020018)
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
            
    
}