
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AE-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AE-0001-0000-C000-000000000046}")
public interface IModules extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param RHS [out] {@code Module}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(Object Before,
            Object After,
            Object Count,
            VARIANT RHS);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(11)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(Object Before,
            Object After,
            Integer lcid);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(13)</p>
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(Integer lcid);
            
    /**
     * <p>id(0x10007)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "_Dummy7", dispId = 0x10007)
    void _Dummy7();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(15)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x27d)</p>
     * <p>vtableId(16)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    com.sun.jna.platform.win32.WinNT.HRESULT Move(Object Before,
            Object After,
            Integer lcid);
            
    /**
     * <p>id(0x389)</p>
     * <p>vtableId(18)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "__PrintOut", dispId = 0x389)
    com.sun.jna.platform.win32.WinNT.HRESULT __PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Integer lcid);
            
    /**
     * <p>id(0x1000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "_Dummy12", dispId = 0x1000c)
    void _Dummy12();
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(20)</p>
     * @param Replace [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace,
            Integer lcid);
            
    /**
     * <p>id(0x58a)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code HPageBreaks}
     */
    @ComProperty(name = "HPageBreaks", dispId = 0x58a)
    com.sun.jna.platform.win32.WinNT.HRESULT getHPageBreaks(VARIANT RHS);
            
    /**
     * <p>id(0x58b)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code VPageBreaks}
     */
    @ComProperty(name = "VPageBreaks", dispId = 0x58b)
    com.sun.jna.platform.win32.WinNT.HRESULT getVPageBreaks(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(23)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(24)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(25)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x6ec)</p>
     * <p>vtableId(26)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    com.sun.jna.platform.win32.WinNT.HRESULT _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            Integer lcid);
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(27)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
     * @param IgnorePrintAreas [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            Object IgnorePrintAreas,
            Integer lcid);
            
    /**
     * <p>id(0xbee)</p>
     * <p>vtableId(28)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param NewLayout [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Add2", dispId = 0xbee)
    com.sun.jna.platform.win32.WinNT.HRESULT Add2(Object Before,
            Object After,
            Object Count,
            Object NewLayout,
            VARIANT RHS);
            
    
}