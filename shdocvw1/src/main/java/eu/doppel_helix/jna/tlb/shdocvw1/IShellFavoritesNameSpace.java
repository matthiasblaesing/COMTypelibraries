
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IShellFavoritesNameSpace Interface
 *
 * <p>uuid({55136804-B2DE-11D1-B9F2-00A0C98BC547})</p>
 */
@ComInterface(iid="{55136804-B2DE-11D1-B9F2-00A0C98BC547}")
public interface IShellFavoritesNameSpace extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * method MoveSelectionUp
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "MoveSelectionUp", dispId = 0x1)
    void MoveSelectionUp();
            
    /**
     * method MoveSelectionDown
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "MoveSelectionDown", dispId = 0x2)
    void MoveSelectionDown();
            
    /**
     * method ResetSort
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "ResetSort", dispId = 0x3)
    void ResetSort();
            
    /**
     * method NewFolder
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "NewFolder", dispId = 0x4)
    void NewFolder();
            
    /**
     * method Synchronize
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Synchronize", dispId = 0x5)
    void Synchronize();
            
    /**
     * method Import
     *
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Import", dispId = 0x6)
    void Import();
            
    /**
     * method Export
     *
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Export", dispId = 0x7)
    void Export();
            
    /**
     * method InvokeContextMenuCommand
     *
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param strCommand [in] {@code String}
     */
    @ComMethod(name = "InvokeContextMenuCommand", dispId = 0x8)
    void InvokeContextMenuCommand(String strCommand);
            
    /**
     * method MoveSelectionTo
     *
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "MoveSelectionTo", dispId = 0x9)
    void MoveSelectionTo();
            
    /**
     * Query to see if subscriptions are enabled
     *
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "SubscriptionsEnabled", dispId = 0xa)
    Boolean getSubscriptionsEnabled();
            
    /**
     * method CreateSubscriptionForSelection
     *
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "CreateSubscriptionForSelection", dispId = 0xb)
    Boolean CreateSubscriptionForSelection();
            
    /**
     * method DeleteSubscriptionForSelection
     *
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "DeleteSubscriptionForSelection", dispId = 0xc)
    Boolean DeleteSubscriptionForSelection();
            
    /**
     * old, use put_Root() instead
     *
     * <p>id(0xd)</p>
     * <p>vtableId(19)</p>
     * @param bstrFullPath [in] {@code String}
     */
    @ComMethod(name = "SetRoot", dispId = 0xd)
    void SetRoot(String bstrFullPath);
            
    
}