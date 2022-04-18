package com.knits.product.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(length = 50, unique = true, nullable = false)
    private String login;

    @Column(name = "password_hash", length = 60, nullable = false)
    private String password;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column
    private String title;

    @ManyToOne
    private Country nationality;

    private String gender;

    @ManyToOne
    private Office office;

    private String companyPhone;
    private String companyMobilePhone;

    @Column(length = 254, unique = true)
    private String email;

    @Column(nullable = false)
    private Boolean active = false;

    private Date birthDate;
    private Date startDate;
    private Date onboardingDate;
    private Date offboardingDate;
    private Date endDate;
    private Date dateOfLeave;

    @ManyToMany(mappedBy = "members")
    private List<Group> groups;

    @ManyToOne
    private Role role;
}
