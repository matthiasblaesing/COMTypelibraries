
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4265ED97-A922-4CA4-8CD8-99684CCA9CDB})</p>
 */
@ComInterface(iid="{4265ED97-A922-4CA4-8CD8-99684CCA9CDB}")
public interface RepeatingSectionItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Range", dispId = 0x1)
    Range getRange();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "InsertItemBefore", dispId = 0x2)
    RepeatingSectionItem InsertItemBefore();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "InsertItemAfter", dispId = 0x3)
    RepeatingSectionItem InsertItemAfter();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x4)
    void Delete();
            
    
}