
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024431-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024431-0001-0000-C000-000000000046}")
public interface IHyperlink extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x62e)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShape(VARIANT RHS);
            
    /**
     * <p>id(0x5bf)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x5bf)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubAddress(VARIANT RHS);
            
    /**
     * <p>id(0x5bf)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x5bf)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubAddress(String RHS);
            
    /**
     * <p>id(0xec)</p>
     */
    @ComProperty(name = "Address", dispId = 0xec)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddress(VARIANT RHS);
            
    /**
     * <p>id(0xec)</p>
     */
    @ComProperty(name = "Address", dispId = 0xec)
    com.sun.jna.platform.win32.WinNT.HRESULT setAddress(String RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x5c4)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x5c4)
    com.sun.jna.platform.win32.WinNT.HRESULT AddToFavorites();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x650)</p>
     */
    @ComMethod(name = "Follow", dispId = 0x650)
    com.sun.jna.platform.win32.WinNT.HRESULT Follow(Object NewWindow,
            Object AddHistory,
            Object ExtraInfo,
            Object Method,
            Object HeaderInfo);
            
    /**
     * <p>id(0x75b)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x75b)
    com.sun.jna.platform.win32.WinNT.HRESULT getEmailSubject(VARIANT RHS);
            
    /**
     * <p>id(0x75b)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x75b)
    com.sun.jna.platform.win32.WinNT.HRESULT setEmailSubject(String RHS);
            
    /**
     * <p>id(0x759)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x759)
    com.sun.jna.platform.win32.WinNT.HRESULT getScreenTip(VARIANT RHS);
            
    /**
     * <p>id(0x759)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x759)
    com.sun.jna.platform.win32.WinNT.HRESULT setScreenTip(String RHS);
            
    /**
     * <p>id(0x75a)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x75a)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextToDisplay(VARIANT RHS);
            
    /**
     * <p>id(0x75a)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x75a)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextToDisplay(String RHS);
            
    /**
     * <p>id(0x75c)</p>
     */
    @ComMethod(name = "CreateNewDocument", dispId = 0x75c)
    com.sun.jna.platform.win32.WinNT.HRESULT CreateNewDocument(String Filename,
            Boolean EditNow,
            Boolean Overwrite);
            
    
}