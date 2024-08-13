package com.MongoSpring.MongoSpring.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subjects")
public class SubjectDetails {
   @Id
    private String id;
    private String subjectName;
    private byte[] subjectIcon;

    // Getters and setters
    // Constructor(s), if needed

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public byte[] getSubjectIcon() {
        return subjectIcon;
    }

    public void setSubjectIcon(byte[] subjectIcon) {
        this.subjectIcon = subjectIcon;
    }
    
}
