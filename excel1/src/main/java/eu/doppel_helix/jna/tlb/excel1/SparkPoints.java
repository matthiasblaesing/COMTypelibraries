
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B8-0000-0000-C000-000000000046}")
public interface SparkPoints {
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
     * <p>id(0xb8b)</p>
     */
    @ComProperty(name = "Negative", dispId = 0xb8b)
    SparkColor getNegative();
            
    /**
     * <p>id(0xb8c)</p>
     */
    @ComProperty(name = "Markers", dispId = 0xb8c)
    SparkColor getMarkers();
            
    /**
     * <p>id(0xb8d)</p>
     */
    @ComProperty(name = "Highpoint", dispId = 0xb8d)
    SparkColor getHighpoint();
            
    /**
     * <p>id(0xb8e)</p>
     */
    @ComProperty(name = "Lowpoint", dispId = 0xb8e)
    SparkColor getLowpoint();
            
    /**
     * <p>id(0xb8f)</p>
     */
    @ComProperty(name = "Firstpoint", dispId = 0xb8f)
    SparkColor getFirstpoint();
            
    /**
     * <p>id(0xb90)</p>
     */
    @ComProperty(name = "Lastpoint", dispId = 0xb90)
    SparkColor getLastpoint();
            
    
}