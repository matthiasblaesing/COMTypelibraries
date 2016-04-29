
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F743EDD0-9B97-4B09-89CC-77BE19B51481})</p>
 */
@ComInterface(iid="{F743EDD0-9B97-4B09-89CC-77BE19B51481}")
public interface ProtectedViewWindow {
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
    @ComProperty(name = "Caption", dispId = 0x0)
    String getCaption();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x0)
    void setCaption(String param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Document", dispId = 0x1)
    Document getDocument();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2)
    Integer getLeft();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Top", dispId = 0x3)
    Integer getTop();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Top", dispId = 0x3)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Width", dispId = 0x4)
    Integer getWidth();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Width", dispId = 0x4)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    Integer getHeight();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x6)
    WdWindowState getWindowState();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x6)
    void setWindowState(WdWindowState param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Active", dispId = 0x7)
    Boolean getActive();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Index", dispId = 0x8)
    Integer getIndex();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x9)
    Boolean getVisible();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x9)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0xa)
    String getSourceName();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "SourcePath", dispId = 0xb)
    String getSourcePath();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x64)
    void Activate();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Edit", dispId = 0x65)
    Document Edit(Object PasswordTemplate,
            Object WritePasswordDocument,
            Object WritePasswordTemplate);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Close", dispId = 0x66)
    void Close();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "ToggleRibbon", dispId = 0x67)
    void ToggleRibbon();
            
    
}