
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B8-0000-0000-C000-000000000046}")
public interface SparkPoints extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb8b)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Negative", dispId = 0xb8b)
    SparkColor getNegative();
            
    /**
     * <p>id(0xb8c)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Markers", dispId = 0xb8c)
    SparkColor getMarkers();
            
    /**
     * <p>id(0xb8d)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Highpoint", dispId = 0xb8d)
    SparkColor getHighpoint();
            
    /**
     * <p>id(0xb8e)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Lowpoint", dispId = 0xb8e)
    SparkColor getLowpoint();
            
    /**
     * <p>id(0xb8f)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Firstpoint", dispId = 0xb8f)
    SparkColor getFirstpoint();
            
    /**
     * <p>id(0xb90)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Lastpoint", dispId = 0xb90)
    SparkColor getLastpoint();
            
    
}