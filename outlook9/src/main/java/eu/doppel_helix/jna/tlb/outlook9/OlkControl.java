
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00067366-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00067366-0000-0000-C000-000000000046}")
public interface OlkControl extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8001f001)</p>
     */
    @ComProperty(name = "ItemProperty", dispId = 0x8001f001)
    String getItemProperty();
            
    /**
     * <p>id(0x8001f001)</p>
     */
    @ComProperty(name = "ItemProperty", dispId = 0x8001f001)
    void setItemProperty(String param0);
            
    /**
     * <p>id(0x8001f003)</p>
     */
    @ComProperty(name = "ControlProperty", dispId = 0x8001f003)
    String getControlProperty();
            
    /**
     * <p>id(0x8001f003)</p>
     */
    @ComProperty(name = "ControlProperty", dispId = 0x8001f003)
    void setControlProperty(String param0);
            
    /**
     * <p>id(0x8001f004)</p>
     */
    @ComProperty(name = "PossibleValues", dispId = 0x8001f004)
    String getPossibleValues();
            
    /**
     * <p>id(0x8001f004)</p>
     */
    @ComProperty(name = "PossibleValues", dispId = 0x8001f004)
    void setPossibleValues(String param0);
            
    /**
     * <p>id(0x8001f002)</p>
     */
    @ComProperty(name = "Format", dispId = 0x8001f002)
    Integer getFormat();
            
    /**
     * <p>id(0x8001f002)</p>
     */
    @ComProperty(name = "Format", dispId = 0x8001f002)
    void setFormat(Integer param0);
            
    /**
     * <p>id(0x8001f011)</p>
     */
    @ComProperty(name = "EnableAutoLayout", dispId = 0x8001f011)
    Boolean getEnableAutoLayout();
            
    /**
     * <p>id(0x8001f011)</p>
     */
    @ComProperty(name = "EnableAutoLayout", dispId = 0x8001f011)
    void setEnableAutoLayout(Boolean param0);
            
    /**
     * <p>id(0x8001f012)</p>
     */
    @ComProperty(name = "MinimumWidth", dispId = 0x8001f012)
    Integer getMinimumWidth();
            
    /**
     * <p>id(0x8001f012)</p>
     */
    @ComProperty(name = "MinimumWidth", dispId = 0x8001f012)
    void setMinimumWidth(Integer param0);
            
    /**
     * <p>id(0x8001f013)</p>
     */
    @ComProperty(name = "MinimumHeight", dispId = 0x8001f013)
    Integer getMinimumHeight();
            
    /**
     * <p>id(0x8001f013)</p>
     */
    @ComProperty(name = "MinimumHeight", dispId = 0x8001f013)
    void setMinimumHeight(Integer param0);
            
    /**
     * <p>id(0x8001f014)</p>
     */
    @ComProperty(name = "HorizontalLayout", dispId = 0x8001f014)
    OlHorizontalLayout getHorizontalLayout();
            
    /**
     * <p>id(0x8001f014)</p>
     */
    @ComProperty(name = "HorizontalLayout", dispId = 0x8001f014)
    void setHorizontalLayout(OlHorizontalLayout param0);
            
    /**
     * <p>id(0x8001f015)</p>
     */
    @ComProperty(name = "VerticalLayout", dispId = 0x8001f015)
    OlVerticalLayout getVerticalLayout();
            
    /**
     * <p>id(0x8001f015)</p>
     */
    @ComProperty(name = "VerticalLayout", dispId = 0x8001f015)
    void setVerticalLayout(OlVerticalLayout param0);
            
    
}