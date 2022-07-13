package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerDto {
    private String Cusid;
    private String Cusname;
    private String Cusaddress;
    private String Cuscontactno;
    private String CusNIC;
    private String Cusemail;
    private String Cuspasword;
}
