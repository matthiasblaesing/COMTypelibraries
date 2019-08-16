
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     * @param xLeft [in] {@code Integer}
     * @param yTop [in] {@code Integer}
     */
    @ComMethod(name = "Move", dispId = 0x60030001)
    void Move(Integer xLeft,
            Integer yTop);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x60030002)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Top", dispId = 0x60030002)
    Integer getTop();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x60030004)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60030004)
    Integer getLeft();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Help", dispId = 0x60030006)
    void Help();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(16)</p>
     * @param On [in] {@code Boolean}
     * @param Callback [in] {@code String}
     * @param PrivateX [in] {@code Integer}
     * @param Animation [in, optional] {@code Object}
     * @param CustomTeaser [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Bottom [in, optional] {@code Object}
     * @param Right [in, optional] {@code Object}
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
     * <p>vtableId(17)</p>
     * @param WizardID [in] {@code Integer}
     * @param varfSuccess [in] {@code Boolean}
     * @param Animation [in, optional] {@code Object}
     */
    @ComMethod(name = "EndWizard", dispId = 0x60030008)
    void EndWizard(Integer WizardID,
            Boolean varfSuccess,
            Object Animation);
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(18)</p>
     * @param WizardID [in] {@code Integer}
     * @param act [in] {@code MsoWizardActType}
     * @param Animation [in, optional] {@code Object}
     */
    @ComMethod(name = "ActivateWizard", dispId = 0x60030009)
    void ActivateWizard(Integer WizardID,
            MsoWizardActType act,
            Object Animation);
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "ResetTips", dispId = 0x6003000a)
    void ResetTips();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "NewBalloon", dispId = 0x6003000b)
    Balloon getNewBalloon();
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "BalloonError", dispId = 0x6003000c)
    MsoBalloonErrorType getBalloonError();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6003000d)
    Boolean getVisible();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x6003000d)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Animation", dispId = 0x6003000f)
    MsoAnimationType getAnimation();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code MsoAnimationType}
     */
    @ComProperty(name = "Animation", dispId = 0x6003000f)
    void setAnimation(MsoAnimationType param0);
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Reduced", dispId = 0x60030011)
    Boolean getReduced();
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Reduced", dispId = 0x60030011)
    void setReduced(Boolean param0);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AssistWithHelp", dispId = 0x60030013)
    void setAssistWithHelp(Boolean param0);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "AssistWithHelp", dispId = 0x60030013)
    Boolean getAssistWithHelp();
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AssistWithWizards", dispId = 0x60030015)
    void setAssistWithWizards(Boolean param0);
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "AssistWithWizards", dispId = 0x60030015)
    Boolean getAssistWithWizards();
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AssistWithAlerts", dispId = 0x60030017)
    void setAssistWithAlerts(Boolean param0);
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "AssistWithAlerts", dispId = 0x60030017)
    Boolean getAssistWithAlerts();
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MoveWhenInTheWay", dispId = 0x60030019)
    void setMoveWhenInTheWay(Boolean param0);
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "MoveWhenInTheWay", dispId = 0x60030019)
    Boolean getMoveWhenInTheWay();
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Sounds", dispId = 0x6003001b)
    void setSounds(Boolean param0);
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Sounds", dispId = 0x6003001b)
    Boolean getSounds();
            
    /**
     * <p>id(0x6003001d)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FeatureTips", dispId = 0x6003001d)
    void setFeatureTips(Boolean param0);
            
    /**
     * <p>id(0x6003001d)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "FeatureTips", dispId = 0x6003001d)
    Boolean getFeatureTips();
            
    /**
     * <p>id(0x6003001f)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MouseTips", dispId = 0x6003001f)
    void setMouseTips(Boolean param0);
            
    /**
     * <p>id(0x6003001f)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "MouseTips", dispId = 0x6003001f)
    Boolean getMouseTips();
            
    /**
     * <p>id(0x60030021)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KeyboardShortcutTips", dispId = 0x60030021)
    void setKeyboardShortcutTips(Boolean param0);
            
    /**
     * <p>id(0x60030021)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "KeyboardShortcutTips", dispId = 0x60030021)
    Boolean getKeyboardShortcutTips();
            
    /**
     * <p>id(0x60030023)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HighPriorityTips", dispId = 0x60030023)
    void setHighPriorityTips(Boolean param0);
            
    /**
     * <p>id(0x60030023)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "HighPriorityTips", dispId = 0x60030023)
    Boolean getHighPriorityTips();
            
    /**
     * <p>id(0x60030025)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TipOfDay", dispId = 0x60030025)
    void setTipOfDay(Boolean param0);
            
    /**
     * <p>id(0x60030025)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "TipOfDay", dispId = 0x60030025)
    Boolean getTipOfDay();
            
    /**
     * <p>id(0x60030027)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GuessHelp", dispId = 0x60030027)
    void setGuessHelp(Boolean param0);
            
    /**
     * <p>id(0x60030027)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "GuessHelp", dispId = 0x60030027)
    Boolean getGuessHelp();
            
    /**
     * <p>id(0x60030029)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SearchWhenProgramming", dispId = 0x60030029)
    void setSearchWhenProgramming(Boolean param0);
            
    /**
     * <p>id(0x60030029)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "SearchWhenProgramming", dispId = 0x60030029)
    Boolean getSearchWhenProgramming();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    String getItem();
            
    /**
     * <p>id(0x6003002c)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "FileName", dispId = 0x6003002c)
    String getFileName();
            
    /**
     * <p>id(0x6003002c)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FileName", dispId = 0x6003002c)
    void setFileName(String param0);
            
    /**
     * <p>id(0x6003002e)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6003002e)
    String getName();
            
    /**
     * <p>id(0x6003002f)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "On", dispId = 0x6003002f)
    Boolean getOn();
            
    /**
     * <p>id(0x6003002f)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "On", dispId = 0x6003002f)
    void setOn(Boolean param0);
            
    /**
     * <p>id(0x60030031)</p>
     * <p>vtableId(58)</p>
     * @param bstrAlertTitle [in] {@code String}
     * @param bstrAlertText [in] {@code String}
     * @param alb [in] {@code MsoAlertButtonType}
     * @param alc [in] {@code MsoAlertIconType}
     * @param ald [in] {@code MsoAlertDefaultType}
     * @param alq [in] {@code MsoAlertCancelType}
     * @param varfSysAlert [in] {@code Boolean}
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