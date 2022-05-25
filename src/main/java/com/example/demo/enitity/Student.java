package com.example.demo.enitity;

public class Student {
    private Integer studentId;
    private String studentName;
    private Integer grade;
    private String hometown;
    private Integer majorId;
    private String majorName;
    public Student() {

    }

    public Student(Integer studentId, String studentName, Integer grade, String hometown, Integer majorId,String majorName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.hometown = hometown;
        this.majorId = majorId;
        this.majorName = majorName;
    }
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer id) {
        this.studentId = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getHometown() {
        return hometown;
    }
    public void setHometown(String hometown) {
    	this.hometown = hometown;
    }
    
    public Integer getMajorId() {
    	return majorId;
    }
    public void setMajorId(Integer majorId) {
	   this.majorId = majorId;
   }
   
   public String getMajorName() {
	   return majorName;
   }
   
   public void setMajorName(String majorName) {
	   this.majorName =majorName;
   }
    public String getStudentInfo() {
        return  studentId +","+  studentName +","+  grade +","+ hometown +","+ majorId +","+ majorName;
    }
    public String getMajorInfo() {
    	return majorId +","+ majorName;
    }

}
