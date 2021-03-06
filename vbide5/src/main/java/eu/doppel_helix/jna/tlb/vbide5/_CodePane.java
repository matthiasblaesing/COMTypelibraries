
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E176-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E176-0000-0000-C000-000000000046}")
public interface _CodePane extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Collection", dispId = 0x60020000)
    CodePanes getCollection();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x60020001)
    VBE getVBE();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Window", dispId = 0x60020002)
    Window getWindow();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param StartLine [out] {@code Integer}
     * @param StartColumn [out] {@code Integer}
     * @param EndLine [out] {@code Integer}
     * @param EndColumn [out] {@code Integer}
     */
    @ComMethod(name = "GetSelection", dispId = 0x60020003)
    void GetSelection(VARIANT StartLine,
            VARIANT StartColumn,
            VARIANT EndLine,
            VARIANT EndColumn);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param StartLine [in] {@code Integer}
     * @param StartColumn [in] {@code Integer}
     * @param EndLine [in] {@code Integer}
     * @param EndColumn [in] {@code Integer}
     */
    @ComMethod(name = "SetSelection", dispId = 0x60020004)
    void SetSelection(Integer StartLine,
            Integer StartColumn,
            Integer EndLine,
            Integer EndColumn);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "TopLine", dispId = 0x60020005)
    Integer getTopLine();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TopLine", dispId = 0x60020005)
    void setTopLine(Integer param0);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "CountOfVisibleLines", dispId = 0x60020007)
    Integer getCountOfVisibleLines();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "CodeModule", dispId = 0x60020008)
    CodeModule getCodeModule();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Show", dispId = 0x60020009)
    void Show();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "CodePaneView", dispId = 0x6002000a)
    vbext_CodePaneview getCodePaneView();
            
    
}