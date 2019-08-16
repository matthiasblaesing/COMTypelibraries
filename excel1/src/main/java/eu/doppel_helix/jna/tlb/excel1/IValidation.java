
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002442F-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002442F-0001-0000-C000-000000000046}")
public interface IValidation extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT Add(XlDVType Type,
            Object AlertStyle,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x645)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "AlertStyle", dispId = 0x645)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlertStyle(VARIANT RHS);
            
    /**
     * <p>id(0x646)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IgnoreBlank", dispId = 0x646)
    com.sun.jna.platform.win32.WinNT.HRESULT getIgnoreBlank(VARIANT RHS);
            
    /**
     * <p>id(0x646)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreBlank", dispId = 0x646)
    com.sun.jna.platform.win32.WinNT.HRESULT setIgnoreBlank(Boolean RHS);
            
    /**
     * <p>id(0x647)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "IMEMode", dispId = 0x647)
    com.sun.jna.platform.win32.WinNT.HRESULT getIMEMode(VARIANT RHS);
            
    /**
     * <p>id(0x647)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "IMEMode", dispId = 0x647)
    com.sun.jna.platform.win32.WinNT.HRESULT setIMEMode(Integer RHS);
            
    /**
     * <p>id(0x648)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InCellDropdown", dispId = 0x648)
    com.sun.jna.platform.win32.WinNT.HRESULT getInCellDropdown(VARIANT RHS);
            
    /**
     * <p>id(0x648)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "InCellDropdown", dispId = 0x648)
    com.sun.jna.platform.win32.WinNT.HRESULT setInCellDropdown(Boolean RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x649)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ErrorMessage", dispId = 0x649)
    com.sun.jna.platform.win32.WinNT.HRESULT getErrorMessage(VARIANT RHS);
            
    /**
     * <p>id(0x649)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ErrorMessage", dispId = 0x649)
    com.sun.jna.platform.win32.WinNT.HRESULT setErrorMessage(String RHS);
            
    /**
     * <p>id(0x64a)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ErrorTitle", dispId = 0x64a)
    com.sun.jna.platform.win32.WinNT.HRESULT getErrorTitle(VARIANT RHS);
            
    /**
     * <p>id(0x64a)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ErrorTitle", dispId = 0x64a)
    com.sun.jna.platform.win32.WinNT.HRESULT setErrorTitle(String RHS);
            
    /**
     * <p>id(0x64b)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "InputMessage", dispId = 0x64b)
    com.sun.jna.platform.win32.WinNT.HRESULT getInputMessage(VARIANT RHS);
            
    /**
     * <p>id(0x64b)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "InputMessage", dispId = 0x64b)
    com.sun.jna.platform.win32.WinNT.HRESULT setInputMessage(String RHS);
            
    /**
     * <p>id(0x64c)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "InputTitle", dispId = 0x64c)
    com.sun.jna.platform.win32.WinNT.HRESULT getInputTitle(VARIANT RHS);
            
    /**
     * <p>id(0x64c)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "InputTitle", dispId = 0x64c)
    com.sun.jna.platform.win32.WinNT.HRESULT setInputTitle(String RHS);
            
    /**
     * <p>id(0x62b)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula1", dispId = 0x62b)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula1(VARIANT RHS);
            
    /**
     * <p>id(0x62c)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula2", dispId = 0x62c)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula2(VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT Modify(Object Type,
            Object AlertStyle,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x31d)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    com.sun.jna.platform.win32.WinNT.HRESULT getOperator(VARIANT RHS);
            
    /**
     * <p>id(0x64d)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowError", dispId = 0x64d)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowError(VARIANT RHS);
            
    /**
     * <p>id(0x64d)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowError", dispId = 0x64d)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowError(Boolean RHS);
            
    /**
     * <p>id(0x64e)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowInput", dispId = 0x64e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowInput(VARIANT RHS);
            
    /**
     * <p>id(0x64e)</p>
     * <p>vtableId(34)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowInput", dispId = 0x64e)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowInput(Boolean RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    
}