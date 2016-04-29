
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetCamera implements IComEnum {
    
    /**
     * (-2)
     */
    msoPresetCameraMixed(-2),
    
    /**
     * (1)
     */
    msoCameraLegacyObliqueTopLeft(1),
    
    /**
     * (2)
     */
    msoCameraLegacyObliqueTop(2),
    
    /**
     * (3)
     */
    msoCameraLegacyObliqueTopRight(3),
    
    /**
     * (4)
     */
    msoCameraLegacyObliqueLeft(4),
    
    /**
     * (5)
     */
    msoCameraLegacyObliqueFront(5),
    
    /**
     * (6)
     */
    msoCameraLegacyObliqueRight(6),
    
    /**
     * (7)
     */
    msoCameraLegacyObliqueBottomLeft(7),
    
    /**
     * (8)
     */
    msoCameraLegacyObliqueBottom(8),
    
    /**
     * (9)
     */
    msoCameraLegacyObliqueBottomRight(9),
    
    /**
     * (10)
     */
    msoCameraLegacyPerspectiveTopLeft(10),
    
    /**
     * (11)
     */
    msoCameraLegacyPerspectiveTop(11),
    
    /**
     * (12)
     */
    msoCameraLegacyPerspectiveTopRight(12),
    
    /**
     * (13)
     */
    msoCameraLegacyPerspectiveLeft(13),
    
    /**
     * (14)
     */
    msoCameraLegacyPerspectiveFront(14),
    
    /**
     * (15)
     */
    msoCameraLegacyPerspectiveRight(15),
    
    /**
     * (16)
     */
    msoCameraLegacyPerspectiveBottomLeft(16),
    
    /**
     * (17)
     */
    msoCameraLegacyPerspectiveBottom(17),
    
    /**
     * (18)
     */
    msoCameraLegacyPerspectiveBottomRight(18),
    
    /**
     * (19)
     */
    msoCameraOrthographicFront(19),
    
    /**
     * (20)
     */
    msoCameraIsometricTopUp(20),
    
    /**
     * (21)
     */
    msoCameraIsometricTopDown(21),
    
    /**
     * (22)
     */
    msoCameraIsometricBottomUp(22),
    
    /**
     * (23)
     */
    msoCameraIsometricBottomDown(23),
    
    /**
     * (24)
     */
    msoCameraIsometricLeftUp(24),
    
    /**
     * (25)
     */
    msoCameraIsometricLeftDown(25),
    
    /**
     * (26)
     */
    msoCameraIsometricRightUp(26),
    
    /**
     * (27)
     */
    msoCameraIsometricRightDown(27),
    
    /**
     * (28)
     */
    msoCameraIsometricOffAxis1Left(28),
    
    /**
     * (29)
     */
    msoCameraIsometricOffAxis1Right(29),
    
    /**
     * (30)
     */
    msoCameraIsometricOffAxis1Top(30),
    
    /**
     * (31)
     */
    msoCameraIsometricOffAxis2Left(31),
    
    /**
     * (32)
     */
    msoCameraIsometricOffAxis2Right(32),
    
    /**
     * (33)
     */
    msoCameraIsometricOffAxis2Top(33),
    
    /**
     * (34)
     */
    msoCameraIsometricOffAxis3Left(34),
    
    /**
     * (35)
     */
    msoCameraIsometricOffAxis3Right(35),
    
    /**
     * (36)
     */
    msoCameraIsometricOffAxis3Bottom(36),
    
    /**
     * (37)
     */
    msoCameraIsometricOffAxis4Left(37),
    
    /**
     * (38)
     */
    msoCameraIsometricOffAxis4Right(38),
    
    /**
     * (39)
     */
    msoCameraIsometricOffAxis4Bottom(39),
    
    /**
     * (40)
     */
    msoCameraObliqueTopLeft(40),
    
    /**
     * (41)
     */
    msoCameraObliqueTop(41),
    
    /**
     * (42)
     */
    msoCameraObliqueTopRight(42),
    
    /**
     * (43)
     */
    msoCameraObliqueLeft(43),
    
    /**
     * (44)
     */
    msoCameraObliqueRight(44),
    
    /**
     * (45)
     */
    msoCameraObliqueBottomLeft(45),
    
    /**
     * (46)
     */
    msoCameraObliqueBottom(46),
    
    /**
     * (47)
     */
    msoCameraObliqueBottomRight(47),
    
    /**
     * (48)
     */
    msoCameraPerspectiveFront(48),
    
    /**
     * (49)
     */
    msoCameraPerspectiveLeft(49),
    
    /**
     * (50)
     */
    msoCameraPerspectiveRight(50),
    
    /**
     * (51)
     */
    msoCameraPerspectiveAbove(51),
    
    /**
     * (52)
     */
    msoCameraPerspectiveBelow(52),
    
    /**
     * (53)
     */
    msoCameraPerspectiveAboveLeftFacing(53),
    
    /**
     * (54)
     */
    msoCameraPerspectiveAboveRightFacing(54),
    
    /**
     * (55)
     */
    msoCameraPerspectiveContrastingLeftFacing(55),
    
    /**
     * (56)
     */
    msoCameraPerspectiveContrastingRightFacing(56),
    
    /**
     * (57)
     */
    msoCameraPerspectiveHeroicLeftFacing(57),
    
    /**
     * (58)
     */
    msoCameraPerspectiveHeroicRightFacing(58),
    
    /**
     * (59)
     */
    msoCameraPerspectiveHeroicExtremeLeftFacing(59),
    
    /**
     * (60)
     */
    msoCameraPerspectiveHeroicExtremeRightFacing(60),
    
    /**
     * (61)
     */
    msoCameraPerspectiveRelaxed(61),
    
    /**
     * (62)
     */
    msoCameraPerspectiveRelaxedModerately(62),
    ;

    private MsoPresetCamera(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}