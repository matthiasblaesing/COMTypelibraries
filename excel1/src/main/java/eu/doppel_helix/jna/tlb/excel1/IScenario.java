
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020897-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020897-0001-0000-C000-000000000046}")
public interface IScenario extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x390)</p>
     */
    @ComMethod(name = "ChangeScenario", dispId = 0x390)
    com.sun.jna.platform.win32.WinNT.HRESULT ChangeScenario(Object ChangingCells,
            Object Values,
            VARIANT RHS);
            
    /**
     * <p>id(0x38f)</p>
     */
    @ComProperty(name = "ChangingCells", dispId = 0x38f)
    com.sun.jna.platform.win32.WinNT.HRESULT getChangingCells(VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT getComment(VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT setComment(String RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT getHidden(VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT setHidden(Boolean RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
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
     * <p>id(0x1f0)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    com.sun.jna.platform.win32.WinNT.HRESULT Show(VARIANT RHS);
            
    /**
     * <p>id(0xa4)</p>
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    com.sun.jna.platform.win32.WinNT.HRESULT getValues(Object Index,
            VARIANT RHS);
            
    
}