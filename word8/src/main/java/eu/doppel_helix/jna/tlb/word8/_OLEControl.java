
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209A4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209A4-0000-0000-C000-000000000046}")
public interface _OLEControl extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x80010103)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Left", dispId = 0x80010103)
    Float getLeft();
            
    /**
     * <p>id(0x80010103)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Left", dispId = 0x80010103)
    void setLeft(Float param0);
            
    /**
     * <p>id(0x80010104)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Top", dispId = 0x80010104)
    Float getTop();
            
    /**
     * <p>id(0x80010104)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Top", dispId = 0x80010104)
    void setTop(Float param0);
            
    /**
     * <p>id(0x80010105)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Height", dispId = 0x80010105)
    Float getHeight();
            
    /**
     * <p>id(0x80010105)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x80010105)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x80010106)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Width", dispId = 0x80010106)
    Float getWidth();
            
    /**
     * <p>id(0x80010106)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x80010106)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x80010107)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Automation", dispId = 0x80010107)
    com.sun.jna.platform.win32.COM.util.IDispatch getAutomation();
            
    /**
     * <p>id(0x80010220)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Select", dispId = 0x80010220)
    void Select();
            
    /**
     * <p>id(0x80010228)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x80010228)
    void Copy();
            
    /**
     * <p>id(0x80010229)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x80010229)
    void Cut();
            
    /**
     * <p>id(0x80010250)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x80010250)
    void Delete();
            
    /**
     * <p>id(0x80010251)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x80010251)
    void Activate();
            
    /**
     * <p>id(0x80010bc3)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "AltHTML", dispId = 0x80010bc3)
    String getAltHTML();
            
    /**
     * <p>id(0x80010bc3)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AltHTML", dispId = 0x80010bc3)
    void setAltHTML(String param0);
            
    
}