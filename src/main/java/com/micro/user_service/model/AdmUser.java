package com.micro.user_service.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "adm_user_copy")
public class AdmUser {

    @Id
    private Long id;

    private String email;
    private Long mobile;
    private String name;

    @Column(name = "form_no")
    private Long formNo;

    private String dob;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "password_reset_token")
    private String passwordResetToken;

    @Column(name = "auth_key")
    private String authKey;

    @Column(name = "ver_status")
    private Integer verStatus;

    private Boolean studied_cbse;
    private Integer cbse_passing_year;
    private String cbse_roll_num;
    private String cbse_school_code;

    private Integer status;
    private String ip;

    private Integer created_at;
    private Integer updated_at;

    private Timestamp updated;

    private Boolean forced_password_reset;
    private Long created_by;
    private Long updated_by;

    private String generate;
    private Boolean reset;

    private Integer application_count;

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Long getMobile() { return mobile; }
    public void setMobile(Long mobile) { this.mobile = mobile; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getFormNo() { return formNo; }
    public void setFormNo(Long formNo) { this.formNo = formNo; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public String getPasswordResetToken() { return passwordResetToken; }
    public void setPasswordResetToken(String passwordResetToken) { this.passwordResetToken = passwordResetToken; }

    public String getAuthKey() { return authKey; }
    public void setAuthKey(String authKey) { this.authKey = authKey; }

    public Integer getVerStatus() { return verStatus; }
    public void setVerStatus(Integer verStatus) { this.verStatus = verStatus; }

    public Boolean getStudied_cbse() { return studied_cbse; }
    public void setStudied_cbse(Boolean studied_cbse) { this.studied_cbse = studied_cbse; }

    public Integer getCbse_passing_year() { return cbse_passing_year; }
    public void setCbse_passing_year(Integer cbse_passing_year) { this.cbse_passing_year = cbse_passing_year; }

    public String getCbse_roll_num() { return cbse_roll_num; }
    public void setCbse_roll_num(String cbse_roll_num) { this.cbse_roll_num = cbse_roll_num; }

    public String getCbse_school_code() { return cbse_school_code; }
    public void setCbse_school_code(String cbse_school_code) { this.cbse_school_code = cbse_school_code; }

    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }

    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }

    public Integer getCreated_at() { return created_at; }
    public void setCreated_at(Integer created_at) { this.created_at = created_at; }

    public Integer getUpdated_at() { return updated_at; }
    public void setUpdated_at(Integer updated_at) { this.updated_at = updated_at; }

    public Timestamp getUpdated() { return updated; }
    public void setUpdated(Timestamp updated) { this.updated = updated; }

    public Boolean getForced_password_reset() { return forced_password_reset; }
    public void setForced_password_reset(Boolean forced_password_reset) { this.forced_password_reset = forced_password_reset; }

    public Long getCreated_by() { return created_by; }
    public void setCreated_by(Long created_by) { this.created_by = created_by; }

    public Long getUpdated_by() { return updated_by; }
    public void setUpdated_by(Long updated_by) { this.updated_by = updated_by; }

    public String getGenerate() { return generate; }
    public void setGenerate(String generate) { this.generate = generate; }

    public Boolean getReset() { return reset; }
    public void setReset(Boolean reset) { this.reset = reset; }

    public Integer getApplication_count() { return application_count; }
    public void setApplication_count(Integer application_count) { this.application_count = application_count; }
}
