package tech.getaeeays.WeCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getaeeays.WeCare.exception.UserNotFoundException;
import tech.getaeeays.WeCare.model.Doctor;
import tech.getaeeays.WeCare.repo.DoctorRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class DoctorService {
    private final DoctorRepo doctorRepo;
    @Autowired
    public DoctorService(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }

    public Doctor addDoctor(Doctor doctor) {
        doctor.setDoctorCode(UUID.randomUUID().toString());
        return doctorRepo.save(doctor);
    }

    public List<Doctor> findAllDoctors() {
        return doctorRepo.findAll();
    }

    public Doctor updateDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    public Doctor findDoctorById(Long id) {
        return doctorRepo.findDoctorById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteDoctor(Long id ){
        doctorRepo.deleteDoctorById(id );
    }
}

