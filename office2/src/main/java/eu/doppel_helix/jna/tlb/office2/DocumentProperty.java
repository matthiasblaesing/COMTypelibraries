
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
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(Integer lcid,
            VARIANT pbstrRetVal);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(Integer lcid,
            String pbstrRetVal);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(Integer lcid,
            VARIANT pvargRetVal);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Integer lcid,
            Object pvargRetVal);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Type", dispId = 0x5)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(Integer lcid,
            VARIANT ptypeRetVal);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Type", dispId = 0x5)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(Integer lcid,
            MsoDocProperties ptypeRetVal);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "LinkToContent", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkToContent(VARIANT pfLinkRetVal);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "LinkToContent", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkToContent(Boolean pfLinkRetVal);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "LinkSource", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkSource(VARIANT pbstrSourceRetVal);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "LinkSource", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkSource(String pbstrSourceRetVal);
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "Application", dispId = 0x6002000c)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppidisp);
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x6002000d)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT plCreator);
            
    
}