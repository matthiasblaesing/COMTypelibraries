
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0322-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0322-0000-0000-C000-000000000046}")
public interface Assistant extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComMethod(name = "Move", dispId = 0x60030001)
    void Move(Integer xLeft,
            Integer yTop);
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "Top", dispId = 0x60030002)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "Top", dispId = 0x60030002)
    Integer getTop();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60030004)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60030004)
    Integer getLeft();
            
    /**
     * <p>id(0x60030006)</p>
     */
    @ComMethod(name = "Help", dispId = 0x60030006)
    void Help();
            
    /**
     * <p>id(0x60030007)</p>
     */
    @ComMethod(name = "StartWizard", dispId = 0x60030007)
    Integer StartWizard(Boolean On,
            String Callback,
            Integer PrivateX,
            Object Animation,
            Object CustomTeaser,
            Object Top,
            Object Left,
            Object Bottom,
            Object Right);
            
    /**
     * <p>id(0x60030008)</p>
     */
    @ComMethod(name = "EndWizard", dispId = 0x60030008)
    void EndWizard(Integer WizardID,
            Boolean varfSuccess,
            Object Animation);
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComMethod(name = "ActivateWizard", dispId = 0x60030009)
    void ActivateWizard(Integer WizardID,
            MsoWizardActType act,
            Object Animation);
            
    /**
     * <p>id(0x6003000a)</p>
     */
    @ComMethod(name = "ResetTips", dispId = 0x6003000a)
    void ResetTips();
            
    /**
     * <p>id(0x6003000b)</p>
     */
    @ComProperty(name = "NewBalloon", dispId = 0x6003000b)
    Balloon getNewBalloon();
            
    /**
     * <p>id(0x6003000c)</p>
     */
    @ComProperty(name = "BalloonError", dispId = 0x6003000c)
    MsoBalloonErrorType getBalloonError();
            
    /**
     * <p>id(0x6003000d)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6003000d)
    Boolean getVisible();
            
    /**
     * <p>id(0x6003000d)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6003000d)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "Animation", dispId = 0x6003000f)
    MsoAnimationType getAnimation();
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "Animation", dispId = 0x6003000f)
    void setAnimation(MsoAnimationType param0);
            
    /**
     * <p>id(0x60030011)</p>
     */
    @ComProperty(name = "Reduced", dispId = 0x60030011)
    Boolean getReduced();
            
    /**
     * <p>id(0x60030011)</p>
     */
    @ComProperty(name = "Reduced", dispId = 0x60030011)
    void setReduced(Boolean param0);
            
    /**
     * <p>id(0x60030013)</p>
     */
    @ComProperty(name = "AssistWithHelp", dispId = 0x60030013)
    void setAssistWithHelp(Boolean param0);
            
    /**
     * <p>id(0x60030013)</p>
     */
    @ComProperty(name = "AssistWithHelp", dispId = 0x60030013)
    Boolean getAssistWithHelp();
            
    /**
     * <p>id(0x60030015)</p>
     */
    @ComProperty(name = "AssistWithWizards", dispId = 0x60030015)
    void setAssistWithWizards(Boolean param0);
            
    /**
     * <p>id(0x60030015)</p>
     */
    @ComProperty(name = "AssistWithWizards", dispId = 0x60030015)
    Boolean getAssistWithWizards();
            
    /**
     * <p>id(0x60030017)</p>
     */
    @ComProperty(name = "AssistWithAlerts", dispId = 0x60030017)
    void setAssistWithAlerts(Boolean param0);
            
    /**
     * <p>id(0x60030017)</p>
     */
    @ComProperty(name = "AssistWithAlerts", dispId = 0x60030017)
    Boolean getAssistWithAlerts();
            
    /**
     * <p>id(0x60030019)</p>
     */
    @ComProperty(name = "MoveWhenInTheWay", dispId = 0x60030019)
    void setMoveWhenInTheWay(Boolean param0);
            
    /**
     * <p>id(0x60030019)</p>
     */
    @ComProperty(name = "MoveWhenInTheWay", dispId = 0x60030019)
    Boolean getMoveWhenInTheWay();
            
    /**
     * <p>id(0x6003001b)</p>
     */
    @ComProperty(name = "Sounds", dispId = 0x6003001b)
    void setSounds(Boolean param0);
            
    /**
     * <p>id(0x6003001b)</p>
     */
    @ComProperty(name = "Sounds", dispId = 0x6003001b)
    Boolean getSounds();
            
    /**
     * <p>id(0x6003001d)</p>
     */
    @ComProperty(name = "FeatureTips", dispId = 0x6003001d)
    void setFeatureTips(Boolean param0);
            
    /**
     * <p>id(0x6003001d)</p>
     */
    @ComProperty(name = "FeatureTips", dispId = 0x6003001d)
    Boolean getFeatureTips();
            
    /**
     * <p>id(0x6003001f)</p>
     */
    @ComProperty(name = "MouseTips", dispId = 0x6003001f)
    void setMouseTips(Boolean param0);
            
    /**
     * <p>id(0x6003001f)</p>
     */
    @ComProperty(name = "MouseTips", dispId = 0x6003001f)
    Boolean getMouseTips();
            
    /**
     * <p>id(0x60030021)</p>
     */
    @ComProperty(name = "KeyboardShortcutTips", dispId = 0x60030021)
    void setKeyboardShortcutTips(Boolean param0);
            
    /**
     * <p>id(0x60030021)</p>
     */
    @ComProperty(name = "KeyboardShortcutTips", dispId = 0x60030021)
    Boolean getKeyboardShortcutTips();
            
    /**
     * <p>id(0x60030023)</p>
     */
    @ComProperty(name = "HighPriorityTips", dispId = 0x60030023)
    void setHighPriorityTips(Boolean param0);
            
    /**
     * <p>id(0x60030023)</p>
     */
    @ComProperty(name = "HighPriorityTips", dispId = 0x60030023)
    Boolean getHighPriorityTips();
            
    /**
     * <p>id(0x60030025)</p>
     */
    @ComProperty(name = "TipOfDay", dispId = 0x60030025)
    void setTipOfDay(Boolean param0);
            
    /**
     * <p>id(0x60030025)</p>
     */
    @ComProperty(name = "TipOfDay", dispId = 0x60030025)
    Boolean getTipOfDay();
            
    /**
     * <p>id(0x60030027)</p>
     */
    @ComProperty(name = "GuessHelp", dispId = 0x60030027)
    void setGuessHelp(Boolean param0);
            
    /**
     * <p>id(0x60030027)</p>
     */
    @ComProperty(name = "GuessHelp", dispId = 0x60030027)
    Boolean getGuessHelp();
            
    /**
     * <p>id(0x60030029)</p>
     */
    @ComProperty(name = "SearchWhenProgramming", dispId = 0x60030029)
    void setSearchWhenProgramming(Boolean param0);
            
    /**
     * <p>id(0x60030029)</p>
     */
    @ComProperty(name = "SearchWhenProgramming", dispId = 0x60030029)
    Boolean getSearchWhenProgramming();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    String getItem();
            
    /**
     * <p>id(0x6003002c)</p>
     */
    @ComProperty(name = "FileName", dispId = 0x6003002c)
    String getFileName();
            
    /**
     * <p>id(0x6003002c)</p>
     */
    @ComProperty(name = "FileName", dispId = 0x6003002c)
    void setFileName(String param0);
            
    /**
     * <p>id(0x6003002e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6003002e)
    String getName();
            
    /**
     * <p>id(0x6003002f)</p>
     */
    @ComProperty(name = "On", dispId = 0x6003002f)
    Boolean getOn();
            
    /**
     * <p>id(0x6003002f)</p>
     */
    @ComProperty(name = "On", dispId = 0x6003002f)
    void setOn(Boolean param0);
            
    /**
     * <p>id(0x60030031)</p>
     */
    @ComMethod(name = "DoAlert", dispId = 0x60030031)
    Integer DoAlert(String bstrAlertTitle,
            String bstrAlertText,
            MsoAlertButtonType alb,
            MsoAlertIconType alc,
            MsoAlertDefaultType ald,
            MsoAlertCancelType alq,
            Boolean varfSysAlert);
            
    
}