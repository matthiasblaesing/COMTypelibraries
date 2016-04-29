
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002447E-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002447E-0001-0000-C000-000000000046}")
public interface IXPath {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x8d6)</p>
     */
    @ComProperty(name = "Map", dispId = 0x8d6)
    com.sun.jna.platform.win32.WinNT.HRESULT getMap(VARIANT RHS);
            
    /**
     * <p>id(0x936)</p>
     */
    @ComMethod(name = "SetValue", dispId = 0x936)
    com.sun.jna.platform.win32.WinNT.HRESULT SetValue(XmlMap Map,
            String XPath,
            Object SelectionNamespace,
            Object Repeating);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    com.sun.jna.platform.win32.WinNT.HRESULT Clear();
            
    /**
     * <p>id(0x938)</p>
     */
    @ComProperty(name = "Repeating", dispId = 0x938)
    com.sun.jna.platform.win32.WinNT.HRESULT getRepeating(VARIANT RHS);
            
    
}