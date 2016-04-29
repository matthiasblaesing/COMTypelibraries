
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Definition of interface IShellWindows
 *
 * <p>uuid({85CB6900-4D95-11CF-960C-0080C7F4EE85})</p>
 */
@ComInterface(iid="{85CB6900-4D95-11CF-960C-0080C7F4EE85}")
public interface IShellWindows {
    /**
     * Get count of open Shell windows
     *
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60020000)
    Integer getCount();
            
    /**
     * Return the shell window for the given index
     *
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object index);
            
    /**
     * Register a window with the list
     *
     * <p>id(0x60020003)</p>
     */
    @ComMethod(name = "Register", dispId = 0x60020003)
    void Register(com.sun.jna.platform.win32.COM.util.IDispatch pid,
            Integer HWND,
            Integer swClass,
            VARIANT plCookie);
            
    /**
     * Register a pending open with the list
     *
     * <p>id(0x60020004)</p>
     */
    @ComMethod(name = "RegisterPending", dispId = 0x60020004)
    void RegisterPending(Integer lThreadId,
            Object pvarloc,
            Object pvarlocRoot,
            Integer swClass,
            VARIANT plCookie);
            
    /**
     * Remove a window from the list
     *
     * <p>id(0x60020005)</p>
     */
    @ComMethod(name = "Revoke", dispId = 0x60020005)
    void Revoke(Integer lCookie);
            
    /**
     * Notifies the new location
     *
     * <p>id(0x60020006)</p>
     */
    @ComMethod(name = "OnNavigate", dispId = 0x60020006)
    void OnNavigate(Integer lCookie,
            Object pvarloc);
            
    /**
     * Notifies the activation
     *
     * <p>id(0x60020007)</p>
     */
    @ComMethod(name = "OnActivated", dispId = 0x60020007)
    void OnActivated(Integer lCookie,
            Boolean fActive);
            
    /**
     * Find the window based on the location
     *
     * <p>id(0x60020008)</p>
     */
    @ComMethod(name = "FindWindowSW", dispId = 0x60020008)
    com.sun.jna.platform.win32.COM.util.IDispatch FindWindowSW(Object pvarloc,
            Object pvarlocRoot,
            Integer swClass,
            VARIANT pHWND,
            Integer swfwOptions);
            
    /**
     * Notifies on creation and frame name set
     *
     * <p>id(0x60020009)</p>
     */
    @ComMethod(name = "OnCreated", dispId = 0x60020009)
    void OnCreated(Integer lCookie,
            com.sun.jna.platform.win32.COM.util.IUnknown punk);
            
    /**
     * Used by IExplore to register different processes
     *
     * <p>id(0x6002000a)</p>
     */
    @ComMethod(name = "ProcessAttachDetach", dispId = 0x6002000a)
    void ProcessAttachDetach(Boolean fAttach);
            
    
}