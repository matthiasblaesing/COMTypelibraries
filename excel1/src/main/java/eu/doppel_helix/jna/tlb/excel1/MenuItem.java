
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020868-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020868-0000-0000-C000-000000000046}")
public interface MenuItem {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x257)</p>
     */
    @ComProperty(name = "Checked", dispId = 0x257)
    Boolean getChecked();
            
    /**
     * <p>id(0x257)</p>
     */
    @ComProperty(name = "Checked", dispId = 0x257)
    void setChecked(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x163)</p>
     */
    @ComProperty(name = "HelpContextID", dispId = 0x163)
    Integer getHelpContextID();
            
    /**
     * <p>id(0x163)</p>
     */
    @ComProperty(name = "HelpContextID", dispId = 0x163)
    void setHelpContextID(Integer param0);
            
    /**
     * <p>id(0x168)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x168)
    String getHelpFile();
            
    /**
     * <p>id(0x168)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x168)
    void setHelpFile(String param0);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    String getOnAction();
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x182)</p>
     */
    @ComProperty(name = "StatusBar", dispId = 0x182)
    String getStatusBar();
            
    /**
     * <p>id(0x182)</p>
     */
    @ComProperty(name = "StatusBar", dispId = 0x182)
    void setStatusBar(String param0);
            
    
}