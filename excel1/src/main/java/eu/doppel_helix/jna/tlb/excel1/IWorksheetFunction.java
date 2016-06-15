
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020845-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020845-0001-0000-C000-000000000046}")
public interface IWorksheetFunction extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa9)</p>
     */
    @ComMethod(name = "_WSFunction", dispId = 0xa9)
    com.sun.jna.platform.win32.WinNT.HRESULT _WSFunction(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4000)</p>
     */
    @ComMethod(name = "Count", dispId = 0x4000)
    com.sun.jna.platform.win32.WinNT.HRESULT Count(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4002)</p>
     */
    @ComMethod(name = "IsNA", dispId = 0x4002)
    com.sun.jna.platform.win32.WinNT.HRESULT IsNA(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4003)</p>
     */
    @ComMethod(name = "IsError", dispId = 0x4003)
    com.sun.jna.platform.win32.WinNT.HRESULT IsError(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4004)</p>
     */
    @ComMethod(name = "Sum", dispId = 0x4004)
    com.sun.jna.platform.win32.WinNT.HRESULT Sum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4005)</p>
     */
    @ComMethod(name = "Average", dispId = 0x4005)
    com.sun.jna.platform.win32.WinNT.HRESULT Average(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4006)</p>
     */
    @ComMethod(name = "Min", dispId = 0x4006)
    com.sun.jna.platform.win32.WinNT.HRESULT Min(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4007)</p>
     */
    @ComMethod(name = "Max", dispId = 0x4007)
    com.sun.jna.platform.win32.WinNT.HRESULT Max(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x400b)</p>
     */
    @ComMethod(name = "Npv", dispId = 0x400b)
    com.sun.jna.platform.win32.WinNT.HRESULT Npv(Double Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x400c)</p>
     */
    @ComMethod(name = "StDev", dispId = 0x400c)
    com.sun.jna.platform.win32.WinNT.HRESULT StDev(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x400d)</p>
     */
    @ComMethod(name = "Dollar", dispId = 0x400d)
    com.sun.jna.platform.win32.WinNT.HRESULT Dollar(Double Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x400e)</p>
     */
    @ComMethod(name = "Fixed", dispId = 0x400e)
    com.sun.jna.platform.win32.WinNT.HRESULT Fixed(Double Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4013)</p>
     */
    @ComMethod(name = "Pi", dispId = 0x4013)
    com.sun.jna.platform.win32.WinNT.HRESULT Pi(VARIANT RHS);
            
    /**
     * <p>id(0x4016)</p>
     */
    @ComMethod(name = "Ln", dispId = 0x4016)
    com.sun.jna.platform.win32.WinNT.HRESULT Ln(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4017)</p>
     */
    @ComMethod(name = "Log10", dispId = 0x4017)
    com.sun.jna.platform.win32.WinNT.HRESULT Log10(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x401b)</p>
     */
    @ComMethod(name = "Round", dispId = 0x401b)
    com.sun.jna.platform.win32.WinNT.HRESULT Round(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x401c)</p>
     */
    @ComMethod(name = "Lookup", dispId = 0x401c)
    com.sun.jna.platform.win32.WinNT.HRESULT Lookup(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x401d)</p>
     */
    @ComMethod(name = "Index", dispId = 0x401d)
    com.sun.jna.platform.win32.WinNT.HRESULT Index(Object Arg1,
            Double Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x401e)</p>
     */
    @ComMethod(name = "Rept", dispId = 0x401e)
    com.sun.jna.platform.win32.WinNT.HRESULT Rept(String Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4024)</p>
     */
    @ComMethod(name = "And", dispId = 0x4024)
    com.sun.jna.platform.win32.WinNT.HRESULT And(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4025)</p>
     */
    @ComMethod(name = "Or", dispId = 0x4025)
    com.sun.jna.platform.win32.WinNT.HRESULT Or(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4028)</p>
     */
    @ComMethod(name = "DCount", dispId = 0x4028)
    com.sun.jna.platform.win32.WinNT.HRESULT DCount(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4029)</p>
     */
    @ComMethod(name = "DSum", dispId = 0x4029)
    com.sun.jna.platform.win32.WinNT.HRESULT DSum(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x402a)</p>
     */
    @ComMethod(name = "DAverage", dispId = 0x402a)
    com.sun.jna.platform.win32.WinNT.HRESULT DAverage(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x402b)</p>
     */
    @ComMethod(name = "DMin", dispId = 0x402b)
    com.sun.jna.platform.win32.WinNT.HRESULT DMin(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x402c)</p>
     */
    @ComMethod(name = "DMax", dispId = 0x402c)
    com.sun.jna.platform.win32.WinNT.HRESULT DMax(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x402d)</p>
     */
    @ComMethod(name = "DStDev", dispId = 0x402d)
    com.sun.jna.platform.win32.WinNT.HRESULT DStDev(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x402e)</p>
     */
    @ComMethod(name = "Var", dispId = 0x402e)
    com.sun.jna.platform.win32.WinNT.HRESULT Var(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x402f)</p>
     */
    @ComMethod(name = "DVar", dispId = 0x402f)
    com.sun.jna.platform.win32.WinNT.HRESULT DVar(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4030)</p>
     */
    @ComMethod(name = "Text", dispId = 0x4030)
    com.sun.jna.platform.win32.WinNT.HRESULT Text(Object Arg1,
            String Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4031)</p>
     */
    @ComMethod(name = "LinEst", dispId = 0x4031)
    com.sun.jna.platform.win32.WinNT.HRESULT LinEst(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4032)</p>
     */
    @ComMethod(name = "Trend", dispId = 0x4032)
    com.sun.jna.platform.win32.WinNT.HRESULT Trend(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4033)</p>
     */
    @ComMethod(name = "LogEst", dispId = 0x4033)
    com.sun.jna.platform.win32.WinNT.HRESULT LogEst(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4034)</p>
     */
    @ComMethod(name = "Growth", dispId = 0x4034)
    com.sun.jna.platform.win32.WinNT.HRESULT Growth(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4038)</p>
     */
    @ComMethod(name = "Pv", dispId = 0x4038)
    com.sun.jna.platform.win32.WinNT.HRESULT Pv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x4039)</p>
     */
    @ComMethod(name = "Fv", dispId = 0x4039)
    com.sun.jna.platform.win32.WinNT.HRESULT Fv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x403a)</p>
     */
    @ComMethod(name = "NPer", dispId = 0x403a)
    com.sun.jna.platform.win32.WinNT.HRESULT NPer(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x403b)</p>
     */
    @ComMethod(name = "Pmt", dispId = 0x403b)
    com.sun.jna.platform.win32.WinNT.HRESULT Pmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x403c)</p>
     */
    @ComMethod(name = "Rate", dispId = 0x403c)
    com.sun.jna.platform.win32.WinNT.HRESULT Rate(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x403d)</p>
     */
    @ComMethod(name = "MIrr", dispId = 0x403d)
    com.sun.jna.platform.win32.WinNT.HRESULT MIrr(Object Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x403e)</p>
     */
    @ComMethod(name = "Irr", dispId = 0x403e)
    com.sun.jna.platform.win32.WinNT.HRESULT Irr(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4040)</p>
     */
    @ComMethod(name = "Match", dispId = 0x4040)
    com.sun.jna.platform.win32.WinNT.HRESULT Match(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4046)</p>
     */
    @ComMethod(name = "Weekday", dispId = 0x4046)
    com.sun.jna.platform.win32.WinNT.HRESULT Weekday(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4052)</p>
     */
    @ComMethod(name = "Search", dispId = 0x4052)
    com.sun.jna.platform.win32.WinNT.HRESULT Search(String Arg1,
            String Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4053)</p>
     */
    @ComMethod(name = "Transpose", dispId = 0x4053)
    com.sun.jna.platform.win32.WinNT.HRESULT Transpose(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4061)</p>
     */
    @ComMethod(name = "Atan2", dispId = 0x4061)
    com.sun.jna.platform.win32.WinNT.HRESULT Atan2(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4062)</p>
     */
    @ComMethod(name = "Asin", dispId = 0x4062)
    com.sun.jna.platform.win32.WinNT.HRESULT Asin(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4063)</p>
     */
    @ComMethod(name = "Acos", dispId = 0x4063)
    com.sun.jna.platform.win32.WinNT.HRESULT Acos(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4064)</p>
     */
    @ComMethod(name = "Choose", dispId = 0x4064)
    com.sun.jna.platform.win32.WinNT.HRESULT Choose(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4065)</p>
     */
    @ComMethod(name = "HLookup", dispId = 0x4065)
    com.sun.jna.platform.win32.WinNT.HRESULT HLookup(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4066)</p>
     */
    @ComMethod(name = "VLookup", dispId = 0x4066)
    com.sun.jna.platform.win32.WinNT.HRESULT VLookup(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x406d)</p>
     */
    @ComMethod(name = "Log", dispId = 0x406d)
    com.sun.jna.platform.win32.WinNT.HRESULT Log(Double Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4072)</p>
     */
    @ComMethod(name = "Proper", dispId = 0x4072)
    com.sun.jna.platform.win32.WinNT.HRESULT Proper(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4076)</p>
     */
    @ComMethod(name = "Trim", dispId = 0x4076)
    com.sun.jna.platform.win32.WinNT.HRESULT Trim(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4077)</p>
     */
    @ComMethod(name = "Replace", dispId = 0x4077)
    com.sun.jna.platform.win32.WinNT.HRESULT Replace(String Arg1,
            Double Arg2,
            Double Arg3,
            String Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4078)</p>
     */
    @ComMethod(name = "Substitute", dispId = 0x4078)
    com.sun.jna.platform.win32.WinNT.HRESULT Substitute(String Arg1,
            String Arg2,
            String Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x407c)</p>
     */
    @ComMethod(name = "Find", dispId = 0x407c)
    com.sun.jna.platform.win32.WinNT.HRESULT Find(String Arg1,
            String Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x407e)</p>
     */
    @ComMethod(name = "IsErr", dispId = 0x407e)
    com.sun.jna.platform.win32.WinNT.HRESULT IsErr(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x407f)</p>
     */
    @ComMethod(name = "IsText", dispId = 0x407f)
    com.sun.jna.platform.win32.WinNT.HRESULT IsText(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4080)</p>
     */
    @ComMethod(name = "IsNumber", dispId = 0x4080)
    com.sun.jna.platform.win32.WinNT.HRESULT IsNumber(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x408e)</p>
     */
    @ComMethod(name = "Sln", dispId = 0x408e)
    com.sun.jna.platform.win32.WinNT.HRESULT Sln(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x408f)</p>
     */
    @ComMethod(name = "Syd", dispId = 0x408f)
    com.sun.jna.platform.win32.WinNT.HRESULT Syd(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4090)</p>
     */
    @ComMethod(name = "Ddb", dispId = 0x4090)
    com.sun.jna.platform.win32.WinNT.HRESULT Ddb(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x40a2)</p>
     */
    @ComMethod(name = "Clean", dispId = 0x40a2)
    com.sun.jna.platform.win32.WinNT.HRESULT Clean(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40a3)</p>
     */
    @ComMethod(name = "MDeterm", dispId = 0x40a3)
    com.sun.jna.platform.win32.WinNT.HRESULT MDeterm(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40a4)</p>
     */
    @ComMethod(name = "MInverse", dispId = 0x40a4)
    com.sun.jna.platform.win32.WinNT.HRESULT MInverse(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40a5)</p>
     */
    @ComMethod(name = "MMult", dispId = 0x40a5)
    com.sun.jna.platform.win32.WinNT.HRESULT MMult(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x40a7)</p>
     */
    @ComMethod(name = "Ipmt", dispId = 0x40a7)
    com.sun.jna.platform.win32.WinNT.HRESULT Ipmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x40a8)</p>
     */
    @ComMethod(name = "Ppmt", dispId = 0x40a8)
    com.sun.jna.platform.win32.WinNT.HRESULT Ppmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x40a9)</p>
     */
    @ComMethod(name = "CountA", dispId = 0x40a9)
    com.sun.jna.platform.win32.WinNT.HRESULT CountA(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x40b7)</p>
     */
    @ComMethod(name = "Product", dispId = 0x40b7)
    com.sun.jna.platform.win32.WinNT.HRESULT Product(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x40b8)</p>
     */
    @ComMethod(name = "Fact", dispId = 0x40b8)
    com.sun.jna.platform.win32.WinNT.HRESULT Fact(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40bd)</p>
     */
    @ComMethod(name = "DProduct", dispId = 0x40bd)
    com.sun.jna.platform.win32.WinNT.HRESULT DProduct(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40be)</p>
     */
    @ComMethod(name = "IsNonText", dispId = 0x40be)
    com.sun.jna.platform.win32.WinNT.HRESULT IsNonText(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40c1)</p>
     */
    @ComMethod(name = "StDevP", dispId = 0x40c1)
    com.sun.jna.platform.win32.WinNT.HRESULT StDevP(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x40c2)</p>
     */
    @ComMethod(name = "VarP", dispId = 0x40c2)
    com.sun.jna.platform.win32.WinNT.HRESULT VarP(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x40c3)</p>
     */
    @ComMethod(name = "DStDevP", dispId = 0x40c3)
    com.sun.jna.platform.win32.WinNT.HRESULT DStDevP(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40c4)</p>
     */
    @ComMethod(name = "DVarP", dispId = 0x40c4)
    com.sun.jna.platform.win32.WinNT.HRESULT DVarP(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40c6)</p>
     */
    @ComMethod(name = "IsLogical", dispId = 0x40c6)
    com.sun.jna.platform.win32.WinNT.HRESULT IsLogical(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40c7)</p>
     */
    @ComMethod(name = "DCountA", dispId = 0x40c7)
    com.sun.jna.platform.win32.WinNT.HRESULT DCountA(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40cc)</p>
     */
    @ComMethod(name = "USDollar", dispId = 0x40cc)
    com.sun.jna.platform.win32.WinNT.HRESULT USDollar(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x40cd)</p>
     */
    @ComMethod(name = "FindB", dispId = 0x40cd)
    com.sun.jna.platform.win32.WinNT.HRESULT FindB(String Arg1,
            String Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40ce)</p>
     */
    @ComMethod(name = "SearchB", dispId = 0x40ce)
    com.sun.jna.platform.win32.WinNT.HRESULT SearchB(String Arg1,
            String Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40cf)</p>
     */
    @ComMethod(name = "ReplaceB", dispId = 0x40cf)
    com.sun.jna.platform.win32.WinNT.HRESULT ReplaceB(String Arg1,
            Double Arg2,
            Double Arg3,
            String Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x40d4)</p>
     */
    @ComMethod(name = "RoundUp", dispId = 0x40d4)
    com.sun.jna.platform.win32.WinNT.HRESULT RoundUp(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x40d5)</p>
     */
    @ComMethod(name = "RoundDown", dispId = 0x40d5)
    com.sun.jna.platform.win32.WinNT.HRESULT RoundDown(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x40d8)</p>
     */
    @ComMethod(name = "Rank", dispId = 0x40d8)
    com.sun.jna.platform.win32.WinNT.HRESULT Rank(Double Arg1,
            Range Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40dc)</p>
     */
    @ComMethod(name = "Days360", dispId = 0x40dc)
    com.sun.jna.platform.win32.WinNT.HRESULT Days360(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40de)</p>
     */
    @ComMethod(name = "Vdb", dispId = 0x40de)
    com.sun.jna.platform.win32.WinNT.HRESULT Vdb(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Double Arg5,
            Object Arg6,
            Object Arg7,
            VARIANT RHS);
            
    /**
     * <p>id(0x40e3)</p>
     */
    @ComMethod(name = "Median", dispId = 0x40e3)
    com.sun.jna.platform.win32.WinNT.HRESULT Median(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x40e4)</p>
     */
    @ComMethod(name = "SumProduct", dispId = 0x40e4)
    com.sun.jna.platform.win32.WinNT.HRESULT SumProduct(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x40e5)</p>
     */
    @ComMethod(name = "Sinh", dispId = 0x40e5)
    com.sun.jna.platform.win32.WinNT.HRESULT Sinh(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40e6)</p>
     */
    @ComMethod(name = "Cosh", dispId = 0x40e6)
    com.sun.jna.platform.win32.WinNT.HRESULT Cosh(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40e7)</p>
     */
    @ComMethod(name = "Tanh", dispId = 0x40e7)
    com.sun.jna.platform.win32.WinNT.HRESULT Tanh(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40e8)</p>
     */
    @ComMethod(name = "Asinh", dispId = 0x40e8)
    com.sun.jna.platform.win32.WinNT.HRESULT Asinh(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40e9)</p>
     */
    @ComMethod(name = "Acosh", dispId = 0x40e9)
    com.sun.jna.platform.win32.WinNT.HRESULT Acosh(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40ea)</p>
     */
    @ComMethod(name = "Atanh", dispId = 0x40ea)
    com.sun.jna.platform.win32.WinNT.HRESULT Atanh(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40eb)</p>
     */
    @ComMethod(name = "DGet", dispId = 0x40eb)
    com.sun.jna.platform.win32.WinNT.HRESULT DGet(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x40f7)</p>
     */
    @ComMethod(name = "Db", dispId = 0x40f7)
    com.sun.jna.platform.win32.WinNT.HRESULT Db(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x40fc)</p>
     */
    @ComMethod(name = "Frequency", dispId = 0x40fc)
    com.sun.jna.platform.win32.WinNT.HRESULT Frequency(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x410d)</p>
     */
    @ComMethod(name = "AveDev", dispId = 0x410d)
    com.sun.jna.platform.win32.WinNT.HRESULT AveDev(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x410e)</p>
     */
    @ComMethod(name = "BetaDist", dispId = 0x410e)
    com.sun.jna.platform.win32.WinNT.HRESULT BetaDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x410f)</p>
     */
    @ComMethod(name = "GammaLn", dispId = 0x410f)
    com.sun.jna.platform.win32.WinNT.HRESULT GammaLn(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4110)</p>
     */
    @ComMethod(name = "BetaInv", dispId = 0x4110)
    com.sun.jna.platform.win32.WinNT.HRESULT BetaInv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x4111)</p>
     */
    @ComMethod(name = "BinomDist", dispId = 0x4111)
    com.sun.jna.platform.win32.WinNT.HRESULT BinomDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4112)</p>
     */
    @ComMethod(name = "ChiDist", dispId = 0x4112)
    com.sun.jna.platform.win32.WinNT.HRESULT ChiDist(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4113)</p>
     */
    @ComMethod(name = "ChiInv", dispId = 0x4113)
    com.sun.jna.platform.win32.WinNT.HRESULT ChiInv(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4114)</p>
     */
    @ComMethod(name = "Combin", dispId = 0x4114)
    com.sun.jna.platform.win32.WinNT.HRESULT Combin(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4115)</p>
     */
    @ComMethod(name = "Confidence", dispId = 0x4115)
    com.sun.jna.platform.win32.WinNT.HRESULT Confidence(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4116)</p>
     */
    @ComMethod(name = "CritBinom", dispId = 0x4116)
    com.sun.jna.platform.win32.WinNT.HRESULT CritBinom(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4117)</p>
     */
    @ComMethod(name = "Even", dispId = 0x4117)
    com.sun.jna.platform.win32.WinNT.HRESULT Even(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4118)</p>
     */
    @ComMethod(name = "ExponDist", dispId = 0x4118)
    com.sun.jna.platform.win32.WinNT.HRESULT ExponDist(Double Arg1,
            Double Arg2,
            Boolean Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4119)</p>
     */
    @ComMethod(name = "FDist", dispId = 0x4119)
    com.sun.jna.platform.win32.WinNT.HRESULT FDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x411a)</p>
     */
    @ComMethod(name = "FInv", dispId = 0x411a)
    com.sun.jna.platform.win32.WinNT.HRESULT FInv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x411b)</p>
     */
    @ComMethod(name = "Fisher", dispId = 0x411b)
    com.sun.jna.platform.win32.WinNT.HRESULT Fisher(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x411c)</p>
     */
    @ComMethod(name = "FisherInv", dispId = 0x411c)
    com.sun.jna.platform.win32.WinNT.HRESULT FisherInv(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x411d)</p>
     */
    @ComMethod(name = "Floor", dispId = 0x411d)
    com.sun.jna.platform.win32.WinNT.HRESULT Floor(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x411e)</p>
     */
    @ComMethod(name = "GammaDist", dispId = 0x411e)
    com.sun.jna.platform.win32.WinNT.HRESULT GammaDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x411f)</p>
     */
    @ComMethod(name = "GammaInv", dispId = 0x411f)
    com.sun.jna.platform.win32.WinNT.HRESULT GammaInv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4120)</p>
     */
    @ComMethod(name = "Ceiling", dispId = 0x4120)
    com.sun.jna.platform.win32.WinNT.HRESULT Ceiling(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4121)</p>
     */
    @ComMethod(name = "HypGeomDist", dispId = 0x4121)
    com.sun.jna.platform.win32.WinNT.HRESULT HypGeomDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4122)</p>
     */
    @ComMethod(name = "LogNormDist", dispId = 0x4122)
    com.sun.jna.platform.win32.WinNT.HRESULT LogNormDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4123)</p>
     */
    @ComMethod(name = "LogInv", dispId = 0x4123)
    com.sun.jna.platform.win32.WinNT.HRESULT LogInv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4124)</p>
     */
    @ComMethod(name = "NegBinomDist", dispId = 0x4124)
    com.sun.jna.platform.win32.WinNT.HRESULT NegBinomDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4125)</p>
     */
    @ComMethod(name = "NormDist", dispId = 0x4125)
    com.sun.jna.platform.win32.WinNT.HRESULT NormDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4126)</p>
     */
    @ComMethod(name = "NormSDist", dispId = 0x4126)
    com.sun.jna.platform.win32.WinNT.HRESULT NormSDist(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4127)</p>
     */
    @ComMethod(name = "NormInv", dispId = 0x4127)
    com.sun.jna.platform.win32.WinNT.HRESULT NormInv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4128)</p>
     */
    @ComMethod(name = "NormSInv", dispId = 0x4128)
    com.sun.jna.platform.win32.WinNT.HRESULT NormSInv(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4129)</p>
     */
    @ComMethod(name = "Standardize", dispId = 0x4129)
    com.sun.jna.platform.win32.WinNT.HRESULT Standardize(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x412a)</p>
     */
    @ComMethod(name = "Odd", dispId = 0x412a)
    com.sun.jna.platform.win32.WinNT.HRESULT Odd(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x412b)</p>
     */
    @ComMethod(name = "Permut", dispId = 0x412b)
    com.sun.jna.platform.win32.WinNT.HRESULT Permut(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x412c)</p>
     */
    @ComMethod(name = "Poisson", dispId = 0x412c)
    com.sun.jna.platform.win32.WinNT.HRESULT Poisson(Double Arg1,
            Double Arg2,
            Boolean Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x412d)</p>
     */
    @ComMethod(name = "TDist", dispId = 0x412d)
    com.sun.jna.platform.win32.WinNT.HRESULT TDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x412e)</p>
     */
    @ComMethod(name = "Weibull", dispId = 0x412e)
    com.sun.jna.platform.win32.WinNT.HRESULT Weibull(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x412f)</p>
     */
    @ComMethod(name = "SumXMY2", dispId = 0x412f)
    com.sun.jna.platform.win32.WinNT.HRESULT SumXMY2(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4130)</p>
     */
    @ComMethod(name = "SumX2MY2", dispId = 0x4130)
    com.sun.jna.platform.win32.WinNT.HRESULT SumX2MY2(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4131)</p>
     */
    @ComMethod(name = "SumX2PY2", dispId = 0x4131)
    com.sun.jna.platform.win32.WinNT.HRESULT SumX2PY2(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4132)</p>
     */
    @ComMethod(name = "ChiTest", dispId = 0x4132)
    com.sun.jna.platform.win32.WinNT.HRESULT ChiTest(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4133)</p>
     */
    @ComMethod(name = "Correl", dispId = 0x4133)
    com.sun.jna.platform.win32.WinNT.HRESULT Correl(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4134)</p>
     */
    @ComMethod(name = "Covar", dispId = 0x4134)
    com.sun.jna.platform.win32.WinNT.HRESULT Covar(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4135)</p>
     */
    @ComMethod(name = "Forecast", dispId = 0x4135)
    com.sun.jna.platform.win32.WinNT.HRESULT Forecast(Double Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4136)</p>
     */
    @ComMethod(name = "FTest", dispId = 0x4136)
    com.sun.jna.platform.win32.WinNT.HRESULT FTest(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4137)</p>
     */
    @ComMethod(name = "Intercept", dispId = 0x4137)
    com.sun.jna.platform.win32.WinNT.HRESULT Intercept(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4138)</p>
     */
    @ComMethod(name = "Pearson", dispId = 0x4138)
    com.sun.jna.platform.win32.WinNT.HRESULT Pearson(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4139)</p>
     */
    @ComMethod(name = "RSq", dispId = 0x4139)
    com.sun.jna.platform.win32.WinNT.HRESULT RSq(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x413a)</p>
     */
    @ComMethod(name = "StEyx", dispId = 0x413a)
    com.sun.jna.platform.win32.WinNT.HRESULT StEyx(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x413b)</p>
     */
    @ComMethod(name = "Slope", dispId = 0x413b)
    com.sun.jna.platform.win32.WinNT.HRESULT Slope(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x413c)</p>
     */
    @ComMethod(name = "TTest", dispId = 0x413c)
    com.sun.jna.platform.win32.WinNT.HRESULT TTest(Object Arg1,
            Object Arg2,
            Double Arg3,
            Double Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x413d)</p>
     */
    @ComMethod(name = "Prob", dispId = 0x413d)
    com.sun.jna.platform.win32.WinNT.HRESULT Prob(Object Arg1,
            Object Arg2,
            Double Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x413e)</p>
     */
    @ComMethod(name = "DevSq", dispId = 0x413e)
    com.sun.jna.platform.win32.WinNT.HRESULT DevSq(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x413f)</p>
     */
    @ComMethod(name = "GeoMean", dispId = 0x413f)
    com.sun.jna.platform.win32.WinNT.HRESULT GeoMean(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4140)</p>
     */
    @ComMethod(name = "HarMean", dispId = 0x4140)
    com.sun.jna.platform.win32.WinNT.HRESULT HarMean(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4141)</p>
     */
    @ComMethod(name = "SumSq", dispId = 0x4141)
    com.sun.jna.platform.win32.WinNT.HRESULT SumSq(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4142)</p>
     */
    @ComMethod(name = "Kurt", dispId = 0x4142)
    com.sun.jna.platform.win32.WinNT.HRESULT Kurt(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4143)</p>
     */
    @ComMethod(name = "Skew", dispId = 0x4143)
    com.sun.jna.platform.win32.WinNT.HRESULT Skew(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4144)</p>
     */
    @ComMethod(name = "ZTest", dispId = 0x4144)
    com.sun.jna.platform.win32.WinNT.HRESULT ZTest(Object Arg1,
            Double Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4145)</p>
     */
    @ComMethod(name = "Large", dispId = 0x4145)
    com.sun.jna.platform.win32.WinNT.HRESULT Large(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4146)</p>
     */
    @ComMethod(name = "Small", dispId = 0x4146)
    com.sun.jna.platform.win32.WinNT.HRESULT Small(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4147)</p>
     */
    @ComMethod(name = "Quartile", dispId = 0x4147)
    com.sun.jna.platform.win32.WinNT.HRESULT Quartile(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4148)</p>
     */
    @ComMethod(name = "Percentile", dispId = 0x4148)
    com.sun.jna.platform.win32.WinNT.HRESULT Percentile(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4149)</p>
     */
    @ComMethod(name = "PercentRank", dispId = 0x4149)
    com.sun.jna.platform.win32.WinNT.HRESULT PercentRank(Object Arg1,
            Double Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x414a)</p>
     */
    @ComMethod(name = "Mode", dispId = 0x414a)
    com.sun.jna.platform.win32.WinNT.HRESULT Mode(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x414b)</p>
     */
    @ComMethod(name = "TrimMean", dispId = 0x414b)
    com.sun.jna.platform.win32.WinNT.HRESULT TrimMean(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x414c)</p>
     */
    @ComMethod(name = "TInv", dispId = 0x414c)
    com.sun.jna.platform.win32.WinNT.HRESULT TInv(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4151)</p>
     */
    @ComMethod(name = "Power", dispId = 0x4151)
    com.sun.jna.platform.win32.WinNT.HRESULT Power(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4156)</p>
     */
    @ComMethod(name = "Radians", dispId = 0x4156)
    com.sun.jna.platform.win32.WinNT.HRESULT Radians(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4157)</p>
     */
    @ComMethod(name = "Degrees", dispId = 0x4157)
    com.sun.jna.platform.win32.WinNT.HRESULT Degrees(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4158)</p>
     */
    @ComMethod(name = "Subtotal", dispId = 0x4158)
    com.sun.jna.platform.win32.WinNT.HRESULT Subtotal(Double Arg1,
            Range Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4159)</p>
     */
    @ComMethod(name = "SumIf", dispId = 0x4159)
    com.sun.jna.platform.win32.WinNT.HRESULT SumIf(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x415a)</p>
     */
    @ComMethod(name = "CountIf", dispId = 0x415a)
    com.sun.jna.platform.win32.WinNT.HRESULT CountIf(Range Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x415b)</p>
     */
    @ComMethod(name = "CountBlank", dispId = 0x415b)
    com.sun.jna.platform.win32.WinNT.HRESULT CountBlank(Range Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x415e)</p>
     */
    @ComMethod(name = "Ispmt", dispId = 0x415e)
    com.sun.jna.platform.win32.WinNT.HRESULT Ispmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4162)</p>
     */
    @ComMethod(name = "Roman", dispId = 0x4162)
    com.sun.jna.platform.win32.WinNT.HRESULT Roman(Double Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x40d6)</p>
     */
    @ComMethod(name = "Asc", dispId = 0x40d6)
    com.sun.jna.platform.win32.WinNT.HRESULT Asc(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x40d7)</p>
     */
    @ComMethod(name = "Dbcs", dispId = 0x40d7)
    com.sun.jna.platform.win32.WinNT.HRESULT Dbcs(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4168)</p>
     */
    @ComMethod(name = "Phonetic", dispId = 0x4168)
    com.sun.jna.platform.win32.WinNT.HRESULT Phonetic(Range Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4170)</p>
     */
    @ComMethod(name = "BahtText", dispId = 0x4170)
    com.sun.jna.platform.win32.WinNT.HRESULT BahtText(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4171)</p>
     */
    @ComMethod(name = "ThaiDayOfWeek", dispId = 0x4171)
    com.sun.jna.platform.win32.WinNT.HRESULT ThaiDayOfWeek(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4172)</p>
     */
    @ComMethod(name = "ThaiDigit", dispId = 0x4172)
    com.sun.jna.platform.win32.WinNT.HRESULT ThaiDigit(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4173)</p>
     */
    @ComMethod(name = "ThaiMonthOfYear", dispId = 0x4173)
    com.sun.jna.platform.win32.WinNT.HRESULT ThaiMonthOfYear(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4174)</p>
     */
    @ComMethod(name = "ThaiNumSound", dispId = 0x4174)
    com.sun.jna.platform.win32.WinNT.HRESULT ThaiNumSound(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4175)</p>
     */
    @ComMethod(name = "ThaiNumString", dispId = 0x4175)
    com.sun.jna.platform.win32.WinNT.HRESULT ThaiNumString(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4176)</p>
     */
    @ComMethod(name = "ThaiStringLength", dispId = 0x4176)
    com.sun.jna.platform.win32.WinNT.HRESULT ThaiStringLength(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4177)</p>
     */
    @ComMethod(name = "IsThaiDigit", dispId = 0x4177)
    com.sun.jna.platform.win32.WinNT.HRESULT IsThaiDigit(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4178)</p>
     */
    @ComMethod(name = "RoundBahtDown", dispId = 0x4178)
    com.sun.jna.platform.win32.WinNT.HRESULT RoundBahtDown(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4179)</p>
     */
    @ComMethod(name = "RoundBahtUp", dispId = 0x4179)
    com.sun.jna.platform.win32.WinNT.HRESULT RoundBahtUp(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x417a)</p>
     */
    @ComMethod(name = "ThaiYear", dispId = 0x417a)
    com.sun.jna.platform.win32.WinNT.HRESULT ThaiYear(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x417b)</p>
     */
    @ComMethod(name = "RTD", dispId = 0x417b)
    com.sun.jna.platform.win32.WinNT.HRESULT RTD(Object progID,
            Object server,
            Object topic1,
            Object topic2,
            Object topic3,
            Object topic4,
            Object topic5,
            Object topic6,
            Object topic7,
            Object topic8,
            Object topic9,
            Object topic10,
            Object topic11,
            Object topic12,
            Object topic13,
            Object topic14,
            Object topic15,
            Object topic16,
            Object topic17,
            Object topic18,
            Object topic19,
            Object topic20,
            Object topic21,
            Object topic22,
            Object topic23,
            Object topic24,
            Object topic25,
            Object topic26,
            Object topic27,
            Object topic28,
            VARIANT RHS);
            
    /**
     * <p>id(0x4180)</p>
     */
    @ComMethod(name = "Hex2Bin", dispId = 0x4180)
    com.sun.jna.platform.win32.WinNT.HRESULT Hex2Bin(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4181)</p>
     */
    @ComMethod(name = "Hex2Dec", dispId = 0x4181)
    com.sun.jna.platform.win32.WinNT.HRESULT Hex2Dec(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4182)</p>
     */
    @ComMethod(name = "Hex2Oct", dispId = 0x4182)
    com.sun.jna.platform.win32.WinNT.HRESULT Hex2Oct(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4183)</p>
     */
    @ComMethod(name = "Dec2Bin", dispId = 0x4183)
    com.sun.jna.platform.win32.WinNT.HRESULT Dec2Bin(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4184)</p>
     */
    @ComMethod(name = "Dec2Hex", dispId = 0x4184)
    com.sun.jna.platform.win32.WinNT.HRESULT Dec2Hex(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4185)</p>
     */
    @ComMethod(name = "Dec2Oct", dispId = 0x4185)
    com.sun.jna.platform.win32.WinNT.HRESULT Dec2Oct(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4186)</p>
     */
    @ComMethod(name = "Oct2Bin", dispId = 0x4186)
    com.sun.jna.platform.win32.WinNT.HRESULT Oct2Bin(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4187)</p>
     */
    @ComMethod(name = "Oct2Hex", dispId = 0x4187)
    com.sun.jna.platform.win32.WinNT.HRESULT Oct2Hex(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4188)</p>
     */
    @ComMethod(name = "Oct2Dec", dispId = 0x4188)
    com.sun.jna.platform.win32.WinNT.HRESULT Oct2Dec(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4189)</p>
     */
    @ComMethod(name = "Bin2Dec", dispId = 0x4189)
    com.sun.jna.platform.win32.WinNT.HRESULT Bin2Dec(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x418a)</p>
     */
    @ComMethod(name = "Bin2Oct", dispId = 0x418a)
    com.sun.jna.platform.win32.WinNT.HRESULT Bin2Oct(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x418b)</p>
     */
    @ComMethod(name = "Bin2Hex", dispId = 0x418b)
    com.sun.jna.platform.win32.WinNT.HRESULT Bin2Hex(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x418c)</p>
     */
    @ComMethod(name = "ImSub", dispId = 0x418c)
    com.sun.jna.platform.win32.WinNT.HRESULT ImSub(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x418d)</p>
     */
    @ComMethod(name = "ImDiv", dispId = 0x418d)
    com.sun.jna.platform.win32.WinNT.HRESULT ImDiv(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x418e)</p>
     */
    @ComMethod(name = "ImPower", dispId = 0x418e)
    com.sun.jna.platform.win32.WinNT.HRESULT ImPower(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x418f)</p>
     */
    @ComMethod(name = "ImAbs", dispId = 0x418f)
    com.sun.jna.platform.win32.WinNT.HRESULT ImAbs(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4190)</p>
     */
    @ComMethod(name = "ImSqrt", dispId = 0x4190)
    com.sun.jna.platform.win32.WinNT.HRESULT ImSqrt(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4191)</p>
     */
    @ComMethod(name = "ImLn", dispId = 0x4191)
    com.sun.jna.platform.win32.WinNT.HRESULT ImLn(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4192)</p>
     */
    @ComMethod(name = "ImLog2", dispId = 0x4192)
    com.sun.jna.platform.win32.WinNT.HRESULT ImLog2(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4193)</p>
     */
    @ComMethod(name = "ImLog10", dispId = 0x4193)
    com.sun.jna.platform.win32.WinNT.HRESULT ImLog10(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4194)</p>
     */
    @ComMethod(name = "ImSin", dispId = 0x4194)
    com.sun.jna.platform.win32.WinNT.HRESULT ImSin(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4195)</p>
     */
    @ComMethod(name = "ImCos", dispId = 0x4195)
    com.sun.jna.platform.win32.WinNT.HRESULT ImCos(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4196)</p>
     */
    @ComMethod(name = "ImExp", dispId = 0x4196)
    com.sun.jna.platform.win32.WinNT.HRESULT ImExp(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4197)</p>
     */
    @ComMethod(name = "ImArgument", dispId = 0x4197)
    com.sun.jna.platform.win32.WinNT.HRESULT ImArgument(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4198)</p>
     */
    @ComMethod(name = "ImConjugate", dispId = 0x4198)
    com.sun.jna.platform.win32.WinNT.HRESULT ImConjugate(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4199)</p>
     */
    @ComMethod(name = "Imaginary", dispId = 0x4199)
    com.sun.jna.platform.win32.WinNT.HRESULT Imaginary(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x419a)</p>
     */
    @ComMethod(name = "ImReal", dispId = 0x419a)
    com.sun.jna.platform.win32.WinNT.HRESULT ImReal(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x419b)</p>
     */
    @ComMethod(name = "Complex", dispId = 0x419b)
    com.sun.jna.platform.win32.WinNT.HRESULT Complex(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x419c)</p>
     */
    @ComMethod(name = "ImSum", dispId = 0x419c)
    com.sun.jna.platform.win32.WinNT.HRESULT ImSum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x419d)</p>
     */
    @ComMethod(name = "ImProduct", dispId = 0x419d)
    com.sun.jna.platform.win32.WinNT.HRESULT ImProduct(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x419e)</p>
     */
    @ComMethod(name = "SeriesSum", dispId = 0x419e)
    com.sun.jna.platform.win32.WinNT.HRESULT SeriesSum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x419f)</p>
     */
    @ComMethod(name = "FactDouble", dispId = 0x419f)
    com.sun.jna.platform.win32.WinNT.HRESULT FactDouble(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a0)</p>
     */
    @ComMethod(name = "SqrtPi", dispId = 0x41a0)
    com.sun.jna.platform.win32.WinNT.HRESULT SqrtPi(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a1)</p>
     */
    @ComMethod(name = "Quotient", dispId = 0x41a1)
    com.sun.jna.platform.win32.WinNT.HRESULT Quotient(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a2)</p>
     */
    @ComMethod(name = "Delta", dispId = 0x41a2)
    com.sun.jna.platform.win32.WinNT.HRESULT Delta(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a3)</p>
     */
    @ComMethod(name = "GeStep", dispId = 0x41a3)
    com.sun.jna.platform.win32.WinNT.HRESULT GeStep(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a4)</p>
     */
    @ComMethod(name = "IsEven", dispId = 0x41a4)
    com.sun.jna.platform.win32.WinNT.HRESULT IsEven(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a5)</p>
     */
    @ComMethod(name = "IsOdd", dispId = 0x41a5)
    com.sun.jna.platform.win32.WinNT.HRESULT IsOdd(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a6)</p>
     */
    @ComMethod(name = "MRound", dispId = 0x41a6)
    com.sun.jna.platform.win32.WinNT.HRESULT MRound(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a7)</p>
     */
    @ComMethod(name = "Erf", dispId = 0x41a7)
    com.sun.jna.platform.win32.WinNT.HRESULT Erf(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a8)</p>
     */
    @ComMethod(name = "ErfC", dispId = 0x41a8)
    com.sun.jna.platform.win32.WinNT.HRESULT ErfC(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x41a9)</p>
     */
    @ComMethod(name = "BesselJ", dispId = 0x41a9)
    com.sun.jna.platform.win32.WinNT.HRESULT BesselJ(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41aa)</p>
     */
    @ComMethod(name = "BesselK", dispId = 0x41aa)
    com.sun.jna.platform.win32.WinNT.HRESULT BesselK(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ab)</p>
     */
    @ComMethod(name = "BesselY", dispId = 0x41ab)
    com.sun.jna.platform.win32.WinNT.HRESULT BesselY(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ac)</p>
     */
    @ComMethod(name = "BesselI", dispId = 0x41ac)
    com.sun.jna.platform.win32.WinNT.HRESULT BesselI(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ad)</p>
     */
    @ComMethod(name = "Xirr", dispId = 0x41ad)
    com.sun.jna.platform.win32.WinNT.HRESULT Xirr(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ae)</p>
     */
    @ComMethod(name = "Xnpv", dispId = 0x41ae)
    com.sun.jna.platform.win32.WinNT.HRESULT Xnpv(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41af)</p>
     */
    @ComMethod(name = "PriceMat", dispId = 0x41af)
    com.sun.jna.platform.win32.WinNT.HRESULT PriceMat(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b0)</p>
     */
    @ComMethod(name = "YieldMat", dispId = 0x41b0)
    com.sun.jna.platform.win32.WinNT.HRESULT YieldMat(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b1)</p>
     */
    @ComMethod(name = "IntRate", dispId = 0x41b1)
    com.sun.jna.platform.win32.WinNT.HRESULT IntRate(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b2)</p>
     */
    @ComMethod(name = "Received", dispId = 0x41b2)
    com.sun.jna.platform.win32.WinNT.HRESULT Received(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b3)</p>
     */
    @ComMethod(name = "Disc", dispId = 0x41b3)
    com.sun.jna.platform.win32.WinNT.HRESULT Disc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b4)</p>
     */
    @ComMethod(name = "PriceDisc", dispId = 0x41b4)
    com.sun.jna.platform.win32.WinNT.HRESULT PriceDisc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b5)</p>
     */
    @ComMethod(name = "YieldDisc", dispId = 0x41b5)
    com.sun.jna.platform.win32.WinNT.HRESULT YieldDisc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b6)</p>
     */
    @ComMethod(name = "TBillEq", dispId = 0x41b6)
    com.sun.jna.platform.win32.WinNT.HRESULT TBillEq(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b7)</p>
     */
    @ComMethod(name = "TBillPrice", dispId = 0x41b7)
    com.sun.jna.platform.win32.WinNT.HRESULT TBillPrice(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b8)</p>
     */
    @ComMethod(name = "TBillYield", dispId = 0x41b8)
    com.sun.jna.platform.win32.WinNT.HRESULT TBillYield(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41b9)</p>
     */
    @ComMethod(name = "Price", dispId = 0x41b9)
    com.sun.jna.platform.win32.WinNT.HRESULT Price(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            VARIANT RHS);
            
    /**
     * <p>id(0x41bb)</p>
     */
    @ComMethod(name = "DollarDe", dispId = 0x41bb)
    com.sun.jna.platform.win32.WinNT.HRESULT DollarDe(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41bc)</p>
     */
    @ComMethod(name = "DollarFr", dispId = 0x41bc)
    com.sun.jna.platform.win32.WinNT.HRESULT DollarFr(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41bd)</p>
     */
    @ComMethod(name = "Nominal", dispId = 0x41bd)
    com.sun.jna.platform.win32.WinNT.HRESULT Nominal(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41be)</p>
     */
    @ComMethod(name = "Effect", dispId = 0x41be)
    com.sun.jna.platform.win32.WinNT.HRESULT Effect(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41bf)</p>
     */
    @ComMethod(name = "CumPrinc", dispId = 0x41bf)
    com.sun.jna.platform.win32.WinNT.HRESULT CumPrinc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c0)</p>
     */
    @ComMethod(name = "CumIPmt", dispId = 0x41c0)
    com.sun.jna.platform.win32.WinNT.HRESULT CumIPmt(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c1)</p>
     */
    @ComMethod(name = "EDate", dispId = 0x41c1)
    com.sun.jna.platform.win32.WinNT.HRESULT EDate(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c2)</p>
     */
    @ComMethod(name = "EoMonth", dispId = 0x41c2)
    com.sun.jna.platform.win32.WinNT.HRESULT EoMonth(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c3)</p>
     */
    @ComMethod(name = "YearFrac", dispId = 0x41c3)
    com.sun.jna.platform.win32.WinNT.HRESULT YearFrac(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c4)</p>
     */
    @ComMethod(name = "CoupDayBs", dispId = 0x41c4)
    com.sun.jna.platform.win32.WinNT.HRESULT CoupDayBs(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c5)</p>
     */
    @ComMethod(name = "CoupDays", dispId = 0x41c5)
    com.sun.jna.platform.win32.WinNT.HRESULT CoupDays(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c6)</p>
     */
    @ComMethod(name = "CoupDaysNc", dispId = 0x41c6)
    com.sun.jna.platform.win32.WinNT.HRESULT CoupDaysNc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c7)</p>
     */
    @ComMethod(name = "CoupNcd", dispId = 0x41c7)
    com.sun.jna.platform.win32.WinNT.HRESULT CoupNcd(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c8)</p>
     */
    @ComMethod(name = "CoupNum", dispId = 0x41c8)
    com.sun.jna.platform.win32.WinNT.HRESULT CoupNum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41c9)</p>
     */
    @ComMethod(name = "CoupPcd", dispId = 0x41c9)
    com.sun.jna.platform.win32.WinNT.HRESULT CoupPcd(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ca)</p>
     */
    @ComMethod(name = "Duration", dispId = 0x41ca)
    com.sun.jna.platform.win32.WinNT.HRESULT Duration(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x41cb)</p>
     */
    @ComMethod(name = "MDuration", dispId = 0x41cb)
    com.sun.jna.platform.win32.WinNT.HRESULT MDuration(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x41cc)</p>
     */
    @ComMethod(name = "OddLPrice", dispId = 0x41cc)
    com.sun.jna.platform.win32.WinNT.HRESULT OddLPrice(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            VARIANT RHS);
            
    /**
     * <p>id(0x41cd)</p>
     */
    @ComMethod(name = "OddLYield", dispId = 0x41cd)
    com.sun.jna.platform.win32.WinNT.HRESULT OddLYield(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ce)</p>
     */
    @ComMethod(name = "OddFPrice", dispId = 0x41ce)
    com.sun.jna.platform.win32.WinNT.HRESULT OddFPrice(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            VARIANT RHS);
            
    /**
     * <p>id(0x41cf)</p>
     */
    @ComMethod(name = "OddFYield", dispId = 0x41cf)
    com.sun.jna.platform.win32.WinNT.HRESULT OddFYield(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d0)</p>
     */
    @ComMethod(name = "RandBetween", dispId = 0x41d0)
    com.sun.jna.platform.win32.WinNT.HRESULT RandBetween(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d1)</p>
     */
    @ComMethod(name = "WeekNum", dispId = 0x41d1)
    com.sun.jna.platform.win32.WinNT.HRESULT WeekNum(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d2)</p>
     */
    @ComMethod(name = "AmorDegrc", dispId = 0x41d2)
    com.sun.jna.platform.win32.WinNT.HRESULT AmorDegrc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d3)</p>
     */
    @ComMethod(name = "AmorLinc", dispId = 0x41d3)
    com.sun.jna.platform.win32.WinNT.HRESULT AmorLinc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d4)</p>
     */
    @ComMethod(name = "Convert", dispId = 0x41d4)
    com.sun.jna.platform.win32.WinNT.HRESULT Convert(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d5)</p>
     */
    @ComMethod(name = "AccrInt", dispId = 0x41d5)
    com.sun.jna.platform.win32.WinNT.HRESULT AccrInt(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d6)</p>
     */
    @ComMethod(name = "AccrIntM", dispId = 0x41d6)
    com.sun.jna.platform.win32.WinNT.HRESULT AccrIntM(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d7)</p>
     */
    @ComMethod(name = "WorkDay", dispId = 0x41d7)
    com.sun.jna.platform.win32.WinNT.HRESULT WorkDay(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d8)</p>
     */
    @ComMethod(name = "NetworkDays", dispId = 0x41d8)
    com.sun.jna.platform.win32.WinNT.HRESULT NetworkDays(Object Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41d9)</p>
     */
    @ComMethod(name = "Gcd", dispId = 0x41d9)
    com.sun.jna.platform.win32.WinNT.HRESULT Gcd(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x41da)</p>
     */
    @ComMethod(name = "MultiNomial", dispId = 0x41da)
    com.sun.jna.platform.win32.WinNT.HRESULT MultiNomial(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x41db)</p>
     */
    @ComMethod(name = "Lcm", dispId = 0x41db)
    com.sun.jna.platform.win32.WinNT.HRESULT Lcm(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x41dc)</p>
     */
    @ComMethod(name = "FVSchedule", dispId = 0x41dc)
    com.sun.jna.platform.win32.WinNT.HRESULT FVSchedule(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e2)</p>
     */
    @ComMethod(name = "SumIfs", dispId = 0x41e2)
    com.sun.jna.platform.win32.WinNT.HRESULT SumIfs(Range Arg1,
            Range Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e1)</p>
     */
    @ComMethod(name = "CountIfs", dispId = 0x41e1)
    com.sun.jna.platform.win32.WinNT.HRESULT CountIfs(Range Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e3)</p>
     */
    @ComMethod(name = "AverageIf", dispId = 0x41e3)
    com.sun.jna.platform.win32.WinNT.HRESULT AverageIf(Range Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e4)</p>
     */
    @ComMethod(name = "AverageIfs", dispId = 0x41e4)
    com.sun.jna.platform.win32.WinNT.HRESULT AverageIfs(Range Arg1,
            Range Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e0)</p>
     */
    @ComMethod(name = "IfError", dispId = 0x41e0)
    com.sun.jna.platform.win32.WinNT.HRESULT IfError(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e5)</p>
     */
    @ComMethod(name = "Aggregate", dispId = 0x41e5)
    com.sun.jna.platform.win32.WinNT.HRESULT Aggregate(Double Arg1,
            Double Arg2,
            Range Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e8)</p>
     */
    @ComMethod(name = "Confidence_Norm", dispId = 0x41e8)
    com.sun.jna.platform.win32.WinNT.HRESULT Confidence_Norm(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e9)</p>
     */
    @ComMethod(name = "Confidence_T", dispId = 0x41e9)
    com.sun.jna.platform.win32.WinNT.HRESULT Confidence_T(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ea)</p>
     */
    @ComMethod(name = "ChiSq_Test", dispId = 0x41ea)
    com.sun.jna.platform.win32.WinNT.HRESULT ChiSq_Test(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41eb)</p>
     */
    @ComMethod(name = "F_Test", dispId = 0x41eb)
    com.sun.jna.platform.win32.WinNT.HRESULT F_Test(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ec)</p>
     */
    @ComMethod(name = "Covariance_P", dispId = 0x41ec)
    com.sun.jna.platform.win32.WinNT.HRESULT Covariance_P(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ed)</p>
     */
    @ComMethod(name = "Covariance_S", dispId = 0x41ed)
    com.sun.jna.platform.win32.WinNT.HRESULT Covariance_S(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ee)</p>
     */
    @ComMethod(name = "Expon_Dist", dispId = 0x41ee)
    com.sun.jna.platform.win32.WinNT.HRESULT Expon_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ef)</p>
     */
    @ComMethod(name = "Gamma_Dist", dispId = 0x41ef)
    com.sun.jna.platform.win32.WinNT.HRESULT Gamma_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f0)</p>
     */
    @ComMethod(name = "Gamma_Inv", dispId = 0x41f0)
    com.sun.jna.platform.win32.WinNT.HRESULT Gamma_Inv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f1)</p>
     */
    @ComMethod(name = "Mode_Mult", dispId = 0x41f1)
    com.sun.jna.platform.win32.WinNT.HRESULT Mode_Mult(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f2)</p>
     */
    @ComMethod(name = "Mode_Sngl", dispId = 0x41f2)
    com.sun.jna.platform.win32.WinNT.HRESULT Mode_Sngl(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f3)</p>
     */
    @ComMethod(name = "Norm_Dist", dispId = 0x41f3)
    com.sun.jna.platform.win32.WinNT.HRESULT Norm_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f4)</p>
     */
    @ComMethod(name = "Norm_Inv", dispId = 0x41f4)
    com.sun.jna.platform.win32.WinNT.HRESULT Norm_Inv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f5)</p>
     */
    @ComMethod(name = "Percentile_Exc", dispId = 0x41f5)
    com.sun.jna.platform.win32.WinNT.HRESULT Percentile_Exc(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f6)</p>
     */
    @ComMethod(name = "Percentile_Inc", dispId = 0x41f6)
    com.sun.jna.platform.win32.WinNT.HRESULT Percentile_Inc(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f7)</p>
     */
    @ComMethod(name = "PercentRank_Exc", dispId = 0x41f7)
    com.sun.jna.platform.win32.WinNT.HRESULT PercentRank_Exc(Object Arg1,
            Double Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f8)</p>
     */
    @ComMethod(name = "PercentRank_Inc", dispId = 0x41f8)
    com.sun.jna.platform.win32.WinNT.HRESULT PercentRank_Inc(Object Arg1,
            Double Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41f9)</p>
     */
    @ComMethod(name = "Poisson_Dist", dispId = 0x41f9)
    com.sun.jna.platform.win32.WinNT.HRESULT Poisson_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41fa)</p>
     */
    @ComMethod(name = "Quartile_Exc", dispId = 0x41fa)
    com.sun.jna.platform.win32.WinNT.HRESULT Quartile_Exc(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41fb)</p>
     */
    @ComMethod(name = "Quartile_Inc", dispId = 0x41fb)
    com.sun.jna.platform.win32.WinNT.HRESULT Quartile_Inc(Object Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x41fc)</p>
     */
    @ComMethod(name = "Rank_Avg", dispId = 0x41fc)
    com.sun.jna.platform.win32.WinNT.HRESULT Rank_Avg(Double Arg1,
            Range Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41fd)</p>
     */
    @ComMethod(name = "Rank_Eq", dispId = 0x41fd)
    com.sun.jna.platform.win32.WinNT.HRESULT Rank_Eq(Double Arg1,
            Range Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41fe)</p>
     */
    @ComMethod(name = "StDev_S", dispId = 0x41fe)
    com.sun.jna.platform.win32.WinNT.HRESULT StDev_S(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x41ff)</p>
     */
    @ComMethod(name = "StDev_P", dispId = 0x41ff)
    com.sun.jna.platform.win32.WinNT.HRESULT StDev_P(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4200)</p>
     */
    @ComMethod(name = "T_Dist", dispId = 0x4200)
    com.sun.jna.platform.win32.WinNT.HRESULT T_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4201)</p>
     */
    @ComMethod(name = "T_Dist_2T", dispId = 0x4201)
    com.sun.jna.platform.win32.WinNT.HRESULT T_Dist_2T(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4202)</p>
     */
    @ComMethod(name = "T_Dist_RT", dispId = 0x4202)
    com.sun.jna.platform.win32.WinNT.HRESULT T_Dist_RT(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4203)</p>
     */
    @ComMethod(name = "T_Inv", dispId = 0x4203)
    com.sun.jna.platform.win32.WinNT.HRESULT T_Inv(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4204)</p>
     */
    @ComMethod(name = "T_Inv_2T", dispId = 0x4204)
    com.sun.jna.platform.win32.WinNT.HRESULT T_Inv_2T(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4205)</p>
     */
    @ComMethod(name = "Var_S", dispId = 0x4205)
    com.sun.jna.platform.win32.WinNT.HRESULT Var_S(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4206)</p>
     */
    @ComMethod(name = "Var_P", dispId = 0x4206)
    com.sun.jna.platform.win32.WinNT.HRESULT Var_P(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4207)</p>
     */
    @ComMethod(name = "Weibull_Dist", dispId = 0x4207)
    com.sun.jna.platform.win32.WinNT.HRESULT Weibull_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4208)</p>
     */
    @ComMethod(name = "NetworkDays_Intl", dispId = 0x4208)
    com.sun.jna.platform.win32.WinNT.HRESULT NetworkDays_Intl(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4209)</p>
     */
    @ComMethod(name = "WorkDay_Intl", dispId = 0x4209)
    com.sun.jna.platform.win32.WinNT.HRESULT WorkDay_Intl(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x420b)</p>
     */
    @ComMethod(name = "ISO_Ceiling", dispId = 0x420b)
    com.sun.jna.platform.win32.WinNT.HRESULT ISO_Ceiling(Double Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0xb0a)</p>
     */
    @ComMethod(name = "Dummy21", dispId = 0xb0a)
    com.sun.jna.platform.win32.WinNT.HRESULT Dummy21(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0xb0b)</p>
     */
    @ComMethod(name = "Dummy19", dispId = 0xb0b)
    com.sun.jna.platform.win32.WinNT.HRESULT Dummy19(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x420d)</p>
     */
    @ComMethod(name = "Beta_Dist", dispId = 0x420d)
    com.sun.jna.platform.win32.WinNT.HRESULT Beta_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            Object Arg5,
            Object Arg6,
            VARIANT RHS);
            
    /**
     * <p>id(0x420e)</p>
     */
    @ComMethod(name = "Beta_Inv", dispId = 0x420e)
    com.sun.jna.platform.win32.WinNT.HRESULT Beta_Inv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x420f)</p>
     */
    @ComMethod(name = "ChiSq_Dist", dispId = 0x420f)
    com.sun.jna.platform.win32.WinNT.HRESULT ChiSq_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4210)</p>
     */
    @ComMethod(name = "ChiSq_Dist_RT", dispId = 0x4210)
    com.sun.jna.platform.win32.WinNT.HRESULT ChiSq_Dist_RT(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4211)</p>
     */
    @ComMethod(name = "ChiSq_Inv", dispId = 0x4211)
    com.sun.jna.platform.win32.WinNT.HRESULT ChiSq_Inv(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4212)</p>
     */
    @ComMethod(name = "ChiSq_Inv_RT", dispId = 0x4212)
    com.sun.jna.platform.win32.WinNT.HRESULT ChiSq_Inv_RT(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4213)</p>
     */
    @ComMethod(name = "F_Dist", dispId = 0x4213)
    com.sun.jna.platform.win32.WinNT.HRESULT F_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4214)</p>
     */
    @ComMethod(name = "F_Dist_RT", dispId = 0x4214)
    com.sun.jna.platform.win32.WinNT.HRESULT F_Dist_RT(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4215)</p>
     */
    @ComMethod(name = "F_Inv", dispId = 0x4215)
    com.sun.jna.platform.win32.WinNT.HRESULT F_Inv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4216)</p>
     */
    @ComMethod(name = "F_Inv_RT", dispId = 0x4216)
    com.sun.jna.platform.win32.WinNT.HRESULT F_Inv_RT(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4217)</p>
     */
    @ComMethod(name = "HypGeom_Dist", dispId = 0x4217)
    com.sun.jna.platform.win32.WinNT.HRESULT HypGeom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Boolean Arg5,
            VARIANT RHS);
            
    /**
     * <p>id(0x4218)</p>
     */
    @ComMethod(name = "LogNorm_Dist", dispId = 0x4218)
    com.sun.jna.platform.win32.WinNT.HRESULT LogNorm_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x4219)</p>
     */
    @ComMethod(name = "LogNorm_Inv", dispId = 0x4219)
    com.sun.jna.platform.win32.WinNT.HRESULT LogNorm_Inv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x421a)</p>
     */
    @ComMethod(name = "NegBinom_Dist", dispId = 0x421a)
    com.sun.jna.platform.win32.WinNT.HRESULT NegBinom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x421b)</p>
     */
    @ComMethod(name = "Norm_S_Dist", dispId = 0x421b)
    com.sun.jna.platform.win32.WinNT.HRESULT Norm_S_Dist(Double Arg1,
            Boolean Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x421c)</p>
     */
    @ComMethod(name = "Norm_S_Inv", dispId = 0x421c)
    com.sun.jna.platform.win32.WinNT.HRESULT Norm_S_Inv(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x421d)</p>
     */
    @ComMethod(name = "T_Test", dispId = 0x421d)
    com.sun.jna.platform.win32.WinNT.HRESULT T_Test(Object Arg1,
            Object Arg2,
            Double Arg3,
            Double Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x421e)</p>
     */
    @ComMethod(name = "Z_Test", dispId = 0x421e)
    com.sun.jna.platform.win32.WinNT.HRESULT Z_Test(Object Arg1,
            Double Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e6)</p>
     */
    @ComMethod(name = "Binom_Dist", dispId = 0x41e6)
    com.sun.jna.platform.win32.WinNT.HRESULT Binom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x41e7)</p>
     */
    @ComMethod(name = "Binom_Inv", dispId = 0x41e7)
    com.sun.jna.platform.win32.WinNT.HRESULT Binom_Inv(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x421f)</p>
     */
    @ComMethod(name = "Erf_Precise", dispId = 0x421f)
    com.sun.jna.platform.win32.WinNT.HRESULT Erf_Precise(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4220)</p>
     */
    @ComMethod(name = "ErfC_Precise", dispId = 0x4220)
    com.sun.jna.platform.win32.WinNT.HRESULT ErfC_Precise(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4221)</p>
     */
    @ComMethod(name = "GammaLn_Precise", dispId = 0x4221)
    com.sun.jna.platform.win32.WinNT.HRESULT GammaLn_Precise(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4222)</p>
     */
    @ComMethod(name = "Ceiling_Precise", dispId = 0x4222)
    com.sun.jna.platform.win32.WinNT.HRESULT Ceiling_Precise(Double Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4223)</p>
     */
    @ComMethod(name = "Floor_Precise", dispId = 0x4223)
    com.sun.jna.platform.win32.WinNT.HRESULT Floor_Precise(Double Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4224)</p>
     */
    @ComMethod(name = "Acot", dispId = 0x4224)
    com.sun.jna.platform.win32.WinNT.HRESULT Acot(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4225)</p>
     */
    @ComMethod(name = "Acoth", dispId = 0x4225)
    com.sun.jna.platform.win32.WinNT.HRESULT Acoth(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4226)</p>
     */
    @ComMethod(name = "Cot", dispId = 0x4226)
    com.sun.jna.platform.win32.WinNT.HRESULT Cot(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4227)</p>
     */
    @ComMethod(name = "Coth", dispId = 0x4227)
    com.sun.jna.platform.win32.WinNT.HRESULT Coth(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4228)</p>
     */
    @ComMethod(name = "Csc", dispId = 0x4228)
    com.sun.jna.platform.win32.WinNT.HRESULT Csc(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4229)</p>
     */
    @ComMethod(name = "Csch", dispId = 0x4229)
    com.sun.jna.platform.win32.WinNT.HRESULT Csch(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x422a)</p>
     */
    @ComMethod(name = "Sec", dispId = 0x422a)
    com.sun.jna.platform.win32.WinNT.HRESULT Sec(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x422b)</p>
     */
    @ComMethod(name = "Sech", dispId = 0x422b)
    com.sun.jna.platform.win32.WinNT.HRESULT Sech(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x422d)</p>
     */
    @ComMethod(name = "ImCot", dispId = 0x422d)
    com.sun.jna.platform.win32.WinNT.HRESULT ImCot(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x422c)</p>
     */
    @ComMethod(name = "ImTan", dispId = 0x422c)
    com.sun.jna.platform.win32.WinNT.HRESULT ImTan(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x422e)</p>
     */
    @ComMethod(name = "ImCsc", dispId = 0x422e)
    com.sun.jna.platform.win32.WinNT.HRESULT ImCsc(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x422f)</p>
     */
    @ComMethod(name = "ImCsch", dispId = 0x422f)
    com.sun.jna.platform.win32.WinNT.HRESULT ImCsch(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4230)</p>
     */
    @ComMethod(name = "ImSec", dispId = 0x4230)
    com.sun.jna.platform.win32.WinNT.HRESULT ImSec(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4231)</p>
     */
    @ComMethod(name = "ImSech", dispId = 0x4231)
    com.sun.jna.platform.win32.WinNT.HRESULT ImSech(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4232)</p>
     */
    @ComMethod(name = "Bitand", dispId = 0x4232)
    com.sun.jna.platform.win32.WinNT.HRESULT Bitand(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4233)</p>
     */
    @ComMethod(name = "Bitor", dispId = 0x4233)
    com.sun.jna.platform.win32.WinNT.HRESULT Bitor(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4234)</p>
     */
    @ComMethod(name = "Bitxor", dispId = 0x4234)
    com.sun.jna.platform.win32.WinNT.HRESULT Bitxor(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4235)</p>
     */
    @ComMethod(name = "Bitlshift", dispId = 0x4235)
    com.sun.jna.platform.win32.WinNT.HRESULT Bitlshift(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4236)</p>
     */
    @ComMethod(name = "Bitrshift", dispId = 0x4236)
    com.sun.jna.platform.win32.WinNT.HRESULT Bitrshift(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4239)</p>
     */
    @ComMethod(name = "Xor", dispId = 0x4239)
    com.sun.jna.platform.win32.WinNT.HRESULT Xor(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4238)</p>
     */
    @ComMethod(name = "Combina", dispId = 0x4238)
    com.sun.jna.platform.win32.WinNT.HRESULT Combina(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4237)</p>
     */
    @ComMethod(name = "Permutationa", dispId = 0x4237)
    com.sun.jna.platform.win32.WinNT.HRESULT Permutationa(Double Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x423a)</p>
     */
    @ComMethod(name = "PDuration", dispId = 0x423a)
    com.sun.jna.platform.win32.WinNT.HRESULT PDuration(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x423b)</p>
     */
    @ComMethod(name = "Base", dispId = 0x423b)
    com.sun.jna.platform.win32.WinNT.HRESULT Base(Double Arg1,
            Double Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x423c)</p>
     */
    @ComMethod(name = "Decimal", dispId = 0x423c)
    com.sun.jna.platform.win32.WinNT.HRESULT Decimal(String Arg1,
            Double Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x423d)</p>
     */
    @ComMethod(name = "Days", dispId = 0x423d)
    com.sun.jna.platform.win32.WinNT.HRESULT Days(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x423e)</p>
     */
    @ComMethod(name = "Binom_Dist_Range", dispId = 0x423e)
    com.sun.jna.platform.win32.WinNT.HRESULT Binom_Dist_Range(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            VARIANT RHS);
            
    /**
     * <p>id(0x423f)</p>
     */
    @ComMethod(name = "Gamma", dispId = 0x423f)
    com.sun.jna.platform.win32.WinNT.HRESULT Gamma(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4241)</p>
     */
    @ComMethod(name = "Gauss", dispId = 0x4241)
    com.sun.jna.platform.win32.WinNT.HRESULT Gauss(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4242)</p>
     */
    @ComMethod(name = "Phi", dispId = 0x4242)
    com.sun.jna.platform.win32.WinNT.HRESULT Phi(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4240)</p>
     */
    @ComMethod(name = "Skew_p", dispId = 0x4240)
    com.sun.jna.platform.win32.WinNT.HRESULT Skew_p(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x4243)</p>
     */
    @ComMethod(name = "Rri", dispId = 0x4243)
    com.sun.jna.platform.win32.WinNT.HRESULT Rri(Double Arg1,
            Double Arg2,
            Double Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4244)</p>
     */
    @ComMethod(name = "Unichar", dispId = 0x4244)
    com.sun.jna.platform.win32.WinNT.HRESULT Unichar(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4245)</p>
     */
    @ComMethod(name = "Unicode", dispId = 0x4245)
    com.sun.jna.platform.win32.WinNT.HRESULT Unicode(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4246)</p>
     */
    @ComMethod(name = "Munit", dispId = 0x4246)
    com.sun.jna.platform.win32.WinNT.HRESULT Munit(Double Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4247)</p>
     */
    @ComMethod(name = "Arabic", dispId = 0x4247)
    com.sun.jna.platform.win32.WinNT.HRESULT Arabic(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4248)</p>
     */
    @ComMethod(name = "IsoWeekNum", dispId = 0x4248)
    com.sun.jna.platform.win32.WinNT.HRESULT IsoWeekNum(Double Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4249)</p>
     */
    @ComMethod(name = "NumberValue", dispId = 0x4249)
    com.sun.jna.platform.win32.WinNT.HRESULT NumberValue(String Arg1,
            String Arg2,
            String Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x424d)</p>
     */
    @ComMethod(name = "IsFormula", dispId = 0x424d)
    com.sun.jna.platform.win32.WinNT.HRESULT IsFormula(Range Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x424e)</p>
     */
    @ComMethod(name = "IfNa", dispId = 0x424e)
    com.sun.jna.platform.win32.WinNT.HRESULT IfNa(Object Arg1,
            Object Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x424f)</p>
     */
    @ComMethod(name = "Ceiling_Math", dispId = 0x424f)
    com.sun.jna.platform.win32.WinNT.HRESULT Ceiling_Math(Double Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4250)</p>
     */
    @ComMethod(name = "Floor_Math", dispId = 0x4250)
    com.sun.jna.platform.win32.WinNT.HRESULT Floor_Math(Double Arg1,
            Object Arg2,
            Object Arg3,
            VARIANT RHS);
            
    /**
     * <p>id(0x4251)</p>
     */
    @ComMethod(name = "ImSinh", dispId = 0x4251)
    com.sun.jna.platform.win32.WinNT.HRESULT ImSinh(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4252)</p>
     */
    @ComMethod(name = "ImCosh", dispId = 0x4252)
    com.sun.jna.platform.win32.WinNT.HRESULT ImCosh(Object Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4253)</p>
     */
    @ComMethod(name = "FilterXML", dispId = 0x4253)
    com.sun.jna.platform.win32.WinNT.HRESULT FilterXML(String Arg1,
            String Arg2,
            VARIANT RHS);
            
    /**
     * <p>id(0x4254)</p>
     */
    @ComMethod(name = "WebService", dispId = 0x4254)
    com.sun.jna.platform.win32.WinNT.HRESULT WebService(String Arg1,
            VARIANT RHS);
            
    /**
     * <p>id(0x4255)</p>
     */
    @ComMethod(name = "EncodeURL", dispId = 0x4255)
    com.sun.jna.platform.win32.WinNT.HRESULT EncodeURL(String Arg1,
            VARIANT RHS);
            
    
}