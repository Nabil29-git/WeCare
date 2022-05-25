package tech.getaeeays.WeCare.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getaeeays.WeCare.model.Doctor;
import tech.getaeeays.WeCare.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorResource {
    private final DoctorService doctorService;

    public DoctorResource(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        List<Doctor> doctors = doctorService.findAllDoctors();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Doctor> getDoctorById (@PathVariable("id") Long id ) {
        Doctor doctor = doctorService.findDoctorById(id );
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        Doctor newDoctor = doctorService.addDoctor(doctor);
        return new ResponseEntity<>(newDoctor, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Doctor> updateDoctor(@RequestBody Doctor doctor) {
        Doctor updateDoctor = doctorService.updateDoctor(doctor);
        return new ResponseEntity<>(updateDoctor, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id ) {
        doctorService.deleteDoctor(id );
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
