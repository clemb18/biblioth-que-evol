//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.29 à 06:48:40 PM CET 
//


package com.openclassrooms.projects.bibliotheque;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workWs" type="{http://openclassrooms.com/projects/bibliotheque}workWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "workWs"
})
@XmlRootElement(name = "getWorkByAuthorResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
public class GetWorkByAuthorResponse {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected List<WorkWs> workWs;

    /**
     * Gets the value of the workWs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workWs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkWs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkWs }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public List<WorkWs> getWorkWs() {
        if (workWs == null) {
            workWs = new ArrayList<WorkWs>();
        }
        return this.workWs;
    }

}
