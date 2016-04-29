
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlRuleActionType implements IComEnum {
    
    /**
     * (0)
     */
    olRuleActionUnknown(0),
    
    /**
     * (1)
     */
    olRuleActionMoveToFolder(1),
    
    /**
     * (2)
     */
    olRuleActionAssignToCategory(2),
    
    /**
     * (3)
     */
    olRuleActionDelete(3),
    
    /**
     * (4)
     */
    olRuleActionDeletePermanently(4),
    
    /**
     * (5)
     */
    olRuleActionCopyToFolder(5),
    
    /**
     * (6)
     */
    olRuleActionForward(6),
    
    /**
     * (7)
     */
    olRuleActionForwardAsAttachment(7),
    
    /**
     * (8)
     */
    olRuleActionRedirect(8),
    
    /**
     * (9)
     */
    olRuleActionServerReply(9),
    
    /**
     * (10)
     */
    olRuleActionTemplate(10),
    
    /**
     * (11)
     */
    olRuleActionFlagForActionInDays(11),
    
    /**
     * (12)
     */
    olRuleActionFlagColor(12),
    
    /**
     * (13)
     */
    olRuleActionFlagClear(13),
    
    /**
     * (14)
     */
    olRuleActionImportance(14),
    
    /**
     * (15)
     */
    olRuleActionSensitivity(15),
    
    /**
     * (16)
     */
    olRuleActionPrint(16),
    
    /**
     * (17)
     */
    olRuleActionPlaySound(17),
    
    /**
     * (18)
     */
    olRuleActionStartApplication(18),
    
    /**
     * (19)
     */
    olRuleActionMarkRead(19),
    
    /**
     * (20)
     */
    olRuleActionRunScript(20),
    
    /**
     * (21)
     */
    olRuleActionStop(21),
    
    /**
     * (22)
     */
    olRuleActionCustomAction(22),
    
    /**
     * (23)
     */
    olRuleActionNewItemAlert(23),
    
    /**
     * (24)
     */
    olRuleActionDesktopAlert(24),
    
    /**
     * (25)
     */
    olRuleActionNotifyRead(25),
    
    /**
     * (26)
     */
    olRuleActionNotifyDelivery(26),
    
    /**
     * (27)
     */
    olRuleActionCcMessage(27),
    
    /**
     * (28)
     */
    olRuleActionDefer(28),
    
    /**
     * (29)
     */
    olRuleActionMarkAsTask(29),
    
    /**
     * (30)
     */
    olRuleActionClearCategories(30),
    ;

    private OlRuleActionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}