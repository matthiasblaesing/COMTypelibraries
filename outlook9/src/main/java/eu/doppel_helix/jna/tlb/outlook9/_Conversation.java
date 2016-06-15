
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063101-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063101-0000-0000-C000-000000000046}")
public interface _Conversation extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xfc4f)</p>
     */
    @ComMethod(name = "GetTable", dispId = 0xfc4f)
    Table GetTable();
            
    /**
     * <p>id(0xfc50)</p>
     */
    @ComMethod(name = "GetChildren", dispId = 0xfc50)
    SimpleItems GetChildren(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc52)</p>
     */
    @ComMethod(name = "GetParent", dispId = 0xfc52)
    com.sun.jna.platform.win32.COM.util.IDispatch GetParent(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc53)</p>
     */
    @ComMethod(name = "GetRootItems", dispId = 0xfc53)
    SimpleItems GetRootItems();
            
    /**
     * <p>id(0xfc5a)</p>
     */
    @ComMethod(name = "GetAlwaysAssignCategories", dispId = 0xfc5a)
    String GetAlwaysAssignCategories(_Store Store);
            
    /**
     * <p>id(0xfc5b)</p>
     */
    @ComMethod(name = "GetAlwaysDelete", dispId = 0xfc5b)
    OlAlwaysDeleteConversation GetAlwaysDelete(_Store Store);
            
    /**
     * <p>id(0xfc5c)</p>
     */
    @ComMethod(name = "GetAlwaysMoveToFolder", dispId = 0xfc5c)
    MAPIFolder GetAlwaysMoveToFolder(_Store Store);
            
    /**
     * <p>id(0xfc5d)</p>
     */
    @ComMethod(name = "MarkAsRead", dispId = 0xfc5d)
    void MarkAsRead();
            
    /**
     * <p>id(0xfc5e)</p>
     */
    @ComMethod(name = "MarkAsUnread", dispId = 0xfc5e)
    void MarkAsUnread();
            
    /**
     * <p>id(0xfc5f)</p>
     */
    @ComMethod(name = "SetAlwaysAssignCategories", dispId = 0xfc5f)
    void SetAlwaysAssignCategories(String Categories,
            _Store Store);
            
    /**
     * <p>id(0xfc60)</p>
     */
    @ComMethod(name = "SetAlwaysDelete", dispId = 0xfc60)
    void SetAlwaysDelete(OlAlwaysDeleteConversation AlwaysDelete,
            _Store Store);
            
    /**
     * <p>id(0xfc61)</p>
     */
    @ComMethod(name = "SetAlwaysMoveToFolder", dispId = 0xfc61)
    void SetAlwaysMoveToFolder(MAPIFolder MoveToFolder,
            _Store Store);
            
    /**
     * <p>id(0xfc62)</p>
     */
    @ComMethod(name = "ClearAlwaysAssignCategories", dispId = 0xfc62)
    void ClearAlwaysAssignCategories(_Store Store);
            
    /**
     * <p>id(0xfc63)</p>
     */
    @ComMethod(name = "StopAlwaysDelete", dispId = 0xfc63)
    void StopAlwaysDelete(_Store Store);
            
    /**
     * <p>id(0xfc64)</p>
     */
    @ComMethod(name = "StopAlwaysMoveToFolder", dispId = 0xfc64)
    void StopAlwaysMoveToFolder(_Store Store);
            
    /**
     * <p>id(0xfc75)</p>
     */
    @ComProperty(name = "ConversationID", dispId = 0xfc75)
    String getConversationID();
            
    
}