
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E16B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E16B-0000-0000-C000-000000000046}")
public interface Window extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x1)
    VBE getVBE();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Collection", dispId = 0x2)
    Windows getCollection();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Close", dispId = 0x63)
    void Close();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x64)
    String getCaption();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6a)
    Boolean getVisible();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x6a)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Left", dispId = 0x65)
    Integer getLeft();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x65)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Top", dispId = 0x67)
    Integer getTop();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x67)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Width", dispId = 0x69)
    Integer getWidth();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x69)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6b)
    Integer getHeight();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x6b)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x6d)
    vbext_WindowState getWindowState();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code vbext_WindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x6d)
    void setWindowState(vbext_WindowState param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x6f)
    void SetFocus();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Type", dispId = 0x70)
    vbext_WindowType getType();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(25)</p>
     * @param eKind [in] {@code vbext_WindowType}
     */
    @ComMethod(name = "SetKind", dispId = 0x71)
    void SetKind(vbext_WindowType eKind);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "LinkedWindows", dispId = 0x74)
    LinkedWindows getLinkedWindows();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "LinkedWindowFrame", dispId = 0x75)
    Window getLinkedWindowFrame();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Detach", dispId = 0x76)
    void Detach();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(29)</p>
     * @param lWindowHandle [in] {@code Integer}
     */
    @ComMethod(name = "Attach", dispId = 0x77)
    void Attach(Integer lWindowHandle);
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "HWnd", dispId = 0x78)
    Integer getHWnd();
            
    
}