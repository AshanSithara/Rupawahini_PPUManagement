package lk.rupavahini.PPUManagement.asset.employee.dao;


import lk.rupavahini.PPUManagement.asset.employee.entity.Employee;
import lk.rupavahini.PPUManagement.asset.employee.entity.EmployeeFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;


@Repository
public interface EmployeeFilesDao extends JpaRepository<EmployeeFiles, Integer > {
    List< EmployeeFiles > findByEmployeeOrderByIdDesc(Employee employee);

    EmployeeFiles findByName(String filename);

    EmployeeFiles findByNewName(String filename);

    EmployeeFiles findByNewId(String filename);
}
