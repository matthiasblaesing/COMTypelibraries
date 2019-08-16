
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2DF8D04E-5BFA-101B-BDE5-00AA0044DE52})</p>
 */
@ComInterface(iid="{2DF8D04E-5BFA-101B-BDE5-00AA0044DE52}")
public interface DocumentProperty extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param lcid [in] {@code Integer}
     * @param pbstrRetVal [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(Integer lcid,
            VARIANT pbstrRetVal);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     * @param lcid [in] {@code Integer}
     * @param pbstrRetVal [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(Integer lcid,
            String pbstrRetVal);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param lcid [in] {@code Integer}
     * @param pvargRetVal [out] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(Integer lcid,
            VARIANT pvargRetVal);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param lcid [in] {@code Integer}
     * @param pvargRetVal [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Integer lcid,
            Object pvargRetVal);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     * @param lcid [in] {@code Integer}
     * @param ptypeRetVal [out] {@code MsoDocProperties}
     */
    @ComProperty(name = "Type", dispId = 0x5)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(Integer lcid,
            VARIANT ptypeRetVal);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     * @param lcid [in] {@code Integer}
     * @param ptypeRetVal [in] {@code MsoDocProperties}
     */
    @ComProperty(name = "Type", dispId = 0x5)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(Integer lcid,
            MsoDocProperties ptypeRetVal);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     * @param pfLinkRetVal [out] {@code Boolean}
     */
    @ComProperty(name = "LinkToContent", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkToContent(VARIANT pfLinkRetVal);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     * @param pfLinkRetVal [in] {@code Boolean}
     */
    @ComProperty(name = "LinkToContent", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkToContent(Boolean pfLinkRetVal);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     * @param pbstrSourceRetVal [out] {@code String}
     */
    @ComProperty(name = "LinkSource", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkSource(VARIANT pbstrSourceRetVal);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     * @param pbstrSourceRetVal [in] {@code String}
     */
    @ComProperty(name = "LinkSource", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkSource(String pbstrSourceRetVal);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     * @param ppidisp [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Application", dispId = 0x6002000c)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppidisp);
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     * @param plCreator [out] {@code Integer}
     */
    @ComProperty(name = "Creator", dispId = 0x6002000d)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT plCreator);
            
    
}