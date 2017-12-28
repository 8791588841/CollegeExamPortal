/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Himmi
 */
@Entity
@Table(name = "bcresult", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bcresult.findAll", query = "SELECT b FROM Bcresult b"),
    @NamedQuery(name = "Bcresult.findByName", query = "SELECT b FROM Bcresult b WHERE b.name = :name"),
    @NamedQuery(name = "Bcresult.findByResult", query = "SELECT b FROM Bcresult b WHERE b.result = :result")})
public class Bcresult implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Column(name = "Result")
    private String result;

    public Bcresult() {
    }

    public Bcresult(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        String oldResult = this.result;
        this.result = result;
        changeSupport.firePropertyChange("result", oldResult, result);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bcresult)) {
            return false;
        }
        Bcresult other = (Bcresult) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Bcresult[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
