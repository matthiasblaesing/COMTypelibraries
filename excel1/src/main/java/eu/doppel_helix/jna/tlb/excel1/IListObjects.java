
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024470-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024470-0001-0000-C000-000000000046}")
public interface IListObjects extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x825)</p>
     * <p>vtableId(10)</p>
     * @param SourceType [in, optional] {@code XlListObjectSourceType}
     * @param Source [in, optional] {@code Object}
     * @param LinkSource [in, optional] {@code Object}
     * @param XlListObjectHasHeaders [in, optional] {@code XlYesNoGuess}
     * @param Destination [in, optional] {@code Object}
     * @param RHS [out] {@code ListObject}
     */
    @ComMethod(name = "_Add", dispId = 0x825)
    com.sun.jna.platform.win32.WinNT.HRESULT _Add(XlListObjectSourceType SourceType,
            Object Source,
            Object LinkSource,
            XlYesNoGuess XlListObjectHasHeaders,
            Object Destination,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code ListObject}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code ListObject}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(15)</p>
     * @param SourceType [in, optional] {@code XlListObjectSourceType}
     * @param Source [in, optional] {@code Object}
     * @param LinkSource [in, optional] {@code Object}
     * @param XlListObjectHasHeaders [in, optional] {@code XlYesNoGuess}
     * @param Destination [in, optional] {@code Object}
     * @param TableStyleName [in, optional] {@code Object}
     * @param RHS [out] {@code ListObject}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(XlListObjectSourceType SourceType,
            Object Source,
            Object LinkSource,
            XlYesNoGuess XlListObjectHasHeaders,
            Object Destination,
            Object TableStyleName,
            VARIANT RHS);
            
    
}