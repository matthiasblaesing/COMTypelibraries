
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EEE00915-E393-11D1-BB03-00C04FB6C4A6})</p>
 */
@ComInterface(iid="{EEE00915-E393-11D1-BB03-00C04FB6C4A6}")
public interface _VBProject {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    Application getApplication();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    Application getParent();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x74)
    String getHelpFile();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x74)
    void setHelpFile(String param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "HelpContextID", dispId = 0x75)
    Integer getHelpContextID();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "HelpContextID", dispId = 0x75)
    void setHelpContextID(Integer param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Description", dispId = 0x76)
    String getDescription();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Description", dispId = 0x76)
    void setDescription(String param0);
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x77)
    vbext_VBAMode getMode();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "References", dispId = 0x78)
    References getReferences();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "Name", dispId = 0x79)
    String getName();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "Name", dispId = 0x79)
    void setName(String param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x7a)
    VBE getVBE();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Collection", dispId = 0x7b)
    VBProjects getCollection();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "Protection", dispId = 0x83)
    vbext_ProjectProtection getProtection();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x85)
    Boolean getSaved();
            
    /**
     * <p>id(0x87)</p>
     */
    @ComProperty(name = "VBComponents", dispId = 0x87)
    VBComponents getVBComponents();
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComMethod(name = "SaveAs", dispId = 0x8a)
    void SaveAs(String FileName);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComMethod(name = "MakeCompiledFile", dispId = 0x8b)
    void MakeCompiledFile();
            
    /**
     * <p>id(0x8c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x8c)
    vbext_ProjectType getType();
            
    /**
     * <p>id(0x8d)</p>
     */
    @ComProperty(name = "FileName", dispId = 0x8d)
    String getFileName();
            
    /**
     * <p>id(0x8e)</p>
     */
    @ComProperty(name = "BuildFileName", dispId = 0x8e)
    String getBuildFileName();
            
    /**
     * <p>id(0x8e)</p>
     */
    @ComProperty(name = "BuildFileName", dispId = 0x8e)
    void setBuildFileName(String param0);
            
    
}