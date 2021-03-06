
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002447D-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002447D-0001-0000-C000-000000000046}")
public interface IListDataFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code XlListDataType}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x92c)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Choices", dispId = 0x92c)
    com.sun.jna.platform.win32.WinNT.HRESULT getChoices(VARIANT RHS);
            
    /**
     * <p>id(0x92d)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "DecimalPlaces", dispId = 0x92d)
    com.sun.jna.platform.win32.WinNT.HRESULT getDecimalPlaces(VARIANT RHS);
            
    /**
     * <p>id(0x92e)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "DefaultValue", dispId = 0x92e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDefaultValue(VARIANT RHS);
            
    /**
     * <p>id(0x92f)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IsPercent", dispId = 0x92f)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsPercent(VARIANT RHS);
            
    /**
     * <p>id(0x930)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "lcid", dispId = 0x930)
    com.sun.jna.platform.win32.WinNT.HRESULT getLcid(VARIANT RHS);
            
    /**
     * <p>id(0x931)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MaxCharacters", dispId = 0x931)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaxCharacters(VARIANT RHS);
            
    /**
     * <p>id(0x932)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "MaxNumber", dispId = 0x932)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaxNumber(VARIANT RHS);
            
    /**
     * <p>id(0x933)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "MinNumber", dispId = 0x933)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinNumber(VARIANT RHS);
            
    /**
     * <p>id(0x934)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Required", dispId = 0x934)
    com.sun.jna.platform.win32.WinNT.HRESULT getRequired(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code XlListDataType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x128)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ReadOnly", dispId = 0x128)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadOnly(VARIANT RHS);
            
    /**
     * <p>id(0x935)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowFillIn", dispId = 0x935)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowFillIn(VARIANT RHS);
            
    
}