
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E166-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E166-0000-0000-C000-000000000046}")
public interface VBE {
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Version", dispId = 0x64)
    String getVersion();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "VBProjects", dispId = 0x6b)
    VBProjects getVBProjects();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "CodePanes", dispId = 0x6d)
    CodePanes getCodePanes();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x6e)
    Windows getWindows();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Events", dispId = 0x6f)
    Events getEvents();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "ActiveVBProject", dispId = 0xc9)
    VBProject getActiveVBProject();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "ActiveVBProject", dispId = 0xc9)
    void setActiveVBProject(VBProject param0);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "SelectedVBComponent", dispId = 0xca)
    VBComponent getSelectedVBComponent();
            
    /**
     * <p>id(0xcc)</p>
     */
    @ComProperty(name = "MainWindow", dispId = 0xcc)
    Window getMainWindow();
            
    /**
     * <p>id(0xcd)</p>
     */
    @ComProperty(name = "ActiveWindow", dispId = 0xcd)
    Window getActiveWindow();
            
    /**
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "ActiveCodePane", dispId = 0xce)
    CodePane getActiveCodePane();
            
    /**
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "ActiveCodePane", dispId = 0xce)
    void setActiveCodePane(CodePane param0);
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "Addins", dispId = 0xd1)
    Addins getAddins();
            
    
}