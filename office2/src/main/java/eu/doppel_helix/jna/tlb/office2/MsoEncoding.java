
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoEncoding implements IComEnum {
    
    /**
     * (874)
     */
    msoEncodingThai(874),
    
    /**
     * (932)
     */
    msoEncodingJapaneseShiftJIS(932),
    
    /**
     * (936)
     */
    msoEncodingSimplifiedChineseGBK(936),
    
    /**
     * (949)
     */
    msoEncodingKorean(949),
    
    /**
     * (950)
     */
    msoEncodingTraditionalChineseBig5(950),
    
    /**
     * (1200)
     */
    msoEncodingUnicodeLittleEndian(1200),
    
    /**
     * (1201)
     */
    msoEncodingUnicodeBigEndian(1201),
    
    /**
     * (1250)
     */
    msoEncodingCentralEuropean(1250),
    
    /**
     * (1251)
     */
    msoEncodingCyrillic(1251),
    
    /**
     * (1252)
     */
    msoEncodingWestern(1252),
    
    /**
     * (1253)
     */
    msoEncodingGreek(1253),
    
    /**
     * (1254)
     */
    msoEncodingTurkish(1254),
    
    /**
     * (1255)
     */
    msoEncodingHebrew(1255),
    
    /**
     * (1256)
     */
    msoEncodingArabic(1256),
    
    /**
     * (1257)
     */
    msoEncodingBaltic(1257),
    
    /**
     * (1258)
     */
    msoEncodingVietnamese(1258),
    
    /**
     * (50001)
     */
    msoEncodingAutoDetect(50001),
    
    /**
     * (50932)
     */
    msoEncodingJapaneseAutoDetect(50932),
    
    /**
     * (50936)
     */
    msoEncodingSimplifiedChineseAutoDetect(50936),
    
    /**
     * (50949)
     */
    msoEncodingKoreanAutoDetect(50949),
    
    /**
     * (50950)
     */
    msoEncodingTraditionalChineseAutoDetect(50950),
    
    /**
     * (51251)
     */
    msoEncodingCyrillicAutoDetect(51251),
    
    /**
     * (51253)
     */
    msoEncodingGreekAutoDetect(51253),
    
    /**
     * (51256)
     */
    msoEncodingArabicAutoDetect(51256),
    
    /**
     * (28591)
     */
    msoEncodingISO88591Latin1(28591),
    
    /**
     * (28592)
     */
    msoEncodingISO88592CentralEurope(28592),
    
    /**
     * (28593)
     */
    msoEncodingISO88593Latin3(28593),
    
    /**
     * (28594)
     */
    msoEncodingISO88594Baltic(28594),
    
    /**
     * (28595)
     */
    msoEncodingISO88595Cyrillic(28595),
    
    /**
     * (28596)
     */
    msoEncodingISO88596Arabic(28596),
    
    /**
     * (28597)
     */
    msoEncodingISO88597Greek(28597),
    
    /**
     * (28598)
     */
    msoEncodingISO88598Hebrew(28598),
    
    /**
     * (28599)
     */
    msoEncodingISO88599Turkish(28599),
    
    /**
     * (28605)
     */
    msoEncodingISO885915Latin9(28605),
    
    /**
     * (38598)
     */
    msoEncodingISO88598HebrewLogical(38598),
    
    /**
     * (50220)
     */
    msoEncodingISO2022JPNoHalfwidthKatakana(50220),
    
    /**
     * (50221)
     */
    msoEncodingISO2022JPJISX02021984(50221),
    
    /**
     * (50222)
     */
    msoEncodingISO2022JPJISX02011989(50222),
    
    /**
     * (50225)
     */
    msoEncodingISO2022KR(50225),
    
    /**
     * (50227)
     */
    msoEncodingISO2022CNTraditionalChinese(50227),
    
    /**
     * (50229)
     */
    msoEncodingISO2022CNSimplifiedChinese(50229),
    
    /**
     * (10000)
     */
    msoEncodingMacRoman(10000),
    
    /**
     * (10001)
     */
    msoEncodingMacJapanese(10001),
    
    /**
     * (10002)
     */
    msoEncodingMacTraditionalChineseBig5(10002),
    
    /**
     * (10003)
     */
    msoEncodingMacKorean(10003),
    
    /**
     * (10004)
     */
    msoEncodingMacArabic(10004),
    
    /**
     * (10005)
     */
    msoEncodingMacHebrew(10005),
    
    /**
     * (10006)
     */
    msoEncodingMacGreek1(10006),
    
    /**
     * (10007)
     */
    msoEncodingMacCyrillic(10007),
    
    /**
     * (10008)
     */
    msoEncodingMacSimplifiedChineseGB2312(10008),
    
    /**
     * (10010)
     */
    msoEncodingMacRomania(10010),
    
    /**
     * (10017)
     */
    msoEncodingMacUkraine(10017),
    
    /**
     * (10029)
     */
    msoEncodingMacLatin2(10029),
    
    /**
     * (10079)
     */
    msoEncodingMacIcelandic(10079),
    
    /**
     * (10081)
     */
    msoEncodingMacTurkish(10081),
    
    /**
     * (10082)
     */
    msoEncodingMacCroatia(10082),
    
    /**
     * (37)
     */
    msoEncodingEBCDICUSCanada(37),
    
    /**
     * (500)
     */
    msoEncodingEBCDICInternational(500),
    
    /**
     * (870)
     */
    msoEncodingEBCDICMultilingualROECELatin2(870),
    
    /**
     * (875)
     */
    msoEncodingEBCDICGreekModern(875),
    
    /**
     * (1026)
     */
    msoEncodingEBCDICTurkishLatin5(1026),
    
    /**
     * (20273)
     */
    msoEncodingEBCDICGermany(20273),
    
    /**
     * (20277)
     */
    msoEncodingEBCDICDenmarkNorway(20277),
    
    /**
     * (20278)
     */
    msoEncodingEBCDICFinlandSweden(20278),
    
    /**
     * (20280)
     */
    msoEncodingEBCDICItaly(20280),
    
    /**
     * (20284)
     */
    msoEncodingEBCDICLatinAmericaSpain(20284),
    
    /**
     * (20285)
     */
    msoEncodingEBCDICUnitedKingdom(20285),
    
    /**
     * (20290)
     */
    msoEncodingEBCDICJapaneseKatakanaExtended(20290),
    
    /**
     * (20297)
     */
    msoEncodingEBCDICFrance(20297),
    
    /**
     * (20420)
     */
    msoEncodingEBCDICArabic(20420),
    
    /**
     * (20423)
     */
    msoEncodingEBCDICGreek(20423),
    
    /**
     * (20424)
     */
    msoEncodingEBCDICHebrew(20424),
    
    /**
     * (20833)
     */
    msoEncodingEBCDICKoreanExtended(20833),
    
    /**
     * (20838)
     */
    msoEncodingEBCDICThai(20838),
    
    /**
     * (20871)
     */
    msoEncodingEBCDICIcelandic(20871),
    
    /**
     * (20905)
     */
    msoEncodingEBCDICTurkish(20905),
    
    /**
     * (20880)
     */
    msoEncodingEBCDICRussian(20880),
    
    /**
     * (21025)
     */
    msoEncodingEBCDICSerbianBulgarian(21025),
    
    /**
     * (50930)
     */
    msoEncodingEBCDICJapaneseKatakanaExtendedAndJapanese(50930),
    
    /**
     * (50931)
     */
    msoEncodingEBCDICUSCanadaAndJapanese(50931),
    
    /**
     * (50933)
     */
    msoEncodingEBCDICKoreanExtendedAndKorean(50933),
    
    /**
     * (50935)
     */
    msoEncodingEBCDICSimplifiedChineseExtendedAndSimplifiedChinese(50935),
    
    /**
     * (50937)
     */
    msoEncodingEBCDICUSCanadaAndTraditionalChinese(50937),
    
    /**
     * (50939)
     */
    msoEncodingEBCDICJapaneseLatinExtendedAndJapanese(50939),
    
    /**
     * (437)
     */
    msoEncodingOEMUnitedStates(437),
    
    /**
     * (737)
     */
    msoEncodingOEMGreek437G(737),
    
    /**
     * (775)
     */
    msoEncodingOEMBaltic(775),
    
    /**
     * (850)
     */
    msoEncodingOEMMultilingualLatinI(850),
    
    /**
     * (852)
     */
    msoEncodingOEMMultilingualLatinII(852),
    
    /**
     * (855)
     */
    msoEncodingOEMCyrillic(855),
    
    /**
     * (857)
     */
    msoEncodingOEMTurkish(857),
    
    /**
     * (860)
     */
    msoEncodingOEMPortuguese(860),
    
    /**
     * (861)
     */
    msoEncodingOEMIcelandic(861),
    
    /**
     * (862)
     */
    msoEncodingOEMHebrew(862),
    
    /**
     * (863)
     */
    msoEncodingOEMCanadianFrench(863),
    
    /**
     * (864)
     */
    msoEncodingOEMArabic(864),
    
    /**
     * (865)
     */
    msoEncodingOEMNordic(865),
    
    /**
     * (866)
     */
    msoEncodingOEMCyrillicII(866),
    
    /**
     * (869)
     */
    msoEncodingOEMModernGreek(869),
    
    /**
     * (51932)
     */
    msoEncodingEUCJapanese(51932),
    
    /**
     * (51936)
     */
    msoEncodingEUCChineseSimplifiedChinese(51936),
    
    /**
     * (51949)
     */
    msoEncodingEUCKorean(51949),
    
    /**
     * (51950)
     */
    msoEncodingEUCTaiwaneseTraditionalChinese(51950),
    
    /**
     * (57002)
     */
    msoEncodingISCIIDevanagari(57002),
    
    /**
     * (57003)
     */
    msoEncodingISCIIBengali(57003),
    
    /**
     * (57004)
     */
    msoEncodingISCIITamil(57004),
    
    /**
     * (57005)
     */
    msoEncodingISCIITelugu(57005),
    
    /**
     * (57006)
     */
    msoEncodingISCIIAssamese(57006),
    
    /**
     * (57007)
     */
    msoEncodingISCIIOriya(57007),
    
    /**
     * (57008)
     */
    msoEncodingISCIIKannada(57008),
    
    /**
     * (57009)
     */
    msoEncodingISCIIMalayalam(57009),
    
    /**
     * (57010)
     */
    msoEncodingISCIIGujarati(57010),
    
    /**
     * (57011)
     */
    msoEncodingISCIIPunjabi(57011),
    
    /**
     * (708)
     */
    msoEncodingArabicASMO(708),
    
    /**
     * (720)
     */
    msoEncodingArabicTransparentASMO(720),
    
    /**
     * (1361)
     */
    msoEncodingKoreanJohab(1361),
    
    /**
     * (20000)
     */
    msoEncodingTaiwanCNS(20000),
    
    /**
     * (20001)
     */
    msoEncodingTaiwanTCA(20001),
    
    /**
     * (20002)
     */
    msoEncodingTaiwanEten(20002),
    
    /**
     * (20003)
     */
    msoEncodingTaiwanIBM5550(20003),
    
    /**
     * (20004)
     */
    msoEncodingTaiwanTeleText(20004),
    
    /**
     * (20005)
     */
    msoEncodingTaiwanWang(20005),
    
    /**
     * (20105)
     */
    msoEncodingIA5IRV(20105),
    
    /**
     * (20106)
     */
    msoEncodingIA5German(20106),
    
    /**
     * (20107)
     */
    msoEncodingIA5Swedish(20107),
    
    /**
     * (20108)
     */
    msoEncodingIA5Norwegian(20108),
    
    /**
     * (20127)
     */
    msoEncodingUSASCII(20127),
    
    /**
     * (20261)
     */
    msoEncodingT61(20261),
    
    /**
     * (20269)
     */
    msoEncodingISO6937NonSpacingAccent(20269),
    
    /**
     * (20866)
     */
    msoEncodingKOI8R(20866),
    
    /**
     * (21027)
     */
    msoEncodingExtAlphaLowercase(21027),
    
    /**
     * (21866)
     */
    msoEncodingKOI8U(21866),
    
    /**
     * (29001)
     */
    msoEncodingEuropa3(29001),
    
    /**
     * (52936)
     */
    msoEncodingHZGBSimplifiedChinese(52936),
    
    /**
     * (54936)
     */
    msoEncodingSimplifiedChineseGB18030(54936),
    
    /**
     * (65000)
     */
    msoEncodingUTF7(65000),
    
    /**
     * (65001)
     */
    msoEncodingUTF8(65001),
    ;

    private MsoEncoding(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}