
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063076-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063076-0000-0000-C000-000000000046}")
public interface FoldersEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf001)</p>
     * @param Folder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "FolderAdd", dispId = 0xf001)
    void FolderAdd(MAPIFolder Folder);
            
    /**
     * <p>id(0xf002)</p>
     * @param Folder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "FolderChange", dispId = 0xf002)
    void FolderChange(MAPIFolder Folder);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComMethod(name = "FolderRemove", dispId = 0xf003)
    void FolderRemove();
            
    
}