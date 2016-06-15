
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024428-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024428-0001-0000-C000-000000000046}")
public interface _IQueryTable extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x630)</p>
     */
    @ComProperty(name = "FieldNames", dispId = 0x630)
    com.sun.jna.platform.win32.WinNT.HRESULT getFieldNames(VARIANT RHS);
            
    /**
     * <p>id(0x630)</p>
     */
    @ComProperty(name = "FieldNames", dispId = 0x630)
    com.sun.jna.platform.win32.WinNT.HRESULT setFieldNames(Boolean RHS);
            
    /**
     * <p>id(0x631)</p>
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowNumbers(VARIANT RHS);
            
    /**
     * <p>id(0x631)</p>
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowNumbers(Boolean RHS);
            
    /**
     * <p>id(0x632)</p>
     */
    @ComProperty(name = "FillAdjacentFormulas", dispId = 0x632)
    com.sun.jna.platform.win32.WinNT.HRESULT getFillAdjacentFormulas(VARIANT RHS);
            
    /**
     * <p>id(0x632)</p>
     */
    @ComProperty(name = "FillAdjacentFormulas", dispId = 0x632)
    com.sun.jna.platform.win32.WinNT.HRESULT setFillAdjacentFormulas(Boolean RHS);
            
    /**
     * <p>id(0x2b7)</p>
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasAutoFormat(VARIANT RHS);
            
    /**
     * <p>id(0x2b7)</p>
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasAutoFormat(Boolean RHS);
            
    /**
     * <p>id(0x5c7)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshOnFileOpen(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshOnFileOpen(Boolean RHS);
            
    /**
     * <p>id(0x633)</p>
     */
    @ComProperty(name = "Refreshing", dispId = 0x633)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshing(VARIANT RHS);
            
    /**
     * <p>id(0x634)</p>
     */
    @ComProperty(name = "FetchedRowOverflow", dispId = 0x634)
    com.sun.jna.platform.win32.WinNT.HRESULT getFetchedRowOverflow(VARIANT RHS);
            
    /**
     * <p>id(0x593)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackgroundQuery(VARIANT RHS);
            
    /**
     * <p>id(0x593)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackgroundQuery(Boolean RHS);
            
    /**
     * <p>id(0x635)</p>
     */
    @ComMethod(name = "CancelRefresh", dispId = 0x635)
    com.sun.jna.platform.win32.WinNT.HRESULT CancelRefresh();
            
    /**
     * <p>id(0x636)</p>
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshStyle(VARIANT RHS);
            
    /**
     * <p>id(0x636)</p>
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshStyle(XlCellInsertionMode RHS);
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableRefresh(Boolean RHS);
            
    /**
     * <p>id(0x5c9)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSavePassword(VARIANT RHS);
            
    /**
     * <p>id(0x5c9)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSavePassword(Boolean RHS);
            
    /**
     * <p>id(0x2a9)</p>
     */
    @ComProperty(name = "Destination", dispId = 0x2a9)
    com.sun.jna.platform.win32.WinNT.HRESULT getDestination(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnection(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT setConnection(Object RHS);
            
    /**
     * <p>id(0x5c8)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    com.sun.jna.platform.win32.WinNT.HRESULT getSql(VARIANT RHS);
            
    /**
     * <p>id(0x5c8)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    com.sun.jna.platform.win32.WinNT.HRESULT setSql(Object RHS);
            
    /**
     * <p>id(0x637)</p>
     */
    @ComProperty(name = "PostText", dispId = 0x637)
    com.sun.jna.platform.win32.WinNT.HRESULT getPostText(VARIANT RHS);
            
    /**
     * <p>id(0x637)</p>
     */
    @ComProperty(name = "PostText", dispId = 0x637)
    com.sun.jna.platform.win32.WinNT.HRESULT setPostText(String RHS);
            
    /**
     * <p>id(0x638)</p>
     */
    @ComProperty(name = "ResultRange", dispId = 0x638)
    com.sun.jna.platform.win32.WinNT.HRESULT getResultRange(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh(Object BackgroundQuery,
            VARIANT RHS);
            
    /**
     * <p>id(0x639)</p>
     */
    @ComProperty(name = "Parameters", dispId = 0x639)
    com.sun.jna.platform.win32.WinNT.HRESULT getParameters(VARIANT RHS);
            
    /**
     * <p>id(0x48d)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecordset(VARIANT RHS);
            
    /**
     * <p>id(0x48d)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.WinNT.HRESULT setRecordset(com.sun.jna.platform.win32.COM.util.IDispatch RHS);
            
    /**
     * <p>id(0x2b4)</p>
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    com.sun.jna.platform.win32.WinNT.HRESULT getSaveData(VARIANT RHS);
            
    /**
     * <p>id(0x2b4)</p>
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    com.sun.jna.platform.win32.WinNT.HRESULT setSaveData(Boolean RHS);
            
    /**
     * <p>id(0x63a)</p>
     */
    @ComProperty(name = "TablesOnlyFromHTML", dispId = 0x63a)
    com.sun.jna.platform.win32.WinNT.HRESULT getTablesOnlyFromHTML(VARIANT RHS);
            
    /**
     * <p>id(0x63a)</p>
     */
    @ComProperty(name = "TablesOnlyFromHTML", dispId = 0x63a)
    com.sun.jna.platform.win32.WinNT.HRESULT setTablesOnlyFromHTML(Boolean RHS);
            
    /**
     * <p>id(0x63b)</p>
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableEditing(VARIANT RHS);
            
    /**
     * <p>id(0x63b)</p>
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableEditing(Boolean RHS);
            
    /**
     * <p>id(0x73f)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFilePlatform(VARIANT RHS);
            
    /**
     * <p>id(0x73f)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFilePlatform(Integer RHS);
            
    /**
     * <p>id(0x740)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileStartRow(VARIANT RHS);
            
    /**
     * <p>id(0x740)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileStartRow(Integer RHS);
            
    /**
     * <p>id(0x741)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileParseType(VARIANT RHS);
            
    /**
     * <p>id(0x741)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileParseType(XlTextParsingType RHS);
            
    /**
     * <p>id(0x742)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTextQualifier(VARIANT RHS);
            
    /**
     * <p>id(0x742)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTextQualifier(XlTextQualifier RHS);
            
    /**
     * <p>id(0x743)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileConsecutiveDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x743)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileConsecutiveDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x744)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTabDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x744)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTabDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x745)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileSemicolonDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x745)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileSemicolonDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x746)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileCommaDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x746)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileCommaDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x747)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileSpaceDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x747)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileSpaceDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x748)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileOtherDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x748)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileOtherDelimiter(String RHS);
            
    /**
     * <p>id(0x749)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileColumnDataTypes(VARIANT RHS);
            
    /**
     * <p>id(0x749)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileColumnDataTypes(Object RHS);
            
    /**
     * <p>id(0x74a)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileFixedColumnWidths(VARIANT RHS);
            
    /**
     * <p>id(0x74a)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileFixedColumnWidths(Object RHS);
            
    /**
     * <p>id(0x74b)</p>
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveColumnInfo(VARIANT RHS);
            
    /**
     * <p>id(0x74b)</p>
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveColumnInfo(Boolean RHS);
            
    /**
     * <p>id(0x5dc)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveFormatting(VARIANT RHS);
            
    /**
     * <p>id(0x5dc)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveFormatting(Boolean RHS);
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    com.sun.jna.platform.win32.WinNT.HRESULT getAdjustColumnWidth(VARIANT RHS);
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    com.sun.jna.platform.win32.WinNT.HRESULT setAdjustColumnWidth(Boolean RHS);
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandText(VARIANT RHS);
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandText(Object RHS);
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandType(VARIANT RHS);
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandType(XlCmdType RHS);
            
    /**
     * <p>id(0x74d)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFilePromptOnRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x74d)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFilePromptOnRefresh(Boolean RHS);
            
    /**
     * <p>id(0x727)</p>
     */
    @ComProperty(name = "QueryType", dispId = 0x727)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryType(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaintainConnection(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaintainConnection(Boolean RHS);
            
    /**
     * <p>id(0x74e)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileDecimalSeparator(VARIANT RHS);
            
    /**
     * <p>id(0x74e)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileDecimalSeparator(String RHS);
            
    /**
     * <p>id(0x74f)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileThousandsSeparator(VARIANT RHS);
            
    /**
     * <p>id(0x74f)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileThousandsSeparator(String RHS);
            
    /**
     * <p>id(0x729)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshPeriod(VARIANT RHS);
            
    /**
     * <p>id(0x729)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshPeriod(Integer RHS);
            
    /**
     * <p>id(0x72a)</p>
     */
    @ComMethod(name = "ResetTimer", dispId = 0x72a)
    com.sun.jna.platform.win32.WinNT.HRESULT ResetTimer();
            
    /**
     * <p>id(0x750)</p>
     */
    @ComProperty(name = "WebSelectionType", dispId = 0x750)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebSelectionType(VARIANT RHS);
            
    /**
     * <p>id(0x750)</p>
     */
    @ComProperty(name = "WebSelectionType", dispId = 0x750)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebSelectionType(XlWebSelectionType RHS);
            
    /**
     * <p>id(0x751)</p>
     */
    @ComProperty(name = "WebFormatting", dispId = 0x751)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebFormatting(VARIANT RHS);
            
    /**
     * <p>id(0x751)</p>
     */
    @ComProperty(name = "WebFormatting", dispId = 0x751)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebFormatting(XlWebFormatting RHS);
            
    /**
     * <p>id(0x752)</p>
     */
    @ComProperty(name = "WebTables", dispId = 0x752)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebTables(VARIANT RHS);
            
    /**
     * <p>id(0x752)</p>
     */
    @ComProperty(name = "WebTables", dispId = 0x752)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebTables(String RHS);
            
    /**
     * <p>id(0x753)</p>
     */
    @ComProperty(name = "WebPreFormattedTextToColumns", dispId = 0x753)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebPreFormattedTextToColumns(VARIANT RHS);
            
    /**
     * <p>id(0x753)</p>
     */
    @ComProperty(name = "WebPreFormattedTextToColumns", dispId = 0x753)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebPreFormattedTextToColumns(Boolean RHS);
            
    /**
     * <p>id(0x754)</p>
     */
    @ComProperty(name = "WebSingleBlockTextImport", dispId = 0x754)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebSingleBlockTextImport(VARIANT RHS);
            
    /**
     * <p>id(0x754)</p>
     */
    @ComProperty(name = "WebSingleBlockTextImport", dispId = 0x754)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebSingleBlockTextImport(Boolean RHS);
            
    /**
     * <p>id(0x755)</p>
     */
    @ComProperty(name = "WebDisableDateRecognition", dispId = 0x755)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebDisableDateRecognition(VARIANT RHS);
            
    /**
     * <p>id(0x755)</p>
     */
    @ComProperty(name = "WebDisableDateRecognition", dispId = 0x755)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebDisableDateRecognition(Boolean RHS);
            
    /**
     * <p>id(0x756)</p>
     */
    @ComProperty(name = "WebConsecutiveDelimitersAsOne", dispId = 0x756)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebConsecutiveDelimitersAsOne(VARIANT RHS);
            
    /**
     * <p>id(0x756)</p>
     */
    @ComProperty(name = "WebConsecutiveDelimitersAsOne", dispId = 0x756)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebConsecutiveDelimitersAsOne(Boolean RHS);
            
    /**
     * <p>id(0x872)</p>
     */
    @ComProperty(name = "WebDisableRedirections", dispId = 0x872)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebDisableRedirections(VARIANT RHS);
            
    /**
     * <p>id(0x872)</p>
     */
    @ComProperty(name = "WebDisableRedirections", dispId = 0x872)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebDisableRedirections(Boolean RHS);
            
    /**
     * <p>id(0x873)</p>
     */
    @ComProperty(name = "EditWebPage", dispId = 0x873)
    com.sun.jna.platform.win32.WinNT.HRESULT getEditWebPage(VARIANT RHS);
            
    /**
     * <p>id(0x873)</p>
     */
    @ComProperty(name = "EditWebPage", dispId = 0x873)
    com.sun.jna.platform.win32.WinNT.HRESULT setEditWebPage(Object RHS);
            
    /**
     * <p>id(0x81f)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceConnectionFile(VARIANT RHS);
            
    /**
     * <p>id(0x81f)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceConnectionFile(String RHS);
            
    /**
     * <p>id(0x820)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceDataFile(VARIANT RHS);
            
    /**
     * <p>id(0x820)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceDataFile(String RHS);
            
    /**
     * <p>id(0x821)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT getRobustConnect(VARIANT RHS);
            
    /**
     * <p>id(0x821)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT setRobustConnect(XlRobustConnect RHS);
            
    /**
     * <p>id(0x874)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTrailingMinusNumbers(VARIANT RHS);
            
    /**
     * <p>id(0x874)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTrailingMinusNumbers(Boolean RHS);
            
    /**
     * <p>id(0x822)</p>
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    com.sun.jna.platform.win32.WinNT.HRESULT SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x8d1)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getListObject(VARIANT RHS);
            
    /**
     * <p>id(0x8c5)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileVisualLayout(VARIANT RHS);
            
    /**
     * <p>id(0x8c5)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileVisualLayout(XlTextVisualLayoutType RHS);
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookConnection(VARIANT RHS);
            
    /**
     * <p>id(0x370)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    com.sun.jna.platform.win32.WinNT.HRESULT getSort(VARIANT RHS);
            
    
}