package com.letsdobro.controller.dto;

import com.letsdobro.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
