
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Definition of interface IShellWindows
 *
 * <p>uuid({85CB6900-4D95-11CF-960C-0080C7F4EE85})</p>
 */
@ComInterface(iid="{85CB6900-4D95-11CF-960C-0080C7F4EE85}")
public interface IShellWindows extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get count of open Shell windows
     *
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60020000)
    Integer getCount();
            
    /**
     * Return the shell window for the given index
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param index [in, optional] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object index);
            
    /**
     * Register a window with the list
     *
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param pid [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param HWND [in] {@code Integer}
     * @param swClass [in] {@code Integer}
     * @param plCookie [out] {@code Integer}
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
     * <p>vtableId(11)</p>
     * @param lThreadId [in] {@code Integer}
     * @param pvarloc [in] {@code Object}
     * @param pvarlocRoot [in] {@code Object}
     * @param swClass [in] {@code Integer}
     * @param plCookie [out] {@code Integer}
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
     * <p>vtableId(12)</p>
     * @param lCookie [in] {@code Integer}
     */
    @ComMethod(name = "Revoke", dispId = 0x60020005)
    void Revoke(Integer lCookie);
            
    /**
     * Notifies the new location
     *
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param lCookie [in] {@code Integer}
     * @param pvarloc [in] {@code Object}
     */
    @ComMethod(name = "OnNavigate", dispId = 0x60020006)
    void OnNavigate(Integer lCookie,
            Object pvarloc);
            
    /**
     * Notifies the activation
     *
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param lCookie [in] {@code Integer}
     * @param fActive [in] {@code Boolean}
     */
    @ComMethod(name = "OnActivated", dispId = 0x60020007)
    void OnActivated(Integer lCookie,
            Boolean fActive);
            
    /**
     * Find the window based on the location
     *
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     * @param pvarloc [in] {@code Object}
     * @param pvarlocRoot [in] {@code Object}
     * @param swClass [in] {@code Integer}
     * @param pHWND [out] {@code Integer}
     * @param swfwOptions [in] {@code Integer}
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
     * <p>vtableId(16)</p>
     * @param lCookie [in] {@code Integer}
     * @param punk [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "OnCreated", dispId = 0x60020009)
    void OnCreated(Integer lCookie,
            com.sun.jna.platform.win32.COM.util.IUnknown punk);
            
    /**
     * Used by IExplore to register different processes
     *
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     * @param fAttach [in] {@code Boolean}
     */
    @ComMethod(name = "ProcessAttachDetach", dispId = 0x6002000a)
    void ProcessAttachDetach(Boolean fAttach);
            
    
}