package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Customer {
    @Id
    private String Cusid;
    private String Cusname;
    private String Cusaddress;
    private String Cuscontactno;
    private String CusNIC;
    private String Cusemail;
    private String Cuspasword;
}
