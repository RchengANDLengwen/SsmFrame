package com.codejoys.company.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table view_emp
 */
public class ViewEmp implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp.emp_no
     *
     * @mbg.generated
     */
    private Integer empNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_emp.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_emp
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp.emp_no
     *
     * @return the value of view_emp.emp_no
     *
     * @mbg.generated
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp.emp_no
     *
     * @param empNo the value for view_emp.emp_no
     *
     * @mbg.generated
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp.last_name
     *
     * @return the value of view_emp.last_name
     *
     * @mbg.generated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp.last_name
     *
     * @param lastName the value for view_emp.last_name
     *
     * @mbg.generated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_emp.first_name
     *
     * @return the value of view_emp.first_name
     *
     * @mbg.generated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_emp.first_name
     *
     * @param firstName the value for view_emp.first_name
     *
     * @mbg.generated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp
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
        sb.append(", lastName=").append(lastName);
        sb.append(", firstName=").append(firstName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}