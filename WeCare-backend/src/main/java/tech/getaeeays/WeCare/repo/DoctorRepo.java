package tech.getaeeays.WeCare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getaeeays.WeCare.model.Doctor;

import java.util.Optional;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {
    void deleteDoctorById(Long doctorId);

    Optional<Doctor> findDoctorById(Long doctorId);
}
