
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002096C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002096C-0000-0000-C000-000000000046}")
public interface Documents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Document Item(Object Index);
            
    /**
     * <p>id(0x451)</p>
     */
    @ComMethod(name = "Close", dispId = 0x451)
    void Close(Object SaveChanges,
            Object OriginalFormat,
            Object RouteDocument);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "AddOld", dispId = 0xb)
    Document AddOld(Object Template,
            Object NewTemplate);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "OpenOld", dispId = 0xc)
    Document OpenOld(Object FileName,
            Object ConfirmConversions,
            Object ReadOnly,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object Format);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "Save", dispId = 0xd)
    void Save(Object NoPrompt,
            Object OriginalFormat);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "Add", dispId = 0xe)
    Document Add(Object Template,
            Object NewTemplate,
            Object DocumentType,
            Object Visible);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "Open2000", dispId = 0xf)
    Document Open2000(Object FileName,
            Object ConfirmConversions,
            Object ReadOnly,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object Format,
            Object Encoding,
            Object Visible);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "CheckOut", dispId = 0x10)
    void CheckOut(String FileName);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "CanCheckOut", dispId = 0x11)
    Boolean CanCheckOut(String FileName);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "Open2002", dispId = 0x12)
    Document Open2002(Object FileName,
            Object ConfirmConversions,
            Object ReadOnly,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object Format,
            Object Encoding,
            Object Visible,
            Object OpenAndRepair,
            Object DocumentDirection,
            Object NoEncodingDialog);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "Open", dispId = 0x13)
    Document Open(Object FileName,
            Object ConfirmConversions,
            Object ReadOnly,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object Format,
            Object Encoding,
            Object Visible,
            Object OpenAndRepair,
            Object DocumentDirection,
            Object NoEncodingDialog,
            Object XMLTransform);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComMethod(name = "OpenNoRepairDialog", dispId = 0x14)
    Document OpenNoRepairDialog(Object FileName,
            Object ConfirmConversions,
            Object ReadOnly,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object Format,
            Object Encoding,
            Object Visible,
            Object OpenAndRepair,
            Object DocumentDirection,
            Object NoEncodingDialog,
            Object XMLTransform);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComMethod(name = "AddBlogDocument", dispId = 0x15)
    Document AddBlogDocument(String ProviderID,
            String PostURL,
            String BlogName,
            String PostID);
            
    
}