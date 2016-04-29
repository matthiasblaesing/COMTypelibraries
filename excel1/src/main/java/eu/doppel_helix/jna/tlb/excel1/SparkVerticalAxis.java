
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244BC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244BC-0000-0000-C000-000000000046}")
public interface SparkVerticalAxis {
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
     * <p>id(0xb95)</p>
     */
    @ComProperty(name = "MinScaleType", dispId = 0xb95)
    XlSparkScale getMinScaleType();
            
    /**
     * <p>id(0xb95)</p>
     */
    @ComProperty(name = "MinScaleType", dispId = 0xb95)
    void setMinScaleType(XlSparkScale param0);
            
    /**
     * <p>id(0xb96)</p>
     */
    @ComProperty(name = "CustomMinScaleValue", dispId = 0xb96)
    Object getCustomMinScaleValue();
            
    /**
     * <p>id(0xb96)</p>
     */
    @ComProperty(name = "CustomMinScaleValue", dispId = 0xb96)
    void setCustomMinScaleValue(Object param0);
            
    /**
     * <p>id(0xb97)</p>
     */
    @ComProperty(name = "MaxScaleType", dispId = 0xb97)
    XlSparkScale getMaxScaleType();
            
    /**
     * <p>id(0xb97)</p>
     */
    @ComProperty(name = "MaxScaleType", dispId = 0xb97)
    void setMaxScaleType(XlSparkScale param0);
            
    /**
     * <p>id(0xb98)</p>
     */
    @ComProperty(name = "CustomMaxScaleValue", dispId = 0xb98)
    Object getCustomMaxScaleValue();
            
    /**
     * <p>id(0xb98)</p>
     */
    @ComProperty(name = "CustomMaxScaleValue", dispId = 0xb98)
    void setCustomMaxScaleValue(Object param0);
            
    
}