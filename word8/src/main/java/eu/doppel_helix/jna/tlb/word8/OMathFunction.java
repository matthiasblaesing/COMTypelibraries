
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
     */
    @ComProperty(name = "Type", dispId = 0x0)
    WdOMathFunctionType getType();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Range", dispId = 0x67)
    Range getRange();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Args", dispId = 0x68)
    OMathArgs getArgs();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Acc", dispId = 0x69)
    OMathAcc getAcc();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Bar", dispId = 0x6a)
    OMathBar getBar();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Box", dispId = 0x6b)
    OMathBox getBox();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "BorderBox", dispId = 0x6c)
    OMathBorderBox getBorderBox();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Delim", dispId = 0x6d)
    OMathDelim getDelim();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "EqArray", dispId = 0x6e)
    OMathEqArray getEqArray();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Frac", dispId = 0x6f)
    OMathFrac getFrac();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Func", dispId = 0x70)
    OMathFunc getFunc();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "GroupChar", dispId = 0x71)
    OMathGroupChar getGroupChar();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "LimLow", dispId = 0x72)
    OMathLimLow getLimLow();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "LimUpp", dispId = 0x73)
    OMathLimUpp getLimUpp();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Mat", dispId = 0x74)
    OMathMat getMat();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "Nary", dispId = 0x75)
    OMathNary getNary();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Phantom", dispId = 0x76)
    OMathPhantom getPhantom();
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "ScrPre", dispId = 0x77)
    OMathScrPre getScrPre();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "Rad", dispId = 0x78)
    OMathRad getRad();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "ScrSub", dispId = 0x79)
    OMathScrSub getScrSub();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "ScrSubSup", dispId = 0x7a)
    OMathScrSubSup getScrSubSup();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "ScrSup", dispId = 0x7b)
    OMathScrSup getScrSup();
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "OMath", dispId = 0x7d)
    OMath getOMath();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComMethod(name = "Remove", dispId = 0xc9)
    OMathFunction Remove();
            
    
}