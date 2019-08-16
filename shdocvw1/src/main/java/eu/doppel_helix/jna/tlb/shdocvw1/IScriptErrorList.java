
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Script Error List Interface
 *
 * <p>uuid({F3470F24-15FD-11D2-BB2E-00805FF7EFCA})</p>
 */
@ComInterface(iid="{F3470F24-15FD-11D2-BB2E-00805FF7EFCA}")
public interface IScriptErrorList extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "advanceError", dispId = 0xa)
    void advanceError();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "retreatError", dispId = 0xb)
    void retreatError();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "canAdvanceError", dispId = 0xc)
    Integer canAdvanceError();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "canRetreatError", dispId = 0xd)
    Integer canRetreatError();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "getErrorLine", dispId = 0xe)
    Integer getErrorLine();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "getErrorChar", dispId = 0xf)
    Integer getErrorChar();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "getErrorCode", dispId = 0x10)
    Integer getErrorCode();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "getErrorMsg", dispId = 0x11)
    String getErrorMsg();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "getErrorUrl", dispId = 0x12)
    String getErrorUrl();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "getAlwaysShowLockState", dispId = 0x17)
    Integer getAlwaysShowLockState();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "getDetailsPaneOpen", dispId = 0x13)
    Integer getDetailsPaneOpen();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(18)</p>
     * @param fDetailsPaneOpen [] {@code Integer}
     */
    @ComMethod(name = "setDetailsPaneOpen", dispId = 0x14)
    void setDetailsPaneOpen(Integer fDetailsPaneOpen);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "getPerErrorDisplay", dispId = 0x15)
    Integer getPerErrorDisplay();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(20)</p>
     * @param fPerErrorDisplay [] {@code Integer}
     */
    @ComMethod(name = "setPerErrorDisplay", dispId = 0x16)
    void setPerErrorDisplay(Integer fPerErrorDisplay);
            
    
}