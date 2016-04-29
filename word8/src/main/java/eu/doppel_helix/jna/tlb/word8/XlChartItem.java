
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlChartItem implements IComEnum {
    
    /**
     * (0)
     */
    xlDataLabel(0),
    
    /**
     * (2)
     */
    xlChartArea(2),
    
    /**
     * (3)
     */
    xlSeries(3),
    
    /**
     * (4)
     */
    xlChartTitle(4),
    
    /**
     * (5)
     */
    xlWalls(5),
    
    /**
     * (6)
     */
    xlCorners(6),
    
    /**
     * (7)
     */
    xlDataTable(7),
    
    /**
     * (8)
     */
    xlTrendline(8),
    
    /**
     * (9)
     */
    xlErrorBars(9),
    
    /**
     * (10)
     */
    xlXErrorBars(10),
    
    /**
     * (11)
     */
    xlYErrorBars(11),
    
    /**
     * (12)
     */
    xlLegendEntry(12),
    
    /**
     * (13)
     */
    xlLegendKey(13),
    
    /**
     * (14)
     */
    xlShape(14),
    
    /**
     * (15)
     */
    xlMajorGridlines(15),
    
    /**
     * (16)
     */
    xlMinorGridlines(16),
    
    /**
     * (17)
     */
    xlAxisTitle(17),
    
    /**
     * (18)
     */
    xlUpBars(18),
    
    /**
     * (19)
     */
    xlPlotArea(19),
    
    /**
     * (20)
     */
    xlDownBars(20),
    
    /**
     * (21)
     */
    xlAxis(21),
    
    /**
     * (22)
     */
    xlSeriesLines(22),
    
    /**
     * (23)
     */
    xlFloor(23),
    
    /**
     * (24)
     */
    xlLegend(24),
    
    /**
     * (25)
     */
    xlHiLoLines(25),
    
    /**
     * (26)
     */
    xlDropLines(26),
    
    /**
     * (27)
     */
    xlRadarAxisLabels(27),
    
    /**
     * (28)
     */
    xlNothing(28),
    
    /**
     * (29)
     */
    xlLeaderLines(29),
    
    /**
     * (30)
     */
    xlDisplayUnitLabel(30),
    
    /**
     * (31)
     */
    xlPivotChartFieldButton(31),
    
    /**
     * (32)
     */
    xlPivotChartDropZone(32),
    ;

    private XlChartItem(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}