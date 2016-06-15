
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002442F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002442F-0000-0000-C000-000000000046}")
public interface Validation extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb5)</p>
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    void Add(XlDVType Type,
            Object AlertStyle,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x645)</p>
     */
    @ComProperty(name = "AlertStyle", dispId = 0x645)
    Integer getAlertStyle();
            
    /**
     * <p>id(0x646)</p>
     */
    @ComProperty(name = "IgnoreBlank", dispId = 0x646)
    Boolean getIgnoreBlank();
            
    /**
     * <p>id(0x646)</p>
     */
    @ComProperty(name = "IgnoreBlank", dispId = 0x646)
    void setIgnoreBlank(Boolean param0);
            
    /**
     * <p>id(0x647)</p>
     */
    @ComProperty(name = "IMEMode", dispId = 0x647)
    Integer getIMEMode();
            
    /**
     * <p>id(0x647)</p>
     */
    @ComProperty(name = "IMEMode", dispId = 0x647)
    void setIMEMode(Integer param0);
            
    /**
     * <p>id(0x648)</p>
     */
    @ComProperty(name = "InCellDropdown", dispId = 0x648)
    Boolean getInCellDropdown();
            
    /**
     * <p>id(0x648)</p>
     */
    @ComProperty(name = "InCellDropdown", dispId = 0x648)
    void setInCellDropdown(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x649)</p>
     */
    @ComProperty(name = "ErrorMessage", dispId = 0x649)
    String getErrorMessage();
            
    /**
     * <p>id(0x649)</p>
     */
    @ComProperty(name = "ErrorMessage", dispId = 0x649)
    void setErrorMessage(String param0);
            
    /**
     * <p>id(0x64a)</p>
     */
    @ComProperty(name = "ErrorTitle", dispId = 0x64a)
    String getErrorTitle();
            
    /**
     * <p>id(0x64a)</p>
     */
    @ComProperty(name = "ErrorTitle", dispId = 0x64a)
    void setErrorTitle(String param0);
            
    /**
     * <p>id(0x64b)</p>
     */
    @ComProperty(name = "InputMessage", dispId = 0x64b)
    String getInputMessage();
            
    /**
     * <p>id(0x64b)</p>
     */
    @ComProperty(name = "InputMessage", dispId = 0x64b)
    void setInputMessage(String param0);
            
    /**
     * <p>id(0x64c)</p>
     */
    @ComProperty(name = "InputTitle", dispId = 0x64c)
    String getInputTitle();
            
    /**
     * <p>id(0x64c)</p>
     */
    @ComProperty(name = "InputTitle", dispId = 0x64c)
    void setInputTitle(String param0);
            
    /**
     * <p>id(0x62b)</p>
     */
    @ComProperty(name = "Formula1", dispId = 0x62b)
    String getFormula1();
            
    /**
     * <p>id(0x62c)</p>
     */
    @ComProperty(name = "Formula2", dispId = 0x62c)
    String getFormula2();
            
    /**
     * <p>id(0x62d)</p>
     */
    @ComMethod(name = "Modify", dispId = 0x62d)
    void Modify(Object Type,
            Object AlertStyle,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x31d)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    Integer getOperator();
            
    /**
     * <p>id(0x64d)</p>
     */
    @ComProperty(name = "ShowError", dispId = 0x64d)
    Boolean getShowError();
            
    /**
     * <p>id(0x64d)</p>
     */
    @ComProperty(name = "ShowError", dispId = 0x64d)
    void setShowError(Boolean param0);
            
    /**
     * <p>id(0x64e)</p>
     */
    @ComProperty(name = "ShowInput", dispId = 0x64e)
    Boolean getShowInput();
            
    /**
     * <p>id(0x64e)</p>
     */
    @ComProperty(name = "ShowInput", dispId = 0x64e)
    void setShowInput(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Boolean getValue();
            
    
}