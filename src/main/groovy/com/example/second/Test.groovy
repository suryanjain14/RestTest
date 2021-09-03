package com.example.second
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.criteria.CriteriaBuilder.In

@Entity
class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id
    private String sub
    private Integer marks
    private String grade



    void  setId( Integer id){
        this.id=id
    }
    void setSub(String subject){
        this.sub=subject
    }
    void setMarks(Integer no){
        this.marks=no
    }
    void setGrade(String grade){
         this.grade=grade
    }

    public getId(){
        return this.id
    }
    public getSub(){
        return this.sub
    }
    public getMarks(){
        return this.marks
    }
    public getGrade(){
        return this.grade
    }



}
