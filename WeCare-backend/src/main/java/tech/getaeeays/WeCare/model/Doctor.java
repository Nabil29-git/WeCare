package tech.getaeeays.WeCare.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
//Serializable help transform the class to different type of stream
public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private  Long id;
    private  String doctorName;
    private String Specialisation;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String doctorCode;


    public Doctor(Long id , String doctorName, String specialisation, String phone, String imageUrl) {
        this.id = id ;
        this.doctorName = doctorName;
        Specialisation = specialisation;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.doctorCode= doctorCode;
    }

    public Doctor() {

    }

    public Long getDoctorId() {
        return id ;
    }

    public void setDoctorId(Long id ) {
        this.id  = id ;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode= doctorCode;
    }


    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialisation() {
        return Specialisation;
    }

    public void setSpecialisation(String specialisation) {
        Specialisation = specialisation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", Specialisation='" + Specialisation + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
