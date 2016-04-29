
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020868-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020868-0001-0000-C000-000000000046}")
public interface IMenuItem {
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
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x257)</p>
     */
    @ComProperty(name = "Checked", dispId = 0x257)
    com.sun.jna.platform.win32.WinNT.HRESULT getChecked(VARIANT RHS);
            
    /**
     * <p>id(0x257)</p>
     */
    @ComProperty(name = "Checked", dispId = 0x257)
    com.sun.jna.platform.win32.WinNT.HRESULT setChecked(Boolean RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0x163)</p>
     */
    @ComProperty(name = "HelpContextID", dispId = 0x163)
    com.sun.jna.platform.win32.WinNT.HRESULT getHelpContextID(VARIANT RHS);
            
    /**
     * <p>id(0x163)</p>
     */
    @ComProperty(name = "HelpContextID", dispId = 0x163)
    com.sun.jna.platform.win32.WinNT.HRESULT setHelpContextID(Integer RHS);
            
    /**
     * <p>id(0x168)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x168)
    com.sun.jna.platform.win32.WinNT.HRESULT getHelpFile(VARIANT RHS);
            
    /**
     * <p>id(0x168)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x168)
    com.sun.jna.platform.win32.WinNT.HRESULT setHelpFile(String RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnAction(VARIANT RHS);
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnAction(String RHS);
            
    /**
     * <p>id(0x182)</p>
     */
    @ComProperty(name = "StatusBar", dispId = 0x182)
    com.sun.jna.platform.win32.WinNT.HRESULT getStatusBar(VARIANT RHS);
            
    /**
     * <p>id(0x182)</p>
     */
    @ComProperty(name = "StatusBar", dispId = 0x182)
    com.sun.jna.platform.win32.WinNT.HRESULT setStatusBar(String RHS);
            
    
}