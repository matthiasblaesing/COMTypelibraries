
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024480-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024480-0000-0000-C000-000000000046}")
public interface PivotLine extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa7b)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "LineType", dispId = 0xa7b)
    XlPivotLineType getLineType();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    Integer getPosition();
            
    /**
     * <p>id(0xa7c)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "PivotLineCells", dispId = 0xa7c)
    PivotLineCells getPivotLineCells();
            
    /**
     * <p>id(0xc1a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "PivotLineCellsFull", dispId = 0xc1a)
    PivotLineCells getPivotLineCellsFull();
            
    
}