
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C170E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C170E-0000-0000-C000-000000000046}")
public interface IMsoTrendline extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xb9)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Backward", dispId = 0xb9)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackward(VARIANT RHS);
            
    /**
     * <p>id(0xb9)</p>
     * <p>vtableId(9)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Backward", dispId = 0xb9)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackward(Double RHS);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code IMsoBorder}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code IMsoDataLabel}
     */
    @ComProperty(name = "DataLabel", dispId = 0x9e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataLabel(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayEquation", dispId = 0xbe)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayEquation(VARIANT RHS);
            
    /**
     * <p>id(0xbe)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayEquation", dispId = 0xbe)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayEquation(Boolean RHS);
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayRSquared", dispId = 0xbd)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayRSquared(VARIANT RHS);
            
    /**
     * <p>id(0xbd)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRSquared", dispId = 0xbd)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayRSquared(Boolean RHS);
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Forward", dispId = 0xbf)
    com.sun.jna.platform.win32.WinNT.HRESULT getForward(VARIANT RHS);
            
    /**
     * <p>id(0xbf)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Forward", dispId = 0xbf)
    com.sun.jna.platform.win32.WinNT.HRESULT setForward(Double RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0xba)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Intercept", dispId = 0xba)
    com.sun.jna.platform.win32.WinNT.HRESULT getIntercept(VARIANT RHS);
            
    /**
     * <p>id(0xba)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Intercept", dispId = 0xba)
    com.sun.jna.platform.win32.WinNT.HRESULT setIntercept(Double RHS);
            
    /**
     * <p>id(0xbb)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InterceptIsAuto", dispId = 0xbb)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterceptIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0xbb)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "InterceptIsAuto", dispId = 0xbb)
    com.sun.jna.platform.win32.WinNT.HRESULT setInterceptIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "NameIsAuto", dispId = 0xbc)
    com.sun.jna.platform.win32.WinNT.HRESULT getNameIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0xbc)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "NameIsAuto", dispId = 0xbc)
    com.sun.jna.platform.win32.WinNT.HRESULT setNameIsAuto(Boolean RHS);
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrder(VARIANT RHS);
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrder(Integer RHS);
            
    /**
     * <p>id(0xb8)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Period", dispId = 0xb8)
    com.sun.jna.platform.win32.WinNT.HRESULT getPeriod(VARIANT RHS);
            
    /**
     * <p>id(0xb8)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Period", dispId = 0xb8)
    com.sun.jna.platform.win32.WinNT.HRESULT setPeriod(Integer RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code XlTrendlineType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code XlTrendlineType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(XlTrendlineType RHS);
            
    /**
     * <p>id(0x6002001d)</p>
     * <p>vtableId(36)</p>
     * @param ppChartFormat [out] {@code IMsoChartFormat}
     */
    @ComProperty(name = "Format", dispId = 0x6002001d)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT ppChartFormat);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(37)</p>
     * @param ppval [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppval);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(38)</p>
     * @param pval [out] {@code Integer}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT pval);
            
    /**
     * <p>id(0xa5a)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Backward2", dispId = 0xa5a)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackward2(VARIANT RHS);
            
    /**
     * <p>id(0xa5a)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Backward2", dispId = 0xa5a)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackward2(Double RHS);
            
    /**
     * <p>id(0xa5b)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Forward2", dispId = 0xa5b)
    com.sun.jna.platform.win32.WinNT.HRESULT getForward2(VARIANT RHS);
            
    /**
     * <p>id(0xa5b)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Forward2", dispId = 0xa5b)
    com.sun.jna.platform.win32.WinNT.HRESULT setForward2(Double RHS);
            
    
}