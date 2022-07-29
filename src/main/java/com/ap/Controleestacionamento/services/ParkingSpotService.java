package com.ap.Controleestacionamento.services;

import com.ap.Controleestacionamento.models.ParkingSpotModel;
import com.ap.Controleestacionamento.repositories.ParkingSportRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {
     final ParkingSportRepository parkingSportRepository;

    public ParkingSpotService(ParkingSportRepository parkingSportRepository) {
        this.parkingSportRepository = parkingSportRepository;
    }
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSportRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSportRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSportRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSportRepository.existsByApartmentAndBlock(apartment,block);
    }
    public Page<ParkingSpotModel> findAll(org.springframework.data.domain.Pageable pageable) {
        return parkingSportRepository.findAll(pageable);
    }
    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSportRepository.findById(id);
    }
    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSportRepository.delete(parkingSpotModel);
    }


}
