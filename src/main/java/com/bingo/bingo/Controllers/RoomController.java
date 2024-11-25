package com.bingo.bingo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.bingo.Models.RoomModel;
import com.bingo.bingo.Services.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/all")
    public List<RoomModel> getAllRooms() {
        return roomService.getAllRooms();
    }

    @PostMapping("/insert")
    public RoomModel insertRoom(@RequestBody RoomModel room) {
        return roomService.insertRoom(room);
    }

    @PutMapping("/edit")
    public RoomModel updateRoom(@RequestBody RoomModel room) {
        return roomService.updateRoom(room);
    }

    @DeleteMapping("/delete/{idRoom}")
    public Optional<RoomModel> deleteRoom(@PathVariable int idRoom) {
        return roomService.deleteRoom(idRoom);
    }
}

