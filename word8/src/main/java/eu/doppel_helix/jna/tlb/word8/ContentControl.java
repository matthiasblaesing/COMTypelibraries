
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EE95AFE3-3026-4172-B078-0E79DAB5CC3D})</p>
 */
@ComInterface(iid="{EE95AFE3-3026-4172-B078-0E79DAB5CC3D}")
public interface ContentControl {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Range", dispId = 0x1)
    Range getRange();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "LockContentControl", dispId = 0x2)
    Boolean getLockContentControl();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "LockContentControl", dispId = 0x2)
    void setLockContentControl(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "LockContents", dispId = 0x3)
    Boolean getLockContents();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "LockContents", dispId = 0x3)
    void setLockContents(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "XMLMapping", dispId = 0x4)
    XMLMapping getXMLMapping();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Type", dispId = 0x5)
    WdContentControlType getType();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Type", dispId = 0x5)
    void setType(WdContentControlType param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x6)
    void Copy();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x7)
    void Cut();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x8)
    void Delete(Boolean DeleteContents);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "DropdownListEntries", dispId = 0x9)
    ContentControlListEntries getDropdownListEntries();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "PlaceholderText", dispId = 0xa)
    BuildingBlock getPlaceholderText();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "SetPlaceholderText", dispId = 0xb)
    void SetPlaceholderText(BuildingBlock BuildingBlock,
            Range Range,
            String Text);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc)
    String getTitle();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc)
    void setTitle(String param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DateDisplayFormat", dispId = 0xd)
    String getDateDisplayFormat();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DateDisplayFormat", dispId = 0xd)
    void setDateDisplayFormat(String param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0xf)
    Boolean getMultiLine();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0xf)
    void setMultiLine(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "ParentContentControl", dispId = 0x10)
    ContentControl getParentContentControl();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Temporary", dispId = 0x11)
    Boolean getTemporary();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Temporary", dispId = 0x11)
    void setTemporary(Boolean param0);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "ID", dispId = 0x12)
    String getID();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "ShowingPlaceholderText", dispId = 0x13)
    Boolean getShowingPlaceholderText();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "DateStorageFormat", dispId = 0x14)
    WdContentControlDateStorageFormat getDateStorageFormat();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "DateStorageFormat", dispId = 0x14)
    void setDateStorageFormat(WdContentControlDateStorageFormat param0);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "BuildingBlockType", dispId = 0x15)
    WdBuildingBlockTypes getBuildingBlockType();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "BuildingBlockType", dispId = 0x15)
    void setBuildingBlockType(WdBuildingBlockTypes param0);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "BuildingBlockCategory", dispId = 0x16)
    String getBuildingBlockCategory();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "BuildingBlockCategory", dispId = 0x16)
    void setBuildingBlockCategory(String param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "DateDisplayLocale", dispId = 0x17)
    WdLanguageID getDateDisplayLocale();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "DateDisplayLocale", dispId = 0x17)
    void setDateDisplayLocale(WdLanguageID param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0x18)
    void Ungroup();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "DefaultTextStyle", dispId = 0x19)
    Object getDefaultTextStyle();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "DefaultTextStyle", dispId = 0x19)
    void setDefaultTextStyle(Object param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "DateCalendarType", dispId = 0x1a)
    WdCalendarType getDateCalendarType();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "DateCalendarType", dispId = 0x1a)
    void setDateCalendarType(WdCalendarType param0);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x1b)
    String getTag();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x1b)
    void setTag(String param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Checked", dispId = 0x1c)
    Boolean getChecked();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Checked", dispId = 0x1c)
    void setChecked(Boolean param0);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComMethod(name = "SetCheckedSymbol", dispId = 0x1d)
    void SetCheckedSymbol(Integer CharacterNumber,
            String Font);
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComMethod(name = "SetUncheckedSymbol", dispId = 0x1e)
    void SetUncheckedSymbol(Integer CharacterNumber,
            String Font);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "Color", dispId = 0x1f)
    WdColor getColor();
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "Color", dispId = 0x1f)
    void setColor(WdColor param0);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "Appearance", dispId = 0x20)
    WdContentControlAppearance getAppearance();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "Appearance", dispId = 0x20)
    void setAppearance(WdContentControlAppearance param0);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "Level", dispId = 0x21)
    WdContentControlLevel getLevel();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "RepeatingSectionItems", dispId = 0x22)
    RepeatingSectionItemColl getRepeatingSectionItems();
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "RepeatingSectionItemTitle", dispId = 0x23)
    String getRepeatingSectionItemTitle();
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "RepeatingSectionItemTitle", dispId = 0x23)
    void setRepeatingSectionItemTitle(String param0);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "AllowInsertDeleteSection", dispId = 0x24)
    Boolean getAllowInsertDeleteSection();
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "AllowInsertDeleteSection", dispId = 0x24)
    void setAllowInsertDeleteSection(Boolean param0);
            
    
}