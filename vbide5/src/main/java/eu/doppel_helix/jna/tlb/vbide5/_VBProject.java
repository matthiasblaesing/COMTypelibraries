
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EEE00915-E393-11D1-BB03-00C04FB6C4A6})</p>
 */
@ComInterface(iid="{EEE00915-E393-11D1-BB03-00C04FB6C4A6}")
public interface _VBProject extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    Application getApplication();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    Application getParent();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x74)
    String getHelpFile();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HelpFile", dispId = 0x74)
    void setHelpFile(String param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "HelpContextID", dispId = 0x75)
    Integer getHelpContextID();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HelpContextID", dispId = 0x75)
    void setHelpContextID(Integer param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Description", dispId = 0x76)
    String getDescription();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0x76)
    void setDescription(String param0);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x77)
    vbext_VBAMode getMode();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "References", dispId = 0x78)
    References getReferences();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Name", dispId = 0x79)
    String getName();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x79)
    void setName(String param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x7a)
    VBE getVBE();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Collection", dispId = 0x7b)
    VBProjects getCollection();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Protection", dispId = 0x83)
    vbext_ProjectProtection getProtection();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x85)
    Boolean getSaved();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "VBComponents", dispId = 0x87)
    VBComponents getVBComponents();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(24)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "SaveAs", dispId = 0x8a)
    void SaveAs(String FileName);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "MakeCompiledFile", dispId = 0x8b)
    void MakeCompiledFile();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Type", dispId = 0x8c)
    vbext_ProjectType getType();
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "FileName", dispId = 0x8d)
    String getFileName();
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "BuildFileName", dispId = 0x8e)
    String getBuildFileName();
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BuildFileName", dispId = 0x8e)
    void setBuildFileName(String param0);
            
    
}