package com.codejoys.company.dto;

// DTO data transfer object
public class DepartmentAvgSalaryDto {
    private Double avgSalary;
    private String deptNo;

    public Double getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(Double avgSalary) {
        this.avgSalary = avgSalary;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DepartmentAvgSalaryDto{");
        sb.append("avgSalary=").append(avgSalary);
        sb.append(", deptNo='").append(deptNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
