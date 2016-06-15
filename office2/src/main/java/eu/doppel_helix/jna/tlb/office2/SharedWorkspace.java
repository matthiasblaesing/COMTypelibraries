
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0385-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0385-0000-0000-C000-000000000046}")
public interface SharedWorkspace extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    void setName(String param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Members", dispId = 0x1)
    SharedWorkspaceMembers getMembers();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Tasks", dispId = 0x2)
    SharedWorkspaceTasks getTasks();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Files", dispId = 0x3)
    SharedWorkspaceFiles getFiles();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Folders", dispId = 0x4)
    SharedWorkspaceFolders getFolders();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Links", dispId = 0x5)
    SharedWorkspaceLinks getLinks();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x6)
    void Refresh();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "CreateNew", dispId = 0x7)
    void CreateNew(Object URL,
            Object Name);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x8)
    void Delete();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x9)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "URL", dispId = 0xa)
    String getURL();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Connected", dispId = 0xb)
    Boolean getConnected();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LastRefreshed", dispId = 0xc)
    Object getLastRefreshed();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "SourceURL", dispId = 0xd)
    String getSourceURL();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "SourceURL", dispId = 0xd)
    void setSourceURL(String param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "RemoveDocument", dispId = 0xe)
    void RemoveDocument();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "Disconnect", dispId = 0xf)
    void Disconnect();
            
    
}