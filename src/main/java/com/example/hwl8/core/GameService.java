package com.example.hwl8.core;

import com.example.hwl8.core.domain.MatrixCoordinate;
import com.example.hwl8.enums.DotType;

public interface GameService {

    MatrixCoordinate aiTurn();

    void humanTurn(int rowIndex, int columnIndex);

    boolean checkWin(DotType dotType);

    boolean isMapFull();

}
