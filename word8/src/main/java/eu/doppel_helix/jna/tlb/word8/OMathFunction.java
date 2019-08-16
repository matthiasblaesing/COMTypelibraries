
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F1F37152-1DB1-4901-AD9A-C740F99464B4})</p>
 */
@ComInterface(iid="{F1F37152-1DB1-4901-AD9A-C740F99464B4}")
public interface OMathFunction extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Type", dispId = 0x0)
    WdOMathFunctionType getType();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Range", dispId = 0x67)
    Range getRange();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Args", dispId = 0x68)
    OMathArgs getArgs();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Acc", dispId = 0x69)
    OMathAcc getAcc();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Bar", dispId = 0x6a)
    OMathBar getBar();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Box", dispId = 0x6b)
    OMathBox getBox();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "BorderBox", dispId = 0x6c)
    OMathBorderBox getBorderBox();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Delim", dispId = 0x6d)
    OMathDelim getDelim();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "EqArray", dispId = 0x6e)
    OMathEqArray getEqArray();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Frac", dispId = 0x6f)
    OMathFrac getFrac();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Func", dispId = 0x70)
    OMathFunc getFunc();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "GroupChar", dispId = 0x71)
    OMathGroupChar getGroupChar();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "LimLow", dispId = 0x72)
    OMathLimLow getLimLow();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "LimUpp", dispId = 0x73)
    OMathLimUpp getLimUpp();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Mat", dispId = 0x74)
    OMathMat getMat();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Nary", dispId = 0x75)
    OMathNary getNary();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Phantom", dispId = 0x76)
    OMathPhantom getPhantom();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "ScrPre", dispId = 0x77)
    OMathScrPre getScrPre();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Rad", dispId = 0x78)
    OMathRad getRad();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "ScrSub", dispId = 0x79)
    OMathScrSub getScrSub();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "ScrSubSup", dispId = 0x7a)
    OMathScrSubSup getScrSubSup();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ScrSup", dispId = 0x7b)
    OMathScrSup getScrSup();
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "OMath", dispId = 0x7d)
    OMath getOMath();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Remove", dispId = 0xc9)
    OMathFunction Remove();
            
    
}