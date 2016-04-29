
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({65DF9F31-B1E3-4651-87E8-51D55F302161})</p>
 */
@ComInterface(iid="{65DF9F31-B1E3-4651-87E8-51D55F302161}")
public interface CoAuthoring {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Authors", dispId = 0x1)
    CoAuthors getAuthors();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Me", dispId = 0x2)
    CoAuthor getMe();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "PendingUpdates", dispId = 0x3)
    Boolean getPendingUpdates();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Locks", dispId = 0x5)
    CoAuthLocks getLocks();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Updates", dispId = 0x6)
    CoAuthUpdates getUpdates();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0x7)
    Conflicts getConflicts();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "CanShare", dispId = 0x8)
    Boolean getCanShare();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "CanMerge", dispId = 0x9)
    Boolean getCanMerge();
            
    
}