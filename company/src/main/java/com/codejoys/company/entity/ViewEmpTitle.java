package com.codejoys.company.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table view_emp_title
 */
public class ViewEmpTitle implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp_title.emp_no
     *
     * @mbg.generated
     */
    private Integer empNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp_title.birth_date
     *
     * @mbg.generated
     */
    private Date birthDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp_title.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp_title.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp_title.gender
     *
     * @mbg.generated
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp_title.hire_date
     *
     * @mbg.generated
     */
    private Date hireDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp_title.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_emp_title
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp_title.emp_no
     *
     * @return the value of view_emp_title.emp_no
     *
     * @mbg.generated
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp_title.emp_no
     *
     * @param empNo the value for view_emp_title.emp_no
     *
     * @mbg.generated
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp_title.birth_date
     *
     * @return the value of view_emp_title.birth_date
     *
     * @mbg.generated
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp_title.birth_date
     *
     * @param birthDate the value for view_emp_title.birth_date
     *
     * @mbg.generated
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp_title.first_name
     *
     * @return the value of view_emp_title.first_name
     *
     * @mbg.generated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp_title.first_name
     *
     * @param firstName the value for view_emp_title.first_name
     *
     * @mbg.generated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp_title.last_name
     *
     * @return the value of view_emp_title.last_name
     *
     * @mbg.generated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp_title.last_name
     *
     * @param lastName the value for view_emp_title.last_name
     *
     * @mbg.generated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp_title.gender
     *
     * @return the value of view_emp_title.gender
     *
     * @mbg.generated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp_title.gender
     *
     * @param gender the value for view_emp_title.gender
     *
     * @mbg.generated
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp_title.hire_date
     *
     * @return the value of view_emp_title.hire_date
     *
     * @mbg.generated
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp_title.hire_date
     *
     * @param hireDate the value for view_emp_title.hire_date
     *
     * @mbg.generated
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp_title.title
     *
     * @return the value of view_emp_title.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp_title.title
     *
     * @param title the value for view_emp_title.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp_title
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empNo=").append(empNo);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", gender=").append(gender);
        sb.append(", hireDate=").append(hireDate);
        sb.append(", title=").append(title);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}