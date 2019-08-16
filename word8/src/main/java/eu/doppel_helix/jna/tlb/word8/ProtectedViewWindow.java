
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F743EDD0-9B97-4B09-89CC-77BE19B51481})</p>
 */
@ComInterface(iid="{F743EDD0-9B97-4B09-89CC-77BE19B51481}")
public interface ProtectedViewWindow extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x0)
    String getCaption();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x0)
    void setCaption(String param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Document", dispId = 0x1)
    Document getDocument();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2)
    Integer getLeft();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x2)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Top", dispId = 0x3)
    Integer getTop();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x3)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Width", dispId = 0x4)
    Integer getWidth();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x4)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    Integer getHeight();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x5)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x6)
    WdWindowState getWindowState();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code WdWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x6)
    void setWindowState(WdWindowState param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Active", dispId = 0x7)
    Boolean getActive();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Index", dispId = 0x8)
    Integer getIndex();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x9)
    Boolean getVisible();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x9)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0xa)
    String getSourceName();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "SourcePath", dispId = 0xb)
    String getSourcePath();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x64)
    void Activate();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(30)</p>
     * @param PasswordTemplate [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param WritePasswordTemplate [in, optional] {@code Object}
     */
    @ComMethod(name = "Edit", dispId = 0x65)
    Document Edit(Object PasswordTemplate,
            Object WritePasswordDocument,
            Object WritePasswordTemplate);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "Close", dispId = 0x66)
    void Close();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "ToggleRibbon", dispId = 0x67)
    void ToggleRibbon();
            
    
}