
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024428-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024428-0000-0000-C000-000000000046}")
public interface _QueryTable {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x630)</p>
     */
    @ComProperty(name = "FieldNames", dispId = 0x630)
    Boolean getFieldNames();
            
    /**
     * <p>id(0x630)</p>
     */
    @ComProperty(name = "FieldNames", dispId = 0x630)
    void setFieldNames(Boolean param0);
            
    /**
     * <p>id(0x631)</p>
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    Boolean getRowNumbers();
            
    /**
     * <p>id(0x631)</p>
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    void setRowNumbers(Boolean param0);
            
    /**
     * <p>id(0x632)</p>
     */
    @ComProperty(name = "FillAdjacentFormulas", dispId = 0x632)
    Boolean getFillAdjacentFormulas();
            
    /**
     * <p>id(0x632)</p>
     */
    @ComProperty(name = "FillAdjacentFormulas", dispId = 0x632)
    void setFillAdjacentFormulas(Boolean param0);
            
    /**
     * <p>id(0x2b7)</p>
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    Boolean getHasAutoFormat();
            
    /**
     * <p>id(0x2b7)</p>
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    void setHasAutoFormat(Boolean param0);
            
    /**
     * <p>id(0x5c7)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    Boolean getRefreshOnFileOpen();
            
    /**
     * <p>id(0x5c7)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    void setRefreshOnFileOpen(Boolean param0);
            
    /**
     * <p>id(0x633)</p>
     */
    @ComProperty(name = "Refreshing", dispId = 0x633)
    Boolean getRefreshing();
            
    /**
     * <p>id(0x634)</p>
     */
    @ComProperty(name = "FetchedRowOverflow", dispId = 0x634)
    Boolean getFetchedRowOverflow();
            
    /**
     * <p>id(0x593)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    Boolean getBackgroundQuery();
            
    /**
     * <p>id(0x593)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    void setBackgroundQuery(Boolean param0);
            
    /**
     * <p>id(0x635)</p>
     */
    @ComMethod(name = "CancelRefresh", dispId = 0x635)
    void CancelRefresh();
            
    /**
     * <p>id(0x636)</p>
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    XlCellInsertionMode getRefreshStyle();
            
    /**
     * <p>id(0x636)</p>
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    void setRefreshStyle(XlCellInsertionMode param0);
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    Boolean getEnableRefresh();
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    void setEnableRefresh(Boolean param0);
            
    /**
     * <p>id(0x5c9)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    Boolean getSavePassword();
            
    /**
     * <p>id(0x5c9)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    void setSavePassword(Boolean param0);
            
    /**
     * <p>id(0x2a9)</p>
     */
    @ComProperty(name = "Destination", dispId = 0x2a9)
    Range getDestination();
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    Object getConnection();
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    void setConnection(Object param0);
            
    /**
     * <p>id(0x5c8)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    Object getSql();
            
    /**
     * <p>id(0x5c8)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    void setSql(Object param0);
            
    /**
     * <p>id(0x637)</p>
     */
    @ComProperty(name = "PostText", dispId = 0x637)
    String getPostText();
            
    /**
     * <p>id(0x637)</p>
     */
    @ComProperty(name = "PostText", dispId = 0x637)
    void setPostText(String param0);
            
    /**
     * <p>id(0x638)</p>
     */
    @ComProperty(name = "ResultRange", dispId = 0x638)
    Range getResultRange();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    Boolean Refresh(Object BackgroundQuery);
            
    /**
     * <p>id(0x639)</p>
     */
    @ComProperty(name = "Parameters", dispId = 0x639)
    Parameters getParameters();
            
    /**
     * <p>id(0x48d)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.COM.util.IDispatch getRecordset();
            
    /**
     * <p>id(0x48d)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    void setRecordset(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * <p>id(0x2b4)</p>
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    Boolean getSaveData();
            
    /**
     * <p>id(0x2b4)</p>
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    void setSaveData(Boolean param0);
            
    /**
     * <p>id(0x63a)</p>
     */
    @ComProperty(name = "TablesOnlyFromHTML", dispId = 0x63a)
    Boolean getTablesOnlyFromHTML();
            
    /**
     * <p>id(0x63a)</p>
     */
    @ComProperty(name = "TablesOnlyFromHTML", dispId = 0x63a)
    void setTablesOnlyFromHTML(Boolean param0);
            
    /**
     * <p>id(0x63b)</p>
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    Boolean getEnableEditing();
            
    /**
     * <p>id(0x63b)</p>
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    void setEnableEditing(Boolean param0);
            
    /**
     * <p>id(0x73f)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    Integer getTextFilePlatform();
            
    /**
     * <p>id(0x73f)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    void setTextFilePlatform(Integer param0);
            
    /**
     * <p>id(0x740)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    Integer getTextFileStartRow();
            
    /**
     * <p>id(0x740)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    void setTextFileStartRow(Integer param0);
            
    /**
     * <p>id(0x741)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    XlTextParsingType getTextFileParseType();
            
    /**
     * <p>id(0x741)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    void setTextFileParseType(XlTextParsingType param0);
            
    /**
     * <p>id(0x742)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    XlTextQualifier getTextFileTextQualifier();
            
    /**
     * <p>id(0x742)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    void setTextFileTextQualifier(XlTextQualifier param0);
            
    /**
     * <p>id(0x743)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    Boolean getTextFileConsecutiveDelimiter();
            
    /**
     * <p>id(0x743)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    void setTextFileConsecutiveDelimiter(Boolean param0);
            
    /**
     * <p>id(0x744)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    Boolean getTextFileTabDelimiter();
            
    /**
     * <p>id(0x744)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    void setTextFileTabDelimiter(Boolean param0);
            
    /**
     * <p>id(0x745)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    Boolean getTextFileSemicolonDelimiter();
            
    /**
     * <p>id(0x745)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    void setTextFileSemicolonDelimiter(Boolean param0);
            
    /**
     * <p>id(0x746)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    Boolean getTextFileCommaDelimiter();
            
    /**
     * <p>id(0x746)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    void setTextFileCommaDelimiter(Boolean param0);
            
    /**
     * <p>id(0x747)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    Boolean getTextFileSpaceDelimiter();
            
    /**
     * <p>id(0x747)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    void setTextFileSpaceDelimiter(Boolean param0);
            
    /**
     * <p>id(0x748)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    String getTextFileOtherDelimiter();
            
    /**
     * <p>id(0x748)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    void setTextFileOtherDelimiter(String param0);
            
    /**
     * <p>id(0x749)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    Object getTextFileColumnDataTypes();
            
    /**
     * <p>id(0x749)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    void setTextFileColumnDataTypes(Object param0);
            
    /**
     * <p>id(0x74a)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    Object getTextFileFixedColumnWidths();
            
    /**
     * <p>id(0x74a)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    void setTextFileFixedColumnWidths(Object param0);
            
    /**
     * <p>id(0x74b)</p>
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    Boolean getPreserveColumnInfo();
            
    /**
     * <p>id(0x74b)</p>
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    void setPreserveColumnInfo(Boolean param0);
            
    /**
     * <p>id(0x5dc)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    Boolean getPreserveFormatting();
            
    /**
     * <p>id(0x5dc)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    void setPreserveFormatting(Boolean param0);
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    Boolean getAdjustColumnWidth();
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    void setAdjustColumnWidth(Boolean param0);
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    Object getCommandText();
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    void setCommandText(Object param0);
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    XlCmdType getCommandType();
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    void setCommandType(XlCmdType param0);
            
    /**
     * <p>id(0x74d)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    Boolean getTextFilePromptOnRefresh();
            
    /**
     * <p>id(0x74d)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    void setTextFilePromptOnRefresh(Boolean param0);
            
    /**
     * <p>id(0x727)</p>
     */
    @ComProperty(name = "QueryType", dispId = 0x727)
    XlQueryType getQueryType();
            
    /**
     * <p>id(0x728)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    Boolean getMaintainConnection();
            
    /**
     * <p>id(0x728)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    void setMaintainConnection(Boolean param0);
            
    /**
     * <p>id(0x74e)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    String getTextFileDecimalSeparator();
            
    /**
     * <p>id(0x74e)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    void setTextFileDecimalSeparator(String param0);
            
    /**
     * <p>id(0x74f)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    String getTextFileThousandsSeparator();
            
    /**
     * <p>id(0x74f)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    void setTextFileThousandsSeparator(String param0);
            
    /**
     * <p>id(0x729)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    Integer getRefreshPeriod();
            
    /**
     * <p>id(0x729)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    void setRefreshPeriod(Integer param0);
            
    /**
     * <p>id(0x72a)</p>
     */
    @ComMethod(name = "ResetTimer", dispId = 0x72a)
    void ResetTimer();
            
    /**
     * <p>id(0x750)</p>
     */
    @ComProperty(name = "WebSelectionType", dispId = 0x750)
    XlWebSelectionType getWebSelectionType();
            
    /**
     * <p>id(0x750)</p>
     */
    @ComProperty(name = "WebSelectionType", dispId = 0x750)
    void setWebSelectionType(XlWebSelectionType param0);
            
    /**
     * <p>id(0x751)</p>
     */
    @ComProperty(name = "WebFormatting", dispId = 0x751)
    XlWebFormatting getWebFormatting();
            
    /**
     * <p>id(0x751)</p>
     */
    @ComProperty(name = "WebFormatting", dispId = 0x751)
    void setWebFormatting(XlWebFormatting param0);
            
    /**
     * <p>id(0x752)</p>
     */
    @ComProperty(name = "WebTables", dispId = 0x752)
    String getWebTables();
            
    /**
     * <p>id(0x752)</p>
     */
    @ComProperty(name = "WebTables", dispId = 0x752)
    void setWebTables(String param0);
            
    /**
     * <p>id(0x753)</p>
     */
    @ComProperty(name = "WebPreFormattedTextToColumns", dispId = 0x753)
    Boolean getWebPreFormattedTextToColumns();
            
    /**
     * <p>id(0x753)</p>
     */
    @ComProperty(name = "WebPreFormattedTextToColumns", dispId = 0x753)
    void setWebPreFormattedTextToColumns(Boolean param0);
            
    /**
     * <p>id(0x754)</p>
     */
    @ComProperty(name = "WebSingleBlockTextImport", dispId = 0x754)
    Boolean getWebSingleBlockTextImport();
            
    /**
     * <p>id(0x754)</p>
     */
    @ComProperty(name = "WebSingleBlockTextImport", dispId = 0x754)
    void setWebSingleBlockTextImport(Boolean param0);
            
    /**
     * <p>id(0x755)</p>
     */
    @ComProperty(name = "WebDisableDateRecognition", dispId = 0x755)
    Boolean getWebDisableDateRecognition();
            
    /**
     * <p>id(0x755)</p>
     */
    @ComProperty(name = "WebDisableDateRecognition", dispId = 0x755)
    void setWebDisableDateRecognition(Boolean param0);
            
    /**
     * <p>id(0x756)</p>
     */
    @ComProperty(name = "WebConsecutiveDelimitersAsOne", dispId = 0x756)
    Boolean getWebConsecutiveDelimitersAsOne();
            
    /**
     * <p>id(0x756)</p>
     */
    @ComProperty(name = "WebConsecutiveDelimitersAsOne", dispId = 0x756)
    void setWebConsecutiveDelimitersAsOne(Boolean param0);
            
    /**
     * <p>id(0x872)</p>
     */
    @ComProperty(name = "WebDisableRedirections", dispId = 0x872)
    Boolean getWebDisableRedirections();
            
    /**
     * <p>id(0x872)</p>
     */
    @ComProperty(name = "WebDisableRedirections", dispId = 0x872)
    void setWebDisableRedirections(Boolean param0);
            
    /**
     * <p>id(0x873)</p>
     */
    @ComProperty(name = "EditWebPage", dispId = 0x873)
    Object getEditWebPage();
            
    /**
     * <p>id(0x873)</p>
     */
    @ComProperty(name = "EditWebPage", dispId = 0x873)
    void setEditWebPage(Object param0);
            
    /**
     * <p>id(0x81f)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    String getSourceConnectionFile();
            
    /**
     * <p>id(0x81f)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    void setSourceConnectionFile(String param0);
            
    /**
     * <p>id(0x820)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    String getSourceDataFile();
            
    /**
     * <p>id(0x820)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    void setSourceDataFile(String param0);
            
    /**
     * <p>id(0x821)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    XlRobustConnect getRobustConnect();
            
    /**
     * <p>id(0x821)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    void setRobustConnect(XlRobustConnect param0);
            
    /**
     * <p>id(0x874)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    Boolean getTextFileTrailingMinusNumbers();
            
    /**
     * <p>id(0x874)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    void setTextFileTrailingMinusNumbers(Boolean param0);
            
    /**
     * <p>id(0x822)</p>
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    void SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x8d1)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    ListObject getListObject();
            
    /**
     * <p>id(0x8c5)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    XlTextVisualLayoutType getTextFileVisualLayout();
            
    /**
     * <p>id(0x8c5)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    void setTextFileVisualLayout(XlTextVisualLayoutType param0);
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    /**
     * <p>id(0x370)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    Sort getSort();
            
    
}