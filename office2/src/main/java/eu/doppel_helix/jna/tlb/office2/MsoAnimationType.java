
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAnimationType implements IComEnum {
    
    /**
     * (1)
     */
    msoAnimationIdle(1),
    
    /**
     * (2)
     */
    msoAnimationGreeting(2),
    
    /**
     * (3)
     */
    msoAnimationGoodbye(3),
    
    /**
     * (4)
     */
    msoAnimationBeginSpeaking(4),
    
    /**
     * (5)
     */
    msoAnimationRestPose(5),
    
    /**
     * (6)
     */
    msoAnimationCharacterSuccessMajor(6),
    
    /**
     * (11)
     */
    msoAnimationGetAttentionMajor(11),
    
    /**
     * (12)
     */
    msoAnimationGetAttentionMinor(12),
    
    /**
     * (13)
     */
    msoAnimationSearching(13),
    
    /**
     * (18)
     */
    msoAnimationPrinting(18),
    
    /**
     * (19)
     */
    msoAnimationGestureRight(19),
    
    /**
     * (22)
     */
    msoAnimationWritingNotingSomething(22),
    
    /**
     * (23)
     */
    msoAnimationWorkingAtSomething(23),
    
    /**
     * (24)
     */
    msoAnimationThinking(24),
    
    /**
     * (25)
     */
    msoAnimationSendingMail(25),
    
    /**
     * (26)
     */
    msoAnimationListensToComputer(26),
    
    /**
     * (31)
     */
    msoAnimationDisappear(31),
    
    /**
     * (32)
     */
    msoAnimationAppear(32),
    
    /**
     * (100)
     */
    msoAnimationGetArtsy(100),
    
    /**
     * (101)
     */
    msoAnimationGetTechy(101),
    
    /**
     * (102)
     */
    msoAnimationGetWizardy(102),
    
    /**
     * (103)
     */
    msoAnimationCheckingSomething(103),
    
    /**
     * (104)
     */
    msoAnimationLookDown(104),
    
    /**
     * (105)
     */
    msoAnimationLookDownLeft(105),
    
    /**
     * (106)
     */
    msoAnimationLookDownRight(106),
    
    /**
     * (107)
     */
    msoAnimationLookLeft(107),
    
    /**
     * (108)
     */
    msoAnimationLookRight(108),
    
    /**
     * (109)
     */
    msoAnimationLookUp(109),
    
    /**
     * (110)
     */
    msoAnimationLookUpLeft(110),
    
    /**
     * (111)
     */
    msoAnimationLookUpRight(111),
    
    /**
     * (112)
     */
    msoAnimationSaving(112),
    
    /**
     * (113)
     */
    msoAnimationGestureDown(113),
    
    /**
     * (114)
     */
    msoAnimationGestureLeft(114),
    
    /**
     * (115)
     */
    msoAnimationGestureUp(115),
    
    /**
     * (116)
     */
    msoAnimationEmptyTrash(116),
    ;

    private MsoAnimationType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}