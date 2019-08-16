
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
     * <p>id(0xb5)</p>
     * <p>vtableId(10)</p>
     * @param Type [in] {@code XlDVType}
     * @param AlertStyle [in, optional] {@code Object}
     * @param Operator [in, optional] {@code Object}
     * @param Formula1 [in, optional] {@code Object}
     * @param Formula2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    void Add(XlDVType Type,
            Object AlertStyle,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x645)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AlertStyle", dispId = 0x645)
    Integer getAlertStyle();
            
    /**
     * <p>id(0x646)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "IgnoreBlank", dispId = 0x646)
    Boolean getIgnoreBlank();
            
    /**
     * <p>id(0x646)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreBlank", dispId = 0x646)
    void setIgnoreBlank(Boolean param0);
            
    /**
     * <p>id(0x647)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IMEMode", dispId = 0x647)
    Integer getIMEMode();
            
    /**
     * <p>id(0x647)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "IMEMode", dispId = 0x647)
    void setIMEMode(Integer param0);
            
    /**
     * <p>id(0x648)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "InCellDropdown", dispId = 0x648)
    Boolean getInCellDropdown();
            
    /**
     * <p>id(0x648)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InCellDropdown", dispId = 0x648)
    void setInCellDropdown(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x649)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ErrorMessage", dispId = 0x649)
    String getErrorMessage();
            
    /**
     * <p>id(0x649)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ErrorMessage", dispId = 0x649)
    void setErrorMessage(String param0);
            
    /**
     * <p>id(0x64a)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ErrorTitle", dispId = 0x64a)
    String getErrorTitle();
            
    /**
     * <p>id(0x64a)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ErrorTitle", dispId = 0x64a)
    void setErrorTitle(String param0);
            
    /**
     * <p>id(0x64b)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "InputMessage", dispId = 0x64b)
    String getInputMessage();
            
    /**
     * <p>id(0x64b)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InputMessage", dispId = 0x64b)
    void setInputMessage(String param0);
            
    /**
     * <p>id(0x64c)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "InputTitle", dispId = 0x64c)
    String getInputTitle();
            
    /**
     * <p>id(0x64c)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InputTitle", dispId = 0x64c)
    void setInputTitle(String param0);
            
    /**
     * <p>id(0x62b)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Formula1", dispId = 0x62b)
    String getFormula1();
            
    /**
     * <p>id(0x62c)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Formula2", dispId = 0x62c)
    String getFormula2();
            
    /**
     * <p>id(0x62d)</p>
     * <p>vtableId(29)</p>
     * @param Type [in, optional] {@code Object}
     * @param AlertStyle [in, optional] {@code Object}
     * @param Operator [in, optional] {@code Object}
     * @param Formula1 [in, optional] {@code Object}
     * @param Formula2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Modify", dispId = 0x62d)
    void Modify(Object Type,
            Object AlertStyle,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x31d)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    Integer getOperator();
            
    /**
     * <p>id(0x64d)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ShowError", dispId = 0x64d)
    Boolean getShowError();
            
    /**
     * <p>id(0x64d)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowError", dispId = 0x64d)
    void setShowError(Boolean param0);
            
    /**
     * <p>id(0x64e)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "ShowInput", dispId = 0x64e)
    Boolean getShowInput();
            
    /**
     * <p>id(0x64e)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowInput", dispId = 0x64e)
    void setShowInput(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Boolean getValue();
            
    
}