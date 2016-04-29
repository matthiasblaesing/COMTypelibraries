
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020857-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020857-0001-0000-C000-000000000046}")
public interface IAddIn {
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
     * <p>id(0x23e)</p>
     */
    @ComProperty(name = "Author", dispId = 0x23e)
    com.sun.jna.platform.win32.WinNT.HRESULT getAuthor(VARIANT RHS);
            
    /**
     * <p>id(0x23f)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    com.sun.jna.platform.win32.WinNT.HRESULT getComments(VARIANT RHS);
            
    /**
     * <p>id(0x121)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x121)
    com.sun.jna.platform.win32.WinNT.HRESULT getFullName(VARIANT RHS);
            
    /**
     * <p>id(0x226)</p>
     */
    @ComProperty(name = "Installed", dispId = 0x226)
    com.sun.jna.platform.win32.WinNT.HRESULT getInstalled(VARIANT RHS);
            
    /**
     * <p>id(0x226)</p>
     */
    @ComProperty(name = "Installed", dispId = 0x226)
    com.sun.jna.platform.win32.WinNT.HRESULT setInstalled(Boolean RHS);
            
    /**
     * <p>id(0x241)</p>
     */
    @ComProperty(name = "Keywords", dispId = 0x241)
    com.sun.jna.platform.win32.WinNT.HRESULT getKeywords(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x123)</p>
     */
    @ComProperty(name = "Path", dispId = 0x123)
    com.sun.jna.platform.win32.WinNT.HRESULT getPath(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubject(VARIANT RHS);
            
    /**
     * <p>id(0xc7)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT getTitle(VARIANT RHS);
            
    /**
     * <p>id(0x5f3)</p>
     */
    @ComProperty(name = "progID", dispId = 0x5f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getProgID(VARIANT RHS);
            
    /**
     * <p>id(0x7fb)</p>
     */
    @ComProperty(name = "CLSID", dispId = 0x7fb)
    com.sun.jna.platform.win32.WinNT.HRESULT getCLSID(VARIANT RHS);
            
    /**
     * <p>id(0xb31)</p>
     */
    @ComProperty(name = "IsOpen", dispId = 0xb31)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsOpen(VARIANT RHS);
            
    
}