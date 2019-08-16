
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002085E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002085E-0000-0000-C000-000000000046}")
public interface ToolbarButton extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x229)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x229)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x22a)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "BuiltInFace", dispId = 0x22a)
    Boolean getBuiltInFace();
            
    /**
     * <p>id(0x22a)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BuiltInFace", dispId = 0x22a)
    void setBuiltInFace(Boolean param0);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(13)</p>
     * @param Toolbar [in] {@code Toolbar}
     * @param Before [in] {@code Integer}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy(Toolbar Toolbar,
            Integer Before);
            
    /**
     * <p>id(0x3c6)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "CopyFace", dispId = 0x3c6)
    void CopyFace();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x232)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Edit", dispId = 0x232)
    void Edit();
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x163)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "HelpContextID", dispId = 0x163)
    Integer getHelpContextID();
            
    /**
     * <p>id(0x163)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HelpContextID", dispId = 0x163)
    void setHelpContextID(Integer param0);
            
    /**
     * <p>id(0x168)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x168)
    String getHelpFile();
            
    /**
     * <p>id(0x168)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HelpFile", dispId = 0x168)
    void setHelpFile(String param0);
            
    /**
     * <p>id(0x23a)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ID", dispId = 0x23a)
    Integer getID();
            
    /**
     * <p>id(0x231)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "IsGap", dispId = 0x231)
    Boolean getIsGap();
            
    /**
     * <p>id(0x27d)</p>
     * <p>vtableId(25)</p>
     * @param Toolbar [in] {@code Toolbar}
     * @param Before [in] {@code Integer}
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    void Move(Toolbar Toolbar,
            Integer Before);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    String getOnAction();
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x3c7)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "PasteFace", dispId = 0x3c7)
    void PasteFace();
            
    /**
     * <p>id(0x230)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Pushed", dispId = 0x230)
    Boolean getPushed();
            
    /**
     * <p>id(0x230)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Pushed", dispId = 0x230)
    void setPushed(Boolean param0);
            
    /**
     * <p>id(0x22b)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x22b)
    void Reset();
            
    /**
     * <p>id(0x182)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "StatusBar", dispId = 0x182)
    String getStatusBar();
            
    /**
     * <p>id(0x182)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusBar", dispId = 0x182)
    void setStatusBar(String param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Integer getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Integer param0);
            
    
}