
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EEE00921-E393-11D1-BB03-00C04FB6C4A6})</p>
 */
@ComInterface(iid="{EEE00921-E393-11D1-BB03-00C04FB6C4A6}")
public interface _VBComponent extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Saved", dispId = 0xa)
    Boolean getSaved();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "Name", dispId = 0x30)
    String getName();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "Name", dispId = 0x30)
    void setName(String param0);
            
    /**
     * <p>id(0x31)</p>
     */
    @ComProperty(name = "Designer", dispId = 0x31)
    com.sun.jna.platform.win32.COM.util.IDispatch getDesigner();
            
    /**
     * <p>id(0x32)</p>
     */
    @ComProperty(name = "CodeModule", dispId = 0x32)
    CodeModule getCodeModule();
            
    /**
     * <p>id(0x33)</p>
     */
    @ComProperty(name = "Type", dispId = 0x33)
    vbext_ComponentType getType();
            
    /**
     * <p>id(0x34)</p>
     */
    @ComMethod(name = "Export", dispId = 0x34)
    void Export(String FileName);
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x35)
    VBE getVBE();
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "Collection", dispId = 0x36)
    VBComponents getCollection();
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "HasOpenDesigner", dispId = 0x37)
    Boolean getHasOpenDesigner();
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x38)
    Properties getProperties();
            
    /**
     * <p>id(0x39)</p>
     */
    @ComMethod(name = "DesignerWindow", dispId = 0x39)
    Window DesignerWindow();
            
    /**
     * <p>id(0x3c)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x3c)
    void Activate();
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "DesignerID", dispId = 0x40)
    String getDesignerID();
            
    
}