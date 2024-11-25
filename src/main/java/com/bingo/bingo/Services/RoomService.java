package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.RoomModel;
import com.bingo.bingo.Repositories.RoomRepository;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<RoomModel> getAllRooms() {
        return roomRepository.findAll();
    }

    public RoomModel insertRoom(RoomModel room) {
        return roomRepository.save(room);
    }

    public RoomModel updateRoom(RoomModel room) {
        return roomRepository.save(room);
    }

    public Optional<RoomModel> deleteRoom(int idRoom) {
        Optional<RoomModel> room = roomRepository.findById(idRoom);
        try {
            roomRepository.deleteById(idRoom);
        } catch (Exception e) {
            return null;
        }
        return room;
    }
}
