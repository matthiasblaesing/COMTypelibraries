
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoChartElementType implements IComEnum {
    
    /**
     * (0)
     */
    msoElementChartTitleNone(0),
    
    /**
     * (1)
     */
    msoElementChartTitleCenteredOverlay(1),
    
    /**
     * (2)
     */
    msoElementChartTitleAboveChart(2),
    
    /**
     * (100)
     */
    msoElementLegendNone(100),
    
    /**
     * (101)
     */
    msoElementLegendRight(101),
    
    /**
     * (102)
     */
    msoElementLegendTop(102),
    
    /**
     * (103)
     */
    msoElementLegendLeft(103),
    
    /**
     * (104)
     */
    msoElementLegendBottom(104),
    
    /**
     * (105)
     */
    msoElementLegendRightOverlay(105),
    
    /**
     * (106)
     */
    msoElementLegendLeftOverlay(106),
    
    /**
     * (200)
     */
    msoElementDataLabelNone(200),
    
    /**
     * (201)
     */
    msoElementDataLabelShow(201),
    
    /**
     * (202)
     */
    msoElementDataLabelCenter(202),
    
    /**
     * (203)
     */
    msoElementDataLabelInsideEnd(203),
    
    /**
     * (204)
     */
    msoElementDataLabelInsideBase(204),
    
    /**
     * (205)
     */
    msoElementDataLabelOutSideEnd(205),
    
    /**
     * (206)
     */
    msoElementDataLabelLeft(206),
    
    /**
     * (207)
     */
    msoElementDataLabelRight(207),
    
    /**
     * (208)
     */
    msoElementDataLabelTop(208),
    
    /**
     * (209)
     */
    msoElementDataLabelBottom(209),
    
    /**
     * (210)
     */
    msoElementDataLabelBestFit(210),
    
    /**
     * (211)
     */
    msoElementDataLabelCallout(211),
    
    /**
     * (300)
     */
    msoElementPrimaryCategoryAxisTitleNone(300),
    
    /**
     * (301)
     */
    msoElementPrimaryCategoryAxisTitleAdjacentToAxis(301),
    
    /**
     * (302)
     */
    msoElementPrimaryCategoryAxisTitleBelowAxis(302),
    
    /**
     * (303)
     */
    msoElementPrimaryCategoryAxisTitleRotated(303),
    
    /**
     * (304)
     */
    msoElementPrimaryCategoryAxisTitleVertical(304),
    
    /**
     * (305)
     */
    msoElementPrimaryCategoryAxisTitleHorizontal(305),
    
    /**
     * (306)
     */
    msoElementPrimaryValueAxisTitleNone(306),
    
    /**
     * (306)
     */
    msoElementPrimaryValueAxisTitleAdjacentToAxis(306),
    
    /**
     * (308)
     */
    msoElementPrimaryValueAxisTitleBelowAxis(308),
    
    /**
     * (309)
     */
    msoElementPrimaryValueAxisTitleRotated(309),
    
    /**
     * (310)
     */
    msoElementPrimaryValueAxisTitleVertical(310),
    
    /**
     * (311)
     */
    msoElementPrimaryValueAxisTitleHorizontal(311),
    
    /**
     * (312)
     */
    msoElementSecondaryCategoryAxisTitleNone(312),
    
    /**
     * (313)
     */
    msoElementSecondaryCategoryAxisTitleAdjacentToAxis(313),
    
    /**
     * (314)
     */
    msoElementSecondaryCategoryAxisTitleBelowAxis(314),
    
    /**
     * (315)
     */
    msoElementSecondaryCategoryAxisTitleRotated(315),
    
    /**
     * (316)
     */
    msoElementSecondaryCategoryAxisTitleVertical(316),
    
    /**
     * (317)
     */
    msoElementSecondaryCategoryAxisTitleHorizontal(317),
    
    /**
     * (318)
     */
    msoElementSecondaryValueAxisTitleNone(318),
    
    /**
     * (319)
     */
    msoElementSecondaryValueAxisTitleAdjacentToAxis(319),
    
    /**
     * (320)
     */
    msoElementSecondaryValueAxisTitleBelowAxis(320),
    
    /**
     * (321)
     */
    msoElementSecondaryValueAxisTitleRotated(321),
    
    /**
     * (322)
     */
    msoElementSecondaryValueAxisTitleVertical(322),
    
    /**
     * (323)
     */
    msoElementSecondaryValueAxisTitleHorizontal(323),
    
    /**
     * (324)
     */
    msoElementSeriesAxisTitleNone(324),
    
    /**
     * (325)
     */
    msoElementSeriesAxisTitleRotated(325),
    
    /**
     * (326)
     */
    msoElementSeriesAxisTitleVertical(326),
    
    /**
     * (327)
     */
    msoElementSeriesAxisTitleHorizontal(327),
    
    /**
     * (328)
     */
    msoElementPrimaryValueGridLinesNone(328),
    
    /**
     * (329)
     */
    msoElementPrimaryValueGridLinesMinor(329),
    
    /**
     * (330)
     */
    msoElementPrimaryValueGridLinesMajor(330),
    
    /**
     * (331)
     */
    msoElementPrimaryValueGridLinesMinorMajor(331),
    
    /**
     * (332)
     */
    msoElementPrimaryCategoryGridLinesNone(332),
    
    /**
     * (333)
     */
    msoElementPrimaryCategoryGridLinesMinor(333),
    
    /**
     * (334)
     */
    msoElementPrimaryCategoryGridLinesMajor(334),
    
    /**
     * (335)
     */
    msoElementPrimaryCategoryGridLinesMinorMajor(335),
    
    /**
     * (336)
     */
    msoElementSecondaryValueGridLinesNone(336),
    
    /**
     * (337)
     */
    msoElementSecondaryValueGridLinesMinor(337),
    
    /**
     * (338)
     */
    msoElementSecondaryValueGridLinesMajor(338),
    
    /**
     * (339)
     */
    msoElementSecondaryValueGridLinesMinorMajor(339),
    
    /**
     * (340)
     */
    msoElementSecondaryCategoryGridLinesNone(340),
    
    /**
     * (341)
     */
    msoElementSecondaryCategoryGridLinesMinor(341),
    
    /**
     * (342)
     */
    msoElementSecondaryCategoryGridLinesMajor(342),
    
    /**
     * (343)
     */
    msoElementSecondaryCategoryGridLinesMinorMajor(343),
    
    /**
     * (344)
     */
    msoElementSeriesAxisGridLinesNone(344),
    
    /**
     * (345)
     */
    msoElementSeriesAxisGridLinesMinor(345),
    
    /**
     * (346)
     */
    msoElementSeriesAxisGridLinesMajor(346),
    
    /**
     * (347)
     */
    msoElementSeriesAxisGridLinesMinorMajor(347),
    
    /**
     * (348)
     */
    msoElementPrimaryCategoryAxisNone(348),
    
    /**
     * (349)
     */
    msoElementPrimaryCategoryAxisShow(349),
    
    /**
     * (350)
     */
    msoElementPrimaryCategoryAxisWithoutLabels(350),
    
    /**
     * (351)
     */
    msoElementPrimaryCategoryAxisReverse(351),
    
    /**
     * (352)
     */
    msoElementPrimaryValueAxisNone(352),
    
    /**
     * (353)
     */
    msoElementPrimaryValueAxisShow(353),
    
    /**
     * (354)
     */
    msoElementPrimaryValueAxisThousands(354),
    
    /**
     * (355)
     */
    msoElementPrimaryValueAxisMillions(355),
    
    /**
     * (356)
     */
    msoElementPrimaryValueAxisBillions(356),
    
    /**
     * (357)
     */
    msoElementPrimaryValueAxisLogScale(357),
    
    /**
     * (358)
     */
    msoElementSecondaryCategoryAxisNone(358),
    
    /**
     * (359)
     */
    msoElementSecondaryCategoryAxisShow(359),
    
    /**
     * (360)
     */
    msoElementSecondaryCategoryAxisWithoutLabels(360),
    
    /**
     * (361)
     */
    msoElementSecondaryCategoryAxisReverse(361),
    
    /**
     * (362)
     */
    msoElementSecondaryValueAxisNone(362),
    
    /**
     * (363)
     */
    msoElementSecondaryValueAxisShow(363),
    
    /**
     * (364)
     */
    msoElementSecondaryValueAxisThousands(364),
    
    /**
     * (365)
     */
    msoElementSecondaryValueAxisMillions(365),
    
    /**
     * (366)
     */
    msoElementSecondaryValueAxisBillions(366),
    
    /**
     * (367)
     */
    msoElementSecondaryValueAxisLogScale(367),
    
    /**
     * (368)
     */
    msoElementSeriesAxisNone(368),
    
    /**
     * (369)
     */
    msoElementSeriesAxisShow(369),
    
    /**
     * (370)
     */
    msoElementSeriesAxisWithoutLabeling(370),
    
    /**
     * (371)
     */
    msoElementSeriesAxisReverse(371),
    
    /**
     * (372)
     */
    msoElementPrimaryCategoryAxisThousands(372),
    
    /**
     * (373)
     */
    msoElementPrimaryCategoryAxisMillions(373),
    
    /**
     * (374)
     */
    msoElementPrimaryCategoryAxisBillions(374),
    
    /**
     * (375)
     */
    msoElementPrimaryCategoryAxisLogScale(375),
    
    /**
     * (376)
     */
    msoElementSecondaryCategoryAxisThousands(376),
    
    /**
     * (377)
     */
    msoElementSecondaryCategoryAxisMillions(377),
    
    /**
     * (378)
     */
    msoElementSecondaryCategoryAxisBillions(378),
    
    /**
     * (379)
     */
    msoElementSecondaryCategoryAxisLogScale(379),
    
    /**
     * (500)
     */
    msoElementDataTableNone(500),
    
    /**
     * (501)
     */
    msoElementDataTableShow(501),
    
    /**
     * (502)
     */
    msoElementDataTableWithLegendKeys(502),
    
    /**
     * (600)
     */
    msoElementTrendlineNone(600),
    
    /**
     * (601)
     */
    msoElementTrendlineAddLinear(601),
    
    /**
     * (602)
     */
    msoElementTrendlineAddExponential(602),
    
    /**
     * (603)
     */
    msoElementTrendlineAddLinearForecast(603),
    
    /**
     * (604)
     */
    msoElementTrendlineAddTwoPeriodMovingAverage(604),
    
    /**
     * (700)
     */
    msoElementErrorBarNone(700),
    
    /**
     * (701)
     */
    msoElementErrorBarStandardError(701),
    
    /**
     * (702)
     */
    msoElementErrorBarPercentage(702),
    
    /**
     * (703)
     */
    msoElementErrorBarStandardDeviation(703),
    
    /**
     * (800)
     */
    msoElementLineNone(800),
    
    /**
     * (801)
     */
    msoElementLineDropLine(801),
    
    /**
     * (802)
     */
    msoElementLineHiLoLine(802),
    
    /**
     * (803)
     */
    msoElementLineSeriesLine(803),
    
    /**
     * (804)
     */
    msoElementLineDropHiLoLine(804),
    
    /**
     * (900)
     */
    msoElementUpDownBarsNone(900),
    
    /**
     * (901)
     */
    msoElementUpDownBarsShow(901),
    
    /**
     * (1000)
     */
    msoElementPlotAreaNone(1000),
    
    /**
     * (1001)
     */
    msoElementPlotAreaShow(1001),
    
    /**
     * (1100)
     */
    msoElementChartWallNone(1100),
    
    /**
     * (1101)
     */
    msoElementChartWallShow(1101),
    
    /**
     * (1200)
     */
    msoElementChartFloorNone(1200),
    
    /**
     * (1201)
     */
    msoElementChartFloorShow(1201),
    ;

    private MsoChartElementType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}