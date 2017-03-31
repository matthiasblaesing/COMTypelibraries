
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines the errors that may be returned by the WBEM Scripting library
 *
 * <p>uuid({4A249B7C-FC9A-11D1-8B1E-00600806D9B6})</p>
 */
public enum WbemErrorEnum implements IComEnum {
    
    /**
     * (0)
     */
    wbemNoErr(0),
    
    /**
     * (-2147217407)
     */
    wbemErrFailed(-2147217407),
    
    /**
     * (-2147217406)
     */
    wbemErrNotFound(-2147217406),
    
    /**
     * (-2147217405)
     */
    wbemErrAccessDenied(-2147217405),
    
    /**
     * (-2147217404)
     */
    wbemErrProviderFailure(-2147217404),
    
    /**
     * (-2147217403)
     */
    wbemErrTypeMismatch(-2147217403),
    
    /**
     * (-2147217402)
     */
    wbemErrOutOfMemory(-2147217402),
    
    /**
     * (-2147217401)
     */
    wbemErrInvalidContext(-2147217401),
    
    /**
     * (-2147217400)
     */
    wbemErrInvalidParameter(-2147217400),
    
    /**
     * (-2147217399)
     */
    wbemErrNotAvailable(-2147217399),
    
    /**
     * (-2147217398)
     */
    wbemErrCriticalError(-2147217398),
    
    /**
     * (-2147217397)
     */
    wbemErrInvalidStream(-2147217397),
    
    /**
     * (-2147217396)
     */
    wbemErrNotSupported(-2147217396),
    
    /**
     * (-2147217395)
     */
    wbemErrInvalidSuperclass(-2147217395),
    
    /**
     * (-2147217394)
     */
    wbemErrInvalidNamespace(-2147217394),
    
    /**
     * (-2147217393)
     */
    wbemErrInvalidObject(-2147217393),
    
    /**
     * (-2147217392)
     */
    wbemErrInvalidClass(-2147217392),
    
    /**
     * (-2147217391)
     */
    wbemErrProviderNotFound(-2147217391),
    
    /**
     * (-2147217390)
     */
    wbemErrInvalidProviderRegistration(-2147217390),
    
    /**
     * (-2147217389)
     */
    wbemErrProviderLoadFailure(-2147217389),
    
    /**
     * (-2147217388)
     */
    wbemErrInitializationFailure(-2147217388),
    
    /**
     * (-2147217387)
     */
    wbemErrTransportFailure(-2147217387),
    
    /**
     * (-2147217386)
     */
    wbemErrInvalidOperation(-2147217386),
    
    /**
     * (-2147217385)
     */
    wbemErrInvalidQuery(-2147217385),
    
    /**
     * (-2147217384)
     */
    wbemErrInvalidQueryType(-2147217384),
    
    /**
     * (-2147217383)
     */
    wbemErrAlreadyExists(-2147217383),
    
    /**
     * (-2147217382)
     */
    wbemErrOverrideNotAllowed(-2147217382),
    
    /**
     * (-2147217381)
     */
    wbemErrPropagatedQualifier(-2147217381),
    
    /**
     * (-2147217380)
     */
    wbemErrPropagatedProperty(-2147217380),
    
    /**
     * (-2147217379)
     */
    wbemErrUnexpected(-2147217379),
    
    /**
     * (-2147217378)
     */
    wbemErrIllegalOperation(-2147217378),
    
    /**
     * (-2147217377)
     */
    wbemErrCannotBeKey(-2147217377),
    
    /**
     * (-2147217376)
     */
    wbemErrIncompleteClass(-2147217376),
    
    /**
     * (-2147217375)
     */
    wbemErrInvalidSyntax(-2147217375),
    
    /**
     * (-2147217374)
     */
    wbemErrNondecoratedObject(-2147217374),
    
    /**
     * (-2147217373)
     */
    wbemErrReadOnly(-2147217373),
    
    /**
     * (-2147217372)
     */
    wbemErrProviderNotCapable(-2147217372),
    
    /**
     * (-2147217371)
     */
    wbemErrClassHasChildren(-2147217371),
    
    /**
     * (-2147217370)
     */
    wbemErrClassHasInstances(-2147217370),
    
    /**
     * (-2147217369)
     */
    wbemErrQueryNotImplemented(-2147217369),
    
    /**
     * (-2147217368)
     */
    wbemErrIllegalNull(-2147217368),
    
    /**
     * (-2147217367)
     */
    wbemErrInvalidQualifierType(-2147217367),
    
    /**
     * (-2147217366)
     */
    wbemErrInvalidPropertyType(-2147217366),
    
    /**
     * (-2147217365)
     */
    wbemErrValueOutOfRange(-2147217365),
    
    /**
     * (-2147217364)
     */
    wbemErrCannotBeSingleton(-2147217364),
    
    /**
     * (-2147217363)
     */
    wbemErrInvalidCimType(-2147217363),
    
    /**
     * (-2147217362)
     */
    wbemErrInvalidMethod(-2147217362),
    
    /**
     * (-2147217361)
     */
    wbemErrInvalidMethodParameters(-2147217361),
    
    /**
     * (-2147217360)
     */
    wbemErrSystemProperty(-2147217360),
    
    /**
     * (-2147217359)
     */
    wbemErrInvalidProperty(-2147217359),
    
    /**
     * (-2147217358)
     */
    wbemErrCallCancelled(-2147217358),
    
    /**
     * (-2147217357)
     */
    wbemErrShuttingDown(-2147217357),
    
    /**
     * (-2147217356)
     */
    wbemErrPropagatedMethod(-2147217356),
    
    /**
     * (-2147217355)
     */
    wbemErrUnsupportedParameter(-2147217355),
    
    /**
     * (-2147217354)
     */
    wbemErrMissingParameter(-2147217354),
    
    /**
     * (-2147217353)
     */
    wbemErrInvalidParameterId(-2147217353),
    
    /**
     * (-2147217352)
     */
    wbemErrNonConsecutiveParameterIds(-2147217352),
    
    /**
     * (-2147217351)
     */
    wbemErrParameterIdOnRetval(-2147217351),
    
    /**
     * (-2147217350)
     */
    wbemErrInvalidObjectPath(-2147217350),
    
    /**
     * (-2147217349)
     */
    wbemErrOutOfDiskSpace(-2147217349),
    
    /**
     * (-2147217348)
     */
    wbemErrBufferTooSmall(-2147217348),
    
    /**
     * (-2147217347)
     */
    wbemErrUnsupportedPutExtension(-2147217347),
    
    /**
     * (-2147217346)
     */
    wbemErrUnknownObjectType(-2147217346),
    
    /**
     * (-2147217345)
     */
    wbemErrUnknownPacketType(-2147217345),
    
    /**
     * (-2147217344)
     */
    wbemErrMarshalVersionMismatch(-2147217344),
    
    /**
     * (-2147217343)
     */
    wbemErrMarshalInvalidSignature(-2147217343),
    
    /**
     * (-2147217342)
     */
    wbemErrInvalidQualifier(-2147217342),
    
    /**
     * (-2147217341)
     */
    wbemErrInvalidDuplicateParameter(-2147217341),
    
    /**
     * (-2147217340)
     */
    wbemErrTooMuchData(-2147217340),
    
    /**
     * (-2147217339)
     */
    wbemErrServerTooBusy(-2147217339),
    
    /**
     * (-2147217338)
     */
    wbemErrInvalidFlavor(-2147217338),
    
    /**
     * (-2147217337)
     */
    wbemErrCircularReference(-2147217337),
    
    /**
     * (-2147217336)
     */
    wbemErrUnsupportedClassUpdate(-2147217336),
    
    /**
     * (-2147217335)
     */
    wbemErrCannotChangeKeyInheritance(-2147217335),
    
    /**
     * (-2147217328)
     */
    wbemErrCannotChangeIndexInheritance(-2147217328),
    
    /**
     * (-2147217327)
     */
    wbemErrTooManyProperties(-2147217327),
    
    /**
     * (-2147217326)
     */
    wbemErrUpdateTypeMismatch(-2147217326),
    
    /**
     * (-2147217325)
     */
    wbemErrUpdateOverrideNotAllowed(-2147217325),
    
    /**
     * (-2147217324)
     */
    wbemErrUpdatePropagatedMethod(-2147217324),
    
    /**
     * (-2147217323)
     */
    wbemErrMethodNotImplemented(-2147217323),
    
    /**
     * (-2147217322)
     */
    wbemErrMethodDisabled(-2147217322),
    
    /**
     * (-2147217321)
     */
    wbemErrRefresherBusy(-2147217321),
    
    /**
     * (-2147217320)
     */
    wbemErrUnparsableQuery(-2147217320),
    
    /**
     * (-2147217319)
     */
    wbemErrNotEventClass(-2147217319),
    
    /**
     * (-2147217318)
     */
    wbemErrMissingGroupWithin(-2147217318),
    
    /**
     * (-2147217317)
     */
    wbemErrMissingAggregationList(-2147217317),
    
    /**
     * (-2147217316)
     */
    wbemErrPropertyNotAnObject(-2147217316),
    
    /**
     * (-2147217315)
     */
    wbemErrAggregatingByObject(-2147217315),
    
    /**
     * (-2147217313)
     */
    wbemErrUninterpretableProviderQuery(-2147217313),
    
    /**
     * (-2147217312)
     */
    wbemErrBackupRestoreWinmgmtRunning(-2147217312),
    
    /**
     * (-2147217311)
     */
    wbemErrQueueOverflow(-2147217311),
    
    /**
     * (-2147217310)
     */
    wbemErrPrivilegeNotHeld(-2147217310),
    
    /**
     * (-2147217309)
     */
    wbemErrInvalidOperator(-2147217309),
    
    /**
     * (-2147217308)
     */
    wbemErrLocalCredentials(-2147217308),
    
    /**
     * (-2147217307)
     */
    wbemErrCannotBeAbstract(-2147217307),
    
    /**
     * (-2147217306)
     */
    wbemErrAmendedObject(-2147217306),
    
    /**
     * (-2147217305)
     */
    wbemErrClientTooSlow(-2147217305),
    
    /**
     * (-2147217304)
     */
    wbemErrNullSecurityDescriptor(-2147217304),
    
    /**
     * (-2147217303)
     */
    wbemErrTimeout(-2147217303),
    
    /**
     * (-2147217302)
     */
    wbemErrInvalidAssociation(-2147217302),
    
    /**
     * (-2147217301)
     */
    wbemErrAmbiguousOperation(-2147217301),
    
    /**
     * (-2147217300)
     */
    wbemErrQuotaViolation(-2147217300),
    
    /**
     * (-2147217299)
     */
    wbemErrTransactionConflict(-2147217299),
    
    /**
     * (-2147217298)
     */
    wbemErrForcedRollback(-2147217298),
    
    /**
     * (-2147217297)
     */
    wbemErrUnsupportedLocale(-2147217297),
    
    /**
     * (-2147217296)
     */
    wbemErrHandleOutOfDate(-2147217296),
    
    /**
     * (-2147217295)
     */
    wbemErrConnectionFailed(-2147217295),
    
    /**
     * (-2147217294)
     */
    wbemErrInvalidHandleRequest(-2147217294),
    
    /**
     * (-2147217293)
     */
    wbemErrPropertyNameTooWide(-2147217293),
    
    /**
     * (-2147217292)
     */
    wbemErrClassNameTooWide(-2147217292),
    
    /**
     * (-2147217291)
     */
    wbemErrMethodNameTooWide(-2147217291),
    
    /**
     * (-2147217290)
     */
    wbemErrQualifierNameTooWide(-2147217290),
    
    /**
     * (-2147217289)
     */
    wbemErrRerunCommand(-2147217289),
    
    /**
     * (-2147217288)
     */
    wbemErrDatabaseVerMismatch(-2147217288),
    
    /**
     * (-2147217287)
     */
    wbemErrVetoPut(-2147217287),
    
    /**
     * (-2147217286)
     */
    wbemErrVetoDelete(-2147217286),
    
    /**
     * (-2147217280)
     */
    wbemErrInvalidLocale(-2147217280),
    
    /**
     * (-2147217279)
     */
    wbemErrProviderSuspended(-2147217279),
    
    /**
     * (-2147217278)
     */
    wbemErrSynchronizationRequired(-2147217278),
    
    /**
     * (-2147217277)
     */
    wbemErrNoSchema(-2147217277),
    
    /**
     * (-2147217276)
     */
    wbemErrProviderAlreadyRegistered(-2147217276),
    
    /**
     * (-2147217275)
     */
    wbemErrProviderNotRegistered(-2147217275),
    
    /**
     * (-2147217274)
     */
    wbemErrFatalTransportError(-2147217274),
    
    /**
     * (-2147217273)
     */
    wbemErrEncryptedConnectionRequired(-2147217273),
    
    /**
     * (-2147213311)
     */
    wbemErrRegistrationTooBroad(-2147213311),
    
    /**
     * (-2147213310)
     */
    wbemErrRegistrationTooPrecise(-2147213310),
    
    /**
     * (-2147209215)
     */
    wbemErrTimedout(-2147209215),
    
    /**
     * (-2147209214)
     */
    wbemErrResetToDefault(-2147209214),
    ;

    private WbemErrorEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}