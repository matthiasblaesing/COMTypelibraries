
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020895-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020895-0000-0000-C000-000000000046}")
public interface Pane {
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
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    Boolean Activate();
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x223)</p>
     */
    @ComMethod(name = "LargeScroll", dispId = 0x223)
    Object LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x28e)</p>
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    Integer getScrollColumn();
            
    /**
     * <p>id(0x28e)</p>
     */
    @ComProperty(name = "ScrollColumn", dispId = 0x28e)
    void setScrollColumn(Integer param0);
            
    /**
     * <p>id(0x28f)</p>
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    Integer getScrollRow();
            
    /**
     * <p>id(0x28f)</p>
     */
    @ComProperty(name = "ScrollRow", dispId = 0x28f)
    void setScrollRow(Integer param0);
            
    /**
     * <p>id(0x224)</p>
     */
    @ComMethod(name = "SmallScroll", dispId = 0x224)
    Object SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x45e)</p>
     */
    @ComProperty(name = "VisibleRange", dispId = 0x45e)
    Range getVisibleRange();
            
    /**
     * <p>id(0x6f5)</p>
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x6f5)
    void ScrollIntoView(Integer Left,
            Integer Top,
            Integer Width,
            Integer Height,
            Object Start);
            
    /**
     * <p>id(0x6f0)</p>
     */
    @ComMethod(name = "PointsToScreenPixelsX", dispId = 0x6f0)
    Integer PointsToScreenPixelsX(Integer Points);
            
    /**
     * <p>id(0x6f1)</p>
     */
    @ComMethod(name = "PointsToScreenPixelsY", dispId = 0x6f1)
    Integer PointsToScreenPixelsY(Integer Points);
            
    
}