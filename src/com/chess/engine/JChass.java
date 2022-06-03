package com.chess.engine;

import com.chess.engine.board.Board;

import javax.sound.midi.Soundbank;

public class JChass {

    public static void main(String[] args) {


        Board board = Board.createStandardBoard();

        System.out.println(board);
    }

}
