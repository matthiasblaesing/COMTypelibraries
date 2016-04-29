
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IShellFavoritesNameSpace Interface
 *
 * <p>uuid({55136804-B2DE-11D1-B9F2-00A0C98BC547})</p>
 */
@ComInterface(iid="{55136804-B2DE-11D1-B9F2-00A0C98BC547}")
public interface IShellFavoritesNameSpace {
    /**
     * method MoveSelectionUp
     *
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "MoveSelectionUp", dispId = 0x1)
    void MoveSelectionUp();
            
    /**
     * method MoveSelectionDown
     *
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "MoveSelectionDown", dispId = 0x2)
    void MoveSelectionDown();
            
    /**
     * method ResetSort
     *
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "ResetSort", dispId = 0x3)
    void ResetSort();
            
    /**
     * method NewFolder
     *
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "NewFolder", dispId = 0x4)
    void NewFolder();
            
    /**
     * method Synchronize
     *
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Synchronize", dispId = 0x5)
    void Synchronize();
            
    /**
     * method Import
     *
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Import", dispId = 0x6)
    void Import();
            
    /**
     * method Export
     *
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "Export", dispId = 0x7)
    void Export();
            
    /**
     * method InvokeContextMenuCommand
     *
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "InvokeContextMenuCommand", dispId = 0x8)
    void InvokeContextMenuCommand(String strCommand);
            
    /**
     * method MoveSelectionTo
     *
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "MoveSelectionTo", dispId = 0x9)
    void MoveSelectionTo();
            
    /**
     * Query to see if subscriptions are enabled
     *
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "SubscriptionsEnabled", dispId = 0xa)
    Boolean getSubscriptionsEnabled();
            
    /**
     * method CreateSubscriptionForSelection
     *
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "CreateSubscriptionForSelection", dispId = 0xb)
    Boolean CreateSubscriptionForSelection();
            
    /**
     * method DeleteSubscriptionForSelection
     *
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "DeleteSubscriptionForSelection", dispId = 0xc)
    Boolean DeleteSubscriptionForSelection();
            
    /**
     * old, use put_Root() instead
     *
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "SetRoot", dispId = 0xd)
    void SetRoot(String bstrFullPath);
            
    
}