
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002442A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002442A-0000-0000-C000-000000000046}")
public interface Parameter extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2d2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    XlParameterDataType getDataType();
            
    /**
     * <p>id(0x2d2)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code XlParameterDataType}
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    void setDataType(XlParameterDataType param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlParameterType getType();
            
    /**
     * <p>id(0x63f)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "PromptString", dispId = 0x63f)
    String getPromptString();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Object getValue();
            
    /**
     * <p>id(0x640)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SourceRange", dispId = 0x640)
    Range getSourceRange();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x641)</p>
     * <p>vtableId(18)</p>
     * @param Type [in] {@code XlParameterType}
     * @param Value [in] {@code Object}
     */
    @ComMethod(name = "SetParam", dispId = 0x641)
    void SetParam(XlParameterType Type,
            Object Value);
            
    /**
     * <p>id(0x757)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "RefreshOnChange", dispId = 0x757)
    Boolean getRefreshOnChange();
            
    /**
     * <p>id(0x757)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnChange", dispId = 0x757)
    void setRefreshOnChange(Boolean param0);
            
    
}