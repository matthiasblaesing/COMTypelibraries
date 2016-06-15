
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063025-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063025-0000-0000-C000-000000000046}")
public interface _NoteItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x9100)</p>
     */
    @ComProperty(name = "Body", dispId = 0x9100)
    String getBody();
            
    /**
     * <p>id(0x9100)</p>
     */
    @ComProperty(name = "Body", dispId = 0x9100)
    void setBody(String param0);
            
    /**
     * <p>id(0x9001)</p>
     */
    @ComProperty(name = "Categories", dispId = 0x9001)
    String getCategories();
            
    /**
     * <p>id(0x9001)</p>
     */
    @ComProperty(name = "Categories", dispId = 0x9001)
    void setCategories(String param0);
            
    /**
     * <p>id(0x8b00)</p>
     */
    @ComProperty(name = "Color", dispId = 0x8b00)
    OlNoteColor getColor();
            
    /**
     * <p>id(0x8b00)</p>
     */
    @ComProperty(name = "Color", dispId = 0x8b00)
    void setColor(OlNoteColor param0);
            
    /**
     * <p>id(0x3007)</p>
     */
    @ComProperty(name = "CreationTime", dispId = 0x3007)
    java.util.Date getCreationTime();
            
    /**
     * <p>id(0xf01e)</p>
     */
    @ComProperty(name = "EntryID", dispId = 0xf01e)
    String getEntryID();
            
    /**
     * <p>id(0xf03e)</p>
     */
    @ComProperty(name = "GetInspector", dispId = 0xf03e)
    _Inspector getGetInspector();
            
    /**
     * <p>id(0x8b03)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8b03)
    Integer getHeight();
            
    /**
     * <p>id(0x8b03)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8b03)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x3008)</p>
     */
    @ComProperty(name = "LastModificationTime", dispId = 0x3008)
    java.util.Date getLastModificationTime();
            
    /**
     * <p>id(0x8b04)</p>
     */
    @ComProperty(name = "Left", dispId = 0x8b04)
    Integer getLeft();
            
    /**
     * <p>id(0x8b04)</p>
     */
    @ComProperty(name = "Left", dispId = 0x8b04)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    String getMessageClass();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    void setMessageClass(String param0);
            
    /**
     * <p>id(0xf0a3)</p>
     */
    @ComProperty(name = "Saved", dispId = 0xf0a3)
    Boolean getSaved();
            
    /**
     * <p>id(0xe08)</p>
     */
    @ComProperty(name = "Size", dispId = 0xe08)
    Integer getSize();
            
    /**
     * <p>id(0xf7a0)</p>
     */
    @ComProperty(name = "Subject", dispId = 0xf7a0)
    String getSubject();
            
    /**
     * <p>id(0x8b05)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8b05)
    Integer getTop();
            
    /**
     * <p>id(0x8b05)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8b05)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x8b02)</p>
     */
    @ComProperty(name = "Width", dispId = 0x8b02)
    Integer getWidth();
            
    /**
     * <p>id(0x8b02)</p>
     */
    @ComProperty(name = "Width", dispId = 0x8b02)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0xf023)</p>
     */
    @ComMethod(name = "Close", dispId = 0xf023)
    void Close(OlInspectorClose SaveMode);
            
    /**
     * <p>id(0xf032)</p>
     */
    @ComMethod(name = "Copy", dispId = 0xf032)
    com.sun.jna.platform.win32.COM.util.IDispatch Copy();
            
    /**
     * <p>id(0xf04a)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xf04a)
    void Delete();
            
    /**
     * <p>id(0xf0a6)</p>
     */
    @ComMethod(name = "Display", dispId = 0xf0a6)
    void Display(Object Modal);
            
    /**
     * <p>id(0xf034)</p>
     */
    @ComMethod(name = "Move", dispId = 0xf034)
    com.sun.jna.platform.win32.COM.util.IDispatch Move(MAPIFolder DestFldr);
            
    /**
     * <p>id(0xf033)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0xf033)
    void PrintOut();
            
    /**
     * <p>id(0xf048)</p>
     */
    @ComMethod(name = "Save", dispId = 0xf048)
    void Save();
            
    /**
     * <p>id(0xf051)</p>
     */
    @ComMethod(name = "SaveAs", dispId = 0xf051)
    void SaveAs(String Path,
            Object Type);
            
    /**
     * <p>id(0xf405)</p>
     */
    @ComProperty(name = "Links", dispId = 0xf405)
    Links getLinks();
            
    /**
     * <p>id(0xfa4d)</p>
     */
    @ComProperty(name = "DownloadState", dispId = 0xfa4d)
    OlDownloadState getDownloadState();
            
    /**
     * <p>id(0xfa09)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0x8571)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    OlRemoteStatus getMarkForDownload();
            
    /**
     * <p>id(0x8571)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    void setMarkForDownload(OlRemoteStatus param0);
            
    /**
     * <p>id(0xfaa4)</p>
     */
    @ComProperty(name = "IsConflict", dispId = 0xfaa4)
    Boolean getIsConflict();
            
    /**
     * <p>id(0xfaba)</p>
     */
    @ComProperty(name = "AutoResolvedWinner", dispId = 0xfaba)
    Boolean getAutoResolvedWinner();
            
    /**
     * <p>id(0xfabb)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0xfabb)
    Conflicts getConflicts();
            
    /**
     * <p>id(0xfafd)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    
}