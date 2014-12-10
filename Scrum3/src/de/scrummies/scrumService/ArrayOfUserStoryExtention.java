
package de.scrummies.scrumService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserStoryExtention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserStoryExtention">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserStoryExtention" type="{http://www.fuldaai.de}UserStoryExtention" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserStoryExtention", namespace = "http://www.fuldaai.de", propOrder = {
    "userStoryExtention"
})
public class ArrayOfUserStoryExtention {

    @XmlElement(name = "UserStoryExtention", nillable = true)
    protected List<UserStoryExtention> userStoryExtention;

    /**
     * Gets the value of the userStoryExtention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userStoryExtention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserStoryExtention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserStoryExtention }
     * 
     * 
     */
    public List<UserStoryExtention> getUserStoryExtention() {
        if (userStoryExtention == null) {
            userStoryExtention = new ArrayList<UserStoryExtention>();
        }
        return this.userStoryExtention;
    }

}
