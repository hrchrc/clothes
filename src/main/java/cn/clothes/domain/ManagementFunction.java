package cn.clothes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="management_function")
public class ManagementFunction {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column management_function.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column management_function.managementFunctionNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer managementfunctionno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column management_function.ManagementFunctionType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String managementfunctiontype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column management_function.id
     *
     * @return the value of management_function.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    @Id
	@GeneratedValue
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column management_function.id
     *
     * @param id the value for management_function.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column management_function.managementFunctionNo
     *
     * @return the value of management_function.managementFunctionNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getManagementfunctionno() {
        return managementfunctionno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column management_function.managementFunctionNo
     *
     * @param managementfunctionno the value for management_function.managementFunctionNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setManagementfunctionno(Integer managementfunctionno) {
        this.managementfunctionno = managementfunctionno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column management_function.ManagementFunctionType
     *
     * @return the value of management_function.ManagementFunctionType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getManagementfunctiontype() {
        return managementfunctiontype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column management_function.ManagementFunctionType
     *
     * @param managementfunctiontype the value for management_function.ManagementFunctionType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setManagementfunctiontype(String managementfunctiontype) {
        this.managementfunctiontype = managementfunctiontype;
    }
}