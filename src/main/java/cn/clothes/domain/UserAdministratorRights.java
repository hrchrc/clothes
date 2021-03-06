package cn.clothes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_administrator_rights")
public class UserAdministratorRights {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_administrator_rights.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_administrator_rights.login
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String login;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_administrator_rights.queryStatistics
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String querystatistics;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_administrator_rights.queryModification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String querymodification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_administrator_rights.changeInformation
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String changeinformation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_administrator_rights.changePassword
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String changepassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_administrator_rights.manageUsers
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String manageusers;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_administrator_rights.inventoryManagement_id_ad
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer inventorymanagementIdAd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_administrator_rights.id
     *
     * @return the value of user_administrator_rights.id
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
     * This method sets the value of the database column user_administrator_rights.id
     *
     * @param id the value for user_administrator_rights.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_administrator_rights.login
     *
     * @return the value of user_administrator_rights.login
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getLogin() {
        return login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_administrator_rights.login
     *
     * @param login the value for user_administrator_rights.login
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_administrator_rights.queryStatistics
     *
     * @return the value of user_administrator_rights.queryStatistics
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getQuerystatistics() {
        return querystatistics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_administrator_rights.queryStatistics
     *
     * @param querystatistics the value for user_administrator_rights.queryStatistics
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setQuerystatistics(String querystatistics) {
        this.querystatistics = querystatistics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_administrator_rights.queryModification
     *
     * @return the value of user_administrator_rights.queryModification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getQuerymodification() {
        return querymodification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_administrator_rights.queryModification
     *
     * @param querymodification the value for user_administrator_rights.queryModification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setQuerymodification(String querymodification) {
        this.querymodification = querymodification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_administrator_rights.changeInformation
     *
     * @return the value of user_administrator_rights.changeInformation
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getChangeinformation() {
        return changeinformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_administrator_rights.changeInformation
     *
     * @param changeinformation the value for user_administrator_rights.changeInformation
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setChangeinformation(String changeinformation) {
        this.changeinformation = changeinformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_administrator_rights.changePassword
     *
     * @return the value of user_administrator_rights.changePassword
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getChangepassword() {
        return changepassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_administrator_rights.changePassword
     *
     * @param changepassword the value for user_administrator_rights.changePassword
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setChangepassword(String changepassword) {
        this.changepassword = changepassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_administrator_rights.manageUsers
     *
     * @return the value of user_administrator_rights.manageUsers
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getManageusers() {
        return manageusers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_administrator_rights.manageUsers
     *
     * @param manageusers the value for user_administrator_rights.manageUsers
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setManageusers(String manageusers) {
        this.manageusers = manageusers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_administrator_rights.inventoryManagement_id_ad
     *
     * @return the value of user_administrator_rights.inventoryManagement_id_ad
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getInventorymanagementIdAd() {
        return inventorymanagementIdAd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_administrator_rights.inventoryManagement_id_ad
     *
     * @param inventorymanagementIdAd the value for user_administrator_rights.inventoryManagement_id_ad
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setInventorymanagementIdAd(Integer inventorymanagementIdAd) {
        this.inventorymanagementIdAd = inventorymanagementIdAd;
    }
}