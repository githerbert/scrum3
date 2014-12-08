
package de.scrummies.scrumService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IScrumService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IScrumService {


    /**
     * 
     * @param teamName
     * @param magicWord
     * @param password
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TeamCreate", action = "http://tempuri.org/IScrumService/TeamCreate")
    @WebResult(name = "TeamCreateResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "TeamCreate", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.TeamCreate")
    @ResponseWrapper(localName = "TeamCreateResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.TeamCreateResponse")
    public String teamCreate(
        @WebParam(name = "teamName", targetNamespace = "http://tempuri.org/")
        String teamName,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password,
        @WebParam(name = "magicWord", targetNamespace = "http://tempuri.org/")
        String magicWord);

    /**
     * 
     * @param teamName
     * @param magicword
     * @param password
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TeamLogin", action = "http://tempuri.org/IScrumService/TeamLogin")
    @WebResult(name = "TeamLoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "TeamLogin", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.TeamLogin")
    @ResponseWrapper(localName = "TeamLoginResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.TeamLoginResponse")
    public String teamLogin(
        @WebParam(name = "teamName", targetNamespace = "http://tempuri.org/")
        String teamName,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password,
        @WebParam(name = "magicword", targetNamespace = "http://tempuri.org/")
        String magicword);

    /**
     * 
     * @param sessionToken
     */
    @WebMethod(operationName = "TeamReset", action = "http://tempuri.org/IScrumService/TeamReset")
    @RequestWrapper(localName = "TeamReset", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.TeamReset")
    @ResponseWrapper(localName = "TeamResetResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.TeamResetResponse")
    public void teamReset(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken);

    /**
     * 
     * @param sessionToken
     */
    @WebMethod(operationName = "TeamForget", action = "http://tempuri.org/IScrumService/TeamForget")
    @RequestWrapper(localName = "TeamForget", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.TeamForget")
    @ResponseWrapper(localName = "TeamForgetResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.TeamForgetResponse")
    public void teamForget(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken);

    /**
     * 
     * @param sessionToken
     * @param userStory
     */
    @WebMethod(operationName = "UserStoryCreate", action = "http://tempuri.org/IScrumService/UserStoryCreate")
    @RequestWrapper(localName = "UserStoryCreate", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryCreate")
    @ResponseWrapper(localName = "UserStoryCreateResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryCreateResponse")
    public void userStoryCreate(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "userStory", targetNamespace = "http://tempuri.org/")
        UserStory userStory);

    /**
     * 
     * @param sessionToken
     * @param userStory
     */
    @WebMethod(operationName = "UserStoryUpdate", action = "http://tempuri.org/IScrumService/UserStoryUpdate")
    @RequestWrapper(localName = "UserStoryUpdate", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryUpdate")
    @ResponseWrapper(localName = "UserStoryUpdateResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryUpdateResponse")
    public void userStoryUpdate(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "userStory", targetNamespace = "http://tempuri.org/")
        UserStory userStory);

    /**
     * 
     * @param userStoryId
     * @param sessionToken
     */
    @WebMethod(operationName = "UserStoryRemove", action = "http://tempuri.org/IScrumService/UserStoryRemove")
    @RequestWrapper(localName = "UserStoryRemove", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryRemove")
    @ResponseWrapper(localName = "UserStoryRemoveResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryRemoveResponse")
    public void userStoryRemove(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "userStoryId", targetNamespace = "http://tempuri.org/")
        String userStoryId);

    /**
     * 
     * @param sessionToken
     */
    @WebMethod(operationName = "UserStoryRemoveAll", action = "http://tempuri.org/IScrumService/UserStoryRemoveAll")
    @RequestWrapper(localName = "UserStoryRemoveAll", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryRemoveAll")
    @ResponseWrapper(localName = "UserStoryRemoveAllResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryRemoveAllResponse")
    public void userStoryRemoveAll(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken);

    /**
     * 
     * @param userStoryId
     * @param sessionToken
     * @return
     *     returns de.scrummies.scrumService.UserStory
     */
    @WebMethod(operationName = "UserStoryFindById", action = "http://tempuri.org/IScrumService/UserStoryFindById")
    @WebResult(name = "UserStoryFindByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UserStoryFindById", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryFindById")
    @ResponseWrapper(localName = "UserStoryFindByIdResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryFindByIdResponse")
    public UserStory userStoryFindById(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "userStoryId", targetNamespace = "http://tempuri.org/")
        String userStoryId);

    /**
     * 
     * @param sessionToken
     * @param searchString
     * @return
     *     returns de.scrummies.scrumService.ArrayOfUserStory
     */
    @WebMethod(operationName = "UserStoryFindBySearchString", action = "http://tempuri.org/IScrumService/UserStoryFindBySearchString")
    @WebResult(name = "UserStoryFindBySearchStringResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UserStoryFindBySearchString", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryFindBySearchString")
    @ResponseWrapper(localName = "UserStoryFindBySearchStringResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryFindBySearchStringResponse")
    public ArrayOfUserStory userStoryFindBySearchString(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "searchString", targetNamespace = "http://tempuri.org/")
        String searchString);

    /**
     * 
     * @param sessionToken
     * @return
     *     returns de.scrummies.scrumService.ArrayOfUserStory
     */
    @WebMethod(operationName = "UserStoryFindAll", action = "http://tempuri.org/IScrumService/UserStoryFindAll")
    @WebResult(name = "UserStoryFindAllResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UserStoryFindAll", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryFindAll")
    @ResponseWrapper(localName = "UserStoryFindAllResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStoryFindAllResponse")
    public ArrayOfUserStory userStoryFindAll(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken);

    /**
     * 
     * @param sessionToken
     * @param prioList
     */
    @WebMethod(operationName = "UserStorySetPrio", action = "http://tempuri.org/IScrumService/UserStorySetPrio")
    @RequestWrapper(localName = "UserStorySetPrio", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStorySetPrio")
    @ResponseWrapper(localName = "UserStorySetPrioResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStorySetPrioResponse")
    public void userStorySetPrio(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "prioList", targetNamespace = "http://tempuri.org/")
        ArrayOfOrder prioList);

    /**
     * 
     * @param sessionToken
     * @param sprintAssignment
     */
    @WebMethod(operationName = "UserStorySetSprint", action = "http://tempuri.org/IScrumService/UserStorySetSprint")
    @RequestWrapper(localName = "UserStorySetSprint", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStorySetSprint")
    @ResponseWrapper(localName = "UserStorySetSprintResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.UserStorySetSprintResponse")
    public void userStorySetSprint(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "sprintAssignment", targetNamespace = "http://tempuri.org/")
        ArrayOfSprintAssignment sprintAssignment);

    /**
     * 
     * @param sessionToken
     * @param bug
     */
    @WebMethod(operationName = "BugCreate", action = "http://tempuri.org/IScrumService/BugCreate")
    @RequestWrapper(localName = "BugCreate", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugCreate")
    @ResponseWrapper(localName = "BugCreateResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugCreateResponse")
    public void bugCreate(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "bug", targetNamespace = "http://tempuri.org/")
        Bug bug);

    /**
     * 
     * @param sessionToken
     * @param bug
     */
    @WebMethod(operationName = "BugUpdate", action = "http://tempuri.org/IScrumService/BugUpdate")
    @RequestWrapper(localName = "BugUpdate", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugUpdate")
    @ResponseWrapper(localName = "BugUpdateResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugUpdateResponse")
    public void bugUpdate(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "bug", targetNamespace = "http://tempuri.org/")
        Bug bug);

    /**
     * 
     * @param sessionToken
     * @param bugId
     */
    @WebMethod(operationName = "BugRemove", action = "http://tempuri.org/IScrumService/BugRemove")
    @RequestWrapper(localName = "BugRemove", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugRemove")
    @ResponseWrapper(localName = "BugRemoveResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugRemoveResponse")
    public void bugRemove(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "bugId", targetNamespace = "http://tempuri.org/")
        String bugId);

    /**
     * 
     * @param sessionToken
     */
    @WebMethod(operationName = "BugRemoveAll", action = "http://tempuri.org/IScrumService/BugRemoveAll")
    @RequestWrapper(localName = "BugRemoveAll", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugRemoveAll")
    @ResponseWrapper(localName = "BugRemoveAllResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugRemoveAllResponse")
    public void bugRemoveAll(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken);

    /**
     * 
     * @param sessionToken
     * @param bugId
     * @return
     *     returns de.scrummies.scrumService.Bug
     */
    @WebMethod(operationName = "BugFindById", action = "http://tempuri.org/IScrumService/BugFindById")
    @WebResult(name = "BugFindByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BugFindById", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugFindById")
    @ResponseWrapper(localName = "BugFindByIdResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugFindByIdResponse")
    public Bug bugFindById(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "bugId", targetNamespace = "http://tempuri.org/")
        String bugId);

    /**
     * 
     * @param sessionToken
     * @param searchString
     * @return
     *     returns de.scrummies.scrumService.ArrayOfBug
     */
    @WebMethod(operationName = "BugFindBySearchString", action = "http://tempuri.org/IScrumService/BugFindBySearchString")
    @WebResult(name = "BugFindBySearchStringResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BugFindBySearchString", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugFindBySearchString")
    @ResponseWrapper(localName = "BugFindBySearchStringResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugFindBySearchStringResponse")
    public ArrayOfBug bugFindBySearchString(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "searchString", targetNamespace = "http://tempuri.org/")
        String searchString);

    /**
     * 
     * @param sessionToken
     * @return
     *     returns de.scrummies.scrumService.ArrayOfBug
     */
    @WebMethod(operationName = "BugFindAll", action = "http://tempuri.org/IScrumService/BugFindAll")
    @WebResult(name = "BugFindAllResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BugFindAll", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugFindAll")
    @ResponseWrapper(localName = "BugFindAllResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugFindAllResponse")
    public ArrayOfBug bugFindAll(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken);

    /**
     * 
     * @param sessionToken
     * @param bugFilters
     * @return
     *     returns de.scrummies.scrumService.ArrayOfBug
     */
    @WebMethod(operationName = "BugFind", action = "http://tempuri.org/IScrumService/BugFind")
    @WebResult(name = "BugFindResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BugFind", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugFind")
    @ResponseWrapper(localName = "BugFindResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.BugFindResponse")
    public ArrayOfBug bugFind(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "bugFilters", targetNamespace = "http://tempuri.org/")
        ArrayOfBugFilter bugFilters);

    /**
     * 
     * @param sessionToken
     * @param sprint
     */
    @WebMethod(operationName = "SprintCreate", action = "http://tempuri.org/IScrumService/SprintCreate")
    @RequestWrapper(localName = "SprintCreate", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintCreate")
    @ResponseWrapper(localName = "SprintCreateResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintCreateResponse")
    public void sprintCreate(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "sprint", targetNamespace = "http://tempuri.org/")
        Sprint sprint);

    /**
     * 
     * @param sessionToken
     * @param sprint
     */
    @WebMethod(operationName = "SprintUpdate", action = "http://tempuri.org/IScrumService/SprintUpdate")
    @RequestWrapper(localName = "SprintUpdate", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintUpdate")
    @ResponseWrapper(localName = "SprintUpdateResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintUpdateResponse")
    public void sprintUpdate(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "sprint", targetNamespace = "http://tempuri.org/")
        Sprint sprint);

    /**
     * 
     * @param sessionToken
     * @param sprintId
     */
    @WebMethod(operationName = "SprintRemove", action = "http://tempuri.org/IScrumService/SprintRemove")
    @RequestWrapper(localName = "SprintRemove", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintRemove")
    @ResponseWrapper(localName = "SprintRemoveResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintRemoveResponse")
    public void sprintRemove(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "sprintId", targetNamespace = "http://tempuri.org/")
        String sprintId);

    /**
     * 
     * @param sessionToken
     */
    @WebMethod(operationName = "SprintRemoveAll", action = "http://tempuri.org/IScrumService/SprintRemoveAll")
    @RequestWrapper(localName = "SprintRemoveAll", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintRemoveAll")
    @ResponseWrapper(localName = "SprintRemoveAllResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintRemoveAllResponse")
    public void sprintRemoveAll(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken);

    /**
     * 
     * @param sessionToken
     * @param sprintId
     * @return
     *     returns de.scrummies.scrumService.Sprint
     */
    @WebMethod(operationName = "SprintFindById", action = "http://tempuri.org/IScrumService/SprintFindById")
    @WebResult(name = "SprintFindByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SprintFindById", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintFindById")
    @ResponseWrapper(localName = "SprintFindByIdResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintFindByIdResponse")
    public Sprint sprintFindById(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken,
        @WebParam(name = "sprintId", targetNamespace = "http://tempuri.org/")
        String sprintId);

    /**
     * 
     * @param sessionToken
     * @return
     *     returns de.scrummies.scrumService.ArrayOfSprint
     */
    @WebMethod(operationName = "SprintFindAll", action = "http://tempuri.org/IScrumService/SprintFindAll")
    @WebResult(name = "SprintFindAllResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SprintFindAll", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintFindAll")
    @ResponseWrapper(localName = "SprintFindAllResponse", targetNamespace = "http://tempuri.org/", className = "de.scrummies.scrumService.SprintFindAllResponse")
    public ArrayOfSprint sprintFindAll(
        @WebParam(name = "sessionToken", targetNamespace = "http://tempuri.org/")
        String sessionToken);

}