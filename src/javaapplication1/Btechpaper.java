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
@Table(name = "btechpaper", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "Btechpaper.findAll", query = "SELECT b FROM Btechpaper b"),
    @NamedQuery(name = "Btechpaper.findBySno", query = "SELECT b FROM Btechpaper b WHERE b.sno = :sno"),
    @NamedQuery(name = "Btechpaper.findByQuestion", query = "SELECT b FROM Btechpaper b WHERE b.question = :question"),
    @NamedQuery(name = "Btechpaper.findByA", query = "SELECT b FROM Btechpaper b WHERE b.a = :a"),
    @NamedQuery(name = "Btechpaper.findByB", query = "SELECT b FROM Btechpaper b WHERE b.b = :b"),
    @NamedQuery(name = "Btechpaper.findByC", query = "SELECT b FROM Btechpaper b WHERE b.c = :c"),
    @NamedQuery(name = "Btechpaper.findByD", query = "SELECT b FROM Btechpaper b WHERE b.d = :d"),
    @NamedQuery(name = "Btechpaper.findByAnswer", query = "SELECT b FROM Btechpaper b WHERE b.answer = :answer")})
public class Btechpaper implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Sno")
    private Integer sno;
    @Column(name = "Question")
    private String question;
    @Column(name = "A")
    private String a;
    @Column(name = "B")
    private String b;
    @Column(name = "C")
    private String c;
    @Column(name = "D")
    private String d;
    @Column(name = "Answer")
    private String answer;

    public Btechpaper() {
    }

    public Btechpaper(Integer sno) {
        this.sno = sno;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        Integer oldSno = this.sno;
        this.sno = sno;
        changeSupport.firePropertyChange("sno", oldSno, sno);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        String oldQuestion = this.question;
        this.question = question;
        changeSupport.firePropertyChange("question", oldQuestion, question);
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        String oldA = this.a;
        this.a = a;
        changeSupport.firePropertyChange("a", oldA, a);
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        String oldB = this.b;
        this.b = b;
        changeSupport.firePropertyChange("b", oldB, b);
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        String oldC = this.c;
        this.c = c;
        changeSupport.firePropertyChange("c", oldC, c);
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        String oldD = this.d;
        this.d = d;
        changeSupport.firePropertyChange("d", oldD, d);
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        String oldAnswer = this.answer;
        this.answer = answer;
        changeSupport.firePropertyChange("answer", oldAnswer, answer);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sno != null ? sno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Btechpaper)) {
            return false;
        }
        Btechpaper other = (Btechpaper) object;
        if ((this.sno == null && other.sno != null) || (this.sno != null && !this.sno.equals(other.sno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Btechpaper[ sno=" + sno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
