
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
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x630)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FieldNames", dispId = 0x630)
    com.sun.jna.platform.win32.WinNT.HRESULT getFieldNames(VARIANT RHS);
            
    /**
     * <p>id(0x630)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "FieldNames", dispId = 0x630)
    com.sun.jna.platform.win32.WinNT.HRESULT setFieldNames(Boolean RHS);
            
    /**
     * <p>id(0x631)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowNumbers(VARIANT RHS);
            
    /**
     * <p>id(0x631)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowNumbers(Boolean RHS);
            
    /**
     * <p>id(0x632)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FillAdjacentFormulas", dispId = 0x632)
    com.sun.jna.platform.win32.WinNT.HRESULT getFillAdjacentFormulas(VARIANT RHS);
            
    /**
     * <p>id(0x632)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "FillAdjacentFormulas", dispId = 0x632)
    com.sun.jna.platform.win32.WinNT.HRESULT setFillAdjacentFormulas(Boolean RHS);
            
    /**
     * <p>id(0x2b7)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasAutoFormat(VARIANT RHS);
            
    /**
     * <p>id(0x2b7)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasAutoFormat(Boolean RHS);
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshOnFileOpen(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshOnFileOpen(Boolean RHS);
            
    /**
     * <p>id(0x633)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Refreshing", dispId = 0x633)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshing(VARIANT RHS);
            
    /**
     * <p>id(0x634)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FetchedRowOverflow", dispId = 0x634)
    com.sun.jna.platform.win32.WinNT.HRESULT getFetchedRowOverflow(VARIANT RHS);
            
    /**
     * <p>id(0x593)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackgroundQuery(VARIANT RHS);
            
    /**
     * <p>id(0x593)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackgroundQuery(Boolean RHS);
            
    /**
     * <p>id(0x635)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "CancelRefresh", dispId = 0x635)
    com.sun.jna.platform.win32.WinNT.HRESULT CancelRefresh();
            
    /**
     * <p>id(0x636)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code XlCellInsertionMode}
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshStyle(VARIANT RHS);
            
    /**
     * <p>id(0x636)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code XlCellInsertionMode}
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshStyle(XlCellInsertionMode RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableRefresh(Boolean RHS);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSavePassword(VARIANT RHS);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSavePassword(Boolean RHS);
            
    /**
     * <p>id(0x2a9)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Destination", dispId = 0x2a9)
    com.sun.jna.platform.win32.WinNT.HRESULT getDestination(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnection(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT setConnection(Object RHS);
            
    /**
     * <p>id(0x5c8)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    com.sun.jna.platform.win32.WinNT.HRESULT getSql(VARIANT RHS);
            
    /**
     * <p>id(0x5c8)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    com.sun.jna.platform.win32.WinNT.HRESULT setSql(Object RHS);
            
    /**
     * <p>id(0x637)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "PostText", dispId = 0x637)
    com.sun.jna.platform.win32.WinNT.HRESULT getPostText(VARIANT RHS);
            
    /**
     * <p>id(0x637)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "PostText", dispId = 0x637)
    com.sun.jna.platform.win32.WinNT.HRESULT setPostText(String RHS);
            
    /**
     * <p>id(0x638)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "ResultRange", dispId = 0x638)
    com.sun.jna.platform.win32.WinNT.HRESULT getResultRange(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(41)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(42)</p>
     * @param BackgroundQuery [in, optional] {@code Object}
     * @param RHS [out] {@code Boolean}
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh(Object BackgroundQuery,
            VARIANT RHS);
            
    /**
     * <p>id(0x639)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code Parameters}
     */
    @ComProperty(name = "Parameters", dispId = 0x639)
    com.sun.jna.platform.win32.WinNT.HRESULT getParameters(VARIANT RHS);
            
    /**
     * <p>id(0x48d)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecordset(VARIANT RHS);
            
    /**
     * <p>id(0x2b4)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    com.sun.jna.platform.win32.WinNT.HRESULT getSaveData(VARIANT RHS);
            
    /**
     * <p>id(0x2b4)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    com.sun.jna.platform.win32.WinNT.HRESULT setSaveData(Boolean RHS);
            
    /**
     * <p>id(0x63a)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TablesOnlyFromHTML", dispId = 0x63a)
    com.sun.jna.platform.win32.WinNT.HRESULT getTablesOnlyFromHTML(VARIANT RHS);
            
    /**
     * <p>id(0x63a)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TablesOnlyFromHTML", dispId = 0x63a)
    com.sun.jna.platform.win32.WinNT.HRESULT setTablesOnlyFromHTML(Boolean RHS);
            
    /**
     * <p>id(0x63b)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableEditing(VARIANT RHS);
            
    /**
     * <p>id(0x63b)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableEditing(Boolean RHS);
            
    /**
     * <p>id(0x73f)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFilePlatform(VARIANT RHS);
            
    /**
     * <p>id(0x73f)</p>
     * <p>vtableId(53)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFilePlatform(Integer RHS);
            
    /**
     * <p>id(0x740)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileStartRow(VARIANT RHS);
            
    /**
     * <p>id(0x740)</p>
     * <p>vtableId(55)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileStartRow(Integer RHS);
            
    /**
     * <p>id(0x741)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code XlTextParsingType}
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileParseType(VARIANT RHS);
            
    /**
     * <p>id(0x741)</p>
     * <p>vtableId(57)</p>
     * @param RHS [in] {@code XlTextParsingType}
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileParseType(XlTextParsingType RHS);
            
    /**
     * <p>id(0x742)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code XlTextQualifier}
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTextQualifier(VARIANT RHS);
            
    /**
     * <p>id(0x742)</p>
     * <p>vtableId(59)</p>
     * @param RHS [in] {@code XlTextQualifier}
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTextQualifier(XlTextQualifier RHS);
            
    /**
     * <p>id(0x743)</p>
     * <p>vtableId(60)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileConsecutiveDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x743)</p>
     * <p>vtableId(61)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileConsecutiveDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x744)</p>
     * <p>vtableId(62)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTabDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x744)</p>
     * <p>vtableId(63)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTabDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x745)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileSemicolonDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x745)</p>
     * <p>vtableId(65)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileSemicolonDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x746)</p>
     * <p>vtableId(66)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileCommaDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x746)</p>
     * <p>vtableId(67)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileCommaDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x747)</p>
     * <p>vtableId(68)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileSpaceDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x747)</p>
     * <p>vtableId(69)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileSpaceDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x748)</p>
     * <p>vtableId(70)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileOtherDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x748)</p>
     * <p>vtableId(71)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileOtherDelimiter(String RHS);
            
    /**
     * <p>id(0x749)</p>
     * <p>vtableId(72)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileColumnDataTypes(VARIANT RHS);
            
    /**
     * <p>id(0x749)</p>
     * <p>vtableId(73)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileColumnDataTypes(Object RHS);
            
    /**
     * <p>id(0x74a)</p>
     * <p>vtableId(74)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileFixedColumnWidths(VARIANT RHS);
            
    /**
     * <p>id(0x74a)</p>
     * <p>vtableId(75)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileFixedColumnWidths(Object RHS);
            
    /**
     * <p>id(0x74b)</p>
     * <p>vtableId(76)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveColumnInfo(VARIANT RHS);
            
    /**
     * <p>id(0x74b)</p>
     * <p>vtableId(77)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveColumnInfo(Boolean RHS);
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(78)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveFormatting(VARIANT RHS);
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(79)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveFormatting(Boolean RHS);
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(80)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    com.sun.jna.platform.win32.WinNT.HRESULT getAdjustColumnWidth(VARIANT RHS);
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(81)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    com.sun.jna.platform.win32.WinNT.HRESULT setAdjustColumnWidth(Boolean RHS);
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(82)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandText(VARIANT RHS);
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(83)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandText(Object RHS);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(84)</p>
     * @param RHS [out] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandType(VARIANT RHS);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(85)</p>
     * @param RHS [in] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandType(XlCmdType RHS);
            
    /**
     * <p>id(0x74d)</p>
     * <p>vtableId(86)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFilePromptOnRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x74d)</p>
     * <p>vtableId(87)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFilePromptOnRefresh(Boolean RHS);
            
    /**
     * <p>id(0x727)</p>
     * <p>vtableId(88)</p>
     * @param RHS [out] {@code XlQueryType}
     */
    @ComProperty(name = "QueryType", dispId = 0x727)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryType(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(89)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaintainConnection(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(90)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaintainConnection(Boolean RHS);
            
    /**
     * <p>id(0x74e)</p>
     * <p>vtableId(91)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileDecimalSeparator(VARIANT RHS);
            
    /**
     * <p>id(0x74e)</p>
     * <p>vtableId(92)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileDecimalSeparator(String RHS);
            
    /**
     * <p>id(0x74f)</p>
     * <p>vtableId(93)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileThousandsSeparator(VARIANT RHS);
            
    /**
     * <p>id(0x74f)</p>
     * <p>vtableId(94)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileThousandsSeparator(String RHS);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(95)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshPeriod(VARIANT RHS);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(96)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshPeriod(Integer RHS);
            
    /**
     * <p>id(0x72a)</p>
     * <p>vtableId(97)</p>
     */
    @ComMethod(name = "ResetTimer", dispId = 0x72a)
    com.sun.jna.platform.win32.WinNT.HRESULT ResetTimer();
            
    /**
     * <p>id(0x750)</p>
     * <p>vtableId(98)</p>
     * @param RHS [out] {@code XlWebSelectionType}
     */
    @ComProperty(name = "WebSelectionType", dispId = 0x750)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebSelectionType(VARIANT RHS);
            
    /**
     * <p>id(0x750)</p>
     * <p>vtableId(99)</p>
     * @param RHS [in] {@code XlWebSelectionType}
     */
    @ComProperty(name = "WebSelectionType", dispId = 0x750)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebSelectionType(XlWebSelectionType RHS);
            
    /**
     * <p>id(0x751)</p>
     * <p>vtableId(100)</p>
     * @param RHS [out] {@code XlWebFormatting}
     */
    @ComProperty(name = "WebFormatting", dispId = 0x751)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebFormatting(VARIANT RHS);
            
    /**
     * <p>id(0x751)</p>
     * <p>vtableId(101)</p>
     * @param RHS [in] {@code XlWebFormatting}
     */
    @ComProperty(name = "WebFormatting", dispId = 0x751)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebFormatting(XlWebFormatting RHS);
            
    /**
     * <p>id(0x752)</p>
     * <p>vtableId(102)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "WebTables", dispId = 0x752)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebTables(VARIANT RHS);
            
    /**
     * <p>id(0x752)</p>
     * <p>vtableId(103)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "WebTables", dispId = 0x752)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebTables(String RHS);
            
    /**
     * <p>id(0x753)</p>
     * <p>vtableId(104)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "WebPreFormattedTextToColumns", dispId = 0x753)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebPreFormattedTextToColumns(VARIANT RHS);
            
    /**
     * <p>id(0x753)</p>
     * <p>vtableId(105)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "WebPreFormattedTextToColumns", dispId = 0x753)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebPreFormattedTextToColumns(Boolean RHS);
            
    /**
     * <p>id(0x754)</p>
     * <p>vtableId(106)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "WebSingleBlockTextImport", dispId = 0x754)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebSingleBlockTextImport(VARIANT RHS);
            
    /**
     * <p>id(0x754)</p>
     * <p>vtableId(107)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "WebSingleBlockTextImport", dispId = 0x754)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebSingleBlockTextImport(Boolean RHS);
            
    /**
     * <p>id(0x755)</p>
     * <p>vtableId(108)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "WebDisableDateRecognition", dispId = 0x755)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebDisableDateRecognition(VARIANT RHS);
            
    /**
     * <p>id(0x755)</p>
     * <p>vtableId(109)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "WebDisableDateRecognition", dispId = 0x755)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebDisableDateRecognition(Boolean RHS);
            
    /**
     * <p>id(0x756)</p>
     * <p>vtableId(110)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "WebConsecutiveDelimitersAsOne", dispId = 0x756)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebConsecutiveDelimitersAsOne(VARIANT RHS);
            
    /**
     * <p>id(0x756)</p>
     * <p>vtableId(111)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "WebConsecutiveDelimitersAsOne", dispId = 0x756)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebConsecutiveDelimitersAsOne(Boolean RHS);
            
    /**
     * <p>id(0x872)</p>
     * <p>vtableId(112)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "WebDisableRedirections", dispId = 0x872)
    com.sun.jna.platform.win32.WinNT.HRESULT getWebDisableRedirections(VARIANT RHS);
            
    /**
     * <p>id(0x872)</p>
     * <p>vtableId(113)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "WebDisableRedirections", dispId = 0x872)
    com.sun.jna.platform.win32.WinNT.HRESULT setWebDisableRedirections(Boolean RHS);
            
    /**
     * <p>id(0x873)</p>
     * <p>vtableId(114)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "EditWebPage", dispId = 0x873)
    com.sun.jna.platform.win32.WinNT.HRESULT getEditWebPage(VARIANT RHS);
            
    /**
     * <p>id(0x873)</p>
     * <p>vtableId(115)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "EditWebPage", dispId = 0x873)
    com.sun.jna.platform.win32.WinNT.HRESULT setEditWebPage(Object RHS);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(116)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceConnectionFile(VARIANT RHS);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(117)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceConnectionFile(String RHS);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(118)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceDataFile(VARIANT RHS);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(119)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceDataFile(String RHS);
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(120)</p>
     * @param RHS [out] {@code XlRobustConnect}
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT getRobustConnect(VARIANT RHS);
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(121)</p>
     * @param RHS [in] {@code XlRobustConnect}
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT setRobustConnect(XlRobustConnect RHS);
            
    /**
     * <p>id(0x874)</p>
     * <p>vtableId(122)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTrailingMinusNumbers(VARIANT RHS);
            
    /**
     * <p>id(0x874)</p>
     * <p>vtableId(123)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTrailingMinusNumbers(Boolean RHS);
            
    /**
     * <p>id(0x822)</p>
     * <p>vtableId(124)</p>
     * @param ODCFileName [in] {@code String}
     * @param Description [in, optional] {@code Object}
     * @param Keywords [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    com.sun.jna.platform.win32.WinNT.HRESULT SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x8d1)</p>
     * <p>vtableId(125)</p>
     * @param RHS [out] {@code ListObject}
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getListObject(VARIANT RHS);
            
    /**
     * <p>id(0x8c5)</p>
     * <p>vtableId(126)</p>
     * @param RHS [out] {@code XlTextVisualLayoutType}
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileVisualLayout(VARIANT RHS);
            
    /**
     * <p>id(0x8c5)</p>
     * <p>vtableId(127)</p>
     * @param RHS [in] {@code XlTextVisualLayoutType}
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileVisualLayout(XlTextVisualLayoutType RHS);
            
    /**
     * <p>id(0x9f0)</p>
     * <p>vtableId(128)</p>
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookConnection(VARIANT RHS);
            
    /**
     * <p>id(0x370)</p>
     * <p>vtableId(129)</p>
     * @param RHS [out] {@code Sort}
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    com.sun.jna.platform.win32.WinNT.HRESULT getSort(VARIANT RHS);
            
    
}