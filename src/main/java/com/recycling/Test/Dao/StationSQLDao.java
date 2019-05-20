package com.recycling.Test.Dao;

import com.recycling.DB.repository.StationRepository;
import com.recycling.recycling.production.Position;
import com.recycling.recycling.production.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class StationSQLDao {
    //TODO: sortera stationer? Utifrån

    @Autowired
    private StationRepository stationRepository;

    public Collection<Station> getAllStations() {
        return stationRepository.findAll();
    }

    public Station getStationById(int id) {
        return null;
    }

    public void removeStationById(int id) {

    }

    public void updateStation(Station updatedStation) {
        for (Station s : stationRepository.findAll()) {
            if (s.getStationName() == updatedStation.getStationName()) {
                s.setAvailableMaterials(updatedStation.getAvailableMaterials());
                s.setPos(updatedStation.getPos());
                return;
            }
        }
        stationRepository.save(updatedStation);
    }
    public Station getStationFromPosition(Position p){
        for(Station s : stationRepository.findAll()){
            if(s.getPos().equals(p))
                return s;
        }
        return null;
    }

    public void addStation(Station newStation) {
        stationRepository.save(newStation);
    }
}
