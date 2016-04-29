
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002085E-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002085E-0001-0000-C000-000000000046}")
public interface IToolbarButton {
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
     * <p>id(0x229)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x229)
    com.sun.jna.platform.win32.WinNT.HRESULT getBuiltIn(VARIANT RHS);
            
    /**
     * <p>id(0x22a)</p>
     */
    @ComProperty(name = "BuiltInFace", dispId = 0x22a)
    com.sun.jna.platform.win32.WinNT.HRESULT getBuiltInFace(VARIANT RHS);
            
    /**
     * <p>id(0x22a)</p>
     */
    @ComProperty(name = "BuiltInFace", dispId = 0x22a)
    com.sun.jna.platform.win32.WinNT.HRESULT setBuiltInFace(Boolean RHS);
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(Toolbar Toolbar,
            Integer Before);
            
    /**
     * <p>id(0x3c6)</p>
     */
    @ComMethod(name = "CopyFace", dispId = 0x3c6)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyFace();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x232)</p>
     */
    @ComMethod(name = "Edit", dispId = 0x232)
    com.sun.jna.platform.win32.WinNT.HRESULT Edit();
            
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
     * <p>id(0x23a)</p>
     */
    @ComProperty(name = "ID", dispId = 0x23a)
    com.sun.jna.platform.win32.WinNT.HRESULT getID(VARIANT RHS);
            
    /**
     * <p>id(0x231)</p>
     */
    @ComProperty(name = "IsGap", dispId = 0x231)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsGap(VARIANT RHS);
            
    /**
     * <p>id(0x27d)</p>
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    com.sun.jna.platform.win32.WinNT.HRESULT Move(Toolbar Toolbar,
            Integer Before);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
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
     * <p>id(0x3c7)</p>
     */
    @ComMethod(name = "PasteFace", dispId = 0x3c7)
    com.sun.jna.platform.win32.WinNT.HRESULT PasteFace();
            
    /**
     * <p>id(0x230)</p>
     */
    @ComProperty(name = "Pushed", dispId = 0x230)
    com.sun.jna.platform.win32.WinNT.HRESULT getPushed(VARIANT RHS);
            
    /**
     * <p>id(0x230)</p>
     */
    @ComProperty(name = "Pushed", dispId = 0x230)
    com.sun.jna.platform.win32.WinNT.HRESULT setPushed(Boolean RHS);
            
    /**
     * <p>id(0x22b)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x22b)
    com.sun.jna.platform.win32.WinNT.HRESULT Reset();
            
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
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Integer RHS);
            
    
}