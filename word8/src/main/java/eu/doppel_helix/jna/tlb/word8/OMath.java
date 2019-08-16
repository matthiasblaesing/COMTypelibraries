
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E4442A83-F623-459C-8E95-8BFB44DCF23A})</p>
 */
@ComInterface(iid="{E4442A83-F623-459C-8E95-8BFB44DCF23A}")
public interface OMath extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Range", dispId = 0x67)
    Range getRange();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Functions", dispId = 0x68)
    OMathFunctions getFunctions();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x69)
    WdOMathType getType();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdOMathType}
     */
    @ComProperty(name = "Type", dispId = 0x69)
    void setType(WdOMathType param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ParentOMath", dispId = 0x6a)
    OMath getParentOMath();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ParentFunction", dispId = 0x6b)
    OMathFunction getParentFunction();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ParentRow", dispId = 0x6c)
    OMathMatRow getParentRow();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ParentCol", dispId = 0x6d)
    OMathMatCol getParentCol();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ParentArg", dispId = 0x6e)
    OMath getParentArg();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ArgIndex", dispId = 0x6f)
    Integer getArgIndex();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x70)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ArgSize", dispId = 0x71)
    Integer getArgSize();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ArgSize", dispId = 0x71)
    void setArgSize(Integer param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Breaks", dispId = 0x72)
    OMathBreaks getBreaks();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Justification", dispId = 0x73)
    WdOMathJc getJustification();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code WdOMathJc}
     */
    @ComProperty(name = "Justification", dispId = 0x73)
    void setJustification(WdOMathJc param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "AlignPoint", dispId = 0x74)
    Integer getAlignPoint();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AlignPoint", dispId = 0x74)
    void setAlignPoint(Integer param0);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Linearize", dispId = 0xc8)
    void Linearize();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "BuildUp", dispId = 0xc9)
    void BuildUp();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Remove", dispId = 0xca)
    void Remove();
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "ConvertToMathText", dispId = 0xcb)
    void ConvertToMathText();
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "ConvertToNormalText", dispId = 0xcc)
    void ConvertToNormalText();
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "ConvertToLiteralText", dispId = 0xcd)
    void ConvertToLiteralText();
            
    
}