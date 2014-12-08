
package de.scrummies.scrumService;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.scrummies.scrumService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _AbstractExtentions_QNAME = new QName("http://www.fuldaai.de", "AbstractExtentions");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _BugState_QNAME = new QName("http://www.fuldaai.de", "BugState");
    private final static QName _UserStory_QNAME = new QName("http://www.fuldaai.de", "UserStory");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _AbstractEntity_QNAME = new QName("http://www.fuldaai.de", "AbstractEntity");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Bug_QNAME = new QName("http://www.fuldaai.de", "Bug");
    private final static QName _Severity_QNAME = new QName("http://www.fuldaai.de", "Severity");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ArrayOfBug_QNAME = new QName("http://www.fuldaai.de", "ArrayOfBug");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _BugResolvedByFilter_QNAME = new QName("http://www.fuldaai.de", "BugResolvedByFilter");
    private final static QName _UserStoryState_QNAME = new QName("http://www.fuldaai.de", "UserStoryState");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _BugDateRangeFilter_QNAME = new QName("http://www.fuldaai.de", "BugDateRangeFilter");
    private final static QName _BugReasonFilter_QNAME = new QName("http://www.fuldaai.de", "BugReasonFilter");
    private final static QName _BugReason_QNAME = new QName("http://www.fuldaai.de", "BugReason");
    private final static QName _ArrayOfBugReason_QNAME = new QName("http://www.fuldaai.de", "ArrayOfBugReason");
    private final static QName _BugExtention_QNAME = new QName("http://www.fuldaai.de", "BugExtention");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfUserStoryExtention_QNAME = new QName("http://www.fuldaai.de", "ArrayOfUserStoryExtention");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _BugStateFilter_QNAME = new QName("http://www.fuldaai.de", "BugStateFilter");
    private final static QName _ArrayOfOrder_QNAME = new QName("http://www.fuldaai.de", "ArrayOfOrder");
    private final static QName _ArrayOfSprintAssignment_QNAME = new QName("http://www.fuldaai.de", "ArrayOfSprintAssignment");
    private final static QName _ArrayOfBugExtention_QNAME = new QName("http://www.fuldaai.de", "ArrayOfBugExtention");
    private final static QName _BugClosedDateFilter_QNAME = new QName("http://www.fuldaai.de", "BugClosedDateFilter");
    private final static QName _UserStoryExtention_QNAME = new QName("http://www.fuldaai.de", "UserStoryExtention");
    private final static QName _SprintAssignment_QNAME = new QName("http://www.fuldaai.de", "SprintAssignment");
    private final static QName _ArrayOfUserStory_QNAME = new QName("http://www.fuldaai.de", "ArrayOfUserStory");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfBugFilter_QNAME = new QName("http://www.fuldaai.de", "ArrayOfBugFilter");
    private final static QName _ArrayOfBugState_QNAME = new QName("http://www.fuldaai.de", "ArrayOfBugState");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _AbstractWorkItem_QNAME = new QName("http://www.fuldaai.de", "AbstractWorkItem");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Sprint_QNAME = new QName("http://www.fuldaai.de", "Sprint");
    private final static QName _ArrayOfSeverity_QNAME = new QName("http://www.fuldaai.de", "ArrayOfSeverity");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _BugFilter_QNAME = new QName("http://www.fuldaai.de", "BugFilter");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Order_QNAME = new QName("http://www.fuldaai.de", "Order");
    private final static QName _BugResolvedDateFilter_QNAME = new QName("http://www.fuldaai.de", "BugResolvedDateFilter");
    private final static QName _ArrayOfSprint_QNAME = new QName("http://www.fuldaai.de", "ArrayOfSprint");
    private final static QName _BugSeverityFilter_QNAME = new QName("http://www.fuldaai.de", "BugSeverityFilter");
    private final static QName _BugCreateBug_QNAME = new QName("http://tempuri.org/", "bug");
    private final static QName _BugReasonFilterBugReasons_QNAME = new QName("http://www.fuldaai.de", "BugReasons");
    private final static QName _BugReasonFilterBugReasonsExclude_QNAME = new QName("http://www.fuldaai.de", "BugReasonsExclude");
    private final static QName _SprintCreateSprint_QNAME = new QName("http://tempuri.org/", "sprint");
    private final static QName _UserStoryFindBySearchStringSearchString_QNAME = new QName("http://tempuri.org/", "searchString");
    private final static QName _BugFindAllResponseBugFindAllResult_QNAME = new QName("http://tempuri.org/", "BugFindAllResult");
    private final static QName _UserStoryUpdateUserStory_QNAME = new QName("http://tempuri.org/", "userStory");
    private final static QName _UserStoryFindAllResponseUserStoryFindAllResult_QNAME = new QName("http://tempuri.org/", "UserStoryFindAllResult");
    private final static QName _BugFindBySearchStringResponseBugFindBySearchStringResult_QNAME = new QName("http://tempuri.org/", "BugFindBySearchStringResult");
    private final static QName _BugClosedDate_QNAME = new QName("http://www.fuldaai.de", "ClosedDate");
    private final static QName _BugExtentions_QNAME = new QName("http://www.fuldaai.de", "Extentions");
    private final static QName _BugResolvedBy_QNAME = new QName("http://www.fuldaai.de", "ResolvedBy");
    private final static QName _BugResolvedDate_QNAME = new QName("http://www.fuldaai.de", "ResolvedDate");
    private final static QName _BugContent_QNAME = new QName("http://www.fuldaai.de", "Content");
    private final static QName _BugTitle_QNAME = new QName("http://www.fuldaai.de", "Title");
    private final static QName _BugClosedBy_QNAME = new QName("http://www.fuldaai.de", "ClosedBy");
    private final static QName _SprintAssignmentSprintId_QNAME = new QName("http://www.fuldaai.de", "SprintId");
    private final static QName _BugDateRangeFilterEnd_QNAME = new QName("http://www.fuldaai.de", "End");
    private final static QName _BugDateRangeFilterStart_QNAME = new QName("http://www.fuldaai.de", "Start");
    private final static QName _TeamCreateTeamName_QNAME = new QName("http://tempuri.org/", "teamName");
    private final static QName _TeamCreatePassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _TeamCreateMagicWord_QNAME = new QName("http://tempuri.org/", "magicWord");
    private final static QName _BugSeverityFilterBugSeverity_QNAME = new QName("http://www.fuldaai.de", "BugSeverity");
    private final static QName _BugSeverityFilterBugSeverityExclude_QNAME = new QName("http://www.fuldaai.de", "BugSeverityExclude");
    private final static QName _SprintFindByIdResponseSprintFindByIdResult_QNAME = new QName("http://tempuri.org/", "SprintFindByIdResult");
    private final static QName _UserStoryFindBySearchStringResponseUserStoryFindBySearchStringResult_QNAME = new QName("http://tempuri.org/", "UserStoryFindBySearchStringResult");
    private final static QName _UserStorySetPrioPrioList_QNAME = new QName("http://tempuri.org/", "prioList");
    private final static QName _BugStateFilterBugStatesExclude_QNAME = new QName("http://www.fuldaai.de", "BugStatesExclude");
    private final static QName _BugStateFilterBugStates_QNAME = new QName("http://www.fuldaai.de", "BugStates");
    private final static QName _SprintFindAllResponseSprintFindAllResult_QNAME = new QName("http://tempuri.org/", "SprintFindAllResult");
    private final static QName _UserStoryStoryPoints_QNAME = new QName("http://www.fuldaai.de", "StoryPoints");
    private final static QName _TeamLoginMagicword_QNAME = new QName("http://tempuri.org/", "magicword");
    private final static QName _AbstractExtentionsKey_QNAME = new QName("http://www.fuldaai.de", "Key");
    private final static QName _AbstractExtentionsDataType_QNAME = new QName("http://www.fuldaai.de", "DataType");
    private final static QName _UserStoryFindByIdResponseUserStoryFindByIdResult_QNAME = new QName("http://tempuri.org/", "UserStoryFindByIdResult");
    private final static QName _BugFindByIdResponseBugFindByIdResult_QNAME = new QName("http://tempuri.org/", "BugFindByIdResult");
    private final static QName _BugFindResponseBugFindResult_QNAME = new QName("http://tempuri.org/", "BugFindResult");
    private final static QName _UserStorySetSprintSprintAssignment_QNAME = new QName("http://tempuri.org/", "sprintAssignment");
    private final static QName _SprintUserStories_QNAME = new QName("http://www.fuldaai.de", "UserStories");
    private final static QName _BugFindBugFilters_QNAME = new QName("http://tempuri.org/", "bugFilters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.scrummies.scrumService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BugRemoveAllResponse }
     * 
     */
    public BugRemoveAllResponse createBugRemoveAllResponse() {
        return new BugRemoveAllResponse();
    }

    /**
     * Create an instance of {@link SprintCreateResponse }
     * 
     */
    public SprintCreateResponse createSprintCreateResponse() {
        return new SprintCreateResponse();
    }

    /**
     * Create an instance of {@link UserStoryFindAllResponse }
     * 
     */
    public UserStoryFindAllResponse createUserStoryFindAllResponse() {
        return new UserStoryFindAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserStory }
     * 
     */
    public ArrayOfUserStory createArrayOfUserStory() {
        return new ArrayOfUserStory();
    }

    /**
     * Create an instance of {@link UserStorySetSprint }
     * 
     */
    public UserStorySetSprint createUserStorySetSprint() {
        return new UserStorySetSprint();
    }

    /**
     * Create an instance of {@link ArrayOfSprintAssignment }
     * 
     */
    public ArrayOfSprintAssignment createArrayOfSprintAssignment() {
        return new ArrayOfSprintAssignment();
    }

    /**
     * Create an instance of {@link UserStoryFindBySearchStringResponse }
     * 
     */
    public UserStoryFindBySearchStringResponse createUserStoryFindBySearchStringResponse() {
        return new UserStoryFindBySearchStringResponse();
    }

    /**
     * Create an instance of {@link BugFindById }
     * 
     */
    public BugFindById createBugFindById() {
        return new BugFindById();
    }

    /**
     * Create an instance of {@link SprintRemove }
     * 
     */
    public SprintRemove createSprintRemove() {
        return new SprintRemove();
    }

    /**
     * Create an instance of {@link SprintFindAllResponse }
     * 
     */
    public SprintFindAllResponse createSprintFindAllResponse() {
        return new SprintFindAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSprint }
     * 
     */
    public ArrayOfSprint createArrayOfSprint() {
        return new ArrayOfSprint();
    }

    /**
     * Create an instance of {@link UserStoryFindByIdResponse }
     * 
     */
    public UserStoryFindByIdResponse createUserStoryFindByIdResponse() {
        return new UserStoryFindByIdResponse();
    }

    /**
     * Create an instance of {@link UserStory }
     * 
     */
    public UserStory createUserStory() {
        return new UserStory();
    }

    /**
     * Create an instance of {@link BugFindBySearchString }
     * 
     */
    public BugFindBySearchString createBugFindBySearchString() {
        return new BugFindBySearchString();
    }

    /**
     * Create an instance of {@link BugRemoveResponse }
     * 
     */
    public BugRemoveResponse createBugRemoveResponse() {
        return new BugRemoveResponse();
    }

    /**
     * Create an instance of {@link BugRemoveAll }
     * 
     */
    public BugRemoveAll createBugRemoveAll() {
        return new BugRemoveAll();
    }

    /**
     * Create an instance of {@link BugFindAllResponse }
     * 
     */
    public BugFindAllResponse createBugFindAllResponse() {
        return new BugFindAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBug }
     * 
     */
    public ArrayOfBug createArrayOfBug() {
        return new ArrayOfBug();
    }

    /**
     * Create an instance of {@link UserStoryRemoveAllResponse }
     * 
     */
    public UserStoryRemoveAllResponse createUserStoryRemoveAllResponse() {
        return new UserStoryRemoveAllResponse();
    }

    /**
     * Create an instance of {@link UserStoryFindBySearchString }
     * 
     */
    public UserStoryFindBySearchString createUserStoryFindBySearchString() {
        return new UserStoryFindBySearchString();
    }

    /**
     * Create an instance of {@link SprintUpdate }
     * 
     */
    public SprintUpdate createSprintUpdate() {
        return new SprintUpdate();
    }

    /**
     * Create an instance of {@link Sprint }
     * 
     */
    public Sprint createSprint() {
        return new Sprint();
    }

    /**
     * Create an instance of {@link UserStorySetPrioResponse }
     * 
     */
    public UserStorySetPrioResponse createUserStorySetPrioResponse() {
        return new UserStorySetPrioResponse();
    }

    /**
     * Create an instance of {@link BugFindBySearchStringResponse }
     * 
     */
    public BugFindBySearchStringResponse createBugFindBySearchStringResponse() {
        return new BugFindBySearchStringResponse();
    }

    /**
     * Create an instance of {@link BugUpdateResponse }
     * 
     */
    public BugUpdateResponse createBugUpdateResponse() {
        return new BugUpdateResponse();
    }

    /**
     * Create an instance of {@link BugRemove }
     * 
     */
    public BugRemove createBugRemove() {
        return new BugRemove();
    }

    /**
     * Create an instance of {@link BugFindByIdResponse }
     * 
     */
    public BugFindByIdResponse createBugFindByIdResponse() {
        return new BugFindByIdResponse();
    }

    /**
     * Create an instance of {@link Bug }
     * 
     */
    public Bug createBug() {
        return new Bug();
    }

    /**
     * Create an instance of {@link TeamCreate }
     * 
     */
    public TeamCreate createTeamCreate() {
        return new TeamCreate();
    }

    /**
     * Create an instance of {@link SprintFindById }
     * 
     */
    public SprintFindById createSprintFindById() {
        return new SprintFindById();
    }

    /**
     * Create an instance of {@link BugFindAll }
     * 
     */
    public BugFindAll createBugFindAll() {
        return new BugFindAll();
    }

    /**
     * Create an instance of {@link UserStoryRemove }
     * 
     */
    public UserStoryRemove createUserStoryRemove() {
        return new UserStoryRemove();
    }

    /**
     * Create an instance of {@link UserStoryUpdateResponse }
     * 
     */
    public UserStoryUpdateResponse createUserStoryUpdateResponse() {
        return new UserStoryUpdateResponse();
    }

    /**
     * Create an instance of {@link SprintCreate }
     * 
     */
    public SprintCreate createSprintCreate() {
        return new SprintCreate();
    }

    /**
     * Create an instance of {@link TeamLoginResponse }
     * 
     */
    public TeamLoginResponse createTeamLoginResponse() {
        return new TeamLoginResponse();
    }

    /**
     * Create an instance of {@link BugCreate }
     * 
     */
    public BugCreate createBugCreate() {
        return new BugCreate();
    }

    /**
     * Create an instance of {@link UserStoryRemoveAll }
     * 
     */
    public UserStoryRemoveAll createUserStoryRemoveAll() {
        return new UserStoryRemoveAll();
    }

    /**
     * Create an instance of {@link TeamForget }
     * 
     */
    public TeamForget createTeamForget() {
        return new TeamForget();
    }

    /**
     * Create an instance of {@link BugUpdate }
     * 
     */
    public BugUpdate createBugUpdate() {
        return new BugUpdate();
    }

    /**
     * Create an instance of {@link UserStorySetSprintResponse }
     * 
     */
    public UserStorySetSprintResponse createUserStorySetSprintResponse() {
        return new UserStorySetSprintResponse();
    }

    /**
     * Create an instance of {@link SprintFindAll }
     * 
     */
    public SprintFindAll createSprintFindAll() {
        return new SprintFindAll();
    }

    /**
     * Create an instance of {@link UserStoryUpdate }
     * 
     */
    public UserStoryUpdate createUserStoryUpdate() {
        return new UserStoryUpdate();
    }

    /**
     * Create an instance of {@link BugFind }
     * 
     */
    public BugFind createBugFind() {
        return new BugFind();
    }

    /**
     * Create an instance of {@link ArrayOfBugFilter }
     * 
     */
    public ArrayOfBugFilter createArrayOfBugFilter() {
        return new ArrayOfBugFilter();
    }

    /**
     * Create an instance of {@link TeamReset }
     * 
     */
    public TeamReset createTeamReset() {
        return new TeamReset();
    }

    /**
     * Create an instance of {@link UserStoryCreateResponse }
     * 
     */
    public UserStoryCreateResponse createUserStoryCreateResponse() {
        return new UserStoryCreateResponse();
    }

    /**
     * Create an instance of {@link SprintFindByIdResponse }
     * 
     */
    public SprintFindByIdResponse createSprintFindByIdResponse() {
        return new SprintFindByIdResponse();
    }

    /**
     * Create an instance of {@link UserStoryFindById }
     * 
     */
    public UserStoryFindById createUserStoryFindById() {
        return new UserStoryFindById();
    }

    /**
     * Create an instance of {@link UserStoryCreate }
     * 
     */
    public UserStoryCreate createUserStoryCreate() {
        return new UserStoryCreate();
    }

    /**
     * Create an instance of {@link TeamCreateResponse }
     * 
     */
    public TeamCreateResponse createTeamCreateResponse() {
        return new TeamCreateResponse();
    }

    /**
     * Create an instance of {@link SprintRemoveAll }
     * 
     */
    public SprintRemoveAll createSprintRemoveAll() {
        return new SprintRemoveAll();
    }

    /**
     * Create an instance of {@link BugFindResponse }
     * 
     */
    public BugFindResponse createBugFindResponse() {
        return new BugFindResponse();
    }

    /**
     * Create an instance of {@link SprintRemoveResponse }
     * 
     */
    public SprintRemoveResponse createSprintRemoveResponse() {
        return new SprintRemoveResponse();
    }

    /**
     * Create an instance of {@link UserStoryFindAll }
     * 
     */
    public UserStoryFindAll createUserStoryFindAll() {
        return new UserStoryFindAll();
    }

    /**
     * Create an instance of {@link TeamResetResponse }
     * 
     */
    public TeamResetResponse createTeamResetResponse() {
        return new TeamResetResponse();
    }

    /**
     * Create an instance of {@link UserStoryRemoveResponse }
     * 
     */
    public UserStoryRemoveResponse createUserStoryRemoveResponse() {
        return new UserStoryRemoveResponse();
    }

    /**
     * Create an instance of {@link SprintRemoveAllResponse }
     * 
     */
    public SprintRemoveAllResponse createSprintRemoveAllResponse() {
        return new SprintRemoveAllResponse();
    }

    /**
     * Create an instance of {@link UserStorySetPrio }
     * 
     */
    public UserStorySetPrio createUserStorySetPrio() {
        return new UserStorySetPrio();
    }

    /**
     * Create an instance of {@link ArrayOfOrder }
     * 
     */
    public ArrayOfOrder createArrayOfOrder() {
        return new ArrayOfOrder();
    }

    /**
     * Create an instance of {@link TeamForgetResponse }
     * 
     */
    public TeamForgetResponse createTeamForgetResponse() {
        return new TeamForgetResponse();
    }

    /**
     * Create an instance of {@link SprintUpdateResponse }
     * 
     */
    public SprintUpdateResponse createSprintUpdateResponse() {
        return new SprintUpdateResponse();
    }

    /**
     * Create an instance of {@link BugCreateResponse }
     * 
     */
    public BugCreateResponse createBugCreateResponse() {
        return new BugCreateResponse();
    }

    /**
     * Create an instance of {@link TeamLogin }
     * 
     */
    public TeamLogin createTeamLogin() {
        return new TeamLogin();
    }

    /**
     * Create an instance of {@link ArrayOfSeverity }
     * 
     */
    public ArrayOfSeverity createArrayOfSeverity() {
        return new ArrayOfSeverity();
    }

    /**
     * Create an instance of {@link BugFilter }
     * 
     */
    public BugFilter createBugFilter() {
        return new BugFilter();
    }

    /**
     * Create an instance of {@link BugDateRangeFilter }
     * 
     */
    public BugDateRangeFilter createBugDateRangeFilter() {
        return new BugDateRangeFilter();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link BugReasonFilter }
     * 
     */
    public BugReasonFilter createBugReasonFilter() {
        return new BugReasonFilter();
    }

    /**
     * Create an instance of {@link BugResolvedDateFilter }
     * 
     */
    public BugResolvedDateFilter createBugResolvedDateFilter() {
        return new BugResolvedDateFilter();
    }

    /**
     * Create an instance of {@link BugSeverityFilter }
     * 
     */
    public BugSeverityFilter createBugSeverityFilter() {
        return new BugSeverityFilter();
    }

    /**
     * Create an instance of {@link UserStoryExtention }
     * 
     */
    public UserStoryExtention createUserStoryExtention() {
        return new UserStoryExtention();
    }

    /**
     * Create an instance of {@link SprintAssignment }
     * 
     */
    public SprintAssignment createSprintAssignment() {
        return new SprintAssignment();
    }

    /**
     * Create an instance of {@link BugResolvedByFilter }
     * 
     */
    public BugResolvedByFilter createBugResolvedByFilter() {
        return new BugResolvedByFilter();
    }

    /**
     * Create an instance of {@link ArrayOfBugState }
     * 
     */
    public ArrayOfBugState createArrayOfBugState() {
        return new ArrayOfBugState();
    }

    /**
     * Create an instance of {@link AbstractWorkItem }
     * 
     */
    public AbstractWorkItem createAbstractWorkItem() {
        return new AbstractWorkItem();
    }

    /**
     * Create an instance of {@link BugStateFilter }
     * 
     */
    public BugStateFilter createBugStateFilter() {
        return new BugStateFilter();
    }

    /**
     * Create an instance of {@link ArrayOfUserStoryExtention }
     * 
     */
    public ArrayOfUserStoryExtention createArrayOfUserStoryExtention() {
        return new ArrayOfUserStoryExtention();
    }

    /**
     * Create an instance of {@link AbstractEntity }
     * 
     */
    public AbstractEntity createAbstractEntity() {
        return new AbstractEntity();
    }

    /**
     * Create an instance of {@link ArrayOfBugExtention }
     * 
     */
    public ArrayOfBugExtention createArrayOfBugExtention() {
        return new ArrayOfBugExtention();
    }

    /**
     * Create an instance of {@link BugClosedDateFilter }
     * 
     */
    public BugClosedDateFilter createBugClosedDateFilter() {
        return new BugClosedDateFilter();
    }

    /**
     * Create an instance of {@link ArrayOfBugReason }
     * 
     */
    public ArrayOfBugReason createArrayOfBugReason() {
        return new ArrayOfBugReason();
    }

    /**
     * Create an instance of {@link BugExtention }
     * 
     */
    public BugExtention createBugExtention() {
        return new BugExtention();
    }

    /**
     * Create an instance of {@link AbstractExtentions }
     * 
     */
    public AbstractExtentions createAbstractExtentions() {
        return new AbstractExtentions();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtentions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "AbstractExtentions")
    public JAXBElement<AbstractExtentions> createAbstractExtentions(AbstractExtentions value) {
        return new JAXBElement<AbstractExtentions>(_AbstractExtentions_QNAME, AbstractExtentions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugState")
    public JAXBElement<BugState> createBugState(BugState value) {
        return new JAXBElement<BugState>(_BugState_QNAME, BugState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "UserStory")
    public JAXBElement<UserStory> createUserStory(UserStory value) {
        return new JAXBElement<UserStory>(_UserStory_QNAME, UserStory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "AbstractEntity")
    public JAXBElement<AbstractEntity> createAbstractEntity(AbstractEntity value) {
        return new JAXBElement<AbstractEntity>(_AbstractEntity_QNAME, AbstractEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Bug")
    public JAXBElement<Bug> createBug(Bug value) {
        return new JAXBElement<Bug>(_Bug_QNAME, Bug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Severity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Severity")
    public JAXBElement<Severity> createSeverity(Severity value) {
        return new JAXBElement<Severity>(_Severity_QNAME, Severity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfBug")
    public JAXBElement<ArrayOfBug> createArrayOfBug(ArrayOfBug value) {
        return new JAXBElement<ArrayOfBug>(_ArrayOfBug_QNAME, ArrayOfBug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugResolvedByFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugResolvedByFilter")
    public JAXBElement<BugResolvedByFilter> createBugResolvedByFilter(BugResolvedByFilter value) {
        return new JAXBElement<BugResolvedByFilter>(_BugResolvedByFilter_QNAME, BugResolvedByFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStoryState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "UserStoryState")
    public JAXBElement<UserStoryState> createUserStoryState(UserStoryState value) {
        return new JAXBElement<UserStoryState>(_UserStoryState_QNAME, UserStoryState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugDateRangeFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugDateRangeFilter")
    public JAXBElement<BugDateRangeFilter> createBugDateRangeFilter(BugDateRangeFilter value) {
        return new JAXBElement<BugDateRangeFilter>(_BugDateRangeFilter_QNAME, BugDateRangeFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugReasonFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugReasonFilter")
    public JAXBElement<BugReasonFilter> createBugReasonFilter(BugReasonFilter value) {
        return new JAXBElement<BugReasonFilter>(_BugReasonFilter_QNAME, BugReasonFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugReason")
    public JAXBElement<BugReason> createBugReason(BugReason value) {
        return new JAXBElement<BugReason>(_BugReason_QNAME, BugReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfBugReason")
    public JAXBElement<ArrayOfBugReason> createArrayOfBugReason(ArrayOfBugReason value) {
        return new JAXBElement<ArrayOfBugReason>(_ArrayOfBugReason_QNAME, ArrayOfBugReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugExtention }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugExtention")
    public JAXBElement<BugExtention> createBugExtention(BugExtention value) {
        return new JAXBElement<BugExtention>(_BugExtention_QNAME, BugExtention.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserStoryExtention }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfUserStoryExtention")
    public JAXBElement<ArrayOfUserStoryExtention> createArrayOfUserStoryExtention(ArrayOfUserStoryExtention value) {
        return new JAXBElement<ArrayOfUserStoryExtention>(_ArrayOfUserStoryExtention_QNAME, ArrayOfUserStoryExtention.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugStateFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugStateFilter")
    public JAXBElement<BugStateFilter> createBugStateFilter(BugStateFilter value) {
        return new JAXBElement<BugStateFilter>(_BugStateFilter_QNAME, BugStateFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfOrder")
    public JAXBElement<ArrayOfOrder> createArrayOfOrder(ArrayOfOrder value) {
        return new JAXBElement<ArrayOfOrder>(_ArrayOfOrder_QNAME, ArrayOfOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSprintAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfSprintAssignment")
    public JAXBElement<ArrayOfSprintAssignment> createArrayOfSprintAssignment(ArrayOfSprintAssignment value) {
        return new JAXBElement<ArrayOfSprintAssignment>(_ArrayOfSprintAssignment_QNAME, ArrayOfSprintAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugExtention }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfBugExtention")
    public JAXBElement<ArrayOfBugExtention> createArrayOfBugExtention(ArrayOfBugExtention value) {
        return new JAXBElement<ArrayOfBugExtention>(_ArrayOfBugExtention_QNAME, ArrayOfBugExtention.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugClosedDateFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugClosedDateFilter")
    public JAXBElement<BugClosedDateFilter> createBugClosedDateFilter(BugClosedDateFilter value) {
        return new JAXBElement<BugClosedDateFilter>(_BugClosedDateFilter_QNAME, BugClosedDateFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStoryExtention }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "UserStoryExtention")
    public JAXBElement<UserStoryExtention> createUserStoryExtention(UserStoryExtention value) {
        return new JAXBElement<UserStoryExtention>(_UserStoryExtention_QNAME, UserStoryExtention.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SprintAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "SprintAssignment")
    public JAXBElement<SprintAssignment> createSprintAssignment(SprintAssignment value) {
        return new JAXBElement<SprintAssignment>(_SprintAssignment_QNAME, SprintAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserStory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfUserStory")
    public JAXBElement<ArrayOfUserStory> createArrayOfUserStory(ArrayOfUserStory value) {
        return new JAXBElement<ArrayOfUserStory>(_ArrayOfUserStory_QNAME, ArrayOfUserStory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfBugFilter")
    public JAXBElement<ArrayOfBugFilter> createArrayOfBugFilter(ArrayOfBugFilter value) {
        return new JAXBElement<ArrayOfBugFilter>(_ArrayOfBugFilter_QNAME, ArrayOfBugFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfBugState")
    public JAXBElement<ArrayOfBugState> createArrayOfBugState(ArrayOfBugState value) {
        return new JAXBElement<ArrayOfBugState>(_ArrayOfBugState_QNAME, ArrayOfBugState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractWorkItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "AbstractWorkItem")
    public JAXBElement<AbstractWorkItem> createAbstractWorkItem(AbstractWorkItem value) {
        return new JAXBElement<AbstractWorkItem>(_AbstractWorkItem_QNAME, AbstractWorkItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Sprint")
    public JAXBElement<Sprint> createSprint(Sprint value) {
        return new JAXBElement<Sprint>(_Sprint_QNAME, Sprint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfSeverity")
    public JAXBElement<ArrayOfSeverity> createArrayOfSeverity(ArrayOfSeverity value) {
        return new JAXBElement<ArrayOfSeverity>(_ArrayOfSeverity_QNAME, ArrayOfSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugFilter")
    public JAXBElement<BugFilter> createBugFilter(BugFilter value) {
        return new JAXBElement<BugFilter>(_BugFilter_QNAME, BugFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugResolvedDateFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugResolvedDateFilter")
    public JAXBElement<BugResolvedDateFilter> createBugResolvedDateFilter(BugResolvedDateFilter value) {
        return new JAXBElement<BugResolvedDateFilter>(_BugResolvedDateFilter_QNAME, BugResolvedDateFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ArrayOfSprint")
    public JAXBElement<ArrayOfSprint> createArrayOfSprint(ArrayOfSprint value) {
        return new JAXBElement<ArrayOfSprint>(_ArrayOfSprint_QNAME, ArrayOfSprint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BugSeverityFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugSeverityFilter")
    public JAXBElement<BugSeverityFilter> createBugSeverityFilter(BugSeverityFilter value) {
        return new JAXBElement<BugSeverityFilter>(_BugSeverityFilter_QNAME, BugSeverityFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "bug", scope = BugCreate.class)
    public JAXBElement<Bug> createBugCreateBug(Bug value) {
        return new JAXBElement<Bug>(_BugCreateBug_QNAME, Bug.class, BugCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugReasons", scope = BugReasonFilter.class)
    public JAXBElement<ArrayOfBugReason> createBugReasonFilterBugReasons(ArrayOfBugReason value) {
        return new JAXBElement<ArrayOfBugReason>(_BugReasonFilterBugReasons_QNAME, ArrayOfBugReason.class, BugReasonFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugReasonsExclude", scope = BugReasonFilter.class)
    public JAXBElement<ArrayOfBugReason> createBugReasonFilterBugReasonsExclude(ArrayOfBugReason value) {
        return new JAXBElement<ArrayOfBugReason>(_BugReasonFilterBugReasonsExclude_QNAME, ArrayOfBugReason.class, BugReasonFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sprint", scope = SprintCreate.class)
    public JAXBElement<Sprint> createSprintCreateSprint(Sprint value) {
        return new JAXBElement<Sprint>(_SprintCreateSprint_QNAME, Sprint.class, SprintCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchString", scope = UserStoryFindBySearchString.class)
    public JAXBElement<String> createUserStoryFindBySearchStringSearchString(String value) {
        return new JAXBElement<String>(_UserStoryFindBySearchStringSearchString_QNAME, String.class, UserStoryFindBySearchString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BugFindAllResult", scope = BugFindAllResponse.class)
    public JAXBElement<ArrayOfBug> createBugFindAllResponseBugFindAllResult(ArrayOfBug value) {
        return new JAXBElement<ArrayOfBug>(_BugFindAllResponseBugFindAllResult_QNAME, ArrayOfBug.class, BugFindAllResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userStory", scope = UserStoryUpdate.class)
    public JAXBElement<UserStory> createUserStoryUpdateUserStory(UserStory value) {
        return new JAXBElement<UserStory>(_UserStoryUpdateUserStory_QNAME, UserStory.class, UserStoryUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserStory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserStoryFindAllResult", scope = UserStoryFindAllResponse.class)
    public JAXBElement<ArrayOfUserStory> createUserStoryFindAllResponseUserStoryFindAllResult(ArrayOfUserStory value) {
        return new JAXBElement<ArrayOfUserStory>(_UserStoryFindAllResponseUserStoryFindAllResult_QNAME, ArrayOfUserStory.class, UserStoryFindAllResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BugFindBySearchStringResult", scope = BugFindBySearchStringResponse.class)
    public JAXBElement<ArrayOfBug> createBugFindBySearchStringResponseBugFindBySearchStringResult(ArrayOfBug value) {
        return new JAXBElement<ArrayOfBug>(_BugFindBySearchStringResponseBugFindBySearchStringResult_QNAME, ArrayOfBug.class, BugFindBySearchStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ClosedDate", scope = Bug.class)
    public JAXBElement<XMLGregorianCalendar> createBugClosedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BugClosedDate_QNAME, XMLGregorianCalendar.class, Bug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugExtention }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Extentions", scope = Bug.class)
    public JAXBElement<ArrayOfBugExtention> createBugExtentions(ArrayOfBugExtention value) {
        return new JAXBElement<ArrayOfBugExtention>(_BugExtentions_QNAME, ArrayOfBugExtention.class, Bug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ResolvedBy", scope = Bug.class)
    public JAXBElement<String> createBugResolvedBy(String value) {
        return new JAXBElement<String>(_BugResolvedBy_QNAME, String.class, Bug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ResolvedDate", scope = Bug.class)
    public JAXBElement<XMLGregorianCalendar> createBugResolvedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BugResolvedDate_QNAME, XMLGregorianCalendar.class, Bug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Content", scope = Bug.class)
    public JAXBElement<String> createBugContent(String value) {
        return new JAXBElement<String>(_BugContent_QNAME, String.class, Bug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Title", scope = Bug.class)
    public JAXBElement<String> createBugTitle(String value) {
        return new JAXBElement<String>(_BugTitle_QNAME, String.class, Bug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ClosedBy", scope = Bug.class)
    public JAXBElement<String> createBugClosedBy(String value) {
        return new JAXBElement<String>(_BugClosedBy_QNAME, String.class, Bug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "SprintId", scope = SprintAssignment.class)
    public JAXBElement<String> createSprintAssignmentSprintId(String value) {
        return new JAXBElement<String>(_SprintAssignmentSprintId_QNAME, String.class, SprintAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "End", scope = BugDateRangeFilter.class)
    public JAXBElement<XMLGregorianCalendar> createBugDateRangeFilterEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BugDateRangeFilterEnd_QNAME, XMLGregorianCalendar.class, BugDateRangeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Start", scope = BugDateRangeFilter.class)
    public JAXBElement<XMLGregorianCalendar> createBugDateRangeFilterStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BugDateRangeFilterStart_QNAME, XMLGregorianCalendar.class, BugDateRangeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "teamName", scope = TeamCreate.class)
    public JAXBElement<String> createTeamCreateTeamName(String value) {
        return new JAXBElement<String>(_TeamCreateTeamName_QNAME, String.class, TeamCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = TeamCreate.class)
    public JAXBElement<String> createTeamCreatePassword(String value) {
        return new JAXBElement<String>(_TeamCreatePassword_QNAME, String.class, TeamCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "magicWord", scope = TeamCreate.class)
    public JAXBElement<String> createTeamCreateMagicWord(String value) {
        return new JAXBElement<String>(_TeamCreateMagicWord_QNAME, String.class, TeamCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugSeverity", scope = BugSeverityFilter.class)
    public JAXBElement<ArrayOfSeverity> createBugSeverityFilterBugSeverity(ArrayOfSeverity value) {
        return new JAXBElement<ArrayOfSeverity>(_BugSeverityFilterBugSeverity_QNAME, ArrayOfSeverity.class, BugSeverityFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugSeverityExclude", scope = BugSeverityFilter.class)
    public JAXBElement<ArrayOfSeverity> createBugSeverityFilterBugSeverityExclude(ArrayOfSeverity value) {
        return new JAXBElement<ArrayOfSeverity>(_BugSeverityFilterBugSeverityExclude_QNAME, ArrayOfSeverity.class, BugSeverityFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SprintFindByIdResult", scope = SprintFindByIdResponse.class)
    public JAXBElement<Sprint> createSprintFindByIdResponseSprintFindByIdResult(Sprint value) {
        return new JAXBElement<Sprint>(_SprintFindByIdResponseSprintFindByIdResult_QNAME, Sprint.class, SprintFindByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserStory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserStoryFindBySearchStringResult", scope = UserStoryFindBySearchStringResponse.class)
    public JAXBElement<ArrayOfUserStory> createUserStoryFindBySearchStringResponseUserStoryFindBySearchStringResult(ArrayOfUserStory value) {
        return new JAXBElement<ArrayOfUserStory>(_UserStoryFindBySearchStringResponseUserStoryFindBySearchStringResult_QNAME, ArrayOfUserStory.class, UserStoryFindBySearchStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "prioList", scope = UserStorySetPrio.class)
    public JAXBElement<ArrayOfOrder> createUserStorySetPrioPrioList(ArrayOfOrder value) {
        return new JAXBElement<ArrayOfOrder>(_UserStorySetPrioPrioList_QNAME, ArrayOfOrder.class, UserStorySetPrio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugStatesExclude", scope = BugStateFilter.class)
    public JAXBElement<ArrayOfBugState> createBugStateFilterBugStatesExclude(ArrayOfBugState value) {
        return new JAXBElement<ArrayOfBugState>(_BugStateFilterBugStatesExclude_QNAME, ArrayOfBugState.class, BugStateFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "BugStates", scope = BugStateFilter.class)
    public JAXBElement<ArrayOfBugState> createBugStateFilterBugStates(ArrayOfBugState value) {
        return new JAXBElement<ArrayOfBugState>(_BugStateFilterBugStates_QNAME, ArrayOfBugState.class, BugStateFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SprintFindAllResult", scope = SprintFindAllResponse.class)
    public JAXBElement<ArrayOfSprint> createSprintFindAllResponseSprintFindAllResult(ArrayOfSprint value) {
        return new JAXBElement<ArrayOfSprint>(_SprintFindAllResponseSprintFindAllResult_QNAME, ArrayOfSprint.class, SprintFindAllResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserStoryExtention }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Extentions", scope = UserStory.class)
    public JAXBElement<ArrayOfUserStoryExtention> createUserStoryExtentions(ArrayOfUserStoryExtention value) {
        return new JAXBElement<ArrayOfUserStoryExtention>(_BugExtentions_QNAME, ArrayOfUserStoryExtention.class, UserStory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "SprintId", scope = UserStory.class)
    public JAXBElement<String> createUserStorySprintId(String value) {
        return new JAXBElement<String>(_SprintAssignmentSprintId_QNAME, String.class, UserStory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Content", scope = UserStory.class)
    public JAXBElement<String> createUserStoryContent(String value) {
        return new JAXBElement<String>(_BugContent_QNAME, String.class, UserStory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "StoryPoints", scope = UserStory.class)
    public JAXBElement<Integer> createUserStoryStoryPoints(Integer value) {
        return new JAXBElement<Integer>(_UserStoryStoryPoints_QNAME, Integer.class, UserStory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Title", scope = UserStory.class)
    public JAXBElement<String> createUserStoryTitle(String value) {
        return new JAXBElement<String>(_BugTitle_QNAME, String.class, UserStory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "magicword", scope = TeamLogin.class)
    public JAXBElement<String> createTeamLoginMagicword(String value) {
        return new JAXBElement<String>(_TeamLoginMagicword_QNAME, String.class, TeamLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "teamName", scope = TeamLogin.class)
    public JAXBElement<String> createTeamLoginTeamName(String value) {
        return new JAXBElement<String>(_TeamCreateTeamName_QNAME, String.class, TeamLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = TeamLogin.class)
    public JAXBElement<String> createTeamLoginPassword(String value) {
        return new JAXBElement<String>(_TeamCreatePassword_QNAME, String.class, TeamLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userStory", scope = UserStoryCreate.class)
    public JAXBElement<UserStory> createUserStoryCreateUserStory(UserStory value) {
        return new JAXBElement<UserStory>(_UserStoryUpdateUserStory_QNAME, UserStory.class, UserStoryCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Key", scope = AbstractExtentions.class)
    public JAXBElement<String> createAbstractExtentionsKey(String value) {
        return new JAXBElement<String>(_AbstractExtentionsKey_QNAME, String.class, AbstractExtentions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "DataType", scope = AbstractExtentions.class)
    public JAXBElement<String> createAbstractExtentionsDataType(String value) {
        return new JAXBElement<String>(_AbstractExtentionsDataType_QNAME, String.class, AbstractExtentions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Content", scope = AbstractExtentions.class)
    public JAXBElement<String> createAbstractExtentionsContent(String value) {
        return new JAXBElement<String>(_BugContent_QNAME, String.class, AbstractExtentions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Bug", scope = BugExtention.class)
    public JAXBElement<Bug> createBugExtentionBug(Bug value) {
        return new JAXBElement<Bug>(_Bug_QNAME, Bug.class, BugExtention.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "bug", scope = BugUpdate.class)
    public JAXBElement<Bug> createBugUpdateBug(Bug value) {
        return new JAXBElement<Bug>(_BugCreateBug_QNAME, Bug.class, BugUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserStoryFindByIdResult", scope = UserStoryFindByIdResponse.class)
    public JAXBElement<UserStory> createUserStoryFindByIdResponseUserStoryFindByIdResult(UserStory value) {
        return new JAXBElement<UserStory>(_UserStoryFindByIdResponseUserStoryFindByIdResult_QNAME, UserStory.class, UserStoryFindByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BugFindByIdResult", scope = BugFindByIdResponse.class)
    public JAXBElement<Bug> createBugFindByIdResponseBugFindByIdResult(Bug value) {
        return new JAXBElement<Bug>(_BugFindByIdResponseBugFindByIdResult_QNAME, Bug.class, BugFindByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sprint", scope = SprintUpdate.class)
    public JAXBElement<Sprint> createSprintUpdateSprint(Sprint value) {
        return new JAXBElement<Sprint>(_SprintCreateSprint_QNAME, Sprint.class, SprintUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BugFindResult", scope = BugFindResponse.class)
    public JAXBElement<ArrayOfBug> createBugFindResponseBugFindResult(ArrayOfBug value) {
        return new JAXBElement<ArrayOfBug>(_BugFindResponseBugFindResult_QNAME, ArrayOfBug.class, BugFindResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSprintAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sprintAssignment", scope = UserStorySetSprint.class)
    public JAXBElement<ArrayOfSprintAssignment> createUserStorySetSprintSprintAssignment(ArrayOfSprintAssignment value) {
        return new JAXBElement<ArrayOfSprintAssignment>(_UserStorySetSprintSprintAssignment_QNAME, ArrayOfSprintAssignment.class, UserStorySetSprint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserStory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "UserStories", scope = Sprint.class)
    public JAXBElement<ArrayOfUserStory> createSprintUserStories(ArrayOfUserStory value) {
        return new JAXBElement<ArrayOfUserStory>(_SprintUserStories_QNAME, ArrayOfUserStory.class, Sprint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "Title", scope = Sprint.class)
    public JAXBElement<String> createSprintTitle(String value) {
        return new JAXBElement<String>(_BugTitle_QNAME, String.class, Sprint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fuldaai.de", name = "ResolvedBy", scope = BugResolvedByFilter.class)
    public JAXBElement<ArrayOfstring> createBugResolvedByFilterResolvedBy(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_BugResolvedBy_QNAME, ArrayOfstring.class, BugResolvedByFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchString", scope = BugFindBySearchString.class)
    public JAXBElement<String> createBugFindBySearchStringSearchString(String value) {
        return new JAXBElement<String>(_UserStoryFindBySearchStringSearchString_QNAME, String.class, BugFindBySearchString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBugFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "bugFilters", scope = BugFind.class)
    public JAXBElement<ArrayOfBugFilter> createBugFindBugFilters(ArrayOfBugFilter value) {
        return new JAXBElement<ArrayOfBugFilter>(_BugFindBugFilters_QNAME, ArrayOfBugFilter.class, BugFind.class, value);
    }

}
